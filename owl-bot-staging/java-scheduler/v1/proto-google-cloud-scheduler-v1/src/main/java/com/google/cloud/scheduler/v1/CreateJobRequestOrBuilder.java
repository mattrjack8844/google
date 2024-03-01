// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1/cloudscheduler.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.scheduler.v1;

public interface CreateJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1.CreateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  com.google.cloud.scheduler.v1.Job getJob();
  /**
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.scheduler.v1.JobOrBuilder getJobOrBuilder();
}
