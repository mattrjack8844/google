// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Represents the metadata of the long-running operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.OperationMetadata}
 */
public final class OperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.OperationMetadata)
    OperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationMetadata.newBuilder() to construct.
  private OperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationMetadata() {
    target_ = "";
    verb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_OperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_OperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.OperationMetadata.class, com.google.cloud.video.stitcher.v1.OperationMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endTime_;
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }

  public static final int TARGET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object target_ = "";
  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The target.
   */
  @java.lang.Override
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The bytes for target.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERB_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object verb_ = "";
  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The verb.
   */
  @java.lang.Override
  public java.lang.String getVerb() {
    java.lang.Object ref = verb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      verb_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The bytes for verb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVerbBytes() {
    java.lang.Object ref = verb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verb_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCreateTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEndTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(verb_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, verb_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreateTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(verb_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, verb_);
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.OperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.OperationMetadata other = (com.google.cloud.video.stitcher.v1.OperationMetadata) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime()
          .equals(other.getEndTime())) return false;
    }
    if (!getTarget()
        .equals(other.getTarget())) return false;
    if (!getVerb()
        .equals(other.getVerb())) return false;
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
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + VERB_FIELD_NUMBER;
    hash = (53 * hash) + getVerb().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.OperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.OperationMetadata prototype) {
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
   * Represents the metadata of the long-running operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.OperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.OperationMetadata)
      com.google.cloud.video.stitcher.v1.OperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_OperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_OperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.OperationMetadata.class, com.google.cloud.video.stitcher.v1.OperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.OperationMetadata.newBuilder()
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
        getCreateTimeFieldBuilder();
        getEndTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      target_ = "";
      verb_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_OperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.OperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.OperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.OperationMetadata build() {
      com.google.cloud.video.stitcher.v1.OperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.OperationMetadata buildPartial() {
      com.google.cloud.video.stitcher.v1.OperationMetadata result = new com.google.cloud.video.stitcher.v1.OperationMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.OperationMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endTime_ = endTimeBuilder_ == null
            ? endTime_
            : endTimeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.target_ = target_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.verb_ = verb_;
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
      if (other instanceof com.google.cloud.video.stitcher.v1.OperationMetadata) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.OperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.OperationMetadata other) {
      if (other == com.google.cloud.video.stitcher.v1.OperationMetadata.getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getVerb().isEmpty()) {
        verb_ = other.verb_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              target_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              verb_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      if (createTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
      } else {
        endTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endTime_ != null &&
          endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      if (endTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     * <pre>
     * The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndTime(),
                getParentForChildren(),
                isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * Server-defined resource path for the target of the operation.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return The target.
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Server-defined resource path for the target of the operation.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return The bytes for target.
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Server-defined resource path for the target of the operation.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      target_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server-defined resource path for the target of the operation.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      target_ = getDefaultInstance().getTarget();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server-defined resource path for the target of the operation.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @param value The bytes for target to set.
     * @return This builder for chaining.
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      target_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object verb_ = "";
    /**
     * <pre>
     * Name of the verb executed by the operation.
     * </pre>
     *
     * <code>string verb = 4;</code>
     * @return The verb.
     */
    public java.lang.String getVerb() {
      java.lang.Object ref = verb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        verb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the verb executed by the operation.
     * </pre>
     *
     * <code>string verb = 4;</code>
     * @return The bytes for verb.
     */
    public com.google.protobuf.ByteString
        getVerbBytes() {
      java.lang.Object ref = verb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the verb executed by the operation.
     * </pre>
     *
     * <code>string verb = 4;</code>
     * @param value The verb to set.
     * @return This builder for chaining.
     */
    public Builder setVerb(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      verb_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the verb executed by the operation.
     * </pre>
     *
     * <code>string verb = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerb() {
      verb_ = getDefaultInstance().getVerb();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the verb executed by the operation.
     * </pre>
     *
     * <code>string verb = 4;</code>
     * @param value The bytes for verb to set.
     * @return This builder for chaining.
     */
    public Builder setVerbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      verb_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.OperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.OperationMetadata)
  private static final com.google.cloud.video.stitcher.v1.OperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.OperationMetadata();
  }

  public static com.google.cloud.video.stitcher.v1.OperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<OperationMetadata>() {
    @java.lang.Override
    public OperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<OperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.OperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

