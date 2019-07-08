// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/event.proto

package com.google.cloud.talent.v4beta1;

public interface ClientEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ClientEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional but highly recommended.
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4beta1.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional but highly recommended.
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4beta1.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2;</code>
   */
  java.lang.String getEventId();
  /**
   *
   *
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2;</code>
   */
  com.google.protobuf.ByteString getEventIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   */
  boolean hasJobEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   */
  com.google.cloud.talent.v4beta1.JobEvent getJobEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   */
  com.google.cloud.talent.v4beta1.JobEventOrBuilder getJobEventOrBuilder();

  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   */
  boolean hasProfileEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileEvent getProfileEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileEventOrBuilder getProfileEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Notes about the event provided by recruiters or other users, for
   * example, feedback on why a profile was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   */
  java.lang.String getEventNotes();
  /**
   *
   *
   * <pre>
   * Optional. Notes about the event provided by recruiters or other users, for
   * example, feedback on why a profile was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   */
  com.google.protobuf.ByteString getEventNotesBytes();

  public com.google.cloud.talent.v4beta1.ClientEvent.EventCase getEventCase();
}
