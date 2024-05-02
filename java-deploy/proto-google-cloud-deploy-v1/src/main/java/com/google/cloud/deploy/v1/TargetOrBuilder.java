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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public interface TargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the `Target`. Format is
   * `projects/{project}/locations/{location}/targets/{target}`.
   * The `target` component must match `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Name of the `Target`. Format is
   * `projects/{project}/locations/{location}/targets/{target}`.
   * The `target` component must match `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Resource id of the `Target`.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   *
   *
   * <pre>
   * Output only. Resource id of the `Target`.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString getTargetIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `Target`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `Target`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description of the `Target`. Max length is 255 characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the `Target`. Max length is 255 characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Whether or not the `Target` requires approval.
   * </pre>
   *
   * <code>bool require_approval = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requireApproval.
   */
  boolean getRequireApproval();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Target` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Target` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Target` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `Target` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `Target` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `Target` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information specifying a GKE Cluster.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.GkeCluster gke = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gke field is set.
   */
  boolean hasGke();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a GKE Cluster.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.GkeCluster gke = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gke.
   */
  com.google.cloud.deploy.v1.GkeCluster getGke();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a GKE Cluster.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.GkeCluster gke = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.GkeClusterOrBuilder getGkeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information specifying an Anthos Cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AnthosCluster anthos_cluster = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the anthosCluster field is set.
   */
  boolean hasAnthosCluster();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying an Anthos Cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AnthosCluster anthos_cluster = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The anthosCluster.
   */
  com.google.cloud.deploy.v1.AnthosCluster getAnthosCluster();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying an Anthos Cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AnthosCluster anthos_cluster = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.AnthosClusterOrBuilder getAnthosClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Cloud Run deployment target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunLocation run = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the run field is set.
   */
  boolean hasRun();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Cloud Run deployment target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunLocation run = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The run.
   */
  com.google.cloud.deploy.v1.CloudRunLocation getRun();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Cloud Run deployment target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunLocation run = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.CloudRunLocationOrBuilder getRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information specifying a multiTarget.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.MultiTarget multi_target = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the multiTarget field is set.
   */
  boolean hasMultiTarget();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a multiTarget.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.MultiTarget multi_target = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The multiTarget.
   */
  com.google.cloud.deploy.v1.MultiTarget getMultiTarget();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a multiTarget.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.MultiTarget multi_target = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.MultiTargetOrBuilder getMultiTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Custom Target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomTarget custom_target = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the customTarget field is set.
   */
  boolean hasCustomTarget();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Custom Target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomTarget custom_target = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The customTarget.
   */
  com.google.cloud.deploy.v1.CustomTarget getCustomTarget();
  /**
   *
   *
   * <pre>
   * Optional. Information specifying a Custom Target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomTarget custom_target = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.CustomTargetOrBuilder getCustomTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Configurations for all execution that relates to this `Target`.
   * Each `ExecutionEnvironmentUsage` value may only be used in a single
   * configuration; using the same value multiple times is an error.
   * When one or more configurations are specified, they must include the
   * `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values.
   * When no configurations are specified, execution will use the default
   * specified in `DefaultPool`.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig execution_configs = 16;</code>
   */
  java.util.List<com.google.cloud.deploy.v1.ExecutionConfig> getExecutionConfigsList();
  /**
   *
   *
   * <pre>
   * Configurations for all execution that relates to this `Target`.
   * Each `ExecutionEnvironmentUsage` value may only be used in a single
   * configuration; using the same value multiple times is an error.
   * When one or more configurations are specified, they must include the
   * `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values.
   * When no configurations are specified, execution will use the default
   * specified in `DefaultPool`.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig execution_configs = 16;</code>
   */
  com.google.cloud.deploy.v1.ExecutionConfig getExecutionConfigs(int index);
  /**
   *
   *
   * <pre>
   * Configurations for all execution that relates to this `Target`.
   * Each `ExecutionEnvironmentUsage` value may only be used in a single
   * configuration; using the same value multiple times is an error.
   * When one or more configurations are specified, they must include the
   * `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values.
   * When no configurations are specified, execution will use the default
   * specified in `DefaultPool`.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig execution_configs = 16;</code>
   */
  int getExecutionConfigsCount();
  /**
   *
   *
   * <pre>
   * Configurations for all execution that relates to this `Target`.
   * Each `ExecutionEnvironmentUsage` value may only be used in a single
   * configuration; using the same value multiple times is an error.
   * When one or more configurations are specified, they must include the
   * `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values.
   * When no configurations are specified, execution will use the default
   * specified in `DefaultPool`.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig execution_configs = 16;</code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.ExecutionConfigOrBuilder>
      getExecutionConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Configurations for all execution that relates to this `Target`.
   * Each `ExecutionEnvironmentUsage` value may only be used in a single
   * configuration; using the same value multiple times is an error.
   * When one or more configurations are specified, they must include the
   * `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values.
   * When no configurations are specified, execution will use the default
   * specified in `DefaultPool`.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig execution_configs = 16;</code>
   */
  com.google.cloud.deploy.v1.ExecutionConfigOrBuilder getExecutionConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The deploy parameters to use for this target.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; deploy_parameters = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getDeployParametersCount();
  /**
   *
   *
   * <pre>
   * Optional. The deploy parameters to use for this target.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; deploy_parameters = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsDeployParameters(java.lang.String key);
  /** Use {@link #getDeployParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDeployParameters();
  /**
   *
   *
   * <pre>
   * Optional. The deploy parameters to use for this target.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; deploy_parameters = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDeployParametersMap();
  /**
   *
   *
   * <pre>
   * Optional. The deploy parameters to use for this target.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; deploy_parameters = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getDeployParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The deploy parameters to use for this target.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; deploy_parameters = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getDeployParametersOrThrow(java.lang.String key);

  com.google.cloud.deploy.v1.Target.DeploymentTargetCase getDeploymentTargetCase();
}
