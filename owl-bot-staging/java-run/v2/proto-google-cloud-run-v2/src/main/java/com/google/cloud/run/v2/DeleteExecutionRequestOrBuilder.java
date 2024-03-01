// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/execution.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public interface DeleteExecutionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.DeleteExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Execution to delete.
   * Format:
   * `projects/{project}/locations/{location}/jobs/{job}/executions/{execution}`,
   * where `{project}` can be project id or number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the Execution to delete.
   * Format:
   * `projects/{project}/locations/{location}/jobs/{job}/executions/{execution}`,
   * where `{project}` can be project id or number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Indicates that the request should be validated without actually
   * deleting any resources.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * A system-generated fingerprint for this version of the resource.
   * This may be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * A system-generated fingerprint for this version of the resource.
   * This may be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
