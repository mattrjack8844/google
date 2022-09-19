// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * Request for
 * [GetGuestAttributes][google.cloud.tpu.v2alpha1.Tpu.GetGuestAttributes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.GetGuestAttributesRequest}
 */
public final class GetGuestAttributesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)
    GetGuestAttributesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGuestAttributesRequest.newBuilder() to construct.
  private GetGuestAttributesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGuestAttributesRequest() {
    name_ = "";
    queryPath_ = "";
    workerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGuestAttributesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGuestAttributesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            queryPath_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              workerIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            workerIds_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        workerIds_ = workerIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.class, com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object queryPath_;
  /**
   * <pre>
   * The guest attributes path to be queried.
   * </pre>
   *
   * <code>string query_path = 2;</code>
   * @return The queryPath.
   */
  @java.lang.Override
  public java.lang.String getQueryPath() {
    java.lang.Object ref = queryPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The guest attributes path to be queried.
   * </pre>
   *
   * <code>string query_path = 2;</code>
   * @return The bytes for queryPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryPathBytes() {
    java.lang.Object ref = queryPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKER_IDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList workerIds_;
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @return A list containing the workerIds.
   */
  public com.google.protobuf.ProtocolStringList
      getWorkerIdsList() {
    return workerIds_;
  }
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @return The count of workerIds.
   */
  public int getWorkerIdsCount() {
    return workerIds_.size();
  }
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @param index The index of the element to return.
   * @return The workerIds at the given index.
   */
  public java.lang.String getWorkerIds(int index) {
    return workerIds_.get(index);
  }
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the workerIds at the given index.
   */
  public com.google.protobuf.ByteString
      getWorkerIdsBytes(int index) {
    return workerIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, queryPath_);
    }
    for (int i = 0; i < workerIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, workerIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, queryPath_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < workerIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(workerIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWorkerIdsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest other = (com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getQueryPath()
        .equals(other.getQueryPath())) return false;
    if (!getWorkerIdsList()
        .equals(other.getWorkerIdsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + QUERY_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getQueryPath().hashCode();
    if (getWorkerIdsCount() > 0) {
      hash = (37 * hash) + WORKER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest prototype) {
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
   * Request for
   * [GetGuestAttributes][google.cloud.tpu.v2alpha1.Tpu.GetGuestAttributes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.GetGuestAttributesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.class, com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      queryPath_ = "";

      workerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest build() {
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest buildPartial() {
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest result = new com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.queryPath_ = queryPath_;
      if (((bitField0_ & 0x00000001) != 0)) {
        workerIds_ = workerIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.workerIds_ = workerIds_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest other) {
      if (other == com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getQueryPath().isEmpty()) {
        queryPath_ = other.queryPath_;
        onChanged();
      }
      if (!other.workerIds_.isEmpty()) {
        if (workerIds_.isEmpty()) {
          workerIds_ = other.workerIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWorkerIdsIsMutable();
          workerIds_.addAll(other.workerIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object queryPath_ = "";
    /**
     * <pre>
     * The guest attributes path to be queried.
     * </pre>
     *
     * <code>string query_path = 2;</code>
     * @return The queryPath.
     */
    public java.lang.String getQueryPath() {
      java.lang.Object ref = queryPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The guest attributes path to be queried.
     * </pre>
     *
     * <code>string query_path = 2;</code>
     * @return The bytes for queryPath.
     */
    public com.google.protobuf.ByteString
        getQueryPathBytes() {
      java.lang.Object ref = queryPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The guest attributes path to be queried.
     * </pre>
     *
     * <code>string query_path = 2;</code>
     * @param value The queryPath to set.
     * @return This builder for chaining.
     */
    public Builder setQueryPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queryPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The guest attributes path to be queried.
     * </pre>
     *
     * <code>string query_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryPath() {
      
      queryPath_ = getDefaultInstance().getQueryPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The guest attributes path to be queried.
     * </pre>
     *
     * <code>string query_path = 2;</code>
     * @param value The bytes for queryPath to set.
     * @return This builder for chaining.
     */
    public Builder setQueryPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queryPath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList workerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWorkerIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        workerIds_ = new com.google.protobuf.LazyStringArrayList(workerIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @return A list containing the workerIds.
     */
    public com.google.protobuf.ProtocolStringList
        getWorkerIdsList() {
      return workerIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @return The count of workerIds.
     */
    public int getWorkerIdsCount() {
      return workerIds_.size();
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param index The index of the element to return.
     * @return The workerIds at the given index.
     */
    public java.lang.String getWorkerIds(int index) {
      return workerIds_.get(index);
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the workerIds at the given index.
     */
    public com.google.protobuf.ByteString
        getWorkerIdsBytes(int index) {
      return workerIds_.getByteString(index);
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param index The index to set the value at.
     * @param value The workerIds to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWorkerIdsIsMutable();
      workerIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param value The workerIds to add.
     * @return This builder for chaining.
     */
    public Builder addWorkerIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWorkerIdsIsMutable();
      workerIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param values The workerIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllWorkerIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureWorkerIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, workerIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkerIds() {
      workerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
     * returned.
     * </pre>
     *
     * <code>repeated string worker_ids = 3;</code>
     * @param value The bytes of the workerIds to add.
     * @return This builder for chaining.
     */
    public Builder addWorkerIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWorkerIdsIsMutable();
      workerIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.GetGuestAttributesRequest)
  private static final com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest();
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGuestAttributesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetGuestAttributesRequest>() {
    @java.lang.Override
    public GetGuestAttributesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGuestAttributesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGuestAttributesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGuestAttributesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GetGuestAttributesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

