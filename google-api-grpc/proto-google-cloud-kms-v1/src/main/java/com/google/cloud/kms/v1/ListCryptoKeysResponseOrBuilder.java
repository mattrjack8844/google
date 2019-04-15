// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface ListCryptoKeysResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListCryptoKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  java.util.List<com.google.cloud.kms.v1.CryptoKey> getCryptoKeysList();
  /**
   *
   *
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKey getCryptoKeys(int index);
  /**
   *
   *
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  int getCryptoKeysCount();
  /**
   *
   *
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  java.util.List<? extends com.google.cloud.kms.v1.CryptoKeyOrBuilder> getCryptoKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] that
   * matched the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   */
  int getTotalSize();
}
