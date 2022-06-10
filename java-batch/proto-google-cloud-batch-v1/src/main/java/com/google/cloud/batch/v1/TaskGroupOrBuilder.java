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
// source: google/cloud/batch/v1/job.proto

package com.google.cloud.batch.v1;

public interface TaskGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.TaskGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. TaskGroup name.
   * The system generates this field based on parent Job name.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/default-group".
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
   * Output only. TaskGroup name.
   * The system generates this field based on parent Job name.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/default-group".
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
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the taskSpec field is set.
   */
  boolean hasTaskSpec();
  /**
   *
   *
   * <pre>
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The taskSpec.
   */
  com.google.cloud.batch.v1.TaskSpec getTaskSpec();
  /**
   *
   *
   * <pre>
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.batch.v1.TaskSpecOrBuilder getTaskSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of Tasks in the TaskGroup.
   * default is 1
   * </pre>
   *
   * <code>int64 task_count = 4;</code>
   *
   * @return The taskCount.
   */
  long getTaskCount();

  /**
   *
   *
   * <pre>
   * Max number of tasks that can run in parallel.
   * Default to min(task_count, 1000).
   * </pre>
   *
   * <code>int64 parallelism = 5;</code>
   *
   * @return The parallelism.
   */
  long getParallelism();

  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * task_environments supports up to 200 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Environment task_environments = 9;</code>
   */
  java.util.List<com.google.cloud.batch.v1.Environment> getTaskEnvironmentsList();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * task_environments supports up to 200 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Environment task_environments = 9;</code>
   */
  com.google.cloud.batch.v1.Environment getTaskEnvironments(int index);
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * task_environments supports up to 200 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Environment task_environments = 9;</code>
   */
  int getTaskEnvironmentsCount();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * task_environments supports up to 200 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Environment task_environments = 9;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1.EnvironmentOrBuilder>
      getTaskEnvironmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * task_environments supports up to 200 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Environment task_environments = 9;</code>
   */
  com.google.cloud.batch.v1.EnvironmentOrBuilder getTaskEnvironmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Max number of tasks that can be run on a node at the same time.
   * If not specified, the system will decide a value based on available
   * compute resources on a VM and task requirements.
   * </pre>
   *
   * <code>int64 task_count_per_node = 10;</code>
   *
   * @return The taskCountPerNode.
   */
  long getTaskCountPerNode();

  /**
   *
   *
   * <pre>
   * When true, Batch will populate a file with a list of all VMs assigned to
   * the TaskGroup and set the BATCH_HOSTS_FILE environment variable to the path
   * of that file. Defaults to false.
   * </pre>
   *
   * <code>bool require_hosts_file = 11;</code>
   *
   * @return The requireHostsFile.
   */
  boolean getRequireHostsFile();

  /**
   *
   *
   * <pre>
   * When true, Batch will configure SSH to allow passwordless login between
   * VMs for the user running the Batch tasks.
   * </pre>
   *
   * <code>bool permissive_ssh = 12;</code>
   *
   * @return The permissiveSsh.
   */
  boolean getPermissiveSsh();
}
