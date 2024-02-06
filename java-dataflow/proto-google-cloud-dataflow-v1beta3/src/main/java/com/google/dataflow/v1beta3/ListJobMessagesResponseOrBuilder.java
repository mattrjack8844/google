/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/messages.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface ListJobMessagesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ListJobMessagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Messages in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.JobMessage job_messages = 1;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.JobMessage> getJobMessagesList();
  /**
   *
   *
   * <pre>
   * Messages in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.JobMessage job_messages = 1;</code>
   */
  com.google.dataflow.v1beta3.JobMessage getJobMessages(int index);
  /**
   *
   *
   * <pre>
   * Messages in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.JobMessage job_messages = 1;</code>
   */
  int getJobMessagesCount();
  /**
   *
   *
   * <pre>
   * Messages in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.JobMessage job_messages = 1;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.JobMessageOrBuilder>
      getJobMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Messages in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.JobMessage job_messages = 1;</code>
   */
  com.google.dataflow.v1beta3.JobMessageOrBuilder getJobMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token to obtain the next page of results if there are more.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The token to obtain the next page of results if there are more.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Autoscaling events in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.AutoscalingEvent autoscaling_events = 3;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.AutoscalingEvent> getAutoscalingEventsList();
  /**
   *
   *
   * <pre>
   * Autoscaling events in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.AutoscalingEvent autoscaling_events = 3;</code>
   */
  com.google.dataflow.v1beta3.AutoscalingEvent getAutoscalingEvents(int index);
  /**
   *
   *
   * <pre>
   * Autoscaling events in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.AutoscalingEvent autoscaling_events = 3;</code>
   */
  int getAutoscalingEventsCount();
  /**
   *
   *
   * <pre>
   * Autoscaling events in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.AutoscalingEvent autoscaling_events = 3;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.AutoscalingEventOrBuilder>
      getAutoscalingEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Autoscaling events in ascending timestamp order.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.AutoscalingEvent autoscaling_events = 3;</code>
   */
  com.google.dataflow.v1beta3.AutoscalingEventOrBuilder getAutoscalingEventsOrBuilder(int index);
}
