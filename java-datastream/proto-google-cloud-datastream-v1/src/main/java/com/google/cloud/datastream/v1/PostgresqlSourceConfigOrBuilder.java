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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

public interface PostgresqlSourceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.PostgresqlSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * PostgreSQL objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms include_objects = 1;</code>
   *
   * @return Whether the includeObjects field is set.
   */
  boolean hasIncludeObjects();
  /**
   *
   *
   * <pre>
   * PostgreSQL objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms include_objects = 1;</code>
   *
   * @return The includeObjects.
   */
  com.google.cloud.datastream.v1.PostgresqlRdbms getIncludeObjects();
  /**
   *
   *
   * <pre>
   * PostgreSQL objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms include_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlRdbmsOrBuilder getIncludeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * PostgreSQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms exclude_objects = 2;</code>
   *
   * @return Whether the excludeObjects field is set.
   */
  boolean hasExcludeObjects();
  /**
   *
   *
   * <pre>
   * PostgreSQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms exclude_objects = 2;</code>
   *
   * @return The excludeObjects.
   */
  com.google.cloud.datastream.v1.PostgresqlRdbms getExcludeObjects();
  /**
   *
   *
   * <pre>
   * PostgreSQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms exclude_objects = 2;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlRdbmsOrBuilder getExcludeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the logical replication slot that's
   * configured with the pgoutput plugin.
   * </pre>
   *
   * <code>
   * string replication_slot = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The replicationSlot.
   */
  java.lang.String getReplicationSlot();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the logical replication slot that's
   * configured with the pgoutput plugin.
   * </pre>
   *
   * <code>
   * string replication_slot = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for replicationSlot.
   */
  com.google.protobuf.ByteString getReplicationSlotBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the publication that includes the set of all tables
   * that are defined in the stream's include_objects.
   * </pre>
   *
   * <code>string publication = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The publication.
   */
  java.lang.String getPublication();
  /**
   *
   *
   * <pre>
   * Required. The name of the publication that includes the set of all tables
   * that are defined in the stream's include_objects.
   * </pre>
   *
   * <code>string publication = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for publication.
   */
  com.google.protobuf.ByteString getPublicationBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of concurrent backfill tasks. The number should be non
   * negative. If not set (or set to 0), the system's default value will be
   * used.
   * </pre>
   *
   * <code>int32 max_concurrent_backfill_tasks = 5;</code>
   *
   * @return The maxConcurrentBackfillTasks.
   */
  int getMaxConcurrentBackfillTasks();
}
