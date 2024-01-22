// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

/**
 * <pre>
 * List of deployment revisions for a given deployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse}
 */
public final class ListDeploymentRevisionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)
    ListDeploymentRevisionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDeploymentRevisionsResponse.newBuilder() to construct.
  private ListDeploymentRevisionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDeploymentRevisionsResponse() {
    deployments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDeploymentRevisionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_ListDeploymentRevisionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_ListDeploymentRevisionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.class, com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.Builder.class);
  }

  public static final int DEPLOYMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.telcoautomation.v1.Deployment> deployments_;
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.telcoautomation.v1.Deployment> getDeploymentsList() {
    return deployments_;
  }
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.telcoautomation.v1.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList() {
    return deployments_;
  }
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public int getDeploymentsCount() {
    return deployments_.size();
  }
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.Deployment getDeployments(int index) {
    return deployments_.get(index);
  }
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index) {
    return deployments_.get(index);
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
    for (int i = 0; i < deployments_.size(); i++) {
      output.writeMessage(1, deployments_.get(i));
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
    for (int i = 0; i < deployments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deployments_.get(i));
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse other = (com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse) obj;

    if (!getDeploymentsList()
        .equals(other.getDeploymentsList())) return false;
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
    if (getDeploymentsCount() > 0) {
      hash = (37 * hash) + DEPLOYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse prototype) {
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
   * List of deployment revisions for a given deployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)
      com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_ListDeploymentRevisionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_ListDeploymentRevisionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.class, com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.newBuilder()
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
      if (deploymentsBuilder_ == null) {
        deployments_ = java.util.Collections.emptyList();
      } else {
        deployments_ = null;
        deploymentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_ListDeploymentRevisionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse build() {
      com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse buildPartial() {
      com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse result = new com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse result) {
      if (deploymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deployments_ = java.util.Collections.unmodifiableList(deployments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deployments_ = deployments_;
      } else {
        result.deployments_ = deploymentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse result) {
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
      if (other instanceof com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse) {
        return mergeFrom((com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse other) {
      if (other == com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse.getDefaultInstance()) return this;
      if (deploymentsBuilder_ == null) {
        if (!other.deployments_.isEmpty()) {
          if (deployments_.isEmpty()) {
            deployments_ = other.deployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeploymentsIsMutable();
            deployments_.addAll(other.deployments_);
          }
          onChanged();
        }
      } else {
        if (!other.deployments_.isEmpty()) {
          if (deploymentsBuilder_.isEmpty()) {
            deploymentsBuilder_.dispose();
            deploymentsBuilder_ = null;
            deployments_ = other.deployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deploymentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeploymentsFieldBuilder() : null;
          } else {
            deploymentsBuilder_.addAllMessages(other.deployments_);
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
              com.google.cloud.telcoautomation.v1.Deployment m =
                  input.readMessage(
                      com.google.cloud.telcoautomation.v1.Deployment.parser(),
                      extensionRegistry);
              if (deploymentsBuilder_ == null) {
                ensureDeploymentsIsMutable();
                deployments_.add(m);
              } else {
                deploymentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.telcoautomation.v1.Deployment> deployments_ =
      java.util.Collections.emptyList();
    private void ensureDeploymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deployments_ = new java.util.ArrayList<com.google.cloud.telcoautomation.v1.Deployment>(deployments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.telcoautomation.v1.Deployment, com.google.cloud.telcoautomation.v1.Deployment.Builder, com.google.cloud.telcoautomation.v1.DeploymentOrBuilder> deploymentsBuilder_;

    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1.Deployment> getDeploymentsList() {
      if (deploymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deployments_);
      } else {
        return deploymentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public int getDeploymentsCount() {
      if (deploymentsBuilder_ == null) {
        return deployments_.size();
      } else {
        return deploymentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Deployment getDeployments(int index) {
      if (deploymentsBuilder_ == null) {
        return deployments_.get(index);
      } else {
        return deploymentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder setDeployments(
        int index, com.google.cloud.telcoautomation.v1.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.set(index, value);
        onChanged();
      } else {
        deploymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder setDeployments(
        int index, com.google.cloud.telcoautomation.v1.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.set(index, builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(com.google.cloud.telcoautomation.v1.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.add(value);
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        int index, com.google.cloud.telcoautomation.v1.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.add(index, value);
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        com.google.cloud.telcoautomation.v1.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.add(builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        int index, com.google.cloud.telcoautomation.v1.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.add(index, builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder addAllDeployments(
        java.lang.Iterable<? extends com.google.cloud.telcoautomation.v1.Deployment> values) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deployments_);
        onChanged();
      } else {
        deploymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder clearDeployments() {
      if (deploymentsBuilder_ == null) {
        deployments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deploymentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public Builder removeDeployments(int index) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.remove(index);
        onChanged();
      } else {
        deploymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Deployment.Builder getDeploymentsBuilder(
        int index) {
      return getDeploymentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.DeploymentOrBuilder getDeploymentsOrBuilder(
        int index) {
      if (deploymentsBuilder_ == null) {
        return deployments_.get(index);  } else {
        return deploymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.telcoautomation.v1.DeploymentOrBuilder> 
         getDeploymentsOrBuilderList() {
      if (deploymentsBuilder_ != null) {
        return deploymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deployments_);
      }
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Deployment.Builder addDeploymentsBuilder() {
      return getDeploymentsFieldBuilder().addBuilder(
          com.google.cloud.telcoautomation.v1.Deployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Deployment.Builder addDeploymentsBuilder(
        int index) {
      return getDeploymentsFieldBuilder().addBuilder(
          index, com.google.cloud.telcoautomation.v1.Deployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The revisions of the deployment.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1.Deployment.Builder> 
         getDeploymentsBuilderList() {
      return getDeploymentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.telcoautomation.v1.Deployment, com.google.cloud.telcoautomation.v1.Deployment.Builder, com.google.cloud.telcoautomation.v1.DeploymentOrBuilder> 
        getDeploymentsFieldBuilder() {
      if (deploymentsBuilder_ == null) {
        deploymentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.telcoautomation.v1.Deployment, com.google.cloud.telcoautomation.v1.Deployment.Builder, com.google.cloud.telcoautomation.v1.DeploymentOrBuilder>(
                deployments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deployments_ = null;
      }
      return deploymentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)
  private static final com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse();
  }

  public static com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeploymentRevisionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDeploymentRevisionsResponse>() {
    @java.lang.Override
    public ListDeploymentRevisionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDeploymentRevisionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeploymentRevisionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

