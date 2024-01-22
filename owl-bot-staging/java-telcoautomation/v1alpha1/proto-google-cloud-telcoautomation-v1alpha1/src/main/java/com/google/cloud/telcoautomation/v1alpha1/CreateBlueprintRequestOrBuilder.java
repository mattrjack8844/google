// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

public interface CreateBlueprintRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.CreateBlueprintRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of parent resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of parent resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The name of the blueprint.
   * </pre>
   *
   * <code>string blueprint_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The blueprintId.
   */
  java.lang.String getBlueprintId();
  /**
   * <pre>
   * Optional. The name of the blueprint.
   * </pre>
   *
   * <code>string blueprint_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for blueprintId.
   */
  com.google.protobuf.ByteString
      getBlueprintIdBytes();

  /**
   * <pre>
   * Required. The `Blueprint` to create.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.Blueprint blueprint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the blueprint field is set.
   */
  boolean hasBlueprint();
  /**
   * <pre>
   * Required. The `Blueprint` to create.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.Blueprint blueprint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The blueprint.
   */
  com.google.cloud.telcoautomation.v1alpha1.Blueprint getBlueprint();
  /**
   * <pre>
   * Required. The `Blueprint` to create.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.Blueprint blueprint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.BlueprintOrBuilder getBlueprintOrBuilder();
}
