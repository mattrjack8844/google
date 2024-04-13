// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tuning_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface TunedModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TunedModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the TunedModel. Format:
   * `projects/{project}/locations/{location}/models/{model}`.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Output only. The resource name of the TunedModel. Format:
   * `projects/{project}/locations/{location}/models/{model}`.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Output only. A resource name of an Endpoint. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`.
   * </pre>
   *
   * <code>string endpoint = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <pre>
   * Output only. A resource name of an Endpoint. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`.
   * </pre>
   *
   * <code>string endpoint = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();
}
