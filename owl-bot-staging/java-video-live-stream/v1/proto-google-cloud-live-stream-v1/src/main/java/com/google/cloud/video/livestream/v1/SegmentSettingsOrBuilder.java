// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/outputs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public interface SegmentSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.SegmentSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Duration of the segments in seconds. The default is `6s`. Note that
   * `segmentDuration` must be greater than or equal to
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration],
   * and `segmentDuration` must be divisible by
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration].
   * Valid range is [2s, 20s].
   *
   * All [mux_streams][google.cloud.video.livestream.v1.Manifest.mux_streams] in
   * the same manifest must have the same segment duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   * @return Whether the segmentDuration field is set.
   */
  boolean hasSegmentDuration();
  /**
   * <pre>
   * Duration of the segments in seconds. The default is `6s`. Note that
   * `segmentDuration` must be greater than or equal to
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration],
   * and `segmentDuration` must be divisible by
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration].
   * Valid range is [2s, 20s].
   *
   * All [mux_streams][google.cloud.video.livestream.v1.Manifest.mux_streams] in
   * the same manifest must have the same segment duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   * @return The segmentDuration.
   */
  com.google.protobuf.Duration getSegmentDuration();
  /**
   * <pre>
   * Duration of the segments in seconds. The default is `6s`. Note that
   * `segmentDuration` must be greater than or equal to
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration],
   * and `segmentDuration` must be divisible by
   * [gop_duration][google.cloud.video.livestream.v1.VideoStream.H264CodecSettings.gop_duration].
   * Valid range is [2s, 20s].
   *
   * All [mux_streams][google.cloud.video.livestream.v1.Manifest.mux_streams] in
   * the same manifest must have the same segment duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getSegmentDurationOrBuilder();
}
