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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * CustomTargetDeployMetadata contains information from a Custom Target
 * deploy operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.CustomTargetDeployMetadata}
 */
public final class CustomTargetDeployMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.CustomTargetDeployMetadata)
    CustomTargetDeployMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CustomTargetDeployMetadata.newBuilder() to construct.
  private CustomTargetDeployMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomTargetDeployMetadata() {
    skipMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomTargetDeployMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_CustomTargetDeployMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_CustomTargetDeployMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.CustomTargetDeployMetadata.class,
            com.google.cloud.deploy.v1.CustomTargetDeployMetadata.Builder.class);
  }

  public static final int SKIP_MESSAGE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object skipMessage_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Skip message provided in the results of a custom deploy
   * operation.
   * </pre>
   *
   * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The skipMessage.
   */
  @java.lang.Override
  public java.lang.String getSkipMessage() {
    java.lang.Object ref = skipMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skipMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Skip message provided in the results of a custom deploy
   * operation.
   * </pre>
   *
   * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for skipMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkipMessageBytes() {
    java.lang.Object ref = skipMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      skipMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skipMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skipMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skipMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skipMessage_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.CustomTargetDeployMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.CustomTargetDeployMetadata other =
        (com.google.cloud.deploy.v1.CustomTargetDeployMetadata) obj;

    if (!getSkipMessage().equals(other.getSkipMessage())) return false;
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
    hash = (37 * hash) + SKIP_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSkipMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata parseFrom(
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
      com.google.cloud.deploy.v1.CustomTargetDeployMetadata prototype) {
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
   * CustomTargetDeployMetadata contains information from a Custom Target
   * deploy operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.CustomTargetDeployMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.CustomTargetDeployMetadata)
      com.google.cloud.deploy.v1.CustomTargetDeployMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_CustomTargetDeployMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_CustomTargetDeployMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.CustomTargetDeployMetadata.class,
              com.google.cloud.deploy.v1.CustomTargetDeployMetadata.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.CustomTargetDeployMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      skipMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_CustomTargetDeployMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CustomTargetDeployMetadata getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.CustomTargetDeployMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CustomTargetDeployMetadata build() {
      com.google.cloud.deploy.v1.CustomTargetDeployMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CustomTargetDeployMetadata buildPartial() {
      com.google.cloud.deploy.v1.CustomTargetDeployMetadata result =
          new com.google.cloud.deploy.v1.CustomTargetDeployMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.CustomTargetDeployMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skipMessage_ = skipMessage_;
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
      if (other instanceof com.google.cloud.deploy.v1.CustomTargetDeployMetadata) {
        return mergeFrom((com.google.cloud.deploy.v1.CustomTargetDeployMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.CustomTargetDeployMetadata other) {
      if (other == com.google.cloud.deploy.v1.CustomTargetDeployMetadata.getDefaultInstance())
        return this;
      if (!other.getSkipMessage().isEmpty()) {
        skipMessage_ = other.skipMessage_;
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
                skipMessage_ = input.readStringRequireUtf8();
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

    private java.lang.Object skipMessage_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Skip message provided in the results of a custom deploy
     * operation.
     * </pre>
     *
     * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The skipMessage.
     */
    public java.lang.String getSkipMessage() {
      java.lang.Object ref = skipMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skipMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Skip message provided in the results of a custom deploy
     * operation.
     * </pre>
     *
     * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for skipMessage.
     */
    public com.google.protobuf.ByteString getSkipMessageBytes() {
      java.lang.Object ref = skipMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        skipMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Skip message provided in the results of a custom deploy
     * operation.
     * </pre>
     *
     * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The skipMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSkipMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      skipMessage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Skip message provided in the results of a custom deploy
     * operation.
     * </pre>
     *
     * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkipMessage() {
      skipMessage_ = getDefaultInstance().getSkipMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Skip message provided in the results of a custom deploy
     * operation.
     * </pre>
     *
     * <code>string skip_message = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for skipMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSkipMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      skipMessage_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.CustomTargetDeployMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.CustomTargetDeployMetadata)
  private static final com.google.cloud.deploy.v1.CustomTargetDeployMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.CustomTargetDeployMetadata();
  }

  public static com.google.cloud.deploy.v1.CustomTargetDeployMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomTargetDeployMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CustomTargetDeployMetadata>() {
        @java.lang.Override
        public CustomTargetDeployMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomTargetDeployMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomTargetDeployMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.CustomTargetDeployMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
