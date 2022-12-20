// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AttachedServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AttachedServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the config.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the config.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * List of valid platform versions.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo valid_versions = 2;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo> 
      getValidVersionsList();
  /**
   * <pre>
   * List of valid platform versions.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo getValidVersions(int index);
  /**
   * <pre>
   * List of valid platform versions.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo valid_versions = 2;</code>
   */
  int getValidVersionsCount();
  /**
   * <pre>
   * List of valid platform versions.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo valid_versions = 2;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfoOrBuilder> 
      getValidVersionsOrBuilderList();
  /**
   * <pre>
   * List of valid platform versions.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfoOrBuilder getValidVersionsOrBuilder(
      int index);
}
