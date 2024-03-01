// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.stitcher.v1;

public interface CreateVodSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.CreateVodSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location in which the VOD session should be
   * created, in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location in which the VOD session should be
   * created, in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Parameters for creating a session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSession vod_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the vodSession field is set.
   */
  boolean hasVodSession();
  /**
   * <pre>
   * Required. Parameters for creating a session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSession vod_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vodSession.
   */
  com.google.cloud.video.stitcher.v1.VodSession getVodSession();
  /**
   * <pre>
   * Required. Parameters for creating a session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSession vod_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.stitcher.v1.VodSessionOrBuilder getVodSessionOrBuilder();
}
