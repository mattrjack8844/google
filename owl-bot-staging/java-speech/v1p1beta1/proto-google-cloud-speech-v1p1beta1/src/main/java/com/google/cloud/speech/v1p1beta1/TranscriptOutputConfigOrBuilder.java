// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1p1beta1;

public interface TranscriptOutputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.TranscriptOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return Whether the gcsUri field is set.
   */
  boolean hasGcsUri();
  /**
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString
      getGcsUriBytes();

  com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.OutputTypeCase getOutputTypeCase();
}
