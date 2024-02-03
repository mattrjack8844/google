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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

public interface ListCustomClassesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.ListCustomClassesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v2.CustomClass> getCustomClassesList();
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  com.google.cloud.speech.v2.CustomClass getCustomClasses(int index);
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  int getCustomClassesCount();
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.CustomClassOrBuilder>
      getCustomClassesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
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
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
