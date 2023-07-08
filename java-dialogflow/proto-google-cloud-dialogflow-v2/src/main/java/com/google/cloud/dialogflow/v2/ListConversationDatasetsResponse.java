/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The response message for
 * [ConversationDatasets.ListConversationDatasets][google.cloud.dialogflow.v2.ConversationDatasets.ListConversationDatasets].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ListConversationDatasetsResponse}
 */
public final class ListConversationDatasetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ListConversationDatasetsResponse)
    ListConversationDatasetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListConversationDatasetsResponse.newBuilder() to construct.
  private ListConversationDatasetsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConversationDatasetsResponse() {
    conversationDatasets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConversationDatasetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.class,
            com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.Builder.class);
  }

  public static final int CONVERSATION_DATASETS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.ConversationDataset> conversationDatasets_;
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.ConversationDataset>
      getConversationDatasetsList() {
    return conversationDatasets_;
  }
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
      getConversationDatasetsOrBuilderList() {
    return conversationDatasets_;
  }
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public int getConversationDatasetsCount() {
    return conversationDatasets_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationDataset getConversationDatasets(int index) {
    return conversationDatasets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder
      getConversationDatasetsOrBuilder(int index) {
    return conversationDatasets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The token to use to retrieve the next page of results, or empty if there
   * are no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
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
   * The token to use to retrieve the next page of results, or empty if there
   * are no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
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
    for (int i = 0; i < conversationDatasets_.size(); i++) {
      output.writeMessage(1, conversationDatasets_.get(i));
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
    for (int i = 0; i < conversationDatasets_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, conversationDatasets_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse other =
        (com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse) obj;

    if (!getConversationDatasetsList().equals(other.getConversationDatasetsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getConversationDatasetsCount() > 0) {
      hash = (37 * hash) + CONVERSATION_DATASETS_FIELD_NUMBER;
      hash = (53 * hash) + getConversationDatasetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse parseFrom(
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
      com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse prototype) {
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
   * The response message for
   * [ConversationDatasets.ListConversationDatasets][google.cloud.dialogflow.v2.ConversationDatasets.ListConversationDatasets].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ListConversationDatasetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ListConversationDatasetsResponse)
      com.google.cloud.dialogflow.v2.ListConversationDatasetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.class,
              com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (conversationDatasetsBuilder_ == null) {
        conversationDatasets_ = java.util.Collections.emptyList();
      } else {
        conversationDatasets_ = null;
        conversationDatasetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse build() {
      com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse result =
          new com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse result) {
      if (conversationDatasetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          conversationDatasets_ = java.util.Collections.unmodifiableList(conversationDatasets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conversationDatasets_ = conversationDatasets_;
      } else {
        result.conversationDatasets_ = conversationDatasetsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse other) {
      if (other
          == com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse.getDefaultInstance())
        return this;
      if (conversationDatasetsBuilder_ == null) {
        if (!other.conversationDatasets_.isEmpty()) {
          if (conversationDatasets_.isEmpty()) {
            conversationDatasets_ = other.conversationDatasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConversationDatasetsIsMutable();
            conversationDatasets_.addAll(other.conversationDatasets_);
          }
          onChanged();
        }
      } else {
        if (!other.conversationDatasets_.isEmpty()) {
          if (conversationDatasetsBuilder_.isEmpty()) {
            conversationDatasetsBuilder_.dispose();
            conversationDatasetsBuilder_ = null;
            conversationDatasets_ = other.conversationDatasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conversationDatasetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getConversationDatasetsFieldBuilder()
                    : null;
          } else {
            conversationDatasetsBuilder_.addAllMessages(other.conversationDatasets_);
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
            case 10:
              {
                com.google.cloud.dialogflow.v2.ConversationDataset m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2.ConversationDataset.parser(),
                        extensionRegistry);
                if (conversationDatasetsBuilder_ == null) {
                  ensureConversationDatasetsIsMutable();
                  conversationDatasets_.add(m);
                } else {
                  conversationDatasetsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private java.util.List<com.google.cloud.dialogflow.v2.ConversationDataset>
        conversationDatasets_ = java.util.Collections.emptyList();

    private void ensureConversationDatasetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        conversationDatasets_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.ConversationDataset>(
                conversationDatasets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationDataset,
            com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
            com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
        conversationDatasetsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.ConversationDataset>
        getConversationDatasetsList() {
      if (conversationDatasetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(conversationDatasets_);
      } else {
        return conversationDatasetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public int getConversationDatasetsCount() {
      if (conversationDatasetsBuilder_ == null) {
        return conversationDatasets_.size();
      } else {
        return conversationDatasetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset getConversationDatasets(int index) {
      if (conversationDatasetsBuilder_ == null) {
        return conversationDatasets_.get(index);
      } else {
        return conversationDatasetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder setConversationDatasets(
        int index, com.google.cloud.dialogflow.v2.ConversationDataset value) {
      if (conversationDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.set(index, value);
        onChanged();
      } else {
        conversationDatasetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder setConversationDatasets(
        int index, com.google.cloud.dialogflow.v2.ConversationDataset.Builder builderForValue) {
      if (conversationDatasetsBuilder_ == null) {
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.set(index, builderForValue.build());
        onChanged();
      } else {
        conversationDatasetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder addConversationDatasets(
        com.google.cloud.dialogflow.v2.ConversationDataset value) {
      if (conversationDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.add(value);
        onChanged();
      } else {
        conversationDatasetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder addConversationDatasets(
        int index, com.google.cloud.dialogflow.v2.ConversationDataset value) {
      if (conversationDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.add(index, value);
        onChanged();
      } else {
        conversationDatasetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder addConversationDatasets(
        com.google.cloud.dialogflow.v2.ConversationDataset.Builder builderForValue) {
      if (conversationDatasetsBuilder_ == null) {
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.add(builderForValue.build());
        onChanged();
      } else {
        conversationDatasetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder addConversationDatasets(
        int index, com.google.cloud.dialogflow.v2.ConversationDataset.Builder builderForValue) {
      if (conversationDatasetsBuilder_ == null) {
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.add(index, builderForValue.build());
        onChanged();
      } else {
        conversationDatasetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder addAllConversationDatasets(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.ConversationDataset> values) {
      if (conversationDatasetsBuilder_ == null) {
        ensureConversationDatasetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conversationDatasets_);
        onChanged();
      } else {
        conversationDatasetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder clearConversationDatasets() {
      if (conversationDatasetsBuilder_ == null) {
        conversationDatasets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conversationDatasetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public Builder removeConversationDatasets(int index) {
      if (conversationDatasetsBuilder_ == null) {
        ensureConversationDatasetsIsMutable();
        conversationDatasets_.remove(index);
        onChanged();
      } else {
        conversationDatasetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset.Builder
        getConversationDatasetsBuilder(int index) {
      return getConversationDatasetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder
        getConversationDatasetsOrBuilder(int index) {
      if (conversationDatasetsBuilder_ == null) {
        return conversationDatasets_.get(index);
      } else {
        return conversationDatasetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
        getConversationDatasetsOrBuilderList() {
      if (conversationDatasetsBuilder_ != null) {
        return conversationDatasetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(conversationDatasets_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset.Builder
        addConversationDatasetsBuilder() {
      return getConversationDatasetsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset.Builder
        addConversationDatasetsBuilder(int index) {
      return getConversationDatasetsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationDataset conversation_datasets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.ConversationDataset.Builder>
        getConversationDatasetsBuilderList() {
      return getConversationDatasetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationDataset,
            com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
            com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
        getConversationDatasetsFieldBuilder() {
      if (conversationDatasetsBuilder_ == null) {
        conversationDatasetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ConversationDataset,
                com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
                com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>(
                conversationDatasets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        conversationDatasets_ = null;
      }
      return conversationDatasetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token to use to retrieve the next page of results, or empty if there
     * are no more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
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
     * The token to use to retrieve the next page of results, or empty if there
     * are no more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
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
     * The token to use to retrieve the next page of results, or empty if there
     * are no more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to use to retrieve the next page of results, or empty if there
     * are no more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to use to retrieve the next page of results, or empty if there
     * are no more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ListConversationDatasetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ListConversationDatasetsResponse)
  private static final com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse();
  }

  public static com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConversationDatasetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConversationDatasetsResponse>() {
        @java.lang.Override
        public ListConversationDatasetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConversationDatasetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConversationDatasetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ListConversationDatasetsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
