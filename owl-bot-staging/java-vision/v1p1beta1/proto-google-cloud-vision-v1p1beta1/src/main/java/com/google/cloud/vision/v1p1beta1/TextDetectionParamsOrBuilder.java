// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p1beta1;

public interface TextDetectionParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.TextDetectionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * By default, Cloud Vision API only includes confidence score for
   * DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence
   * score for TEXT_DETECTION as well.
   * </pre>
   *
   * <code>bool enable_text_detection_confidence_score = 9;</code>
   * @return The enableTextDetectionConfidenceScore.
   */
  boolean getEnableTextDetectionConfidenceScore();

  /**
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   * @return A list containing the advancedOcrOptions.
   */
  java.util.List<java.lang.String>
      getAdvancedOcrOptionsList();
  /**
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   * @return The count of advancedOcrOptions.
   */
  int getAdvancedOcrOptionsCount();
  /**
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   * @param index The index of the element to return.
   * @return The advancedOcrOptions at the given index.
   */
  java.lang.String getAdvancedOcrOptions(int index);
  /**
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the advancedOcrOptions at the given index.
   */
  com.google.protobuf.ByteString
      getAdvancedOcrOptionsBytes(int index);
}
