// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/user_event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface ProductDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ProductDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2.Product] information.
   *
   * Required field(s):
   *
   * * [Product.id][google.cloud.retail.v2.Product.id]
   *
   * Optional override field(s):
   *
   * * [Product.price_info][google.cloud.retail.v2.Product.price_info]
   *
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   *
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2.Product] information.
   *
   * Required field(s):
   *
   * * [Product.id][google.cloud.retail.v2.Product.id]
   *
   * Optional override field(s):
   *
   * * [Product.price_info][google.cloud.retail.v2.Product.price_info]
   *
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   *
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The product.
   */
  com.google.cloud.retail.v2.Product getProduct();
  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2.Product] information.
   *
   * Required field(s):
   *
   * * [Product.id][google.cloud.retail.v2.Product.id]
   *
   * Optional override field(s):
   *
   * * [Product.price_info][google.cloud.retail.v2.Product.price_info]
   *
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   *
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.ProductOrBuilder getProductOrBuilder();

  /**
   * <pre>
   * Quantity of the product associated with the user event.
   *
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   * <pre>
   * Quantity of the product associated with the user event.
   *
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   * @return The quantity.
   */
  com.google.protobuf.Int32Value getQuantity();
  /**
   * <pre>
   * Quantity of the product associated with the user event.
   *
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getQuantityOrBuilder();
}
