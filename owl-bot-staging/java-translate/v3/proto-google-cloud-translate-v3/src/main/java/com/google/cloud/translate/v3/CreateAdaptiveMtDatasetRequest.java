// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3;

/**
 * <pre>
 *  Request message for creating an AdaptiveMtDataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest}
 */
public final class CreateAdaptiveMtDatasetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest)
    CreateAdaptiveMtDatasetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAdaptiveMtDatasetRequest.newBuilder() to construct.
  private CreateAdaptiveMtDatasetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAdaptiveMtDatasetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAdaptiveMtDatasetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.class, com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Name of the parent project. In form of
   * `projects/{project-number-or-id}/locations/{location-id}`
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
   * Required. Name of the parent project. In form of
   * `projects/{project-number-or-id}/locations/{location-id}`
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

  public static final int ADAPTIVE_MT_DATASET_FIELD_NUMBER = 2;
  private com.google.cloud.translate.v3.AdaptiveMtDataset adaptiveMtDataset_;
  /**
   * <pre>
   * Required. The AdaptiveMtDataset to be created.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the adaptiveMtDataset field is set.
   */
  @java.lang.Override
  public boolean hasAdaptiveMtDataset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The AdaptiveMtDataset to be created.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adaptiveMtDataset.
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.AdaptiveMtDataset getAdaptiveMtDataset() {
    return adaptiveMtDataset_ == null ? com.google.cloud.translate.v3.AdaptiveMtDataset.getDefaultInstance() : adaptiveMtDataset_;
  }
  /**
   * <pre>
   * Required. The AdaptiveMtDataset to be created.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder getAdaptiveMtDatasetOrBuilder() {
    return adaptiveMtDataset_ == null ? com.google.cloud.translate.v3.AdaptiveMtDataset.getDefaultInstance() : adaptiveMtDataset_;
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
      output.writeMessage(2, getAdaptiveMtDataset());
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
        .computeMessageSize(2, getAdaptiveMtDataset());
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
    if (!(obj instanceof com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest other = (com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAdaptiveMtDataset() != other.hasAdaptiveMtDataset()) return false;
    if (hasAdaptiveMtDataset()) {
      if (!getAdaptiveMtDataset()
          .equals(other.getAdaptiveMtDataset())) return false;
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
    if (hasAdaptiveMtDataset()) {
      hash = (37 * hash) + ADAPTIVE_MT_DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getAdaptiveMtDataset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest prototype) {
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
   *  Request message for creating an AdaptiveMtDataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest)
      com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.class, com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.newBuilder()
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
        getAdaptiveMtDatasetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      adaptiveMtDataset_ = null;
      if (adaptiveMtDatasetBuilder_ != null) {
        adaptiveMtDatasetBuilder_.dispose();
        adaptiveMtDatasetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest build() {
      com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest buildPartial() {
      com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest result = new com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adaptiveMtDataset_ = adaptiveMtDatasetBuilder_ == null
            ? adaptiveMtDataset_
            : adaptiveMtDatasetBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest) {
        return mergeFrom((com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest other) {
      if (other == com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdaptiveMtDataset()) {
        mergeAdaptiveMtDataset(other.getAdaptiveMtDataset());
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
                  getAdaptiveMtDatasetFieldBuilder().getBuilder(),
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
     * Required. Name of the parent project. In form of
     * `projects/{project-number-or-id}/locations/{location-id}`
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
     * Required. Name of the parent project. In form of
     * `projects/{project-number-or-id}/locations/{location-id}`
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
     * Required. Name of the parent project. In form of
     * `projects/{project-number-or-id}/locations/{location-id}`
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
     * Required. Name of the parent project. In form of
     * `projects/{project-number-or-id}/locations/{location-id}`
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
     * Required. Name of the parent project. In form of
     * `projects/{project-number-or-id}/locations/{location-id}`
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

    private com.google.cloud.translate.v3.AdaptiveMtDataset adaptiveMtDataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.translate.v3.AdaptiveMtDataset, com.google.cloud.translate.v3.AdaptiveMtDataset.Builder, com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder> adaptiveMtDatasetBuilder_;
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the adaptiveMtDataset field is set.
     */
    public boolean hasAdaptiveMtDataset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The adaptiveMtDataset.
     */
    public com.google.cloud.translate.v3.AdaptiveMtDataset getAdaptiveMtDataset() {
      if (adaptiveMtDatasetBuilder_ == null) {
        return adaptiveMtDataset_ == null ? com.google.cloud.translate.v3.AdaptiveMtDataset.getDefaultInstance() : adaptiveMtDataset_;
      } else {
        return adaptiveMtDatasetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAdaptiveMtDataset(com.google.cloud.translate.v3.AdaptiveMtDataset value) {
      if (adaptiveMtDatasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adaptiveMtDataset_ = value;
      } else {
        adaptiveMtDatasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAdaptiveMtDataset(
        com.google.cloud.translate.v3.AdaptiveMtDataset.Builder builderForValue) {
      if (adaptiveMtDatasetBuilder_ == null) {
        adaptiveMtDataset_ = builderForValue.build();
      } else {
        adaptiveMtDatasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAdaptiveMtDataset(com.google.cloud.translate.v3.AdaptiveMtDataset value) {
      if (adaptiveMtDatasetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adaptiveMtDataset_ != null &&
          adaptiveMtDataset_ != com.google.cloud.translate.v3.AdaptiveMtDataset.getDefaultInstance()) {
          getAdaptiveMtDatasetBuilder().mergeFrom(value);
        } else {
          adaptiveMtDataset_ = value;
        }
      } else {
        adaptiveMtDatasetBuilder_.mergeFrom(value);
      }
      if (adaptiveMtDataset_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAdaptiveMtDataset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adaptiveMtDataset_ = null;
      if (adaptiveMtDatasetBuilder_ != null) {
        adaptiveMtDatasetBuilder_.dispose();
        adaptiveMtDatasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtDataset.Builder getAdaptiveMtDatasetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdaptiveMtDatasetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder getAdaptiveMtDatasetOrBuilder() {
      if (adaptiveMtDatasetBuilder_ != null) {
        return adaptiveMtDatasetBuilder_.getMessageOrBuilder();
      } else {
        return adaptiveMtDataset_ == null ?
            com.google.cloud.translate.v3.AdaptiveMtDataset.getDefaultInstance() : adaptiveMtDataset_;
      }
    }
    /**
     * <pre>
     * Required. The AdaptiveMtDataset to be created.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.translate.v3.AdaptiveMtDataset, com.google.cloud.translate.v3.AdaptiveMtDataset.Builder, com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder> 
        getAdaptiveMtDatasetFieldBuilder() {
      if (adaptiveMtDatasetBuilder_ == null) {
        adaptiveMtDatasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.AdaptiveMtDataset, com.google.cloud.translate.v3.AdaptiveMtDataset.Builder, com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder>(
                getAdaptiveMtDataset(),
                getParentForChildren(),
                isClean());
        adaptiveMtDataset_ = null;
      }
      return adaptiveMtDatasetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.CreateAdaptiveMtDatasetRequest)
  private static final com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest();
  }

  public static com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAdaptiveMtDatasetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAdaptiveMtDatasetRequest>() {
    @java.lang.Override
    public CreateAdaptiveMtDatasetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAdaptiveMtDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAdaptiveMtDatasetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

