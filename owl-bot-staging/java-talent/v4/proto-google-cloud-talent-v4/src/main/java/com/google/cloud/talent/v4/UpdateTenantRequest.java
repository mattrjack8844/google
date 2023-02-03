// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/tenant_service.proto

package com.google.cloud.talent.v4;

/**
 * <pre>
 * Request for updating a specified tenant.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.UpdateTenantRequest}
 */
public final class UpdateTenantRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.UpdateTenantRequest)
    UpdateTenantRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTenantRequest.newBuilder() to construct.
  private UpdateTenantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTenantRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTenantRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4.TenantServiceProto.internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.TenantServiceProto.internal_static_google_cloud_talent_v4_UpdateTenantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.UpdateTenantRequest.class, com.google.cloud.talent.v4.UpdateTenantRequest.Builder.class);
  }

  public static final int TENANT_FIELD_NUMBER = 1;
  private com.google.cloud.talent.v4.Tenant tenant_;
  /**
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tenant field is set.
   */
  @java.lang.Override
  public boolean hasTenant() {
    return tenant_ != null;
  }
  /**
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tenant.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.Tenant getTenant() {
    return tenant_ == null ? com.google.cloud.talent.v4.Tenant.getDefaultInstance() : tenant_;
  }
  /**
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.TenantOrBuilder getTenantOrBuilder() {
    return tenant_ == null ? com.google.cloud.talent.v4.Tenant.getDefaultInstance() : tenant_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
   * provided, only the specified fields in
   * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
   * Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
   * provided, only the specified fields in
   * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
   * Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
   * provided, only the specified fields in
   * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
   * Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (tenant_ != null) {
      output.writeMessage(1, getTenant());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tenant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTenant());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.talent.v4.UpdateTenantRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.UpdateTenantRequest other = (com.google.cloud.talent.v4.UpdateTenantRequest) obj;

    if (hasTenant() != other.hasTenant()) return false;
    if (hasTenant()) {
      if (!getTenant()
          .equals(other.getTenant())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasTenant()) {
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.UpdateTenantRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4.UpdateTenantRequest prototype) {
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
   * Request for updating a specified tenant.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.UpdateTenantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.UpdateTenantRequest)
      com.google.cloud.talent.v4.UpdateTenantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4.TenantServiceProto.internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.TenantServiceProto.internal_static_google_cloud_talent_v4_UpdateTenantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.UpdateTenantRequest.class, com.google.cloud.talent.v4.UpdateTenantRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.UpdateTenantRequest.newBuilder()
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
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4.TenantServiceProto.internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.UpdateTenantRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.UpdateTenantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.UpdateTenantRequest build() {
      com.google.cloud.talent.v4.UpdateTenantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.UpdateTenantRequest buildPartial() {
      com.google.cloud.talent.v4.UpdateTenantRequest result = new com.google.cloud.talent.v4.UpdateTenantRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.talent.v4.UpdateTenantRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tenant_ = tenantBuilder_ == null
            ? tenant_
            : tenantBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4.UpdateTenantRequest) {
        return mergeFrom((com.google.cloud.talent.v4.UpdateTenantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.UpdateTenantRequest other) {
      if (other == com.google.cloud.talent.v4.UpdateTenantRequest.getDefaultInstance()) return this;
      if (other.hasTenant()) {
        mergeTenant(other.getTenant());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getTenantFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.cloud.talent.v4.Tenant tenant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Tenant, com.google.cloud.talent.v4.Tenant.Builder, com.google.cloud.talent.v4.TenantOrBuilder> tenantBuilder_;
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tenant field is set.
     */
    public boolean hasTenant() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tenant.
     */
    public com.google.cloud.talent.v4.Tenant getTenant() {
      if (tenantBuilder_ == null) {
        return tenant_ == null ? com.google.cloud.talent.v4.Tenant.getDefaultInstance() : tenant_;
      } else {
        return tenantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTenant(com.google.cloud.talent.v4.Tenant value) {
      if (tenantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tenant_ = value;
      } else {
        tenantBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTenant(
        com.google.cloud.talent.v4.Tenant.Builder builderForValue) {
      if (tenantBuilder_ == null) {
        tenant_ = builderForValue.build();
      } else {
        tenantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTenant(com.google.cloud.talent.v4.Tenant value) {
      if (tenantBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tenant_ != null &&
          tenant_ != com.google.cloud.talent.v4.Tenant.getDefaultInstance()) {
          getTenantBuilder().mergeFrom(value);
        } else {
          tenant_ = value;
        }
      } else {
        tenantBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTenant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4.Tenant.Builder getTenantBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTenantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4.TenantOrBuilder getTenantOrBuilder() {
      if (tenantBuilder_ != null) {
        return tenantBuilder_.getMessageOrBuilder();
      } else {
        return tenant_ == null ?
            com.google.cloud.talent.v4.Tenant.getDefaultInstance() : tenant_;
      }
    }
    /**
     * <pre>
     * Required. The tenant resource to replace the current resource in the
     * system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Tenant, com.google.cloud.talent.v4.Tenant.Builder, com.google.cloud.talent.v4.TenantOrBuilder> 
        getTenantFieldBuilder() {
      if (tenantBuilder_ == null) {
        tenantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4.Tenant, com.google.cloud.talent.v4.Tenant.Builder, com.google.cloud.talent.v4.TenantOrBuilder>(
                getTenant(),
                getParentForChildren(),
                isClean());
        tenant_ = null;
      }
      return tenantBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4.UpdateTenantRequest.update_mask] is
     * provided, only the specified fields in
     * [tenant][google.cloud.talent.v4.UpdateTenantRequest.tenant] are updated.
     * Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.UpdateTenantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.UpdateTenantRequest)
  private static final com.google.cloud.talent.v4.UpdateTenantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.UpdateTenantRequest();
  }

  public static com.google.cloud.talent.v4.UpdateTenantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTenantRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTenantRequest>() {
    @java.lang.Override
    public UpdateTenantRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTenantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTenantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.UpdateTenantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

