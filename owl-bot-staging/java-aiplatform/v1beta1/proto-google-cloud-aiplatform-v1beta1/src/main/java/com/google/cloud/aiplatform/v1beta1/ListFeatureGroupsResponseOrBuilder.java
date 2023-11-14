// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListFeatureGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListFeatureGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureGroup feature_groups = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureGroup> 
      getFeatureGroupsList();
  /**
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureGroup feature_groups = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureGroup getFeatureGroups(int index);
  /**
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureGroup feature_groups = 1;</code>
   */
  int getFeatureGroupsCount();
  /**
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureGroup feature_groups = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder> 
      getFeatureGroupsOrBuilderList();
  /**
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureGroup feature_groups = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder getFeatureGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as
   * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureGroupsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as
   * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureGroupsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
