// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1/registration_service.proto

package com.google.cloud.servicedirectory.v1;

/**
 * <pre>
 * The request message for
 * [RegistrationService.CreateEndpoint][google.cloud.servicedirectory.v1.RegistrationService.CreateEndpoint].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1.CreateEndpointRequest}
 */
public final class CreateEndpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1.CreateEndpointRequest)
    CreateEndpointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEndpointRequest.newBuilder() to construct.
  private CreateEndpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEndpointRequest() {
    parent_ = "";
    endpointId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEndpointRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateEndpointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateEndpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1.CreateEndpointRequest.class, com.google.cloud.servicedirectory.v1.CreateEndpointRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the service that this endpoint provides.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the service that this endpoint provides.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object endpointId_ = "";
  /**
   * <pre>
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endpointId.
   */
  @java.lang.Override
  public java.lang.String getEndpointId() {
    java.lang.Object ref = endpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpointId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for endpointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointIdBytes() {
    java.lang.Object ref = endpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINT_FIELD_NUMBER = 3;
  private com.google.cloud.servicedirectory.v1.Endpoint endpoint_;
  /**
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the endpoint field is set.
   */
  @java.lang.Override
  public boolean hasEndpoint() {
    return endpoint_ != null;
  }
  /**
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.Endpoint getEndpoint() {
    return endpoint_ == null ? com.google.cloud.servicedirectory.v1.Endpoint.getDefaultInstance() : endpoint_;
  }
  /**
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.EndpointOrBuilder getEndpointOrBuilder() {
    return endpoint_ == null ? com.google.cloud.servicedirectory.v1.Endpoint.getDefaultInstance() : endpoint_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endpointId_);
    }
    if (endpoint_ != null) {
      output.writeMessage(3, getEndpoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endpointId_);
    }
    if (endpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEndpoint());
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
    if (!(obj instanceof com.google.cloud.servicedirectory.v1.CreateEndpointRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1.CreateEndpointRequest other = (com.google.cloud.servicedirectory.v1.CreateEndpointRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getEndpointId()
        .equals(other.getEndpointId())) return false;
    if (hasEndpoint() != other.hasEndpoint()) return false;
    if (hasEndpoint()) {
      if (!getEndpoint()
          .equals(other.getEndpoint())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + ENDPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEndpointId().hashCode();
    if (hasEndpoint()) {
      hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.servicedirectory.v1.CreateEndpointRequest prototype) {
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
   * The request message for
   * [RegistrationService.CreateEndpoint][google.cloud.servicedirectory.v1.RegistrationService.CreateEndpoint].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1.CreateEndpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1.CreateEndpointRequest)
      com.google.cloud.servicedirectory.v1.CreateEndpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateEndpointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateEndpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1.CreateEndpointRequest.class, com.google.cloud.servicedirectory.v1.CreateEndpointRequest.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1.CreateEndpointRequest.newBuilder()
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
      parent_ = "";
      endpointId_ = "";
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateEndpointRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateEndpointRequest getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1.CreateEndpointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateEndpointRequest build() {
      com.google.cloud.servicedirectory.v1.CreateEndpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateEndpointRequest buildPartial() {
      com.google.cloud.servicedirectory.v1.CreateEndpointRequest result = new com.google.cloud.servicedirectory.v1.CreateEndpointRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.servicedirectory.v1.CreateEndpointRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endpointId_ = endpointId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endpoint_ = endpointBuilder_ == null
            ? endpoint_
            : endpointBuilder_.build();
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
      if (other instanceof com.google.cloud.servicedirectory.v1.CreateEndpointRequest) {
        return mergeFrom((com.google.cloud.servicedirectory.v1.CreateEndpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1.CreateEndpointRequest other) {
      if (other == com.google.cloud.servicedirectory.v1.CreateEndpointRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEndpointId().isEmpty()) {
        endpointId_ = other.endpointId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEndpoint()) {
        mergeEndpoint(other.getEndpoint());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              endpointId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEndpointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the service that this endpoint provides.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the service that this endpoint provides.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the service that this endpoint provides.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the service that this endpoint provides.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the service that this endpoint provides.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object endpointId_ = "";
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The endpointId.
     */
    public java.lang.String getEndpointId() {
      java.lang.Object ref = endpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for endpointId.
     */
    public com.google.protobuf.ByteString
        getEndpointIdBytes() {
      java.lang.Object ref = endpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The endpointId to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      endpointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpointId() {
      endpointId_ = getDefaultInstance().getEndpointId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for endpointId to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      endpointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.servicedirectory.v1.Endpoint endpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1.Endpoint, com.google.cloud.servicedirectory.v1.Endpoint.Builder, com.google.cloud.servicedirectory.v1.EndpointOrBuilder> endpointBuilder_;
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the endpoint field is set.
     */
    public boolean hasEndpoint() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The endpoint.
     */
    public com.google.cloud.servicedirectory.v1.Endpoint getEndpoint() {
      if (endpointBuilder_ == null) {
        return endpoint_ == null ? com.google.cloud.servicedirectory.v1.Endpoint.getDefaultInstance() : endpoint_;
      } else {
        return endpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEndpoint(com.google.cloud.servicedirectory.v1.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoint_ = value;
      } else {
        endpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEndpoint(
        com.google.cloud.servicedirectory.v1.Endpoint.Builder builderForValue) {
      if (endpointBuilder_ == null) {
        endpoint_ = builderForValue.build();
      } else {
        endpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEndpoint(com.google.cloud.servicedirectory.v1.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          endpoint_ != null &&
          endpoint_ != com.google.cloud.servicedirectory.v1.Endpoint.getDefaultInstance()) {
          getEndpointBuilder().mergeFrom(value);
        } else {
          endpoint_ = value;
        }
      } else {
        endpointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEndpoint() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1.Endpoint.Builder getEndpointBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEndpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1.EndpointOrBuilder getEndpointOrBuilder() {
      if (endpointBuilder_ != null) {
        return endpointBuilder_.getMessageOrBuilder();
      } else {
        return endpoint_ == null ?
            com.google.cloud.servicedirectory.v1.Endpoint.getDefaultInstance() : endpoint_;
      }
    }
    /**
     * <pre>
     * Required. A endpoint with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1.Endpoint, com.google.cloud.servicedirectory.v1.Endpoint.Builder, com.google.cloud.servicedirectory.v1.EndpointOrBuilder> 
        getEndpointFieldBuilder() {
      if (endpointBuilder_ == null) {
        endpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Endpoint, com.google.cloud.servicedirectory.v1.Endpoint.Builder, com.google.cloud.servicedirectory.v1.EndpointOrBuilder>(
                getEndpoint(),
                getParentForChildren(),
                isClean());
        endpoint_ = null;
      }
      return endpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1.CreateEndpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.CreateEndpointRequest)
  private static final com.google.cloud.servicedirectory.v1.CreateEndpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1.CreateEndpointRequest();
  }

  public static com.google.cloud.servicedirectory.v1.CreateEndpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEndpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEndpointRequest>() {
    @java.lang.Override
    public CreateEndpointRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEndpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEndpointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.CreateEndpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

