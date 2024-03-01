// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface ListPostureTemplatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.ListPostureTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of PostureTemplate.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PostureTemplate posture_templates = 1;</code>
   */
  java.util.List<com.google.cloud.securityposture.v1.PostureTemplate> 
      getPostureTemplatesList();
  /**
   * <pre>
   * The list of PostureTemplate.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PostureTemplate posture_templates = 1;</code>
   */
  com.google.cloud.securityposture.v1.PostureTemplate getPostureTemplates(int index);
  /**
   * <pre>
   * The list of PostureTemplate.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PostureTemplate posture_templates = 1;</code>
   */
  int getPostureTemplatesCount();
  /**
   * <pre>
   * The list of PostureTemplate.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PostureTemplate posture_templates = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securityposture.v1.PostureTemplateOrBuilder> 
      getPostureTemplatesOrBuilderList();
  /**
   * <pre>
   * The list of PostureTemplate.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PostureTemplate posture_templates = 1;</code>
   */
  com.google.cloud.securityposture.v1.PostureTemplateOrBuilder getPostureTemplatesOrBuilder(
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
