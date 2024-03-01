// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.talent.v4;

public interface ClientEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.ClientEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Strongly recommended for the best service experience.
   *
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   *
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The eventId.
   */
  java.lang.String getEventId();
  /**
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for eventId.
   */
  com.google.protobuf.ByteString
      getEventIdBytes();

  /**
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.JobEvent job_event = 5;</code>
   * @return Whether the jobEvent field is set.
   */
  boolean hasJobEvent();
  /**
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.JobEvent job_event = 5;</code>
   * @return The jobEvent.
   */
  com.google.cloud.talent.v4.JobEvent getJobEvent();
  /**
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.JobEvent job_event = 5;</code>
   */
  com.google.cloud.talent.v4.JobEventOrBuilder getJobEventOrBuilder();

  /**
   * <pre>
   * Notes about the event provided by recruiters or other users, for example,
   * feedback on why a job was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   * @return The eventNotes.
   */
  java.lang.String getEventNotes();
  /**
   * <pre>
   * Notes about the event provided by recruiters or other users, for example,
   * feedback on why a job was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   * @return The bytes for eventNotes.
   */
  com.google.protobuf.ByteString
      getEventNotesBytes();

  com.google.cloud.talent.v4.ClientEvent.EventCase getEventCase();
}
