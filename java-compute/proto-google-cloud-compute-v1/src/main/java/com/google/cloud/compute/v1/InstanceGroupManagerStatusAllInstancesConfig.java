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
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig}
 */
public final class InstanceGroupManagerStatusAllInstancesConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)
    InstanceGroupManagerStatusAllInstancesConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerStatusAllInstancesConfig.newBuilder() to construct.
  private InstanceGroupManagerStatusAllInstancesConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerStatusAllInstancesConfig() {
    currentRevision_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerStatusAllInstancesConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusAllInstancesConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusAllInstancesConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig.class,
            com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig.Builder.class);
  }

  private int bitField0_;
  public static final int CURRENT_REVISION_FIELD_NUMBER = 38355937;

  @SuppressWarnings("serial")
  private volatile java.lang.Object currentRevision_ = "";
  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return Whether the currentRevision field is set.
   */
  @java.lang.Override
  public boolean hasCurrentRevision() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return The currentRevision.
   */
  @java.lang.Override
  public java.lang.String getCurrentRevision() {
    java.lang.Object ref = currentRevision_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentRevision_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return The bytes for currentRevision.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCurrentRevisionBytes() {
    java.lang.Object ref = currentRevision_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      currentRevision_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EFFECTIVE_FIELD_NUMBER = 141961639;
  private boolean effective_ = false;
  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
   * </pre>
   *
   * <code>optional bool effective = 141961639;</code>
   *
   * @return Whether the effective field is set.
   */
  @java.lang.Override
  public boolean hasEffective() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
   * </pre>
   *
   * <code>optional bool effective = 141961639;</code>
   *
   * @return The effective.
   */
  @java.lang.Override
  public boolean getEffective() {
    return effective_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 38355937, currentRevision_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(141961639, effective_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(38355937, currentRevision_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(141961639, effective_);
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
        instanceof com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig other =
        (com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig) obj;

    if (hasCurrentRevision() != other.hasCurrentRevision()) return false;
    if (hasCurrentRevision()) {
      if (!getCurrentRevision().equals(other.getCurrentRevision())) return false;
    }
    if (hasEffective() != other.hasEffective()) return false;
    if (hasEffective()) {
      if (getEffective() != other.getEffective()) return false;
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
    if (hasCurrentRevision()) {
      hash = (37 * hash) + CURRENT_REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentRevision().hashCode();
    }
    if (hasEffective()) {
      hash = (37 * hash) + EFFECTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEffective());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)
      com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusAllInstancesConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusAllInstancesConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig.class,
              com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      currentRevision_ = "";
      effective_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerStatusAllInstancesConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig build() {
      com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig result =
          new com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.currentRevision_ = currentRevision_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.effective_ = effective_;
        to_bitField0_ |= 0x00000002;
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
      if (other
          instanceof com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
              .getDefaultInstance()) return this;
      if (other.hasCurrentRevision()) {
        currentRevision_ = other.currentRevision_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEffective()) {
        setEffective(other.getEffective());
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
            case 306847498:
              {
                currentRevision_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 306847498
            case 1135693112:
              {
                effective_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 1135693112
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

    private java.lang.Object currentRevision_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @return Whether the currentRevision field is set.
     */
    public boolean hasCurrentRevision() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @return The currentRevision.
     */
    public java.lang.String getCurrentRevision() {
      java.lang.Object ref = currentRevision_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentRevision_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @return The bytes for currentRevision.
     */
    public com.google.protobuf.ByteString getCurrentRevisionBytes() {
      java.lang.Object ref = currentRevision_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        currentRevision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @param value The currentRevision to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentRevision(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      currentRevision_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCurrentRevision() {
      currentRevision_ = getDefaultInstance().getCurrentRevision();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
     * </pre>
     *
     * <code>optional string current_revision = 38355937;</code>
     *
     * @param value The bytes for currentRevision to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentRevisionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      currentRevision_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean effective_;
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
     * </pre>
     *
     * <code>optional bool effective = 141961639;</code>
     *
     * @return Whether the effective field is set.
     */
    @java.lang.Override
    public boolean hasEffective() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
     * </pre>
     *
     * <code>optional bool effective = 141961639;</code>
     *
     * @return The effective.
     */
    @java.lang.Override
    public boolean getEffective() {
      return effective_;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
     * </pre>
     *
     * <code>optional bool effective = 141961639;</code>
     *
     * @param value The effective to set.
     * @return This builder for chaining.
     */
    public Builder setEffective(boolean value) {

      effective_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
     * </pre>
     *
     * <code>optional bool effective = 141961639;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEffective() {
      bitField0_ = (bitField0_ & ~0x00000002);
      effective_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerStatusAllInstancesConfig>
      PARSER =
          new com.google.protobuf.AbstractParser<InstanceGroupManagerStatusAllInstancesConfig>() {
            @java.lang.Override
            public InstanceGroupManagerStatusAllInstancesConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupManagerStatusAllInstancesConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerStatusAllInstancesConfig>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
