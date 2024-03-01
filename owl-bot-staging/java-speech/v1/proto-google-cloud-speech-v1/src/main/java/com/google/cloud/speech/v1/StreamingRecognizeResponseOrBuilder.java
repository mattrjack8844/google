// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1;

public interface StreamingRecognizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1.StreamingRecognitionResult> 
      getResultsList();
  /**
   * <pre>
   * This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResult getResults(int index);
  /**
   * <pre>
   * This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates the type of speech event.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;</code>
   * @return The enum numeric value on the wire for speechEventType.
   */
  int getSpeechEventTypeValue();
  /**
   * <pre>
   * Indicates the type of speech event.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;</code>
   * @return The speechEventType.
   */
  com.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType getSpeechEventType();

  /**
   * <pre>
   * Time offset between the beginning of the audio and event emission.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_event_time = 8;</code>
   * @return Whether the speechEventTime field is set.
   */
  boolean hasSpeechEventTime();
  /**
   * <pre>
   * Time offset between the beginning of the audio and event emission.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_event_time = 8;</code>
   * @return The speechEventTime.
   */
  com.google.protobuf.Duration getSpeechEventTime();
  /**
   * <pre>
   * Time offset between the beginning of the audio and event emission.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_event_time = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getSpeechEventTimeOrBuilder();

  /**
   * <pre>
   * When available, billed audio seconds for the stream.
   * Set only if this is the last response in the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 5;</code>
   * @return Whether the totalBilledTime field is set.
   */
  boolean hasTotalBilledTime();
  /**
   * <pre>
   * When available, billed audio seconds for the stream.
   * Set only if this is the last response in the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 5;</code>
   * @return The totalBilledTime.
   */
  com.google.protobuf.Duration getTotalBilledTime();
  /**
   * <pre>
   * When available, billed audio seconds for the stream.
   * Set only if this is the last response in the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getTotalBilledTimeOrBuilder();

  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 9;</code>
   * @return Whether the speechAdaptationInfo field is set.
   */
  boolean hasSpeechAdaptationInfo();
  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 9;</code>
   * @return The speechAdaptationInfo.
   */
  com.google.cloud.speech.v1.SpeechAdaptationInfo getSpeechAdaptationInfo();
  /**
   * <pre>
   * Provides information on adaptation behavior in response
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptationInfo speech_adaptation_info = 9;</code>
   */
  com.google.cloud.speech.v1.SpeechAdaptationInfoOrBuilder getSpeechAdaptationInfoOrBuilder();

  /**
   * <pre>
   * The ID associated with the request. This is a unique ID specific only to
   * the given request.
   * </pre>
   *
   * <code>int64 request_id = 10;</code>
   * @return The requestId.
   */
  long getRequestId();
}
