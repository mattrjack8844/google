// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 * Protobuf type {@code google.cloud.asset.v1.ListFeedsResponse}
 */
public final class ListFeedsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.ListFeedsResponse)
    ListFeedsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFeedsResponse.newBuilder() to construct.
  private ListFeedsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFeedsResponse() {
    feeds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFeedsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListFeedsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              feeds_ = new java.util.ArrayList<com.google.cloud.asset.v1.Feed>();
              mutable_bitField0_ |= 0x00000001;
            }
            feeds_.add(
                input.readMessage(com.google.cloud.asset.v1.Feed.parser(), extensionRegistry));
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
        feeds_ = java.util.Collections.unmodifiableList(feeds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_ListFeedsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_ListFeedsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.ListFeedsResponse.class, com.google.cloud.asset.v1.ListFeedsResponse.Builder.class);
  }

  public static final int FEEDS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.asset.v1.Feed> feeds_;
  /**
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1.Feed> getFeedsList() {
    return feeds_;
  }
  /**
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.asset.v1.FeedOrBuilder> 
      getFeedsOrBuilderList() {
    return feeds_;
  }
  /**
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
   */
  @java.lang.Override
  public int getFeedsCount() {
    return feeds_.size();
  }
  /**
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.Feed getFeeds(int index) {
    return feeds_.get(index);
  }
  /**
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.FeedOrBuilder getFeedsOrBuilder(
      int index) {
    return feeds_.get(index);
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
    for (int i = 0; i < feeds_.size(); i++) {
      output.writeMessage(1, feeds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < feeds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, feeds_.get(i));
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
    if (!(obj instanceof com.google.cloud.asset.v1.ListFeedsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.ListFeedsResponse other = (com.google.cloud.asset.v1.ListFeedsResponse) obj;

    if (!getFeedsList()
        .equals(other.getFeedsList())) return false;
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
    if (getFeedsCount() > 0) {
      hash = (37 * hash) + FEEDS_FIELD_NUMBER;
      hash = (53 * hash) + getFeedsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.ListFeedsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1.ListFeedsResponse prototype) {
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
   * Protobuf type {@code google.cloud.asset.v1.ListFeedsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.ListFeedsResponse)
      com.google.cloud.asset.v1.ListFeedsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_ListFeedsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_ListFeedsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.ListFeedsResponse.class, com.google.cloud.asset.v1.ListFeedsResponse.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.ListFeedsResponse.newBuilder()
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
        getFeedsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (feedsBuilder_ == null) {
        feeds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        feedsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_ListFeedsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListFeedsResponse getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.ListFeedsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListFeedsResponse build() {
      com.google.cloud.asset.v1.ListFeedsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListFeedsResponse buildPartial() {
      com.google.cloud.asset.v1.ListFeedsResponse result = new com.google.cloud.asset.v1.ListFeedsResponse(this);
      int from_bitField0_ = bitField0_;
      if (feedsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          feeds_ = java.util.Collections.unmodifiableList(feeds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feeds_ = feeds_;
      } else {
        result.feeds_ = feedsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.asset.v1.ListFeedsResponse) {
        return mergeFrom((com.google.cloud.asset.v1.ListFeedsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.ListFeedsResponse other) {
      if (other == com.google.cloud.asset.v1.ListFeedsResponse.getDefaultInstance()) return this;
      if (feedsBuilder_ == null) {
        if (!other.feeds_.isEmpty()) {
          if (feeds_.isEmpty()) {
            feeds_ = other.feeds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeedsIsMutable();
            feeds_.addAll(other.feeds_);
          }
          onChanged();
        }
      } else {
        if (!other.feeds_.isEmpty()) {
          if (feedsBuilder_.isEmpty()) {
            feedsBuilder_.dispose();
            feedsBuilder_ = null;
            feeds_ = other.feeds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            feedsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeedsFieldBuilder() : null;
          } else {
            feedsBuilder_.addAllMessages(other.feeds_);
          }
        }
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
      com.google.cloud.asset.v1.ListFeedsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.ListFeedsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.asset.v1.Feed> feeds_ =
      java.util.Collections.emptyList();
    private void ensureFeedsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feeds_ = new java.util.ArrayList<com.google.cloud.asset.v1.Feed>(feeds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder> feedsBuilder_;

    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.Feed> getFeedsList() {
      if (feedsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feeds_);
      } else {
        return feedsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public int getFeedsCount() {
      if (feedsBuilder_ == null) {
        return feeds_.size();
      } else {
        return feedsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public com.google.cloud.asset.v1.Feed getFeeds(int index) {
      if (feedsBuilder_ == null) {
        return feeds_.get(index);
      } else {
        return feedsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder setFeeds(
        int index, com.google.cloud.asset.v1.Feed value) {
      if (feedsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedsIsMutable();
        feeds_.set(index, value);
        onChanged();
      } else {
        feedsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder setFeeds(
        int index, com.google.cloud.asset.v1.Feed.Builder builderForValue) {
      if (feedsBuilder_ == null) {
        ensureFeedsIsMutable();
        feeds_.set(index, builderForValue.build());
        onChanged();
      } else {
        feedsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder addFeeds(com.google.cloud.asset.v1.Feed value) {
      if (feedsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedsIsMutable();
        feeds_.add(value);
        onChanged();
      } else {
        feedsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder addFeeds(
        int index, com.google.cloud.asset.v1.Feed value) {
      if (feedsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedsIsMutable();
        feeds_.add(index, value);
        onChanged();
      } else {
        feedsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder addFeeds(
        com.google.cloud.asset.v1.Feed.Builder builderForValue) {
      if (feedsBuilder_ == null) {
        ensureFeedsIsMutable();
        feeds_.add(builderForValue.build());
        onChanged();
      } else {
        feedsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder addFeeds(
        int index, com.google.cloud.asset.v1.Feed.Builder builderForValue) {
      if (feedsBuilder_ == null) {
        ensureFeedsIsMutable();
        feeds_.add(index, builderForValue.build());
        onChanged();
      } else {
        feedsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder addAllFeeds(
        java.lang.Iterable<? extends com.google.cloud.asset.v1.Feed> values) {
      if (feedsBuilder_ == null) {
        ensureFeedsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feeds_);
        onChanged();
      } else {
        feedsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder clearFeeds() {
      if (feedsBuilder_ == null) {
        feeds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        feedsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public Builder removeFeeds(int index) {
      if (feedsBuilder_ == null) {
        ensureFeedsIsMutable();
        feeds_.remove(index);
        onChanged();
      } else {
        feedsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public com.google.cloud.asset.v1.Feed.Builder getFeedsBuilder(
        int index) {
      return getFeedsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public com.google.cloud.asset.v1.FeedOrBuilder getFeedsOrBuilder(
        int index) {
      if (feedsBuilder_ == null) {
        return feeds_.get(index);  } else {
        return feedsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.asset.v1.FeedOrBuilder> 
         getFeedsOrBuilderList() {
      if (feedsBuilder_ != null) {
        return feedsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feeds_);
      }
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public com.google.cloud.asset.v1.Feed.Builder addFeedsBuilder() {
      return getFeedsFieldBuilder().addBuilder(
          com.google.cloud.asset.v1.Feed.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public com.google.cloud.asset.v1.Feed.Builder addFeedsBuilder(
        int index) {
      return getFeedsFieldBuilder().addBuilder(
          index, com.google.cloud.asset.v1.Feed.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of feeds.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.Feed feeds = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.Feed.Builder> 
         getFeedsBuilderList() {
      return getFeedsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder> 
        getFeedsFieldBuilder() {
      if (feedsBuilder_ == null) {
        feedsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder>(
                feeds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        feeds_ = null;
      }
      return feedsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.ListFeedsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.ListFeedsResponse)
  private static final com.google.cloud.asset.v1.ListFeedsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.ListFeedsResponse();
  }

  public static com.google.cloud.asset.v1.ListFeedsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFeedsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListFeedsResponse>() {
    @java.lang.Override
    public ListFeedsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListFeedsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListFeedsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFeedsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.ListFeedsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

