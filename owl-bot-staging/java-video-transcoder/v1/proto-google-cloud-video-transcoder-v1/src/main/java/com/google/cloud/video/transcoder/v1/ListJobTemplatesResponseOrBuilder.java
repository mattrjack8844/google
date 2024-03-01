// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/services.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.transcoder.v1;

public interface ListJobTemplatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.ListJobTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.JobTemplate job_templates = 1;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1.JobTemplate> 
      getJobTemplatesList();
  /**
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.JobTemplate job_templates = 1;</code>
   */
  com.google.cloud.video.transcoder.v1.JobTemplate getJobTemplates(int index);
  /**
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.JobTemplate job_templates = 1;</code>
   */
  int getJobTemplatesCount();
  /**
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.JobTemplate job_templates = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1.JobTemplateOrBuilder> 
      getJobTemplatesOrBuilderList();
  /**
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.JobTemplate job_templates = 1;</code>
   */
  com.google.cloud.video.transcoder.v1.JobTemplateOrBuilder getJobTemplatesOrBuilder(
      int index);

  /**
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * List of regions that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * List of regions that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * List of regions that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * List of regions that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
