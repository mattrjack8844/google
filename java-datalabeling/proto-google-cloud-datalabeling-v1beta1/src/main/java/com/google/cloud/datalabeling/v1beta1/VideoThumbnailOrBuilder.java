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
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface VideoThumbnailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.VideoThumbnail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A byte string of the video frame.
   * </pre>
   *
   * <code>bytes thumbnail = 1;</code>
   *
   * @return The thumbnail.
   */
  com.google.protobuf.ByteString getThumbnail();

  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();
}
