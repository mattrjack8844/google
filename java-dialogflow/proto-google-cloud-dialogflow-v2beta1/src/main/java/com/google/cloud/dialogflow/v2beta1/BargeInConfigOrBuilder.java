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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BargeInConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BargeInConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Duration that is not eligible for barge-in at the beginning of the input
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_barge_in_duration = 1;</code>
   *
   * @return Whether the noBargeInDuration field is set.
   */
  boolean hasNoBargeInDuration();
  /**
   *
   *
   * <pre>
   * Duration that is not eligible for barge-in at the beginning of the input
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_barge_in_duration = 1;</code>
   *
   * @return The noBargeInDuration.
   */
  com.google.protobuf.Duration getNoBargeInDuration();
  /**
   *
   *
   * <pre>
   * Duration that is not eligible for barge-in at the beginning of the input
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_barge_in_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getNoBargeInDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Total duration for the playback at the beginning of the input audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_duration = 2;</code>
   *
   * @return Whether the totalDuration field is set.
   */
  boolean hasTotalDuration();
  /**
   *
   *
   * <pre>
   * Total duration for the playback at the beginning of the input audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_duration = 2;</code>
   *
   * @return The totalDuration.
   */
  com.google.protobuf.Duration getTotalDuration();
  /**
   *
   *
   * <pre>
   * Total duration for the playback at the beginning of the input audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTotalDurationOrBuilder();
}
