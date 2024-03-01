// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

// Protobuf Java Version: 3.25.2
package com.google.webrisk.v1beta1;

public interface RiceDeltaEncodingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.RiceDeltaEncoding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The offset of the first entry in the encoded data, or, if only a single
   * integer was encoded, that single integer's value. If the field is empty or
   * missing, assume zero.
   * </pre>
   *
   * <code>int64 first_value = 1;</code>
   * @return The firstValue.
   */
  long getFirstValue();

  /**
   * <pre>
   * The Golomb-Rice parameter, which is a number between 2 and 28. This field
   * is missing (that is, zero) if `num_entries` is zero.
   * </pre>
   *
   * <code>int32 rice_parameter = 2;</code>
   * @return The riceParameter.
   */
  int getRiceParameter();

  /**
   * <pre>
   * The number of entries that are delta encoded in the encoded data. If only a
   * single integer was encoded, this will be zero and the single value will be
   * stored in `first_value`.
   * </pre>
   *
   * <code>int32 entry_count = 3;</code>
   * @return The entryCount.
   */
  int getEntryCount();

  /**
   * <pre>
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * </pre>
   *
   * <code>bytes encoded_data = 4;</code>
   * @return The encodedData.
   */
  com.google.protobuf.ByteString getEncodedData();
}
