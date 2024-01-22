// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

public interface SearchBlueprintRevisionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.SearchBlueprintRevisionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of parent orchestration cluster resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of parent orchestration cluster resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Supported queries:
   * 1. ""                       : Lists all revisions across all blueprints.
   * 2. "latest=true"            : Lists latest revisions across all blueprints.
   * 3. "name={name}"            : Lists all revisions of blueprint with name
   * {name}.
   * 4. "name={name} latest=true": Lists latest revision of blueprint with name
   * {name}
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. Supported queries:
   * 1. ""                       : Lists all revisions across all blueprints.
   * 2. "latest=true"            : Lists latest revisions across all blueprints.
   * 3. "name={name}"            : Lists all revisions of blueprint with name
   * {name}.
   * 4. "name={name} latest=true": Lists latest revision of blueprint with name
   * {name}
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Optional. The maximum number of blueprints revisions to return per page.
   * max page size = 100, default page size = 20.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The page token, received from a previous search call.
   * It can be provided to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The page token, received from a previous search call.
   * It can be provided to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
