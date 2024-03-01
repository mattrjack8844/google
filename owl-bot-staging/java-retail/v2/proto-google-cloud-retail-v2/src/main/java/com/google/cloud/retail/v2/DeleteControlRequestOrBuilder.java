// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/control_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface DeleteControlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.DeleteControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Control to delete. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/controls/{control_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Control to delete. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/controls/{control_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
