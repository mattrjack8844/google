// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface RecognitionAudioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.RecognitionAudio)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  public com.google.cloud.speech.v1.RecognitionAudio.AudioSourceCase getAudioSourceCase();
}
