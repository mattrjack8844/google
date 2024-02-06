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
// source: google/cloud/metastore/v1beta/metastore_federation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

public interface DeleteFederationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.DeleteFederationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore federation to delete,
   * in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore federation to delete,
   * in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
