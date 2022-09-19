// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v1/cloud_tpu.proto

package com.google.cloud.tpu.v1;

public interface AcceleratorTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v1.AcceleratorType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the accelerator type.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * the accelerator type.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
