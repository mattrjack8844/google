// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p4beta1;

public interface UpdateProductSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.UpdateProductSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the productSet field is set.
   */
  boolean hasProductSet();
  /**
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The productSet.
   */
  com.google.cloud.vision.v1p4beta1.ProductSet getProductSet();
  /**
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1p4beta1.ProductSetOrBuilder getProductSetOrBuilder();

  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
