// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface ListDeviceConfigVersionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ListDeviceConfigVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  java.util.List<com.google.cloud.iot.v1.DeviceConfig> 
      getDeviceConfigsList();
  /**
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceConfig getDeviceConfigs(int index);
  /**
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  int getDeviceConfigsCount();
  /**
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.iot.v1.DeviceConfigOrBuilder> 
      getDeviceConfigsOrBuilderList();
  /**
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceConfigOrBuilder getDeviceConfigsOrBuilder(
      int index);
}
