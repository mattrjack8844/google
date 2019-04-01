// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.asset.v1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.asset.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  public com.google.cloud.asset.v1.OutputConfig.DestinationCase getDestinationCase();
}
