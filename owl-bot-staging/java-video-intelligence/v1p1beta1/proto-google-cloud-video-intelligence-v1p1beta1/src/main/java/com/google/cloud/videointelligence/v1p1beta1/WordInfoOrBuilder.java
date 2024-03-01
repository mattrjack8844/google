// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.videointelligence.v1p1beta1;

public interface WordInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.WordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the start of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the start of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Duration getStartTime();
  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the start of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the end of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the end of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   * @return The endTime.
   */
  com.google.protobuf.Duration getEndTime();
  /**
   * <pre>
   * Output only. Time offset relative to the beginning of the audio, and
   * corresponding to the end of the spoken word. This field is only set if
   * `enable_word_time_offsets=true` and only in the top hypothesis. This is an
   * experimental feature and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The word.
   */
  java.lang.String getWord();
  /**
   * <pre>
   * Output only. The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The bytes for word.
   */
  com.google.protobuf.ByteString
      getWordBytes();
}
