// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

/**
 * <pre>
 * Request message for creating a finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.CreateFindingRequest}
 */
public final class CreateFindingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)
    CreateFindingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFindingRequest.newBuilder() to construct.
  private CreateFindingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFindingRequest() {
    parent_ = "";
    findingId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFindingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_CreateFindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_CreateFindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.class, com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
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
   * Required. Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
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

  public static final int FINDING_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object findingId_ = "";
  /**
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * </pre>
   *
   * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The findingId.
   */
  @java.lang.Override
  public java.lang.String getFindingId() {
    java.lang.Object ref = findingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      findingId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * </pre>
   *
   * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for findingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFindingIdBytes() {
    java.lang.Object ref = findingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      findingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINDING_FIELD_NUMBER = 3;
  private com.google.cloud.securitycenter.v1p1beta1.Finding finding_;
  /**
   * <pre>
   * Required. The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the finding field is set.
   */
  @java.lang.Override
  public boolean hasFinding() {
    return finding_ != null;
  }
  /**
   * <pre>
   * Required. The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The finding.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.Finding getFinding() {
    return finding_ == null ? com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance() : finding_;
  }
  /**
   * <pre>
   * Required. The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder getFindingOrBuilder() {
    return finding_ == null ? com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance() : finding_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(findingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, findingId_);
    }
    if (finding_ != null) {
      output.writeMessage(3, getFinding());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(findingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, findingId_);
    }
    if (finding_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFinding());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest other = (com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getFindingId()
        .equals(other.getFindingId())) return false;
    if (hasFinding() != other.hasFinding()) return false;
    if (hasFinding()) {
      if (!getFinding()
          .equals(other.getFinding())) return false;
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
    hash = (37 * hash) + FINDING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFindingId().hashCode();
    if (hasFinding()) {
      hash = (37 * hash) + FINDING_FIELD_NUMBER;
      hash = (53 * hash) + getFinding().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest prototype) {
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
   * Request message for creating a finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.CreateFindingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)
      com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_CreateFindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_CreateFindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.class, com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.newBuilder()
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
      findingId_ = "";
      finding_ = null;
      if (findingBuilder_ != null) {
        findingBuilder_.dispose();
        findingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_CreateFindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest build() {
      com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest buildPartial() {
      com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest result = new com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.findingId_ = findingId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.finding_ = findingBuilder_ == null
            ? finding_
            : findingBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest other) {
      if (other == com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFindingId().isEmpty()) {
        findingId_ = other.findingId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFinding()) {
        mergeFinding(other.getFinding());
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
              findingId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFindingFieldBuilder().getBuilder(),
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
     * Required. Resource name of the new finding's parent. Its format should be
     * "organizations/[organization_id]/sources/[source_id]".
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
     * Required. Resource name of the new finding's parent. Its format should be
     * "organizations/[organization_id]/sources/[source_id]".
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
     * Required. Resource name of the new finding's parent. Its format should be
     * "organizations/[organization_id]/sources/[source_id]".
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
     * Required. Resource name of the new finding's parent. Its format should be
     * "organizations/[organization_id]/sources/[source_id]".
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
     * Required. Resource name of the new finding's parent. Its format should be
     * "organizations/[organization_id]/sources/[source_id]".
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

    private java.lang.Object findingId_ = "";
    /**
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * </pre>
     *
     * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The findingId.
     */
    public java.lang.String getFindingId() {
      java.lang.Object ref = findingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        findingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * </pre>
     *
     * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for findingId.
     */
    public com.google.protobuf.ByteString
        getFindingIdBytes() {
      java.lang.Object ref = findingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        findingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * </pre>
     *
     * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The findingId to set.
     * @return This builder for chaining.
     */
    public Builder setFindingId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      findingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * </pre>
     *
     * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFindingId() {
      findingId_ = getDefaultInstance().getFindingId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * </pre>
     *
     * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for findingId to set.
     * @return This builder for chaining.
     */
    public Builder setFindingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      findingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.securitycenter.v1p1beta1.Finding finding_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder> findingBuilder_;
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the finding field is set.
     */
    public boolean hasFinding() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The finding.
     */
    public com.google.cloud.securitycenter.v1p1beta1.Finding getFinding() {
      if (findingBuilder_ == null) {
        return finding_ == null ? com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance() : finding_;
      } else {
        return findingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFinding(com.google.cloud.securitycenter.v1p1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finding_ = value;
      } else {
        findingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFinding(
        com.google.cloud.securitycenter.v1p1beta1.Finding.Builder builderForValue) {
      if (findingBuilder_ == null) {
        finding_ = builderForValue.build();
      } else {
        findingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFinding(com.google.cloud.securitycenter.v1p1beta1.Finding value) {
      if (findingBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          finding_ != null &&
          finding_ != com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance()) {
          getFindingBuilder().mergeFrom(value);
        } else {
          finding_ = value;
        }
      } else {
        findingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFinding() {
      bitField0_ = (bitField0_ & ~0x00000004);
      finding_ = null;
      if (findingBuilder_ != null) {
        findingBuilder_.dispose();
        findingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.Finding.Builder getFindingBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFindingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder getFindingOrBuilder() {
      if (findingBuilder_ != null) {
        return findingBuilder_.getMessageOrBuilder();
      } else {
        return finding_ == null ?
            com.google.cloud.securitycenter.v1p1beta1.Finding.getDefaultInstance() : finding_;
      }
    }
    /**
     * <pre>
     * Required. The Finding being created. The name and security_marks will be ignored as
     * they are both output only fields on this resource.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder> 
        getFindingFieldBuilder() {
      if (findingBuilder_ == null) {
        findingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1p1beta1.Finding, com.google.cloud.securitycenter.v1p1beta1.Finding.Builder, com.google.cloud.securitycenter.v1p1beta1.FindingOrBuilder>(
                getFinding(),
                getParentForChildren(),
                isClean());
        finding_ = null;
      }
      return findingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1p1beta1.CreateFindingRequest)
  private static final com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest();
  }

  public static com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFindingRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFindingRequest>() {
    @java.lang.Override
    public CreateFindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.CreateFindingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

