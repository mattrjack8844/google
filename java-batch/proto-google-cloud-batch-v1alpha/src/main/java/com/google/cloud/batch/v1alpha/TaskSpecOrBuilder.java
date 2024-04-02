/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/batch/v1alpha/task.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1alpha;

public interface TaskSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.TaskSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The sequence of scripts or containers to run for this Task. Each Task using
   * this TaskSpec executes its list of runnables in order. The Task succeeds if
   * all of its runnables either exit with a zero status or any that exit with a
   * non-zero status have the ignore_exit_status flag.
   *
   * Background runnables are killed automatically (if they have not already
   * exited) a short time after all foreground runnables have completed. Even
   * though this is likely to result in a non-zero exit status for the
   * background runnable, these automatic kills are not treated as Task
   * failures.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Runnable runnables = 8;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.Runnable> getRunnablesList();
  /**
   *
   *
   * <pre>
   * The sequence of scripts or containers to run for this Task. Each Task using
   * this TaskSpec executes its list of runnables in order. The Task succeeds if
   * all of its runnables either exit with a zero status or any that exit with a
   * non-zero status have the ignore_exit_status flag.
   *
   * Background runnables are killed automatically (if they have not already
   * exited) a short time after all foreground runnables have completed. Even
   * though this is likely to result in a non-zero exit status for the
   * background runnable, these automatic kills are not treated as Task
   * failures.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Runnable runnables = 8;</code>
   */
  com.google.cloud.batch.v1alpha.Runnable getRunnables(int index);
  /**
   *
   *
   * <pre>
   * The sequence of scripts or containers to run for this Task. Each Task using
   * this TaskSpec executes its list of runnables in order. The Task succeeds if
   * all of its runnables either exit with a zero status or any that exit with a
   * non-zero status have the ignore_exit_status flag.
   *
   * Background runnables are killed automatically (if they have not already
   * exited) a short time after all foreground runnables have completed. Even
   * though this is likely to result in a non-zero exit status for the
   * background runnable, these automatic kills are not treated as Task
   * failures.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Runnable runnables = 8;</code>
   */
  int getRunnablesCount();
  /**
   *
   *
   * <pre>
   * The sequence of scripts or containers to run for this Task. Each Task using
   * this TaskSpec executes its list of runnables in order. The Task succeeds if
   * all of its runnables either exit with a zero status or any that exit with a
   * non-zero status have the ignore_exit_status flag.
   *
   * Background runnables are killed automatically (if they have not already
   * exited) a short time after all foreground runnables have completed. Even
   * though this is likely to result in a non-zero exit status for the
   * background runnable, these automatic kills are not treated as Task
   * failures.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Runnable runnables = 8;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.RunnableOrBuilder>
      getRunnablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The sequence of scripts or containers to run for this Task. Each Task using
   * this TaskSpec executes its list of runnables in order. The Task succeeds if
   * all of its runnables either exit with a zero status or any that exit with a
   * non-zero status have the ignore_exit_status flag.
   *
   * Background runnables are killed automatically (if they have not already
   * exited) a short time after all foreground runnables have completed. Even
   * though this is likely to result in a non-zero exit status for the
   * background runnable, these automatic kills are not treated as Task
   * failures.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Runnable runnables = 8;</code>
   */
  com.google.cloud.batch.v1alpha.RunnableOrBuilder getRunnablesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * ComputeResource requirements.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ComputeResource compute_resource = 3;</code>
   *
   * @return Whether the computeResource field is set.
   */
  boolean hasComputeResource();
  /**
   *
   *
   * <pre>
   * ComputeResource requirements.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ComputeResource compute_resource = 3;</code>
   *
   * @return The computeResource.
   */
  com.google.cloud.batch.v1alpha.ComputeResource getComputeResource();
  /**
   *
   *
   * <pre>
   * ComputeResource requirements.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ComputeResource compute_resource = 3;</code>
   */
  com.google.cloud.batch.v1alpha.ComputeResourceOrBuilder getComputeResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum duration the task should run.
   * The task will be killed and marked as FAILED if over this limit.
   * The valid value range for max_run_duration in seconds is [0,
   * 315576000000.999999999],
   * </pre>
   *
   * <code>.google.protobuf.Duration max_run_duration = 4;</code>
   *
   * @return Whether the maxRunDuration field is set.
   */
  boolean hasMaxRunDuration();
  /**
   *
   *
   * <pre>
   * Maximum duration the task should run.
   * The task will be killed and marked as FAILED if over this limit.
   * The valid value range for max_run_duration in seconds is [0,
   * 315576000000.999999999],
   * </pre>
   *
   * <code>.google.protobuf.Duration max_run_duration = 4;</code>
   *
   * @return The maxRunDuration.
   */
  com.google.protobuf.Duration getMaxRunDuration();
  /**
   *
   *
   * <pre>
   * Maximum duration the task should run.
   * The task will be killed and marked as FAILED if over this limit.
   * The valid value range for max_run_duration in seconds is [0,
   * 315576000000.999999999],
   * </pre>
   *
   * <code>.google.protobuf.Duration max_run_duration = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxRunDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of retries on failures.
   * The default, 0, which means never retry.
   * The valid value range is [0, 10].
   * </pre>
   *
   * <code>int32 max_retry_count = 5;</code>
   *
   * @return The maxRetryCount.
   */
  int getMaxRetryCount();

  /**
   *
   *
   * <pre>
   * Lifecycle management schema when any task in a task group is failed.
   * Currently we only support one lifecycle policy.
   * When the lifecycle policy condition is met,
   * the action in the policy will execute.
   * If task execution result does not meet with the defined lifecycle
   * policy, we consider it as the default policy.
   * Default policy means if the exit code is 0, exit task.
   * If task ends with non-zero exit code, retry the task with max_retry_count.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.LifecyclePolicy lifecycle_policies = 9;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.LifecyclePolicy> getLifecyclePoliciesList();
  /**
   *
   *
   * <pre>
   * Lifecycle management schema when any task in a task group is failed.
   * Currently we only support one lifecycle policy.
   * When the lifecycle policy condition is met,
   * the action in the policy will execute.
   * If task execution result does not meet with the defined lifecycle
   * policy, we consider it as the default policy.
   * Default policy means if the exit code is 0, exit task.
   * If task ends with non-zero exit code, retry the task with max_retry_count.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.LifecyclePolicy lifecycle_policies = 9;</code>
   */
  com.google.cloud.batch.v1alpha.LifecyclePolicy getLifecyclePolicies(int index);
  /**
   *
   *
   * <pre>
   * Lifecycle management schema when any task in a task group is failed.
   * Currently we only support one lifecycle policy.
   * When the lifecycle policy condition is met,
   * the action in the policy will execute.
   * If task execution result does not meet with the defined lifecycle
   * policy, we consider it as the default policy.
   * Default policy means if the exit code is 0, exit task.
   * If task ends with non-zero exit code, retry the task with max_retry_count.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.LifecyclePolicy lifecycle_policies = 9;</code>
   */
  int getLifecyclePoliciesCount();
  /**
   *
   *
   * <pre>
   * Lifecycle management schema when any task in a task group is failed.
   * Currently we only support one lifecycle policy.
   * When the lifecycle policy condition is met,
   * the action in the policy will execute.
   * If task execution result does not meet with the defined lifecycle
   * policy, we consider it as the default policy.
   * Default policy means if the exit code is 0, exit task.
   * If task ends with non-zero exit code, retry the task with max_retry_count.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.LifecyclePolicy lifecycle_policies = 9;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.LifecyclePolicyOrBuilder>
      getLifecyclePoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Lifecycle management schema when any task in a task group is failed.
   * Currently we only support one lifecycle policy.
   * When the lifecycle policy condition is met,
   * the action in the policy will execute.
   * If task execution result does not meet with the defined lifecycle
   * policy, we consider it as the default policy.
   * Default policy means if the exit code is 0, exit task.
   * If task ends with non-zero exit code, retry the task with max_retry_count.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.LifecyclePolicy lifecycle_policies = 9;</code>
   */
  com.google.cloud.batch.v1alpha.LifecyclePolicyOrBuilder getLifecyclePoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Deprecated: please use environment(non-plural) instead.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environments = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  int getEnvironmentsCount();
  /**
   *
   *
   * <pre>
   * Deprecated: please use environment(non-plural) instead.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environments = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  boolean containsEnvironments(java.lang.String key);
  /** Use {@link #getEnvironmentsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvironments();
  /**
   *
   *
   * <pre>
   * Deprecated: please use environment(non-plural) instead.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environments = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentsMap();
  /**
   *
   *
   * <pre>
   * Deprecated: please use environment(non-plural) instead.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environments = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated /* nullable */
  java.lang.String getEnvironmentsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Deprecated: please use environment(non-plural) instead.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environments = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getEnvironmentsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Volumes to mount before running Tasks using this TaskSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Volume volumes = 7;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * Volumes to mount before running Tasks using this TaskSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Volume volumes = 7;</code>
   */
  com.google.cloud.batch.v1alpha.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * Volumes to mount before running Tasks using this TaskSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Volume volumes = 7;</code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * Volumes to mount before running Tasks using this TaskSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Volume volumes = 7;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.VolumeOrBuilder>
      getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Volumes to mount before running Tasks using this TaskSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Volume volumes = 7;</code>
   */
  com.google.cloud.batch.v1alpha.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Environment variables to set before running the Task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment environment = 10;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * Environment variables to set before running the Task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment environment = 10;</code>
   *
   * @return The environment.
   */
  com.google.cloud.batch.v1alpha.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * Environment variables to set before running the Task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment environment = 10;</code>
   */
  com.google.cloud.batch.v1alpha.EnvironmentOrBuilder getEnvironmentOrBuilder();
}
