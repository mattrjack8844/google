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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface ExplicitContentFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.ExplicitContentFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Likelihood pornography_likelihood = 2;</code>
   *
   * @return The enum numeric value on the wire for pornographyLikelihood.
   */
  int getPornographyLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Likelihood pornography_likelihood = 2;</code>
   *
   * @return The pornographyLikelihood.
   */
  com.google.cloud.videointelligence.v1p3beta1.Likelihood getPornographyLikelihood();
}
