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
// source: google/cloud/vertexai/v1beta1/endpoint_service.proto

package com.google.cloud.vertexai.v1beta1;

public interface UndeployModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.UndeployModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint resource from which to undeploy a Model.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint resource from which to undeploy a Model.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the DeployedModel to be undeployed from the Endpoint.
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deployedModelId.
   */
  java.lang.String getDeployedModelId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the DeployedModel to be undeployed from the Endpoint.
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deployedModelId.
   */
  com.google.protobuf.ByteString getDeployedModelIdBytes();

  /**
   *
   *
   * <pre>
   * If this field is provided, then the Endpoint's
   * [traffic_split][google.cloud.vertexai.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. If last DeployedModel is being undeployed from
   * the Endpoint, the [Endpoint.traffic_split] will always end up empty when
   * this call returns. A DeployedModel will be successfully undeployed only if
   * it doesn't have any traffic assigned to it when this method executes, or if
   * this field unassigns any traffic to it.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitCount();
  /**
   *
   *
   * <pre>
   * If this field is provided, then the Endpoint's
   * [traffic_split][google.cloud.vertexai.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. If last DeployedModel is being undeployed from
   * the Endpoint, the [Endpoint.traffic_split] will always end up empty when
   * this call returns. A DeployedModel will be successfully undeployed only if
   * it doesn't have any traffic assigned to it when this method executes, or if
   * this field unassigns any traffic to it.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  boolean containsTrafficSplit(java.lang.String key);
  /** Use {@link #getTrafficSplitMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getTrafficSplit();
  /**
   *
   *
   * <pre>
   * If this field is provided, then the Endpoint's
   * [traffic_split][google.cloud.vertexai.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. If last DeployedModel is being undeployed from
   * the Endpoint, the [Endpoint.traffic_split] will always end up empty when
   * this call returns. A DeployedModel will be successfully undeployed only if
   * it doesn't have any traffic assigned to it when this method executes, or if
   * this field unassigns any traffic to it.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getTrafficSplitMap();
  /**
   *
   *
   * <pre>
   * If this field is provided, then the Endpoint's
   * [traffic_split][google.cloud.vertexai.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. If last DeployedModel is being undeployed from
   * the Endpoint, the [Endpoint.traffic_split] will always end up empty when
   * this call returns. A DeployedModel will be successfully undeployed only if
   * it doesn't have any traffic assigned to it when this method executes, or if
   * this field unassigns any traffic to it.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * If this field is provided, then the Endpoint's
   * [traffic_split][google.cloud.vertexai.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. If last DeployedModel is being undeployed from
   * the Endpoint, the [Endpoint.traffic_split] will always end up empty when
   * this call returns. A DeployedModel will be successfully undeployed only if
   * it doesn't have any traffic assigned to it when this method executes, or if
   * this field unassigns any traffic to it.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitOrThrow(java.lang.String key);
}
