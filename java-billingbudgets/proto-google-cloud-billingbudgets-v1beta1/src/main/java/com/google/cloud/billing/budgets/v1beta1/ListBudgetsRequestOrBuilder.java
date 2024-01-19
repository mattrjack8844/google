/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/billing/budgets/v1beta1/budget_service.proto

package com.google.cloud.billing.budgets.v1beta1;

public interface ListBudgetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.ListBudgetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of billing account to list budgets under. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of billing account to list budgets under. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Set the scope of the budgets to be returned, in the format of the
   * resource name. The scope of a budget is the cost that it tracks, such as
   * costs for a single project, or the costs for all projects in a folder. Only
   * project scope (in the format of "projects/project-id" or "projects/123") is
   * supported in this field. When this field is set to a project's resource
   * name, the budgets returned are tracking the costs for that project.
   * </pre>
   *
   * <code>string scope = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Optional. Set the scope of the budgets to be returned, in the format of the
   * resource name. The scope of a budget is the cost that it tracks, such as
   * costs for a single project, or the costs for all projects in a folder. Only
   * project scope (in the format of "projects/project-id" or "projects/123") is
   * supported in this field. When this field is set to a project's resource
   * name, the budgets returned are tracking the costs for that project.
   * </pre>
   *
   * <code>string scope = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of budgets to return per page.
   * The default and maximum value are 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The value returned by the last `ListBudgetsResponse` which
   * indicates that this is a continuation of a prior `ListBudgets` call,
   * and that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The value returned by the last `ListBudgetsResponse` which
   * indicates that this is a continuation of a prior `ListBudgets` call,
   * and that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
