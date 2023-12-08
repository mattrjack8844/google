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
// source: google/cloud/vertexai/v1beta1/endpoint.proto

package com.google.cloud.vertexai.v1beta1;

public interface EndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Endpoint.
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
   * Output only. The resource name of the Endpoint.
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
   * Required. The display name of the Endpoint.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the Endpoint.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the Endpoint.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the Endpoint.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The models deployed in this Endpoint.
   * To add or remove DeployedModels use
   * [EndpointService.DeployModel][google.cloud.vertexai.v1beta1.EndpointService.DeployModel]
   * and
   * [EndpointService.UndeployModel][google.cloud.vertexai.v1beta1.EndpointService.UndeployModel]
   * respectively.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.DeployedModel deployed_models = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.vertexai.v1beta1.DeployedModel> getDeployedModelsList();
  /**
   *
   *
   * <pre>
   * Output only. The models deployed in this Endpoint.
   * To add or remove DeployedModels use
   * [EndpointService.DeployModel][google.cloud.vertexai.v1beta1.EndpointService.DeployModel]
   * and
   * [EndpointService.UndeployModel][google.cloud.vertexai.v1beta1.EndpointService.UndeployModel]
   * respectively.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.DeployedModel deployed_models = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vertexai.v1beta1.DeployedModel getDeployedModels(int index);
  /**
   *
   *
   * <pre>
   * Output only. The models deployed in this Endpoint.
   * To add or remove DeployedModels use
   * [EndpointService.DeployModel][google.cloud.vertexai.v1beta1.EndpointService.DeployModel]
   * and
   * [EndpointService.UndeployModel][google.cloud.vertexai.v1beta1.EndpointService.UndeployModel]
   * respectively.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.DeployedModel deployed_models = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getDeployedModelsCount();
  /**
   *
   *
   * <pre>
   * Output only. The models deployed in this Endpoint.
   * To add or remove DeployedModels use
   * [EndpointService.DeployModel][google.cloud.vertexai.v1beta1.EndpointService.DeployModel]
   * and
   * [EndpointService.UndeployModel][google.cloud.vertexai.v1beta1.EndpointService.UndeployModel]
   * respectively.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.DeployedModel deployed_models = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vertexai.v1beta1.DeployedModelOrBuilder>
      getDeployedModelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The models deployed in this Endpoint.
   * To add or remove DeployedModels use
   * [EndpointService.DeployModel][google.cloud.vertexai.v1beta1.EndpointService.DeployModel]
   * and
   * [EndpointService.UndeployModel][google.cloud.vertexai.v1beta1.EndpointService.UndeployModel]
   * respectively.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.DeployedModel deployed_models = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vertexai.v1beta1.DeployedModelOrBuilder getDeployedModelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   *
   * If a DeployedModel's ID is not listed in this map, then it receives no
   * traffic.
   *
   * The traffic percentage values must add up to 100, or map must be empty if
   * the Endpoint is to not accept any traffic at a moment.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 5;</code>
   */
  int getTrafficSplitCount();
  /**
   *
   *
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   *
   * If a DeployedModel's ID is not listed in this map, then it receives no
   * traffic.
   *
   * The traffic percentage values must add up to 100, or map must be empty if
   * the Endpoint is to not accept any traffic at a moment.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 5;</code>
   */
  boolean containsTrafficSplit(java.lang.String key);
  /** Use {@link #getTrafficSplitMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getTrafficSplit();
  /**
   *
   *
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   *
   * If a DeployedModel's ID is not listed in this map, then it receives no
   * traffic.
   *
   * The traffic percentage values must add up to 100, or map must be empty if
   * the Endpoint is to not accept any traffic at a moment.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getTrafficSplitMap();
  /**
   *
   *
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   *
   * If a DeployedModel's ID is not listed in this map, then it receives no
   * traffic.
   *
   * The traffic percentage values must add up to 100, or map must be empty if
   * the Endpoint is to not accept any traffic at a moment.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 5;</code>
   */
  int getTrafficSplitOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   *
   * If a DeployedModel's ID is not listed in this map, then it receives no
   * traffic.
   *
   * The traffic percentage values must add up to 100, or map must be empty if
   * the Endpoint is to not accept any traffic at a moment.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 5;</code>
   */
  int getTrafficSplitOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Endpoints.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Endpoints.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Endpoints.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Endpoints.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
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
   * The labels with user-defined metadata to organize your Endpoints.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Endpoint was created.
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
   * Output only. Timestamp when this Endpoint was created.
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
   * Output only. Timestamp when this Endpoint was created.
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
   * Output only. Timestamp when this Endpoint was last updated.
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
   * Output only. Timestamp when this Endpoint was last updated.
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
   * Output only. Timestamp when this Endpoint was last updated.
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
   * Customer-managed encryption key spec for an Endpoint. If set, this
   * Endpoint and all sub-resources of this Endpoint will be secured by
   * this key.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.EncryptionSpec encryption_spec = 10;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for an Endpoint. If set, this
   * Endpoint and all sub-resources of this Endpoint will be secured by
   * this key.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.EncryptionSpec encryption_spec = 10;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.vertexai.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for an Endpoint. If set, this
   * Endpoint and all sub-resources of this Endpoint will be secured by
   * this key.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.EncryptionSpec encryption_spec = 10;</code>
   */
  com.google.cloud.vertexai.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * to which the Endpoint should be peered.
   *
   * Private services access must already be configured for the network. If left
   * unspecified, the Endpoint is not peered with any network.
   *
   * Only one of the fields,
   * [network][google.cloud.vertexai.v1beta1.Endpoint.network] or
   * [enable_private_service_connect][google.cloud.vertexai.v1beta1.Endpoint.enable_private_service_connect],
   * can be set.
   *
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where `{project}` is a project number, as in `12345`, and `{network}` is
   * network name.
   * </pre>
   *
   * <code>
   * string network = 13 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * to which the Endpoint should be peered.
   *
   * Private services access must already be configured for the network. If left
   * unspecified, the Endpoint is not peered with any network.
   *
   * Only one of the fields,
   * [network][google.cloud.vertexai.v1beta1.Endpoint.network] or
   * [enable_private_service_connect][google.cloud.vertexai.v1beta1.Endpoint.enable_private_service_connect],
   * can be set.
   *
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where `{project}` is a project number, as in `12345`, and `{network}` is
   * network name.
   * </pre>
   *
   * <code>
   * string network = 13 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Deprecated: If true, expose the Endpoint via private service connect.
   *
   * Only one of the fields,
   * [network][google.cloud.vertexai.v1beta1.Endpoint.network] or
   * [enable_private_service_connect][google.cloud.vertexai.v1beta1.Endpoint.enable_private_service_connect],
   * can be set.
   * </pre>
   *
   * <code>bool enable_private_service_connect = 17 [deprecated = true];</code>
   *
   * @deprecated google.cloud.vertexai.v1beta1.Endpoint.enable_private_service_connect is
   *     deprecated. See google/cloud/vertexai/v1beta1/endpoint.proto;l=126
   * @return The enablePrivateServiceConnect.
   */
  @java.lang.Deprecated
  boolean getEnablePrivateServiceConnect();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the Model Monitoring job associated with this
   * Endpoint if monitoring is enabled by
   * [JobService.CreateModelDeploymentMonitoringJob][google.cloud.vertexai.v1beta1.JobService.CreateModelDeploymentMonitoringJob].
   * Format:
   * `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * </pre>
   *
   * <code>
   * string model_deployment_monitoring_job = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The modelDeploymentMonitoringJob.
   */
  java.lang.String getModelDeploymentMonitoringJob();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the Model Monitoring job associated with this
   * Endpoint if monitoring is enabled by
   * [JobService.CreateModelDeploymentMonitoringJob][google.cloud.vertexai.v1beta1.JobService.CreateModelDeploymentMonitoringJob].
   * Format:
   * `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * </pre>
   *
   * <code>
   * string model_deployment_monitoring_job = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for modelDeploymentMonitoringJob.
   */
  com.google.protobuf.ByteString getModelDeploymentMonitoringJobBytes();

  /**
   *
   *
   * <pre>
   * Configures the request-response logging for online prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.PredictRequestResponseLoggingConfig predict_request_response_logging_config = 18;
   * </code>
   *
   * @return Whether the predictRequestResponseLoggingConfig field is set.
   */
  boolean hasPredictRequestResponseLoggingConfig();
  /**
   *
   *
   * <pre>
   * Configures the request-response logging for online prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.PredictRequestResponseLoggingConfig predict_request_response_logging_config = 18;
   * </code>
   *
   * @return The predictRequestResponseLoggingConfig.
   */
  com.google.cloud.vertexai.v1beta1.PredictRequestResponseLoggingConfig
      getPredictRequestResponseLoggingConfig();
  /**
   *
   *
   * <pre>
   * Configures the request-response logging for online prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.PredictRequestResponseLoggingConfig predict_request_response_logging_config = 18;
   * </code>
   */
  com.google.cloud.vertexai.v1beta1.PredictRequestResponseLoggingConfigOrBuilder
      getPredictRequestResponseLoggingConfigOrBuilder();
}
