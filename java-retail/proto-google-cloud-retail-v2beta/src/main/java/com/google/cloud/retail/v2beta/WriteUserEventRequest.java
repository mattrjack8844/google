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
// source: google/cloud/retail/v2beta/user_event_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Request message for WriteUserEvent method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.WriteUserEventRequest}
 */
public final class WriteUserEventRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.WriteUserEventRequest)
    WriteUserEventRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WriteUserEventRequest.newBuilder() to construct.
  private WriteUserEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WriteUserEventRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WriteUserEventRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.UserEventServiceProto
        .internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.UserEventServiceProto
        .internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.WriteUserEventRequest.class,
            com.google.cloud.retail.v2beta.WriteUserEventRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int USER_EVENT_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2beta.UserEvent userEvent_;
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEvent field is set.
   */
  @java.lang.Override
  public boolean hasUserEvent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEvent.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.UserEvent getUserEvent() {
    return userEvent_ == null
        ? com.google.cloud.retail.v2beta.UserEvent.getDefaultInstance()
        : userEvent_;
  }
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.UserEventOrBuilder getUserEventOrBuilder() {
    return userEvent_ == null
        ? com.google.cloud.retail.v2beta.UserEvent.getDefaultInstance()
        : userEvent_;
  }

  public static final int WRITE_ASYNC_FIELD_NUMBER = 3;
  private boolean writeAsync_ = false;
  /**
   *
   *
   * <pre>
   * If set to true, the user event will be written asynchronously after
   * validation, and the API will respond without waiting for the write.
   * Therefore, silent failures can occur even if the API returns success. In
   * case of silent failures, error messages can be found in Stackdriver logs.
   * </pre>
   *
   * <code>bool write_async = 3;</code>
   *
   * @return The writeAsync.
   */
  @java.lang.Override
  public boolean getWriteAsync() {
    return writeAsync_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getUserEvent());
    }
    if (writeAsync_ != false) {
      output.writeBool(3, writeAsync_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUserEvent());
    }
    if (writeAsync_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, writeAsync_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.WriteUserEventRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.WriteUserEventRequest other =
        (com.google.cloud.retail.v2beta.WriteUserEventRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasUserEvent() != other.hasUserEvent()) return false;
    if (hasUserEvent()) {
      if (!getUserEvent().equals(other.getUserEvent())) return false;
    }
    if (getWriteAsync() != other.getWriteAsync()) return false;
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
    if (hasUserEvent()) {
      hash = (37 * hash) + USER_EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getUserEvent().hashCode();
    }
    hash = (37 * hash) + WRITE_ASYNC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getWriteAsync());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2beta.WriteUserEventRequest prototype) {
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
   * Request message for WriteUserEvent method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.WriteUserEventRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.WriteUserEventRequest)
      com.google.cloud.retail.v2beta.WriteUserEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto
          .internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto
          .internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.WriteUserEventRequest.class,
              com.google.cloud.retail.v2beta.WriteUserEventRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.WriteUserEventRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserEventFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      userEvent_ = null;
      if (userEventBuilder_ != null) {
        userEventBuilder_.dispose();
        userEventBuilder_ = null;
      }
      writeAsync_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.UserEventServiceProto
          .internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.WriteUserEventRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.WriteUserEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.WriteUserEventRequest build() {
      com.google.cloud.retail.v2beta.WriteUserEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.WriteUserEventRequest buildPartial() {
      com.google.cloud.retail.v2beta.WriteUserEventRequest result =
          new com.google.cloud.retail.v2beta.WriteUserEventRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2beta.WriteUserEventRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userEvent_ = userEventBuilder_ == null ? userEvent_ : userEventBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.writeAsync_ = writeAsync_;
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
      if (other instanceof com.google.cloud.retail.v2beta.WriteUserEventRequest) {
        return mergeFrom((com.google.cloud.retail.v2beta.WriteUserEventRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.WriteUserEventRequest other) {
      if (other == com.google.cloud.retail.v2beta.WriteUserEventRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUserEvent()) {
        mergeUserEvent(other.getUserEvent());
      }
      if (other.getWriteAsync() != false) {
        setWriteAsync(other.getWriteAsync());
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
                input.readMessage(getUserEventFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                writeAsync_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.retail.v2beta.UserEvent userEvent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.UserEvent,
            com.google.cloud.retail.v2beta.UserEvent.Builder,
            com.google.cloud.retail.v2beta.UserEventOrBuilder>
        userEventBuilder_;
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the userEvent field is set.
     */
    public boolean hasUserEvent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The userEvent.
     */
    public com.google.cloud.retail.v2beta.UserEvent getUserEvent() {
      if (userEventBuilder_ == null) {
        return userEvent_ == null
            ? com.google.cloud.retail.v2beta.UserEvent.getDefaultInstance()
            : userEvent_;
      } else {
        return userEventBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserEvent(com.google.cloud.retail.v2beta.UserEvent value) {
      if (userEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userEvent_ = value;
      } else {
        userEventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserEvent(com.google.cloud.retail.v2beta.UserEvent.Builder builderForValue) {
      if (userEventBuilder_ == null) {
        userEvent_ = builderForValue.build();
      } else {
        userEventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUserEvent(com.google.cloud.retail.v2beta.UserEvent value) {
      if (userEventBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && userEvent_ != null
            && userEvent_ != com.google.cloud.retail.v2beta.UserEvent.getDefaultInstance()) {
          getUserEventBuilder().mergeFrom(value);
        } else {
          userEvent_ = value;
        }
      } else {
        userEventBuilder_.mergeFrom(value);
      }
      if (userEvent_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUserEvent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userEvent_ = null;
      if (userEventBuilder_ != null) {
        userEventBuilder_.dispose();
        userEventBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.UserEvent.Builder getUserEventBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserEventFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.UserEventOrBuilder getUserEventOrBuilder() {
      if (userEventBuilder_ != null) {
        return userEventBuilder_.getMessageOrBuilder();
      } else {
        return userEvent_ == null
            ? com.google.cloud.retail.v2beta.UserEvent.getDefaultInstance()
            : userEvent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User event to write.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.UserEvent,
            com.google.cloud.retail.v2beta.UserEvent.Builder,
            com.google.cloud.retail.v2beta.UserEventOrBuilder>
        getUserEventFieldBuilder() {
      if (userEventBuilder_ == null) {
        userEventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2beta.UserEvent,
                com.google.cloud.retail.v2beta.UserEvent.Builder,
                com.google.cloud.retail.v2beta.UserEventOrBuilder>(
                getUserEvent(), getParentForChildren(), isClean());
        userEvent_ = null;
      }
      return userEventBuilder_;
    }

    private boolean writeAsync_;
    /**
     *
     *
     * <pre>
     * If set to true, the user event will be written asynchronously after
     * validation, and the API will respond without waiting for the write.
     * Therefore, silent failures can occur even if the API returns success. In
     * case of silent failures, error messages can be found in Stackdriver logs.
     * </pre>
     *
     * <code>bool write_async = 3;</code>
     *
     * @return The writeAsync.
     */
    @java.lang.Override
    public boolean getWriteAsync() {
      return writeAsync_;
    }
    /**
     *
     *
     * <pre>
     * If set to true, the user event will be written asynchronously after
     * validation, and the API will respond without waiting for the write.
     * Therefore, silent failures can occur even if the API returns success. In
     * case of silent failures, error messages can be found in Stackdriver logs.
     * </pre>
     *
     * <code>bool write_async = 3;</code>
     *
     * @param value The writeAsync to set.
     * @return This builder for chaining.
     */
    public Builder setWriteAsync(boolean value) {

      writeAsync_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, the user event will be written asynchronously after
     * validation, and the API will respond without waiting for the write.
     * Therefore, silent failures can occur even if the API returns success. In
     * case of silent failures, error messages can be found in Stackdriver logs.
     * </pre>
     *
     * <code>bool write_async = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWriteAsync() {
      bitField0_ = (bitField0_ & ~0x00000004);
      writeAsync_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.WriteUserEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.WriteUserEventRequest)
  private static final com.google.cloud.retail.v2beta.WriteUserEventRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.WriteUserEventRequest();
  }

  public static com.google.cloud.retail.v2beta.WriteUserEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteUserEventRequest> PARSER =
      new com.google.protobuf.AbstractParser<WriteUserEventRequest>() {
        @java.lang.Override
        public WriteUserEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteUserEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteUserEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.WriteUserEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
