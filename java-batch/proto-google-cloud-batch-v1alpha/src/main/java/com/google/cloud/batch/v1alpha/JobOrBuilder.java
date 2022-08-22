/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Job name.
   * For example: "projects/123456/locations/us-central1/jobs/job01".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Job name.
   * For example: "projects/123456/locations/us-central1/jobs/job01".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system generated unique ID (in UUID4 format) for the Job.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A system generated unique ID (in UUID4 format) for the Job.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Priority of the Job.
   * The valid value range is [0, 100).
   * A job with higher priority value is more likely to run earlier if all other
   * requirements are satisfied.
   * </pre>
   *
   * <code>int64 priority = 3;</code>
   *
   * @return The priority.
   */
  long getPriority();

  /**
   *
   *
   * <pre>
   * Required. TaskGroups in the Job. Only one TaskGroup is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.TaskGroup task_groups = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.TaskGroup> getTaskGroupsList();
  /**
   *
   *
   * <pre>
   * Required. TaskGroups in the Job. Only one TaskGroup is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.TaskGroup task_groups = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.batch.v1alpha.TaskGroup getTaskGroups(int index);
  /**
   *
   *
   * <pre>
   * Required. TaskGroups in the Job. Only one TaskGroup is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.TaskGroup task_groups = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getTaskGroupsCount();
  /**
   *
   *
   * <pre>
   * Required. TaskGroups in the Job. Only one TaskGroup is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.TaskGroup task_groups = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.TaskGroupOrBuilder>
      getTaskGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. TaskGroups in the Job. Only one TaskGroup is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.TaskGroup task_groups = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.batch.v1alpha.TaskGroupOrBuilder getTaskGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Scheduling policy for TaskGroups in the job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Job.SchedulingPolicy scheduling_policy = 5;</code>
   *
   * @return The enum numeric value on the wire for schedulingPolicy.
   */
  int getSchedulingPolicyValue();
  /**
   *
   *
   * <pre>
   * Scheduling policy for TaskGroups in the job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Job.SchedulingPolicy scheduling_policy = 5;</code>
   *
   * @return The schedulingPolicy.
   */
  com.google.cloud.batch.v1alpha.Job.SchedulingPolicy getSchedulingPolicy();

  /**
   *
   *
   * <pre>
   * At least one of the dependencies must be satisfied before the Job is
   * scheduled to run.
   * Only one JobDependency is supported now.
   * Not yet implemented.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobDependency dependencies = 6;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.JobDependency> getDependenciesList();
  /**
   *
   *
   * <pre>
   * At least one of the dependencies must be satisfied before the Job is
   * scheduled to run.
   * Only one JobDependency is supported now.
   * Not yet implemented.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobDependency dependencies = 6;</code>
   */
  com.google.cloud.batch.v1alpha.JobDependency getDependencies(int index);
  /**
   *
   *
   * <pre>
   * At least one of the dependencies must be satisfied before the Job is
   * scheduled to run.
   * Only one JobDependency is supported now.
   * Not yet implemented.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobDependency dependencies = 6;</code>
   */
  int getDependenciesCount();
  /**
   *
   *
   * <pre>
   * At least one of the dependencies must be satisfied before the Job is
   * scheduled to run.
   * Only one JobDependency is supported now.
   * Not yet implemented.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobDependency dependencies = 6;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.JobDependencyOrBuilder>
      getDependenciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * At least one of the dependencies must be satisfied before the Job is
   * scheduled to run.
   * Only one JobDependency is supported now.
   * Not yet implemented.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobDependency dependencies = 6;</code>
   */
  com.google.cloud.batch.v1alpha.JobDependencyOrBuilder getDependenciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Compute resource allocation for all TaskGroups in the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   *
   * @return Whether the allocationPolicy field is set.
   */
  boolean hasAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Compute resource allocation for all TaskGroups in the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   *
   * @return The allocationPolicy.
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy getAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Compute resource allocation for all TaskGroups in the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicyOrBuilder getAllocationPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels for the Job. Labels could be user provided or system generated.
   * For example,
   * "labels": {
   *    "department": "finance",
   *    "environment": "test"
   *  }
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for the Job. Labels could be user provided or system generated.
   * For example,
   * "labels": {
   *    "department": "finance",
   *    "environment": "test"
   *  }
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for the Job. Labels could be user provided or system generated.
   * For example,
   * "labels": {
   *    "department": "finance",
   *    "environment": "test"
   *  }
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for the Job. Labels could be user provided or system generated.
   * For example,
   * "labels": {
   *    "department": "finance",
   *    "environment": "test"
   *  }
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for the Job. Labels could be user provided or system generated.
   * For example,
   * "labels": {
   *    "department": "finance",
   *    "environment": "test"
   *  }
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Job status. It is read only for users.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.JobStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. Job status. It is read only for users.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.JobStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.batch.v1alpha.JobStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. Job status. It is read only for users.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.JobStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.batch.v1alpha.JobStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Job notification.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.JobNotification notification = 10 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.Job.notification is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=95
   * @return Whether the notification field is set.
   */
  @java.lang.Deprecated
  boolean hasNotification();
  /**
   *
   *
   * <pre>
   * Job notification.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.JobNotification notification = 10 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.Job.notification is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=95
   * @return The notification.
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.JobNotification getNotification();
  /**
   *
   *
   * <pre>
   * Job notification.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.JobNotification notification = 10 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.JobNotificationOrBuilder getNotificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the Job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last time the Job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the Job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the Job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Log preservation policy for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy logs_policy = 13;</code>
   *
   * @return Whether the logsPolicy field is set.
   */
  boolean hasLogsPolicy();
  /**
   *
   *
   * <pre>
   * Log preservation policy for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy logs_policy = 13;</code>
   *
   * @return The logsPolicy.
   */
  com.google.cloud.batch.v1alpha.LogsPolicy getLogsPolicy();
  /**
   *
   *
   * <pre>
   * Log preservation policy for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy logs_policy = 13;</code>
   */
  com.google.cloud.batch.v1alpha.LogsPolicyOrBuilder getLogsPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Notification configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobNotification notifications = 14;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.JobNotification> getNotificationsList();
  /**
   *
   *
   * <pre>
   * Notification configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobNotification notifications = 14;</code>
   */
  com.google.cloud.batch.v1alpha.JobNotification getNotifications(int index);
  /**
   *
   *
   * <pre>
   * Notification configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobNotification notifications = 14;</code>
   */
  int getNotificationsCount();
  /**
   *
   *
   * <pre>
   * Notification configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobNotification notifications = 14;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.JobNotificationOrBuilder>
      getNotificationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Notification configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.JobNotification notifications = 14;</code>
   */
  com.google.cloud.batch.v1alpha.JobNotificationOrBuilder getNotificationsOrBuilder(int index);
}
