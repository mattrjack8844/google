// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

/**
 * <pre>
 * Request message for creating a Job.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.CreateJobRequest}
 */
public final class CreateJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.CreateJobRequest)
    CreateJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateJobRequest.newBuilder() to construct.
  private CreateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateJobRequest() {
    parent_ = "";
    jobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.run.v2.JobProto.internal_static_google_cloud_run_v2_CreateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.JobProto.internal_static_google_cloud_run_v2_CreateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.CreateJobRequest.class, com.google.cloud.run.v2.CreateJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The location and project in which this Job should be created.
   * Format: projects/{project}/locations/{location}, where {project} can be
   * project id or number.
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
   * Required. The location and project in which this Job should be created.
   * Format: projects/{project}/locations/{location}, where {project} can be
   * project id or number.
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

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.cloud.run.v2.Job job_;
  /**
   * <pre>
   * Required. The Job instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The Job instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  @java.lang.Override
  public com.google.cloud.run.v2.Job getJob() {
    return job_ == null ? com.google.cloud.run.v2.Job.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * Required. The Job instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.run.v2.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.cloud.run.v2.Job.getDefaultInstance() : job_;
  }

  public static final int JOB_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jobId_ = "";
  /**
   * <pre>
   * Required. The unique identifier for the Job. The name of the job becomes
   * {parent}/jobs/{job_id}.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The unique identifier for the Job. The name of the job becomes
   * {parent}/jobs/{job_id}.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * Indicates that the request should be validated and default values
   * populated, without persisting the request or creating any resources.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobId_);
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobId_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.run.v2.CreateJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.CreateJobRequest other = (com.google.cloud.run.v2.CreateJobRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob()
          .equals(other.getJob())) return false;
    }
    if (!getJobId()
        .equals(other.getJobId())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.CreateJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.CreateJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.run.v2.CreateJobRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.run.v2.CreateJobRequest prototype) {
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
   * Request message for creating a Job.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.CreateJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.CreateJobRequest)
      com.google.cloud.run.v2.CreateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.run.v2.JobProto.internal_static_google_cloud_run_v2_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.JobProto.internal_static_google_cloud_run_v2_CreateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.CreateJobRequest.class, com.google.cloud.run.v2.CreateJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.CreateJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getJobFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      jobId_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.run.v2.JobProto.internal_static_google_cloud_run_v2_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.CreateJobRequest getDefaultInstanceForType() {
      return com.google.cloud.run.v2.CreateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.CreateJobRequest build() {
      com.google.cloud.run.v2.CreateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.CreateJobRequest buildPartial() {
      com.google.cloud.run.v2.CreateJobRequest result = new com.google.cloud.run.v2.CreateJobRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.CreateJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.job_ = jobBuilder_ == null
            ? job_
            : jobBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jobId_ = jobId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.run.v2.CreateJobRequest) {
        return mergeFrom((com.google.cloud.run.v2.CreateJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.CreateJobRequest other) {
      if (other == com.google.cloud.run.v2.CreateJobRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                  getJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              jobId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * Required. The location and project in which this Job should be created.
     * Format: projects/{project}/locations/{location}, where {project} can be
     * project id or number.
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
     * Required. The location and project in which this Job should be created.
     * Format: projects/{project}/locations/{location}, where {project} can be
     * project id or number.
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
     * Required. The location and project in which this Job should be created.
     * Format: projects/{project}/locations/{location}, where {project} can be
     * project id or number.
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
     * Required. The location and project in which this Job should be created.
     * Format: projects/{project}/locations/{location}, where {project} can be
     * project id or number.
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
     * Required. The location and project in which this Job should be created.
     * Format: projects/{project}/locations/{location}, where {project} can be
     * project id or number.
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

    private com.google.cloud.run.v2.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.run.v2.Job, com.google.cloud.run.v2.Job.Builder, com.google.cloud.run.v2.JobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The job.
     */
    public com.google.cloud.run.v2.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.run.v2.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(com.google.cloud.run.v2.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(
        com.google.cloud.run.v2.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeJob(com.google.cloud.run.v2.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          job_ != null &&
          job_ != com.google.cloud.run.v2.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      if (job_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.run.v2.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.run.v2.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.cloud.run.v2.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * Required. The Job instance to create.
     * </pre>
     *
     * <code>.google.cloud.run.v2.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.run.v2.Job, com.google.cloud.run.v2.Job.Builder, com.google.cloud.run.v2.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.run.v2.Job, com.google.cloud.run.v2.Job.Builder, com.google.cloud.run.v2.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private java.lang.Object jobId_ = "";
    /**
     * <pre>
     * Required. The unique identifier for the Job. The name of the job becomes
     * {parent}/jobs/{job_id}.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique identifier for the Job. The name of the job becomes
     * {parent}/jobs/{job_id}.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString
        getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The unique identifier for the Job. The name of the job becomes
     * {parent}/jobs/{job_id}.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique identifier for the Job. The name of the job becomes
     * {parent}/jobs/{job_id}.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      jobId_ = getDefaultInstance().getJobId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique identifier for the Job. The name of the job becomes
     * {parent}/jobs/{job_id}.
     * </pre>
     *
     * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Indicates that the request should be validated and default values
     * populated, without persisting the request or creating any resources.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Indicates that the request should be validated and default values
     * populated, without persisting the request or creating any resources.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that the request should be validated and default values
     * populated, without persisting the request or creating any resources.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.CreateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.CreateJobRequest)
  private static final com.google.cloud.run.v2.CreateJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.CreateJobRequest();
  }

  public static com.google.cloud.run.v2.CreateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateJobRequest>() {
    @java.lang.Override
    public CreateJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.CreateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

