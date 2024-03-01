// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public interface GcsSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing product
   * information](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the inputUris.
   */
  java.util.List<java.lang.String>
      getInputUrisList();
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing product
   * information](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of inputUris.
   */
  int getInputUrisCount();
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing product
   * information](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The inputUris at the given index.
   */
  java.lang.String getInputUris(int index);
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing product
   * information](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputUris at the given index.
   */
  com.google.protobuf.ByteString
      getInputUrisBytes(int index);

  /**
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for product imports:
   *
   * * `product` (default): One JSON
   * [Product][google.cloud.retail.v2beta.Product] per line. Each product must
   *   have a valid [Product.id][google.cloud.retail.v2beta.Product.id].
   * * `product_merchant_center`: See [Importing catalog data from Merchant
   *   Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc).
   *
   * Supported values for user events imports:
   *
   * * `user_event` (default): One JSON
   * [UserEvent][google.cloud.retail.v2beta.UserEvent] per line.
   * * `user_event_ga360`: Using
   *   https://support.google.com/analytics/answer/3437719.
   *
   * Supported values for control imports:
   *
   * * `control` (default): One JSON
   * [Control][google.cloud.retail.v2beta.Control] per line.
   *
   * Supported values for catalog attribute imports:
   *
   * * `catalog_attribute` (default): One CSV
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute] per line.
   * </pre>
   *
   * <code>string data_schema = 2;</code>
   * @return The dataSchema.
   */
  java.lang.String getDataSchema();
  /**
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for product imports:
   *
   * * `product` (default): One JSON
   * [Product][google.cloud.retail.v2beta.Product] per line. Each product must
   *   have a valid [Product.id][google.cloud.retail.v2beta.Product.id].
   * * `product_merchant_center`: See [Importing catalog data from Merchant
   *   Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc).
   *
   * Supported values for user events imports:
   *
   * * `user_event` (default): One JSON
   * [UserEvent][google.cloud.retail.v2beta.UserEvent] per line.
   * * `user_event_ga360`: Using
   *   https://support.google.com/analytics/answer/3437719.
   *
   * Supported values for control imports:
   *
   * * `control` (default): One JSON
   * [Control][google.cloud.retail.v2beta.Control] per line.
   *
   * Supported values for catalog attribute imports:
   *
   * * `catalog_attribute` (default): One CSV
   * [CatalogAttribute][google.cloud.retail.v2beta.CatalogAttribute] per line.
   * </pre>
   *
   * <code>string data_schema = 2;</code>
   * @return The bytes for dataSchema.
   */
  com.google.protobuf.ByteString
      getDataSchemaBytes();
}
