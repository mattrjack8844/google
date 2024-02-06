/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for UpdateEvaluationJob.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest}
 */
public final class UpdateEvaluationJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)
    UpdateEvaluationJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEvaluationJobRequest.newBuilder() to construct.
  private UpdateEvaluationJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEvaluationJobRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEvaluationJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_UpdateEvaluationJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_UpdateEvaluationJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.class,
            com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EVALUATION_JOB_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.EvaluationJob evaluationJob_;
  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the evaluationJob field is set.
   */
  @java.lang.Override
  public boolean hasEvaluationJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The evaluationJob.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJob() {
    return evaluationJob_ == null
        ? com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance()
        : evaluationJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getEvaluationJobOrBuilder() {
    return evaluationJob_ == null
        ? com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance()
        : evaluationJob_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEvaluationJob());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEvaluationJob());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest other =
        (com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest) obj;

    if (hasEvaluationJob() != other.hasEvaluationJob()) return false;
    if (hasEvaluationJob()) {
      if (!getEvaluationJob().equals(other.getEvaluationJob())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEvaluationJob()) {
      hash = (37 * hash) + EVALUATION_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluationJob().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for UpdateEvaluationJob.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)
      com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_UpdateEvaluationJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_UpdateEvaluationJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.class,
              com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEvaluationJobFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      evaluationJob_ = null;
      if (evaluationJobBuilder_ != null) {
        evaluationJobBuilder_.dispose();
        evaluationJobBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_UpdateEvaluationJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest build() {
      com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest buildPartial() {
      com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest result =
          new com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluationJob_ =
            evaluationJobBuilder_ == null ? evaluationJob_ : evaluationJobBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest.getDefaultInstance())
        return this;
      if (other.hasEvaluationJob()) {
        mergeEvaluationJob(other.getEvaluationJob());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getEvaluationJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.datalabeling.v1beta1.EvaluationJob evaluationJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
            com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
        evaluationJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the evaluationJob field is set.
     */
    public boolean hasEvaluationJob() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The evaluationJob.
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJob() {
      if (evaluationJobBuilder_ == null) {
        return evaluationJob_ == null
            ? com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance()
            : evaluationJob_;
      } else {
        return evaluationJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEvaluationJob(com.google.cloud.datalabeling.v1beta1.EvaluationJob value) {
      if (evaluationJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluationJob_ = value;
      } else {
        evaluationJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder builderForValue) {
      if (evaluationJobBuilder_ == null) {
        evaluationJob_ = builderForValue.build();
      } else {
        evaluationJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEvaluationJob(com.google.cloud.datalabeling.v1beta1.EvaluationJob value) {
      if (evaluationJobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && evaluationJob_ != null
            && evaluationJob_
                != com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance()) {
          getEvaluationJobBuilder().mergeFrom(value);
        } else {
          evaluationJob_ = value;
        }
      } else {
        evaluationJobBuilder_.mergeFrom(value);
      }
      if (evaluationJob_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEvaluationJob() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluationJob_ = null;
      if (evaluationJobBuilder_ != null) {
        evaluationJobBuilder_.dispose();
        evaluationJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder getEvaluationJobBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvaluationJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder
        getEvaluationJobOrBuilder() {
      if (evaluationJobBuilder_ != null) {
        return evaluationJobBuilder_.getMessageOrBuilder();
      } else {
        return evaluationJob_ == null
            ? com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance()
            : evaluationJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Evaluation job that is going to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
            com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
        getEvaluationJobFieldBuilder() {
      if (evaluationJobBuilder_ == null) {
        evaluationJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.EvaluationJob,
                com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
                com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>(
                getEvaluationJob(), getParentForChildren(), isClean());
        evaluationJob_ = null;
      }
      return evaluationJobBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Mask for which fields to update. You can only provide the
     * following fields:
     *
     * * `evaluationJobConfig.humanAnnotationConfig.instruction`
     * * `evaluationJobConfig.exampleCount`
     * * `evaluationJobConfig.exampleSamplePercentage`
     *
     * You can provide more than one of these fields by separating them with
     * commas.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)
  private static final com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest();
  }

  public static com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEvaluationJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEvaluationJobRequest>() {
        @java.lang.Override
        public UpdateEvaluationJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateEvaluationJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEvaluationJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
