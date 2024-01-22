// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/live_configs.proto

package com.google.cloud.video.stitcher.v1;

public interface GamLiveConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.GamLiveConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Ad Manager network code to associate with the live config.
   * </pre>
   *
   * <code>string network_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The networkCode.
   */
  java.lang.String getNetworkCode();
  /**
   * <pre>
   * Required. Ad Manager network code to associate with the live config.
   * </pre>
   *
   * <code>string network_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for networkCode.
   */
  com.google.protobuf.ByteString
      getNetworkCodeBytes();

  /**
   * <pre>
   * Output only. The asset key identifier generated for the live config.
   * </pre>
   *
   * <code>string asset_key = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetKey.
   */
  java.lang.String getAssetKey();
  /**
   * <pre>
   * Output only. The asset key identifier generated for the live config.
   * </pre>
   *
   * <code>string asset_key = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for assetKey.
   */
  com.google.protobuf.ByteString
      getAssetKeyBytes();

  /**
   * <pre>
   * Output only. The custom asset key identifier generated for the live config.
   * </pre>
   *
   * <code>string custom_asset_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The customAssetKey.
   */
  java.lang.String getCustomAssetKey();
  /**
   * <pre>
   * Output only. The custom asset key identifier generated for the live config.
   * </pre>
   *
   * <code>string custom_asset_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for customAssetKey.
   */
  com.google.protobuf.ByteString
      getCustomAssetKeyBytes();
}
