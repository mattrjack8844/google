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
// source: google/cloud/contentwarehouse/v1/document_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Response message for DocumentService.SetAcl.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.SetAclResponse}
 */
public final class SetAclResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.SetAclResponse)
    SetAclResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetAclResponse.newBuilder() to construct.
  private SetAclResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetAclResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetAclResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_SetAclResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_SetAclResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.SetAclResponse.class,
            com.google.cloud.contentwarehouse.v1.SetAclResponse.Builder.class);
  }

  private int bitField0_;
  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.iam.v1.Policy policy_;
  /**
   *
   *
   * <pre>
   * The policy will be attached to a resource (e.g. projecct, document).
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The policy will be attached to a resource (e.g. projecct, document).
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.iam.v1.Policy getPolicy() {
    return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
  }
  /**
   *
   *
   * <pre>
   * The policy will be attached to a resource (e.g. projecct, document).
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.contentwarehouse.v1.ResponseMetadata metadata_;
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ResponseMetadata getMetadata() {
    return metadata_ == null
        ? com.google.cloud.contentwarehouse.v1.ResponseMetadata.getDefaultInstance()
        : metadata_;
  }
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null
        ? com.google.cloud.contentwarehouse.v1.ResponseMetadata.getDefaultInstance()
        : metadata_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPolicy());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPolicy());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.SetAclResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.SetAclResponse other =
        (com.google.cloud.contentwarehouse.v1.SetAclResponse) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata().equals(other.getMetadata())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.SetAclResponse prototype) {
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
   * Response message for DocumentService.SetAcl.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.SetAclResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.SetAclResponse)
      com.google.cloud.contentwarehouse.v1.SetAclResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_SetAclResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_SetAclResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.SetAclResponse.class,
              com.google.cloud.contentwarehouse.v1.SetAclResponse.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.SetAclResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPolicyFieldBuilder();
        getMetadataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_SetAclResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.SetAclResponse getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.SetAclResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.SetAclResponse build() {
      com.google.cloud.contentwarehouse.v1.SetAclResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.SetAclResponse buildPartial() {
      com.google.cloud.contentwarehouse.v1.SetAclResponse result =
          new com.google.cloud.contentwarehouse.v1.SetAclResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.SetAclResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policy_ = policyBuilder_ == null ? policy_ : policyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null ? metadata_ : metadataBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.SetAclResponse) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.SetAclResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.SetAclResponse other) {
      if (other == com.google.cloud.contentwarehouse.v1.SetAclResponse.getDefaultInstance())
        return this;
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
                input.readMessage(getPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMetadataFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.iam.v1.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     *
     * @return The policy.
     */
    public com.google.iam.v1.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder mergePolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && policy_ != null
            && policy_ != com.google.iam.v1.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      if (policy_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public com.google.iam.v1.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * The policy will be attached to a resource (e.g. projecct, document).
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v1.Policy,
                com.google.iam.v1.Policy.Builder,
                com.google.iam.v1.PolicyOrBuilder>(getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
    }

    private com.google.cloud.contentwarehouse.v1.ResponseMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.ResponseMetadata,
            com.google.cloud.contentwarehouse.v1.ResponseMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder>
        metadataBuilder_;
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     *
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     *
     * @return The metadata.
     */
    public com.google.cloud.contentwarehouse.v1.ResponseMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null
            ? com.google.cloud.contentwarehouse.v1.ResponseMetadata.getDefaultInstance()
            : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public Builder setMetadata(com.google.cloud.contentwarehouse.v1.ResponseMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public Builder setMetadata(
        com.google.cloud.contentwarehouse.v1.ResponseMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public Builder mergeMetadata(com.google.cloud.contentwarehouse.v1.ResponseMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && metadata_ != null
            && metadata_
                != com.google.cloud.contentwarehouse.v1.ResponseMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ResponseMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null
            ? com.google.cloud.contentwarehouse.v1.ResponseMetadata.getDefaultInstance()
            : metadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Additional information for the API invocation, such as the request tracking
     * id.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.ResponseMetadata,
            com.google.cloud.contentwarehouse.v1.ResponseMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder>
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.ResponseMetadata,
                com.google.cloud.contentwarehouse.v1.ResponseMetadata.Builder,
                com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder>(
                getMetadata(), getParentForChildren(), isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.SetAclResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.SetAclResponse)
  private static final com.google.cloud.contentwarehouse.v1.SetAclResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.SetAclResponse();
  }

  public static com.google.cloud.contentwarehouse.v1.SetAclResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAclResponse> PARSER =
      new com.google.protobuf.AbstractParser<SetAclResponse>() {
        @java.lang.Override
        public SetAclResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetAclResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAclResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.SetAclResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
