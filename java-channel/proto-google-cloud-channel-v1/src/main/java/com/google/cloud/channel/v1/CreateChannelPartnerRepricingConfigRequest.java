/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CloudChannelService.CreateChannelPartnerRepricingConfig][google.cloud.channel.v1.CloudChannelService.CreateChannelPartnerRepricingConfig].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest}
 */
public final class CreateChannelPartnerRepricingConfigRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)
    CreateChannelPartnerRepricingConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateChannelPartnerRepricingConfigRequest.newBuilder() to construct.
  private CreateChannelPartnerRepricingConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateChannelPartnerRepricingConfigRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateChannelPartnerRepricingConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateChannelPartnerRepricingConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder subBuilder = null;
              if (channelPartnerRepricingConfig_ != null) {
                subBuilder = channelPartnerRepricingConfig_.toBuilder();
              }
              channelPartnerRepricingConfig_ =
                  input.readMessage(
                      com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(channelPartnerRepricingConfig_);
                channelPartnerRepricingConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateChannelPartnerRepricingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateChannelPartnerRepricingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest.class,
            com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the ChannelPartner that will receive the repricing
   * config. Parent uses the format:
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the ChannelPartner that will receive the repricing
   * config. Parent uses the format:
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_PARTNER_REPRICING_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.ChannelPartnerRepricingConfig channelPartnerRepricingConfig_;
  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelPartnerRepricingConfig field is set.
   */
  @java.lang.Override
  public boolean hasChannelPartnerRepricingConfig() {
    return channelPartnerRepricingConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelPartnerRepricingConfig.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
      getChannelPartnerRepricingConfig() {
    return channelPartnerRepricingConfig_ == null
        ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
        : channelPartnerRepricingConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder
      getChannelPartnerRepricingConfigOrBuilder() {
    return getChannelPartnerRepricingConfig();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (channelPartnerRepricingConfig_ != null) {
      output.writeMessage(2, getChannelPartnerRepricingConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (channelPartnerRepricingConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getChannelPartnerRepricingConfig());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest other =
        (com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasChannelPartnerRepricingConfig() != other.hasChannelPartnerRepricingConfig())
      return false;
    if (hasChannelPartnerRepricingConfig()) {
      if (!getChannelPartnerRepricingConfig().equals(other.getChannelPartnerRepricingConfig()))
        return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasChannelPartnerRepricingConfig()) {
      hash = (37 * hash) + CHANNEL_PARTNER_REPRICING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getChannelPartnerRepricingConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest prototype) {
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
   * Request message for
   * [CloudChannelService.CreateChannelPartnerRepricingConfig][google.cloud.channel.v1.CloudChannelService.CreateChannelPartnerRepricingConfig].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)
      com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerRepricingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest.class,
              com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfig_ = null;
      } else {
        channelPartnerRepricingConfig_ = null;
        channelPartnerRepricingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest build() {
      com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest buildPartial() {
      com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest result =
          new com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest(this);
      result.parent_ = parent_;
      if (channelPartnerRepricingConfigBuilder_ == null) {
        result.channelPartnerRepricingConfig_ = channelPartnerRepricingConfig_;
      } else {
        result.channelPartnerRepricingConfig_ = channelPartnerRepricingConfigBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest) {
        return mergeFrom(
            (com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest other) {
      if (other
          == com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasChannelPartnerRepricingConfig()) {
        mergeChannelPartnerRepricingConfig(other.getChannelPartnerRepricingConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the ChannelPartner that will receive the repricing
     * config. Parent uses the format:
     * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the ChannelPartner that will receive the repricing
     * config. Parent uses the format:
     * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the ChannelPartner that will receive the repricing
     * config. Parent uses the format:
     * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the ChannelPartner that will receive the repricing
     * config. Parent uses the format:
     * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the ChannelPartner that will receive the repricing
     * config. Parent uses the format:
     * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
        channelPartnerRepricingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>
        channelPartnerRepricingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the channelPartnerRepricingConfig field is set.
     */
    public boolean hasChannelPartnerRepricingConfig() {
      return channelPartnerRepricingConfigBuilder_ != null
          || channelPartnerRepricingConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The channelPartnerRepricingConfig.
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
        getChannelPartnerRepricingConfig() {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        return channelPartnerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
            : channelPartnerRepricingConfig_;
      } else {
        return channelPartnerRepricingConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig value) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channelPartnerRepricingConfig_ = value;
        onChanged();
      } else {
        channelPartnerRepricingConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder builderForValue) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfig_ = builderForValue.build();
        onChanged();
      } else {
        channelPartnerRepricingConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig value) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        if (channelPartnerRepricingConfig_ != null) {
          channelPartnerRepricingConfig_ =
              com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.newBuilder(
                      channelPartnerRepricingConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          channelPartnerRepricingConfig_ = value;
        }
        onChanged();
      } else {
        channelPartnerRepricingConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearChannelPartnerRepricingConfig() {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfig_ = null;
        onChanged();
      } else {
        channelPartnerRepricingConfig_ = null;
        channelPartnerRepricingConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder
        getChannelPartnerRepricingConfigBuilder() {

      onChanged();
      return getChannelPartnerRepricingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder
        getChannelPartnerRepricingConfigOrBuilder() {
      if (channelPartnerRepricingConfigBuilder_ != null) {
        return channelPartnerRepricingConfigBuilder_.getMessageOrBuilder();
      } else {
        return channelPartnerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
            : channelPartnerRepricingConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>
        getChannelPartnerRepricingConfigFieldBuilder() {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>(
                getChannelPartnerRepricingConfig(), getParentForChildren(), isClean());
        channelPartnerRepricingConfig_ = null;
      }
      return channelPartnerRepricingConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest)
  private static final com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest();
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateChannelPartnerRepricingConfigRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<CreateChannelPartnerRepricingConfigRequest>() {
            @java.lang.Override
            public CreateChannelPartnerRepricingConfigRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new CreateChannelPartnerRepricingConfigRequest(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<CreateChannelPartnerRepricingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateChannelPartnerRepricingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
