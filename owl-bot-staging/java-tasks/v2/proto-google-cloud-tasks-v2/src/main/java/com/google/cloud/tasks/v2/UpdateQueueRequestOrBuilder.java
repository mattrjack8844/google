// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/cloudtasks.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tasks.v2;

public interface UpdateQueueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.UpdateQueueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2.Queue.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2.Queue.name] cannot be changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the queue field is set.
   */
  boolean hasQueue();
  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2.Queue.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2.Queue.name] cannot be changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queue.
   */
  com.google.cloud.tasks.v2.Queue getQueue();
  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2.Queue.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2.Queue.name] cannot be changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tasks.v2.QueueOrBuilder getQueueOrBuilder();

  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
