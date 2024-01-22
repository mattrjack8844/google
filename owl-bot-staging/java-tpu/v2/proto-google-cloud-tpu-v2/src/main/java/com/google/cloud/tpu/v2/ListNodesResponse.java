// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

/**
 * <pre>
 * Response for [ListNodes][google.cloud.tpu.v2.Tpu.ListNodes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.ListNodesResponse}
 */
public final class ListNodesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.ListNodesResponse)
    ListNodesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNodesResponse.newBuilder() to construct.
  private ListNodesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNodesResponse() {
    nodes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
    unreachable_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNodesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_ListNodesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_ListNodesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.ListNodesResponse.class, com.google.cloud.tpu.v2.ListNodesResponse.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.tpu.v2.Node> nodes_;
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.tpu.v2.Node> getNodesList() {
    return nodes_;
  }
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.tpu.v2.NodeOrBuilder> 
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
   */
  @java.lang.Override
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.Node getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.NodeOrBuilder getNodesOrBuilder(
      int index) {
    return nodes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The next page token or empty if none.
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
   * The next page token or empty if none.
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

  public static final int UNREACHABLE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList unreachable_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  public com.google.protobuf.ProtocolStringList
      getUnreachableList() {
    return unreachable_;
  }
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  public int getUnreachableCount() {
    return unreachable_.size();
  }
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  public java.lang.String getUnreachable(int index) {
    return unreachable_.get(index);
  }
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  public com.google.protobuf.ByteString
      getUnreachableBytes(int index) {
    return unreachable_.getByteString(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    for (int i = 0; i < unreachable_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unreachable_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < unreachable_.size(); i++) {
        dataSize += computeStringSizeNoTag(unreachable_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUnreachableList().size();
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
    if (!(obj instanceof com.google.cloud.tpu.v2.ListNodesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.ListNodesResponse other = (com.google.cloud.tpu.v2.ListNodesResponse) obj;

    if (!getNodesList()
        .equals(other.getNodesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getUnreachableList()
        .equals(other.getUnreachableList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (getUnreachableCount() > 0) {
      hash = (37 * hash) + UNREACHABLE_FIELD_NUMBER;
      hash = (53 * hash) + getUnreachableList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.ListNodesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.ListNodesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2.ListNodesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2.ListNodesResponse prototype) {
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
   * Response for [ListNodes][google.cloud.tpu.v2.Tpu.ListNodes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.ListNodesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.ListNodesResponse)
      com.google.cloud.tpu.v2.ListNodesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_ListNodesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_ListNodesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.ListNodesResponse.class, com.google.cloud.tpu.v2.ListNodesResponse.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.ListNodesResponse.newBuilder()
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
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
      } else {
        nodes_ = null;
        nodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      unreachable_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_ListNodesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.ListNodesResponse getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.ListNodesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.ListNodesResponse build() {
      com.google.cloud.tpu.v2.ListNodesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.ListNodesResponse buildPartial() {
      com.google.cloud.tpu.v2.ListNodesResponse result = new com.google.cloud.tpu.v2.ListNodesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.tpu.v2.ListNodesResponse result) {
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.tpu.v2.ListNodesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        unreachable_.makeImmutable();
        result.unreachable_ = unreachable_;
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
      if (other instanceof com.google.cloud.tpu.v2.ListNodesResponse) {
        return mergeFrom((com.google.cloud.tpu.v2.ListNodesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.ListNodesResponse other) {
      if (other == com.google.cloud.tpu.v2.ListNodesResponse.getDefaultInstance()) return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodesFieldBuilder() : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.unreachable_.isEmpty()) {
        if (unreachable_.isEmpty()) {
          unreachable_ = other.unreachable_;
          bitField0_ |= 0x00000004;
        } else {
          ensureUnreachableIsMutable();
          unreachable_.addAll(other.unreachable_);
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
              com.google.cloud.tpu.v2.Node m =
                  input.readMessage(
                      com.google.cloud.tpu.v2.Node.parser(),
                      extensionRegistry);
              if (nodesBuilder_ == null) {
                ensureNodesIsMutable();
                nodes_.add(m);
              } else {
                nodesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUnreachableIsMutable();
              unreachable_.add(s);
              break;
            } // case 26
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

    private java.util.List<com.google.cloud.tpu.v2.Node> nodes_ =
      java.util.Collections.emptyList();
    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<com.google.cloud.tpu.v2.Node>(nodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.tpu.v2.Node, com.google.cloud.tpu.v2.Node.Builder, com.google.cloud.tpu.v2.NodeOrBuilder> nodesBuilder_;

    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2.Node> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public com.google.cloud.tpu.v2.Node getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder setNodes(
        int index, com.google.cloud.tpu.v2.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder setNodes(
        int index, com.google.cloud.tpu.v2.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder addNodes(com.google.cloud.tpu.v2.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder addNodes(
        int index, com.google.cloud.tpu.v2.Node value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder addNodes(
        com.google.cloud.tpu.v2.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder addNodes(
        int index, com.google.cloud.tpu.v2.Node.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends com.google.cloud.tpu.v2.Node> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public com.google.cloud.tpu.v2.Node.Builder getNodesBuilder(
        int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public com.google.cloud.tpu.v2.NodeOrBuilder getNodesOrBuilder(
        int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);  } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.tpu.v2.NodeOrBuilder> 
         getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public com.google.cloud.tpu.v2.Node.Builder addNodesBuilder() {
      return getNodesFieldBuilder().addBuilder(
          com.google.cloud.tpu.v2.Node.getDefaultInstance());
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public com.google.cloud.tpu.v2.Node.Builder addNodesBuilder(
        int index) {
      return getNodesFieldBuilder().addBuilder(
          index, com.google.cloud.tpu.v2.Node.getDefaultInstance());
    }
    /**
     * <pre>
     * The listed nodes.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2.Node nodes = 1;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2.Node.Builder> 
         getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.tpu.v2.Node, com.google.cloud.tpu.v2.Node.Builder, com.google.cloud.tpu.v2.NodeOrBuilder> 
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tpu.v2.Node, com.google.cloud.tpu.v2.Node.Builder, com.google.cloud.tpu.v2.NodeOrBuilder>(
                nodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The next page token or empty if none.
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
     * The next page token or empty if none.
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
     * The next page token or empty if none.
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
     * The next page token or empty if none.
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
     * The next page token or empty if none.
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

    private com.google.protobuf.LazyStringArrayList unreachable_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUnreachableIsMutable() {
      if (!unreachable_.isModifiable()) {
        unreachable_ = new com.google.protobuf.LazyStringArrayList(unreachable_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @return A list containing the unreachable.
     */
    public com.google.protobuf.ProtocolStringList
        getUnreachableList() {
      unreachable_.makeImmutable();
      return unreachable_;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @return The count of unreachable.
     */
    public int getUnreachableCount() {
      return unreachable_.size();
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param index The index of the element to return.
     * @return The unreachable at the given index.
     */
    public java.lang.String getUnreachable(int index) {
      return unreachable_.get(index);
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the unreachable at the given index.
     */
    public com.google.protobuf.ByteString
        getUnreachableBytes(int index) {
      return unreachable_.getByteString(index);
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param index The index to set the value at.
     * @param value The unreachable to set.
     * @return This builder for chaining.
     */
    public Builder setUnreachable(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUnreachableIsMutable();
      unreachable_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param value The unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addUnreachable(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUnreachableIsMutable();
      unreachable_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param values The unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addAllUnreachable(
        java.lang.Iterable<java.lang.String> values) {
      ensureUnreachableIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, unreachable_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnreachable() {
      unreachable_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     * @param value The bytes of the unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addUnreachableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUnreachableIsMutable();
      unreachable_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.ListNodesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.ListNodesResponse)
  private static final com.google.cloud.tpu.v2.ListNodesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.ListNodesResponse();
  }

  public static com.google.cloud.tpu.v2.ListNodesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNodesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNodesResponse>() {
    @java.lang.Override
    public ListNodesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNodesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNodesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.ListNodesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

