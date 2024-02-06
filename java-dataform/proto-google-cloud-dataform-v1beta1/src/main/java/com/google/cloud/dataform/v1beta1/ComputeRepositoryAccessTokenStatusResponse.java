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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * `ComputeRepositoryAccessTokenStatus` response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse}
 */
public final class ComputeRepositoryAccessTokenStatusResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse)
    ComputeRepositoryAccessTokenStatusResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputeRepositoryAccessTokenStatusResponse.newBuilder() to construct.
  private ComputeRepositoryAccessTokenStatusResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeRepositoryAccessTokenStatusResponse() {
    tokenStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeRepositoryAccessTokenStatusResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_ComputeRepositoryAccessTokenStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_ComputeRepositoryAccessTokenStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.class,
            com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.Builder
                .class);
  }

  /**
   *
   *
   * <pre>
   * Indicates the status of a Git authentication token.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus}
   */
  public enum TokenStatus implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>TOKEN_STATUS_UNSPECIFIED = 0;</code>
     */
    TOKEN_STATUS_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The token could not be found in Secret Manager (or the Dataform
     * Service Account did not have permission to access it).
     * </pre>
     *
     * <code>NOT_FOUND = 1;</code>
     */
    NOT_FOUND(1),
    /**
     *
     *
     * <pre>
     * The token could not be used to authenticate against the Git remote.
     * </pre>
     *
     * <code>INVALID = 2;</code>
     */
    INVALID(2),
    /**
     *
     *
     * <pre>
     * The token was used successfully to authenticate against the Git remote.
     * </pre>
     *
     * <code>VALID = 3;</code>
     */
    VALID(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>TOKEN_STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int TOKEN_STATUS_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The token could not be found in Secret Manager (or the Dataform
     * Service Account did not have permission to access it).
     * </pre>
     *
     * <code>NOT_FOUND = 1;</code>
     */
    public static final int NOT_FOUND_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The token could not be used to authenticate against the Git remote.
     * </pre>
     *
     * <code>INVALID = 2;</code>
     */
    public static final int INVALID_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The token was used successfully to authenticate against the Git remote.
     * </pre>
     *
     * <code>VALID = 3;</code>
     */
    public static final int VALID_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TokenStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TokenStatus forNumber(int value) {
      switch (value) {
        case 0:
          return TOKEN_STATUS_UNSPECIFIED;
        case 1:
          return NOT_FOUND;
        case 2:
          return INVALID;
        case 3:
          return VALID;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TokenStatus> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TokenStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TokenStatus>() {
          public TokenStatus findValueByNumber(int number) {
            return TokenStatus.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
          .getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final TokenStatus[] VALUES = values();

    public static TokenStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TokenStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus)
  }

  public static final int TOKEN_STATUS_FIELD_NUMBER = 1;
  private int tokenStatus_ = 0;
  /**
   *
   *
   * <pre>
   * Indicates the status of the Git access token.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for tokenStatus.
   */
  @java.lang.Override
  public int getTokenStatusValue() {
    return tokenStatus_;
  }
  /**
   *
   *
   * <pre>
   * Indicates the status of the Git access token.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
   * </code>
   *
   * @return The tokenStatus.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
      getTokenStatus() {
    com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
        result =
            com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
                .forNumber(tokenStatus_);
    return result == null
        ? com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
            .UNRECOGNIZED
        : result;
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
    if (tokenStatus_
        != com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
            .TOKEN_STATUS_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, tokenStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokenStatus_
        != com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
            .TOKEN_STATUS_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, tokenStatus_);
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
    if (!(obj
        instanceof com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse other =
        (com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse) obj;

    if (tokenStatus_ != other.tokenStatus_) return false;
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
    hash = (37 * hash) + TOKEN_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + tokenStatus_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      parseFrom(
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
      com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse prototype) {
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
   * `ComputeRepositoryAccessTokenStatus` response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse)
      com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_ComputeRepositoryAccessTokenStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_ComputeRepositoryAccessTokenStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.class,
              com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tokenStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_ComputeRepositoryAccessTokenStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse build() {
      com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
        buildPartial() {
      com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse result =
          new com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenStatus_ = tokenStatus_;
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
          instanceof com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse) {
        return mergeFrom(
            (com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse other) {
      if (other
          == com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
              .getDefaultInstance()) return this;
      if (other.tokenStatus_ != 0) {
        setTokenStatusValue(other.getTokenStatusValue());
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
                tokenStatus_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int tokenStatus_ = 0;
    /**
     *
     *
     * <pre>
     * Indicates the status of the Git access token.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for tokenStatus.
     */
    @java.lang.Override
    public int getTokenStatusValue() {
      return tokenStatus_;
    }
    /**
     *
     *
     * <pre>
     * Indicates the status of the Git access token.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for tokenStatus to set.
     * @return This builder for chaining.
     */
    public Builder setTokenStatusValue(int value) {
      tokenStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the status of the Git access token.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
     * </code>
     *
     * @return The tokenStatus.
     */
    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
        getTokenStatus() {
      com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
          result =
              com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
                  .TokenStatus.forNumber(tokenStatus_);
      return result == null
          ? com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Indicates the status of the Git access token.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
     * </code>
     *
     * @param value The tokenStatus to set.
     * @return This builder for chaining.
     */
    public Builder setTokenStatus(
        com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus
            value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      tokenStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the status of the Git access token.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse.TokenStatus token_status = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTokenStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tokenStatus_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse)
  private static final com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse();
  }

  public static com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeRepositoryAccessTokenStatusResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<ComputeRepositoryAccessTokenStatusResponse>() {
            @java.lang.Override
            public ComputeRepositoryAccessTokenStatusResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<ComputeRepositoryAccessTokenStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeRepositoryAccessTokenStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ComputeRepositoryAccessTokenStatusResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
