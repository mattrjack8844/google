// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.stitcher.v1;

public interface GetLiveConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.GetLiveConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the live config to be retrieved, in the form
   * of
   * `projects/{project_number}/locations/{location}/liveConfigs/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the live config to be retrieved, in the form
   * of
   * `projects/{project_number}/locations/{location}/liveConfigs/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
