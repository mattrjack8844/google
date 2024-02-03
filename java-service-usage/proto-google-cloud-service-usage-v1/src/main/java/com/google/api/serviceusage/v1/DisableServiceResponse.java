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
// source: google/api/serviceusage/v1/serviceusage.proto

// Protobuf Java Version: 3.25.2
package com.google.api.serviceusage.v1;

/**
 *
 *
 * <pre>
 * Response message for the `DisableService` method.
 * This response message is assigned to the `response` field of the returned
 * Operation when that operation is done.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1.DisableServiceResponse}
 */
public final class DisableServiceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1.DisableServiceResponse)
    DisableServiceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DisableServiceResponse.newBuilder() to construct.
  private DisableServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DisableServiceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DisableServiceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1_DisableServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1_DisableServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1.DisableServiceResponse.class,
            com.google.api.serviceusage.v1.DisableServiceResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_FIELD_NUMBER = 1;
  private com.google.api.serviceusage.v1.Service service_;
  /**
   *
   *
   * <pre>
   * The new state of the service after disabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1;</code>
   *
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The new state of the service after disabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1.Service getService() {
    return service_ == null
        ? com.google.api.serviceusage.v1.Service.getDefaultInstance()
        : service_;
  }
  /**
   *
   *
   * <pre>
   * The new state of the service after disabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1.ServiceOrBuilder getServiceOrBuilder() {
    return service_ == null
        ? com.google.api.serviceusage.v1.Service.getDefaultInstance()
        : service_;
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
      output.writeMessage(1, getService());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getService());
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
    if (!(obj instanceof com.google.api.serviceusage.v1.DisableServiceResponse)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1.DisableServiceResponse other =
        (com.google.api.serviceusage.v1.DisableServiceResponse) obj;

    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService().equals(other.getService())) return false;
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
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse parseFrom(
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
      com.google.api.serviceusage.v1.DisableServiceResponse prototype) {
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
   * Response message for the `DisableService` method.
   * This response message is assigned to the `response` field of the returned
   * Operation when that operation is done.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1.DisableServiceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1.DisableServiceResponse)
      com.google.api.serviceusage.v1.DisableServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1.DisableServiceResponse.class,
              com.google.api.serviceusage.v1.DisableServiceResponse.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1.DisableServiceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceResponse getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1.DisableServiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceResponse build() {
      com.google.api.serviceusage.v1.DisableServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceResponse buildPartial() {
      com.google.api.serviceusage.v1.DisableServiceResponse result =
          new com.google.api.serviceusage.v1.DisableServiceResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.serviceusage.v1.DisableServiceResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.service_ = serviceBuilder_ == null ? service_ : serviceBuilder_.build();
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
      if (other instanceof com.google.api.serviceusage.v1.DisableServiceResponse) {
        return mergeFrom((com.google.api.serviceusage.v1.DisableServiceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1.DisableServiceResponse other) {
      if (other == com.google.api.serviceusage.v1.DisableServiceResponse.getDefaultInstance())
        return this;
      if (other.hasService()) {
        mergeService(other.getService());
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
                input.readMessage(getServiceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.api.serviceusage.v1.Service service_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.serviceusage.v1.Service,
            com.google.api.serviceusage.v1.Service.Builder,
            com.google.api.serviceusage.v1.ServiceOrBuilder>
        serviceBuilder_;
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     *
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     *
     * @return The service.
     */
    public com.google.api.serviceusage.v1.Service getService() {
      if (serviceBuilder_ == null) {
        return service_ == null
            ? com.google.api.serviceusage.v1.Service.getDefaultInstance()
            : service_;
      } else {
        return serviceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public Builder setService(com.google.api.serviceusage.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        service_ = value;
      } else {
        serviceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public Builder setService(com.google.api.serviceusage.v1.Service.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        service_ = builderForValue.build();
      } else {
        serviceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public Builder mergeService(com.google.api.serviceusage.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && service_ != null
            && service_ != com.google.api.serviceusage.v1.Service.getDefaultInstance()) {
          getServiceBuilder().mergeFrom(value);
        } else {
          service_ = value;
        }
      } else {
        serviceBuilder_.mergeFrom(value);
      }
      if (service_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public Builder clearService() {
      bitField0_ = (bitField0_ & ~0x00000001);
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public com.google.api.serviceusage.v1.Service.Builder getServiceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    public com.google.api.serviceusage.v1.ServiceOrBuilder getServiceOrBuilder() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilder();
      } else {
        return service_ == null
            ? com.google.api.serviceusage.v1.Service.getDefaultInstance()
            : service_;
      }
    }
    /**
     *
     *
     * <pre>
     * The new state of the service after disabling.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.Service service = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.serviceusage.v1.Service,
            com.google.api.serviceusage.v1.Service.Builder,
            com.google.api.serviceusage.v1.ServiceOrBuilder>
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.serviceusage.v1.Service,
                com.google.api.serviceusage.v1.Service.Builder,
                com.google.api.serviceusage.v1.ServiceOrBuilder>(
                getService(), getParentForChildren(), isClean());
        service_ = null;
      }
      return serviceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1.DisableServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1.DisableServiceResponse)
  private static final com.google.api.serviceusage.v1.DisableServiceResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1.DisableServiceResponse();
  }

  public static com.google.api.serviceusage.v1.DisableServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisableServiceResponse> PARSER =
      new com.google.protobuf.AbstractParser<DisableServiceResponse>() {
        @java.lang.Override
        public DisableServiceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisableServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisableServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1.DisableServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
