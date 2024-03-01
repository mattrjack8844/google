// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/merchant_center_account_link_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ListMerchantCenterAccountLinksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListMerchantCenterAccountLinksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent Catalog of the resource.
   * It must match this format:
   * projects/{PROJECT_NUMBER}/locations/global/catalogs/{CATALOG_ID}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent Catalog of the resource.
   * It must match this format:
   * projects/{PROJECT_NUMBER}/locations/global/catalogs/{CATALOG_ID}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
