// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/inventories/v1beta/localinventory.proto

// Protobuf Java Version: 3.25.2
package com.google.shopping.merchant.inventories.v1beta;

public interface LocalInventoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.LocalInventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the `LocalInventory` resource.
   * Format:
   * `accounts/{account}/products/{product}/localInventories/{store_code}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the `LocalInventory` resource.
   * Format:
   * `accounts/{account}/products/{product}/localInventories/{store_code}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The account that owns the product. This field will be ignored
   * if set by the client.
   * </pre>
   *
   * <code>int64 account = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The account.
   */
  long getAccount();

  /**
   * <pre>
   * Required. Store code (the store ID from your Business Profile) of the
   * physical store the product is sold in. See the [Local product inventory
   * feed specification](https://support.google.com/merchants/answer/3061342)
   * for more information.
   * </pre>
   *
   * <code>string store_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The storeCode.
   */
  java.lang.String getStoreCode();
  /**
   * <pre>
   * Required. Store code (the store ID from your Business Profile) of the
   * physical store the product is sold in. See the [Local product inventory
   * feed specification](https://support.google.com/merchants/answer/3061342)
   * for more information.
   * </pre>
   *
   * <code>string store_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for storeCode.
   */
  com.google.protobuf.ByteString
      getStoreCodeBytes();

  /**
   * <pre>
   * Price of the product at this store.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 4;</code>
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   * <pre>
   * Price of the product at this store.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 4;</code>
   * @return The price.
   */
  com.google.shopping.type.Price getPrice();
  /**
   * <pre>
   * Price of the product at this store.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 4;</code>
   */
  com.google.shopping.type.PriceOrBuilder getPriceOrBuilder();

  /**
   * <pre>
   * Sale price of the product at this store. Mandatory if
   * [`salePriceEffectiveDate`][google.shopping.merchant.inventories.v1beta.LocalInventory.sale_price_effective_date]
   * is defined.
   * </pre>
   *
   * <code>.google.shopping.type.Price sale_price = 5;</code>
   * @return Whether the salePrice field is set.
   */
  boolean hasSalePrice();
  /**
   * <pre>
   * Sale price of the product at this store. Mandatory if
   * [`salePriceEffectiveDate`][google.shopping.merchant.inventories.v1beta.LocalInventory.sale_price_effective_date]
   * is defined.
   * </pre>
   *
   * <code>.google.shopping.type.Price sale_price = 5;</code>
   * @return The salePrice.
   */
  com.google.shopping.type.Price getSalePrice();
  /**
   * <pre>
   * Sale price of the product at this store. Mandatory if
   * [`salePriceEffectiveDate`][google.shopping.merchant.inventories.v1beta.LocalInventory.sale_price_effective_date]
   * is defined.
   * </pre>
   *
   * <code>.google.shopping.type.Price sale_price = 5;</code>
   */
  com.google.shopping.type.PriceOrBuilder getSalePriceOrBuilder();

  /**
   * <pre>
   * The `TimePeriod` of the
   * sale at this store.
   * </pre>
   *
   * <code>.google.type.Interval sale_price_effective_date = 6;</code>
   * @return Whether the salePriceEffectiveDate field is set.
   */
  boolean hasSalePriceEffectiveDate();
  /**
   * <pre>
   * The `TimePeriod` of the
   * sale at this store.
   * </pre>
   *
   * <code>.google.type.Interval sale_price_effective_date = 6;</code>
   * @return The salePriceEffectiveDate.
   */
  com.google.type.Interval getSalePriceEffectiveDate();
  /**
   * <pre>
   * The `TimePeriod` of the
   * sale at this store.
   * </pre>
   *
   * <code>.google.type.Interval sale_price_effective_date = 6;</code>
   */
  com.google.type.IntervalOrBuilder getSalePriceEffectiveDateOrBuilder();

  /**
   * <pre>
   * Availability of the product at this store.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string availability = 7;</code>
   * @return Whether the availability field is set.
   */
  boolean hasAvailability();
  /**
   * <pre>
   * Availability of the product at this store.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string availability = 7;</code>
   * @return The availability.
   */
  java.lang.String getAvailability();
  /**
   * <pre>
   * Availability of the product at this store.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string availability = 7;</code>
   * @return The bytes for availability.
   */
  com.google.protobuf.ByteString
      getAvailabilityBytes();

  /**
   * <pre>
   * Quantity of the product available at this store. Must be greater than or
   * equal to zero.
   * </pre>
   *
   * <code>optional int64 quantity = 8;</code>
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   * <pre>
   * Quantity of the product available at this store. Must be greater than or
   * equal to zero.
   * </pre>
   *
   * <code>optional int64 quantity = 8;</code>
   * @return The quantity.
   */
  long getQuantity();

  /**
   * <pre>
   * Supported pickup method for this product. Unless the value is `"not
   * supported"`, this field must be submitted together with
   * `pickupSla`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_method = 9;</code>
   * @return Whether the pickupMethod field is set.
   */
  boolean hasPickupMethod();
  /**
   * <pre>
   * Supported pickup method for this product. Unless the value is `"not
   * supported"`, this field must be submitted together with
   * `pickupSla`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_method = 9;</code>
   * @return The pickupMethod.
   */
  java.lang.String getPickupMethod();
  /**
   * <pre>
   * Supported pickup method for this product. Unless the value is `"not
   * supported"`, this field must be submitted together with
   * `pickupSla`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_method = 9;</code>
   * @return The bytes for pickupMethod.
   */
  com.google.protobuf.ByteString
      getPickupMethodBytes();

  /**
   * <pre>
   * Relative time period from the order date for an order for this product,
   * from this store, to be ready for pickup. Must be submitted with
   * `pickupMethod`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_sla = 10;</code>
   * @return Whether the pickupSla field is set.
   */
  boolean hasPickupSla();
  /**
   * <pre>
   * Relative time period from the order date for an order for this product,
   * from this store, to be ready for pickup. Must be submitted with
   * `pickupMethod`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_sla = 10;</code>
   * @return The pickupSla.
   */
  java.lang.String getPickupSla();
  /**
   * <pre>
   * Relative time period from the order date for an order for this product,
   * from this store, to be ready for pickup. Must be submitted with
   * `pickupMethod`.
   * For accepted attribute values, see the [local product inventory feed
   * specification](https://support.google.com/merchants/answer/3061342)
   * </pre>
   *
   * <code>optional string pickup_sla = 10;</code>
   * @return The bytes for pickupSla.
   */
  com.google.protobuf.ByteString
      getPickupSlaBytes();

  /**
   * <pre>
   * Location of the product inside the store. Maximum length is 20 bytes.
   * </pre>
   *
   * <code>optional string instore_product_location = 11;</code>
   * @return Whether the instoreProductLocation field is set.
   */
  boolean hasInstoreProductLocation();
  /**
   * <pre>
   * Location of the product inside the store. Maximum length is 20 bytes.
   * </pre>
   *
   * <code>optional string instore_product_location = 11;</code>
   * @return The instoreProductLocation.
   */
  java.lang.String getInstoreProductLocation();
  /**
   * <pre>
   * Location of the product inside the store. Maximum length is 20 bytes.
   * </pre>
   *
   * <code>optional string instore_product_location = 11;</code>
   * @return The bytes for instoreProductLocation.
   */
  com.google.protobuf.ByteString
      getInstoreProductLocationBytes();

  /**
   * <pre>
   * A list of custom (merchant-provided) attributes. You can also use
   * `CustomAttribute` to submit any attribute of the feed specification in its
   * generic form.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 12;</code>
   */
  java.util.List<com.google.shopping.type.CustomAttribute> 
      getCustomAttributesList();
  /**
   * <pre>
   * A list of custom (merchant-provided) attributes. You can also use
   * `CustomAttribute` to submit any attribute of the feed specification in its
   * generic form.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 12;</code>
   */
  com.google.shopping.type.CustomAttribute getCustomAttributes(int index);
  /**
   * <pre>
   * A list of custom (merchant-provided) attributes. You can also use
   * `CustomAttribute` to submit any attribute of the feed specification in its
   * generic form.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 12;</code>
   */
  int getCustomAttributesCount();
  /**
   * <pre>
   * A list of custom (merchant-provided) attributes. You can also use
   * `CustomAttribute` to submit any attribute of the feed specification in its
   * generic form.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 12;</code>
   */
  java.util.List<? extends com.google.shopping.type.CustomAttributeOrBuilder> 
      getCustomAttributesOrBuilderList();
  /**
   * <pre>
   * A list of custom (merchant-provided) attributes. You can also use
   * `CustomAttribute` to submit any attribute of the feed specification in its
   * generic form.
   * </pre>
   *
   * <code>repeated .google.shopping.type.CustomAttribute custom_attributes = 12;</code>
   */
  com.google.shopping.type.CustomAttributeOrBuilder getCustomAttributesOrBuilder(
      int index);
}
