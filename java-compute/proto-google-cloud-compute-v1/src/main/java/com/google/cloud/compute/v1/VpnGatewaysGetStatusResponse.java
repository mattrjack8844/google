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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.VpnGatewaysGetStatusResponse}
 */
public final class VpnGatewaysGetStatusResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.VpnGatewaysGetStatusResponse)
    VpnGatewaysGetStatusResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VpnGatewaysGetStatusResponse.newBuilder() to construct.
  private VpnGatewaysGetStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VpnGatewaysGetStatusResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VpnGatewaysGetStatusResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VpnGatewaysGetStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VpnGatewaysGetStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.class,
            com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 139315229;
  private com.google.cloud.compute.v1.VpnGatewayStatus result_;
  /**
   * <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code>
   *
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code>
   *
   * @return The result.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatus getResult() {
    return result_ == null
        ? com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()
        : result_;
  }
  /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder getResultOrBuilder() {
    return result_ == null
        ? com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()
        : result_;
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
      output.writeMessage(139315229, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(139315229, getResult());
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
    if (!(obj instanceof com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse other =
        (com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult().equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse parseFrom(
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
      com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.VpnGatewaysGetStatusResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.VpnGatewaysGetStatusResponse)
      com.google.cloud.compute.v1.VpnGatewaysGetStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnGatewaysGetStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnGatewaysGetStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.class,
              com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResultFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnGatewaysGetStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse build() {
      com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse buildPartial() {
      com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse result =
          new com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null ? result_ : resultBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse) {
        return mergeFrom((com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse other) {
      if (other == com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse.getDefaultInstance())
        return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
            case 1114521834:
              {
                input.readMessage(getResultFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 1114521834
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

    private com.google.cloud.compute.v1.VpnGatewayStatus result_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.VpnGatewayStatus,
            com.google.cloud.compute.v1.VpnGatewayStatus.Builder,
            com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder>
        resultBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code>
     *
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code>
     *
     * @return The result.
     */
    public com.google.cloud.compute.v1.VpnGatewayStatus getResult() {
      if (resultBuilder_ == null) {
        return result_ == null
            ? com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()
            : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public Builder setResult(com.google.cloud.compute.v1.VpnGatewayStatus value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public Builder setResult(com.google.cloud.compute.v1.VpnGatewayStatus.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public Builder mergeResult(com.google.cloud.compute.v1.VpnGatewayStatus value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && result_ != null
            && result_ != com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public com.google.cloud.compute.v1.VpnGatewayStatus.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    public com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null
            ? com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()
            : result_;
      }
    }
    /** <code>optional .google.cloud.compute.v1.VpnGatewayStatus result = 139315229;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.VpnGatewayStatus,
            com.google.cloud.compute.v1.VpnGatewayStatus.Builder,
            com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder>
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.VpnGatewayStatus,
                com.google.cloud.compute.v1.VpnGatewayStatus.Builder,
                com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder>(
                getResult(), getParentForChildren(), isClean());
        result_ = null;
      }
      return resultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.VpnGatewaysGetStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.VpnGatewaysGetStatusResponse)
  private static final com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse();
  }

  public static com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpnGatewaysGetStatusResponse> PARSER =
      new com.google.protobuf.AbstractParser<VpnGatewaysGetStatusResponse>() {
        @java.lang.Override
        public VpnGatewaysGetStatusResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<VpnGatewaysGetStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpnGatewaysGetStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewaysGetStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
