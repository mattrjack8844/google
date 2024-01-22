// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

public interface GetBlueprintRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.GetBlueprintRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the blueprint.
   * Case 1: If the name provided in the request is
   * {blueprint_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned. Case 2: If the name provided in the request is {blueprint}, then
   * the current state of the blueprint is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the blueprint.
   * Case 1: If the name provided in the request is
   * {blueprint_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned. Case 2: If the name provided in the request is {blueprint}, then
   * the current state of the blueprint is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Defines the type of view of the blueprint.
   * When field is not present BLUEPRINT_VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.BlueprintView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. Defines the type of view of the blueprint.
   * When field is not present BLUEPRINT_VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.BlueprintView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.cloud.telcoautomation.v1alpha1.BlueprintView getView();
}
