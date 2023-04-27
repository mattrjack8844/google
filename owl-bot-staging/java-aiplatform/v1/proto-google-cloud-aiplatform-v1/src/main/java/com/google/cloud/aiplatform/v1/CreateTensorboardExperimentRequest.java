// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for
 * [TensorboardService.CreateTensorboardExperiment][google.cloud.aiplatform.v1.TensorboardService.CreateTensorboardExperiment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest}
 */
public final class CreateTensorboardExperimentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)
    CreateTensorboardExperimentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTensorboardExperimentRequest.newBuilder() to construct.
  private CreateTensorboardExperimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTensorboardExperimentRequest() {
    parent_ = "";
    tensorboardExperimentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTensorboardExperimentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardExperimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardExperimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.class, com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the Tensorboard to create the
   * TensorboardExperiment in. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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
   * Required. The resource name of the Tensorboard to create the
   * TensorboardExperiment in. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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

  public static final int TENSORBOARD_EXPERIMENT_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.TensorboardExperiment tensorboardExperiment_;
  /**
   * <pre>
   * The TensorboardExperiment to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
   * @return Whether the tensorboardExperiment field is set.
   */
  @java.lang.Override
  public boolean hasTensorboardExperiment() {
    return tensorboardExperiment_ != null;
  }
  /**
   * <pre>
   * The TensorboardExperiment to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
   * @return The tensorboardExperiment.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardExperiment getTensorboardExperiment() {
    return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
  }
  /**
   * <pre>
   * The TensorboardExperiment to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder getTensorboardExperimentOrBuilder() {
    return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
  }

  public static final int TENSORBOARD_EXPERIMENT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tensorboardExperimentId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the Tensorboard experiment, which becomes the
   * final component of the Tensorboard experiment's resource name.
   * This value should be 1-128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardExperimentId.
   */
  @java.lang.Override
  public java.lang.String getTensorboardExperimentId() {
    java.lang.Object ref = tensorboardExperimentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tensorboardExperimentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the Tensorboard experiment, which becomes the
   * final component of the Tensorboard experiment's resource name.
   * This value should be 1-128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tensorboardExperimentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTensorboardExperimentIdBytes() {
    java.lang.Object ref = tensorboardExperimentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tensorboardExperimentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (tensorboardExperiment_ != null) {
      output.writeMessage(2, getTensorboardExperiment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardExperimentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tensorboardExperimentId_);
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
    if (tensorboardExperiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTensorboardExperiment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardExperimentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tensorboardExperimentId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest other = (com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasTensorboardExperiment() != other.hasTensorboardExperiment()) return false;
    if (hasTensorboardExperiment()) {
      if (!getTensorboardExperiment()
          .equals(other.getTensorboardExperiment())) return false;
    }
    if (!getTensorboardExperimentId()
        .equals(other.getTensorboardExperimentId())) return false;
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
    if (hasTensorboardExperiment()) {
      hash = (37 * hash) + TENSORBOARD_EXPERIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardExperiment().hashCode();
    }
    hash = (37 * hash) + TENSORBOARD_EXPERIMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTensorboardExperimentId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest prototype) {
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
   * [TensorboardService.CreateTensorboardExperiment][google.cloud.aiplatform.v1.TensorboardService.CreateTensorboardExperiment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)
      com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardExperimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardExperimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.class, com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.newBuilder()
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
      tensorboardExperiment_ = null;
      if (tensorboardExperimentBuilder_ != null) {
        tensorboardExperimentBuilder_.dispose();
        tensorboardExperimentBuilder_ = null;
      }
      tensorboardExperimentId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardExperimentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest build() {
      com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest result = new com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tensorboardExperiment_ = tensorboardExperimentBuilder_ == null
            ? tensorboardExperiment_
            : tensorboardExperimentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tensorboardExperimentId_ = tensorboardExperimentId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTensorboardExperiment()) {
        mergeTensorboardExperiment(other.getTensorboardExperiment());
      }
      if (!other.getTensorboardExperimentId().isEmpty()) {
        tensorboardExperimentId_ = other.tensorboardExperimentId_;
        bitField0_ |= 0x00000004;
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTensorboardExperimentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              tensorboardExperimentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * Required. The resource name of the Tensorboard to create the
     * TensorboardExperiment in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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
     * Required. The resource name of the Tensorboard to create the
     * TensorboardExperiment in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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
     * Required. The resource name of the Tensorboard to create the
     * TensorboardExperiment in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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
     * Required. The resource name of the Tensorboard to create the
     * TensorboardExperiment in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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
     * Required. The resource name of the Tensorboard to create the
     * TensorboardExperiment in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
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

    private com.google.cloud.aiplatform.v1.TensorboardExperiment tensorboardExperiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder> tensorboardExperimentBuilder_;
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     * @return Whether the tensorboardExperiment field is set.
     */
    public boolean hasTensorboardExperiment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     * @return The tensorboardExperiment.
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperiment getTensorboardExperiment() {
      if (tensorboardExperimentBuilder_ == null) {
        return tensorboardExperiment_ == null ? com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
      } else {
        return tensorboardExperimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public Builder setTensorboardExperiment(com.google.cloud.aiplatform.v1.TensorboardExperiment value) {
      if (tensorboardExperimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorboardExperiment_ = value;
      } else {
        tensorboardExperimentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public Builder setTensorboardExperiment(
        com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder builderForValue) {
      if (tensorboardExperimentBuilder_ == null) {
        tensorboardExperiment_ = builderForValue.build();
      } else {
        tensorboardExperimentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public Builder mergeTensorboardExperiment(com.google.cloud.aiplatform.v1.TensorboardExperiment value) {
      if (tensorboardExperimentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tensorboardExperiment_ != null &&
          tensorboardExperiment_ != com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance()) {
          getTensorboardExperimentBuilder().mergeFrom(value);
        } else {
          tensorboardExperiment_ = value;
        }
      } else {
        tensorboardExperimentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public Builder clearTensorboardExperiment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tensorboardExperiment_ = null;
      if (tensorboardExperimentBuilder_ != null) {
        tensorboardExperimentBuilder_.dispose();
        tensorboardExperimentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder getTensorboardExperimentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTensorboardExperimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder getTensorboardExperimentOrBuilder() {
      if (tensorboardExperimentBuilder_ != null) {
        return tensorboardExperimentBuilder_.getMessageOrBuilder();
      } else {
        return tensorboardExperiment_ == null ?
            com.google.cloud.aiplatform.v1.TensorboardExperiment.getDefaultInstance() : tensorboardExperiment_;
      }
    }
    /**
     * <pre>
     * The TensorboardExperiment to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder> 
        getTensorboardExperimentFieldBuilder() {
      if (tensorboardExperimentBuilder_ == null) {
        tensorboardExperimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardExperiment, com.google.cloud.aiplatform.v1.TensorboardExperiment.Builder, com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder>(
                getTensorboardExperiment(),
                getParentForChildren(),
                isClean());
        tensorboardExperiment_ = null;
      }
      return tensorboardExperimentBuilder_;
    }

    private java.lang.Object tensorboardExperimentId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard experiment, which becomes the
     * final component of the Tensorboard experiment's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tensorboardExperimentId.
     */
    public java.lang.String getTensorboardExperimentId() {
      java.lang.Object ref = tensorboardExperimentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tensorboardExperimentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard experiment, which becomes the
     * final component of the Tensorboard experiment's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for tensorboardExperimentId.
     */
    public com.google.protobuf.ByteString
        getTensorboardExperimentIdBytes() {
      java.lang.Object ref = tensorboardExperimentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tensorboardExperimentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard experiment, which becomes the
     * final component of the Tensorboard experiment's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The tensorboardExperimentId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardExperimentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tensorboardExperimentId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard experiment, which becomes the
     * final component of the Tensorboard experiment's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTensorboardExperimentId() {
      tensorboardExperimentId_ = getDefaultInstance().getTensorboardExperimentId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard experiment, which becomes the
     * final component of the Tensorboard experiment's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_experiment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for tensorboardExperimentId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardExperimentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tensorboardExperimentId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest)
  private static final com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTensorboardExperimentRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTensorboardExperimentRequest>() {
    @java.lang.Override
    public CreateTensorboardExperimentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTensorboardExperimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTensorboardExperimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateTensorboardExperimentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

