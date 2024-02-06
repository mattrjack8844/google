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
// source: google/cloud/dataproc/v1/batches.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface BatchOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.Batch)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the batch.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the batch.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A batch UUID (Unique Universal Identifier). The service
   * generates this value when it creates the batch.
   * </pre>
   *
   * <code>string uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   *
   *
   * <pre>
   * Output only. A batch UUID (Unique Universal Identifier). The service
   * generates this value when it creates the batch.
   * </pre>
   *
   * <code>string uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the batch was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the batch was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the batch was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. PySpark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkBatch pyspark_batch = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pysparkBatch field is set.
   */
  boolean hasPysparkBatch();
  /**
   *
   *
   * <pre>
   * Optional. PySpark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkBatch pyspark_batch = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pysparkBatch.
   */
  com.google.cloud.dataproc.v1.PySparkBatch getPysparkBatch();
  /**
   *
   *
   * <pre>
   * Optional. PySpark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkBatch pyspark_batch = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.PySparkBatchOrBuilder getPysparkBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Spark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkBatch spark_batch = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkBatch field is set.
   */
  boolean hasSparkBatch();
  /**
   *
   *
   * <pre>
   * Optional. Spark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkBatch spark_batch = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkBatch.
   */
  com.google.cloud.dataproc.v1.SparkBatch getSparkBatch();
  /**
   *
   *
   * <pre>
   * Optional. Spark batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkBatch spark_batch = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkBatchOrBuilder getSparkBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. SparkR batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRBatch spark_r_batch = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkRBatch field is set.
   */
  boolean hasSparkRBatch();
  /**
   *
   *
   * <pre>
   * Optional. SparkR batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRBatch spark_r_batch = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkRBatch.
   */
  com.google.cloud.dataproc.v1.SparkRBatch getSparkRBatch();
  /**
   *
   *
   * <pre>
   * Optional. SparkR batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRBatch spark_r_batch = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkRBatchOrBuilder getSparkRBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. SparkSql batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlBatch spark_sql_batch = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkSqlBatch field is set.
   */
  boolean hasSparkSqlBatch();
  /**
   *
   *
   * <pre>
   * Optional. SparkSql batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlBatch spark_sql_batch = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkSqlBatch.
   */
  com.google.cloud.dataproc.v1.SparkSqlBatch getSparkSqlBatch();
  /**
   *
   *
   * <pre>
   * Optional. SparkSql batch config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlBatch spark_sql_batch = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkSqlBatchOrBuilder getSparkSqlBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Runtime information about batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the runtimeInfo field is set.
   */
  boolean hasRuntimeInfo();
  /**
   *
   *
   * <pre>
   * Output only. Runtime information about batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The runtimeInfo.
   */
  com.google.cloud.dataproc.v1.RuntimeInfo getRuntimeInfo();
  /**
   *
   *
   * <pre>
   * Output only. Runtime information about batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.RuntimeInfoOrBuilder getRuntimeInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the batch.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.Batch.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the batch.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.Batch.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1.Batch.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Batch state details, such as a failure
   * description if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   *
   *
   * <pre>
   * Output only. Batch state details, such as a failure
   * description if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the batch entered a current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the batch entered a current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the batch entered a current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The email address of the user who created the batch.
   * </pre>
   *
   * <code>string creator = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   *
   *
   * <pre>
   * Output only. The email address of the user who created the batch.
   * </pre>
   *
   * <code>string creator = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString getCreatorBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this batch.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a batch.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this batch.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a batch.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this batch.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a batch.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this batch.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a batch.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this batch.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a batch.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the runtimeConfig field is set.
   */
  boolean hasRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The runtimeConfig.
   */
  com.google.cloud.dataproc.v1.RuntimeConfig getRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.RuntimeConfigOrBuilder getRuntimeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the environmentConfig field is set.
   */
  boolean hasEnvironmentConfig();
  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The environmentConfig.
   */
  com.google.cloud.dataproc.v1.EnvironmentConfig getEnvironmentConfig();
  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the batch execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.EnvironmentConfigOrBuilder getEnvironmentConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the operation associated with this batch.
   * </pre>
   *
   * <code>string operation = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the operation associated with this batch.
   * </pre>
   *
   * <code>string operation = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString getOperationBytes();

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Batch.StateHistory state_history = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.Batch.StateHistory> getStateHistoryList();
  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Batch.StateHistory state_history = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.Batch.StateHistory getStateHistory(int index);
  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Batch.StateHistory state_history = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateHistoryCount();
  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Batch.StateHistory state_history = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.Batch.StateHistoryOrBuilder>
      getStateHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Batch.StateHistory state_history = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.Batch.StateHistoryOrBuilder getStateHistoryOrBuilder(int index);

  com.google.cloud.dataproc.v1.Batch.BatchConfigCase getBatchConfigCase();
}
