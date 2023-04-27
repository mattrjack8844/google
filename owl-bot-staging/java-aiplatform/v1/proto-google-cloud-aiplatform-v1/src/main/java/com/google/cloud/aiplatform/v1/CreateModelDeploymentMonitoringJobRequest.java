// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for
 * [JobService.CreateModelDeploymentMonitoringJob][google.cloud.aiplatform.v1.JobService.CreateModelDeploymentMonitoringJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest}
 */
public final class CreateModelDeploymentMonitoringJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)
    CreateModelDeploymentMonitoringJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateModelDeploymentMonitoringJobRequest.newBuilder() to construct.
  private CreateModelDeploymentMonitoringJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateModelDeploymentMonitoringJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateModelDeploymentMonitoringJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateModelDeploymentMonitoringJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateModelDeploymentMonitoringJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.class, com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent of the ModelDeploymentMonitoringJob.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent of the ModelDeploymentMonitoringJob.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_DEPLOYMENT_MONITORING_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob modelDeploymentMonitoringJob_;
  /**
   * <pre>
   * Required. The ModelDeploymentMonitoringJob to create
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the modelDeploymentMonitoringJob field is set.
   */
  @java.lang.Override
  public boolean hasModelDeploymentMonitoringJob() {
    return modelDeploymentMonitoringJob_ != null;
  }
  /**
   * <pre>
   * Required. The ModelDeploymentMonitoringJob to create
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The modelDeploymentMonitoringJob.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob() {
    return modelDeploymentMonitoringJob_ == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.getDefaultInstance() : modelDeploymentMonitoringJob_;
  }
  /**
   * <pre>
   * Required. The ModelDeploymentMonitoringJob to create
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder getModelDeploymentMonitoringJobOrBuilder() {
    return modelDeploymentMonitoringJob_ == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.getDefaultInstance() : modelDeploymentMonitoringJob_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (modelDeploymentMonitoringJob_ != null) {
      output.writeMessage(2, getModelDeploymentMonitoringJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (modelDeploymentMonitoringJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModelDeploymentMonitoringJob());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest other = (com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasModelDeploymentMonitoringJob() != other.hasModelDeploymentMonitoringJob()) return false;
    if (hasModelDeploymentMonitoringJob()) {
      if (!getModelDeploymentMonitoringJob()
          .equals(other.getModelDeploymentMonitoringJob())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasModelDeploymentMonitoringJob()) {
      hash = (37 * hash) + MODEL_DEPLOYMENT_MONITORING_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getModelDeploymentMonitoringJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for
   * [JobService.CreateModelDeploymentMonitoringJob][google.cloud.aiplatform.v1.JobService.CreateModelDeploymentMonitoringJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)
      com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateModelDeploymentMonitoringJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateModelDeploymentMonitoringJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.class, com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      modelDeploymentMonitoringJob_ = null;
      if (modelDeploymentMonitoringJobBuilder_ != null) {
        modelDeploymentMonitoringJobBuilder_.dispose();
        modelDeploymentMonitoringJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateModelDeploymentMonitoringJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest build() {
      com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest result = new com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.modelDeploymentMonitoringJob_ = modelDeploymentMonitoringJobBuilder_ == null
            ? modelDeploymentMonitoringJob_
            : modelDeploymentMonitoringJobBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasModelDeploymentMonitoringJob()) {
        mergeModelDeploymentMonitoringJob(other.getModelDeploymentMonitoringJob());
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getModelDeploymentMonitoringJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent of the ModelDeploymentMonitoringJob.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent of the ModelDeploymentMonitoringJob.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent of the ModelDeploymentMonitoringJob.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent of the ModelDeploymentMonitoringJob.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent of the ModelDeploymentMonitoringJob.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob modelDeploymentMonitoringJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.Builder, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder> modelDeploymentMonitoringJobBuilder_;
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the modelDeploymentMonitoringJob field is set.
     */
    public boolean hasModelDeploymentMonitoringJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The modelDeploymentMonitoringJob.
     */
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob() {
      if (modelDeploymentMonitoringJobBuilder_ == null) {
        return modelDeploymentMonitoringJob_ == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.getDefaultInstance() : modelDeploymentMonitoringJob_;
      } else {
        return modelDeploymentMonitoringJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setModelDeploymentMonitoringJob(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob value) {
      if (modelDeploymentMonitoringJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelDeploymentMonitoringJob_ = value;
      } else {
        modelDeploymentMonitoringJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setModelDeploymentMonitoringJob(
        com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.Builder builderForValue) {
      if (modelDeploymentMonitoringJobBuilder_ == null) {
        modelDeploymentMonitoringJob_ = builderForValue.build();
      } else {
        modelDeploymentMonitoringJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeModelDeploymentMonitoringJob(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob value) {
      if (modelDeploymentMonitoringJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          modelDeploymentMonitoringJob_ != null &&
          modelDeploymentMonitoringJob_ != com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.getDefaultInstance()) {
          getModelDeploymentMonitoringJobBuilder().mergeFrom(value);
        } else {
          modelDeploymentMonitoringJob_ = value;
        }
      } else {
        modelDeploymentMonitoringJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearModelDeploymentMonitoringJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      modelDeploymentMonitoringJob_ = null;
      if (modelDeploymentMonitoringJobBuilder_ != null) {
        modelDeploymentMonitoringJobBuilder_.dispose();
        modelDeploymentMonitoringJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.Builder getModelDeploymentMonitoringJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getModelDeploymentMonitoringJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder getModelDeploymentMonitoringJobOrBuilder() {
      if (modelDeploymentMonitoringJobBuilder_ != null) {
        return modelDeploymentMonitoringJobBuilder_.getMessageOrBuilder();
      } else {
        return modelDeploymentMonitoringJob_ == null ?
            com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.getDefaultInstance() : modelDeploymentMonitoringJob_;
      }
    }
    /**
     * <pre>
     * Required. The ModelDeploymentMonitoringJob to create
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.Builder, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder> 
        getModelDeploymentMonitoringJobFieldBuilder() {
      if (modelDeploymentMonitoringJobBuilder_ == null) {
        modelDeploymentMonitoringJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.Builder, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder>(
                getModelDeploymentMonitoringJob(),
                getParentForChildren(),
                isClean());
        modelDeploymentMonitoringJob_ = null;
      }
      return modelDeploymentMonitoringJobBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest)
  private static final com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateModelDeploymentMonitoringJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateModelDeploymentMonitoringJobRequest>() {
    @java.lang.Override
    public CreateModelDeploymentMonitoringJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateModelDeploymentMonitoringJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateModelDeploymentMonitoringJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

