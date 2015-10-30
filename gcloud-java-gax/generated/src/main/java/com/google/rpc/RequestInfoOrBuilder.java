// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface RequestInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.RequestInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string request_id = 1;</code>
   *
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   */
  java.lang.String getRequestId();
  /**
   * <code>optional string request_id = 1;</code>
   *
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>optional string serving_data = 2;</code>
   *
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   */
  java.lang.String getServingData();
  /**
   * <code>optional string serving_data = 2;</code>
   *
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   */
  com.google.protobuf.ByteString
      getServingDataBytes();
}
