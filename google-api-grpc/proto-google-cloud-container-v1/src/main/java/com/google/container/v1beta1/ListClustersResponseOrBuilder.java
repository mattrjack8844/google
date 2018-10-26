// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface ListClustersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListClustersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of clusters in the project in the specified zone, or
   * across all ones.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Cluster clusters = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.Cluster> 
      getClustersList();
  /**
   * <pre>
   * A list of clusters in the project in the specified zone, or
   * across all ones.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Cluster clusters = 1;</code>
   */
  com.google.container.v1beta1.Cluster getClusters(int index);
  /**
   * <pre>
   * A list of clusters in the project in the specified zone, or
   * across all ones.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Cluster clusters = 1;</code>
   */
  int getClustersCount();
  /**
   * <pre>
   * A list of clusters in the project in the specified zone, or
   * across all ones.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Cluster clusters = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.ClusterOrBuilder> 
      getClustersOrBuilderList();
  /**
   * <pre>
   * A list of clusters in the project in the specified zone, or
   * across all ones.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Cluster clusters = 1;</code>
   */
  com.google.container.v1beta1.ClusterOrBuilder getClustersOrBuilder(
      int index);

  /**
   * <pre>
   * If any zones are listed here, the list of clusters returned
   * may be missing those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  java.util.List<java.lang.String>
      getMissingZonesList();
  /**
   * <pre>
   * If any zones are listed here, the list of clusters returned
   * may be missing those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  int getMissingZonesCount();
  /**
   * <pre>
   * If any zones are listed here, the list of clusters returned
   * may be missing those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  java.lang.String getMissingZones(int index);
  /**
   * <pre>
   * If any zones are listed here, the list of clusters returned
   * may be missing those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  com.google.protobuf.ByteString
      getMissingZonesBytes(int index);
}
