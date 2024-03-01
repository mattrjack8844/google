// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.2
package com.google.webrisk.v1;

public interface RawHashesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.RawHashes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of bytes for each prefix encoded below.  This field can be
   * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
   * In practice this is almost always 4, except in exceptional circumstances.
   * </pre>
   *
   * <code>int32 prefix_size = 1;</code>
   * @return The prefixSize.
   */
  int getPrefixSize();

  /**
   * <pre>
   * The hashes, in binary format, concatenated into one long string. Hashes are
   * sorted in lexicographic order. For JSON API users, hashes are
   * base64-encoded.
   * </pre>
   *
   * <code>bytes raw_hashes = 2;</code>
   * @return The rawHashes.
   */
  com.google.protobuf.ByteString getRawHashes();
}
