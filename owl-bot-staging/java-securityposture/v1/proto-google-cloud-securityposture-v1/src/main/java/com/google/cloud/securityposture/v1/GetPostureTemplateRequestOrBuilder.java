// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface GetPostureTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.GetPostureTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Specific revision_id of a Posture Template.
   * PostureTemplate revision_id which needs to be retrieved.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * Optional. Specific revision_id of a Posture Template.
   * PostureTemplate revision_id which needs to be retrieved.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();
}
