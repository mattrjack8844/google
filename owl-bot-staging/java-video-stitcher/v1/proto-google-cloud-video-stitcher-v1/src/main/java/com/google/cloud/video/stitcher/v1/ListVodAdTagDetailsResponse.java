// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Response message for VideoStitcherService.listVodAdTagDetails.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse}
 */
public final class ListVodAdTagDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)
    ListVodAdTagDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListVodAdTagDetailsResponse.newBuilder() to construct.
  private ListVodAdTagDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVodAdTagDetailsResponse() {
    vodAdTagDetails_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListVodAdTagDetailsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListVodAdTagDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListVodAdTagDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.class, com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.Builder.class);
  }

  public static final int VOD_AD_TAG_DETAILS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.video.stitcher.v1.VodAdTagDetail> vodAdTagDetails_;
  /**
   * <pre>
   * A List of ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.VodAdTagDetail> getVodAdTagDetailsList() {
    return vodAdTagDetails_;
  }
  /**
   * <pre>
   * A List of ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder> 
      getVodAdTagDetailsOrBuilderList() {
    return vodAdTagDetails_;
  }
  /**
   * <pre>
   * A List of ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public int getVodAdTagDetailsCount() {
    return vodAdTagDetails_.size();
  }
  /**
   * <pre>
   * A List of ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodAdTagDetail getVodAdTagDetails(int index) {
    return vodAdTagDetails_.get(index);
  }
  /**
   * <pre>
   * A List of ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder getVodAdTagDetailsOrBuilder(
      int index) {
    return vodAdTagDetails_.get(index);
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
    for (int i = 0; i < vodAdTagDetails_.size(); i++) {
      output.writeMessage(1, vodAdTagDetails_.get(i));
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
    for (int i = 0; i < vodAdTagDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vodAdTagDetails_.get(i));
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse other = (com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse) obj;

    if (!getVodAdTagDetailsList()
        .equals(other.getVodAdTagDetailsList())) return false;
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
    if (getVodAdTagDetailsCount() > 0) {
      hash = (37 * hash) + VOD_AD_TAG_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getVodAdTagDetailsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse prototype) {
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
   * Response message for VideoStitcherService.listVodAdTagDetails.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)
      com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListVodAdTagDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListVodAdTagDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.class, com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.newBuilder()
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
      if (vodAdTagDetailsBuilder_ == null) {
        vodAdTagDetails_ = java.util.Collections.emptyList();
      } else {
        vodAdTagDetails_ = null;
        vodAdTagDetailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_ListVodAdTagDetailsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse build() {
      com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse buildPartial() {
      com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse result = new com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse result) {
      if (vodAdTagDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vodAdTagDetails_ = java.util.Collections.unmodifiableList(vodAdTagDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vodAdTagDetails_ = vodAdTagDetails_;
      } else {
        result.vodAdTagDetails_ = vodAdTagDetailsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse result) {
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
      if (other instanceof com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse other) {
      if (other == com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse.getDefaultInstance()) return this;
      if (vodAdTagDetailsBuilder_ == null) {
        if (!other.vodAdTagDetails_.isEmpty()) {
          if (vodAdTagDetails_.isEmpty()) {
            vodAdTagDetails_ = other.vodAdTagDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVodAdTagDetailsIsMutable();
            vodAdTagDetails_.addAll(other.vodAdTagDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.vodAdTagDetails_.isEmpty()) {
          if (vodAdTagDetailsBuilder_.isEmpty()) {
            vodAdTagDetailsBuilder_.dispose();
            vodAdTagDetailsBuilder_ = null;
            vodAdTagDetails_ = other.vodAdTagDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vodAdTagDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVodAdTagDetailsFieldBuilder() : null;
          } else {
            vodAdTagDetailsBuilder_.addAllMessages(other.vodAdTagDetails_);
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
              com.google.cloud.video.stitcher.v1.VodAdTagDetail m =
                  input.readMessage(
                      com.google.cloud.video.stitcher.v1.VodAdTagDetail.parser(),
                      extensionRegistry);
              if (vodAdTagDetailsBuilder_ == null) {
                ensureVodAdTagDetailsIsMutable();
                vodAdTagDetails_.add(m);
              } else {
                vodAdTagDetailsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.video.stitcher.v1.VodAdTagDetail> vodAdTagDetails_ =
      java.util.Collections.emptyList();
    private void ensureVodAdTagDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vodAdTagDetails_ = new java.util.ArrayList<com.google.cloud.video.stitcher.v1.VodAdTagDetail>(vodAdTagDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodAdTagDetail, com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder> vodAdTagDetailsBuilder_;

    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.VodAdTagDetail> getVodAdTagDetailsList() {
      if (vodAdTagDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vodAdTagDetails_);
      } else {
        return vodAdTagDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public int getVodAdTagDetailsCount() {
      if (vodAdTagDetailsBuilder_ == null) {
        return vodAdTagDetails_.size();
      } else {
        return vodAdTagDetailsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail getVodAdTagDetails(int index) {
      if (vodAdTagDetailsBuilder_ == null) {
        return vodAdTagDetails_.get(index);
      } else {
        return vodAdTagDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder setVodAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.VodAdTagDetail value) {
      if (vodAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.set(index, value);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder setVodAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder builderForValue) {
      if (vodAdTagDetailsBuilder_ == null) {
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder addVodAdTagDetails(com.google.cloud.video.stitcher.v1.VodAdTagDetail value) {
      if (vodAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.add(value);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder addVodAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.VodAdTagDetail value) {
      if (vodAdTagDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.add(index, value);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder addVodAdTagDetails(
        com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder builderForValue) {
      if (vodAdTagDetailsBuilder_ == null) {
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.add(builderForValue.build());
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder addVodAdTagDetails(
        int index, com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder builderForValue) {
      if (vodAdTagDetailsBuilder_ == null) {
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder addAllVodAdTagDetails(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.VodAdTagDetail> values) {
      if (vodAdTagDetailsBuilder_ == null) {
        ensureVodAdTagDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vodAdTagDetails_);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder clearVodAdTagDetails() {
      if (vodAdTagDetailsBuilder_ == null) {
        vodAdTagDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public Builder removeVodAdTagDetails(int index) {
      if (vodAdTagDetailsBuilder_ == null) {
        ensureVodAdTagDetailsIsMutable();
        vodAdTagDetails_.remove(index);
        onChanged();
      } else {
        vodAdTagDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder getVodAdTagDetailsBuilder(
        int index) {
      return getVodAdTagDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder getVodAdTagDetailsOrBuilder(
        int index) {
      if (vodAdTagDetailsBuilder_ == null) {
        return vodAdTagDetails_.get(index);  } else {
        return vodAdTagDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder> 
         getVodAdTagDetailsOrBuilderList() {
      if (vodAdTagDetailsBuilder_ != null) {
        return vodAdTagDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vodAdTagDetails_);
      }
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder addVodAdTagDetailsBuilder() {
      return getVodAdTagDetailsFieldBuilder().addBuilder(
          com.google.cloud.video.stitcher.v1.VodAdTagDetail.getDefaultInstance());
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder addVodAdTagDetailsBuilder(
        int index) {
      return getVodAdTagDetailsFieldBuilder().addBuilder(
          index, com.google.cloud.video.stitcher.v1.VodAdTagDetail.getDefaultInstance());
    }
    /**
     * <pre>
     * A List of ad tag details.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodAdTagDetail vod_ad_tag_details = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder> 
         getVodAdTagDetailsBuilderList() {
      return getVodAdTagDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodAdTagDetail, com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder> 
        getVodAdTagDetailsFieldBuilder() {
      if (vodAdTagDetailsBuilder_ == null) {
        vodAdTagDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.VodAdTagDetail, com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder, com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder>(
                vodAdTagDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vodAdTagDetails_ = null;
      }
      return vodAdTagDetailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse)
  private static final com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse();
  }

  public static com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVodAdTagDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVodAdTagDetailsResponse>() {
    @java.lang.Override
    public ListVodAdTagDetailsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVodAdTagDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVodAdTagDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.ListVodAdTagDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

