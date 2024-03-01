// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.servicedirectory.v1beta1;

public interface UpdateEndpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.UpdateEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The updated endpoint.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <pre>
   * Required. The updated endpoint.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endpoint.
   */
  com.google.cloud.servicedirectory.v1beta1.Endpoint getEndpoint();
  /**
   * <pre>
   * Required. The updated endpoint.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.servicedirectory.v1beta1.EndpointOrBuilder getEndpointOrBuilder();

  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
