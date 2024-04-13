// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface FluencyInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FluencyInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the prediction field is set.
   */
  boolean hasPrediction();
  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The prediction.
   */
  java.lang.String getPrediction();
  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for prediction.
   */
  com.google.protobuf.ByteString
      getPredictionBytes();
}
