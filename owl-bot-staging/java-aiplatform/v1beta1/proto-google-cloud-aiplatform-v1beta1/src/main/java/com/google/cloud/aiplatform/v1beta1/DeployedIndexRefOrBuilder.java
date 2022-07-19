// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/deployed_index_ref.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DeployedIndexRefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeployedIndexRef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. A resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   * <pre>
   * Immutable. A resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString
      getIndexEndpointBytes();

  /**
   * <pre>
   * Immutable. The ID of the DeployedIndex in the above IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The deployedIndexId.
   */
  java.lang.String getDeployedIndexId();
  /**
   * <pre>
   * Immutable. The ID of the DeployedIndex in the above IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for deployedIndexId.
   */
  com.google.protobuf.ByteString
      getDeployedIndexIdBytes();
}
