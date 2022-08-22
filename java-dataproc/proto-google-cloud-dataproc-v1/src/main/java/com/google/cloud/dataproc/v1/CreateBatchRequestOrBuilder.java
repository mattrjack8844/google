/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dataproc/v1/batches.proto

package com.google.cloud.dataproc.v1;

public interface CreateBatchRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.CreateBatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this batch will be created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this batch will be created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The batch to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Batch batch = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the batch field is set.
   */
  boolean hasBatch();
  /**
   *
   *
   * <pre>
   * Required. The batch to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Batch batch = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The batch.
   */
  com.google.cloud.dataproc.v1.Batch getBatch();
  /**
   *
   *
   * <pre>
   * Required. The batch to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Batch batch = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.BatchOrBuilder getBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the batch, which will become the final component of
   * the batch's resource name.
   * This value must be 4-63 characters. Valid characters are `/[a-z][0-9]-/`.
   * </pre>
   *
   * <code>string batch_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The batchId.
   */
  java.lang.String getBatchId();
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the batch, which will become the final component of
   * the batch's resource name.
   * This value must be 4-63 characters. Valid characters are `/[a-z][0-9]-/`.
   * </pre>
   *
   * <code>string batch_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for batchId.
   */
  com.google.protobuf.ByteString getBatchIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the service
   * receives two
   * [CreateBatchRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s
   * with the same request_id, the second request is ignored and the
   * Operation that corresponds to the first Batch created and stored
   * in the backend is returned.
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The value must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the service
   * receives two
   * [CreateBatchRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s
   * with the same request_id, the second request is ignored and the
   * Operation that corresponds to the first Batch created and stored
   * in the backend is returned.
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The value must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
