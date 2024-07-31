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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface ListJobTriggersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListJobTriggersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   *
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/sensitive-data-protection/docs/specifying-location):
   *
   * + Projects scope, location specified:
   *   `projects/{project_id}/locations/{location_id}`
   * + Projects scope, no location specified (defaults to global):
   *   `projects/{project_id}`
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Required. Parent resource name.
   *
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/sensitive-data-protection/docs/specifying-location):
   *
   * + Projects scope, location specified:
   *   `projects/{project_id}/locations/{location_id}`
   * + Projects scope, no location specified (defaults to global):
   *   `projects/{project_id}`
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Page token to continue retrieval. Comes from the previous call
   * to ListJobTriggers. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Page token to continue retrieval. Comes from the previous call
   * to ListJobTriggers. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Size of the page. This value can be limited by a server.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Comma-separated list of triggeredJob fields to order by,
   * followed by `asc` or `desc` postfix. This list is case insensitive. The
   * default sorting order is ascending. Redundant space characters are
   * insignificant.
   *
   * Example: `name asc,update_time, create_time desc`
   *
   * Supported fields are:
   *
   * - `create_time`: corresponds to the time the JobTrigger was created.
   * - `update_time`: corresponds to the time the JobTrigger was last updated.
   * - `last_run_time`: corresponds to the last time the JobTrigger ran.
   * - `name`: corresponds to the JobTrigger's name.
   * - `display_name`: corresponds to the JobTrigger's display name.
   * - `status`: corresponds to JobTrigger's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Comma-separated list of triggeredJob fields to order by,
   * followed by `asc` or `desc` postfix. This list is case insensitive. The
   * default sorting order is ascending. Redundant space characters are
   * insignificant.
   *
   * Example: `name asc,update_time, create_time desc`
   *
   * Supported fields are:
   *
   * - `create_time`: corresponds to the time the JobTrigger was created.
   * - `update_time`: corresponds to the time the JobTrigger was last updated.
   * - `last_run_time`: corresponds to the last time the JobTrigger ran.
   * - `name`: corresponds to the JobTrigger's name.
   * - `display_name`: corresponds to the JobTrigger's display name.
   * - `status`: corresponds to JobTrigger's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Allows filtering.
   *
   * Supported syntax:
   *
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values for inspect triggers:
   *     - `status` - HEALTHY|PAUSED|CANCELLED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
   *     quotation marks. Nanoseconds are ignored.
   *     - 'error_count' - Number of errors that have occurred while running.
   * * The operator must be `=` or `!=` for status and inspected_storage.
   *
   * Examples:
   *
   * * inspected_storage = cloud_storage AND status = HEALTHY
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
   * * last_run_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   *
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Allows filtering.
   *
   * Supported syntax:
   *
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values for inspect triggers:
   *     - `status` - HEALTHY|PAUSED|CANCELLED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
   *     quotation marks. Nanoseconds are ignored.
   *     - 'error_count' - Number of errors that have occurred while running.
   * * The operator must be `=` or `!=` for status and inspected_storage.
   *
   * Examples:
   *
   * * inspected_storage = cloud_storage AND status = HEALTHY
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
   * * last_run_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   *
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The type of jobs. Will use `DlpJobType.INSPECT` if not set.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 6;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of jobs. Will use `DlpJobType.INSPECT` if not set.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 6;</code>
   *
   * @return The type.
   */
  com.google.privacy.dlp.v2.DlpJobType getType();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
