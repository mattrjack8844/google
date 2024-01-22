// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

public interface UpdateBlueprintRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.UpdateBlueprintRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The `blueprint` to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.Blueprint blueprint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the blueprint field is set.
   */
  boolean hasBlueprint();
  /**
   * <pre>
   * Required. The `blueprint` to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.Blueprint blueprint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The blueprint.
   */
  com.google.cloud.telcoautomation.v1.Blueprint getBlueprint();
  /**
   * <pre>
   * Required. The `blueprint` to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.Blueprint blueprint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.telcoautomation.v1.BlueprintOrBuilder getBlueprintOrBuilder();

  /**
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `blueprint` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `blueprint` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `blueprint` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
