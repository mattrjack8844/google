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
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Service identity for a service. This is the identity that service producer
 * should use to access consumer resources.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.ServiceIdentity}
 */
public final class ServiceIdentity extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.ServiceIdentity)
    ServiceIdentityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServiceIdentity.newBuilder() to construct.
  private ServiceIdentity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServiceIdentity() {
    email_ = "";
    uniqueId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServiceIdentity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ResourcesProto
        .internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ResourcesProto
        .internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.ServiceIdentity.class,
            com.google.api.serviceusage.v1beta1.ServiceIdentity.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   *
   *
   * <pre>
   * The email address of the service account that a service producer would use
   * to access consumer resources.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The email address of the service account that a service producer would use
   * to access consumer resources.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uniqueId_ = "";
  /**
   *
   *
   * <pre>
   * The unique and stable id of the service account.
   * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
   * </pre>
   *
   * <code>string unique_id = 2;</code>
   *
   * @return The uniqueId.
   */
  @java.lang.Override
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unique and stable id of the service account.
   * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
   * </pre>
   *
   * <code>string unique_id = 2;</code>
   *
   * @return The bytes for uniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uniqueId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uniqueId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uniqueId_);
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
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.ServiceIdentity)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.ServiceIdentity other =
        (com.google.api.serviceusage.v1beta1.ServiceIdentity) obj;

    if (!getEmail().equals(other.getEmail())) return false;
    if (!getUniqueId().equals(other.getUniqueId())) return false;
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
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUniqueId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity parseFrom(
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

  public static Builder newBuilder(com.google.api.serviceusage.v1beta1.ServiceIdentity prototype) {
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
   * Service identity for a service. This is the identity that service producer
   * should use to access consumer resources.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.ServiceIdentity}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.ServiceIdentity)
      com.google.api.serviceusage.v1beta1.ServiceIdentityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ResourcesProto
          .internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ResourcesProto
          .internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.ServiceIdentity.class,
              com.google.api.serviceusage.v1beta1.ServiceIdentity.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1beta1.ServiceIdentity.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      email_ = "";
      uniqueId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ResourcesProto
          .internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ServiceIdentity getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.ServiceIdentity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ServiceIdentity build() {
      com.google.api.serviceusage.v1beta1.ServiceIdentity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ServiceIdentity buildPartial() {
      com.google.api.serviceusage.v1beta1.ServiceIdentity result =
          new com.google.api.serviceusage.v1beta1.ServiceIdentity(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.serviceusage.v1beta1.ServiceIdentity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.uniqueId_ = uniqueId_;
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
      if (other instanceof com.google.api.serviceusage.v1beta1.ServiceIdentity) {
        return mergeFrom((com.google.api.serviceusage.v1beta1.ServiceIdentity) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1beta1.ServiceIdentity other) {
      if (other == com.google.api.serviceusage.v1beta1.ServiceIdentity.getDefaultInstance())
        return this;
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUniqueId().isEmpty()) {
        uniqueId_ = other.uniqueId_;
        bitField0_ |= 0x00000002;
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
                email_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                uniqueId_ = input.readStringRequireUtf8();
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

    private java.lang.Object email_ = "";
    /**
     *
     *
     * <pre>
     * The email address of the service account that a service producer would use
     * to access consumer resources.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account that a service producer would use
     * to access consumer resources.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account that a service producer would use
     * to access consumer resources.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account that a service producer would use
     * to access consumer resources.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account that a service producer would use
     * to access consumer resources.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     *
     *
     * <pre>
     * The unique and stable id of the service account.
     * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
     * </pre>
     *
     * <code>string unique_id = 2;</code>
     *
     * @return The uniqueId.
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique and stable id of the service account.
     * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
     * </pre>
     *
     * <code>string unique_id = 2;</code>
     *
     * @return The bytes for uniqueId.
     */
    public com.google.protobuf.ByteString getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique and stable id of the service account.
     * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
     * </pre>
     *
     * <code>string unique_id = 2;</code>
     *
     * @param value The uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uniqueId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique and stable id of the service account.
     * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
     * </pre>
     *
     * <code>string unique_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUniqueId() {
      uniqueId_ = getDefaultInstance().getUniqueId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique and stable id of the service account.
     * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount
     * </pre>
     *
     * <code>string unique_id = 2;</code>
     *
     * @param value The bytes for uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uniqueId_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.ServiceIdentity)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.ServiceIdentity)
  private static final com.google.api.serviceusage.v1beta1.ServiceIdentity DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.ServiceIdentity();
  }

  public static com.google.api.serviceusage.v1beta1.ServiceIdentity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceIdentity> PARSER =
      new com.google.protobuf.AbstractParser<ServiceIdentity>() {
        @java.lang.Override
        public ServiceIdentity parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceIdentity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceIdentity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ServiceIdentity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
