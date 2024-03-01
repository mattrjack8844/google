// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

public interface CutoverJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.CutoverJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the computeEngineTargetDetails field is set.
   */
  boolean hasComputeEngineTargetDetails();
  /**
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The computeEngineTargetDetails.
   */
  com.google.cloud.vmmigration.v1.ComputeEngineTargetDetails getComputeEngineTargetDetails();
  /**
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.vmmigration.v1.ComputeEngineTargetDetailsOrBuilder getComputeEngineTargetDetailsOrBuilder();

  /**
   * <pre>
   * Output only. The time the cutover job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time the cutover job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time the cutover job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time the cutover job had finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. The time the cutover job had finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. The time the cutover job had finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. The name of the cutover job.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the cutover job.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. State of the cutover job.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.CutoverJob.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the cutover job.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.CutoverJob.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.vmmigration.v1.CutoverJob.State getState();

  /**
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();
  /**
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();
  /**
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The current progress in percentage of the cutover job.
   * </pre>
   *
   * <code>int32 progress_percent = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The progressPercent.
   */
  int getProgressPercent();

  /**
   * <pre>
   * Output only. Provides details for the errors that led to the Cutover Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Output only. Provides details for the errors that led to the Cutover Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * Output only. Provides details for the errors that led to the Cutover Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * Output only. A message providing possible extra details about the current
   * state.
   * </pre>
   *
   * <code>string state_message = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   * <pre>
   * Output only. A message providing possible extra details about the current
   * state.
   * </pre>
   *
   * <code>string state_message = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString
      getStateMessageBytes();

  /**
   * <pre>
   * Output only. The cutover steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.CutoverStep steps = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.vmmigration.v1.CutoverStep> 
      getStepsList();
  /**
   * <pre>
   * Output only. The cutover steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.CutoverStep steps = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.vmmigration.v1.CutoverStep getSteps(int index);
  /**
   * <pre>
   * Output only. The cutover steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.CutoverStep steps = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getStepsCount();
  /**
   * <pre>
   * Output only. The cutover steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.CutoverStep steps = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.vmmigration.v1.CutoverStepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <pre>
   * Output only. The cutover steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.CutoverStep steps = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.vmmigration.v1.CutoverStepOrBuilder getStepsOrBuilder(
      int index);

  com.google.cloud.vmmigration.v1.CutoverJob.TargetVmDetailsCase getTargetVmDetailsCase();
}
