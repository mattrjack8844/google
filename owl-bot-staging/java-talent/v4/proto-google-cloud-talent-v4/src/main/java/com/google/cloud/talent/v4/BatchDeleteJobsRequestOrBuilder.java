// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/job_service.proto

package com.google.cloud.talent.v4;

public interface BatchDeleteJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.BatchDeleteJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * The parent of all of the jobs specified in `names` must match this field.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * The parent of all of the jobs specified in `names` must match this field.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The names of the jobs to delete.
   * The format is "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}".
   * For example, "projects/foo/tenants/bar/jobs/baz".
   * A maximum of 200 jobs can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string names = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * The names of the jobs to delete.
   * The format is "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}".
   * For example, "projects/foo/tenants/bar/jobs/baz".
   * A maximum of 200 jobs can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string names = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <pre>
   * The names of the jobs to delete.
   * The format is "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}".
   * For example, "projects/foo/tenants/bar/jobs/baz".
   * A maximum of 200 jobs can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string names = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * The names of the jobs to delete.
   * The format is "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}".
   * For example, "projects/foo/tenants/bar/jobs/baz".
   * A maximum of 200 jobs can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string names = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}
