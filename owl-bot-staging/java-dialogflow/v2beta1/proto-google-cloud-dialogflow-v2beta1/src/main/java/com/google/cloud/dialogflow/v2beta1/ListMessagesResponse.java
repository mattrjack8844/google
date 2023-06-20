// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for
 * [Conversations.ListMessages][google.cloud.dialogflow.v2beta1.Conversations.ListMessages].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListMessagesResponse}
 */
public final class ListMessagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ListMessagesResponse)
    ListMessagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMessagesResponse.newBuilder() to construct.
  private ListMessagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMessagesResponse() {
    messages_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMessagesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto.internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto.internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.class, com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Message> messages_;
  /**
   * <pre>
   * Required. The list of messages. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * `messages` is sorted by `create_time` in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Message> getMessagesList() {
    return messages_;
  }
  /**
   * <pre>
   * Required. The list of messages. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * `messages` is sorted by `create_time` in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.MessageOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <pre>
   * Required. The list of messages. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * `messages` is sorted by `create_time` in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
   */
  @java.lang.Override
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <pre>
   * Required. The list of messages. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * `messages` is sorted by `create_time` in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Message getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <pre>
   * Required. The list of messages. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * `messages` is sorted by `create_time` in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.MessageOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Optional. Token to retrieve the next page of results, or empty if there are
   * no more results in the list.
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
   * Optional. Token to retrieve the next page of results, or empty if there are
   * no more results in the list.
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
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(1, messages_.get(i));
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
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, messages_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ListMessagesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ListMessagesResponse other = (com.google.cloud.dialogflow.v2beta1.ListMessagesResponse) obj;

    if (!getMessagesList()
        .equals(other.getMessagesList())) return false;
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
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ListMessagesResponse prototype) {
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
   * [Conversations.ListMessages][google.cloud.dialogflow.v2beta1.Conversations.ListMessages].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListMessagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ListMessagesResponse)
      com.google.cloud.dialogflow.v2beta1.ListMessagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto.internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto.internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.class, com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.newBuilder()
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
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
      } else {
        messages_ = null;
        messagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto.internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListMessagesResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListMessagesResponse build() {
      com.google.cloud.dialogflow.v2beta1.ListMessagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListMessagesResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ListMessagesResponse result = new com.google.cloud.dialogflow.v2beta1.ListMessagesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2beta1.ListMessagesResponse result) {
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.ListMessagesResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ListMessagesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ListMessagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ListMessagesResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.getDefaultInstance()) return this;
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessagesFieldBuilder() : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
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
              com.google.cloud.dialogflow.v2beta1.Message m =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.Message.parser(),
                      extensionRegistry);
              if (messagesBuilder_ == null) {
                ensureMessagesIsMutable();
                messages_.add(m);
              } else {
                messagesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Message> messages_ =
      java.util.Collections.emptyList();
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Message>(messages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Message, com.google.cloud.dialogflow.v2beta1.Message.Builder, com.google.cloud.dialogflow.v2beta1.MessageOrBuilder> messagesBuilder_;

    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Message> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Message getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder setMessages(
        int index, com.google.cloud.dialogflow.v2beta1.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder setMessages(
        int index, com.google.cloud.dialogflow.v2beta1.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder addMessages(com.google.cloud.dialogflow.v2beta1.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder addMessages(
        int index, com.google.cloud.dialogflow.v2beta1.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder addMessages(
        com.google.cloud.dialogflow.v2beta1.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder addMessages(
        int index, com.google.cloud.dialogflow.v2beta1.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Message> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Message.Builder getMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.MessageOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);  } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.MessageOrBuilder> 
         getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Message.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Message.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Message.Builder addMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Message.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of messages. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * `messages` is sorted by `create_time` in descending order.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Message messages = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Message.Builder> 
         getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Message, com.google.cloud.dialogflow.v2beta1.Message.Builder, com.google.cloud.dialogflow.v2beta1.MessageOrBuilder> 
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Message, com.google.cloud.dialogflow.v2beta1.Message.Builder, com.google.cloud.dialogflow.v2beta1.MessageOrBuilder>(
                messages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        messages_ = null;
      }
      return messagesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Optional. Token to retrieve the next page of results, or empty if there are
     * no more results in the list.
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
     * Optional. Token to retrieve the next page of results, or empty if there are
     * no more results in the list.
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
     * Optional. Token to retrieve the next page of results, or empty if there are
     * no more results in the list.
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
     * Optional. Token to retrieve the next page of results, or empty if there are
     * no more results in the list.
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
     * Optional. Token to retrieve the next page of results, or empty if there are
     * no more results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ListMessagesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ListMessagesResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ListMessagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ListMessagesResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ListMessagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMessagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMessagesResponse>() {
    @java.lang.Override
    public ListMessagesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMessagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMessagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ListMessagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

