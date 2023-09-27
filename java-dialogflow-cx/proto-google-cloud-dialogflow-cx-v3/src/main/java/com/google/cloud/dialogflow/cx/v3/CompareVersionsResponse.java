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
// source: google/cloud/dialogflow/cx/v3/version.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for
 * [Versions.CompareVersions][google.cloud.dialogflow.cx.v3.Versions.CompareVersions].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.CompareVersionsResponse}
 */
public final class CompareVersionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.CompareVersionsResponse)
    CompareVersionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CompareVersionsResponse.newBuilder() to construct.
  private CompareVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CompareVersionsResponse() {
    baseVersionContentJson_ = "";
    targetVersionContentJson_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CompareVersionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.class,
            com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.Builder.class);
  }

  public static final int BASE_VERSION_CONTENT_JSON_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object baseVersionContentJson_ = "";
  /**
   *
   *
   * <pre>
   * JSON representation of the base version content.
   * </pre>
   *
   * <code>string base_version_content_json = 1;</code>
   *
   * @return The baseVersionContentJson.
   */
  @java.lang.Override
  public java.lang.String getBaseVersionContentJson() {
    java.lang.Object ref = baseVersionContentJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseVersionContentJson_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * JSON representation of the base version content.
   * </pre>
   *
   * <code>string base_version_content_json = 1;</code>
   *
   * @return The bytes for baseVersionContentJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBaseVersionContentJsonBytes() {
    java.lang.Object ref = baseVersionContentJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      baseVersionContentJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_VERSION_CONTENT_JSON_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object targetVersionContentJson_ = "";
  /**
   *
   *
   * <pre>
   * JSON representation of the target version content.
   * </pre>
   *
   * <code>string target_version_content_json = 2;</code>
   *
   * @return The targetVersionContentJson.
   */
  @java.lang.Override
  public java.lang.String getTargetVersionContentJson() {
    java.lang.Object ref = targetVersionContentJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetVersionContentJson_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * JSON representation of the target version content.
   * </pre>
   *
   * <code>string target_version_content_json = 2;</code>
   *
   * @return The bytes for targetVersionContentJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetVersionContentJsonBytes() {
    java.lang.Object ref = targetVersionContentJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetVersionContentJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPARE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp compareTime_;
  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   *
   * @return Whether the compareTime field is set.
   */
  @java.lang.Override
  public boolean hasCompareTime() {
    return compareTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   *
   * @return The compareTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCompareTime() {
    return compareTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : compareTime_;
  }
  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCompareTimeOrBuilder() {
    return compareTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : compareTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseVersionContentJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseVersionContentJson_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetVersionContentJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetVersionContentJson_);
    }
    if (compareTime_ != null) {
      output.writeMessage(3, getCompareTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseVersionContentJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseVersionContentJson_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetVersionContentJson_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetVersionContentJson_);
    }
    if (compareTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCompareTime());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse other =
        (com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse) obj;

    if (!getBaseVersionContentJson().equals(other.getBaseVersionContentJson())) return false;
    if (!getTargetVersionContentJson().equals(other.getTargetVersionContentJson())) return false;
    if (hasCompareTime() != other.hasCompareTime()) return false;
    if (hasCompareTime()) {
      if (!getCompareTime().equals(other.getCompareTime())) return false;
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
    hash = (37 * hash) + BASE_VERSION_CONTENT_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getBaseVersionContentJson().hashCode();
    hash = (37 * hash) + TARGET_VERSION_CONTENT_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getTargetVersionContentJson().hashCode();
    if (hasCompareTime()) {
      hash = (37 * hash) + COMPARE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompareTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse parseFrom(
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
      com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse prototype) {
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
   * The response message for
   * [Versions.CompareVersions][google.cloud.dialogflow.cx.v3.Versions.CompareVersions].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.CompareVersionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.CompareVersionsResponse)
      com.google.cloud.dialogflow.cx.v3.CompareVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.class,
              com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      baseVersionContentJson_ = "";
      targetVersionContentJson_ = "";
      compareTime_ = null;
      if (compareTimeBuilder_ != null) {
        compareTimeBuilder_.dispose();
        compareTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse build() {
      com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse result =
          new com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseVersionContentJson_ = baseVersionContentJson_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetVersionContentJson_ = targetVersionContentJson_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.compareTime_ =
            compareTimeBuilder_ == null ? compareTime_ : compareTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse.getDefaultInstance())
        return this;
      if (!other.getBaseVersionContentJson().isEmpty()) {
        baseVersionContentJson_ = other.baseVersionContentJson_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTargetVersionContentJson().isEmpty()) {
        targetVersionContentJson_ = other.targetVersionContentJson_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCompareTime()) {
        mergeCompareTime(other.getCompareTime());
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
                baseVersionContentJson_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                targetVersionContentJson_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getCompareTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object baseVersionContentJson_ = "";
    /**
     *
     *
     * <pre>
     * JSON representation of the base version content.
     * </pre>
     *
     * <code>string base_version_content_json = 1;</code>
     *
     * @return The baseVersionContentJson.
     */
    public java.lang.String getBaseVersionContentJson() {
      java.lang.Object ref = baseVersionContentJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseVersionContentJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the base version content.
     * </pre>
     *
     * <code>string base_version_content_json = 1;</code>
     *
     * @return The bytes for baseVersionContentJson.
     */
    public com.google.protobuf.ByteString getBaseVersionContentJsonBytes() {
      java.lang.Object ref = baseVersionContentJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        baseVersionContentJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the base version content.
     * </pre>
     *
     * <code>string base_version_content_json = 1;</code>
     *
     * @param value The baseVersionContentJson to set.
     * @return This builder for chaining.
     */
    public Builder setBaseVersionContentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      baseVersionContentJson_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the base version content.
     * </pre>
     *
     * <code>string base_version_content_json = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBaseVersionContentJson() {
      baseVersionContentJson_ = getDefaultInstance().getBaseVersionContentJson();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the base version content.
     * </pre>
     *
     * <code>string base_version_content_json = 1;</code>
     *
     * @param value The bytes for baseVersionContentJson to set.
     * @return This builder for chaining.
     */
    public Builder setBaseVersionContentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      baseVersionContentJson_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object targetVersionContentJson_ = "";
    /**
     *
     *
     * <pre>
     * JSON representation of the target version content.
     * </pre>
     *
     * <code>string target_version_content_json = 2;</code>
     *
     * @return The targetVersionContentJson.
     */
    public java.lang.String getTargetVersionContentJson() {
      java.lang.Object ref = targetVersionContentJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetVersionContentJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the target version content.
     * </pre>
     *
     * <code>string target_version_content_json = 2;</code>
     *
     * @return The bytes for targetVersionContentJson.
     */
    public com.google.protobuf.ByteString getTargetVersionContentJsonBytes() {
      java.lang.Object ref = targetVersionContentJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetVersionContentJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the target version content.
     * </pre>
     *
     * <code>string target_version_content_json = 2;</code>
     *
     * @param value The targetVersionContentJson to set.
     * @return This builder for chaining.
     */
    public Builder setTargetVersionContentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetVersionContentJson_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the target version content.
     * </pre>
     *
     * <code>string target_version_content_json = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetVersionContentJson() {
      targetVersionContentJson_ = getDefaultInstance().getTargetVersionContentJson();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the target version content.
     * </pre>
     *
     * <code>string target_version_content_json = 2;</code>
     *
     * @param value The bytes for targetVersionContentJson to set.
     * @return This builder for chaining.
     */
    public Builder setTargetVersionContentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetVersionContentJson_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp compareTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        compareTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     *
     * @return Whether the compareTime field is set.
     */
    public boolean hasCompareTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     *
     * @return The compareTime.
     */
    public com.google.protobuf.Timestamp getCompareTime() {
      if (compareTimeBuilder_ == null) {
        return compareTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : compareTime_;
      } else {
        return compareTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public Builder setCompareTime(com.google.protobuf.Timestamp value) {
      if (compareTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compareTime_ = value;
      } else {
        compareTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public Builder setCompareTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (compareTimeBuilder_ == null) {
        compareTime_ = builderForValue.build();
      } else {
        compareTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public Builder mergeCompareTime(com.google.protobuf.Timestamp value) {
      if (compareTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && compareTime_ != null
            && compareTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCompareTimeBuilder().mergeFrom(value);
        } else {
          compareTime_ = value;
        }
      } else {
        compareTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public Builder clearCompareTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      compareTime_ = null;
      if (compareTimeBuilder_ != null) {
        compareTimeBuilder_.dispose();
        compareTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompareTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCompareTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompareTimeOrBuilder() {
      if (compareTimeBuilder_ != null) {
        return compareTimeBuilder_.getMessageOrBuilder();
      } else {
        return compareTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : compareTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp when the two version compares.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp compare_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCompareTimeFieldBuilder() {
      if (compareTimeBuilder_ == null) {
        compareTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCompareTime(), getParentForChildren(), isClean());
        compareTime_ = null;
      }
      return compareTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.CompareVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.CompareVersionsResponse)
  private static final com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompareVersionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<CompareVersionsResponse>() {
        @java.lang.Override
        public CompareVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompareVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompareVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.CompareVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
