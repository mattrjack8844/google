// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/prediction_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ExplainResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExplainResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The explanations of the Model's
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   *
   * It has the same number of elements as
   * [instances][google.cloud.aiplatform.v1.ExplainRequest.instances] to be
   * explained.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Explanation explanations = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Explanation> 
      getExplanationsList();
  /**
   * <pre>
   * The explanations of the Model's
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   *
   * It has the same number of elements as
   * [instances][google.cloud.aiplatform.v1.ExplainRequest.instances] to be
   * explained.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Explanation explanations = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Explanation getExplanations(int index);
  /**
   * <pre>
   * The explanations of the Model's
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   *
   * It has the same number of elements as
   * [instances][google.cloud.aiplatform.v1.ExplainRequest.instances] to be
   * explained.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Explanation explanations = 1;</code>
   */
  int getExplanationsCount();
  /**
   * <pre>
   * The explanations of the Model's
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   *
   * It has the same number of elements as
   * [instances][google.cloud.aiplatform.v1.ExplainRequest.instances] to be
   * explained.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Explanation explanations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ExplanationOrBuilder> 
      getExplanationsOrBuilderList();
  /**
   * <pre>
   * The explanations of the Model's
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   *
   * It has the same number of elements as
   * [instances][google.cloud.aiplatform.v1.ExplainRequest.instances] to be
   * explained.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Explanation explanations = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ExplanationOrBuilder getExplanationsOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the Endpoint's DeployedModel that served this explanation.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   * @return The deployedModelId.
   */
  java.lang.String getDeployedModelId();
  /**
   * <pre>
   * ID of the Endpoint's DeployedModel that served this explanation.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   * @return The bytes for deployedModelId.
   */
  com.google.protobuf.ByteString
      getDeployedModelIdBytes();

  /**
   * <pre>
   * The predictions that are the output of the predictions call.
   * Same as
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 3;</code>
   */
  java.util.List<com.google.protobuf.Value> 
      getPredictionsList();
  /**
   * <pre>
   * The predictions that are the output of the predictions call.
   * Same as
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 3;</code>
   */
  com.google.protobuf.Value getPredictions(int index);
  /**
   * <pre>
   * The predictions that are the output of the predictions call.
   * Same as
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 3;</code>
   */
  int getPredictionsCount();
  /**
   * <pre>
   * The predictions that are the output of the predictions call.
   * Same as
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
      getPredictionsOrBuilderList();
  /**
   * <pre>
   * The predictions that are the output of the predictions call.
   * Same as
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getPredictionsOrBuilder(
      int index);
}
