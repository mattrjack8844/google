// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

public interface ValidateEventThreatDetectionCustomModuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.ValidateEventThreatDetectionCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the parent to validate the Custom Module under.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the parent to validate the Custom Module under.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The raw text of the module's contents. Used to generate error
   * messages.
   * </pre>
   *
   * <code>string raw_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The rawText.
   */
  java.lang.String getRawText();
  /**
   * <pre>
   * Required. The raw text of the module's contents. Used to generate error
   * messages.
   * </pre>
   *
   * <code>string raw_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for rawText.
   */
  com.google.protobuf.ByteString
      getRawTextBytes();

  /**
   * <pre>
   * Required. The type of the module (e.g. CONFIGURABLE_BAD_IP).
   * </pre>
   *
   * <code>string type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Required. The type of the module (e.g. CONFIGURABLE_BAD_IP).
   * </pre>
   *
   * <code>string type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
