// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public interface ListCompaniesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ListCompaniesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant will be used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant will be used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The starting indicator from which to return results.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The starting indicator from which to return results.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of companies to be returned, at most 100.
   * Default is 100 if a non-positive number is provided.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Set to true if the companies requested must have open jobs.
   * Defaults to false.
   * If true, at most
   * [page_size][google.cloud.talent.v4beta1.ListCompaniesRequest.page_size] of
   * companies are fetched, among which only those with open jobs are returned.
   * </pre>
   *
   * <code>bool require_open_jobs = 4;</code>
   * @return The requireOpenJobs.
   */
  boolean getRequireOpenJobs();
}
