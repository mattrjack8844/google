// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

public interface ListTargetProjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ListTargetProjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The list of target response.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.TargetProject target_projects = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.vmmigration.v1.TargetProject> 
      getTargetProjectsList();
  /**
   * <pre>
   * Output only. The list of target response.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.TargetProject target_projects = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.vmmigration.v1.TargetProject getTargetProjects(int index);
  /**
   * <pre>
   * Output only. The list of target response.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.TargetProject target_projects = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTargetProjectsCount();
  /**
   * <pre>
   * Output only. The list of target response.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.TargetProject target_projects = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.vmmigration.v1.TargetProjectOrBuilder> 
      getTargetProjectsOrBuilderList();
  /**
   * <pre>
   * Output only. The list of target response.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.TargetProject target_projects = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.vmmigration.v1.TargetProjectOrBuilder getTargetProjectsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. A token, which can be sent as `page_token` to retrieve the
   * next page. If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Output only. A token, which can be sent as `page_token` to retrieve the
   * next page. If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
