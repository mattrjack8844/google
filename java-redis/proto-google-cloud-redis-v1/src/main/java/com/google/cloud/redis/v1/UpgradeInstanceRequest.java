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
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

/**
 *
 *
 * <pre>
 * Request for [UpgradeInstance][google.cloud.redis.v1.CloudRedis.UpgradeInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1.UpgradeInstanceRequest}
 */
public final class UpgradeInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1.UpgradeInstanceRequest)
    UpgradeInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpgradeInstanceRequest.newBuilder() to construct.
  private UpgradeInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpgradeInstanceRequest() {
    name_ = "";
    redisVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpgradeInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpgradeInstanceRequest(
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

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              redisVersion_ = s;
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
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1.UpgradeInstanceRequest.class,
            com.google.cloud.redis.v1.UpgradeInstanceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REDIS_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object redisVersion_;
  /**
   *
   *
   * <pre>
   * Required. Specifies the target version of Redis software to upgrade to.
   * </pre>
   *
   * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The redisVersion.
   */
  @java.lang.Override
  public java.lang.String getRedisVersion() {
    java.lang.Object ref = redisVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redisVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Specifies the target version of Redis software to upgrade to.
   * </pre>
   *
   * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for redisVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRedisVersionBytes() {
    java.lang.Object ref = redisVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      redisVersion_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redisVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, redisVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redisVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, redisVersion_);
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
    if (!(obj instanceof com.google.cloud.redis.v1.UpgradeInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1.UpgradeInstanceRequest other =
        (com.google.cloud.redis.v1.UpgradeInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getRedisVersion().equals(other.getRedisVersion())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REDIS_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getRedisVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.redis.v1.UpgradeInstanceRequest prototype) {
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
   * Request for [UpgradeInstance][google.cloud.redis.v1.CloudRedis.UpgradeInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1.UpgradeInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1.UpgradeInstanceRequest)
      com.google.cloud.redis.v1.UpgradeInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1.UpgradeInstanceRequest.class,
              com.google.cloud.redis.v1.UpgradeInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1.UpgradeInstanceRequest.newBuilder()
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
      name_ = "";

      redisVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.UpgradeInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1.UpgradeInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.UpgradeInstanceRequest build() {
      com.google.cloud.redis.v1.UpgradeInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.UpgradeInstanceRequest buildPartial() {
      com.google.cloud.redis.v1.UpgradeInstanceRequest result =
          new com.google.cloud.redis.v1.UpgradeInstanceRequest(this);
      result.name_ = name_;
      result.redisVersion_ = redisVersion_;
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
      if (other instanceof com.google.cloud.redis.v1.UpgradeInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1.UpgradeInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1.UpgradeInstanceRequest other) {
      if (other == com.google.cloud.redis.v1.UpgradeInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getRedisVersion().isEmpty()) {
        redisVersion_ = other.redisVersion_;
        onChanged();
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
      com.google.cloud.redis.v1.UpgradeInstanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.redis.v1.UpgradeInstanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object redisVersion_ = "";
    /**
     *
     *
     * <pre>
     * Required. Specifies the target version of Redis software to upgrade to.
     * </pre>
     *
     * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The redisVersion.
     */
    public java.lang.String getRedisVersion() {
      java.lang.Object ref = redisVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redisVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the target version of Redis software to upgrade to.
     * </pre>
     *
     * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for redisVersion.
     */
    public com.google.protobuf.ByteString getRedisVersionBytes() {
      java.lang.Object ref = redisVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        redisVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the target version of Redis software to upgrade to.
     * </pre>
     *
     * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The redisVersion to set.
     * @return This builder for chaining.
     */
    public Builder setRedisVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      redisVersion_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the target version of Redis software to upgrade to.
     * </pre>
     *
     * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRedisVersion() {

      redisVersion_ = getDefaultInstance().getRedisVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specifies the target version of Redis software to upgrade to.
     * </pre>
     *
     * <code>string redis_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for redisVersion to set.
     * @return This builder for chaining.
     */
    public Builder setRedisVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      redisVersion_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1.UpgradeInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1.UpgradeInstanceRequest)
  private static final com.google.cloud.redis.v1.UpgradeInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1.UpgradeInstanceRequest();
  }

  public static com.google.cloud.redis.v1.UpgradeInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpgradeInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpgradeInstanceRequest>() {
        @java.lang.Override
        public UpgradeInstanceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpgradeInstanceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpgradeInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpgradeInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1.UpgradeInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
