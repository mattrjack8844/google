// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface CustomAttributeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CustomAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 255B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   */
  java.util.List<java.lang.String> getStringValuesList();
  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 255B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   */
  int getStringValuesCount();
  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 255B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   */
  java.lang.String getStringValues(int index);
  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 255B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   */
  com.google.protobuf.ByteString getStringValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   */
  java.util.List<java.lang.Long> getLongValuesList();
  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   */
  int getLongValuesCount();
  /**
   *
   *
   * <pre>
   * Optional but exactly one of
   * [string_values][google.cloud.talent.v4beta1.CustomAttribute.string_values]
   * or [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values]
   * must be specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4beta1.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   */
  long getLongValues(int index);

  /**
   *
   *
   * <pre>
   * Optional. If the `filterable` flag is true, custom field values are
   * searchable. If false, values are not searchable.
   * Default is false.
   * </pre>
   *
   * <code>bool filterable = 3;</code>
   */
  boolean getFilterable();
}
