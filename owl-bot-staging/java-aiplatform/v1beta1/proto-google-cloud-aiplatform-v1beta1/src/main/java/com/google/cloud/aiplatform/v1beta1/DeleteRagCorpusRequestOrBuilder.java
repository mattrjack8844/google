// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface DeleteRagCorpusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeleteRagCorpusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the RagCorpus resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the RagCorpus resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. If set to true, any RagFiles in this RagCorpus will also be
   * deleted. Otherwise, the request will only work if the RagCorpus has no
   * RagFiles.
   * </pre>
   *
   * <code>bool force = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The force.
   */
  boolean getForce();
}
