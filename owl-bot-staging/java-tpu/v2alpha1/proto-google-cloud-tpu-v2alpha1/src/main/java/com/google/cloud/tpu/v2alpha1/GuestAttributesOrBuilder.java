// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface GuestAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GuestAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path to be queried. This can be the default namespace ('/') or a
   * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
   * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
   * </pre>
   *
   * <code>string query_path = 1;</code>
   * @return The queryPath.
   */
  java.lang.String getQueryPath();
  /**
   * <pre>
   * The path to be queried. This can be the default namespace ('/') or a
   * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
   * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
   * </pre>
   *
   * <code>string query_path = 1;</code>
   * @return The bytes for queryPath.
   */
  com.google.protobuf.ByteString
      getQueryPathBytes();

  /**
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.GuestAttributesValue query_value = 2;</code>
   * @return Whether the queryValue field is set.
   */
  boolean hasQueryValue();
  /**
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.GuestAttributesValue query_value = 2;</code>
   * @return The queryValue.
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributesValue getQueryValue();
  /**
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.GuestAttributesValue query_value = 2;</code>
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributesValueOrBuilder getQueryValueOrBuilder();
}
