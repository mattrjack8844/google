// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

package com.google.cloud.vmwareengine.v1;

/**
 * <pre>
 * Request message for
 * [VmwareEngine.UpdateSubnet][google.cloud.vmwareengine.v1.VmwareEngine.UpdateSubnet]
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.UpdateSubnetRequest}
 */
public final class UpdateSubnetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.UpdateSubnetRequest)
    UpdateSubnetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSubnetRequest.newBuilder() to construct.
  private UpdateSubnetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSubnetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSubnetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_UpdateSubnetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_UpdateSubnetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.class, com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `Subnet` resource by the update.
   * The fields specified in the `update_mask` are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `Subnet` resource by the update.
   * The fields specified in the `update_mask` are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `Subnet` resource by the update.
   * The fields specified in the `update_mask` are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int SUBNET_FIELD_NUMBER = 2;
  private com.google.cloud.vmwareengine.v1.Subnet subnet_;
  /**
   * <pre>
   * Required. Subnet description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the subnet field is set.
   */
  @java.lang.Override
  public boolean hasSubnet() {
    return subnet_ != null;
  }
  /**
   * <pre>
   * Required. Subnet description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnet.
   */
  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.Subnet getSubnet() {
    return subnet_ == null ? com.google.cloud.vmwareengine.v1.Subnet.getDefaultInstance() : subnet_;
  }
  /**
   * <pre>
   * Required. Subnet description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.SubnetOrBuilder getSubnetOrBuilder() {
    return subnet_ == null ? com.google.cloud.vmwareengine.v1.Subnet.getDefaultInstance() : subnet_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (subnet_ != null) {
      output.writeMessage(2, getSubnet());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (subnet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubnet());
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.UpdateSubnetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.UpdateSubnetRequest other = (com.google.cloud.vmwareengine.v1.UpdateSubnetRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasSubnet() != other.hasSubnet()) return false;
    if (hasSubnet()) {
      if (!getSubnet()
          .equals(other.getSubnet())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasSubnet()) {
      hash = (37 * hash) + SUBNET_FIELD_NUMBER;
      hash = (53 * hash) + getSubnet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.UpdateSubnetRequest prototype) {
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
   * Request message for
   * [VmwareEngine.UpdateSubnet][google.cloud.vmwareengine.v1.VmwareEngine.UpdateSubnet]
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.UpdateSubnetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.UpdateSubnetRequest)
      com.google.cloud.vmwareengine.v1.UpdateSubnetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_UpdateSubnetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_UpdateSubnetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.class, com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.newBuilder()
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
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      subnet_ = null;
      if (subnetBuilder_ != null) {
        subnetBuilder_.dispose();
        subnetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineProto.internal_static_google_cloud_vmwareengine_v1_UpdateSubnetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.UpdateSubnetRequest getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.UpdateSubnetRequest build() {
      com.google.cloud.vmwareengine.v1.UpdateSubnetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.UpdateSubnetRequest buildPartial() {
      com.google.cloud.vmwareengine.v1.UpdateSubnetRequest result = new com.google.cloud.vmwareengine.v1.UpdateSubnetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.UpdateSubnetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subnet_ = subnetBuilder_ == null
            ? subnet_
            : subnetBuilder_.build();
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
      if (other instanceof com.google.cloud.vmwareengine.v1.UpdateSubnetRequest) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.UpdateSubnetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.UpdateSubnetRequest other) {
      if (other == com.google.cloud.vmwareengine.v1.UpdateSubnetRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasSubnet()) {
        mergeSubnet(other.getSubnet());
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
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSubnetFieldBuilder().getBuilder(),
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * `Subnet` resource by the update.
     * The fields specified in the `update_mask` are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.vmwareengine.v1.Subnet subnet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmwareengine.v1.Subnet, com.google.cloud.vmwareengine.v1.Subnet.Builder, com.google.cloud.vmwareengine.v1.SubnetOrBuilder> subnetBuilder_;
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the subnet field is set.
     */
    public boolean hasSubnet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subnet.
     */
    public com.google.cloud.vmwareengine.v1.Subnet getSubnet() {
      if (subnetBuilder_ == null) {
        return subnet_ == null ? com.google.cloud.vmwareengine.v1.Subnet.getDefaultInstance() : subnet_;
      } else {
        return subnetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubnet(com.google.cloud.vmwareengine.v1.Subnet value) {
      if (subnetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subnet_ = value;
      } else {
        subnetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubnet(
        com.google.cloud.vmwareengine.v1.Subnet.Builder builderForValue) {
      if (subnetBuilder_ == null) {
        subnet_ = builderForValue.build();
      } else {
        subnetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSubnet(com.google.cloud.vmwareengine.v1.Subnet value) {
      if (subnetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          subnet_ != null &&
          subnet_ != com.google.cloud.vmwareengine.v1.Subnet.getDefaultInstance()) {
          getSubnetBuilder().mergeFrom(value);
        } else {
          subnet_ = value;
        }
      } else {
        subnetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSubnet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subnet_ = null;
      if (subnetBuilder_ != null) {
        subnetBuilder_.dispose();
        subnetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.vmwareengine.v1.Subnet.Builder getSubnetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSubnetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.vmwareengine.v1.SubnetOrBuilder getSubnetOrBuilder() {
      if (subnetBuilder_ != null) {
        return subnetBuilder_.getMessageOrBuilder();
      } else {
        return subnet_ == null ?
            com.google.cloud.vmwareengine.v1.Subnet.getDefaultInstance() : subnet_;
      }
    }
    /**
     * <pre>
     * Required. Subnet description.
     * </pre>
     *
     * <code>.google.cloud.vmwareengine.v1.Subnet subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmwareengine.v1.Subnet, com.google.cloud.vmwareengine.v1.Subnet.Builder, com.google.cloud.vmwareengine.v1.SubnetOrBuilder> 
        getSubnetFieldBuilder() {
      if (subnetBuilder_ == null) {
        subnetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmwareengine.v1.Subnet, com.google.cloud.vmwareengine.v1.Subnet.Builder, com.google.cloud.vmwareengine.v1.SubnetOrBuilder>(
                getSubnet(),
                getParentForChildren(),
                isClean());
        subnet_ = null;
      }
      return subnetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.UpdateSubnetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.UpdateSubnetRequest)
  private static final com.google.cloud.vmwareengine.v1.UpdateSubnetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.UpdateSubnetRequest();
  }

  public static com.google.cloud.vmwareengine.v1.UpdateSubnetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSubnetRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSubnetRequest>() {
    @java.lang.Override
    public UpdateSubnetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSubnetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSubnetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.UpdateSubnetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

