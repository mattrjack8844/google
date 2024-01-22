// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * Response object for `ListHydratedDeployments`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse}
 */
public final class ListHydratedDeploymentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)
    ListHydratedDeploymentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHydratedDeploymentsResponse.newBuilder() to construct.
  private ListHydratedDeploymentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHydratedDeploymentsResponse() {
    hydratedDeployments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHydratedDeploymentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ListHydratedDeploymentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ListHydratedDeploymentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.class, com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.Builder.class);
  }

  public static final int HYDRATED_DEPLOYMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment> hydratedDeployments_;
  /**
   * <pre>
   * The list of hydrated deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment> getHydratedDeploymentsList() {
    return hydratedDeployments_;
  }
  /**
   * <pre>
   * The list of hydrated deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder> 
      getHydratedDeploymentsOrBuilderList() {
    return hydratedDeployments_;
  }
  /**
   * <pre>
   * The list of hydrated deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
   */
  @java.lang.Override
  public int getHydratedDeploymentsCount() {
    return hydratedDeployments_.size();
  }
  /**
   * <pre>
   * The list of hydrated deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment getHydratedDeployments(int index) {
    return hydratedDeployments_.get(index);
  }
  /**
   * <pre>
   * The list of hydrated deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder getHydratedDeploymentsOrBuilder(
      int index) {
    return hydratedDeployments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
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
   * A token that can be sent as `page_token` to retrieve the next page.
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
    for (int i = 0; i < hydratedDeployments_.size(); i++) {
      output.writeMessage(1, hydratedDeployments_.get(i));
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
    for (int i = 0; i < hydratedDeployments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hydratedDeployments_.get(i));
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse other = (com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse) obj;

    if (!getHydratedDeploymentsList()
        .equals(other.getHydratedDeploymentsList())) return false;
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
    if (getHydratedDeploymentsCount() > 0) {
      hash = (37 * hash) + HYDRATED_DEPLOYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getHydratedDeploymentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse prototype) {
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
   * Response object for `ListHydratedDeployments`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)
      com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ListHydratedDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ListHydratedDeploymentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.class, com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.newBuilder()
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
      if (hydratedDeploymentsBuilder_ == null) {
        hydratedDeployments_ = java.util.Collections.emptyList();
      } else {
        hydratedDeployments_ = null;
        hydratedDeploymentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ListHydratedDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse build() {
      com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse buildPartial() {
      com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse result = new com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse result) {
      if (hydratedDeploymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hydratedDeployments_ = java.util.Collections.unmodifiableList(hydratedDeployments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hydratedDeployments_ = hydratedDeployments_;
      } else {
        result.hydratedDeployments_ = hydratedDeploymentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse result) {
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
      if (other instanceof com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse) {
        return mergeFrom((com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse other) {
      if (other == com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse.getDefaultInstance()) return this;
      if (hydratedDeploymentsBuilder_ == null) {
        if (!other.hydratedDeployments_.isEmpty()) {
          if (hydratedDeployments_.isEmpty()) {
            hydratedDeployments_ = other.hydratedDeployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHydratedDeploymentsIsMutable();
            hydratedDeployments_.addAll(other.hydratedDeployments_);
          }
          onChanged();
        }
      } else {
        if (!other.hydratedDeployments_.isEmpty()) {
          if (hydratedDeploymentsBuilder_.isEmpty()) {
            hydratedDeploymentsBuilder_.dispose();
            hydratedDeploymentsBuilder_ = null;
            hydratedDeployments_ = other.hydratedDeployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hydratedDeploymentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHydratedDeploymentsFieldBuilder() : null;
          } else {
            hydratedDeploymentsBuilder_.addAllMessages(other.hydratedDeployments_);
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
              com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment m =
                  input.readMessage(
                      com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.parser(),
                      extensionRegistry);
              if (hydratedDeploymentsBuilder_ == null) {
                ensureHydratedDeploymentsIsMutable();
                hydratedDeployments_.add(m);
              } else {
                hydratedDeploymentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment> hydratedDeployments_ =
      java.util.Collections.emptyList();
    private void ensureHydratedDeploymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hydratedDeployments_ = new java.util.ArrayList<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment>(hydratedDeployments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder> hydratedDeploymentsBuilder_;

    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment> getHydratedDeploymentsList() {
      if (hydratedDeploymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hydratedDeployments_);
      } else {
        return hydratedDeploymentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public int getHydratedDeploymentsCount() {
      if (hydratedDeploymentsBuilder_ == null) {
        return hydratedDeployments_.size();
      } else {
        return hydratedDeploymentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment getHydratedDeployments(int index) {
      if (hydratedDeploymentsBuilder_ == null) {
        return hydratedDeployments_.get(index);
      } else {
        return hydratedDeploymentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder setHydratedDeployments(
        int index, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment value) {
      if (hydratedDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.set(index, value);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder setHydratedDeployments(
        int index, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder builderForValue) {
      if (hydratedDeploymentsBuilder_ == null) {
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.set(index, builderForValue.build());
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder addHydratedDeployments(com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment value) {
      if (hydratedDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.add(value);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder addHydratedDeployments(
        int index, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment value) {
      if (hydratedDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.add(index, value);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder addHydratedDeployments(
        com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder builderForValue) {
      if (hydratedDeploymentsBuilder_ == null) {
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.add(builderForValue.build());
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder addHydratedDeployments(
        int index, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder builderForValue) {
      if (hydratedDeploymentsBuilder_ == null) {
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.add(index, builderForValue.build());
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder addAllHydratedDeployments(
        java.lang.Iterable<? extends com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment> values) {
      if (hydratedDeploymentsBuilder_ == null) {
        ensureHydratedDeploymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hydratedDeployments_);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder clearHydratedDeployments() {
      if (hydratedDeploymentsBuilder_ == null) {
        hydratedDeployments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public Builder removeHydratedDeployments(int index) {
      if (hydratedDeploymentsBuilder_ == null) {
        ensureHydratedDeploymentsIsMutable();
        hydratedDeployments_.remove(index);
        onChanged();
      } else {
        hydratedDeploymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder getHydratedDeploymentsBuilder(
        int index) {
      return getHydratedDeploymentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder getHydratedDeploymentsOrBuilder(
        int index) {
      if (hydratedDeploymentsBuilder_ == null) {
        return hydratedDeployments_.get(index);  } else {
        return hydratedDeploymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder> 
         getHydratedDeploymentsOrBuilderList() {
      if (hydratedDeploymentsBuilder_ != null) {
        return hydratedDeploymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hydratedDeployments_);
      }
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder addHydratedDeploymentsBuilder() {
      return getHydratedDeploymentsFieldBuilder().addBuilder(
          com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder addHydratedDeploymentsBuilder(
        int index) {
      return getHydratedDeploymentsFieldBuilder().addBuilder(
          index, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of hydrated deployments.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder> 
         getHydratedDeploymentsBuilderList() {
      return getHydratedDeploymentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder> 
        getHydratedDeploymentsFieldBuilder() {
      if (hydratedDeploymentsBuilder_ == null) {
        hydratedDeploymentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment, com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder>(
                hydratedDeployments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hydratedDeployments_ = null;
      }
      return hydratedDeploymentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
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
     * A token that can be sent as `page_token` to retrieve the next page.
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
     * A token that can be sent as `page_token` to retrieve the next page.
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
     * A token that can be sent as `page_token` to retrieve the next page.
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
     * A token that can be sent as `page_token` to retrieve the next page.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse)
  private static final com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse();
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHydratedDeploymentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListHydratedDeploymentsResponse>() {
    @java.lang.Override
    public ListHydratedDeploymentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHydratedDeploymentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHydratedDeploymentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.ListHydratedDeploymentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

