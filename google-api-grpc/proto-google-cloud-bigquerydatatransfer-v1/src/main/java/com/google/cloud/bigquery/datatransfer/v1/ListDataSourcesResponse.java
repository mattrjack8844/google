// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * Returns list of supported data sources and their metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse}
 */
public final class ListDataSourcesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
    ListDataSourcesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDataSourcesResponse.newBuilder() to construct.
  private ListDataSourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDataSourcesResponse() {
    dataSources_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDataSourcesResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dataSources_ =
                    new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.DataSource>();
                mutable_bitField0_ |= 0x00000001;
              }
              dataSources_.add(
                  input.readMessage(
                      com.google.cloud.bigquery.datatransfer.v1.DataSource.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dataSources_ = java.util.Collections.unmodifiableList(dataSources_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.class,
            com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_SOURCES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource> dataSources_;
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource> getDataSourcesList() {
    return dataSources_;
  }
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>
      getDataSourcesOrBuilderList() {
    return dataSources_;
  }
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  public int getDataSourcesCount() {
    return dataSources_.size();
  }
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.DataSource getDataSources(int index) {
    return dataSources_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder getDataSourcesOrBuilder(
      int index) {
    return dataSources_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListDataSourcesRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListDataSourcesRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < dataSources_.size(); i++) {
      output.writeMessage(1, dataSources_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataSources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dataSources_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse other =
        (com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse) obj;

    if (!getDataSourcesList().equals(other.getDataSourcesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDataSourcesCount() > 0) {
      hash = (37 * hash) + DATA_SOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourcesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Returns list of supported data sources and their metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.class,
              com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataSourcesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataSourcesBuilder_ == null) {
        dataSources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataSourcesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse result =
          new com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (dataSourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataSources_ = java.util.Collections.unmodifiableList(dataSources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataSources_ = dataSources_;
      } else {
        result.dataSources_ = dataSourcesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse other) {
      if (other
          == com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.getDefaultInstance())
        return this;
      if (dataSourcesBuilder_ == null) {
        if (!other.dataSources_.isEmpty()) {
          if (dataSources_.isEmpty()) {
            dataSources_ = other.dataSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataSourcesIsMutable();
            dataSources_.addAll(other.dataSources_);
          }
          onChanged();
        }
      } else {
        if (!other.dataSources_.isEmpty()) {
          if (dataSourcesBuilder_.isEmpty()) {
            dataSourcesBuilder_.dispose();
            dataSourcesBuilder_ = null;
            dataSources_ = other.dataSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataSourcesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDataSourcesFieldBuilder()
                    : null;
          } else {
            dataSourcesBuilder_.addAllMessages(other.dataSources_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource> dataSources_ =
        java.util.Collections.emptyList();

    private void ensureDataSourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataSources_ =
            new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.DataSource>(
                dataSources_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.DataSource,
            com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder,
            com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>
        dataSourcesBuilder_;

    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource>
        getDataSourcesList() {
      if (dataSourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataSources_);
      } else {
        return dataSourcesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public int getDataSourcesCount() {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.size();
      } else {
        return dataSourcesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSource getDataSources(int index) {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.get(index);
      } else {
        return dataSourcesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder setDataSources(
        int index, com.google.cloud.bigquery.datatransfer.v1.DataSource value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.set(index, value);
        onChanged();
      } else {
        dataSourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder setDataSources(
        int index, com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder addDataSources(com.google.cloud.bigquery.datatransfer.v1.DataSource value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.add(value);
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder addDataSources(
        int index, com.google.cloud.bigquery.datatransfer.v1.DataSource value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.add(index, value);
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder addDataSources(
        com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.add(builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder addDataSources(
        int index, com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder addAllDataSources(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.DataSource> values) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataSources_);
        onChanged();
      } else {
        dataSourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder clearDataSources() {
      if (dataSourcesBuilder_ == null) {
        dataSources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataSourcesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public Builder removeDataSources(int index) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.remove(index);
        onChanged();
      } else {
        dataSourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder getDataSourcesBuilder(
        int index) {
      return getDataSourcesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder getDataSourcesOrBuilder(
        int index) {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.get(index);
      } else {
        return dataSourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>
        getDataSourcesOrBuilderList() {
      if (dataSourcesBuilder_ != null) {
        return dataSourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataSources_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder addDataSourcesBuilder() {
      return getDataSourcesFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.datatransfer.v1.DataSource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder addDataSourcesBuilder(
        int index) {
      return getDataSourcesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.datatransfer.v1.DataSource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of supported data sources and their transfer settings.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder>
        getDataSourcesBuilderList() {
      return getDataSourcesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.DataSource,
            com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder,
            com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>
        getDataSourcesFieldBuilder() {
      if (dataSourcesBuilder_ == null) {
        dataSourcesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.datatransfer.v1.DataSource,
                com.google.cloud.bigquery.datatransfer.v1.DataSource.Builder,
                com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>(
                dataSources_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dataSources_ = null;
      }
      return dataSourcesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListDataSourcesRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListDataSourcesRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListDataSourcesRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListDataSourcesRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListDataSourcesRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataSourcesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDataSourcesResponse>() {
        @java.lang.Override
        public ListDataSourcesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDataSourcesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDataSourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataSourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
