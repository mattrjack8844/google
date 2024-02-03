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
// source: google/cloud/retail/v2/promotion.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

/**
 *
 *
 * <pre>
 * Promotion information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.Promotion}
 */
public final class Promotion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.Promotion)
    PromotionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Promotion.newBuilder() to construct.
  private Promotion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Promotion() {
    promotionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Promotion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2.PromotionProto
        .internal_static_google_cloud_retail_v2_Promotion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.PromotionProto
        .internal_static_google_cloud_retail_v2_Promotion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.Promotion.class,
            com.google.cloud.retail.v2.Promotion.Builder.class);
  }

  public static final int PROMOTION_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object promotionId_ = "";
  /**
   *
   *
   * <pre>
   * ID of the promotion. For example, "free gift".
   *
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   *
   * @return The promotionId.
   */
  @java.lang.Override
  public java.lang.String getPromotionId() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the promotion. For example, "free gift".
   *
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   *
   * @return The bytes for promotionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPromotionIdBytes() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      promotionId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(promotionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, promotionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(promotionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, promotionId_);
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
    if (!(obj instanceof com.google.cloud.retail.v2.Promotion)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.Promotion other = (com.google.cloud.retail.v2.Promotion) obj;

    if (!getPromotionId().equals(other.getPromotionId())) return false;
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
    hash = (37 * hash) + PROMOTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Promotion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Promotion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Promotion parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2.Promotion prototype) {
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
   * Promotion information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.Promotion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.Promotion)
      com.google.cloud.retail.v2.PromotionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2.PromotionProto
          .internal_static_google_cloud_retail_v2_Promotion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.PromotionProto
          .internal_static_google_cloud_retail_v2_Promotion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.Promotion.class,
              com.google.cloud.retail.v2.Promotion.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.Promotion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      promotionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2.PromotionProto
          .internal_static_google_cloud_retail_v2_Promotion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Promotion getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.Promotion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Promotion build() {
      com.google.cloud.retail.v2.Promotion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Promotion buildPartial() {
      com.google.cloud.retail.v2.Promotion result = new com.google.cloud.retail.v2.Promotion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.Promotion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.promotionId_ = promotionId_;
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
      if (other instanceof com.google.cloud.retail.v2.Promotion) {
        return mergeFrom((com.google.cloud.retail.v2.Promotion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.Promotion other) {
      if (other == com.google.cloud.retail.v2.Promotion.getDefaultInstance()) return this;
      if (!other.getPromotionId().isEmpty()) {
        promotionId_ = other.promotionId_;
        bitField0_ |= 0x00000001;
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
                promotionId_ = input.readStringRequireUtf8();
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

    private java.lang.Object promotionId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the promotion. For example, "free gift".
     *
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     *
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     *
     * @return The promotionId.
     */
    public java.lang.String getPromotionId() {
      java.lang.Object ref = promotionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the promotion. For example, "free gift".
     *
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     *
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     *
     * @return The bytes for promotionId.
     */
    public com.google.protobuf.ByteString getPromotionIdBytes() {
      java.lang.Object ref = promotionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        promotionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the promotion. For example, "free gift".
     *
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     *
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     *
     * @param value The promotionId to set.
     * @return This builder for chaining.
     */
    public Builder setPromotionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      promotionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the promotion. For example, "free gift".
     *
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     *
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPromotionId() {
      promotionId_ = getDefaultInstance().getPromotionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the promotion. For example, "free gift".
     *
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     *
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     *
     * @param value The bytes for promotionId to set.
     * @return This builder for chaining.
     */
    public Builder setPromotionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      promotionId_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.Promotion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.Promotion)
  private static final com.google.cloud.retail.v2.Promotion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.Promotion();
  }

  public static com.google.cloud.retail.v2.Promotion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Promotion> PARSER =
      new com.google.protobuf.AbstractParser<Promotion>() {
        @java.lang.Override
        public Promotion parsePartialFrom(
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

  public static com.google.protobuf.Parser<Promotion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Promotion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.Promotion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
