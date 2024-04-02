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
// source: google/cloud/security/privateca/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CertificateAuthorityService.DeleteCaPool][google.cloud.security.privateca.v1.CertificateAuthorityService.DeleteCaPool].
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.DeleteCaPoolRequest}
 */
public final class DeleteCaPoolRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.DeleteCaPoolRequest)
    DeleteCaPoolRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteCaPoolRequest.newBuilder() to construct.
  private DeleteCaPoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteCaPoolRequest() {
    name_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteCaPoolRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaProto
        .internal_static_google_cloud_security_privateca_v1_DeleteCaPoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaProto
        .internal_static_google_cloud_security_privateca_v1_DeleteCaPoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.class,
            com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name for this
   * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
   * Required. The resource name for this
   * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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

  public static final int REQUEST_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IGNORE_DEPENDENT_RESOURCES_FIELD_NUMBER = 4;
  private boolean ignoreDependentResources_ = false;
  /**
   *
   *
   * <pre>
   * Optional. This field allows this pool to be deleted even if it's being
   * depended on by another resource. However, doing so may result in unintended
   * and unrecoverable effects on any dependent resources since the pool will
   * no longer be able to issue certificates.
   * </pre>
   *
   * <code>bool ignore_dependent_resources = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ignoreDependentResources.
   */
  @java.lang.Override
  public boolean getIgnoreDependentResources() {
    return ignoreDependentResources_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestId_);
    }
    if (ignoreDependentResources_ != false) {
      output.writeBool(4, ignoreDependentResources_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestId_);
    }
    if (ignoreDependentResources_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, ignoreDependentResources_);
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
    if (!(obj instanceof com.google.cloud.security.privateca.v1.DeleteCaPoolRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.DeleteCaPoolRequest other =
        (com.google.cloud.security.privateca.v1.DeleteCaPoolRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getRequestId().equals(other.getRequestId())) return false;
    if (getIgnoreDependentResources() != other.getIgnoreDependentResources()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (37 * hash) + IGNORE_DEPENDENT_RESOURCES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIgnoreDependentResources());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest parseFrom(
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
      com.google.cloud.security.privateca.v1.DeleteCaPoolRequest prototype) {
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
   * [CertificateAuthorityService.DeleteCaPool][google.cloud.security.privateca.v1.CertificateAuthorityService.DeleteCaPool].
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.DeleteCaPoolRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.DeleteCaPoolRequest)
      com.google.cloud.security.privateca.v1.DeleteCaPoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_DeleteCaPoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_DeleteCaPoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.class,
              com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.Builder.class);
    }

    // Construct using com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      requestId_ = "";
      ignoreDependentResources_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_DeleteCaPoolRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.DeleteCaPoolRequest getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.DeleteCaPoolRequest build() {
      com.google.cloud.security.privateca.v1.DeleteCaPoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.DeleteCaPoolRequest buildPartial() {
      com.google.cloud.security.privateca.v1.DeleteCaPoolRequest result =
          new com.google.cloud.security.privateca.v1.DeleteCaPoolRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.security.privateca.v1.DeleteCaPoolRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestId_ = requestId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ignoreDependentResources_ = ignoreDependentResources_;
      }
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
      if (other instanceof com.google.cloud.security.privateca.v1.DeleteCaPoolRequest) {
        return mergeFrom((com.google.cloud.security.privateca.v1.DeleteCaPoolRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.security.privateca.v1.DeleteCaPoolRequest other) {
      if (other == com.google.cloud.security.privateca.v1.DeleteCaPoolRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIgnoreDependentResources() != false) {
        setIgnoreDependentResources(other.getIgnoreDependentResources());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                requestId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 32:
              {
                ignoreDependentResources_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name for this
     * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
     * Required. The resource name for this
     * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
     * Required. The resource name for this
     * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name for this
     * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name for this
     * [CaPool][google.cloud.security.privateca.v1.CaPool] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. An ID to identify requests. Specify a unique request ID so that
     * if you must retry your request, the server will know to ignore the request
     * if it has already been completed. The server will guarantee that for at
     * least 60 minutes since the first request.
     *
     * For example, consider a situation where you make an initial request and
     * the request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     *
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An ID to identify requests. Specify a unique request ID so that
     * if you must retry your request, the server will know to ignore the request
     * if it has already been completed. The server will guarantee that for at
     * least 60 minutes since the first request.
     *
     * For example, consider a situation where you make an initial request and
     * the request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     *
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An ID to identify requests. Specify a unique request ID so that
     * if you must retry your request, the server will know to ignore the request
     * if it has already been completed. The server will guarantee that for at
     * least 60 minutes since the first request.
     *
     * For example, consider a situation where you make an initial request and
     * the request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     *
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      requestId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An ID to identify requests. Specify a unique request ID so that
     * if you must retry your request, the server will know to ignore the request
     * if it has already been completed. The server will guarantee that for at
     * least 60 minutes since the first request.
     *
     * For example, consider a situation where you make an initial request and
     * the request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     *
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An ID to identify requests. Specify a unique request ID so that
     * if you must retry your request, the server will know to ignore the request
     * if it has already been completed. The server will guarantee that for at
     * least 60 minutes since the first request.
     *
     * For example, consider a situation where you make an initial request and
     * the request times out. If you make the request again with the same request
     * ID, the server can check if original operation with the same request ID
     * was received, and if so, will ignore the second request. This prevents
     * clients from accidentally creating duplicate commitments.
     *
     * The request ID must be a valid UUID with the exception that zero UUID is
     * not supported (00000000-0000-0000-0000-000000000000).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean ignoreDependentResources_;
    /**
     *
     *
     * <pre>
     * Optional. This field allows this pool to be deleted even if it's being
     * depended on by another resource. However, doing so may result in unintended
     * and unrecoverable effects on any dependent resources since the pool will
     * no longer be able to issue certificates.
     * </pre>
     *
     * <code>bool ignore_dependent_resources = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The ignoreDependentResources.
     */
    @java.lang.Override
    public boolean getIgnoreDependentResources() {
      return ignoreDependentResources_;
    }
    /**
     *
     *
     * <pre>
     * Optional. This field allows this pool to be deleted even if it's being
     * depended on by another resource. However, doing so may result in unintended
     * and unrecoverable effects on any dependent resources since the pool will
     * no longer be able to issue certificates.
     * </pre>
     *
     * <code>bool ignore_dependent_resources = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The ignoreDependentResources to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreDependentResources(boolean value) {

      ignoreDependentResources_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This field allows this pool to be deleted even if it's being
     * depended on by another resource. However, doing so may result in unintended
     * and unrecoverable effects on any dependent resources since the pool will
     * no longer be able to issue certificates.
     * </pre>
     *
     * <code>bool ignore_dependent_resources = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIgnoreDependentResources() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ignoreDependentResources_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.DeleteCaPoolRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.DeleteCaPoolRequest)
  private static final com.google.cloud.security.privateca.v1.DeleteCaPoolRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1.DeleteCaPoolRequest();
  }

  public static com.google.cloud.security.privateca.v1.DeleteCaPoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteCaPoolRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteCaPoolRequest>() {
        @java.lang.Override
        public DeleteCaPoolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteCaPoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteCaPoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.DeleteCaPoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
