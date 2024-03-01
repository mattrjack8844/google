// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1;

public interface ListPublicBlueprintsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.ListPublicBlueprintsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of public blueprints to return.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.PublicBlueprint public_blueprints = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1.PublicBlueprint> 
      getPublicBlueprintsList();
  /**
   * <pre>
   * The list of public blueprints to return.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.PublicBlueprint public_blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.PublicBlueprint getPublicBlueprints(int index);
  /**
   * <pre>
   * The list of public blueprints to return.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.PublicBlueprint public_blueprints = 1;</code>
   */
  int getPublicBlueprintsCount();
  /**
   * <pre>
   * The list of public blueprints to return.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.PublicBlueprint public_blueprints = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1.PublicBlueprintOrBuilder> 
      getPublicBlueprintsOrBuilderList();
  /**
   * <pre>
   * The list of public blueprints to return.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.PublicBlueprint public_blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.PublicBlueprintOrBuilder getPublicBlueprintsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. A token identifying a page of results the server should
   * return.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Output only. A token identifying a page of results the server should
   * return.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
