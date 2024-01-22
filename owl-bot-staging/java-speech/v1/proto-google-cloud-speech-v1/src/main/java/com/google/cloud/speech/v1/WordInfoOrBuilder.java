// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface WordInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.WordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Duration getStartTime();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   * @return The endTime.
   */
  com.google.protobuf.Duration getEndTime();
  /**
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The word.
   */
  java.lang.String getWord();
  /**
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The bytes for word.
   */
  com.google.protobuf.ByteString
      getWordBytes();

  /**
   * <pre>
   * The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is set only for the top alternative of a non-streaming
   * result or, of a streaming result where `is_final=true`.
   * This field is not guaranteed to be accurate and users should not rely on it
   * to be always provided.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * Output only. A distinct integer value is assigned for every speaker within
   * the audio. This field specifies which one of those speakers was detected to
   * have spoken this word. Value ranges from '1' to diarization_speaker_count.
   * speaker_tag is set if enable_speaker_diarization = 'true' and only for the
   * top alternative.
   * Note: Use speaker_label instead.
   * </pre>
   *
   * <code>int32 speaker_tag = 5 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.cloud.speech.v1.WordInfo.speaker_tag is deprecated.
   *     See google/cloud/speech/v1/cloud_speech.proto;l=974
   * @return The speakerTag.
   */
  @java.lang.Deprecated int getSpeakerTag();

  /**
   * <pre>
   * Output only. A label value assigned for every unique speaker within the
   * audio. This field specifies which speaker was detected to have spoken this
   * word. For some models, like medical_conversation this can be actual speaker
   * role, for example "patient" or "provider", but generally this would be a
   * number identifying a speaker. This field is only set if
   * enable_speaker_diarization = 'true' and only for the top alternative.
   * </pre>
   *
   * <code>string speaker_label = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The speakerLabel.
   */
  java.lang.String getSpeakerLabel();
  /**
   * <pre>
   * Output only. A label value assigned for every unique speaker within the
   * audio. This field specifies which speaker was detected to have spoken this
   * word. For some models, like medical_conversation this can be actual speaker
   * role, for example "patient" or "provider", but generally this would be a
   * number identifying a speaker. This field is only set if
   * enable_speaker_diarization = 'true' and only for the top alternative.
   * </pre>
   *
   * <code>string speaker_label = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for speakerLabel.
   */
  com.google.protobuf.ByteString
      getSpeakerLabelBytes();
}
