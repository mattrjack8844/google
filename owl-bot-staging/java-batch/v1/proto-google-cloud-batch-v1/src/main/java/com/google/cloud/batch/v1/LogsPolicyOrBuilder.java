// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/job.proto

package com.google.cloud.batch.v1;

public interface LogsPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.LogsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LogsPolicy.Destination destination = 1;</code>
   * @return The enum numeric value on the wire for destination.
   */
  int getDestinationValue();
  /**
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LogsPolicy.Destination destination = 1;</code>
   * @return The destination.
   */
  com.google.cloud.batch.v1.LogsPolicy.Destination getDestination();

  /**
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   * @return The logsPath.
   */
  java.lang.String getLogsPath();
  /**
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   * @return The bytes for logsPath.
   */
  com.google.protobuf.ByteString
      getLogsPathBytes();
}
