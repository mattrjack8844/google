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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface AnnotateFileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.AnnotateFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.InputConfig input_config = 1;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.InputConfig input_config = 1;</code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.vision.v1p4beta1.InputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.InputConfig input_config = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Feature features = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.Feature> getFeaturesList();
  /**
   *
   *
   * <pre>
   * Required. Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p4beta1.Feature getFeatures(int index);
  /**
   *
   *
   * <pre>
   * Required. Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Feature features = 2;</code>
   */
  int getFeaturesCount();
  /**
   *
   *
   * <pre>
   * Required. Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Feature features = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.FeatureOrBuilder>
      getFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p4beta1.FeatureOrBuilder getFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image(s) in the file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImageContext image_context = 3;</code>
   *
   * @return Whether the imageContext field is set.
   */
  boolean hasImageContext();
  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image(s) in the file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImageContext image_context = 3;</code>
   *
   * @return The imageContext.
   */
  com.google.cloud.vision.v1p4beta1.ImageContext getImageContext();
  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image(s) in the file.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImageContext image_context = 3;</code>
   */
  com.google.cloud.vision.v1p4beta1.ImageContextOrBuilder getImageContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Pages of the file to perform image annotation.
   *
   * Pages starts from 1, we assume the first page of the file is page 1.
   * At most 5 pages are supported per request. Pages can be negative.
   *
   * Page 1 means the first page.
   * Page 2 means the second page.
   * Page -1 means the last page.
   * Page -2 means the second to the last page.
   *
   * If the file is GIF instead of PDF or TIFF, page refers to GIF frames.
   *
   * If this field is empty, by default the service performs image annotation
   * for the first 5 pages of the file.
   * </pre>
   *
   * <code>repeated int32 pages = 4;</code>
   *
   * @return A list containing the pages.
   */
  java.util.List<java.lang.Integer> getPagesList();
  /**
   *
   *
   * <pre>
   * Pages of the file to perform image annotation.
   *
   * Pages starts from 1, we assume the first page of the file is page 1.
   * At most 5 pages are supported per request. Pages can be negative.
   *
   * Page 1 means the first page.
   * Page 2 means the second page.
   * Page -1 means the last page.
   * Page -2 means the second to the last page.
   *
   * If the file is GIF instead of PDF or TIFF, page refers to GIF frames.
   *
   * If this field is empty, by default the service performs image annotation
   * for the first 5 pages of the file.
   * </pre>
   *
   * <code>repeated int32 pages = 4;</code>
   *
   * @return The count of pages.
   */
  int getPagesCount();
  /**
   *
   *
   * <pre>
   * Pages of the file to perform image annotation.
   *
   * Pages starts from 1, we assume the first page of the file is page 1.
   * At most 5 pages are supported per request. Pages can be negative.
   *
   * Page 1 means the first page.
   * Page 2 means the second page.
   * Page -1 means the last page.
   * Page -2 means the second to the last page.
   *
   * If the file is GIF instead of PDF or TIFF, page refers to GIF frames.
   *
   * If this field is empty, by default the service performs image annotation
   * for the first 5 pages of the file.
   * </pre>
   *
   * <code>repeated int32 pages = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The pages at the given index.
   */
  int getPages(int index);
}
