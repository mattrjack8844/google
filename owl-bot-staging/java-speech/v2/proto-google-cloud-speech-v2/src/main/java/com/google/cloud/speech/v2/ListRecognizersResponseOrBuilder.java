// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

public interface ListRecognizersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.ListRecognizersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v2.Recognizer> 
      getRecognizersList();
  /**
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  com.google.cloud.speech.v2.Recognizer getRecognizers(int index);
  /**
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  int getRecognizersCount();
  /**
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.RecognizerOrBuilder> 
      getRecognizersOrBuilderList();
  /**
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizersOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
