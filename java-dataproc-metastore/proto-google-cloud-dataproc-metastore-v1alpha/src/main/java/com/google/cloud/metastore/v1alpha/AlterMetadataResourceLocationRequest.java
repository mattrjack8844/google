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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for
 * [DataprocMetastore.AlterMetadataResourceLocation][google.cloud.metastore.v1alpha.DataprocMetastore.AlterMetadataResourceLocation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest}
 */
public final class AlterMetadataResourceLocationRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest)
    AlterMetadataResourceLocationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AlterMetadataResourceLocationRequest.newBuilder() to construct.
  private AlterMetadataResourceLocationRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AlterMetadataResourceLocationRequest() {
    service_ = "";
    resourceName_ = "";
    locationUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AlterMetadataResourceLocationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_AlterMetadataResourceLocationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_AlterMetadataResourceLocationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest.class,
            com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The relative metadata resource name in the following format.
   *
   * `databases/{database_id}`
   * or
   * `databases/{database_id}/tables/{table_id}`
   * or
   * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
   * </pre>
   *
   * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The relative metadata resource name in the following format.
   *
   * `databases/{database_id}`
   * or
   * `databases/{database_id}/tables/{table_id}`
   * or
   * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
   * </pre>
   *
   * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_URI_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object locationUri_ = "";
  /**
   *
   *
   * <pre>
   * Required. The new location URI for the metadata resource.
   * </pre>
   *
   * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The locationUri.
   */
  @java.lang.Override
  public java.lang.String getLocationUri() {
    java.lang.Object ref = locationUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locationUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The new location URI for the metadata resource.
   * </pre>
   *
   * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for locationUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationUriBytes() {
    java.lang.Object ref = locationUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      locationUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, locationUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, locationUri_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest other =
        (com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getResourceName().equals(other.getResourceName())) return false;
    if (!getLocationUri().equals(other.getLocationUri())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + LOCATION_URI_FIELD_NUMBER;
    hash = (53 * hash) + getLocationUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest parseFrom(
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
      com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest prototype) {
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
   * [DataprocMetastore.AlterMetadataResourceLocation][google.cloud.metastore.v1alpha.DataprocMetastore.AlterMetadataResourceLocation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest)
      com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_AlterMetadataResourceLocationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_AlterMetadataResourceLocationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest.class,
              com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      service_ = "";
      resourceName_ = "";
      locationUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_AlterMetadataResourceLocationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest build() {
      com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest buildPartial() {
      com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest result =
          new com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.locationUri_ = locationUri_;
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
      if (other
          instanceof com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest) {
        return mergeFrom(
            (com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest other) {
      if (other
          == com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
              .getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLocationUri().isEmpty()) {
        locationUri_ = other.locationUri_;
        bitField0_ |= 0x00000004;
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
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                resourceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                locationUri_ = input.readStringRequireUtf8();
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

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The relative metadata resource name in the following format.
     *
     * `databases/{database_id}`
     * or
     * `databases/{database_id}/tables/{table_id}`
     * or
     * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative metadata resource name in the following format.
     *
     * `databases/{database_id}`
     * or
     * `databases/{database_id}/tables/{table_id}`
     * or
     * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative metadata resource name in the following format.
     *
     * `databases/{database_id}`
     * or
     * `databases/{database_id}/tables/{table_id}`
     * or
     * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative metadata resource name in the following format.
     *
     * `databases/{database_id}`
     * or
     * `databases/{database_id}/tables/{table_id}`
     * or
     * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative metadata resource name in the following format.
     *
     * `databases/{database_id}`
     * or
     * `databases/{database_id}/tables/{table_id}`
     * or
     * `databases/{database_id}/tables/{table_id}/partitions/{partition_id}`
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object locationUri_ = "";
    /**
     *
     *
     * <pre>
     * Required. The new location URI for the metadata resource.
     * </pre>
     *
     * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The locationUri.
     */
    public java.lang.String getLocationUri() {
      java.lang.Object ref = locationUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locationUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new location URI for the metadata resource.
     * </pre>
     *
     * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for locationUri.
     */
    public com.google.protobuf.ByteString getLocationUriBytes() {
      java.lang.Object ref = locationUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        locationUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new location URI for the metadata resource.
     * </pre>
     *
     * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The locationUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocationUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      locationUri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new location URI for the metadata resource.
     * </pre>
     *
     * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocationUri() {
      locationUri_ = getDefaultInstance().getLocationUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new location URI for the metadata resource.
     * </pre>
     *
     * <code>string location_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for locationUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocationUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      locationUri_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest)
  private static final com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest();
  }

  public static com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterMetadataResourceLocationRequest> PARSER =
      new com.google.protobuf.AbstractParser<AlterMetadataResourceLocationRequest>() {
        @java.lang.Override
        public AlterMetadataResourceLocationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterMetadataResourceLocationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterMetadataResourceLocationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.AlterMetadataResourceLocationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
