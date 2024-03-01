// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/catalog_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public interface ReplaceCatalogAttributeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ReplaceCatalogAttributeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The attributesConfig.
   */
  java.lang.String getAttributesConfig();
  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for attributesConfig.
   */
  com.google.protobuf.ByteString
      getAttributesConfigBytes();

  /**
   * <pre>
   * Required. The updated
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the catalogAttribute field is set.
   */
  boolean hasCatalogAttribute();
  /**
   * <pre>
   * Required. The updated
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The catalogAttribute.
   */
  com.google.cloud.retail.v2beta.CatalogAttribute getCatalogAttribute();
  /**
   * <pre>
   * Required. The updated
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2beta.CatalogAttributeOrBuilder getCatalogAttributeOrBuilder();

  /**
   * <pre>
   * Indicates which fields in the provided
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute] to update.
   * The following are NOT supported:
   *
   * * [CatalogAttribute.key][google.cloud.retail.v2beta.CatalogAttribute.key]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute] to update.
   * The following are NOT supported:
   *
   * * [CatalogAttribute.key][google.cloud.retail.v2beta.CatalogAttribute.key]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute] to update.
   * The following are NOT supported:
   *
   * * [CatalogAttribute.key][google.cloud.retail.v2beta.CatalogAttribute.key]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
