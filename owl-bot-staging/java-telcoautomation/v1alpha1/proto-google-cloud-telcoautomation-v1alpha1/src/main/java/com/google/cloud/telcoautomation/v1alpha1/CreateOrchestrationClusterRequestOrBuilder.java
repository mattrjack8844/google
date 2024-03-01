// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1alpha1;

public interface CreateOrchestrationClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.CreateOrchestrationClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Id of the requesting object
   * If auto-generating Id server-side, remove this field and
   * orchestration_cluster_id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string orchestration_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The orchestrationClusterId.
   */
  java.lang.String getOrchestrationClusterId();
  /**
   * <pre>
   * Required. Id of the requesting object
   * If auto-generating Id server-side, remove this field and
   * orchestration_cluster_id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string orchestration_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for orchestrationClusterId.
   */
  com.google.protobuf.ByteString
      getOrchestrationClusterIdBytes();

  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.OrchestrationCluster orchestration_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the orchestrationCluster field is set.
   */
  boolean hasOrchestrationCluster();
  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.OrchestrationCluster orchestration_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The orchestrationCluster.
   */
  com.google.cloud.telcoautomation.v1alpha1.OrchestrationCluster getOrchestrationCluster();
  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.OrchestrationCluster orchestration_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.OrchestrationClusterOrBuilder getOrchestrationClusterOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
