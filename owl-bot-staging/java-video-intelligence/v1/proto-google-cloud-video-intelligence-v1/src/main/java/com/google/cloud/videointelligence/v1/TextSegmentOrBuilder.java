// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.videointelligence.v1;

public interface TextSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.TextSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video segment where a text snippet was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   * <pre>
   * Video segment where a text snippet was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   * @return The segment.
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegment();
  /**
   * <pre>
   * Video segment where a text snippet was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   * <pre>
   * Confidence for the track of detected text. It is calculated as the highest
   * over all frames where OCR detected text appears.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextFrame frames = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.TextFrame> 
      getFramesList();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1.TextFrame getFrames(int index);
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextFrame frames = 3;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextFrame frames = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TextFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1.TextFrameOrBuilder getFramesOrBuilder(
      int index);
}
