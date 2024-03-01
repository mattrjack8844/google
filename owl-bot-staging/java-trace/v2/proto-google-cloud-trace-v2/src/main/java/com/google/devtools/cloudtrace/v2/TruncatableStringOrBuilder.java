// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.cloudtrace.v2;

public interface TruncatableStringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.TruncatableString)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The shortened string. For example, if the original string is 500
   * bytes long and the limit of the string is 128 bytes, then
   * `value` contains the first 128 bytes of the 500-byte string.
   *
   * Truncation always happens on a UTF8 character boundary. If there
   * are multi-byte characters in the string, then the length of the
   * shortened string might be less than the size limit.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The shortened string. For example, if the original string is 500
   * bytes long and the limit of the string is 128 bytes, then
   * `value` contains the first 128 bytes of the 500-byte string.
   *
   * Truncation always happens on a UTF8 character boundary. If there
   * are multi-byte characters in the string, then the length of the
   * shortened string might be less than the size limit.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * The number of bytes removed from the original string. If this
   * value is 0, then the string was not shortened.
   * </pre>
   *
   * <code>int32 truncated_byte_count = 2;</code>
   * @return The truncatedByteCount.
   */
  int getTruncatedByteCount();
}
