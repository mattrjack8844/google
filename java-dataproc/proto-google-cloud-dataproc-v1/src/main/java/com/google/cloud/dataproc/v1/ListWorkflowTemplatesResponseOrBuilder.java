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
// source: google/cloud/dataproc/v1/workflow_templates.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface ListWorkflowTemplatesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListWorkflowTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. WorkflowTemplates list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowTemplate templates = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.WorkflowTemplate> getTemplatesList();
  /**
   *
   *
   * <pre>
   * Output only. WorkflowTemplates list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowTemplate templates = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplate getTemplates(int index);
  /**
   *
   *
   * <pre>
   * Output only. WorkflowTemplates list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowTemplate templates = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTemplatesCount();
  /**
   *
   *
   * <pre>
   * Output only. WorkflowTemplates list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowTemplate templates = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>
      getTemplatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. WorkflowTemplates list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowTemplate templates = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. This token is included in the response if there are more
   * results to fetch. To fetch additional results, provide this value as the
   * page_token in a subsequent &lt;code&gt;ListWorkflowTemplatesRequest&lt;/code&gt;.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Output only. This token is included in the response if there are more
   * results to fetch. To fetch additional results, provide this value as the
   * page_token in a subsequent &lt;code&gt;ListWorkflowTemplatesRequest&lt;/code&gt;.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
