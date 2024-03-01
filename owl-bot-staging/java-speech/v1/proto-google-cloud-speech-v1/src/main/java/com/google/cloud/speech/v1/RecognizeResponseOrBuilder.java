// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1;

public interface RecognizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.RecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1.SpeechRecognitionResult> 
      getResultsList();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionResult getResults(int index);
  /**
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   * @return Whether the totalBilledTime field is set.
   */
  boolean hasTotalBilledTime();
  /**
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   * @return The totalBilledTime.
   */
  com.google.protobuf.Duration getTotalBilledTime();
  /**
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTotalBilledTimeOrBuilder();

  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 7;</code>
   * @return Whether the speechAdaptationInfo field is set.
   */
  boolean hasSpeechAdaptationInfo();
  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 7;</code>
   * @return The speechAdaptationInfo.
   */
  com.google.cloud.speech.v1.SpeechAdaptationInfo getSpeechAdaptationInfo();
  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 7;</code>
   */
  com.google.cloud.speech.v1.SpeechAdaptationInfoOrBuilder getSpeechAdaptationInfoOrBuilder();

  /**
   * <pre>
   * The ID associated with the request. This is a unique ID specific only to
   * the given request.
   * </pre>
   *
   * <code>int64 request_id = 8;</code>
   * @return The requestId.
   */
  long getRequestId();
}
