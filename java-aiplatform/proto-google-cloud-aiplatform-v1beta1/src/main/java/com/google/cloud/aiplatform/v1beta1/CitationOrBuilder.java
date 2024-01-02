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
// source: google/cloud/aiplatform/v1beta1/content.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CitationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Citation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Start index into the content.
   * </pre>
   *
   * <code>int32 start_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The startIndex.
   */
  int getStartIndex();

  /**
   *
   *
   * <pre>
   * Output only. End index into the content.
   * </pre>
   *
   * <code>int32 end_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endIndex.
   */
  int getEndIndex();

  /**
   *
   *
   * <pre>
   * Output only. Url reference of the attribution.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Output only. Url reference of the attribution.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Title of the attribution.
   * </pre>
   *
   * <code>string title = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Output only. Title of the attribution.
   * </pre>
   *
   * <code>string title = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Output only. License of the attribution.
   * </pre>
   *
   * <code>string license = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   *
   *
   * <pre>
   * Output only. License of the attribution.
   * </pre>
   *
   * <code>string license = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString getLicenseBytes();

  /**
   *
   *
   * <pre>
   * Output only. Publication date of the attribution.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the publicationDate field is set.
   */
  boolean hasPublicationDate();
  /**
   *
   *
   * <pre>
   * Output only. Publication date of the attribution.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The publicationDate.
   */
  com.google.type.Date getPublicationDate();
  /**
   *
   *
   * <pre>
   * Output only. Publication date of the attribution.
   * </pre>
   *
   * <code>.google.type.Date publication_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.type.DateOrBuilder getPublicationDateOrBuilder();
}
