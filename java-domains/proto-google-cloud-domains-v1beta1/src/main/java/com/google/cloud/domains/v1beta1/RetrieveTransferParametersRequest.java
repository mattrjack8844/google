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
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

/**
 *
 *
 * <pre>
 * Request for the `RetrieveTransferParameters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1beta1.RetrieveTransferParametersRequest}
 */
public final class RetrieveTransferParametersRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1beta1.RetrieveTransferParametersRequest)
    RetrieveTransferParametersRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrieveTransferParametersRequest.newBuilder() to construct.
  private RetrieveTransferParametersRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrieveTransferParametersRequest() {
    domainName_ = "";
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrieveTransferParametersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest.class,
            com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest.Builder.class);
  }

  public static final int DOMAIN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object domainName_;
  /**
   *
   *
   * <pre>
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domainName.
   */
  @java.lang.Override
  public java.lang.String getDomainName() {
    java.lang.Object ref = domainName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domainName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domainName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDomainNameBytes() {
    java.lang.Object ref = domainName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      domainName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, domainName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, domainName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
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
    if (!(obj instanceof com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest other =
        (com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest) obj;

    if (!getDomainName().equals(other.getDomainName())) return false;
    if (!getLocation().equals(other.getLocation())) return false;
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
    hash = (37 * hash) + DOMAIN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDomainName().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest parseFrom(
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
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest prototype) {
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
   * Request for the `RetrieveTransferParameters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1beta1.RetrieveTransferParametersRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1beta1.RetrieveTransferParametersRequest)
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest.class,
              com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      domainName_ = "";

      location_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
        getDefaultInstanceForType() {
      return com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest build() {
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest buildPartial() {
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest result =
          new com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest(this);
      result.domainName_ = domainName_;
      result.location_ = location_;
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
      if (other instanceof com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest) {
        return mergeFrom(
            (com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest other) {
      if (other
          == com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
              .getDefaultInstance()) return this;
      if (!other.getDomainName().isEmpty()) {
        domainName_ = other.domainName_;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
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
                domainName_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                location_ = input.readStringRequireUtf8();

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

    private java.lang.Object domainName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The domain name. Unicode domain names must be expressed in Punycode format.
     * </pre>
     *
     * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The domainName.
     */
    public java.lang.String getDomainName() {
      java.lang.Object ref = domainName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domainName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The domain name. Unicode domain names must be expressed in Punycode format.
     * </pre>
     *
     * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for domainName.
     */
    public com.google.protobuf.ByteString getDomainNameBytes() {
      java.lang.Object ref = domainName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        domainName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The domain name. Unicode domain names must be expressed in Punycode format.
     * </pre>
     *
     * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The domainName to set.
     * @return This builder for chaining.
     */
    public Builder setDomainName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      domainName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain name. Unicode domain names must be expressed in Punycode format.
     * </pre>
     *
     * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDomainName() {

      domainName_ = getDefaultInstance().getDomainName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain name. Unicode domain names must be expressed in Punycode format.
     * </pre>
     *
     * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for domainName to set.
     * @return This builder for chaining.
     */
    public Builder setDomainNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      domainName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      location_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {

      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      location_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1beta1.RetrieveTransferParametersRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1beta1.RetrieveTransferParametersRequest)
  private static final com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest();
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveTransferParametersRequest> PARSER =
      new com.google.protobuf.AbstractParser<RetrieveTransferParametersRequest>() {
        @java.lang.Override
        public RetrieveTransferParametersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetrieveTransferParametersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveTransferParametersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
