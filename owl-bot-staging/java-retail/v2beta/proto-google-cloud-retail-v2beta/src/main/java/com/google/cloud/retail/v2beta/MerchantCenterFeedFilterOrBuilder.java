// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

public interface MerchantCenterFeedFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.MerchantCenterFeedFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Merchant Center primary feed ID.
   * </pre>
   *
   * <code>int64 primary_feed_id = 1;</code>
   * @return The primaryFeedId.
   */
  long getPrimaryFeedId();

  /**
   * <pre>
   * Merchant Center primary feed name. The name is used for the display
   * purposes only.
   * </pre>
   *
   * <code>string primary_feed_name = 2;</code>
   * @return The primaryFeedName.
   */
  java.lang.String getPrimaryFeedName();
  /**
   * <pre>
   * Merchant Center primary feed name. The name is used for the display
   * purposes only.
   * </pre>
   *
   * <code>string primary_feed_name = 2;</code>
   * @return The bytes for primaryFeedName.
   */
  com.google.protobuf.ByteString
      getPrimaryFeedNameBytes();
}
