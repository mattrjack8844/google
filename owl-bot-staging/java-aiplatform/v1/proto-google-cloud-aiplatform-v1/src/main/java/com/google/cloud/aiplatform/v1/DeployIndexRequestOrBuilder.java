// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1;

public interface DeployIndexRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeployIndexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString
      getIndexEndpointBytes();

  /**
   * <pre>
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deployedIndex field is set.
   */
  boolean hasDeployedIndex();
  /**
   * <pre>
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deployedIndex.
   */
  com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex();
  /**
   * <pre>
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder();
}
