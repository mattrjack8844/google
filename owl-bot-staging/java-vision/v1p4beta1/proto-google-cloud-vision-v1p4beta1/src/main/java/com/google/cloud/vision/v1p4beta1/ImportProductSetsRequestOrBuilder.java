// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p4beta1;

public interface ImportProductSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ImportProductSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project in which the ProductSets should be imported.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project in which the ProductSets should be imported.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Required. The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  com.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig getInputConfig();
  /**
   * <pre>
   * Required. The input content for the list of requests.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfigOrBuilder getInputConfigOrBuilder();
}
