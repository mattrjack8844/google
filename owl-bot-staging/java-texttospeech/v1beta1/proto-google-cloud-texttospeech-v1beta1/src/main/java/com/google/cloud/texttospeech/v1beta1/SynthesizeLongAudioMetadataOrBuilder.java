// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts_lrs.proto

package com.google.cloud.texttospeech.v1beta1;

public interface SynthesizeLongAudioMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.SynthesizeLongAudioMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Deprecated. Do not use.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2 [deprecated = true];</code>
   * @deprecated google.cloud.texttospeech.v1beta1.SynthesizeLongAudioMetadata.last_update_time is deprecated.
   *     See google/cloud/texttospeech/v1beta1/cloud_tts_lrs.proto;l=86
   * @return Whether the lastUpdateTime field is set.
   */
  @java.lang.Deprecated boolean hasLastUpdateTime();
  /**
   * <pre>
   * Deprecated. Do not use.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2 [deprecated = true];</code>
   * @deprecated google.cloud.texttospeech.v1beta1.SynthesizeLongAudioMetadata.last_update_time is deprecated.
   *     See google/cloud/texttospeech/v1beta1/cloud_tts_lrs.proto;l=86
   * @return The lastUpdateTime.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   * <pre>
   * Deprecated. Do not use.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();

  /**
   * <pre>
   * The progress of the most recent processing update in percentage, ie. 70.0%.
   * </pre>
   *
   * <code>double progress_percentage = 3;</code>
   * @return The progressPercentage.
   */
  double getProgressPercentage();
}
