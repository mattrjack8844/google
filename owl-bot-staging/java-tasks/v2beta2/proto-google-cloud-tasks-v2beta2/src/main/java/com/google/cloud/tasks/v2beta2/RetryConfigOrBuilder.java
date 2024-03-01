// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/queue.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tasks.v2beta2;

public interface RetryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.RetryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The maximum number of attempts for a task.
   *
   * Cloud Tasks will attempt the task `max_attempts` times (that
   * is, if the first attempt fails, then there will be
   * `max_attempts - 1` retries).  Must be &gt; 0.
   * </pre>
   *
   * <code>int32 max_attempts = 1;</code>
   * @return Whether the maxAttempts field is set.
   */
  boolean hasMaxAttempts();
  /**
   * <pre>
   * The maximum number of attempts for a task.
   *
   * Cloud Tasks will attempt the task `max_attempts` times (that
   * is, if the first attempt fails, then there will be
   * `max_attempts - 1` retries).  Must be &gt; 0.
   * </pre>
   *
   * <code>int32 max_attempts = 1;</code>
   * @return The maxAttempts.
   */
  int getMaxAttempts();

  /**
   * <pre>
   * If true, then the number of attempts is unlimited.
   * </pre>
   *
   * <code>bool unlimited_attempts = 2;</code>
   * @return Whether the unlimitedAttempts field is set.
   */
  boolean hasUnlimitedAttempts();
  /**
   * <pre>
   * If true, then the number of attempts is unlimited.
   * </pre>
   *
   * <code>bool unlimited_attempts = 2;</code>
   * @return The unlimitedAttempts.
   */
  boolean getUnlimitedAttempts();

  /**
   * <pre>
   * If positive, `max_retry_duration` specifies the time limit for
   * retrying a failed task, measured from when the task was first
   * attempted. Once `max_retry_duration` time has passed *and* the
   * task has been attempted
   * [max_attempts][google.cloud.tasks.v2beta2.RetryConfig.max_attempts] times,
   * no further attempts will be made and the task will be deleted.
   *
   * If zero, then the task age is unlimited.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_retry_duration` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [task_age_limit in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 3;</code>
   * @return Whether the maxRetryDuration field is set.
   */
  boolean hasMaxRetryDuration();
  /**
   * <pre>
   * If positive, `max_retry_duration` specifies the time limit for
   * retrying a failed task, measured from when the task was first
   * attempted. Once `max_retry_duration` time has passed *and* the
   * task has been attempted
   * [max_attempts][google.cloud.tasks.v2beta2.RetryConfig.max_attempts] times,
   * no further attempts will be made and the task will be deleted.
   *
   * If zero, then the task age is unlimited.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_retry_duration` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [task_age_limit in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 3;</code>
   * @return The maxRetryDuration.
   */
  com.google.protobuf.Duration getMaxRetryDuration();
  /**
   * <pre>
   * If positive, `max_retry_duration` specifies the time limit for
   * retrying a failed task, measured from when the task was first
   * attempted. Once `max_retry_duration` time has passed *and* the
   * task has been attempted
   * [max_attempts][google.cloud.tasks.v2beta2.RetryConfig.max_attempts] times,
   * no further attempts will be made and the task will be deleted.
   *
   * If zero, then the task age is unlimited.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_retry_duration` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [task_age_limit in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxRetryDurationOrBuilder();

  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `min_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [min_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff = 4;</code>
   * @return Whether the minBackoff field is set.
   */
  boolean hasMinBackoff();
  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `min_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [min_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff = 4;</code>
   * @return The minBackoff.
   */
  com.google.protobuf.Duration getMinBackoff();
  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `min_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [min_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinBackoffOrBuilder();

  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [max_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff = 5;</code>
   * @return Whether the maxBackoff field is set.
   */
  boolean hasMaxBackoff();
  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [max_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff = 5;</code>
   * @return The maxBackoff.
   */
  com.google.protobuf.Duration getMaxBackoff();
  /**
   * <pre>
   * A task will be [scheduled][google.cloud.tasks.v2beta2.Task.schedule_time]
   * for retry between
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] and
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] duration
   * after it fails, if the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig] specifies that the
   * task should be retried.
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * `max_backoff` will be truncated to the nearest second.
   *
   * This field has the same meaning as
   * [max_backoff_seconds in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxBackoffOrBuilder();

  /**
   * <pre>
   * The time between retries will double `max_doublings` times.
   *
   * A task's retry interval starts at
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff], then
   * doubles `max_doublings` times, then increases linearly, and finally retries
   * at intervals of
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] up to
   * [max_attempts][google.cloud.tasks.v2beta2.RetryConfig.max_attempts] times.
   *
   * For example, if
   * [min_backoff][google.cloud.tasks.v2beta2.RetryConfig.min_backoff] is 10s,
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] is 300s,
   * and `max_doublings` is 3, then the a task will first be retried in 10s. The
   * retry interval will double three times, and then increase linearly by 2^3 *
   * 10s.  Finally, the task will retry at intervals of
   * [max_backoff][google.cloud.tasks.v2beta2.RetryConfig.max_backoff] until the
   * task has been attempted
   * [max_attempts][google.cloud.tasks.v2beta2.RetryConfig.max_attempts] times.
   * Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s,
   * 300s, ....
   *
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   *
   * This field is output only for [pull
   * queues][google.cloud.tasks.v2beta2.PullTarget].
   *
   *
   * This field has the same meaning as
   * [max_doublings in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
   * </pre>
   *
   * <code>int32 max_doublings = 6;</code>
   * @return The maxDoublings.
   */
  int getMaxDoublings();

  com.google.cloud.tasks.v2beta2.RetryConfig.NumAttemptsCase getNumAttemptsCase();
}
