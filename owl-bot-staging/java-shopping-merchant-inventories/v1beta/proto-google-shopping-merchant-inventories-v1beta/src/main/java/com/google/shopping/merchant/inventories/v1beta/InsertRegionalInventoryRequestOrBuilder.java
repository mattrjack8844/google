// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/inventories/v1beta/regionalinventory.proto

package com.google.shopping.merchant.inventories.v1beta;

public interface InsertRegionalInventoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the regionalInventory field is set.
   */
  boolean hasRegionalInventory();
  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The regionalInventory.
   */
  com.google.shopping.merchant.inventories.v1beta.RegionalInventory getRegionalInventory();
  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder getRegionalInventoryOrBuilder();
}
