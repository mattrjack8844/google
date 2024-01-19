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
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface ImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Image content, represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateImages requests. It does
   * not work for AsyncBatchAnnotateImages requests.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImageSource source = 2;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImageSource source = 2;</code>
   *
   * @return The source.
   */
  com.google.cloud.vision.v1.ImageSource getSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImageSource source = 2;</code>
   */
  com.google.cloud.vision.v1.ImageSourceOrBuilder getSourceOrBuilder();
}
