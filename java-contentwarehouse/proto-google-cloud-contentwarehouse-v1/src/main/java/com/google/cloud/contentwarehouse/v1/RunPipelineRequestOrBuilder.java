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
// source: google/cloud/contentwarehouse/v1/pipeline_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface RunPipelineRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.RunPipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name which owns the resources of the pipeline.
   * Format: projects/{project_number}/locations/{location}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name which owns the resources of the pipeline.
   * Format: projects/{project_number}/locations/{location}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Cloud Storage ingestion pipeline.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.GcsIngestPipeline gcs_ingest_pipeline = 2;</code>
   *
   * @return Whether the gcsIngestPipeline field is set.
   */
  boolean hasGcsIngestPipeline();
  /**
   *
   *
   * <pre>
   * Cloud Storage ingestion pipeline.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.GcsIngestPipeline gcs_ingest_pipeline = 2;</code>
   *
   * @return The gcsIngestPipeline.
   */
  com.google.cloud.contentwarehouse.v1.GcsIngestPipeline getGcsIngestPipeline();
  /**
   *
   *
   * <pre>
   * Cloud Storage ingestion pipeline.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.GcsIngestPipeline gcs_ingest_pipeline = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.GcsIngestPipelineOrBuilder getGcsIngestPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * Use DocAI processors to process documents in Cloud Storage and ingest
   * them to Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.GcsIngestWithDocAiProcessorsPipeline gcs_ingest_with_doc_ai_processors_pipeline = 3;
   * </code>
   *
   * @return Whether the gcsIngestWithDocAiProcessorsPipeline field is set.
   */
  boolean hasGcsIngestWithDocAiProcessorsPipeline();
  /**
   *
   *
   * <pre>
   * Use DocAI processors to process documents in Cloud Storage and ingest
   * them to Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.GcsIngestWithDocAiProcessorsPipeline gcs_ingest_with_doc_ai_processors_pipeline = 3;
   * </code>
   *
   * @return The gcsIngestWithDocAiProcessorsPipeline.
   */
  com.google.cloud.contentwarehouse.v1.GcsIngestWithDocAiProcessorsPipeline
      getGcsIngestWithDocAiProcessorsPipeline();
  /**
   *
   *
   * <pre>
   * Use DocAI processors to process documents in Cloud Storage and ingest
   * them to Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.GcsIngestWithDocAiProcessorsPipeline gcs_ingest_with_doc_ai_processors_pipeline = 3;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.GcsIngestWithDocAiProcessorsPipelineOrBuilder
      getGcsIngestWithDocAiProcessorsPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * Export docuemnts from Document Warehouse to CDW for training purpose.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ExportToCdwPipeline export_cdw_pipeline = 4;</code>
   *
   * @return Whether the exportCdwPipeline field is set.
   */
  boolean hasExportCdwPipeline();
  /**
   *
   *
   * <pre>
   * Export docuemnts from Document Warehouse to CDW for training purpose.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ExportToCdwPipeline export_cdw_pipeline = 4;</code>
   *
   * @return The exportCdwPipeline.
   */
  com.google.cloud.contentwarehouse.v1.ExportToCdwPipeline getExportCdwPipeline();
  /**
   *
   *
   * <pre>
   * Export docuemnts from Document Warehouse to CDW for training purpose.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ExportToCdwPipeline export_cdw_pipeline = 4;</code>
   */
  com.google.cloud.contentwarehouse.v1.ExportToCdwPipelineOrBuilder getExportCdwPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * Use a DocAI processor to process documents in Document Warehouse, and
   * re-ingest the updated results into Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.ProcessWithDocAiPipeline process_with_doc_ai_pipeline = 5;
   * </code>
   *
   * @return Whether the processWithDocAiPipeline field is set.
   */
  boolean hasProcessWithDocAiPipeline();
  /**
   *
   *
   * <pre>
   * Use a DocAI processor to process documents in Document Warehouse, and
   * re-ingest the updated results into Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.ProcessWithDocAiPipeline process_with_doc_ai_pipeline = 5;
   * </code>
   *
   * @return The processWithDocAiPipeline.
   */
  com.google.cloud.contentwarehouse.v1.ProcessWithDocAiPipeline getProcessWithDocAiPipeline();
  /**
   *
   *
   * <pre>
   * Use a DocAI processor to process documents in Document Warehouse, and
   * re-ingest the updated results into Document Warehouse.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.ProcessWithDocAiPipeline process_with_doc_ai_pipeline = 5;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.ProcessWithDocAiPipelineOrBuilder
      getProcessWithDocAiPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 6;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 6;</code>
   *
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 6;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();

  com.google.cloud.contentwarehouse.v1.RunPipelineRequest.PipelineCase getPipelineCase();
}
