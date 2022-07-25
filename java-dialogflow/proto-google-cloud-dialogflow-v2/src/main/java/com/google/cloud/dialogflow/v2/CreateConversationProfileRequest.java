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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for [ConversationProfiles.CreateConversationProfile][google.cloud.dialogflow.v2.ConversationProfiles.CreateConversationProfile].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationProfileRequest}
 */
public final class CreateConversationProfileRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateConversationProfileRequest)
    CreateConversationProfileRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversationProfileRequest.newBuilder() to construct.
  private CreateConversationProfileRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversationProfileRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversationProfileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateConversationProfileRequest(
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
              com.google.cloud.dialogflow.v2.ConversationProfile.Builder subBuilder = null;
              if (conversationProfile_ != null) {
                subBuilder = conversationProfile_.toBuilder();
              }
              conversationProfile_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.ConversationProfile.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(conversationProfile_);
                conversationProfile_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.class,
            com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The project to create a conversation profile for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The project to create a conversation profile for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

  public static final int CONVERSATION_PROFILE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.ConversationProfile conversationProfile_;
  /**
   *
   *
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationProfile field is set.
   */
  @java.lang.Override
  public boolean hasConversationProfile() {
    return conversationProfile_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationProfile.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationProfile getConversationProfile() {
    return conversationProfile_ == null
        ? com.google.cloud.dialogflow.v2.ConversationProfile.getDefaultInstance()
        : conversationProfile_;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder
      getConversationProfileOrBuilder() {
    return getConversationProfile();
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
    if (conversationProfile_ != null) {
      output.writeMessage(2, getConversationProfile());
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
    if (conversationProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConversationProfile());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateConversationProfileRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateConversationProfileRequest other =
        (com.google.cloud.dialogflow.v2.CreateConversationProfileRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasConversationProfile() != other.hasConversationProfile()) return false;
    if (hasConversationProfile()) {
      if (!getConversationProfile().equals(other.getConversationProfile())) return false;
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
    if (hasConversationProfile()) {
      hash = (37 * hash) + CONVERSATION_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getConversationProfile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.CreateConversationProfileRequest prototype) {
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
   * The request message for [ConversationProfiles.CreateConversationProfile][google.cloud.dialogflow.v2.ConversationProfiles.CreateConversationProfile].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationProfileRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateConversationProfileRequest)
      com.google.cloud.dialogflow.v2.CreateConversationProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.class,
              com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.newBuilder()
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

      if (conversationProfileBuilder_ == null) {
        conversationProfile_ = null;
      } else {
        conversationProfile_ = null;
        conversationProfileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationProfileRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationProfileRequest build() {
      com.google.cloud.dialogflow.v2.CreateConversationProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationProfileRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateConversationProfileRequest result =
          new com.google.cloud.dialogflow.v2.CreateConversationProfileRequest(this);
      result.parent_ = parent_;
      if (conversationProfileBuilder_ == null) {
        result.conversationProfile_ = conversationProfile_;
      } else {
        result.conversationProfile_ = conversationProfileBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.CreateConversationProfileRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateConversationProfileRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.CreateConversationProfileRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.CreateConversationProfileRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasConversationProfile()) {
        mergeConversationProfile(other.getConversationProfile());
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
      com.google.cloud.dialogflow.v2.CreateConversationProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.CreateConversationProfileRequest)
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
     * Required. The project to create a conversation profile for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project to create a conversation profile for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project to create a conversation profile for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project to create a conversation profile for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project to create a conversation profile for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

    private com.google.cloud.dialogflow.v2.ConversationProfile conversationProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationProfile,
            com.google.cloud.dialogflow.v2.ConversationProfile.Builder,
            com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder>
        conversationProfileBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversationProfile field is set.
     */
    public boolean hasConversationProfile() {
      return conversationProfileBuilder_ != null || conversationProfile_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversationProfile.
     */
    public com.google.cloud.dialogflow.v2.ConversationProfile getConversationProfile() {
      if (conversationProfileBuilder_ == null) {
        return conversationProfile_ == null
            ? com.google.cloud.dialogflow.v2.ConversationProfile.getDefaultInstance()
            : conversationProfile_;
      } else {
        return conversationProfileBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationProfile(
        com.google.cloud.dialogflow.v2.ConversationProfile value) {
      if (conversationProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversationProfile_ = value;
        onChanged();
      } else {
        conversationProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationProfile(
        com.google.cloud.dialogflow.v2.ConversationProfile.Builder builderForValue) {
      if (conversationProfileBuilder_ == null) {
        conversationProfile_ = builderForValue.build();
        onChanged();
      } else {
        conversationProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversationProfile(
        com.google.cloud.dialogflow.v2.ConversationProfile value) {
      if (conversationProfileBuilder_ == null) {
        if (conversationProfile_ != null) {
          conversationProfile_ =
              com.google.cloud.dialogflow.v2.ConversationProfile.newBuilder(conversationProfile_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          conversationProfile_ = value;
        }
        onChanged();
      } else {
        conversationProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversationProfile() {
      if (conversationProfileBuilder_ == null) {
        conversationProfile_ = null;
        onChanged();
      } else {
        conversationProfile_ = null;
        conversationProfileBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationProfile.Builder
        getConversationProfileBuilder() {

      onChanged();
      return getConversationProfileFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder
        getConversationProfileOrBuilder() {
      if (conversationProfileBuilder_ != null) {
        return conversationProfileBuilder_.getMessageOrBuilder();
      } else {
        return conversationProfile_ == null
            ? com.google.cloud.dialogflow.v2.ConversationProfile.getDefaultInstance()
            : conversationProfile_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation profile to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationProfile,
            com.google.cloud.dialogflow.v2.ConversationProfile.Builder,
            com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder>
        getConversationProfileFieldBuilder() {
      if (conversationProfileBuilder_ == null) {
        conversationProfileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ConversationProfile,
                com.google.cloud.dialogflow.v2.ConversationProfile.Builder,
                com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder>(
                getConversationProfile(), getParentForChildren(), isClean());
        conversationProfile_ = null;
      }
      return conversationProfileBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateConversationProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateConversationProfileRequest)
  private static final com.google.cloud.dialogflow.v2.CreateConversationProfileRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateConversationProfileRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationProfileRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationProfileRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConversationProfileRequest>() {
        @java.lang.Override
        public CreateConversationProfileRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateConversationProfileRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateConversationProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateConversationProfileRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
