// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

public interface ListDescendantSecurityHealthAnalyticsCustomModulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.ListDescendantSecurityHealthAnalyticsCustomModulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;</code>
   */
  java.util.List<com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule> 
      getSecurityHealthAnalyticsCustomModulesList();
  /**
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;</code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModules(int index);
  /**
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;</code>
   */
  int getSecurityHealthAnalyticsCustomModulesCount();
  /**
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModuleOrBuilder> 
      getSecurityHealthAnalyticsCustomModulesOrBuilderList();
  /**
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;</code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModuleOrBuilder getSecurityHealthAnalyticsCustomModulesOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
