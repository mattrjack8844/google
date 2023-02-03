// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * Response for
 * [GenerateServiceIdentity][google.cloud.tpu.v2alpha1.Tpu.GenerateServiceIdentity].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse}
 */
public final class GenerateServiceIdentityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
    GenerateServiceIdentityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateServiceIdentityResponse.newBuilder() to construct.
  private GenerateServiceIdentityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateServiceIdentityResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateServiceIdentityResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GenerateServiceIdentityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GenerateServiceIdentityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.class, com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.Builder.class);
  }

  public static final int IDENTITY_FIELD_NUMBER = 1;
  private com.google.cloud.tpu.v2alpha1.ServiceIdentity identity_;
  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   * @return Whether the identity field is set.
   */
  @java.lang.Override
  public boolean hasIdentity() {
    return identity_ != null;
  }
  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   * @return The identity.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.ServiceIdentity getIdentity() {
    return identity_ == null ? com.google.cloud.tpu.v2alpha1.ServiceIdentity.getDefaultInstance() : identity_;
  }
  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder getIdentityOrBuilder() {
    return identity_ == null ? com.google.cloud.tpu.v2alpha1.ServiceIdentity.getDefaultInstance() : identity_;
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
    if (identity_ != null) {
      output.writeMessage(1, getIdentity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentity());
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse other = (com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse) obj;

    if (hasIdentity() != other.hasIdentity()) return false;
    if (hasIdentity()) {
      if (!getIdentity()
          .equals(other.getIdentity())) return false;
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
    if (hasIdentity()) {
      hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getIdentity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse prototype) {
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
   * Response for
   * [GenerateServiceIdentity][google.cloud.tpu.v2alpha1.Tpu.GenerateServiceIdentity].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
      com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GenerateServiceIdentityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GenerateServiceIdentityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.class, com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.newBuilder()
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
      identity_ = null;
      if (identityBuilder_ != null) {
        identityBuilder_.dispose();
        identityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GenerateServiceIdentityResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse build() {
      com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse buildPartial() {
      com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse result = new com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.identity_ = identityBuilder_ == null
            ? identity_
            : identityBuilder_.build();
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse other) {
      if (other == com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse.getDefaultInstance()) return this;
      if (other.hasIdentity()) {
        mergeIdentity(other.getIdentity());
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
                  getIdentityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.tpu.v2alpha1.ServiceIdentity identity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.ServiceIdentity, com.google.cloud.tpu.v2alpha1.ServiceIdentity.Builder, com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder> identityBuilder_;
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     * @return Whether the identity field is set.
     */
    public boolean hasIdentity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     * @return The identity.
     */
    public com.google.cloud.tpu.v2alpha1.ServiceIdentity getIdentity() {
      if (identityBuilder_ == null) {
        return identity_ == null ? com.google.cloud.tpu.v2alpha1.ServiceIdentity.getDefaultInstance() : identity_;
      } else {
        return identityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public Builder setIdentity(com.google.cloud.tpu.v2alpha1.ServiceIdentity value) {
      if (identityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identity_ = value;
      } else {
        identityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public Builder setIdentity(
        com.google.cloud.tpu.v2alpha1.ServiceIdentity.Builder builderForValue) {
      if (identityBuilder_ == null) {
        identity_ = builderForValue.build();
      } else {
        identityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public Builder mergeIdentity(com.google.cloud.tpu.v2alpha1.ServiceIdentity value) {
      if (identityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          identity_ != null &&
          identity_ != com.google.cloud.tpu.v2alpha1.ServiceIdentity.getDefaultInstance()) {
          getIdentityBuilder().mergeFrom(value);
        } else {
          identity_ = value;
        }
      } else {
        identityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public Builder clearIdentity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      identity_ = null;
      if (identityBuilder_ != null) {
        identityBuilder_.dispose();
        identityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.ServiceIdentity.Builder getIdentityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdentityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder getIdentityOrBuilder() {
      if (identityBuilder_ != null) {
        return identityBuilder_.getMessageOrBuilder();
      } else {
        return identity_ == null ?
            com.google.cloud.tpu.v2alpha1.ServiceIdentity.getDefaultInstance() : identity_;
      }
    }
    /**
     * <pre>
     * ServiceIdentity that was created or retrieved.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.ServiceIdentity, com.google.cloud.tpu.v2alpha1.ServiceIdentity.Builder, com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder> 
        getIdentityFieldBuilder() {
      if (identityBuilder_ == null) {
        identityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.ServiceIdentity, com.google.cloud.tpu.v2alpha1.ServiceIdentity.Builder, com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder>(
                getIdentity(),
                getParentForChildren(),
                isClean());
        identity_ = null;
      }
      return identityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
  private static final com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse();
  }

  public static com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateServiceIdentityResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateServiceIdentityResponse>() {
    @java.lang.Override
    public GenerateServiceIdentityResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateServiceIdentityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateServiceIdentityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

