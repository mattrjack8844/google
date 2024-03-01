// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1;

public interface SearchBlueprintRevisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.SearchBlueprintRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1.Blueprint> 
      getBlueprintsList();
  /**
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.Blueprint getBlueprints(int index);
  /**
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  int getBlueprintsCount();
  /**
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1.BlueprintOrBuilder> 
      getBlueprintsOrBuilderList();
  /**
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.BlueprintOrBuilder getBlueprintsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
