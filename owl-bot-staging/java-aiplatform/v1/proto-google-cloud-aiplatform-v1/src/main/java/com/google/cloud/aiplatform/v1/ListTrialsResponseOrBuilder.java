// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/vizier_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ListTrialsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListTrialsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Trial> 
      getTrialsList();
  /**
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Trial getTrials(int index);
  /**
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  int getTrialsCount();
  /**
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TrialOrBuilder> 
      getTrialsOrBuilderList();
  /**
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TrialOrBuilder getTrialsOrBuilder(
      int index);

  /**
   * <pre>
   * Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
