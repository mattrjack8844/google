// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.videointelligence.v1;

public interface FaceSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.FaceSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   * @return The segment.
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegment();
  /**
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder();
}
