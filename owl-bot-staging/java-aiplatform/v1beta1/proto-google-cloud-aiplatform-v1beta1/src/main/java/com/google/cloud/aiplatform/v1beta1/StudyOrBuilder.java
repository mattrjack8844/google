// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/study.proto

package com.google.cloud.aiplatform.v1beta1;

public interface StudyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Study)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of a study. The study's globally unique identifier.
   * Format: `projects/{project}/locations/{location}/studies/{study}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of a study. The study's globally unique identifier.
   * Format: `projects/{project}/locations/{location}/studies/{study}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Describes the Study, default value is empty string.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. Describes the Study, default value is empty string.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Configuration of the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.StudySpec study_spec = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the studySpec field is set.
   */
  boolean hasStudySpec();
  /**
   * <pre>
   * Required. Configuration of the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.StudySpec study_spec = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The studySpec.
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec getStudySpec();
  /**
   * <pre>
   * Required. Configuration of the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.StudySpec study_spec = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpecOrBuilder getStudySpecOrBuilder();

  /**
   * <pre>
   * Output only. The detailed state of a Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Study.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The detailed state of a Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Study.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.Study.State getState();

  /**
   * <pre>
   * Output only. Time at which the study was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time at which the study was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time at which the study was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. A human readable reason why the Study is inactive.
   * This should be empty if a study is ACTIVE or COMPLETED.
   * </pre>
   *
   * <code>string inactive_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The inactiveReason.
   */
  java.lang.String getInactiveReason();
  /**
   * <pre>
   * Output only. A human readable reason why the Study is inactive.
   * This should be empty if a study is ACTIVE or COMPLETED.
   * </pre>
   *
   * <code>string inactive_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for inactiveReason.
   */
  com.google.protobuf.ByteString
      getInactiveReasonBytes();
}
