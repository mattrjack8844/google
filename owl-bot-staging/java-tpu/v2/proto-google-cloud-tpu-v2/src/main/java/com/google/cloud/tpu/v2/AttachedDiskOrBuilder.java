// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tpu.v2;

public interface AttachedDiskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.AttachedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString
      getSourceDiskBytes();

  /**
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   * @return The mode.
   */
  com.google.cloud.tpu.v2.AttachedDisk.DiskMode getMode();
}
