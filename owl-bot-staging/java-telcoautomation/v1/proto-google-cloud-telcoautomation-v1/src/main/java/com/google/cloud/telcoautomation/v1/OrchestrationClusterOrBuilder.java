// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

public interface OrchestrationClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.OrchestrationCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the orchestration cluster. The name of orchestration cluster cannot
   * be more than 24 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the orchestration cluster. The name of orchestration cluster cannot
   * be more than 24 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Management configuration of the underlying GKE cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.ManagementConfig management_config = 5;</code>
   * @return Whether the managementConfig field is set.
   */
  boolean hasManagementConfig();
  /**
   * <pre>
   * Management configuration of the underlying GKE cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.ManagementConfig management_config = 5;</code>
   * @return The managementConfig.
   */
  com.google.cloud.telcoautomation.v1.ManagementConfig getManagementConfig();
  /**
   * <pre>
   * Management configuration of the underlying GKE cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.ManagementConfig management_config = 5;</code>
   */
  com.google.cloud.telcoautomation.v1.ManagementConfigOrBuilder getManagementConfigOrBuilder();

  /**
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Provides the TNA version installed on the cluster.
   * </pre>
   *
   * <code>string tna_version = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The tnaVersion.
   */
  java.lang.String getTnaVersion();
  /**
   * <pre>
   * Output only. Provides the TNA version installed on the cluster.
   * </pre>
   *
   * <code>string tna_version = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for tnaVersion.
   */
  com.google.protobuf.ByteString
      getTnaVersionBytes();

  /**
   * <pre>
   * Output only. State of the Orchestration Cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.OrchestrationCluster.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the Orchestration Cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.OrchestrationCluster.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.telcoautomation.v1.OrchestrationCluster.State getState();
}
