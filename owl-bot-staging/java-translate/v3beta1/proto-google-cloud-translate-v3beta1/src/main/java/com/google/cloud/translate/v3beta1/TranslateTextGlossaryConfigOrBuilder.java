// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3beta1;

public interface TranslateTextGlossaryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.TranslateTextGlossaryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Specifies the glossary used for this translation. Use
   * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The glossary.
   */
  java.lang.String getGlossary();
  /**
   * <pre>
   * Required. Specifies the glossary used for this translation. Use
   * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for glossary.
   */
  com.google.protobuf.ByteString
      getGlossaryBytes();

  /**
   * <pre>
   * Optional. Indicates match is case-insensitive.
   * Default value is false if missing.
   * </pre>
   *
   * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ignoreCase.
   */
  boolean getIgnoreCase();
}
