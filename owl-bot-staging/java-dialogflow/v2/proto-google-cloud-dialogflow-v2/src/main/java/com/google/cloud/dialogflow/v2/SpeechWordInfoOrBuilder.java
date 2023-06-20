// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface SpeechWordInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SpeechWordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The word this info is for.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The word.
   */
  java.lang.String getWord();
  /**
   * <pre>
   * The word this info is for.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The bytes for word.
   */
  com.google.protobuf.ByteString
      getWordBytes();

  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   * @return Whether the startOffset field is set.
   */
  boolean hasStartOffset();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   * @return The startOffset.
   */
  com.google.protobuf.Duration getStartOffset();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder();

  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   * @return Whether the endOffset field is set.
   */
  boolean hasEndOffset();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   * @return The endOffset.
   */
  com.google.protobuf.Duration getEndOffset();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder();

  /**
   * <pre>
   * The Speech confidence between 0.0 and 1.0 for this word. A higher number
   * indicates an estimated greater likelihood that the recognized word is
   * correct. The default of 0.0 is a sentinel value indicating that confidence
   * was not set.
   *
   * This field is not guaranteed to be fully stable over time for the same
   * audio input. Users should also not rely on it to always be provided.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   * @return The confidence.
   */
  float getConfidence();
}
