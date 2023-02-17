// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Response message for ListAccessBindings RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListAccessBindingsResponse}
 */
public final class ListAccessBindingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListAccessBindingsResponse)
    ListAccessBindingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAccessBindingsResponse.newBuilder() to construct.
  private ListAccessBindingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAccessBindingsResponse() {
    accessBindings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAccessBindingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListAccessBindingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListAccessBindingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.class, com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.Builder.class);
  }

  public static final int ACCESS_BINDINGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.AccessBinding> accessBindings_;
  /**
   * <pre>
   * List of AccessBindings. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.AccessBinding> getAccessBindingsList() {
    return accessBindings_;
  }
  /**
   * <pre>
   * List of AccessBindings. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.AccessBindingOrBuilder> 
      getAccessBindingsOrBuilderList() {
    return accessBindings_;
  }
  /**
   * <pre>
   * List of AccessBindings. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  @java.lang.Override
  public int getAccessBindingsCount() {
    return accessBindings_.size();
  }
  /**
   * <pre>
   * List of AccessBindings. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AccessBinding getAccessBindings(int index) {
    return accessBindings_.get(index);
  }
  /**
   * <pre>
   * List of AccessBindings. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AccessBindingOrBuilder getAccessBindingsOrBuilder(
      int index) {
    return accessBindings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < accessBindings_.size(); i++) {
      output.writeMessage(1, accessBindings_.get(i));
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
    for (int i = 0; i < accessBindings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accessBindings_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListAccessBindingsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListAccessBindingsResponse other = (com.google.analytics.admin.v1alpha.ListAccessBindingsResponse) obj;

    if (!getAccessBindingsList()
        .equals(other.getAccessBindingsList())) return false;
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
    if (getAccessBindingsCount() > 0) {
      hash = (37 * hash) + ACCESS_BINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessBindingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.ListAccessBindingsResponse prototype) {
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
   * Response message for ListAccessBindings RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListAccessBindingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListAccessBindingsResponse)
      com.google.analytics.admin.v1alpha.ListAccessBindingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListAccessBindingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListAccessBindingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.class, com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.newBuilder()
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
      if (accessBindingsBuilder_ == null) {
        accessBindings_ = java.util.Collections.emptyList();
      } else {
        accessBindings_ = null;
        accessBindingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListAccessBindingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAccessBindingsResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAccessBindingsResponse build() {
      com.google.analytics.admin.v1alpha.ListAccessBindingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAccessBindingsResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListAccessBindingsResponse result = new com.google.analytics.admin.v1alpha.ListAccessBindingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.analytics.admin.v1alpha.ListAccessBindingsResponse result) {
      if (accessBindingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessBindings_ = java.util.Collections.unmodifiableList(accessBindings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessBindings_ = accessBindings_;
      } else {
        result.accessBindings_ = accessBindingsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.ListAccessBindingsResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListAccessBindingsResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListAccessBindingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListAccessBindingsResponse other) {
      if (other == com.google.analytics.admin.v1alpha.ListAccessBindingsResponse.getDefaultInstance()) return this;
      if (accessBindingsBuilder_ == null) {
        if (!other.accessBindings_.isEmpty()) {
          if (accessBindings_.isEmpty()) {
            accessBindings_ = other.accessBindings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessBindingsIsMutable();
            accessBindings_.addAll(other.accessBindings_);
          }
          onChanged();
        }
      } else {
        if (!other.accessBindings_.isEmpty()) {
          if (accessBindingsBuilder_.isEmpty()) {
            accessBindingsBuilder_.dispose();
            accessBindingsBuilder_ = null;
            accessBindings_ = other.accessBindings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessBindingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccessBindingsFieldBuilder() : null;
          } else {
            accessBindingsBuilder_.addAllMessages(other.accessBindings_);
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
              com.google.analytics.admin.v1alpha.AccessBinding m =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.AccessBinding.parser(),
                      extensionRegistry);
              if (accessBindingsBuilder_ == null) {
                ensureAccessBindingsIsMutable();
                accessBindings_.add(m);
              } else {
                accessBindingsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1alpha.AccessBinding> accessBindings_ =
      java.util.Collections.emptyList();
    private void ensureAccessBindingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessBindings_ = new java.util.ArrayList<com.google.analytics.admin.v1alpha.AccessBinding>(accessBindings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.AccessBinding, com.google.analytics.admin.v1alpha.AccessBinding.Builder, com.google.analytics.admin.v1alpha.AccessBindingOrBuilder> accessBindingsBuilder_;

    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AccessBinding> getAccessBindingsList() {
      if (accessBindingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessBindings_);
      } else {
        return accessBindingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public int getAccessBindingsCount() {
      if (accessBindingsBuilder_ == null) {
        return accessBindings_.size();
      } else {
        return accessBindingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccessBinding getAccessBindings(int index) {
      if (accessBindingsBuilder_ == null) {
        return accessBindings_.get(index);
      } else {
        return accessBindingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder setAccessBindings(
        int index, com.google.analytics.admin.v1alpha.AccessBinding value) {
      if (accessBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessBindingsIsMutable();
        accessBindings_.set(index, value);
        onChanged();
      } else {
        accessBindingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder setAccessBindings(
        int index, com.google.analytics.admin.v1alpha.AccessBinding.Builder builderForValue) {
      if (accessBindingsBuilder_ == null) {
        ensureAccessBindingsIsMutable();
        accessBindings_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessBindingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder addAccessBindings(com.google.analytics.admin.v1alpha.AccessBinding value) {
      if (accessBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessBindingsIsMutable();
        accessBindings_.add(value);
        onChanged();
      } else {
        accessBindingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder addAccessBindings(
        int index, com.google.analytics.admin.v1alpha.AccessBinding value) {
      if (accessBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessBindingsIsMutable();
        accessBindings_.add(index, value);
        onChanged();
      } else {
        accessBindingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder addAccessBindings(
        com.google.analytics.admin.v1alpha.AccessBinding.Builder builderForValue) {
      if (accessBindingsBuilder_ == null) {
        ensureAccessBindingsIsMutable();
        accessBindings_.add(builderForValue.build());
        onChanged();
      } else {
        accessBindingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder addAccessBindings(
        int index, com.google.analytics.admin.v1alpha.AccessBinding.Builder builderForValue) {
      if (accessBindingsBuilder_ == null) {
        ensureAccessBindingsIsMutable();
        accessBindings_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessBindingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder addAllAccessBindings(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.AccessBinding> values) {
      if (accessBindingsBuilder_ == null) {
        ensureAccessBindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accessBindings_);
        onChanged();
      } else {
        accessBindingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder clearAccessBindings() {
      if (accessBindingsBuilder_ == null) {
        accessBindings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessBindingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public Builder removeAccessBindings(int index) {
      if (accessBindingsBuilder_ == null) {
        ensureAccessBindingsIsMutable();
        accessBindings_.remove(index);
        onChanged();
      } else {
        accessBindingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccessBinding.Builder getAccessBindingsBuilder(
        int index) {
      return getAccessBindingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccessBindingOrBuilder getAccessBindingsOrBuilder(
        int index) {
      if (accessBindingsBuilder_ == null) {
        return accessBindings_.get(index);  } else {
        return accessBindingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.AccessBindingOrBuilder> 
         getAccessBindingsOrBuilderList() {
      if (accessBindingsBuilder_ != null) {
        return accessBindingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessBindings_);
      }
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccessBinding.Builder addAccessBindingsBuilder() {
      return getAccessBindingsFieldBuilder().addBuilder(
          com.google.analytics.admin.v1alpha.AccessBinding.getDefaultInstance());
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccessBinding.Builder addAccessBindingsBuilder(
        int index) {
      return getAccessBindingsFieldBuilder().addBuilder(
          index, com.google.analytics.admin.v1alpha.AccessBinding.getDefaultInstance());
    }
    /**
     * <pre>
     * List of AccessBindings. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AccessBinding.Builder> 
         getAccessBindingsBuilderList() {
      return getAccessBindingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.AccessBinding, com.google.analytics.admin.v1alpha.AccessBinding.Builder, com.google.analytics.admin.v1alpha.AccessBindingOrBuilder> 
        getAccessBindingsFieldBuilder() {
      if (accessBindingsBuilder_ == null) {
        accessBindingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AccessBinding, com.google.analytics.admin.v1alpha.AccessBinding.Builder, com.google.analytics.admin.v1alpha.AccessBindingOrBuilder>(
                accessBindings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessBindings_ = null;
      }
      return accessBindingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListAccessBindingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListAccessBindingsResponse)
  private static final com.google.analytics.admin.v1alpha.ListAccessBindingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListAccessBindingsResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListAccessBindingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccessBindingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAccessBindingsResponse>() {
    @java.lang.Override
    public ListAccessBindingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccessBindingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccessBindingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListAccessBindingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

