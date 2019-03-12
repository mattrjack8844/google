// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface TextAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.TextAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextSegment segments = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.TextSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.TextSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextSegment segments = 2;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextSegment segments = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TextSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.TextSegmentOrBuilder getSegmentsOrBuilder(int index);
}
