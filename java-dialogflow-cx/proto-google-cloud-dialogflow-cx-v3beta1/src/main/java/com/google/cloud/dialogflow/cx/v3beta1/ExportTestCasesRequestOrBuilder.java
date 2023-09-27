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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ExportTestCasesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent where to export test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
   * Required. The agent where to export test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to
   * export the test cases to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If unspecified, the serialized test
   * cases is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return Whether the gcsUri field is set.
   */
  boolean hasGcsUri();
  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to
   * export the test cases to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If unspecified, the serialized test
   * cases is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to
   * export the test cases to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If unspecified, the serialized test
   * cases is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString getGcsUriBytes();

  /**
   *
   *
   * <pre>
   * The data format of the exported test cases. If not specified, `BLOB` is
   * assumed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest.DataFormat data_format = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * The data format of the exported test cases. If not specified, `BLOB` is
   * assumed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest.DataFormat data_format = 3;
   * </code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest.DataFormat getDataFormat();

  /**
   *
   *
   * <pre>
   * The filter expression used to filter exported test cases, see
   * [API Filtering](https://aip.dev/160). The expression is case insensitive
   * and supports the following syntax:
   *
   *   name = &lt;value&gt; [OR name = &lt;value&gt;] ...
   *
   * For example:
   *
   * *   "name = t1 OR name = t2" matches the test case with the exact resource
   *     name "t1" or "t2".
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filter expression used to filter exported test cases, see
   * [API Filtering](https://aip.dev/160). The expression is case insensitive
   * and supports the following syntax:
   *
   *   name = &lt;value&gt; [OR name = &lt;value&gt;] ...
   *
   * For example:
   *
   * *   "name = t1 OR name = t2" matches the test case with the exact resource
   *     name "t1" or "t2".
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest.DestinationCase
      getDestinationCase();
}
