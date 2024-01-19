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
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

public interface SymbolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.Symbol)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return The property.
   */
  com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertex order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertex order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   *
   * @return The boundingBox.
   */
  com.google.cloud.vision.v1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertex order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>string text = 3;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>string text = 3;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Confidence of the OCR results for the symbol. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 4;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}
