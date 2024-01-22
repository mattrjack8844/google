// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

public interface PullMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.PullMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A data payload consumed by the worker to execute the task.
   * </pre>
   *
   * <code>bytes payload = 1;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <pre>
   * The task's tag.
   *
   * Tags allow similar tasks to be processed in a batch. If you label
   * tasks with a tag, your worker can
   * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the
   * same tag using
   * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example,
   * if you want to aggregate the events associated with a specific user once a
   * day, you could tag tasks with the user ID.
   *
   * The task's tag can only be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *
   * The tag must be less than 500 characters.
   *
   * SDK compatibility: Although the SDK allows tags to be either
   * string or
   * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
   * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * </pre>
   *
   * <code>string tag = 2;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * The task's tag.
   *
   * Tags allow similar tasks to be processed in a batch. If you label
   * tasks with a tag, your worker can
   * [lease tasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] with the
   * same tag using
   * [filter][google.cloud.tasks.v2beta2.LeaseTasksRequest.filter]. For example,
   * if you want to aggregate the events associated with a specific user once a
   * day, you could tag tasks with the user ID.
   *
   * The task's tag can only be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *
   * The tag must be less than 500 characters.
   *
   * SDK compatibility: Although the SDK allows tags to be either
   * string or
   * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
   * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * </pre>
   *
   * <code>string tag = 2;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
