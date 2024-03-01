// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/serving_config_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface UpdateServingConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UpdateServingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the servingConfig field is set.
   */
  boolean hasServingConfig();
  /**
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The servingConfig.
   */
  com.google.cloud.retail.v2.ServingConfig getServingConfig();
  /**
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigOrBuilder();

  /**
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
