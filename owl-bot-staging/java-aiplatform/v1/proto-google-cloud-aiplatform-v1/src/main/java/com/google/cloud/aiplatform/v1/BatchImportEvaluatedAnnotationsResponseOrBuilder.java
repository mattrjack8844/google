// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_service.proto

package com.google.cloud.aiplatform.v1;

public interface BatchImportEvaluatedAnnotationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchImportEvaluatedAnnotationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Number of EvaluatedAnnotations imported.
   * </pre>
   *
   * <code>int32 imported_evaluated_annotations_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The importedEvaluatedAnnotationsCount.
   */
  int getImportedEvaluatedAnnotationsCount();
}
