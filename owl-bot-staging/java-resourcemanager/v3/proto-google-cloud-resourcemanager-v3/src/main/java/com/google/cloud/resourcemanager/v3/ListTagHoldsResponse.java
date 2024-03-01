// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_holds.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

/**
 * <pre>
 * The ListTagHolds response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.ListTagHoldsResponse}
 */
public final class ListTagHoldsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.ListTagHoldsResponse)
    ListTagHoldsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTagHoldsResponse.newBuilder() to construct.
  private ListTagHoldsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTagHoldsResponse() {
    tagHolds_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTagHoldsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagHoldsProto.internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagHoldsProto.internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.class, com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.Builder.class);
  }

  public static final int TAG_HOLDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.resourcemanager.v3.TagHold> tagHolds_;
  /**
   * <pre>
   * A possibly paginated list of TagHolds.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.resourcemanager.v3.TagHold> getTagHoldsList() {
    return tagHolds_;
  }
  /**
   * <pre>
   * A possibly paginated list of TagHolds.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.resourcemanager.v3.TagHoldOrBuilder> 
      getTagHoldsOrBuilderList() {
    return tagHolds_;
  }
  /**
   * <pre>
   * A possibly paginated list of TagHolds.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
   */
  @java.lang.Override
  public int getTagHoldsCount() {
    return tagHolds_.size();
  }
  /**
   * <pre>
   * A possibly paginated list of TagHolds.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagHold getTagHolds(int index) {
    return tagHolds_.get(index);
  }
  /**
   * <pre>
   * A possibly paginated list of TagHolds.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagHoldOrBuilder getTagHoldsOrBuilder(
      int index) {
    return tagHolds_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Pagination token.
   *
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   *
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   *
   * Pagination tokens have a limited lifetime.
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
   * Pagination token.
   *
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   *
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   *
   * Pagination tokens have a limited lifetime.
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
    for (int i = 0; i < tagHolds_.size(); i++) {
      output.writeMessage(1, tagHolds_.get(i));
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
    for (int i = 0; i < tagHolds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tagHolds_.get(i));
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.ListTagHoldsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.ListTagHoldsResponse other = (com.google.cloud.resourcemanager.v3.ListTagHoldsResponse) obj;

    if (!getTagHoldsList()
        .equals(other.getTagHoldsList())) return false;
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
    if (getTagHoldsCount() > 0) {
      hash = (37 * hash) + TAG_HOLDS_FIELD_NUMBER;
      hash = (53 * hash) + getTagHoldsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.resourcemanager.v3.ListTagHoldsResponse prototype) {
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
   * The ListTagHolds response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.ListTagHoldsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.ListTagHoldsResponse)
      com.google.cloud.resourcemanager.v3.ListTagHoldsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagHoldsProto.internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagHoldsProto.internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.class, com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.newBuilder()
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
      if (tagHoldsBuilder_ == null) {
        tagHolds_ = java.util.Collections.emptyList();
      } else {
        tagHolds_ = null;
        tagHoldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagHoldsProto.internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagHoldsResponse getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagHoldsResponse build() {
      com.google.cloud.resourcemanager.v3.ListTagHoldsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagHoldsResponse buildPartial() {
      com.google.cloud.resourcemanager.v3.ListTagHoldsResponse result = new com.google.cloud.resourcemanager.v3.ListTagHoldsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.resourcemanager.v3.ListTagHoldsResponse result) {
      if (tagHoldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tagHolds_ = java.util.Collections.unmodifiableList(tagHolds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tagHolds_ = tagHolds_;
      } else {
        result.tagHolds_ = tagHoldsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.ListTagHoldsResponse result) {
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
      if (other instanceof com.google.cloud.resourcemanager.v3.ListTagHoldsResponse) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.ListTagHoldsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.ListTagHoldsResponse other) {
      if (other == com.google.cloud.resourcemanager.v3.ListTagHoldsResponse.getDefaultInstance()) return this;
      if (tagHoldsBuilder_ == null) {
        if (!other.tagHolds_.isEmpty()) {
          if (tagHolds_.isEmpty()) {
            tagHolds_ = other.tagHolds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagHoldsIsMutable();
            tagHolds_.addAll(other.tagHolds_);
          }
          onChanged();
        }
      } else {
        if (!other.tagHolds_.isEmpty()) {
          if (tagHoldsBuilder_.isEmpty()) {
            tagHoldsBuilder_.dispose();
            tagHoldsBuilder_ = null;
            tagHolds_ = other.tagHolds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tagHoldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTagHoldsFieldBuilder() : null;
          } else {
            tagHoldsBuilder_.addAllMessages(other.tagHolds_);
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
              com.google.cloud.resourcemanager.v3.TagHold m =
                  input.readMessage(
                      com.google.cloud.resourcemanager.v3.TagHold.parser(),
                      extensionRegistry);
              if (tagHoldsBuilder_ == null) {
                ensureTagHoldsIsMutable();
                tagHolds_.add(m);
              } else {
                tagHoldsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.resourcemanager.v3.TagHold> tagHolds_ =
      java.util.Collections.emptyList();
    private void ensureTagHoldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tagHolds_ = new java.util.ArrayList<com.google.cloud.resourcemanager.v3.TagHold>(tagHolds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.TagHold, com.google.cloud.resourcemanager.v3.TagHold.Builder, com.google.cloud.resourcemanager.v3.TagHoldOrBuilder> tagHoldsBuilder_;

    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.TagHold> getTagHoldsList() {
      if (tagHoldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tagHolds_);
      } else {
        return tagHoldsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public int getTagHoldsCount() {
      if (tagHoldsBuilder_ == null) {
        return tagHolds_.size();
      } else {
        return tagHoldsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagHold getTagHolds(int index) {
      if (tagHoldsBuilder_ == null) {
        return tagHolds_.get(index);
      } else {
        return tagHoldsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder setTagHolds(
        int index, com.google.cloud.resourcemanager.v3.TagHold value) {
      if (tagHoldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagHoldsIsMutable();
        tagHolds_.set(index, value);
        onChanged();
      } else {
        tagHoldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder setTagHolds(
        int index, com.google.cloud.resourcemanager.v3.TagHold.Builder builderForValue) {
      if (tagHoldsBuilder_ == null) {
        ensureTagHoldsIsMutable();
        tagHolds_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagHoldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder addTagHolds(com.google.cloud.resourcemanager.v3.TagHold value) {
      if (tagHoldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagHoldsIsMutable();
        tagHolds_.add(value);
        onChanged();
      } else {
        tagHoldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder addTagHolds(
        int index, com.google.cloud.resourcemanager.v3.TagHold value) {
      if (tagHoldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagHoldsIsMutable();
        tagHolds_.add(index, value);
        onChanged();
      } else {
        tagHoldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder addTagHolds(
        com.google.cloud.resourcemanager.v3.TagHold.Builder builderForValue) {
      if (tagHoldsBuilder_ == null) {
        ensureTagHoldsIsMutable();
        tagHolds_.add(builderForValue.build());
        onChanged();
      } else {
        tagHoldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder addTagHolds(
        int index, com.google.cloud.resourcemanager.v3.TagHold.Builder builderForValue) {
      if (tagHoldsBuilder_ == null) {
        ensureTagHoldsIsMutable();
        tagHolds_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagHoldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder addAllTagHolds(
        java.lang.Iterable<? extends com.google.cloud.resourcemanager.v3.TagHold> values) {
      if (tagHoldsBuilder_ == null) {
        ensureTagHoldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tagHolds_);
        onChanged();
      } else {
        tagHoldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder clearTagHolds() {
      if (tagHoldsBuilder_ == null) {
        tagHolds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tagHoldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public Builder removeTagHolds(int index) {
      if (tagHoldsBuilder_ == null) {
        ensureTagHoldsIsMutable();
        tagHolds_.remove(index);
        onChanged();
      } else {
        tagHoldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagHold.Builder getTagHoldsBuilder(
        int index) {
      return getTagHoldsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagHoldOrBuilder getTagHoldsOrBuilder(
        int index) {
      if (tagHoldsBuilder_ == null) {
        return tagHolds_.get(index);  } else {
        return tagHoldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.resourcemanager.v3.TagHoldOrBuilder> 
         getTagHoldsOrBuilderList() {
      if (tagHoldsBuilder_ != null) {
        return tagHoldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tagHolds_);
      }
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagHold.Builder addTagHoldsBuilder() {
      return getTagHoldsFieldBuilder().addBuilder(
          com.google.cloud.resourcemanager.v3.TagHold.getDefaultInstance());
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagHold.Builder addTagHoldsBuilder(
        int index) {
      return getTagHoldsFieldBuilder().addBuilder(
          index, com.google.cloud.resourcemanager.v3.TagHold.getDefaultInstance());
    }
    /**
     * <pre>
     * A possibly paginated list of TagHolds.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagHold tag_holds = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.TagHold.Builder> 
         getTagHoldsBuilderList() {
      return getTagHoldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.TagHold, com.google.cloud.resourcemanager.v3.TagHold.Builder, com.google.cloud.resourcemanager.v3.TagHoldOrBuilder> 
        getTagHoldsFieldBuilder() {
      if (tagHoldsBuilder_ == null) {
        tagHoldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagHold, com.google.cloud.resourcemanager.v3.TagHold.Builder, com.google.cloud.resourcemanager.v3.TagHoldOrBuilder>(
                tagHolds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tagHolds_ = null;
      }
      return tagHoldsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Pagination token.
     *
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     *
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     *
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     *
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     *
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     *
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     *
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     *
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     *
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     *
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     *
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     *
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     *
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     *
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     *
     * Pagination tokens have a limited lifetime.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.ListTagHoldsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.ListTagHoldsResponse)
  private static final com.google.cloud.resourcemanager.v3.ListTagHoldsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.ListTagHoldsResponse();
  }

  public static com.google.cloud.resourcemanager.v3.ListTagHoldsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTagHoldsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTagHoldsResponse>() {
    @java.lang.Override
    public ListTagHoldsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTagHoldsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTagHoldsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.ListTagHoldsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

