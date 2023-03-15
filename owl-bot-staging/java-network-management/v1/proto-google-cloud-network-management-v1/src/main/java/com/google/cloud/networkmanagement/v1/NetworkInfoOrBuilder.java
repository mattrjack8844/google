// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1/trace.proto

package com.google.cloud.networkmanagement.v1;

public interface NetworkInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.NetworkInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of a Compute Engine network.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Name of a Compute Engine network.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * URI of a Compute Engine network.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * URI of a Compute Engine network.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The IP range that matches the test.
   * </pre>
   *
   * <code>string matched_ip_range = 4;</code>
   * @return The matchedIpRange.
   */
  java.lang.String getMatchedIpRange();
  /**
   * <pre>
   * The IP range that matches the test.
   * </pre>
   *
   * <code>string matched_ip_range = 4;</code>
   * @return The bytes for matchedIpRange.
   */
  com.google.protobuf.ByteString
      getMatchedIpRangeBytes();
}
