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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Request message for [CloudChannelService.CreateCustomer][google.cloud.channel.v1.CloudChannelService.CreateCustomer]
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CreateCustomerRequest}
 */
public final class CreateCustomerRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CreateCustomerRequest)
    CreateCustomerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCustomerRequest.newBuilder() to construct.
  private CreateCustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCustomerRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCustomerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateCustomerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateCustomerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CreateCustomerRequest.class,
            com.google.cloud.channel.v1.CreateCustomerRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of reseller account in which to create the customer.
   * Parent uses the format: accounts/{account_id}
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
   * Required. The resource name of reseller account in which to create the customer.
   * Parent uses the format: accounts/{account_id}
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

  public static final int CUSTOMER_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.Customer customer_;
  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customer field is set.
   */
  @java.lang.Override
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customer.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Customer getCustomer() {
    return customer_ == null
        ? com.google.cloud.channel.v1.Customer.getDefaultInstance()
        : customer_;
  }
  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerOrBuilder getCustomerOrBuilder() {
    return getCustomer();
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
    if (customer_ != null) {
      output.writeMessage(2, getCustomer());
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
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCustomer());
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
    if (!(obj instanceof com.google.cloud.channel.v1.CreateCustomerRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CreateCustomerRequest other =
        (com.google.cloud.channel.v1.CreateCustomerRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCustomer() != other.hasCustomer()) return false;
    if (hasCustomer()) {
      if (!getCustomer().equals(other.getCustomer())) return false;
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
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.CreateCustomerRequest prototype) {
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
   * Request message for [CloudChannelService.CreateCustomer][google.cloud.channel.v1.CloudChannelService.CreateCustomer]
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CreateCustomerRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CreateCustomerRequest)
      com.google.cloud.channel.v1.CreateCustomerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CreateCustomerRequest.class,
              com.google.cloud.channel.v1.CreateCustomerRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.CreateCustomerRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRequest getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CreateCustomerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRequest build() {
      com.google.cloud.channel.v1.CreateCustomerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRequest buildPartial() {
      com.google.cloud.channel.v1.CreateCustomerRequest result =
          new com.google.cloud.channel.v1.CreateCustomerRequest(this);
      result.parent_ = parent_;
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.channel.v1.CreateCustomerRequest) {
        return mergeFrom((com.google.cloud.channel.v1.CreateCustomerRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.CreateCustomerRequest other) {
      if (other == com.google.cloud.channel.v1.CreateCustomerRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
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
                input.readMessage(getCustomerFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of reseller account in which to create the customer.
     * Parent uses the format: accounts/{account_id}
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
     * Required. The resource name of reseller account in which to create the customer.
     * Parent uses the format: accounts/{account_id}
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
     * Required. The resource name of reseller account in which to create the customer.
     * Parent uses the format: accounts/{account_id}
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of reseller account in which to create the customer.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of reseller account in which to create the customer.
     * Parent uses the format: accounts/{account_id}
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
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.Customer customer_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Customer,
            com.google.cloud.channel.v1.Customer.Builder,
            com.google.cloud.channel.v1.CustomerOrBuilder>
        customerBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The customer.
     */
    public com.google.cloud.channel.v1.Customer getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null
            ? com.google.cloud.channel.v1.Customer.getDefaultInstance()
            : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomer(com.google.cloud.channel.v1.Customer value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomer(com.google.cloud.channel.v1.Customer.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCustomer(com.google.cloud.channel.v1.Customer value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
              com.google.cloud.channel.v1.Customer.newBuilder(customer_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.Customer.Builder getCustomerBuilder() {

      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.CustomerOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null
            ? com.google.cloud.channel.v1.Customer.getDefaultInstance()
            : customer_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The customer to create.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Customer,
            com.google.cloud.channel.v1.Customer.Builder,
            com.google.cloud.channel.v1.CustomerOrBuilder>
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.Customer,
                com.google.cloud.channel.v1.Customer.Builder,
                com.google.cloud.channel.v1.CustomerOrBuilder>(
                getCustomer(), getParentForChildren(), isClean());
        customer_ = null;
      }
      return customerBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CreateCustomerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CreateCustomerRequest)
  private static final com.google.cloud.channel.v1.CreateCustomerRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CreateCustomerRequest();
  }

  public static com.google.cloud.channel.v1.CreateCustomerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomerRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCustomerRequest>() {
        @java.lang.Override
        public CreateCustomerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CreateCustomerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
