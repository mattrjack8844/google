// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_data.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * One point viewable on a tensor metric plot.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.TensorboardTensor}
 */
public final class TensorboardTensor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.TensorboardTensor)
    TensorboardTensorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TensorboardTensor.newBuilder() to construct.
  private TensorboardTensor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorboardTensor() {
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TensorboardTensor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardTensor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardTensor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.TensorboardTensor.class, com.google.cloud.aiplatform.v1beta1.TensorboardTensor.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * </pre>
   *
   * <code>bytes value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int VERSION_NUMBER_FIELD_NUMBER = 2;
  private int versionNumber_ = 0;
  /**
   * <pre>
   * Optional. Version number of TensorProto used to serialize
   * [value][google.cloud.aiplatform.v1beta1.TensorboardTensor.value].
   * </pre>
   *
   * <code>int32 version_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The versionNumber.
   */
  @java.lang.Override
  public int getVersionNumber() {
    return versionNumber_;
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
    if (!value_.isEmpty()) {
      output.writeBytes(1, value_);
    }
    if (versionNumber_ != 0) {
      output.writeInt32(2, versionNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, value_);
    }
    if (versionNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, versionNumber_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.TensorboardTensor)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.TensorboardTensor other = (com.google.cloud.aiplatform.v1beta1.TensorboardTensor) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (getVersionNumber()
        != other.getVersionNumber()) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + VERSION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getVersionNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.TensorboardTensor prototype) {
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
   * One point viewable on a tensor metric plot.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.TensorboardTensor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.TensorboardTensor)
      com.google.cloud.aiplatform.v1beta1.TensorboardTensorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardTensor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardTensor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.TensorboardTensor.class, com.google.cloud.aiplatform.v1beta1.TensorboardTensor.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.TensorboardTensor.newBuilder()
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
      value_ = com.google.protobuf.ByteString.EMPTY;
      versionNumber_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardTensor_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardTensor getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardTensor.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardTensor build() {
      com.google.cloud.aiplatform.v1beta1.TensorboardTensor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardTensor buildPartial() {
      com.google.cloud.aiplatform.v1beta1.TensorboardTensor result = new com.google.cloud.aiplatform.v1beta1.TensorboardTensor(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.TensorboardTensor result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.versionNumber_ = versionNumber_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.TensorboardTensor) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.TensorboardTensor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.TensorboardTensor other) {
      if (other == com.google.cloud.aiplatform.v1beta1.TensorboardTensor.getDefaultInstance()) return this;
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getVersionNumber() != 0) {
        setVersionNumber(other.getVersionNumber());
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
              value_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              versionNumber_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Required. Serialized form of
     * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
     * </pre>
     *
     * <code>bytes value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * Required. Serialized form of
     * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
     * </pre>
     *
     * <code>bytes value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Serialized form of
     * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
     * </pre>
     *
     * <code>bytes value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private int versionNumber_ ;
    /**
     * <pre>
     * Optional. Version number of TensorProto used to serialize
     * [value][google.cloud.aiplatform.v1beta1.TensorboardTensor.value].
     * </pre>
     *
     * <code>int32 version_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The versionNumber.
     */
    @java.lang.Override
    public int getVersionNumber() {
      return versionNumber_;
    }
    /**
     * <pre>
     * Optional. Version number of TensorProto used to serialize
     * [value][google.cloud.aiplatform.v1beta1.TensorboardTensor.value].
     * </pre>
     *
     * <code>int32 version_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The versionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNumber(int value) {
      
      versionNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Version number of TensorProto used to serialize
     * [value][google.cloud.aiplatform.v1beta1.TensorboardTensor.value].
     * </pre>
     *
     * <code>int32 version_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersionNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      versionNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.TensorboardTensor)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.TensorboardTensor)
  private static final com.google.cloud.aiplatform.v1beta1.TensorboardTensor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.TensorboardTensor();
  }

  public static com.google.cloud.aiplatform.v1beta1.TensorboardTensor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorboardTensor>
      PARSER = new com.google.protobuf.AbstractParser<TensorboardTensor>() {
    @java.lang.Override
    public TensorboardTensor parsePartialFrom(
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

  public static com.google.protobuf.Parser<TensorboardTensor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TensorboardTensor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardTensor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

