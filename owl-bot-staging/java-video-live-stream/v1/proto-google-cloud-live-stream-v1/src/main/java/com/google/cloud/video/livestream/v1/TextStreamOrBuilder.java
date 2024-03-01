// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/outputs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public interface TextStreamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.TextStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The codec for this text stream.
   *
   * Supported text codecs:
   *
   * - `cea608`
   * - `cea708`
   * </pre>
   *
   * <code>string codec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   * Required. The codec for this text stream.
   *
   * Supported text codecs:
   *
   * - `cea608`
   * - `cea708`
   * </pre>
   *
   * <code>string codec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();
}
