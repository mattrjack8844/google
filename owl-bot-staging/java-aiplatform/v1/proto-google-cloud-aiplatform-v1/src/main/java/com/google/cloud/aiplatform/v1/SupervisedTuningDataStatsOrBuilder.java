// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tuning_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface SupervisedTuningDataStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SupervisedTuningDataStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Number of examples in the tuning dataset.
   * </pre>
   *
   * <code>int64 tuning_dataset_example_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The tuningDatasetExampleCount.
   */
  long getTuningDatasetExampleCount();

  /**
   * <pre>
   * Output only. Number of tuning characters in the tuning dataset.
   * </pre>
   *
   * <code>int64 total_tuning_character_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalTuningCharacterCount.
   */
  long getTotalTuningCharacterCount();

  /**
   * <pre>
   * Output only. Number of billable characters in the tuning dataset.
   * </pre>
   *
   * <code>int64 total_billable_character_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalBillableCharacterCount.
   */
  long getTotalBillableCharacterCount();

  /**
   * <pre>
   * Output only. Number of tuning steps for this Tuning Job.
   * </pre>
   *
   * <code>int64 tuning_step_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The tuningStepCount.
   */
  long getTuningStepCount();

  /**
   * <pre>
   * Output only. Dataset distributions for the user input tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_input_token_distribution = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the userInputTokenDistribution field is set.
   */
  boolean hasUserInputTokenDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the user input tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_input_token_distribution = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userInputTokenDistribution.
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution getUserInputTokenDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the user input tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_input_token_distribution = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistributionOrBuilder getUserInputTokenDistributionOrBuilder();

  /**
   * <pre>
   * Output only. Dataset distributions for the user output tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_output_token_distribution = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the userOutputTokenDistribution field is set.
   */
  boolean hasUserOutputTokenDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the user output tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_output_token_distribution = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userOutputTokenDistribution.
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution getUserOutputTokenDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the user output tokens.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_output_token_distribution = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistributionOrBuilder getUserOutputTokenDistributionOrBuilder();

  /**
   * <pre>
   * Output only. Dataset distributions for the messages per example.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_message_per_example_distribution = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the userMessagePerExampleDistribution field is set.
   */
  boolean hasUserMessagePerExampleDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the messages per example.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_message_per_example_distribution = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userMessagePerExampleDistribution.
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution getUserMessagePerExampleDistribution();
  /**
   * <pre>
   * Output only. Dataset distributions for the messages per example.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistribution user_message_per_example_distribution = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.SupervisedTuningDatasetDistributionOrBuilder getUserMessagePerExampleDistributionOrBuilder();

  /**
   * <pre>
   * Output only. Sample user messages in the training dataset uri.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Content user_dataset_examples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Content> 
      getUserDatasetExamplesList();
  /**
   * <pre>
   * Output only. Sample user messages in the training dataset uri.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Content user_dataset_examples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.Content getUserDatasetExamples(int index);
  /**
   * <pre>
   * Output only. Sample user messages in the training dataset uri.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Content user_dataset_examples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getUserDatasetExamplesCount();
  /**
   * <pre>
   * Output only. Sample user messages in the training dataset uri.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Content user_dataset_examples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ContentOrBuilder> 
      getUserDatasetExamplesOrBuilderList();
  /**
   * <pre>
   * Output only. Sample user messages in the training dataset uri.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Content user_dataset_examples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.ContentOrBuilder getUserDatasetExamplesOrBuilder(
      int index);
}
