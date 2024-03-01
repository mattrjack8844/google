// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/projects.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public interface UpdateProjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.UpdateProjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The new definition of the project.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <pre>
   * Required. The new definition of the project.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  com.google.cloud.resourcemanager.v3.Project getProject();
  /**
   * <pre>
   * Required. The new definition of the project.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectOrBuilder();

  /**
   * <pre>
   * Optional. An update mask to selectively update fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. An update mask to selectively update fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. An update mask to selectively update fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
