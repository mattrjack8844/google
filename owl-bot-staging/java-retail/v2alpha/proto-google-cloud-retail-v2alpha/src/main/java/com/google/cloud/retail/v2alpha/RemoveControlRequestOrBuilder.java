// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/serving_config_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface RemoveControlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.RemoveControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The source ServingConfig resource name . Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/servingConfigs/{serving_config_id}`
   * </pre>
   *
   * <code>string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The servingConfig.
   */
  java.lang.String getServingConfig();
  /**
   * <pre>
   * Required. The source ServingConfig resource name . Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/servingConfigs/{serving_config_id}`
   * </pre>
   *
   * <code>string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for servingConfig.
   */
  com.google.protobuf.ByteString
      getServingConfigBytes();

  /**
   * <pre>
   * Required. The id of the control to apply. Assumed to be in the same catalog
   * as the serving config.
   * </pre>
   *
   * <code>string control_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The controlId.
   */
  java.lang.String getControlId();
  /**
   * <pre>
   * Required. The id of the control to apply. Assumed to be in the same catalog
   * as the serving config.
   * </pre>
   *
   * <code>string control_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for controlId.
   */
  com.google.protobuf.ByteString
      getControlIdBytes();
}
