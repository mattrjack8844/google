// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/documentation.proto

package com.google.api;

public interface DocumentationRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.DocumentationRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The selector is a comma-separated list of patterns for any element such as
   * a method, a field, an enum value. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only
   * allowed at the end and for a whole component of the qualified name,
   * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
   * one or more components. To specify a default for all applicable elements,
   * the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * The selector is a comma-separated list of patterns for any element such as
   * a method, a field, an enum value. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only
   * allowed at the end and for a whole component of the qualified name,
   * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
   * one or more components. To specify a default for all applicable elements,
   * the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Description of the selected proto element (e.g. a message, a method, a
   * 'service' definition, or a field). Defaults to leading &amp; trailing comments
   * taken from the proto source definition of the proto element.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the selected proto element (e.g. a message, a method, a
   * 'service' definition, or a field). Defaults to leading &amp; trailing comments
   * taken from the proto source definition of the proto element.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   * @return The deprecationDescription.
   */
  java.lang.String getDeprecationDescription();
  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   * @return The bytes for deprecationDescription.
   */
  com.google.protobuf.ByteString
      getDeprecationDescriptionBytes();
}
