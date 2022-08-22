/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

public interface CreateLiveSessionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.CreateLiveSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location in which the live session should be created,
   * in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location in which the live session should be created,
   * in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the liveSession field is set.
   */
  boolean hasLiveSession();
  /**
   *
   *
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The liveSession.
   */
  com.google.cloud.video.stitcher.v1.LiveSession getLiveSession();
  /**
   *
   *
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder getLiveSessionOrBuilder();
}
