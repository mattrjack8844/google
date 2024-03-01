// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.settings.v1beta1;

public interface BatchCalculateEffectiveSettingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.BatchCalculateEffectiveSettingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings> 
      getSettingsList();
  /**
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings getSettings(int index);
  /**
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  int getSettingsCount();
  /**
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder> 
      getSettingsOrBuilderList();
  /**
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder getSettingsOrBuilder(
      int index);
}
