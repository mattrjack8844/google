// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for
 * [IndexService.RemoveDatapoints][google.cloud.aiplatform.v1.IndexService.RemoveDatapoints]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.RemoveDatapointsRequest}
 */
public final class RemoveDatapointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.RemoveDatapointsRequest)
    RemoveDatapointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveDatapointsRequest.newBuilder() to construct.
  private RemoveDatapointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveDatapointsRequest() {
    index_ = "";
    datapointIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveDatapointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.class, com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object index_ = "";
  /**
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The index.
   */
  @java.lang.Override
  public java.lang.String getIndex() {
    java.lang.Object ref = index_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      index_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIndexBytes() {
    java.lang.Object ref = index_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      index_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATAPOINT_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList datapointIds_;
  /**
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   * @return A list containing the datapointIds.
   */
  public com.google.protobuf.ProtocolStringList
      getDatapointIdsList() {
    return datapointIds_;
  }
  /**
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   * @return The count of datapointIds.
   */
  public int getDatapointIdsCount() {
    return datapointIds_.size();
  }
  /**
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The datapointIds at the given index.
   */
  public java.lang.String getDatapointIds(int index) {
    return datapointIds_.get(index);
  }
  /**
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the datapointIds at the given index.
   */
  public com.google.protobuf.ByteString
      getDatapointIdsBytes(int index) {
    return datapointIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(index_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, index_);
    }
    for (int i = 0; i < datapointIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, datapointIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(index_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, index_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < datapointIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(datapointIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDatapointIdsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.RemoveDatapointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.RemoveDatapointsRequest other = (com.google.cloud.aiplatform.v1.RemoveDatapointsRequest) obj;

    if (!getIndex()
        .equals(other.getIndex())) return false;
    if (!getDatapointIdsList()
        .equals(other.getDatapointIdsList())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex().hashCode();
    if (getDatapointIdsCount() > 0) {
      hash = (37 * hash) + DATAPOINT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDatapointIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.RemoveDatapointsRequest prototype) {
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
   * [IndexService.RemoveDatapoints][google.cloud.aiplatform.v1.IndexService.RemoveDatapoints]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.RemoveDatapointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.RemoveDatapointsRequest)
      com.google.cloud.aiplatform.v1.RemoveDatapointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.class, com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.newBuilder()
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
      index_ = "";
      datapointIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RemoveDatapointsRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RemoveDatapointsRequest build() {
      com.google.cloud.aiplatform.v1.RemoveDatapointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RemoveDatapointsRequest buildPartial() {
      com.google.cloud.aiplatform.v1.RemoveDatapointsRequest result = new com.google.cloud.aiplatform.v1.RemoveDatapointsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.RemoveDatapointsRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        datapointIds_ = datapointIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.datapointIds_ = datapointIds_;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.RemoveDatapointsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.index_ = index_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.RemoveDatapointsRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.RemoveDatapointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.RemoveDatapointsRequest other) {
      if (other == com.google.cloud.aiplatform.v1.RemoveDatapointsRequest.getDefaultInstance()) return this;
      if (!other.getIndex().isEmpty()) {
        index_ = other.index_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.datapointIds_.isEmpty()) {
        if (datapointIds_.isEmpty()) {
          datapointIds_ = other.datapointIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDatapointIdsIsMutable();
          datapointIds_.addAll(other.datapointIds_);
        }
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
              index_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDatapointIdsIsMutable();
              datapointIds_.add(s);
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

    private java.lang.Object index_ = "";
    /**
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The index.
     */
    public java.lang.String getIndex() {
      java.lang.Object ref = index_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        index_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for index.
     */
    public com.google.protobuf.ByteString
        getIndexBytes() {
      java.lang.Object ref = index_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        index_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      index_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      index_ = getDefaultInstance().getIndex();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for index to set.
     * @return This builder for chaining.
     */
    public Builder setIndexBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      index_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList datapointIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDatapointIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        datapointIds_ = new com.google.protobuf.LazyStringArrayList(datapointIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @return A list containing the datapointIds.
     */
    public com.google.protobuf.ProtocolStringList
        getDatapointIdsList() {
      return datapointIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @return The count of datapointIds.
     */
    public int getDatapointIdsCount() {
      return datapointIds_.size();
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The datapointIds at the given index.
     */
    public java.lang.String getDatapointIds(int index) {
      return datapointIds_.get(index);
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the datapointIds at the given index.
     */
    public com.google.protobuf.ByteString
        getDatapointIdsBytes(int index) {
      return datapointIds_.getByteString(index);
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The datapointIds to set.
     * @return This builder for chaining.
     */
    public Builder setDatapointIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDatapointIdsIsMutable();
      datapointIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param value The datapointIds to add.
     * @return This builder for chaining.
     */
    public Builder addDatapointIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDatapointIdsIsMutable();
      datapointIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param values The datapointIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDatapointIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureDatapointIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, datapointIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatapointIds() {
      datapointIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of datapoint ids to be deleted.
     * </pre>
     *
     * <code>repeated string datapoint_ids = 2;</code>
     * @param value The bytes of the datapointIds to add.
     * @return This builder for chaining.
     */
    public Builder addDatapointIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDatapointIdsIsMutable();
      datapointIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.RemoveDatapointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.RemoveDatapointsRequest)
  private static final com.google.cloud.aiplatform.v1.RemoveDatapointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.RemoveDatapointsRequest();
  }

  public static com.google.cloud.aiplatform.v1.RemoveDatapointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveDatapointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveDatapointsRequest>() {
    @java.lang.Override
    public RemoveDatapointsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveDatapointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveDatapointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.RemoveDatapointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

