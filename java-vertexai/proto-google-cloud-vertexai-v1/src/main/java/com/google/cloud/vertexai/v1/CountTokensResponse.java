/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vertexai/v1/prediction_service.proto

package com.google.cloud.vertexai.v1;

/**
 *
 *
 * <pre>
 * Response message for [PredictionService.CountTokens][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1.CountTokensResponse}
 */
public final class CountTokensResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1.CountTokensResponse)
    CountTokensResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CountTokensResponse.newBuilder() to construct.
  private CountTokensResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CountTokensResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CountTokensResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.v1.PredictionServiceProto
        .internal_static_google_cloud_vertexai_v1_CountTokensResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.v1.PredictionServiceProto
        .internal_static_google_cloud_vertexai_v1_CountTokensResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.v1.CountTokensResponse.class,
            com.google.cloud.vertexai.v1.CountTokensResponse.Builder.class);
  }

  public static final int TOTAL_TOKENS_FIELD_NUMBER = 1;
  private int totalTokens_ = 0;
  /**
   *
   *
   * <pre>
   * The total number of tokens counted across all instances from the request.
   * </pre>
   *
   * <code>int32 total_tokens = 1;</code>
   *
   * @return The totalTokens.
   */
  @java.lang.Override
  public int getTotalTokens() {
    return totalTokens_;
  }

  public static final int TOTAL_BILLABLE_CHARACTERS_FIELD_NUMBER = 2;
  private int totalBillableCharacters_ = 0;
  /**
   *
   *
   * <pre>
   * The total number of billable characters counted across all instances from
   * the request.
   * </pre>
   *
   * <code>int32 total_billable_characters = 2;</code>
   *
   * @return The totalBillableCharacters.
   */
  @java.lang.Override
  public int getTotalBillableCharacters() {
    return totalBillableCharacters_;
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
    if (totalTokens_ != 0) {
      output.writeInt32(1, totalTokens_);
    }
    if (totalBillableCharacters_ != 0) {
      output.writeInt32(2, totalBillableCharacters_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalTokens_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, totalTokens_);
    }
    if (totalBillableCharacters_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, totalBillableCharacters_);
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
    if (!(obj instanceof com.google.cloud.vertexai.v1.CountTokensResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.v1.CountTokensResponse other =
        (com.google.cloud.vertexai.v1.CountTokensResponse) obj;

    if (getTotalTokens() != other.getTotalTokens()) return false;
    if (getTotalBillableCharacters() != other.getTotalBillableCharacters()) return false;
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
    hash = (37 * hash) + TOTAL_TOKENS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalTokens();
    hash = (37 * hash) + TOTAL_BILLABLE_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalBillableCharacters();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.v1.CountTokensResponse prototype) {
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
   * Response message for [PredictionService.CountTokens][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1.CountTokensResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1.CountTokensResponse)
      com.google.cloud.vertexai.v1.CountTokensResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.v1.PredictionServiceProto
          .internal_static_google_cloud_vertexai_v1_CountTokensResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.v1.PredictionServiceProto
          .internal_static_google_cloud_vertexai_v1_CountTokensResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.v1.CountTokensResponse.class,
              com.google.cloud.vertexai.v1.CountTokensResponse.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.v1.CountTokensResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      totalTokens_ = 0;
      totalBillableCharacters_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.v1.PredictionServiceProto
          .internal_static_google_cloud_vertexai_v1_CountTokensResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.v1.CountTokensResponse getDefaultInstanceForType() {
      return com.google.cloud.vertexai.v1.CountTokensResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.v1.CountTokensResponse build() {
      com.google.cloud.vertexai.v1.CountTokensResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.v1.CountTokensResponse buildPartial() {
      com.google.cloud.vertexai.v1.CountTokensResponse result =
          new com.google.cloud.vertexai.v1.CountTokensResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vertexai.v1.CountTokensResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalTokens_ = totalTokens_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalBillableCharacters_ = totalBillableCharacters_;
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
      if (other instanceof com.google.cloud.vertexai.v1.CountTokensResponse) {
        return mergeFrom((com.google.cloud.vertexai.v1.CountTokensResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.v1.CountTokensResponse other) {
      if (other == com.google.cloud.vertexai.v1.CountTokensResponse.getDefaultInstance())
        return this;
      if (other.getTotalTokens() != 0) {
        setTotalTokens(other.getTotalTokens());
      }
      if (other.getTotalBillableCharacters() != 0) {
        setTotalBillableCharacters(other.getTotalBillableCharacters());
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
            case 8:
              {
                totalTokens_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                totalBillableCharacters_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int totalTokens_;
    /**
     *
     *
     * <pre>
     * The total number of tokens counted across all instances from the request.
     * </pre>
     *
     * <code>int32 total_tokens = 1;</code>
     *
     * @return The totalTokens.
     */
    @java.lang.Override
    public int getTotalTokens() {
      return totalTokens_;
    }
    /**
     *
     *
     * <pre>
     * The total number of tokens counted across all instances from the request.
     * </pre>
     *
     * <code>int32 total_tokens = 1;</code>
     *
     * @param value The totalTokens to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTokens(int value) {

      totalTokens_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of tokens counted across all instances from the request.
     * </pre>
     *
     * <code>int32 total_tokens = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalTokens() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalTokens_ = 0;
      onChanged();
      return this;
    }

    private int totalBillableCharacters_;
    /**
     *
     *
     * <pre>
     * The total number of billable characters counted across all instances from
     * the request.
     * </pre>
     *
     * <code>int32 total_billable_characters = 2;</code>
     *
     * @return The totalBillableCharacters.
     */
    @java.lang.Override
    public int getTotalBillableCharacters() {
      return totalBillableCharacters_;
    }
    /**
     *
     *
     * <pre>
     * The total number of billable characters counted across all instances from
     * the request.
     * </pre>
     *
     * <code>int32 total_billable_characters = 2;</code>
     *
     * @param value The totalBillableCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBillableCharacters(int value) {

      totalBillableCharacters_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of billable characters counted across all instances from
     * the request.
     * </pre>
     *
     * <code>int32 total_billable_characters = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalBillableCharacters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalBillableCharacters_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1.CountTokensResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1.CountTokensResponse)
  private static final com.google.cloud.vertexai.v1.CountTokensResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.v1.CountTokensResponse();
  }

  public static com.google.cloud.vertexai.v1.CountTokensResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountTokensResponse> PARSER =
      new com.google.protobuf.AbstractParser<CountTokensResponse>() {
        @java.lang.Override
        public CountTokensResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CountTokensResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountTokensResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.v1.CountTokensResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
