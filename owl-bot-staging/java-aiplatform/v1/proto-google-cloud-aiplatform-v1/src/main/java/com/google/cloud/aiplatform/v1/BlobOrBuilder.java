// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface BlobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Blob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The IANA standard MIME type of the source data.
   * </pre>
   *
   * <code>string mime_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * Required. The IANA standard MIME type of the source data.
   * </pre>
   *
   * <code>string mime_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * Required. Raw bytes.
   * </pre>
   *
   * <code>bytes data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
