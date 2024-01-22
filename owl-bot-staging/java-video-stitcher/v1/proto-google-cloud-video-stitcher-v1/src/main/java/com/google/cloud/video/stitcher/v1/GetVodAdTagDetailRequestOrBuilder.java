// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

public interface GetVodAdTagDetailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.GetVodAdTagDetailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the ad tag detail for the specified VOD session, in
   * the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{vod_ad_tag_detail}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the ad tag detail for the specified VOD session, in
   * the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{vod_ad_tag_detail}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
