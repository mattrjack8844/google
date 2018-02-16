/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.data.v2.stub.read_rows;

import com.google.bigtable.v2.ReadRowsResponse.CellChunk;
import com.google.cloud.bigtable.data.v2.internal.ByteStringComparator;
import com.google.cloud.bigtable.data.v2.wrappers.RowAdapter.RowBuilder;
import com.google.common.base.Preconditions;
import com.google.protobuf.ByteString;
import java.util.List;

/**
 * A state machine to merge {@link CellChunk}s from a ReadRows response stream. Building of the
 * actual row object is delegated to a {@link RowBuilder}. This class is not thread safe.
 *
 * <p>The inputs are:
 *
 * <ul>
 *   <li>CellChunks that must be merged to form logical rows
 *   <li>Last scanned row notifications from the server to signal a more efficient resume point
 *   <li>Row consumption events that reset the state machine for the next row
 * </ul>
 *
 * <p>The outputs are:
 *
 * <ul>
 *   <li>Logical rows that were constructed using the {@link RowBuilder}
 *   <li>Special marker rows that represent resumption points that were sent by Last scanned row
 *       notifications.
 * </ul>
 *
 * <p>Expected Usage:
 *
 * <pre>{@code
 * StateMachine stateMachine = new StateMachine<>(myRowAdapter);
 * while(responseIterator.hasNext()) {
 *   ReadRowsResponse response = responseIterator.next();
 *   for(CellChunk chunk : response.getChunksList()) {
 *     boolean hasCompleteRow = stateMachine.handleChunk(chunk);
 *     if (hasCompleteRow) {
 *       MyRow row = stateMachine.consumeRow();
 *
 *       if (myRowAdapter.isScanMarkerRow(row) {
 *         // do something with marker
 *       } else {
 *         // do something with row
 *       }
 *     }
 *   }
 * }
 * }</pre>
 *
 * <p>Package-private for internal use.
 *
 * @param <RowT> The type of row the adapter will build
 */
final class StateMachine<RowT> {
  private final RowBuilder<RowT> adapter;
  private State state;
  private ByteString lastCompleteRowKey;

  // Track current cell attributes: protocol omits them when they are repeated
  private ByteString rowKey;
  private String familyName;
  private ByteString qualifier;
  private long timestamp;
  private List<String> labels;
  private long expectedCellSize;
  private long remainingCellBytes;

  private RowT completeRow;

  /**
   * Initialize a new state machine that's ready for a new row.
   *
   * @param adapter The adapter that will build the final row.
   */
  StateMachine(RowBuilder<RowT> adapter) {
    this.adapter = adapter;
    reset();
  }

  /**
   * Feeds the last scanned serverside key into the state machine. The adapter will wrap this key in
   * a special marker row that can be used downstream for efficient resume. It is the callers
   * responsibility to eventually filter out this row.
   */
  void handleLastScannedRow(ByteString key) {
    try {
      state = state.handleLastScannedRow(key);
    } catch (RuntimeException e) {
      state = null;
      throw e;
    }
  }

  /**
   * Feeds a new chunk into the sate machine. If the chunk is invalid, the state machine will throw
   * an exception and should be used for further input.
   *
   * @param chunk The new chunk to process.
   * @return True if this chunk completed a row.
   * @throws InvalidInputException When the chunk is not applicable to the current state.
   * @throws IllegalStateException When the internal state is inconsistent
   */
  boolean handleChunk(CellChunk chunk) {
    try {
      state = state.handleChunk(chunk);
      return state == CompleteRow;
    } catch (RuntimeException e) {
      state = null;
      throw e;
    }
  }

  /**
   * Returns the last completed row and transitions to awaiting a new row.
   *
   * @return The last completed row.
   * @throws IllegalStateException If the last chunk did not complete a row.
   */
  RowT consumeRow() {
    Preconditions.checkState(state == CompleteRow, "No row to consume");
    RowT row = completeRow;
    reset();
    return row;
  }

  /**
   * Checks if the state machine is in the middle of processing a row.
   *
   * @return True If there is a row in progress.
   */
  boolean isRowInProgress() {
    return state != NewRow;
  }

  private void reset() {
    state = NewRow;
    rowKey = null;
    familyName = null;
    qualifier = null;
    timestamp = 0;
    labels = null;
    expectedCellSize = 0;
    remainingCellBytes = 0;

    adapter.reset();
  }

  /** Base class for all of the state machine's internal states. */
  abstract static class State {
    /**
     * Accepts the last row key scanned by the server. And set its as the last complete row. This
     * row should be treated specially because it doesn't actually contain data.
     */
    State handleLastScannedRow(ByteString rowKey) {
      throw new IllegalStateException();
    }

    /**
     * Accepts a new chunk and transitions to the next state.
     *
     * @param chunk The new chunk to process.
     * @return The next state.
     * @throws IllegalStateException If the state can't handle any chunk.
     * @throws InvalidInputException If the state can't handle this chunk.
     */
    State handleChunk(CellChunk chunk) {
      throw new IllegalStateException();
    }
  }

  /**
   * The default state when the state machine is awaiting a chunk to start a new row. It will notify
   * the adapter of the new row and delegate to the NewCell to process the first Cell in the Chunk.
   * Exit states: same as NewCell
   */
  private final State NewRow =
      new State() {
        @Override
        State handleLastScannedRow(ByteString rowKey) {
          completeRow = adapter.createScanMarkerRow(rowKey);
          lastCompleteRowKey = rowKey;
          return CompleteRow;
        }

        @Override
        State handleChunk(CellChunk chunk) {
          validate(!chunk.getResetRow(), "NewRow can't reset");
          validate(!chunk.getRowKey().isEmpty(), "NewRow must have a rowKey");
          validate(chunk.hasFamilyName(), "NewRow must have a family");
          validate(chunk.hasQualifier(), "NewRow must have a qualifier");
          if (lastCompleteRowKey != null) {
            validate(
                ByteStringComparator.INSTANCE.compare(lastCompleteRowKey, chunk.getRowKey()) < 0,
                "NewRow key must be strictly increasing");
          }

          rowKey = chunk.getRowKey();
          adapter.startRow(rowKey);

          // auto transition
          return NewCell.handleChunk(chunk);
        }
      };

  /** A state that represents a cell boundary in a row. */
  private final State NewCell =
      new State() {
        /**
         * Processes the next chunk.
         *
         * @param chunk The new chunk to process.
         * @return NewCell if the chunk completed a Cell, CellInProgress if the chunk left a partial
         *     Cell.
         */
        @Override
        State handleChunk(CellChunk chunk) {
          // Handle row level logic
          if (chunk.getResetRow()) {
            return handleResetChunk(chunk);
          }

          if (!chunk.getRowKey().isEmpty()) {
            validate(rowKey.equals(chunk.getRowKey()), "Cell row keys must not change");
          }

          // Update cell identifier buffers
          if (chunk.hasFamilyName()) {
            familyName = chunk.getFamilyName().getValue();
            validate(chunk.hasQualifier(), "NewCell has a familyName, but no qualifier");
          }
          if (chunk.hasQualifier()) {
            qualifier = chunk.getQualifier().getValue();
          }
          timestamp = chunk.getTimestampMicros();
          labels = chunk.getLabelsList();

          // Update value expectations
          validate(chunk.getValueSize() >= 0, "NewRow valueSize can't be negative");

          boolean isSplit = chunk.getValueSize() > 0;
          if (isSplit) {
            validate(
                !chunk.getCommitRow(), "NewRow can't commit when valueSize indicates more data");
            validate(
                !chunk.getValue().isEmpty(),
                "NewRow must have data when valueSize promises more data in the next chunk");

            expectedCellSize = chunk.getValueSize();
            remainingCellBytes = expectedCellSize - chunk.getValue().size();
          } else {
            expectedCellSize = chunk.getValue().size();
            remainingCellBytes = 0;
          }

          // Start building cell
          adapter.startCell(familyName, qualifier, timestamp, labels, expectedCellSize);
          adapter.cellValue(chunk.getValue());

          // Transitions
          if (isSplit) {
            return CellInProgress;
          }
          adapter.finishCell();

          if (!chunk.getCommitRow()) {
            return NewCell;
          }

          return handleCommit();
        }
      };

  /** A state that represents a cell's value continuation. */
  private final State CellInProgress =
      new State() {
        @Override
        State handleChunk(CellChunk chunk) {
          if (chunk.getResetRow()) {
            return handleResetChunk(chunk);
          }

          boolean isLast = chunk.getValueSize() == 0;

          validate(!chunk.hasFamilyName(), "CellInProgress can't have a family");
          validate(!chunk.hasQualifier(), "CellInProgress can't have a qualifier");
          validate(chunk.getTimestampMicros() == 0, "CellInProgress can't have a timestamp");
          validate(chunk.getLabelsCount() == 0, "CellInProgress can't have labels");
          if (isLast) {
            long missingBytes = remainingCellBytes - chunk.getValue().size();
            validate(
                missingBytes == 0,
                "CellInProgress is last, but is missing " + missingBytes + " bytes");
          } else {
            validate(
                expectedCellSize == chunk.getValueSize(),
                "CellInProgress valueSizes should be identical for nonterminal chunks");
            validate(!chunk.getCommitRow(), "CellInProgress can't commit with a nonterminal chunk");
          }
          remainingCellBytes -= chunk.getValue().size();
          adapter.cellValue(chunk.getValue());

          // Transitions
          if (!isLast) {
            return CellInProgress;
          }
          adapter.finishCell();

          if (!chunk.getCommitRow()) {
            return NewCell;
          }

          return handleCommit();
        }
      };

  private static final State CompleteRow =
      new State() {
        @Override
        State handleChunk(CellChunk chunk) {
          throw new IllegalStateException("Skipping completed row");
        }
      };

  // Helpers ------------------------
  private State handleResetChunk(CellChunk cellChunk) {
    validate(cellChunk.getRowKey().isEmpty(), "Reset chunks can't have row keys");
    validate(!cellChunk.hasFamilyName(), "Reset chunks can't have families");
    validate(!cellChunk.hasQualifier(), "Reset chunks can't have qualifiers");
    validate(cellChunk.getTimestampMicros() == 0, "Reset chunks can't have timestamps");
    validate(cellChunk.getValueSize() == 0, "Reset chunks can't have value sizes");
    validate(cellChunk.getValue().isEmpty(), "Reset chunks can't have values");

    reset();
    return NewRow;
  }

  private State handleCommit() {
    validate(remainingCellBytes == 0, "Can't commit with remaining bytes");
    completeRow = adapter.finishRow();
    lastCompleteRowKey = rowKey;
    return CompleteRow;
  }

  private static void validate(boolean condition, String message) {
    if (!condition) {
      throw new InvalidInputException(message);
    }
  }

  static class InvalidInputException extends RuntimeException {
    InvalidInputException(String message) {
      super(message);
    }
  }
}
