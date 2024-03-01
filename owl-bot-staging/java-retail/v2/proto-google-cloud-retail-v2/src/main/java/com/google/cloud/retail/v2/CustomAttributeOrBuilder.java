// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface CustomAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.CustomAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   * @return A list containing the text.
   */
  java.util.List<java.lang.String>
      getTextList();
  /**
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   * @return The count of text.
   */
  int getTextCount();
  /**
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   * @param index The index of the element to return.
   * @return The text at the given index.
   */
  java.lang.String getText(int index);
  /**
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the text at the given index.
   */
  com.google.protobuf.ByteString
      getTextBytes(int index);

  /**
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   * @return A list containing the numbers.
   */
  java.util.List<java.lang.Double> getNumbersList();
  /**
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   * @return The count of numbers.
   */
  int getNumbersCount();
  /**
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of [text][google.cloud.retail.v2.CustomAttribute.text] or
   * [numbers][google.cloud.retail.v2.CustomAttribute.numbers] should be set.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   * @param index The index of the element to return.
   * @return The numbers at the given index.
   */
  double getNumbers(int index);

  /**
   * <pre>
   * This field is normally ignored unless
   * [AttributesConfig.attribute_config_level][google.cloud.retail.v2.AttributesConfig.attribute_config_level]
   * of the [Catalog][google.cloud.retail.v2.Catalog] is set to the deprecated
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level
   * attribute configuration, see [Configuration
   * modes](https://cloud.google.com/retail/docs/attribute-config#config-modes).
   * If true, custom attribute values are searchable by text queries in
   * [SearchService.Search][google.cloud.retail.v2.SearchService.Search].
   *
   * This field is ignored in a [UserEvent][google.cloud.retail.v2.UserEvent].
   *
   * Only set if type [text][google.cloud.retail.v2.CustomAttribute.text] is
   * set. Otherwise, a INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>optional bool searchable = 3 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2.CustomAttribute.searchable is deprecated.
   *     See google/cloud/retail/v2/common.proto;l=423
   * @return Whether the searchable field is set.
   */
  @java.lang.Deprecated boolean hasSearchable();
  /**
   * <pre>
   * This field is normally ignored unless
   * [AttributesConfig.attribute_config_level][google.cloud.retail.v2.AttributesConfig.attribute_config_level]
   * of the [Catalog][google.cloud.retail.v2.Catalog] is set to the deprecated
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level
   * attribute configuration, see [Configuration
   * modes](https://cloud.google.com/retail/docs/attribute-config#config-modes).
   * If true, custom attribute values are searchable by text queries in
   * [SearchService.Search][google.cloud.retail.v2.SearchService.Search].
   *
   * This field is ignored in a [UserEvent][google.cloud.retail.v2.UserEvent].
   *
   * Only set if type [text][google.cloud.retail.v2.CustomAttribute.text] is
   * set. Otherwise, a INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>optional bool searchable = 3 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2.CustomAttribute.searchable is deprecated.
   *     See google/cloud/retail/v2/common.proto;l=423
   * @return The searchable.
   */
  @java.lang.Deprecated boolean getSearchable();

  /**
   * <pre>
   * This field is normally ignored unless
   * [AttributesConfig.attribute_config_level][google.cloud.retail.v2.AttributesConfig.attribute_config_level]
   * of the [Catalog][google.cloud.retail.v2.Catalog] is set to the deprecated
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level
   * attribute configuration, see [Configuration
   * modes](https://cloud.google.com/retail/docs/attribute-config#config-modes).
   * If true, custom attribute values are indexed, so that they can be filtered,
   * faceted or boosted in
   * [SearchService.Search][google.cloud.retail.v2.SearchService.Search].
   *
   * This field is ignored in a [UserEvent][google.cloud.retail.v2.UserEvent].
   *
   * See [SearchRequest.filter][google.cloud.retail.v2.SearchRequest.filter],
   * [SearchRequest.facet_specs][google.cloud.retail.v2.SearchRequest.facet_specs]
   * and
   * [SearchRequest.boost_spec][google.cloud.retail.v2.SearchRequest.boost_spec]
   * for more details.
   * </pre>
   *
   * <code>optional bool indexable = 4 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2.CustomAttribute.indexable is deprecated.
   *     See google/cloud/retail/v2/common.proto;l=442
   * @return Whether the indexable field is set.
   */
  @java.lang.Deprecated boolean hasIndexable();
  /**
   * <pre>
   * This field is normally ignored unless
   * [AttributesConfig.attribute_config_level][google.cloud.retail.v2.AttributesConfig.attribute_config_level]
   * of the [Catalog][google.cloud.retail.v2.Catalog] is set to the deprecated
   * 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level
   * attribute configuration, see [Configuration
   * modes](https://cloud.google.com/retail/docs/attribute-config#config-modes).
   * If true, custom attribute values are indexed, so that they can be filtered,
   * faceted or boosted in
   * [SearchService.Search][google.cloud.retail.v2.SearchService.Search].
   *
   * This field is ignored in a [UserEvent][google.cloud.retail.v2.UserEvent].
   *
   * See [SearchRequest.filter][google.cloud.retail.v2.SearchRequest.filter],
   * [SearchRequest.facet_specs][google.cloud.retail.v2.SearchRequest.facet_specs]
   * and
   * [SearchRequest.boost_spec][google.cloud.retail.v2.SearchRequest.boost_spec]
   * for more details.
   * </pre>
   *
   * <code>optional bool indexable = 4 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2.CustomAttribute.indexable is deprecated.
   *     See google/cloud/retail/v2/common.proto;l=442
   * @return The indexable.
   */
  @java.lang.Deprecated boolean getIndexable();
}
