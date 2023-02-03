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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

/**
 *
 *
 * <pre>
 * Request for the `CreateCertificateMap` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateMapRequest}
 */
public final class CreateCertificateMapRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.CreateCertificateMapRequest)
    CreateCertificateMapRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCertificateMapRequest.newBuilder() to construct.
  private CreateCertificateMapRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCertificateMapRequest() {
    parent_ = "";
    certificateMapId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCertificateMapRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_CreateCertificateMapRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_CreateCertificateMapRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest.class,
            com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the certificate map. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
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
   * Required. The parent resource of the certificate map. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
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

  public static final int CERTIFICATE_MAP_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object certificateMapId_ = "";
  /**
   *
   *
   * <pre>
   * Required. A user-provided name of the certificate map.
   * </pre>
   *
   * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The certificateMapId.
   */
  @java.lang.Override
  public java.lang.String getCertificateMapId() {
    java.lang.Object ref = certificateMapId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificateMapId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A user-provided name of the certificate map.
   * </pre>
   *
   * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for certificateMapId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCertificateMapIdBytes() {
    java.lang.Object ref = certificateMapId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      certificateMapId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_MAP_FIELD_NUMBER = 3;
  private com.google.cloud.certificatemanager.v1.CertificateMap certificateMap_;
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the certificateMap field is set.
   */
  @java.lang.Override
  public boolean hasCertificateMap() {
    return certificateMap_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The certificateMap.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateMap getCertificateMap() {
    return certificateMap_ == null
        ? com.google.cloud.certificatemanager.v1.CertificateMap.getDefaultInstance()
        : certificateMap_;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateMapOrBuilder
      getCertificateMapOrBuilder() {
    return certificateMap_ == null
        ? com.google.cloud.certificatemanager.v1.CertificateMap.getDefaultInstance()
        : certificateMap_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateMapId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certificateMapId_);
    }
    if (certificateMap_ != null) {
      output.writeMessage(3, getCertificateMap());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateMapId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certificateMapId_);
    }
    if (certificateMap_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCertificateMap());
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
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest other =
        (com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getCertificateMapId().equals(other.getCertificateMapId())) return false;
    if (hasCertificateMap() != other.hasCertificateMap()) return false;
    if (hasCertificateMap()) {
      if (!getCertificateMap().equals(other.getCertificateMap())) return false;
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
    hash = (37 * hash) + CERTIFICATE_MAP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCertificateMapId().hashCode();
    if (hasCertificateMap()) {
      hash = (37 * hash) + CERTIFICATE_MAP_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateMap().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest parseFrom(
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
      com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest prototype) {
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
   * Request for the `CreateCertificateMap` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateMapRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.CreateCertificateMapRequest)
      com.google.cloud.certificatemanager.v1.CreateCertificateMapRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateMapRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateMapRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest.class,
              com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      certificateMapId_ = "";
      certificateMap_ = null;
      if (certificateMapBuilder_ != null) {
        certificateMapBuilder_.dispose();
        certificateMapBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateMapRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
        getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest build() {
      com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest result =
          new com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificateMapId_ = certificateMapId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.certificateMap_ =
            certificateMapBuilder_ == null ? certificateMap_ : certificateMapBuilder_.build();
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
      if (other instanceof com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest) {
        return mergeFrom(
            (com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest other) {
      if (other
          == com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCertificateMapId().isEmpty()) {
        certificateMapId_ = other.certificateMapId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCertificateMap()) {
        mergeCertificateMap(other.getCertificateMap());
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
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                certificateMapId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getCertificateMapFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
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

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate map. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The parent resource of the certificate map. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The parent resource of the certificate map. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate map. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate map. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object certificateMapId_ = "";
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate map.
     * </pre>
     *
     * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The certificateMapId.
     */
    public java.lang.String getCertificateMapId() {
      java.lang.Object ref = certificateMapId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificateMapId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate map.
     * </pre>
     *
     * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for certificateMapId.
     */
    public com.google.protobuf.ByteString getCertificateMapIdBytes() {
      java.lang.Object ref = certificateMapId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        certificateMapId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate map.
     * </pre>
     *
     * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The certificateMapId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateMapId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      certificateMapId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate map.
     * </pre>
     *
     * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCertificateMapId() {
      certificateMapId_ = getDefaultInstance().getCertificateMapId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate map.
     * </pre>
     *
     * <code>string certificate_map_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for certificateMapId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateMapIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      certificateMapId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.certificatemanager.v1.CertificateMap certificateMap_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.CertificateMap,
            com.google.cloud.certificatemanager.v1.CertificateMap.Builder,
            com.google.cloud.certificatemanager.v1.CertificateMapOrBuilder>
        certificateMapBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the certificateMap field is set.
     */
    public boolean hasCertificateMap() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The certificateMap.
     */
    public com.google.cloud.certificatemanager.v1.CertificateMap getCertificateMap() {
      if (certificateMapBuilder_ == null) {
        return certificateMap_ == null
            ? com.google.cloud.certificatemanager.v1.CertificateMap.getDefaultInstance()
            : certificateMap_;
      } else {
        return certificateMapBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificateMap(com.google.cloud.certificatemanager.v1.CertificateMap value) {
      if (certificateMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificateMap_ = value;
      } else {
        certificateMapBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificateMap(
        com.google.cloud.certificatemanager.v1.CertificateMap.Builder builderForValue) {
      if (certificateMapBuilder_ == null) {
        certificateMap_ = builderForValue.build();
      } else {
        certificateMapBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCertificateMap(
        com.google.cloud.certificatemanager.v1.CertificateMap value) {
      if (certificateMapBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && certificateMap_ != null
            && certificateMap_
                != com.google.cloud.certificatemanager.v1.CertificateMap.getDefaultInstance()) {
          getCertificateMapBuilder().mergeFrom(value);
        } else {
          certificateMap_ = value;
        }
      } else {
        certificateMapBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCertificateMap() {
      bitField0_ = (bitField0_ & ~0x00000004);
      certificateMap_ = null;
      if (certificateMapBuilder_ != null) {
        certificateMapBuilder_.dispose();
        certificateMapBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateMap.Builder
        getCertificateMapBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCertificateMapFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateMapOrBuilder
        getCertificateMapOrBuilder() {
      if (certificateMapBuilder_ != null) {
        return certificateMapBuilder_.getMessageOrBuilder();
      } else {
        return certificateMap_ == null
            ? com.google.cloud.certificatemanager.v1.CertificateMap.getDefaultInstance()
            : certificateMap_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMap certificate_map = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.CertificateMap,
            com.google.cloud.certificatemanager.v1.CertificateMap.Builder,
            com.google.cloud.certificatemanager.v1.CertificateMapOrBuilder>
        getCertificateMapFieldBuilder() {
      if (certificateMapBuilder_ == null) {
        certificateMapBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.certificatemanager.v1.CertificateMap,
                com.google.cloud.certificatemanager.v1.CertificateMap.Builder,
                com.google.cloud.certificatemanager.v1.CertificateMapOrBuilder>(
                getCertificateMap(), getParentForChildren(), isClean());
        certificateMap_ = null;
      }
      return certificateMapBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.CreateCertificateMapRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.CreateCertificateMapRequest)
  private static final com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest();
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCertificateMapRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCertificateMapRequest>() {
        @java.lang.Override
        public CreateCertificateMapRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCertificateMapRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCertificateMapRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
