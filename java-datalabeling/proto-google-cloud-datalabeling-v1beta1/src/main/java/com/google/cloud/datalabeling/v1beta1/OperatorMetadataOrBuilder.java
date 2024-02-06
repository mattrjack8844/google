/*
 * Copyright 2024 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface OperatorMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.OperatorMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Confidence score corresponding to a label. For examle, if 3 contributors
   * have answered the question and 2 of them agree on the final label, the
   * confidence score will be 0.67 (2/3).
   * </pre>
   *
   * <code>float score = 1;</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * The total number of contributors that answer this question.
   * </pre>
   *
   * <code>int32 total_votes = 2;</code>
   *
   * @return The totalVotes.
   */
  int getTotalVotes();

  /**
   *
   *
   * <pre>
   * The total number of contributors that choose this label.
   * </pre>
   *
   * <code>int32 label_votes = 3;</code>
   *
   * @return The labelVotes.
   */
  int getLabelVotes();

  /**
   *
   *
   * <pre>
   * Comments from contributors.
   * </pre>
   *
   * <code>repeated string comments = 4;</code>
   *
   * @return A list containing the comments.
   */
  java.util.List<java.lang.String> getCommentsList();
  /**
   *
   *
   * <pre>
   * Comments from contributors.
   * </pre>
   *
   * <code>repeated string comments = 4;</code>
   *
   * @return The count of comments.
   */
  int getCommentsCount();
  /**
   *
   *
   * <pre>
   * Comments from contributors.
   * </pre>
   *
   * <code>repeated string comments = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The comments at the given index.
   */
  java.lang.String getComments(int index);
  /**
   *
   *
   * <pre>
   * Comments from contributors.
   * </pre>
   *
   * <code>repeated string comments = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the comments at the given index.
   */
  com.google.protobuf.ByteString getCommentsBytes(int index);
}
