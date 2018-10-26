// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface GetServerConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GetServerConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) to return operations for.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) to return operations for.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The name (project and location) of the server config to get
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project and location) of the server config to get
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
