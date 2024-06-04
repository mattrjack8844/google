/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iap.v1;

/**
 *
 *
 * <pre>
 * The request sent to UpdateIapSettings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.UpdateIapSettingsRequest}
 */
public final class UpdateIapSettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.UpdateIapSettingsRequest)
    UpdateIapSettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIapSettingsRequest.newBuilder() to construct.
  private UpdateIapSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIapSettingsRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIapSettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_UpdateIapSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_UpdateIapSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.UpdateIapSettingsRequest.class,
            com.google.cloud.iap.v1.UpdateIapSettingsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int IAP_SETTINGS_FIELD_NUMBER = 1;
  private com.google.cloud.iap.v1.IapSettings iapSettings_;
  /**
   *
   *
   * <pre>
   * Required. The new values for the IAP settings to be updated.
   * Authorization: Requires the `updateSettings` permission for the associated
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the iapSettings field is set.
   */
  @java.lang.Override
  public boolean hasIapSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the IAP settings to be updated.
   * Authorization: Requires the `updateSettings` permission for the associated
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The iapSettings.
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.IapSettings getIapSettings() {
    return iapSettings_ == null
        ? com.google.cloud.iap.v1.IapSettings.getDefaultInstance()
        : iapSettings_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the IAP settings to be updated.
   * Authorization: Requires the `updateSettings` permission for the associated
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.IapSettingsOrBuilder getIapSettingsOrBuilder() {
    return iapSettings_ == null
        ? com.google.cloud.iap.v1.IapSettings.getDefaultInstance()
        : iapSettings_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The field mask specifying which IAP settings should be updated.
   * If omitted, then all of the settings are updated. See
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   *
   * Note: All IAP reauth settings must always be set together, using the
   * field mask: `iapSettings.accessSettings.reauthSettings`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The field mask specifying which IAP settings should be updated.
   * If omitted, then all of the settings are updated. See
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   *
   * Note: All IAP reauth settings must always be set together, using the
   * field mask: `iapSettings.accessSettings.reauthSettings`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The field mask specifying which IAP settings should be updated.
   * If omitted, then all of the settings are updated. See
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   *
   * Note: All IAP reauth settings must always be set together, using the
   * field mask: `iapSettings.accessSettings.reauthSettings`.
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getIapSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIapSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.iap.v1.UpdateIapSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.UpdateIapSettingsRequest other =
        (com.google.cloud.iap.v1.UpdateIapSettingsRequest) obj;

    if (hasIapSettings() != other.hasIapSettings()) return false;
    if (hasIapSettings()) {
      if (!getIapSettings().equals(other.getIapSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasIapSettings()) {
      hash = (37 * hash) + IAP_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getIapSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.iap.v1.UpdateIapSettingsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request sent to UpdateIapSettings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.UpdateIapSettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.UpdateIapSettingsRequest)
      com.google.cloud.iap.v1.UpdateIapSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_UpdateIapSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_UpdateIapSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.UpdateIapSettingsRequest.class,
              com.google.cloud.iap.v1.UpdateIapSettingsRequest.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.UpdateIapSettingsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIapSettingsFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      iapSettings_ = null;
      if (iapSettingsBuilder_ != null) {
        iapSettingsBuilder_.dispose();
        iapSettingsBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_UpdateIapSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.UpdateIapSettingsRequest getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.UpdateIapSettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.UpdateIapSettingsRequest build() {
      com.google.cloud.iap.v1.UpdateIapSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.UpdateIapSettingsRequest buildPartial() {
      com.google.cloud.iap.v1.UpdateIapSettingsRequest result =
          new com.google.cloud.iap.v1.UpdateIapSettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.UpdateIapSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iapSettings_ =
            iapSettingsBuilder_ == null ? iapSettings_ : iapSettingsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iap.v1.UpdateIapSettingsRequest) {
        return mergeFrom((com.google.cloud.iap.v1.UpdateIapSettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.UpdateIapSettingsRequest other) {
      if (other == com.google.cloud.iap.v1.UpdateIapSettingsRequest.getDefaultInstance())
        return this;
      if (other.hasIapSettings()) {
        mergeIapSettings(other.getIapSettings());
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
            case 10:
              {
                input.readMessage(getIapSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private com.google.cloud.iap.v1.IapSettings iapSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.IapSettings,
            com.google.cloud.iap.v1.IapSettings.Builder,
            com.google.cloud.iap.v1.IapSettingsOrBuilder>
        iapSettingsBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the iapSettings field is set.
     */
    public boolean hasIapSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The iapSettings.
     */
    public com.google.cloud.iap.v1.IapSettings getIapSettings() {
      if (iapSettingsBuilder_ == null) {
        return iapSettings_ == null
            ? com.google.cloud.iap.v1.IapSettings.getDefaultInstance()
            : iapSettings_;
      } else {
        return iapSettingsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIapSettings(com.google.cloud.iap.v1.IapSettings value) {
      if (iapSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iapSettings_ = value;
      } else {
        iapSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIapSettings(com.google.cloud.iap.v1.IapSettings.Builder builderForValue) {
      if (iapSettingsBuilder_ == null) {
        iapSettings_ = builderForValue.build();
      } else {
        iapSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIapSettings(com.google.cloud.iap.v1.IapSettings value) {
      if (iapSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && iapSettings_ != null
            && iapSettings_ != com.google.cloud.iap.v1.IapSettings.getDefaultInstance()) {
          getIapSettingsBuilder().mergeFrom(value);
        } else {
          iapSettings_ = value;
        }
      } else {
        iapSettingsBuilder_.mergeFrom(value);
      }
      if (iapSettings_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIapSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      iapSettings_ = null;
      if (iapSettingsBuilder_ != null) {
        iapSettingsBuilder_.dispose();
        iapSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.iap.v1.IapSettings.Builder getIapSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIapSettingsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.iap.v1.IapSettingsOrBuilder getIapSettingsOrBuilder() {
      if (iapSettingsBuilder_ != null) {
        return iapSettingsBuilder_.getMessageOrBuilder();
      } else {
        return iapSettings_ == null
            ? com.google.cloud.iap.v1.IapSettings.getDefaultInstance()
            : iapSettings_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the IAP settings to be updated.
     * Authorization: Requires the `updateSettings` permission for the associated
     * resource.
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.IapSettings iap_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.IapSettings,
            com.google.cloud.iap.v1.IapSettings.Builder,
            com.google.cloud.iap.v1.IapSettingsOrBuilder>
        getIapSettingsFieldBuilder() {
      if (iapSettingsBuilder_ == null) {
        iapSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.iap.v1.IapSettings,
                com.google.cloud.iap.v1.IapSettings.Builder,
                com.google.cloud.iap.v1.IapSettingsOrBuilder>(
                getIapSettings(), getParentForChildren(), isClean());
        iapSettings_ = null;
      }
      return iapSettingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
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
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
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
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
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
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
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
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The field mask specifying which IAP settings should be updated.
     * If omitted, then all of the settings are updated. See
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     *
     * Note: All IAP reauth settings must always be set together, using the
     * field mask: `iapSettings.accessSettings.reauthSettings`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.UpdateIapSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.UpdateIapSettingsRequest)
  private static final com.google.cloud.iap.v1.UpdateIapSettingsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.UpdateIapSettingsRequest();
  }

  public static com.google.cloud.iap.v1.UpdateIapSettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIapSettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIapSettingsRequest>() {
        @java.lang.Override
        public UpdateIapSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIapSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIapSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.UpdateIapSettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
