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
// source: google/cloud/run/v2/job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fully qualified name of this Job.
   *
   * Format:
   * projects/{project}/locations/{location}/jobs/{job}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The fully qualified name of this Job.
   *
   * Format:
   * projects/{project}/locations/{location}/jobs/{job}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the Execution. The value
   * is a UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the Execution. The value
   * is a UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. A number that monotonically increases every time the user
   * modifies the desired state.
   * </pre>
   *
   * <code>int64 generation = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * Unstructured key value map that can be used to organize and categorize
   * objects.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 Job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that can be used to organize and categorize
   * objects.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 Job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that can be used to organize and categorize
   * objects.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 Job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that can be used to organize and categorize
   * objects.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 Job.
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
   *
   *
   * <pre>
   * Unstructured key value map that can be used to organize and categorize
   * objects.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 Job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected on new resources. All system
   * annotations in v1 now have a corresponding field in v2 Job.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected on new resources. All system
   * annotations in v1 now have a corresponding field in v2 Job.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected on new resources. All system
   * annotations in v1 now have a corresponding field in v2 Job.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected on new resources. All system
   * annotations in v1 now have a corresponding field in v2 Job.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
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
   * Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected on new resources. All system
   * annotations in v1 now have a corresponding field in v2 Job.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The deletion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The deletion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The deletion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Email address of the authenticated creator.
   * </pre>
   *
   * <code>string creator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   *
   *
   * <pre>
   * Output only. Email address of the authenticated creator.
   * </pre>
   *
   * <code>string creator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString getCreatorBytes();

  /**
   *
   *
   * <pre>
   * Output only. Email address of the last authenticated modifier.
   * </pre>
   *
   * <code>string last_modifier = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The lastModifier.
   */
  java.lang.String getLastModifier();
  /**
   *
   *
   * <pre>
   * Output only. Email address of the last authenticated modifier.
   * </pre>
   *
   * <code>string last_modifier = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for lastModifier.
   */
  com.google.protobuf.ByteString getLastModifierBytes();

  /**
   *
   *
   * <pre>
   * Arbitrary identifier for the API client.
   * </pre>
   *
   * <code>string client = 12;</code>
   *
   * @return The client.
   */
  java.lang.String getClient();
  /**
   *
   *
   * <pre>
   * Arbitrary identifier for the API client.
   * </pre>
   *
   * <code>string client = 12;</code>
   *
   * @return The bytes for client.
   */
  com.google.protobuf.ByteString getClientBytes();

  /**
   *
   *
   * <pre>
   * Arbitrary version identifier for the API client.
   * </pre>
   *
   * <code>string client_version = 13;</code>
   *
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   *
   *
   * <pre>
   * Arbitrary version identifier for the API client.
   * </pre>
   *
   * <code>string client_version = 13;</code>
   *
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString getClientVersionBytes();

  /**
   *
   *
   * <pre>
   * The launch stage as defined by [Google Cloud Platform
   * Launch Stages](https://cloud.google.com/terms/launch-stages).
   * Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA
   * is assumed.
   * Set the launch stage to a preview stage on input to allow use of preview
   * features in that stage. On read (or output), describes whether the resource
   * uses preview features.
   * &lt;p&gt;
   * For example, if ALPHA is provided as input, but only BETA and GA-level
   * features are used, this field will be BETA on output.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 14;</code>
   *
   * @return The enum numeric value on the wire for launchStage.
   */
  int getLaunchStageValue();
  /**
   *
   *
   * <pre>
   * The launch stage as defined by [Google Cloud Platform
   * Launch Stages](https://cloud.google.com/terms/launch-stages).
   * Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA
   * is assumed.
   * Set the launch stage to a preview stage on input to allow use of preview
   * features in that stage. On read (or output), describes whether the resource
   * uses preview features.
   * &lt;p&gt;
   * For example, if ALPHA is provided as input, but only BETA and GA-level
   * features are used, this field will be BETA on output.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 14;</code>
   *
   * @return The launchStage.
   */
  com.google.api.LaunchStage getLaunchStage();

  /**
   *
   *
   * <pre>
   * Settings for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.cloud.run.v2.BinaryAuthorization binary_authorization = 15;</code>
   *
   * @return Whether the binaryAuthorization field is set.
   */
  boolean hasBinaryAuthorization();
  /**
   *
   *
   * <pre>
   * Settings for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.cloud.run.v2.BinaryAuthorization binary_authorization = 15;</code>
   *
   * @return The binaryAuthorization.
   */
  com.google.cloud.run.v2.BinaryAuthorization getBinaryAuthorization();
  /**
   *
   *
   * <pre>
   * Settings for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.cloud.run.v2.BinaryAuthorization binary_authorization = 15;</code>
   */
  com.google.cloud.run.v2.BinaryAuthorizationOrBuilder getBinaryAuthorizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The template used to create executions for this Job.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionTemplate template = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   *
   *
   * <pre>
   * Required. The template used to create executions for this Job.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionTemplate template = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The template.
   */
  com.google.cloud.run.v2.ExecutionTemplate getTemplate();
  /**
   *
   *
   * <pre>
   * Required. The template used to create executions for this Job.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionTemplate template = 16 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.run.v2.ExecutionTemplateOrBuilder getTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The generation of this Job. See comments in `reconciling` for
   * additional information on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>int64 observed_generation = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The observedGeneration.
   */
  long getObservedGeneration();

  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Job, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.Condition terminal_condition = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the terminalCondition field is set.
   */
  boolean hasTerminalCondition();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Job, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.Condition terminal_condition = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The terminalCondition.
   */
  com.google.cloud.run.v2.Condition getTerminalCondition();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Job, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.Condition terminal_condition = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.ConditionOrBuilder getTerminalConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The Conditions of all other associated sub-resources. They
   * contain additional diagnostics information in case the Job does not reach
   * its desired state. See comments in `reconciling` for additional information
   * on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.run.v2.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Output only. The Conditions of all other associated sub-resources. They
   * contain additional diagnostics information in case the Job does not reach
   * its desired state. See comments in `reconciling` for additional information
   * on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The Conditions of all other associated sub-resources. They
   * contain additional diagnostics information in case the Job does not reach
   * its desired state. See comments in `reconciling` for additional information
   * on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The Conditions of all other associated sub-resources. They
   * contain additional diagnostics information in case the Job does not reach
   * its desired state. See comments in `reconciling` for additional information
   * on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ConditionOrBuilder> getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The Conditions of all other associated sub-resources. They
   * contain additional diagnostics information in case the Job does not reach
   * its desired state. See comments in `reconciling` for additional information
   * on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.ConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Number of executions created for this job.
   * </pre>
   *
   * <code>int32 execution_count = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The executionCount.
   */
  int getExecutionCount();

  /**
   *
   *
   * <pre>
   * Output only. Name of the last created execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionReference latest_created_execution = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the latestCreatedExecution field is set.
   */
  boolean hasLatestCreatedExecution();
  /**
   *
   *
   * <pre>
   * Output only. Name of the last created execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionReference latest_created_execution = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The latestCreatedExecution.
   */
  com.google.cloud.run.v2.ExecutionReference getLatestCreatedExecution();
  /**
   *
   *
   * <pre>
   * Output only. Name of the last created execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionReference latest_created_execution = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.ExecutionReferenceOrBuilder getLatestCreatedExecutionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Returns true if the Job is currently being acted upon by the
   * system to bring it into the desired state.
   *
   * When a new Job is created, or an existing one is updated, Cloud Run
   * will asynchronously perform all necessary steps to bring the Job to the
   * desired state. This process is called reconciliation.
   * While reconciliation is in process, `observed_generation` and
   * `latest_succeeded_execution`, will have transient values that might
   * mismatch the intended state: Once reconciliation is over (and this field is
   * false), there are two possible outcomes: reconciliation succeeded and the
   * state matches the Job, or there was an error,  and reconciliation failed.
   * This state can be found in `terminal_condition.state`.
   *
   * If reconciliation succeeded, the following fields will match:
   * `observed_generation` and `generation`, `latest_succeeded_execution` and
   * `latest_created_execution`.
   *
   * If reconciliation failed, `observed_generation` and
   * `latest_succeeded_execution` will have the state of the last succeeded
   * execution or empty for newly created Job. Additional information on the
   * failure can be found in `terminal_condition` and `conditions`.
   * </pre>
   *
   * <code>bool reconciling = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
