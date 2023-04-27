// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListTrainingPipelinesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TrainingPipeline training_pipelines = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.TrainingPipeline> 
      getTrainingPipelinesList();
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TrainingPipeline training_pipelines = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TrainingPipeline getTrainingPipelines(int index);
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TrainingPipeline training_pipelines = 1;</code>
   */
  int getTrainingPipelinesCount();
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TrainingPipeline training_pipelines = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrainingPipelineOrBuilder> 
      getTrainingPipelinesOrBuilderList();
  /**
   * <pre>
   * List of TrainingPipelines in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TrainingPipeline training_pipelines = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TrainingPipelineOrBuilder getTrainingPipelinesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListTrainingPipelinesRequest.page_token][google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
