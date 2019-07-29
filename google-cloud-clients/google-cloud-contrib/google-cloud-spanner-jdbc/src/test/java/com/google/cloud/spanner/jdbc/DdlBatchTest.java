/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.jdbc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentMatcher;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.spanner.ErrorCode;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.SpannerException;
import com.google.cloud.spanner.SpannerExceptionFactory;
import com.google.cloud.spanner.Statement;
import com.google.cloud.spanner.jdbc.DdlBatch;
import com.google.cloud.spanner.jdbc.DdlClient;
import com.google.cloud.spanner.jdbc.StatementParser.ParsedStatement;
import com.google.cloud.spanner.jdbc.StatementParser.StatementType;
import com.google.cloud.spanner.jdbc.UnitOfWork.UnitOfWorkState;
import com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata;

@RunWith(JUnit4.class)
public class DdlBatchTest {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  private DdlClient createDefaultMockDdlClient() {
    return createDefaultMockDdlClient(false, 0L);
  }

  private DdlClient createDefaultMockDdlClient(boolean exceptionOnGetResult) {
    return createDefaultMockDdlClient(exceptionOnGetResult, 0L);
  }

  private DdlClient createDefaultMockDdlClient(long waitForMillis) {
    return createDefaultMockDdlClient(false, waitForMillis);
  }

  private DdlClient createDefaultMockDdlClient(boolean exceptionOnGetResult,
      final long waitForMillis) {
    try {
      DdlClient ddlClient = mock(DdlClient.class);
      @SuppressWarnings("unchecked")
      final OperationFuture<Void, UpdateDatabaseDdlMetadata> operation =
          mock(OperationFuture.class);
      if (waitForMillis > 0L) {
        when(operation.get()).thenAnswer(new Answer<Void>() {
          @Override
          public Void answer(InvocationOnMock invocation) throws Throwable {
            Thread.sleep(waitForMillis);
            return null;
          }
        });
      } else if (exceptionOnGetResult) {
        when(operation.get()).thenThrow(
            SpannerExceptionFactory.newSpannerException(ErrorCode.UNKNOWN, "ddl statement failed"));
      } else {
        when(operation.get()).thenReturn(null);
      }
      when(ddlClient.executeDdl(anyString())).thenReturn(operation);
      when(ddlClient.executeDdl(anyListOf(String.class))).thenReturn(operation);
      return ddlClient;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private DdlBatch createSubject() {
    return createSubject(createDefaultMockDdlClient());
  }

  private DdlBatch createSubject(DdlClient ddlClient) {
    return DdlBatch.newBuilder().setDdlClient(ddlClient)
        .withStatementExecutor(new StatementExecutor()).build();
  }

  @Test
  public void testExecuteQuery() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.executeQuery(mock(ParsedStatement.class), AnalyzeMode.NONE);
  }

  @Test
  public void testExecuteUpdate() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.executeUpdate(mock(ParsedStatement.class));
  }

  @Test
  public void testGetCommitTimestamp() {
    DdlBatch batch = createSubject();
    batch.runBatch();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.getCommitTimestamp();
  }

  @Test
  public void testGetReadTimestamp() {
    DdlBatch batch = createSubject();
    batch.runBatch();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.getReadTimestamp();
  }

  @Test
  public void testWrite() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.write(Mutation.newInsertBuilder("foo").build());
  }

  @Test
  public void testWriteIterable() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.write(Arrays.asList(Mutation.newInsertBuilder("foo").build()));
  }

  @Test
  public void testIsReadOnly() {
    DdlBatch batch = createSubject();
    assertThat(batch.isReadOnly(), is(false));
  }

  @Test
  public void testGetStateAndIsActive() {
    DdlBatch batch = createSubject();
    assertThat(batch.getState(), is(UnitOfWorkState.STARTED));
    assertThat(batch.isActive(), is(true));
    batch.runBatch();
    assertThat(batch.getState(), is(UnitOfWorkState.RAN));
    assertThat(batch.isActive(), is(false));

    batch = createSubject();
    assertThat(batch.getState(), is(UnitOfWorkState.STARTED));
    assertThat(batch.isActive(), is(true));
    batch.abortBatch();
    assertThat(batch.getState(), is(UnitOfWorkState.ABORTED));
    assertThat(batch.isActive(), is(false));

    DdlClient client = mock(DdlClient.class);
    doThrow(SpannerException.class).when(client).executeDdl(anyListOf(String.class));
    batch = createSubject(client);
    assertThat(batch.getState(), is(UnitOfWorkState.STARTED));
    assertThat(batch.isActive(), is(true));
    ParsedStatement statement = mock(ParsedStatement.class);
    when(statement.getStatement()).thenReturn(Statement.of("CREATE TABLE FOO"));
    when(statement.getSqlWithoutComments()).thenReturn("CREATE TABLE FOO");
    when(statement.getType()).thenReturn(StatementType.DDL);
    batch.executeDdl(statement);
    boolean exception = false;
    try {
      batch.runBatch();
    } catch (SpannerException e) {
      exception = true;
    }
    assertThat(exception, is(true));
    assertThat(batch.getState(), is(UnitOfWorkState.RUN_FAILED));
    assertThat(batch.isActive(), is(false));
  }

  private static IsListOfStringsWithSize isEmptyListOfStrings() {
    return new IsListOfStringsWithSize(0);
  }

  private static IsListOfStringsWithSize isListOfStringsWithSize(int size) {
    return new IsListOfStringsWithSize(size);
  }

  private static class IsListOfStringsWithSize extends ArgumentMatcher<List<String>> {
    private final int size;

    private IsListOfStringsWithSize(int size) {
      this.size = size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean matches(Object list) {
      return ((List<String>) list).size() == size;
    }
  }

  @Test
  public void testRunBatch() {
    DdlClient client = createDefaultMockDdlClient();
    DdlBatch batch = createSubject(client);
    batch.runBatch();
    assertThat(batch.getState(), is(UnitOfWorkState.RAN));
    verify(client, never()).executeDdl(anyString());
    verify(client, never()).executeDdl(argThat(isEmptyListOfStrings()));

    ParsedStatement statement = mock(ParsedStatement.class);
    when(statement.getType()).thenReturn(StatementType.DDL);
    when(statement.getStatement()).thenReturn(Statement.of("CREATE TABLE FOO"));
    when(statement.getSqlWithoutComments()).thenReturn("CREATE TABLE FOO");

    client = createDefaultMockDdlClient();
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.runBatch();
    verify(client).executeDdl(argThat(isListOfStringsWithSize(1)));

    client = createDefaultMockDdlClient();
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.executeDdl(statement);
    batch.runBatch();
    verify(client).executeDdl(argThat(isListOfStringsWithSize(2)));
    assertThat(batch.getState(), is(UnitOfWorkState.RAN));
    boolean exception = false;
    try {
      batch.runBatch();
    } catch (SpannerException e) {
      if (e.getErrorCode() != ErrorCode.FAILED_PRECONDITION) {
        throw e;
      }
      exception = true;
    }
    assertThat(exception, is(true));
    assertThat(batch.getState(), is(UnitOfWorkState.RAN));
    exception = false;
    try {
      batch.executeDdl(statement);
    } catch (SpannerException e) {
      if (e.getErrorCode() != ErrorCode.FAILED_PRECONDITION) {
        throw e;
      }
      exception = true;
    }
    assertThat(exception, is(true));
    exception = false;
    try {
      batch.executeDdl(statement);
    } catch (SpannerException e) {
      if (e.getErrorCode() != ErrorCode.FAILED_PRECONDITION) {
        throw e;
      }
      exception = true;
    }
    assertThat(exception, is(true));

    client = createDefaultMockDdlClient(true);
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.executeDdl(statement);
    exception = false;
    try {
      batch.runBatch();
    } catch (SpannerException e) {
      exception = true;
    }
    assertThat(exception, is(true));
    assertThat(batch.getState(), is(UnitOfWorkState.RUN_FAILED));
    verify(client).executeDdl(argThat(isListOfStringsWithSize(2)));
  }

  @Test
  public void testAbort() {
    DdlClient client = createDefaultMockDdlClient();
    DdlBatch batch = createSubject(client);
    batch.abortBatch();
    assertThat(batch.getState(), is(UnitOfWorkState.ABORTED));
    verify(client, never()).executeDdl(anyString());
    verify(client, never()).executeDdl(anyListOf(String.class));

    ParsedStatement statement = mock(ParsedStatement.class);
    when(statement.getType()).thenReturn(StatementType.DDL);
    when(statement.getStatement()).thenReturn(Statement.of("CREATE TABLE FOO"));
    when(statement.getSqlWithoutComments()).thenReturn("CREATE TABLE FOO");

    client = createDefaultMockDdlClient();
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.abortBatch();
    verify(client, never()).executeDdl(anyListOf(String.class));

    client = createDefaultMockDdlClient();
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.executeDdl(statement);
    batch.abortBatch();
    verify(client, never()).executeDdl(anyListOf(String.class));

    client = createDefaultMockDdlClient();
    batch = createSubject(client);
    batch.executeDdl(statement);
    batch.executeDdl(statement);
    batch.abortBatch();
    verify(client, never()).executeDdl(anyListOf(String.class));
    boolean exception = false;
    try {
      batch.runBatch();
    } catch (SpannerException e) {
      if (e.getErrorCode() != ErrorCode.FAILED_PRECONDITION) {
        throw e;
      }
      exception = true;
    }
    assertThat(exception, is(true));
    verify(client, never()).executeDdl(anyListOf(String.class));
  }

  @Test
  public void testCancel() {
    ParsedStatement statement = mock(ParsedStatement.class);
    when(statement.getType()).thenReturn(StatementType.DDL);
    when(statement.getStatement()).thenReturn(Statement.of("CREATE TABLE FOO"));
    when(statement.getSqlWithoutComments()).thenReturn("CREATE TABLE FOO");

    DdlClient client = createDefaultMockDdlClient(10000L);
    final DdlBatch batch = createSubject(client);
    batch.executeDdl(statement);
    Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() {
      @Override
      public void run() {
        batch.cancel();
      }
    }, 100, TimeUnit.MILLISECONDS);
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.CANCELLED));
    batch.runBatch();
  }

  @Test
  public void testCommit() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.commit();
  }

  @Test
  public void testRollback() {
    DdlBatch batch = createSubject();
    exception.expect(SpannerExceptionMatcher.matchCode(ErrorCode.FAILED_PRECONDITION));
    batch.rollback();
  }
}
