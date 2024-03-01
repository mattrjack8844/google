// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/serving_config_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ListServingConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListServingConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.ServingConfig> 
      getServingConfigsList();
  /**
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  com.google.cloud.retail.v2alpha.ServingConfig getServingConfigs(int index);
  /**
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  int getServingConfigsCount();
  /**
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ServingConfigOrBuilder> 
      getServingConfigsOrBuilderList();
  /**
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  com.google.cloud.retail.v2alpha.ServingConfigOrBuilder getServingConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token, if not returned indicates the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token, if not returned indicates the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
