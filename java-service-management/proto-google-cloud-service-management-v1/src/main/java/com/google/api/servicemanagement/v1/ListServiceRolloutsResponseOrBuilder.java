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
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServiceRolloutsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.Rollout> getRolloutsList();
  /**
   *
   *
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  com.google.api.servicemanagement.v1.Rollout getRollouts(int index);
  /**
   *
   *
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  int getRolloutsCount();
  /**
   *
   *
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.RolloutOrBuilder>
      getRolloutsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token of the next page of results.
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
   * The token of the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
