/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

@java.lang.Deprecated
public interface ReportStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ReportStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The current state of the report generation process.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the report generation process.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportStatus.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.channel.v1.ReportStatus.State getState();

  /**
   *
   *
   * <pre>
   * The report generation's start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The report generation's start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The report generation's start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The report generation's completion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The report generation's completion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The report generation's completion time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
