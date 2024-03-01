// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for ListServiceRollouts method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsResponse}
 */
public final class ListServiceRolloutsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
    ListServiceRolloutsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListServiceRolloutsResponse.newBuilder() to construct.
  private ListServiceRolloutsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListServiceRolloutsResponse() {
    rollouts_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListServiceRolloutsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.class, com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.Builder.class);
  }

  public static final int ROLLOUTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.api.servicemanagement.v1.Rollout> rollouts_;
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.servicemanagement.v1.Rollout> getRolloutsList() {
    return rollouts_;
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.servicemanagement.v1.RolloutOrBuilder> 
      getRolloutsOrBuilderList() {
    return rollouts_;
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  @java.lang.Override
  public int getRolloutsCount() {
    return rollouts_.size();
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.Rollout getRollouts(int index) {
    return rollouts_.get(index);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutsOrBuilder(
      int index) {
    return rollouts_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The token of the next page of results.
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
   * The token of the next page of results.
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
    for (int i = 0; i < rollouts_.size(); i++) {
      output.writeMessage(1, rollouts_.get(i));
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
    for (int i = 0; i < rollouts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rollouts_.get(i));
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.ListServiceRolloutsResponse)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ListServiceRolloutsResponse other = (com.google.api.servicemanagement.v1.ListServiceRolloutsResponse) obj;

    if (!getRolloutsList()
        .equals(other.getRolloutsList())) return false;
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
    if (getRolloutsCount() > 0) {
      hash = (37 * hash) + ROLLOUTS_FIELD_NUMBER;
      hash = (53 * hash) + getRolloutsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
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
  public static Builder newBuilder(com.google.api.servicemanagement.v1.ListServiceRolloutsResponse prototype) {
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
   * Response message for ListServiceRollouts method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
      com.google.api.servicemanagement.v1.ListServiceRolloutsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.class, com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.newBuilder()
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
      if (rolloutsBuilder_ == null) {
        rollouts_ = java.util.Collections.emptyList();
      } else {
        rollouts_ = null;
        rolloutsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceRolloutsResponse getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceRolloutsResponse build() {
      com.google.api.servicemanagement.v1.ListServiceRolloutsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceRolloutsResponse buildPartial() {
      com.google.api.servicemanagement.v1.ListServiceRolloutsResponse result = new com.google.api.servicemanagement.v1.ListServiceRolloutsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.servicemanagement.v1.ListServiceRolloutsResponse result) {
      if (rolloutsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rollouts_ = java.util.Collections.unmodifiableList(rollouts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rollouts_ = rollouts_;
      } else {
        result.rollouts_ = rolloutsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.servicemanagement.v1.ListServiceRolloutsResponse result) {
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
      if (other instanceof com.google.api.servicemanagement.v1.ListServiceRolloutsResponse) {
        return mergeFrom((com.google.api.servicemanagement.v1.ListServiceRolloutsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ListServiceRolloutsResponse other) {
      if (other == com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.getDefaultInstance()) return this;
      if (rolloutsBuilder_ == null) {
        if (!other.rollouts_.isEmpty()) {
          if (rollouts_.isEmpty()) {
            rollouts_ = other.rollouts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRolloutsIsMutable();
            rollouts_.addAll(other.rollouts_);
          }
          onChanged();
        }
      } else {
        if (!other.rollouts_.isEmpty()) {
          if (rolloutsBuilder_.isEmpty()) {
            rolloutsBuilder_.dispose();
            rolloutsBuilder_ = null;
            rollouts_ = other.rollouts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rolloutsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRolloutsFieldBuilder() : null;
          } else {
            rolloutsBuilder_.addAllMessages(other.rollouts_);
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
              com.google.api.servicemanagement.v1.Rollout m =
                  input.readMessage(
                      com.google.api.servicemanagement.v1.Rollout.parser(),
                      extensionRegistry);
              if (rolloutsBuilder_ == null) {
                ensureRolloutsIsMutable();
                rollouts_.add(m);
              } else {
                rolloutsBuilder_.addMessage(m);
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

    private java.util.List<com.google.api.servicemanagement.v1.Rollout> rollouts_ =
      java.util.Collections.emptyList();
    private void ensureRolloutsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rollouts_ = new java.util.ArrayList<com.google.api.servicemanagement.v1.Rollout>(rollouts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder> rolloutsBuilder_;

    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.Rollout> getRolloutsList() {
      if (rolloutsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rollouts_);
      } else {
        return rolloutsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public int getRolloutsCount() {
      if (rolloutsBuilder_ == null) {
        return rollouts_.size();
      } else {
        return rolloutsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout getRollouts(int index) {
      if (rolloutsBuilder_ == null) {
        return rollouts_.get(index);
      } else {
        return rolloutsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder setRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolloutsIsMutable();
        rollouts_.set(index, value);
        onChanged();
      } else {
        rolloutsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder setRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      if (rolloutsBuilder_ == null) {
        ensureRolloutsIsMutable();
        rollouts_.set(index, builderForValue.build());
        onChanged();
      } else {
        rolloutsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolloutsIsMutable();
        rollouts_.add(value);
        onChanged();
      } else {
        rolloutsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolloutsIsMutable();
        rollouts_.add(index, value);
        onChanged();
      } else {
        rolloutsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      if (rolloutsBuilder_ == null) {
        ensureRolloutsIsMutable();
        rollouts_.add(builderForValue.build());
        onChanged();
      } else {
        rolloutsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      if (rolloutsBuilder_ == null) {
        ensureRolloutsIsMutable();
        rollouts_.add(index, builderForValue.build());
        onChanged();
      } else {
        rolloutsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addAllRollouts(
        java.lang.Iterable<? extends com.google.api.servicemanagement.v1.Rollout> values) {
      if (rolloutsBuilder_ == null) {
        ensureRolloutsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rollouts_);
        onChanged();
      } else {
        rolloutsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder clearRollouts() {
      if (rolloutsBuilder_ == null) {
        rollouts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rolloutsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder removeRollouts(int index) {
      if (rolloutsBuilder_ == null) {
        ensureRolloutsIsMutable();
        rollouts_.remove(index);
        onChanged();
      } else {
        rolloutsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout.Builder getRolloutsBuilder(
        int index) {
      return getRolloutsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutsOrBuilder(
        int index) {
      if (rolloutsBuilder_ == null) {
        return rollouts_.get(index);  } else {
        return rolloutsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public java.util.List<? extends com.google.api.servicemanagement.v1.RolloutOrBuilder> 
         getRolloutsOrBuilderList() {
      if (rolloutsBuilder_ != null) {
        return rolloutsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rollouts_);
      }
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout.Builder addRolloutsBuilder() {
      return getRolloutsFieldBuilder().addBuilder(
          com.google.api.servicemanagement.v1.Rollout.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout.Builder addRolloutsBuilder(
        int index) {
      return getRolloutsFieldBuilder().addBuilder(
          index, com.google.api.servicemanagement.v1.Rollout.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.Rollout.Builder> 
         getRolloutsBuilderList() {
      return getRolloutsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder> 
        getRolloutsFieldBuilder() {
      if (rolloutsBuilder_ == null) {
        rolloutsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder>(
                rollouts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rollouts_ = null;
      }
      return rolloutsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The token of the next page of results.
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
     * The token of the next page of results.
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
     * The token of the next page of results.
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
     * The token of the next page of results.
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
     * The token of the next page of results.
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


    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
  private static final com.google.api.servicemanagement.v1.ListServiceRolloutsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ListServiceRolloutsResponse();
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceRolloutsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListServiceRolloutsResponse>() {
    @java.lang.Override
    public ListServiceRolloutsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListServiceRolloutsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceRolloutsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.ListServiceRolloutsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

