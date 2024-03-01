// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3beta1;

public interface GcsDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. There must be no files under 'output_uri_prefix'.
   * 'output_uri_prefix' must end with "/" and start with "gs://", otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUriPrefix.
   */
  java.lang.String getOutputUriPrefix();
  /**
   * <pre>
   * Required. There must be no files under 'output_uri_prefix'.
   * 'output_uri_prefix' must end with "/" and start with "gs://", otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUriPrefix.
   */
  com.google.protobuf.ByteString
      getOutputUriPrefixBytes();
}
