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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateApiVersion.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiVersionRequest}
 */
public final class CreateApiVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.CreateApiVersionRequest)
    CreateApiVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateApiVersionRequest.newBuilder() to construct.
  private CreateApiVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateApiVersionRequest() {
    parent_ = "";
    apiVersionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateApiVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_CreateApiVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_CreateApiVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.class,
            com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of versions.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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
   * Required. The parent, which owns this collection of versions.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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

  public static final int API_VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.apigeeregistry.v1.ApiVersion apiVersion_;
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the apiVersion field is set.
   */
  @java.lang.Override
  public boolean hasApiVersion() {
    return apiVersion_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The apiVersion.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiVersion getApiVersion() {
    return apiVersion_ == null
        ? com.google.cloud.apigeeregistry.v1.ApiVersion.getDefaultInstance()
        : apiVersion_;
  }
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder getApiVersionOrBuilder() {
    return getApiVersion();
  }

  public static final int API_VERSION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object apiVersionId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the version, which will become the final component of
   * the version's resource name.
   * This value should be 1-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The apiVersionId.
   */
  @java.lang.Override
  public java.lang.String getApiVersionId() {
    java.lang.Object ref = apiVersionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiVersionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the version, which will become the final component of
   * the version's resource name.
   * This value should be 1-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for apiVersionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getApiVersionIdBytes() {
    java.lang.Object ref = apiVersionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      apiVersionId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (apiVersion_ != null) {
      output.writeMessage(2, getApiVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiVersionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, apiVersionId_);
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
    if (apiVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getApiVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiVersionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, apiVersionId_);
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest other =
        (com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasApiVersion() != other.hasApiVersion()) return false;
    if (hasApiVersion()) {
      if (!getApiVersion().equals(other.getApiVersion())) return false;
    }
    if (!getApiVersionId().equals(other.getApiVersionId())) return false;
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
    if (hasApiVersion()) {
      hash = (37 * hash) + API_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getApiVersion().hashCode();
    }
    hash = (37 * hash) + API_VERSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApiVersionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest parseFrom(
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
      com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest prototype) {
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
   * Request message for CreateApiVersion.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.CreateApiVersionRequest)
      com.google.cloud.apigeeregistry.v1.CreateApiVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.class,
              com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (apiVersionBuilder_ == null) {
        apiVersion_ = null;
      } else {
        apiVersion_ = null;
        apiVersionBuilder_ = null;
      }
      apiVersionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest build() {
      com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest result =
          new com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest(this);
      result.parent_ = parent_;
      if (apiVersionBuilder_ == null) {
        result.apiVersion_ = apiVersion_;
      } else {
        result.apiVersion_ = apiVersionBuilder_.build();
      }
      result.apiVersionId_ = apiVersionId_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasApiVersion()) {
        mergeApiVersion(other.getApiVersion());
      }
      if (!other.getApiVersionId().isEmpty()) {
        apiVersionId_ = other.apiVersionId_;
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getApiVersionFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 26:
              {
                apiVersionId_ = input.readStringRequireUtf8();

                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent, which owns this collection of versions.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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
     * Required. The parent, which owns this collection of versions.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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
     * Required. The parent, which owns this collection of versions.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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
     * Required. The parent, which owns this collection of versions.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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
     * Required. The parent, which owns this collection of versions.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
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

    private com.google.cloud.apigeeregistry.v1.ApiVersion apiVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiVersion,
            com.google.cloud.apigeeregistry.v1.ApiVersion.Builder,
            com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder>
        apiVersionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the apiVersion field is set.
     */
    public boolean hasApiVersion() {
      return apiVersionBuilder_ != null || apiVersion_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The apiVersion.
     */
    public com.google.cloud.apigeeregistry.v1.ApiVersion getApiVersion() {
      if (apiVersionBuilder_ == null) {
        return apiVersion_ == null
            ? com.google.cloud.apigeeregistry.v1.ApiVersion.getDefaultInstance()
            : apiVersion_;
      } else {
        return apiVersionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApiVersion(com.google.cloud.apigeeregistry.v1.ApiVersion value) {
      if (apiVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiVersion_ = value;
        onChanged();
      } else {
        apiVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApiVersion(
        com.google.cloud.apigeeregistry.v1.ApiVersion.Builder builderForValue) {
      if (apiVersionBuilder_ == null) {
        apiVersion_ = builderForValue.build();
        onChanged();
      } else {
        apiVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeApiVersion(com.google.cloud.apigeeregistry.v1.ApiVersion value) {
      if (apiVersionBuilder_ == null) {
        if (apiVersion_ != null) {
          apiVersion_ =
              com.google.cloud.apigeeregistry.v1.ApiVersion.newBuilder(apiVersion_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          apiVersion_ = value;
        }
        onChanged();
      } else {
        apiVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearApiVersion() {
      if (apiVersionBuilder_ == null) {
        apiVersion_ = null;
        onChanged();
      } else {
        apiVersion_ = null;
        apiVersionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiVersion.Builder getApiVersionBuilder() {

      onChanged();
      return getApiVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder getApiVersionOrBuilder() {
      if (apiVersionBuilder_ != null) {
        return apiVersionBuilder_.getMessageOrBuilder();
      } else {
        return apiVersion_ == null
            ? com.google.cloud.apigeeregistry.v1.ApiVersion.getDefaultInstance()
            : apiVersion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiVersion,
            com.google.cloud.apigeeregistry.v1.ApiVersion.Builder,
            com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder>
        getApiVersionFieldBuilder() {
      if (apiVersionBuilder_ == null) {
        apiVersionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apigeeregistry.v1.ApiVersion,
                com.google.cloud.apigeeregistry.v1.ApiVersion.Builder,
                com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder>(
                getApiVersion(), getParentForChildren(), isClean());
        apiVersion_ = null;
      }
      return apiVersionBuilder_;
    }

    private java.lang.Object apiVersionId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the version, which will become the final component of
     * the version's resource name.
     * This value should be 1-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The apiVersionId.
     */
    public java.lang.String getApiVersionId() {
      java.lang.Object ref = apiVersionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiVersionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the version, which will become the final component of
     * the version's resource name.
     * This value should be 1-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for apiVersionId.
     */
    public com.google.protobuf.ByteString getApiVersionIdBytes() {
      java.lang.Object ref = apiVersionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiVersionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the version, which will become the final component of
     * the version's resource name.
     * This value should be 1-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The apiVersionId to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      apiVersionId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the version, which will become the final component of
     * the version's resource name.
     * This value should be 1-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApiVersionId() {

      apiVersionId_ = getDefaultInstance().getApiVersionId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the version, which will become the final component of
     * the version's resource name.
     * This value should be 1-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for apiVersionId to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      apiVersionId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.CreateApiVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.CreateApiVersionRequest)
  private static final com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApiVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateApiVersionRequest>() {
        @java.lang.Override
        public CreateApiVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateApiVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApiVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.CreateApiVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
