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
// source: google/cloud/websecurityscanner/v1beta/finding_type_stats.proto

package com.google.cloud.websecurityscanner.v1beta;

/**
 *
 *
 * <pre>
 * A FindingTypeStats resource represents stats regarding a specific FindingType
 * of Findings under a given ScanRun.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1beta.FindingTypeStats}
 */
public final class FindingTypeStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1beta.FindingTypeStats)
    FindingTypeStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FindingTypeStats.newBuilder() to construct.
  private FindingTypeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FindingTypeStats() {
    findingType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FindingTypeStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsProto
        .internal_static_google_cloud_websecurityscanner_v1beta_FindingTypeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsProto
        .internal_static_google_cloud_websecurityscanner_v1beta_FindingTypeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.class,
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder.class);
  }

  public static final int FINDING_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object findingType_ = "";
  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>string finding_type = 1;</code>
   *
   * @return The findingType.
   */
  @java.lang.Override
  public java.lang.String getFindingType() {
    java.lang.Object ref = findingType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      findingType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>string finding_type = 1;</code>
   *
   * @return The bytes for findingType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFindingTypeBytes() {
    java.lang.Object ref = findingType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      findingType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINDING_COUNT_FIELD_NUMBER = 2;
  private int findingCount_ = 0;
  /**
   *
   *
   * <pre>
   * The count of findings belonging to this finding type.
   * </pre>
   *
   * <code>int32 finding_count = 2;</code>
   *
   * @return The findingCount.
   */
  @java.lang.Override
  public int getFindingCount() {
    return findingCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(findingType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, findingType_);
    }
    if (findingCount_ != 0) {
      output.writeInt32(2, findingCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(findingType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, findingType_);
    }
    if (findingCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, findingCount_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1beta.FindingTypeStats)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1beta.FindingTypeStats other =
        (com.google.cloud.websecurityscanner.v1beta.FindingTypeStats) obj;

    if (!getFindingType().equals(other.getFindingType())) return false;
    if (getFindingCount() != other.getFindingCount()) return false;
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
    hash = (37 * hash) + FINDING_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFindingType().hashCode();
    hash = (37 * hash) + FINDING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFindingCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats parseFrom(
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
      com.google.cloud.websecurityscanner.v1beta.FindingTypeStats prototype) {
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
   * A FindingTypeStats resource represents stats regarding a specific FindingType
   * of Findings under a given ScanRun.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1beta.FindingTypeStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1beta.FindingTypeStats)
      com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1beta_FindingTypeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1beta_FindingTypeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.class,
              com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      findingType_ = "";
      findingCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1beta_FindingTypeStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats build() {
      com.google.cloud.websecurityscanner.v1beta.FindingTypeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats buildPartial() {
      com.google.cloud.websecurityscanner.v1beta.FindingTypeStats result =
          new com.google.cloud.websecurityscanner.v1beta.FindingTypeStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.websecurityscanner.v1beta.FindingTypeStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.findingType_ = findingType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.findingCount_ = findingCount_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1beta.FindingTypeStats) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1beta.FindingTypeStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1beta.FindingTypeStats other) {
      if (other == com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.getDefaultInstance())
        return this;
      if (!other.getFindingType().isEmpty()) {
        findingType_ = other.findingType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFindingCount() != 0) {
        setFindingCount(other.getFindingCount());
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
                findingType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                findingCount_ = input.readInt32();
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

    private java.lang.Object findingType_ = "";
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>string finding_type = 1;</code>
     *
     * @return The findingType.
     */
    public java.lang.String getFindingType() {
      java.lang.Object ref = findingType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        findingType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>string finding_type = 1;</code>
     *
     * @return The bytes for findingType.
     */
    public com.google.protobuf.ByteString getFindingTypeBytes() {
      java.lang.Object ref = findingType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        findingType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>string finding_type = 1;</code>
     *
     * @param value The findingType to set.
     * @return This builder for chaining.
     */
    public Builder setFindingType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      findingType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>string finding_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFindingType() {
      findingType_ = getDefaultInstance().getFindingType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>string finding_type = 1;</code>
     *
     * @param value The bytes for findingType to set.
     * @return This builder for chaining.
     */
    public Builder setFindingTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      findingType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int findingCount_;
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @return The findingCount.
     */
    @java.lang.Override
    public int getFindingCount() {
      return findingCount_;
    }
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @param value The findingCount to set.
     * @return This builder for chaining.
     */
    public Builder setFindingCount(int value) {

      findingCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFindingCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      findingCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1beta.FindingTypeStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1beta.FindingTypeStats)
  private static final com.google.cloud.websecurityscanner.v1beta.FindingTypeStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1beta.FindingTypeStats();
  }

  public static com.google.cloud.websecurityscanner.v1beta.FindingTypeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindingTypeStats> PARSER =
      new com.google.protobuf.AbstractParser<FindingTypeStats>() {
        @java.lang.Override
        public FindingTypeStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindingTypeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindingTypeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
