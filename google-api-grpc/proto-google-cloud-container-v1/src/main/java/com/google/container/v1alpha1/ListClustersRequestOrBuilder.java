// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface ListClustersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.ListClustersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides, or "-" for all zones.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides, or "-" for all zones.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The parent (project and location) where the clusters will be listed.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent (project and location) where the clusters will be listed.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
