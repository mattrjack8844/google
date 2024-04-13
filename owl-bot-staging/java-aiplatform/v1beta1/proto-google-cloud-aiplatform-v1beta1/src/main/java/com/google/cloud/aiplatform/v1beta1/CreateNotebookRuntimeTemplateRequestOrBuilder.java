// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/notebook_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface CreateNotebookRuntimeTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateNotebookRuntimeTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to create the
   * NotebookRuntimeTemplate. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to create the
   * NotebookRuntimeTemplate. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The NotebookRuntimeTemplate to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplate notebook_runtime_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the notebookRuntimeTemplate field is set.
   */
  boolean hasNotebookRuntimeTemplate();
  /**
   * <pre>
   * Required. The NotebookRuntimeTemplate to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplate notebook_runtime_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The notebookRuntimeTemplate.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplate getNotebookRuntimeTemplate();
  /**
   * <pre>
   * Required. The NotebookRuntimeTemplate to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplate notebook_runtime_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateOrBuilder getNotebookRuntimeTemplateOrBuilder();

  /**
   * <pre>
   * Optional. User specified ID for the notebook runtime template.
   * </pre>
   *
   * <code>string notebook_runtime_template_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The notebookRuntimeTemplateId.
   */
  java.lang.String getNotebookRuntimeTemplateId();
  /**
   * <pre>
   * Optional. User specified ID for the notebook runtime template.
   * </pre>
   *
   * <code>string notebook_runtime_template_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for notebookRuntimeTemplateId.
   */
  com.google.protobuf.ByteString
      getNotebookRuntimeTemplateIdBytes();
}
