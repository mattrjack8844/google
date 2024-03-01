// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface LocalInventoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.LocalInventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The place ID for the current set of inventory information.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The placeId.
   */
  java.lang.String getPlaceId();
  /**
   * <pre>
   * The place ID for the current set of inventory information.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The bytes for placeId.
   */
  com.google.protobuf.ByteString
      getPlaceIdBytes();

  /**
   * <pre>
   * Product price and cost information.
   *
   * Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PriceInfo price_info = 2;</code>
   * @return Whether the priceInfo field is set.
   */
  boolean hasPriceInfo();
  /**
   * <pre>
   * Product price and cost information.
   *
   * Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PriceInfo price_info = 2;</code>
   * @return The priceInfo.
   */
  com.google.cloud.retail.v2alpha.PriceInfo getPriceInfo();
  /**
   * <pre>
   * Product price and cost information.
   *
   * Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PriceInfo price_info = 2;</code>
   */
  com.google.cloud.retail.v2alpha.PriceInfoOrBuilder getPriceInfoOrBuilder();

  /**
   * <pre>
   * Additional local inventory attributes, for example, store name, promotion
   * tags, etc.
   *
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   *
   * * At most 30 attributes are allowed.
   * * The key must be a UTF-8 encoded string with a length limit of 32
   *   characters.
   * * The key must match the pattern: `[a-zA-Z0-9][a-zA-Z0-9_]*`. For example,
   *   key0LikeThis or KEY_1_LIKE_THIS.
   * * The attribute values must be of the same type (text or number).
   * * Only 1 value is allowed for each attribute.
   * * For text values, the length limit is 256 UTF-8 characters.
   * * The attribute does not support search. The `searchable` field should be
   *   unset or set to false.
   * * The max summed total bytes of custom attribute keys and values per
   *   product is 5MiB.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Additional local inventory attributes, for example, store name, promotion
   * tags, etc.
   *
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   *
   * * At most 30 attributes are allowed.
   * * The key must be a UTF-8 encoded string with a length limit of 32
   *   characters.
   * * The key must match the pattern: `[a-zA-Z0-9][a-zA-Z0-9_]*`. For example,
   *   key0LikeThis or KEY_1_LIKE_THIS.
   * * The attribute values must be of the same type (text or number).
   * * Only 1 value is allowed for each attribute.
   * * For text values, the length limit is 256 UTF-8 characters.
   * * The attribute does not support search. The `searchable` field should be
   *   unset or set to false.
   * * The max summed total bytes of custom attribute keys and values per
   *   product is 5MiB.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 3;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.retail.v2alpha.CustomAttribute>
  getAttributes();
  /**
   * <pre>
   * Additional local inventory attributes, for example, store name, promotion
   * tags, etc.
   *
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   *
   * * At most 30 attributes are allowed.
   * * The key must be a UTF-8 encoded string with a length limit of 32
   *   characters.
   * * The key must match the pattern: `[a-zA-Z0-9][a-zA-Z0-9_]*`. For example,
   *   key0LikeThis or KEY_1_LIKE_THIS.
   * * The attribute values must be of the same type (text or number).
   * * Only 1 value is allowed for each attribute.
   * * For text values, the length limit is 256 UTF-8 characters.
   * * The attribute does not support search. The `searchable` field should be
   *   unset or set to false.
   * * The max summed total bytes of custom attribute keys and values per
   *   product is 5MiB.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.retail.v2alpha.CustomAttribute>
  getAttributesMap();
  /**
   * <pre>
   * Additional local inventory attributes, for example, store name, promotion
   * tags, etc.
   *
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   *
   * * At most 30 attributes are allowed.
   * * The key must be a UTF-8 encoded string with a length limit of 32
   *   characters.
   * * The key must match the pattern: `[a-zA-Z0-9][a-zA-Z0-9_]*`. For example,
   *   key0LikeThis or KEY_1_LIKE_THIS.
   * * The attribute values must be of the same type (text or number).
   * * Only 1 value is allowed for each attribute.
   * * For text values, the length limit is 256 UTF-8 characters.
   * * The attribute does not support search. The `searchable` field should be
   *   unset or set to false.
   * * The max summed total bytes of custom attribute keys and values per
   *   product is 5MiB.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 3;</code>
   */
  /* nullable */
com.google.cloud.retail.v2alpha.CustomAttribute getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.retail.v2alpha.CustomAttribute defaultValue);
  /**
   * <pre>
   * Additional local inventory attributes, for example, store name, promotion
   * tags, etc.
   *
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   *
   * * At most 30 attributes are allowed.
   * * The key must be a UTF-8 encoded string with a length limit of 32
   *   characters.
   * * The key must match the pattern: `[a-zA-Z0-9][a-zA-Z0-9_]*`. For example,
   *   key0LikeThis or KEY_1_LIKE_THIS.
   * * The attribute values must be of the same type (text or number).
   * * Only 1 value is allowed for each attribute.
   * * For text values, the length limit is 256 UTF-8 characters.
   * * The attribute does not support search. The `searchable` field should be
   *   unset or set to false.
   * * The max summed total bytes of custom attribute keys and values per
   *   product is 5MiB.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 3;</code>
   */
  com.google.cloud.retail.v2alpha.CustomAttribute getAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Input only. Supported fulfillment types. Valid fulfillment type values
   * include commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their
   * display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * All the elements must be distinct. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string fulfillment_types = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return A list containing the fulfillmentTypes.
   */
  java.util.List<java.lang.String>
      getFulfillmentTypesList();
  /**
   * <pre>
   * Input only. Supported fulfillment types. Valid fulfillment type values
   * include commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their
   * display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * All the elements must be distinct. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string fulfillment_types = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The count of fulfillmentTypes.
   */
  int getFulfillmentTypesCount();
  /**
   * <pre>
   * Input only. Supported fulfillment types. Valid fulfillment type values
   * include commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their
   * display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * All the elements must be distinct. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string fulfillment_types = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The fulfillmentTypes at the given index.
   */
  java.lang.String getFulfillmentTypes(int index);
  /**
   * <pre>
   * Input only. Supported fulfillment types. Valid fulfillment type values
   * include commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their
   * display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * All the elements must be distinct. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string fulfillment_types = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fulfillmentTypes at the given index.
   */
  com.google.protobuf.ByteString
      getFulfillmentTypesBytes(int index);
}
