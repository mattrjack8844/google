// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Request for `ListDeviceRegistries`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.ListDeviceRegistriesRequest}
 */
public  final class ListDeviceRegistriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.ListDeviceRegistriesRequest)
    ListDeviceRegistriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDeviceRegistriesRequest.newBuilder() to construct.
  private ListDeviceRegistriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDeviceRegistriesRequest() {
    parent_ = "";
    pageSize_ = 0;
    pageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDeviceRegistriesRequest(
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

            parent_ = s;
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_ListDeviceRegistriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_ListDeviceRegistriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.ListDeviceRegistriesRequest.class, com.google.cloud.iot.v1.ListDeviceRegistriesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The project and cloud region path. For example,
   * `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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
   * The project and cloud region path. For example,
   * `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * The maximum number of registries to return in the response. If this value
   * is zero, the service will select a default size. A call may return fewer
   * objects than requested. A non-empty `next_page_token` in the response
   * indicates that more data is available.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * The value returned by the last `ListDeviceRegistriesResponse`; indicates
   * that this is a continuation of a prior `ListDeviceRegistries` call and
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The value returned by the last `ListDeviceRegistriesResponse`; indicates
   * that this is a continuation of a prior `ListDeviceRegistries` call and
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.ListDeviceRegistriesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.ListDeviceRegistriesRequest other = (com.google.cloud.iot.v1.ListDeviceRegistriesRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iot.v1.ListDeviceRegistriesRequest prototype) {
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
   * Request for `ListDeviceRegistries`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.ListDeviceRegistriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.ListDeviceRegistriesRequest)
      com.google.cloud.iot.v1.ListDeviceRegistriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_ListDeviceRegistriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_ListDeviceRegistriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.ListDeviceRegistriesRequest.class, com.google.cloud.iot.v1.ListDeviceRegistriesRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.ListDeviceRegistriesRequest.newBuilder()
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
      parent_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_ListDeviceRegistriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.ListDeviceRegistriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesRequest build() {
      com.google.cloud.iot.v1.ListDeviceRegistriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesRequest buildPartial() {
      com.google.cloud.iot.v1.ListDeviceRegistriesRequest result = new com.google.cloud.iot.v1.ListDeviceRegistriesRequest(this);
      result.parent_ = parent_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.ListDeviceRegistriesRequest) {
        return mergeFrom((com.google.cloud.iot.v1.ListDeviceRegistriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.ListDeviceRegistriesRequest other) {
      if (other == com.google.cloud.iot.v1.ListDeviceRegistriesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
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
      com.google.cloud.iot.v1.ListDeviceRegistriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.ListDeviceRegistriesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The project and cloud region path. For example,
     * `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project and cloud region path. For example,
     * `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project and cloud region path. For example,
     * `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project and cloud region path. For example,
     * `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project and cloud region path. For example,
     * `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The maximum number of registries to return in the response. If this value
     * is zero, the service will select a default size. A call may return fewer
     * objects than requested. A non-empty `next_page_token` in the response
     * indicates that more data is available.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The maximum number of registries to return in the response. If this value
     * is zero, the service will select a default size. A call may return fewer
     * objects than requested. A non-empty `next_page_token` in the response
     * indicates that more data is available.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of registries to return in the response. If this value
     * is zero, the service will select a default size. A call may return fewer
     * objects than requested. A non-empty `next_page_token` in the response
     * indicates that more data is available.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * The value returned by the last `ListDeviceRegistriesResponse`; indicates
     * that this is a continuation of a prior `ListDeviceRegistries` call and
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value returned by the last `ListDeviceRegistriesResponse`; indicates
     * that this is a continuation of a prior `ListDeviceRegistries` call and
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value returned by the last `ListDeviceRegistriesResponse`; indicates
     * that this is a continuation of a prior `ListDeviceRegistries` call and
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value returned by the last `ListDeviceRegistriesResponse`; indicates
     * that this is a continuation of a prior `ListDeviceRegistries` call and
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value returned by the last `ListDeviceRegistriesResponse`; indicates
     * that this is a continuation of a prior `ListDeviceRegistries` call and
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.ListDeviceRegistriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.ListDeviceRegistriesRequest)
  private static final com.google.cloud.iot.v1.ListDeviceRegistriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.ListDeviceRegistriesRequest();
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeviceRegistriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListDeviceRegistriesRequest>() {
    @java.lang.Override
    public ListDeviceRegistriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDeviceRegistriesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDeviceRegistriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeviceRegistriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.ListDeviceRegistriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

