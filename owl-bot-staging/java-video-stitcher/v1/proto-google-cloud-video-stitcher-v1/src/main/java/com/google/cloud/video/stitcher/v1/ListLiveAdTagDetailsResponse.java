// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Response message for VideoStitcherService.listLiveAdTagDetails.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse}
 */
public final class ListLiveAdTagDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)
    ListLiveAdTagDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLiveAdTagDetailsResponse.newBuilder() to construct.
  private ListLiveAdTagDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLiveAdTagDetailsResponse() {
    liveAdTagDetails_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLiveAdTagDetailsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListLiveAdTagDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListLiveAdTagDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.class, com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.Builder.class);
  }

  public static final int LIVE_AD_TAG_DETAILS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail> liveAdTagDetails_;
  /**
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail> getLiveAdTagDetailsList() {
    return liveAdTagDetails_;
  }
  /**
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder> 
      getLiveAdTagDetailsOrBuilderList() {
    return liveAdTagDetails_;
  }
  /**
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public int getLiveAdTagDetailsCount() {
    return liveAdTagDetails_.size();
  }
  /**
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.LiveAdTagDetail getLiveAdTagDetails(int index) {
    return liveAdTagDetails_.get(index);
  }
  /**
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder getLiveAdTagDetailsOrBuilder(
      int index) {
    return liveAdTagDetails_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < liveAdTagDetails_.size(); i++) {
      output.writeMessage(1, liveAdTagDetails_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < liveAdTagDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, liveAdTagDetails_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse other = (com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse) obj;

    if (!getLiveAdTagDetailsList()
        .equals(other.getLiveAdTagDetailsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getLiveAdTagDetailsCount() > 0) {
      hash = (37 * hash) + LIVE_AD_TAG_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getLiveAdTagDetailsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse prototype) {
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
   * Response message for VideoStitcherService.listLiveAdTagDetails.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)
      com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListLiveAdTagDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListLiveAdTagDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.class, com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.newBuilder()
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
      if (liveAdTagDetailsBuilder_ == null) {
        liveAdTagDetails_ = java.util.Collections.emptyList();
      } else {
        liveAdTagDetails_ = null;
        liveAdTagDetailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListLiveAdTagDetailsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse build() {
      com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse buildPartial() {
      com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse result = new com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse result) {
      if (liveAdTagDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          liveAdTagDetails_ = java.util.Collections.unmodifiableList(liveAdTagDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.liveAdTagDetails_ = liveAdTagDetails_;
      } else {
        result.liveAdTagDetails_ = liveAdTagDetailsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse other) {
      if (other == com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse.getDefaultInstance()) return this;
      if (liveAdTagDetailsBuilder_ == null) {
        if (!other.liveAdTagDetails_.isEmpty()) {
          if (liveAdTagDetails_.isEmpty()) {
            liveAdTagDetails_ = other.liveAdTagDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLiveAdTagDetailsIsMutable();
            liveAdTagDetails_.addAll(other.liveAdTagDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.liveAdTagDetails_.isEmpty()) {
          if (liveAdTagDetailsBuilder_.isEmpty()) {
            liveAdTagDetailsBuilder_.dispose();
            liveAdTagDetailsBuilder_ = null;
            liveAdTagDetails_ = other.liveAdTagDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            liveAdTagDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLiveAdTagDetailsFieldBuilder() : null;
          } else {
            liveAdTagDetailsBuilder_.addAllMessages(other.liveAdTagDetails_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.cloud.video.stitcher.v1.LiveAdTagDetail m =
                  input.readMessage(
                      com.google.cloud.video.stitcher.v1.LiveAdTagDetail.parser(),
                      extensionRegistry);
              if (liveAdTagDetailsBuilder_ == null) {
                ensureLiveAdTagDetailsIsMutable();
                liveAdTagDetails_.add(m);
              } else {
                liveAdTagDetailsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail> liveAdTagDetails_ =
      java.util.Collections.emptyList();
    private void ensureLiveAdTagDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        liveAdTagDetails_ = new java.util.ArrayList<com.google.cloud.video.stitcher.v1.LiveAdTagDetail>(liveAdTagDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.LiveAdTagDetail, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder> liveAdTagDetailsBuilder_;

    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail> getLiveAdTagDetailsList() {
      if (liveAdTagDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(liveAdTagDetails_);
      } else {
        return liveAdTagDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public int getLiveAdTagDetailsCount() {
      if (liveAdTagDetailsBuilder_ == null) {
        return liveAdTagDetails_.size();
      } else {
        return liveAdTagDetailsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveAdTagDetail getLiveAdTagDetails(int index) {
      if (liveAdTagDetailsBuilder_ == null) {
        return liveAdTagDetails_.get(index);
      } else {
        return liveAdTagDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder setLiveAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.LiveAdTagDetail value) {
      if (liveAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.set(index, value);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder setLiveAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder builderForValue) {
      if (liveAdTagDetailsBuilder_ == null) {
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder addLiveAdTagDetails(com.google.cloud.video.stitcher.v1.LiveAdTagDetail value) {
      if (liveAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.add(value);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder addLiveAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.LiveAdTagDetail value) {
      if (liveAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.add(index, value);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder addLiveAdTagDetails(
        com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder builderForValue) {
      if (liveAdTagDetailsBuilder_ == null) {
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.add(builderForValue.build());
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder addLiveAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder builderForValue) {
      if (liveAdTagDetailsBuilder_ == null) {
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder addAllLiveAdTagDetails(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.LiveAdTagDetail> values) {
      if (liveAdTagDetailsBuilder_ == null) {
        ensureLiveAdTagDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, liveAdTagDetails_);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder clearLiveAdTagDetails() {
      if (liveAdTagDetailsBuilder_ == null) {
        liveAdTagDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public Builder removeLiveAdTagDetails(int index) {
      if (liveAdTagDetailsBuilder_ == null) {
        ensureLiveAdTagDetailsIsMutable();
        liveAdTagDetails_.remove(index);
        onChanged();
      } else {
        liveAdTagDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder getLiveAdTagDetailsBuilder(
        int index) {
      return getLiveAdTagDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder getLiveAdTagDetailsOrBuilder(
        int index) {
      if (liveAdTagDetailsBuilder_ == null) {
        return liveAdTagDetails_.get(index);  } else {
        return liveAdTagDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder> 
         getLiveAdTagDetailsOrBuilderList() {
      if (liveAdTagDetailsBuilder_ != null) {
        return liveAdTagDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(liveAdTagDetails_);
      }
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder addLiveAdTagDetailsBuilder() {
      return getLiveAdTagDetailsFieldBuilder().addBuilder(
          com.google.cloud.video.stitcher.v1.LiveAdTagDetail.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder addLiveAdTagDetailsBuilder(
        int index) {
      return getLiveAdTagDetailsFieldBuilder().addBuilder(
          index, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of live session ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder> 
         getLiveAdTagDetailsBuilderList() {
      return getLiveAdTagDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.LiveAdTagDetail, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder> 
        getLiveAdTagDetailsFieldBuilder() {
      if (liveAdTagDetailsBuilder_ == null) {
        liveAdTagDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.LiveAdTagDetail, com.google.cloud.video.stitcher.v1.LiveAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder>(
                liveAdTagDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        liveAdTagDetails_ = null;
      }
      return liveAdTagDetailsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The pagination token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The pagination token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The pagination token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The pagination token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The pagination token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)
  private static final com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse();
  }

  public static com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLiveAdTagDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLiveAdTagDetailsResponse>() {
    @java.lang.Override
    public ListLiveAdTagDetailsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLiveAdTagDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLiveAdTagDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

