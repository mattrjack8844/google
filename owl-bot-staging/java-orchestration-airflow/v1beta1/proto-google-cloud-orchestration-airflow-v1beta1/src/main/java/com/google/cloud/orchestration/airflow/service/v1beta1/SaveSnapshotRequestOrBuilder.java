// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface SaveSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.SaveSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the source environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   * <pre>
   * The resource name of the source environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString
      getEnvironmentBytes();

  /**
   * <pre>
   * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
   * "gs://my-bucket/snapshots".
   * </pre>
   *
   * <code>string snapshot_location = 2;</code>
   * @return The snapshotLocation.
   */
  java.lang.String getSnapshotLocation();
  /**
   * <pre>
   * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
   * "gs://my-bucket/snapshots".
   * </pre>
   *
   * <code>string snapshot_location = 2;</code>
   * @return The bytes for snapshotLocation.
   */
  com.google.protobuf.ByteString
      getSnapshotLocationBytes();
}
