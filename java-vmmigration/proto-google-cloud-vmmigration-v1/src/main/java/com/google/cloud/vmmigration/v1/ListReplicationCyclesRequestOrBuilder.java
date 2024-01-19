/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ListReplicationCyclesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ListReplicationCyclesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of ReplicationCycles.
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
   * Required. The parent, which owns this collection of ReplicationCycles.
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
   * Optional. The maximum number of replication cycles to return. The service
   * may return fewer than this value. If unspecified, at most 100 migrating VMs
   * will be returned. The maximum value is 100; values above 100 will be
   * coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Required. A page token, received from a previous `ListReplicationCycles`
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListReplicationCycles`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Required. A page token, received from a previous `ListReplicationCycles`
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListReplicationCycles`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The filter request.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. The filter request.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. the order by fields for the result.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. the order by fields for the result.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
