// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface DeleteSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.DeleteSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 1;</code>
   */
  java.lang.String getSnapshot();
  /**
   *
   *
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 1;</code>
   */
  com.google.protobuf.ByteString getSnapshotBytes();
}
