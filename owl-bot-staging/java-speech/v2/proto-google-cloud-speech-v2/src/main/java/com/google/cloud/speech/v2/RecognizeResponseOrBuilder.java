// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

public interface RecognizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.RecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sequential list of transcription results corresponding to sequential
   * portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionResult results = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v2.SpeechRecognitionResult> 
      getResultsList();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to sequential
   * portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionResult results = 3;</code>
   */
  com.google.cloud.speech.v2.SpeechRecognitionResult getResults(int index);
  /**
   * <pre>
   * Sequential list of transcription results corresponding to sequential
   * portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionResult results = 3;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to sequential
   * portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionResult results = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.SpeechRecognitionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Sequential list of transcription results corresponding to sequential
   * portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionResult results = 3;</code>
   */
  com.google.cloud.speech.v2.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Metadata about the recognition.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionResponseMetadata metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata about the recognition.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionResponseMetadata metadata = 2;</code>
   * @return The metadata.
   */
  com.google.cloud.speech.v2.RecognitionResponseMetadata getMetadata();
  /**
   * <pre>
   * Metadata about the recognition.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionResponseMetadata metadata = 2;</code>
   */
  com.google.cloud.speech.v2.RecognitionResponseMetadataOrBuilder getMetadataOrBuilder();
}
