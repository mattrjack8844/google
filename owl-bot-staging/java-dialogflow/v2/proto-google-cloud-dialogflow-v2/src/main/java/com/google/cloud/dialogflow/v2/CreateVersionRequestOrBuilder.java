// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/version.proto

package com.google.cloud.dialogflow.v2;

public interface CreateVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to create a version for.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to create a version for.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Version version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Version version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The version.
   */
  com.google.cloud.dialogflow.v2.Version getVersion();
  /**
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Version version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.VersionOrBuilder getVersionOrBuilder();
}
