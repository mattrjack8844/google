// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1p1beta1;

public interface LongRunningRecognizeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The config.
   */
  com.google.cloud.speech.v1p1beta1.RecognitionConfig getConfig();
  /**
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audio.
   */
  com.google.cloud.speech.v1p1beta1.RecognitionAudio getAudio();
  /**
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder getAudioOrBuilder();

  /**
   * <pre>
   * Optional. Specifies an optional destination for the recognition results.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Optional. Specifies an optional destination for the recognition results.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The outputConfig.
   */
  com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig getOutputConfig();
  /**
   * <pre>
   * Optional. Specifies an optional destination for the recognition results.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.speech.v1p1beta1.TranscriptOutputConfigOrBuilder getOutputConfigOrBuilder();
}
