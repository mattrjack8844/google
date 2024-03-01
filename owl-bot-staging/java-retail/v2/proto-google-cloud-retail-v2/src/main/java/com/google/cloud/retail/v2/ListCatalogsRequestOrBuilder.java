// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface ListCatalogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ListCatalogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The account resource name with an associated location.
   *
   * If the caller does not have permission to list
   * [Catalog][google.cloud.retail.v2.Catalog]s under this location, regardless
   * of whether or not this location exists, a PERMISSION_DENIED error is
   * returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The account resource name with an associated location.
   *
   * If the caller does not have permission to list
   * [Catalog][google.cloud.retail.v2.Catalog]s under this location, regardless
   * of whether or not this location exists, a PERMISSION_DENIED error is
   * returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Maximum number of [Catalog][google.cloud.retail.v2.Catalog]s to return. If
   * unspecified, defaults to 50. The maximum allowed value is 1000. Values
   * above 1000 will be coerced to 1000.
   *
   * If this field is negative, an INVALID_ARGUMENT is returned.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token
   * [ListCatalogsResponse.next_page_token][google.cloud.retail.v2.ListCatalogsResponse.next_page_token],
   * received from a previous
   * [CatalogService.ListCatalogs][google.cloud.retail.v2.CatalogService.ListCatalogs]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [CatalogService.ListCatalogs][google.cloud.retail.v2.CatalogService.ListCatalogs]
   * must match the call that provided the page token. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token
   * [ListCatalogsResponse.next_page_token][google.cloud.retail.v2.ListCatalogsResponse.next_page_token],
   * received from a previous
   * [CatalogService.ListCatalogs][google.cloud.retail.v2.CatalogService.ListCatalogs]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [CatalogService.ListCatalogs][google.cloud.retail.v2.CatalogService.ListCatalogs]
   * must match the call that provided the page token. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
