// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface GetDefaultBranchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.GetDefaultBranchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The catalog.
   */
  java.lang.String getCatalog();
  /**
   * <pre>
   * The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for catalog.
   */
  com.google.protobuf.ByteString
      getCatalogBytes();
}
