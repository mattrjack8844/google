// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface CreatePostureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.CreatePostureRequest)
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
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The postureId.
   */
  java.lang.String getPostureId();
  /**
   * <pre>
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for postureId.
   */
  com.google.protobuf.ByteString
      getPostureIdBytes();

  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the posture field is set.
   */
  boolean hasPosture();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The posture.
   */
  com.google.cloud.securityposture.v1.Posture getPosture();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securityposture.v1.PostureOrBuilder getPostureOrBuilder();
}
