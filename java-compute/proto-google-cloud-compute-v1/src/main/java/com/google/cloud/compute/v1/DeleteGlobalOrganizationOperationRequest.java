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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A request message for GlobalOrganizationOperations.Delete. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest}
 */
public final class DeleteGlobalOrganizationOperationRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)
    DeleteGlobalOrganizationOperationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteGlobalOrganizationOperationRequest.newBuilder() to construct.
  private DeleteGlobalOrganizationOperationRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteGlobalOrganizationOperationRequest() {
    operation_ = "";
    parentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteGlobalOrganizationOperationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DeleteGlobalOrganizationOperationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DeleteGlobalOrganizationOperationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest.class,
            com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATION_FIELD_NUMBER = 52090215;

  @SuppressWarnings("serial")
  private volatile java.lang.Object operation_ = "";
  /**
   *
   *
   * <pre>
   * Name of the Operations resource to delete.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The operation.
   */
  @java.lang.Override
  public java.lang.String getOperation() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the Operations resource to delete.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for operation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOperationBytes() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      operation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_ID_FIELD_NUMBER = 459714768;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parentId_ = "";
  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>optional string parent_id = 459714768;</code>
   *
   * @return Whether the parentId field is set.
   */
  @java.lang.Override
  public boolean hasParentId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>optional string parent_id = 459714768;</code>
   *
   * @return The parentId.
   */
  @java.lang.Override
  public java.lang.String getParentId() {
    java.lang.Object ref = parentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>optional string parent_id = 459714768;</code>
   *
   * @return The bytes for parentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentIdBytes() {
    java.lang.Object ref = parentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 52090215, operation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 459714768, parentId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(52090215, operation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(459714768, parentId_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest other =
        (com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest) obj;

    if (!getOperation().equals(other.getOperation())) return false;
    if (hasParentId() != other.hasParentId()) return false;
    if (hasParentId()) {
      if (!getParentId().equals(other.getParentId())) return false;
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
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getOperation().hashCode();
    if (hasParentId()) {
      hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest parseFrom(
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
      com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest prototype) {
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
   * A request message for GlobalOrganizationOperations.Delete. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)
      com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DeleteGlobalOrganizationOperationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DeleteGlobalOrganizationOperationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest.class,
              com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      operation_ = "";
      parentId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DeleteGlobalOrganizationOperationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest build() {
      com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest buildPartial() {
      com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest result =
          new com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operation_ = operation_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentId_ = parentId_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest other) {
      if (other
          == com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
              .getDefaultInstance()) return this;
      if (!other.getOperation().isEmpty()) {
        operation_ = other.operation_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasParentId()) {
        parentId_ = other.parentId_;
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
            case 416721722:
              {
                operation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 416721722
            case -617249150:
              {
                parentId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -617249150
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

    private java.lang.Object operation_ = "";
    /**
     *
     *
     * <pre>
     * Name of the Operations resource to delete.
     * </pre>
     *
     * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The operation.
     */
    public java.lang.String getOperation() {
      java.lang.Object ref = operation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Operations resource to delete.
     * </pre>
     *
     * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for operation.
     */
    public com.google.protobuf.ByteString getOperationBytes() {
      java.lang.Object ref = operation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Operations resource to delete.
     * </pre>
     *
     * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      operation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Operations resource to delete.
     * </pre>
     *
     * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      operation_ = getDefaultInstance().getOperation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Operations resource to delete.
     * </pre>
     *
     * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      operation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object parentId_ = "";
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @return Whether the parentId field is set.
     */
    public boolean hasParentId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @return The parentId.
     */
    public java.lang.String getParentId() {
      java.lang.Object ref = parentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @return The bytes for parentId.
     */
    public com.google.protobuf.ByteString getParentIdBytes() {
      java.lang.Object ref = parentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @param value The parentId to set.
     * @return This builder for chaining.
     */
    public Builder setParentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParentId() {
      parentId_ = getDefaultInstance().getParentId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Parent ID for this request.
     * </pre>
     *
     * <code>optional string parent_id = 459714768;</code>
     *
     * @param value The bytes for parentId to set.
     * @return This builder for chaining.
     */
    public Builder setParentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parentId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)
  private static final com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest();
  }

  public static com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteGlobalOrganizationOperationRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteGlobalOrganizationOperationRequest>() {
        @java.lang.Override
        public DeleteGlobalOrganizationOperationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteGlobalOrganizationOperationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteGlobalOrganizationOperationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
