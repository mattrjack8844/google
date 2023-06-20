// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for
 * [Intents.ListIntents][google.cloud.dialogflow.v2beta1.Intents.ListIntents].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListIntentsResponse}
 */
public final class ListIntentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ListIntentsResponse)
    ListIntentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListIntentsResponse.newBuilder() to construct.
  private ListIntentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListIntentsResponse() {
    intents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListIntentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_ListIntentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_ListIntentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.class, com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.Builder.class);
  }

  public static final int INTENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_;
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> getIntentsList() {
    return intents_;
  }
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
      getIntentsOrBuilderList() {
    return intents_;
  }
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  @java.lang.Override
  public int getIntentsCount() {
    return intents_.size();
  }
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index) {
    return intents_.get(index);
  }
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentsOrBuilder(
      int index) {
    return intents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < intents_.size(); i++) {
      output.writeMessage(1, intents_.get(i));
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
    for (int i = 0; i < intents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, intents_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ListIntentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ListIntentsResponse other = (com.google.cloud.dialogflow.v2beta1.ListIntentsResponse) obj;

    if (!getIntentsList()
        .equals(other.getIntentsList())) return false;
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
    if (getIntentsCount() > 0) {
      hash = (37 * hash) + INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getIntentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ListIntentsResponse prototype) {
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
   * The response message for
   * [Intents.ListIntents][google.cloud.dialogflow.v2beta1.Intents.ListIntents].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListIntentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ListIntentsResponse)
      com.google.cloud.dialogflow.v2beta1.ListIntentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_ListIntentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_ListIntentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.class, com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.newBuilder()
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
      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
      } else {
        intents_ = null;
        intentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_ListIntentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListIntentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListIntentsResponse build() {
      com.google.cloud.dialogflow.v2beta1.ListIntentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListIntentsResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ListIntentsResponse result = new com.google.cloud.dialogflow.v2beta1.ListIntentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2beta1.ListIntentsResponse result) {
      if (intentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          intents_ = java.util.Collections.unmodifiableList(intents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.intents_ = intents_;
      } else {
        result.intents_ = intentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.ListIntentsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ListIntentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ListIntentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ListIntentsResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.getDefaultInstance()) return this;
      if (intentsBuilder_ == null) {
        if (!other.intents_.isEmpty()) {
          if (intents_.isEmpty()) {
            intents_ = other.intents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIntentsIsMutable();
            intents_.addAll(other.intents_);
          }
          onChanged();
        }
      } else {
        if (!other.intents_.isEmpty()) {
          if (intentsBuilder_.isEmpty()) {
            intentsBuilder_.dispose();
            intentsBuilder_ = null;
            intents_ = other.intents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            intentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIntentsFieldBuilder() : null;
          } else {
            intentsBuilder_.addAllMessages(other.intents_);
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
              com.google.cloud.dialogflow.v2beta1.Intent m =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.Intent.parser(),
                      extensionRegistry);
              if (intentsBuilder_ == null) {
                ensureIntentsIsMutable();
                intents_.add(m);
              } else {
                intentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_ =
      java.util.Collections.emptyList();
    private void ensureIntentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        intents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Intent>(intents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> intentsBuilder_;

    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> getIntentsList() {
      if (intentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(intents_);
      } else {
        return intentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public int getIntentsCount() {
      if (intentsBuilder_ == null) {
        return intents_.size();
      } else {
        return intentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index) {
      if (intentsBuilder_ == null) {
        return intents_.get(index);
      } else {
        return intentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder setIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.set(index, value);
        onChanged();
      } else {
        intentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder setIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.set(index, builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder addIntents(com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.add(value);
        onChanged();
      } else {
        intentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder addIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.add(index, value);
        onChanged();
      } else {
        intentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder addIntents(
        com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.add(builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder addIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.add(index, builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder addAllIntents(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Intent> values) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, intents_);
        onChanged();
      } else {
        intentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder clearIntents() {
      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        intentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder removeIntents(int index) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.remove(index);
        onChanged();
      } else {
        intentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder getIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentsOrBuilder(
        int index) {
      if (intentsBuilder_ == null) {
        return intents_.get(index);  } else {
        return intentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
         getIntentsOrBuilderList() {
      if (intentsBuilder_ != null) {
        return intentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(intents_);
      }
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder() {
      return getIntentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agent intents. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Builder> 
         getIntentsBuilderList() {
      return getIntentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
        getIntentsFieldBuilder() {
      if (intentsBuilder_ == null) {
        intentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder>(
                intents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        intents_ = null;
      }
      return intentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ListIntentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ListIntentsResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ListIntentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ListIntentsResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ListIntentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListIntentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListIntentsResponse>() {
    @java.lang.Override
    public ListIntentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListIntentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListIntentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ListIntentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

