// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ProductInlineSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ProductInlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Product> 
      getProductsList();
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2alpha.Product getProducts(int index);
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getProductsCount();
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ProductOrBuilder> 
      getProductsOrBuilderList();
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2alpha.ProductOrBuilder getProductsOrBuilder(
      int index);
}
