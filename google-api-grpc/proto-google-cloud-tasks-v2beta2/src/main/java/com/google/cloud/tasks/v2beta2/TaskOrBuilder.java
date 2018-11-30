// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/task.proto

package com.google.cloud.tasks.v2beta2;

public interface TaskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optionally caller-specified in [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * The task name.
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the task's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *   hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optionally caller-specified in [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * The task name.
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the task's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *   hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * App Engine HTTP request that is sent to the task's target. Can
   * be set only if
   * [app_engine_http_target][google.cloud.tasks.v2beta2.Queue.app_engine_http_target] is set
   * on the queue.
   * An App Engine task is a task that has [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpRequest app_engine_http_request = 3;</code>
   */
  boolean hasAppEngineHttpRequest();
  /**
   *
   *
   * <pre>
   * App Engine HTTP request that is sent to the task's target. Can
   * be set only if
   * [app_engine_http_target][google.cloud.tasks.v2beta2.Queue.app_engine_http_target] is set
   * on the queue.
   * An App Engine task is a task that has [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpRequest app_engine_http_request = 3;</code>
   */
  com.google.cloud.tasks.v2beta2.AppEngineHttpRequest getAppEngineHttpRequest();
  /**
   *
   *
   * <pre>
   * App Engine HTTP request that is sent to the task's target. Can
   * be set only if
   * [app_engine_http_target][google.cloud.tasks.v2beta2.Queue.app_engine_http_target] is set
   * on the queue.
   * An App Engine task is a task that has [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpRequest app_engine_http_request = 3;</code>
   */
  com.google.cloud.tasks.v2beta2.AppEngineHttpRequestOrBuilder getAppEngineHttpRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] to process the task. Can be
   * set only if [pull_target][google.cloud.tasks.v2beta2.Queue.pull_target] is set on the queue.
   * A pull task is a task that has [PullMessage][google.cloud.tasks.v2beta2.PullMessage] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullMessage pull_message = 4;</code>
   */
  boolean hasPullMessage();
  /**
   *
   *
   * <pre>
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] to process the task. Can be
   * set only if [pull_target][google.cloud.tasks.v2beta2.Queue.pull_target] is set on the queue.
   * A pull task is a task that has [PullMessage][google.cloud.tasks.v2beta2.PullMessage] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullMessage pull_message = 4;</code>
   */
  com.google.cloud.tasks.v2beta2.PullMessage getPullMessage();
  /**
   *
   *
   * <pre>
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] to process the task. Can be
   * set only if [pull_target][google.cloud.tasks.v2beta2.Queue.pull_target] is set on the queue.
   * A pull task is a task that has [PullMessage][google.cloud.tasks.v2beta2.PullMessage] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullMessage pull_message = 4;</code>
   */
  com.google.cloud.tasks.v2beta2.PullMessageOrBuilder getPullMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the task is scheduled to be attempted.
   * For App Engine queues, this is when the task will be attempted or retried.
   * For pull queues, this is the time when the task is available to
   * be leased; if a task is currently leased, this is the time when
   * the current lease expires, that is, the time that the task was
   * leased plus the [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 5;</code>
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * The time when the task is scheduled to be attempted.
   * For App Engine queues, this is when the task will be attempted or retried.
   * For pull queues, this is the time when the task is available to
   * be leased; if a task is currently leased, this is the time when
   * the current lease expires, that is, the time that the task was
   * leased plus the [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 5;</code>
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * The time when the task is scheduled to be attempted.
   * For App Engine queues, this is when the task will be attempted or retried.
   * For pull queues, this is the time when the task is available to
   * be leased; if a task is currently leased, this is the time when
   * the current lease expires, that is, the time that the task was
   * leased plus the [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time that the task was created.
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time that the task was created.
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time that the task was created.
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The task status.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.TaskStatus status = 7;</code>
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. The task status.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.TaskStatus status = 7;</code>
   */
  com.google.cloud.tasks.v2beta2.TaskStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. The task status.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.TaskStatus status = 7;</code>
   */
  com.google.cloud.tasks.v2beta2.TaskStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] has
   * been returned.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View view = 8;</code>
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Output only. The view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] has
   * been returned.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View view = 8;</code>
   */
  com.google.cloud.tasks.v2beta2.Task.View getView();

  public com.google.cloud.tasks.v2beta2.Task.PayloadTypeCase getPayloadTypeCase();
}
