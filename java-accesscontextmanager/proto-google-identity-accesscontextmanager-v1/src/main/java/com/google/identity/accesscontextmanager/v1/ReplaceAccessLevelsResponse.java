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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A response to ReplaceAccessLevelsRequest. This will be put inside of
 * Operation.response field.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse}
 */
public final class ReplaceAccessLevelsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
    ReplaceAccessLevelsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReplaceAccessLevelsResponse.newBuilder() to construct.
  private ReplaceAccessLevelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReplaceAccessLevelsResponse() {
    accessLevels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReplaceAccessLevelsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReplaceAccessLevelsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                accessLevels_ =
                    new java.util.ArrayList<
                        com.google.identity.accesscontextmanager.v1.AccessLevel>();
                mutable_bitField0_ |= 0x00000001;
              }
              accessLevels_.add(
                  input.readMessage(
                      com.google.identity.accesscontextmanager.v1.AccessLevel.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        accessLevels_ = java.util.Collections.unmodifiableList(accessLevels_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_ReplaceAccessLevelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_ReplaceAccessLevelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse.class,
            com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse.Builder.class);
  }

  public static final int ACCESS_LEVELS_FIELD_NUMBER = 1;
  private java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> accessLevels_;
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel>
      getAccessLevelsList() {
    return accessLevels_;
  }
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
      getAccessLevelsOrBuilderList() {
    return accessLevels_;
  }
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public int getAccessLevelsCount() {
    return accessLevels_.size();
  }
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevels(int index) {
    return accessLevels_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelsOrBuilder(
      int index) {
    return accessLevels_.get(index);
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
    for (int i = 0; i < accessLevels_.size(); i++) {
      output.writeMessage(1, accessLevels_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accessLevels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, accessLevels_.get(i));
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse other =
        (com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse) obj;

    if (!getAccessLevelsList().equals(other.getAccessLevelsList())) return false;
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
    if (getAccessLevelsCount() > 0) {
      hash = (37 * hash) + ACCESS_LEVELS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessLevelsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parseFrom(
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
      com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse prototype) {
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
   * A response to ReplaceAccessLevelsRequest. This will be put inside of
   * Operation.response field.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
      com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ReplaceAccessLevelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ReplaceAccessLevelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse.class,
              com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAccessLevelsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (accessLevelsBuilder_ == null) {
        accessLevels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        accessLevelsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ReplaceAccessLevelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse build() {
      com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse buildPartial() {
      com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse result =
          new com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse(this);
      int from_bitField0_ = bitField0_;
      if (accessLevelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessLevels_ = java.util.Collections.unmodifiableList(accessLevels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessLevels_ = accessLevels_;
      } else {
        result.accessLevels_ = accessLevelsBuilder_.build();
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
      if (other
          instanceof com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
              .getDefaultInstance()) return this;
      if (accessLevelsBuilder_ == null) {
        if (!other.accessLevels_.isEmpty()) {
          if (accessLevels_.isEmpty()) {
            accessLevels_ = other.accessLevels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessLevelsIsMutable();
            accessLevels_.addAll(other.accessLevels_);
          }
          onChanged();
        }
      } else {
        if (!other.accessLevels_.isEmpty()) {
          if (accessLevelsBuilder_.isEmpty()) {
            accessLevelsBuilder_.dispose();
            accessLevelsBuilder_ = null;
            accessLevels_ = other.accessLevels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessLevelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAccessLevelsFieldBuilder()
                    : null;
          } else {
            accessLevelsBuilder_.addAllMessages(other.accessLevels_);
          }
        }
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
      com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> accessLevels_ =
        java.util.Collections.emptyList();

    private void ensureAccessLevelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessLevels_ =
            new java.util.ArrayList<com.google.identity.accesscontextmanager.v1.AccessLevel>(
                accessLevels_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessLevel,
            com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
            com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
        accessLevelsBuilder_;

    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel>
        getAccessLevelsList() {
      if (accessLevelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessLevels_);
      } else {
        return accessLevelsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public int getAccessLevelsCount() {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.size();
      } else {
        return accessLevelsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevels(int index) {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.get(index);
      } else {
        return accessLevelsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder setAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.set(index, value);
        onChanged();
      } else {
        accessLevelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder setAccessLevels(
        int index,
        com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.add(value);
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.add(index, value);
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.add(builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        int index,
        com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAllAccessLevels(
        java.lang.Iterable<? extends com.google.identity.accesscontextmanager.v1.AccessLevel>
            values) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, accessLevels_);
        onChanged();
      } else {
        accessLevelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder clearAccessLevels() {
      if (accessLevelsBuilder_ == null) {
        accessLevels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessLevelsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder removeAccessLevels(int index) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.remove(index);
        onChanged();
      } else {
        accessLevelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder getAccessLevelsBuilder(
        int index) {
      return getAccessLevelsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder
        getAccessLevelsOrBuilder(int index) {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.get(index);
      } else {
        return accessLevelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<
            ? extends com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
        getAccessLevelsOrBuilderList() {
      if (accessLevelsBuilder_ != null) {
        return accessLevelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessLevels_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder
        addAccessLevelsBuilder() {
      return getAccessLevelsFieldBuilder()
          .addBuilder(com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder addAccessLevelsBuilder(
        int index) {
      return getAccessLevelsFieldBuilder()
          .addBuilder(
              index, com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel.Builder>
        getAccessLevelsBuilderList() {
      return getAccessLevelsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessLevel,
            com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
            com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
        getAccessLevelsFieldBuilder() {
      if (accessLevelsBuilder_ == null) {
        accessLevelsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.AccessLevel,
                com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
                com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>(
                accessLevels_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        accessLevels_ = null;
      }
      return accessLevelsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
  private static final com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse();
  }

  public static com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceAccessLevelsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReplaceAccessLevelsResponse>() {
        @java.lang.Override
        public ReplaceAccessLevelsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReplaceAccessLevelsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReplaceAccessLevelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceAccessLevelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
