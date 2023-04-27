// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DeployModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeployModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Endpoint resource into which to deploy a Model.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <pre>
   * Required. The name of the Endpoint resource into which to deploy a Model.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <pre>
   * Required. The DeployedModel to be created within the Endpoint. Note that
   * [Endpoint.traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * must be updated for the DeployedModel to start receiving traffic, either as
   * part of this call, or via
   * [EndpointService.UpdateEndpoint][google.cloud.aiplatform.v1beta1.EndpointService.UpdateEndpoint].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deployedModel field is set.
   */
  boolean hasDeployedModel();
  /**
   * <pre>
   * Required. The DeployedModel to be created within the Endpoint. Note that
   * [Endpoint.traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * must be updated for the DeployedModel to start receiving traffic, either as
   * part of this call, or via
   * [EndpointService.UpdateEndpoint][google.cloud.aiplatform.v1beta1.EndpointService.UpdateEndpoint].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deployedModel.
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModel();
  /**
   * <pre>
   * Required. The DeployedModel to be created within the Endpoint. Note that
   * [Endpoint.traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * must be updated for the DeployedModel to start receiving traffic, either as
   * part of this call, or via
   * [EndpointService.UpdateEndpoint][google.cloud.aiplatform.v1beta1.EndpointService.UpdateEndpoint].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelOrBuilder();

  /**
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   * If this field is non-empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. To refer to the ID of the just being deployed
   * Model, a "0" should be used, and the actual ID of the new DeployedModel
   * will be filled in its place by this method. The traffic percentage values
   * must add up to 100.
   * If this field is empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split] is
   * not updated.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitCount();
  /**
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   * If this field is non-empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. To refer to the ID of the just being deployed
   * Model, a "0" should be used, and the actual ID of the new DeployedModel
   * will be filled in its place by this method. The traffic percentage values
   * must add up to 100.
   * If this field is empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split] is
   * not updated.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  boolean containsTrafficSplit(
      java.lang.String key);
  /**
   * Use {@link #getTrafficSplitMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getTrafficSplit();
  /**
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   * If this field is non-empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. To refer to the ID of the just being deployed
   * Model, a "0" should be used, and the actual ID of the new DeployedModel
   * will be filled in its place by this method. The traffic percentage values
   * must add up to 100.
   * If this field is empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split] is
   * not updated.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getTrafficSplitMap();
  /**
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   * If this field is non-empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. To refer to the ID of the just being deployed
   * Model, a "0" should be used, and the actual ID of the new DeployedModel
   * will be filled in its place by this method. The traffic percentage values
   * must add up to 100.
   * If this field is empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split] is
   * not updated.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <pre>
   * A map from a DeployedModel's ID to the percentage of this Endpoint's
   * traffic that should be forwarded to that DeployedModel.
   * If this field is non-empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split]
   * will be overwritten with it. To refer to the ID of the just being deployed
   * Model, a "0" should be used, and the actual ID of the new DeployedModel
   * will be filled in its place by this method. The traffic percentage values
   * must add up to 100.
   * If this field is empty, then the Endpoint's
   * [traffic_split][google.cloud.aiplatform.v1beta1.Endpoint.traffic_split] is
   * not updated.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; traffic_split = 3;</code>
   */
  int getTrafficSplitOrThrow(
      java.lang.String key);
}
