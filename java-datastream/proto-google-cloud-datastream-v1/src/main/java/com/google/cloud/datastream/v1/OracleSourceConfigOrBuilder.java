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

public interface OracleSourceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.OracleSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   *
   * @return Whether the includeObjects field is set.
   */
  boolean hasIncludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   *
   * @return The includeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getIncludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getIncludeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   *
   * @return Whether the excludeObjects field is set.
   */
  boolean hasExcludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   *
   * @return The excludeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getExcludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getExcludeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of concurrent CDC tasks. The number should be non-negative.
   * If not set (or set to 0), the system's default value is used.
   * </pre>
   *
   * <code>int32 max_concurrent_cdc_tasks = 3;</code>
   *
   * @return The maxConcurrentCdcTasks.
   */
  int getMaxConcurrentCdcTasks();

  /**
   *
   *
   * <pre>
   * Maximum number of concurrent backfill tasks. The number should be
   * non-negative. If not set (or set to 0), the system's default value is used.
   * </pre>
   *
   * <code>int32 max_concurrent_backfill_tasks = 4;</code>
   *
   * @return The maxConcurrentBackfillTasks.
   */
  int getMaxConcurrentBackfillTasks();

  /**
   *
   *
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;
   * </code>
   *
   * @return Whether the dropLargeObjects field is set.
   */
  boolean hasDropLargeObjects();
  /**
   *
   *
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;
   * </code>
   *
   * @return The dropLargeObjects.
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects getDropLargeObjects();
  /**
   *
   *
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;
   * </code>
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjectsOrBuilder
      getDropLargeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * Stream large object values. NOTE: This feature is currently experimental.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;
   * </code>
   *
   * @return Whether the streamLargeObjects field is set.
   */
  boolean hasStreamLargeObjects();
  /**
   *
   *
   * <pre>
   * Stream large object values. NOTE: This feature is currently experimental.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;
   * </code>
   *
   * @return The streamLargeObjects.
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects getStreamLargeObjects();
  /**
   *
   *
   * <pre>
   * Stream large object values. NOTE: This feature is currently experimental.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;
   * </code>
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjectsOrBuilder
      getStreamLargeObjectsOrBuilder();

  com.google.cloud.datastream.v1.OracleSourceConfig.LargeObjectsHandlingCase
      getLargeObjectsHandlingCase();
}
