// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/control_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

/**
 * <pre>
 * Response for ListControls method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.ListControlsResponse}
 */
public final class ListControlsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.ListControlsResponse)
    ListControlsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListControlsResponse.newBuilder() to construct.
  private ListControlsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListControlsResponse() {
    controls_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListControlsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2.ControlServiceProto.internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ControlServiceProto.internal_static_google_cloud_retail_v2_ListControlsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.ListControlsResponse.class, com.google.cloud.retail.v2.ListControlsResponse.Builder.class);
  }

  public static final int CONTROLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.retail.v2.Control> controls_;
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2.Control> getControlsList() {
    return controls_;
  }
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.retail.v2.ControlOrBuilder> 
      getControlsOrBuilderList() {
    return controls_;
  }
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
   */
  @java.lang.Override
  public int getControlsCount() {
    return controls_.size();
  }
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.Control getControls(int index) {
    return controls_.get(index);
  }
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ControlOrBuilder getControlsOrBuilder(
      int index) {
    return controls_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Pagination token, if not returned indicates the last page.
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
   * Pagination token, if not returned indicates the last page.
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
    for (int i = 0; i < controls_.size(); i++) {
      output.writeMessage(1, controls_.get(i));
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
    for (int i = 0; i < controls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, controls_.get(i));
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
    if (!(obj instanceof com.google.cloud.retail.v2.ListControlsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.ListControlsResponse other = (com.google.cloud.retail.v2.ListControlsResponse) obj;

    if (!getControlsList()
        .equals(other.getControlsList())) return false;
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
    if (getControlsCount() > 0) {
      hash = (37 * hash) + CONTROLS_FIELD_NUMBER;
      hash = (53 * hash) + getControlsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ListControlsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.ListControlsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ListControlsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2.ListControlsResponse prototype) {
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
   * Response for ListControls method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.ListControlsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.ListControlsResponse)
      com.google.cloud.retail.v2.ListControlsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2.ControlServiceProto.internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ControlServiceProto.internal_static_google_cloud_retail_v2_ListControlsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.ListControlsResponse.class, com.google.cloud.retail.v2.ListControlsResponse.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.ListControlsResponse.newBuilder()
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
      if (controlsBuilder_ == null) {
        controls_ = java.util.Collections.emptyList();
      } else {
        controls_ = null;
        controlsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2.ControlServiceProto.internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ListControlsResponse getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.ListControlsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ListControlsResponse build() {
      com.google.cloud.retail.v2.ListControlsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ListControlsResponse buildPartial() {
      com.google.cloud.retail.v2.ListControlsResponse result = new com.google.cloud.retail.v2.ListControlsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.retail.v2.ListControlsResponse result) {
      if (controlsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          controls_ = java.util.Collections.unmodifiableList(controls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.controls_ = controls_;
      } else {
        result.controls_ = controlsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.retail.v2.ListControlsResponse result) {
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
      if (other instanceof com.google.cloud.retail.v2.ListControlsResponse) {
        return mergeFrom((com.google.cloud.retail.v2.ListControlsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.ListControlsResponse other) {
      if (other == com.google.cloud.retail.v2.ListControlsResponse.getDefaultInstance()) return this;
      if (controlsBuilder_ == null) {
        if (!other.controls_.isEmpty()) {
          if (controls_.isEmpty()) {
            controls_ = other.controls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureControlsIsMutable();
            controls_.addAll(other.controls_);
          }
          onChanged();
        }
      } else {
        if (!other.controls_.isEmpty()) {
          if (controlsBuilder_.isEmpty()) {
            controlsBuilder_.dispose();
            controlsBuilder_ = null;
            controls_ = other.controls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            controlsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getControlsFieldBuilder() : null;
          } else {
            controlsBuilder_.addAllMessages(other.controls_);
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
              com.google.cloud.retail.v2.Control m =
                  input.readMessage(
                      com.google.cloud.retail.v2.Control.parser(),
                      extensionRegistry);
              if (controlsBuilder_ == null) {
                ensureControlsIsMutable();
                controls_.add(m);
              } else {
                controlsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.retail.v2.Control> controls_ =
      java.util.Collections.emptyList();
    private void ensureControlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        controls_ = new java.util.ArrayList<com.google.cloud.retail.v2.Control>(controls_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2.Control, com.google.cloud.retail.v2.Control.Builder, com.google.cloud.retail.v2.ControlOrBuilder> controlsBuilder_;

    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2.Control> getControlsList() {
      if (controlsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(controls_);
      } else {
        return controlsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public int getControlsCount() {
      if (controlsBuilder_ == null) {
        return controls_.size();
      } else {
        return controlsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public com.google.cloud.retail.v2.Control getControls(int index) {
      if (controlsBuilder_ == null) {
        return controls_.get(index);
      } else {
        return controlsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder setControls(
        int index, com.google.cloud.retail.v2.Control value) {
      if (controlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControlsIsMutable();
        controls_.set(index, value);
        onChanged();
      } else {
        controlsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder setControls(
        int index, com.google.cloud.retail.v2.Control.Builder builderForValue) {
      if (controlsBuilder_ == null) {
        ensureControlsIsMutable();
        controls_.set(index, builderForValue.build());
        onChanged();
      } else {
        controlsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder addControls(com.google.cloud.retail.v2.Control value) {
      if (controlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControlsIsMutable();
        controls_.add(value);
        onChanged();
      } else {
        controlsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder addControls(
        int index, com.google.cloud.retail.v2.Control value) {
      if (controlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControlsIsMutable();
        controls_.add(index, value);
        onChanged();
      } else {
        controlsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder addControls(
        com.google.cloud.retail.v2.Control.Builder builderForValue) {
      if (controlsBuilder_ == null) {
        ensureControlsIsMutable();
        controls_.add(builderForValue.build());
        onChanged();
      } else {
        controlsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder addControls(
        int index, com.google.cloud.retail.v2.Control.Builder builderForValue) {
      if (controlsBuilder_ == null) {
        ensureControlsIsMutable();
        controls_.add(index, builderForValue.build());
        onChanged();
      } else {
        controlsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder addAllControls(
        java.lang.Iterable<? extends com.google.cloud.retail.v2.Control> values) {
      if (controlsBuilder_ == null) {
        ensureControlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, controls_);
        onChanged();
      } else {
        controlsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder clearControls() {
      if (controlsBuilder_ == null) {
        controls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        controlsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public Builder removeControls(int index) {
      if (controlsBuilder_ == null) {
        ensureControlsIsMutable();
        controls_.remove(index);
        onChanged();
      } else {
        controlsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public com.google.cloud.retail.v2.Control.Builder getControlsBuilder(
        int index) {
      return getControlsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public com.google.cloud.retail.v2.ControlOrBuilder getControlsOrBuilder(
        int index) {
      if (controlsBuilder_ == null) {
        return controls_.get(index);  } else {
        return controlsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.retail.v2.ControlOrBuilder> 
         getControlsOrBuilderList() {
      if (controlsBuilder_ != null) {
        return controlsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(controls_);
      }
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public com.google.cloud.retail.v2.Control.Builder addControlsBuilder() {
      return getControlsFieldBuilder().addBuilder(
          com.google.cloud.retail.v2.Control.getDefaultInstance());
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public com.google.cloud.retail.v2.Control.Builder addControlsBuilder(
        int index) {
      return getControlsFieldBuilder().addBuilder(
          index, com.google.cloud.retail.v2.Control.getDefaultInstance());
    }
    /**
     * <pre>
     * All the Controls for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2.Control controls = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2.Control.Builder> 
         getControlsBuilderList() {
      return getControlsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2.Control, com.google.cloud.retail.v2.Control.Builder, com.google.cloud.retail.v2.ControlOrBuilder> 
        getControlsFieldBuilder() {
      if (controlsBuilder_ == null) {
        controlsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2.Control, com.google.cloud.retail.v2.Control.Builder, com.google.cloud.retail.v2.ControlOrBuilder>(
                controls_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        controls_ = null;
      }
      return controlsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.ListControlsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.ListControlsResponse)
  private static final com.google.cloud.retail.v2.ListControlsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.ListControlsResponse();
  }

  public static com.google.cloud.retail.v2.ListControlsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListControlsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListControlsResponse>() {
    @java.lang.Override
    public ListControlsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListControlsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListControlsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.ListControlsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

