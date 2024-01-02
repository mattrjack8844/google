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
// source: google/cloud/vertexai/v1beta1/machine_resources.proto

package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * Represents the spec of [persistent
 * disk][https://cloud.google.com/compute/docs/disks/persistent-disks] options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1beta1.PersistentDiskSpec}
 */
public final class PersistentDiskSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1beta1.PersistentDiskSpec)
    PersistentDiskSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PersistentDiskSpec.newBuilder() to construct.
  private PersistentDiskSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PersistentDiskSpec() {
    diskType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PersistentDiskSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.MachineResourcesProto
        .internal_static_google_cloud_vertexai_v1beta1_PersistentDiskSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.MachineResourcesProto
        .internal_static_google_cloud_vertexai_v1beta1_PersistentDiskSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.PersistentDiskSpec.class,
            com.google.cloud.vertexai.api.PersistentDiskSpec.Builder.class);
  }

  public static final int DISK_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object diskType_ = "";
  /**
   *
   *
   * <pre>
   * Type of the disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
   * "pd-standard" (Persistent Disk Hard Disk Drive)
   * "pd-balanced" (Balanced Persistent Disk)
   * "pd-extreme" (Extreme Persistent Disk)
   * </pre>
   *
   * <code>string disk_type = 1;</code>
   *
   * @return The diskType.
   */
  @java.lang.Override
  public java.lang.String getDiskType() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Type of the disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
   * "pd-standard" (Persistent Disk Hard Disk Drive)
   * "pd-balanced" (Balanced Persistent Disk)
   * "pd-extreme" (Extreme Persistent Disk)
   * </pre>
   *
   * <code>string disk_type = 1;</code>
   *
   * @return The bytes for diskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDiskTypeBytes() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      diskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISK_SIZE_GB_FIELD_NUMBER = 2;
  private long diskSizeGb_ = 0L;
  /**
   *
   *
   * <pre>
   * Size in GB of the disk (default is 100GB).
   * </pre>
   *
   * <code>int64 disk_size_gb = 2;</code>
   *
   * @return The diskSizeGb.
   */
  @java.lang.Override
  public long getDiskSizeGb() {
    return diskSizeGb_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, diskType_);
    }
    if (diskSizeGb_ != 0L) {
      output.writeInt64(2, diskSizeGb_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, diskType_);
    }
    if (diskSizeGb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, diskSizeGb_);
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
    if (!(obj instanceof com.google.cloud.vertexai.api.PersistentDiskSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.PersistentDiskSpec other =
        (com.google.cloud.vertexai.api.PersistentDiskSpec) obj;

    if (!getDiskType().equals(other.getDiskType())) return false;
    if (getDiskSizeGb() != other.getDiskSizeGb()) return false;
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
    hash = (37 * hash) + DISK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDiskType().hashCode();
    hash = (37 * hash) + DISK_SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDiskSizeGb());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.api.PersistentDiskSpec prototype) {
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
   * Represents the spec of [persistent
   * disk][https://cloud.google.com/compute/docs/disks/persistent-disks] options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1beta1.PersistentDiskSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1beta1.PersistentDiskSpec)
      com.google.cloud.vertexai.api.PersistentDiskSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.MachineResourcesProto
          .internal_static_google_cloud_vertexai_v1beta1_PersistentDiskSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.MachineResourcesProto
          .internal_static_google_cloud_vertexai_v1beta1_PersistentDiskSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.PersistentDiskSpec.class,
              com.google.cloud.vertexai.api.PersistentDiskSpec.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.PersistentDiskSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      diskType_ = "";
      diskSizeGb_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.MachineResourcesProto
          .internal_static_google_cloud_vertexai_v1beta1_PersistentDiskSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.PersistentDiskSpec getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.PersistentDiskSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.PersistentDiskSpec build() {
      com.google.cloud.vertexai.api.PersistentDiskSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.PersistentDiskSpec buildPartial() {
      com.google.cloud.vertexai.api.PersistentDiskSpec result =
          new com.google.cloud.vertexai.api.PersistentDiskSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vertexai.api.PersistentDiskSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diskType_ = diskType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diskSizeGb_ = diskSizeGb_;
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
      if (other instanceof com.google.cloud.vertexai.api.PersistentDiskSpec) {
        return mergeFrom((com.google.cloud.vertexai.api.PersistentDiskSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.PersistentDiskSpec other) {
      if (other == com.google.cloud.vertexai.api.PersistentDiskSpec.getDefaultInstance())
        return this;
      if (!other.getDiskType().isEmpty()) {
        diskType_ = other.diskType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDiskSizeGb() != 0L) {
        setDiskSizeGb(other.getDiskSizeGb());
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
                diskType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                diskSizeGb_ = input.readInt64();
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

    private java.lang.Object diskType_ = "";
    /**
     *
     *
     * <pre>
     * Type of the disk (default is "pd-standard").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
     * "pd-standard" (Persistent Disk Hard Disk Drive)
     * "pd-balanced" (Balanced Persistent Disk)
     * "pd-extreme" (Extreme Persistent Disk)
     * </pre>
     *
     * <code>string disk_type = 1;</code>
     *
     * @return The diskType.
     */
    public java.lang.String getDiskType() {
      java.lang.Object ref = diskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the disk (default is "pd-standard").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
     * "pd-standard" (Persistent Disk Hard Disk Drive)
     * "pd-balanced" (Balanced Persistent Disk)
     * "pd-extreme" (Extreme Persistent Disk)
     * </pre>
     *
     * <code>string disk_type = 1;</code>
     *
     * @return The bytes for diskType.
     */
    public com.google.protobuf.ByteString getDiskTypeBytes() {
      java.lang.Object ref = diskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        diskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the disk (default is "pd-standard").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
     * "pd-standard" (Persistent Disk Hard Disk Drive)
     * "pd-balanced" (Balanced Persistent Disk)
     * "pd-extreme" (Extreme Persistent Disk)
     * </pre>
     *
     * <code>string disk_type = 1;</code>
     *
     * @param value The diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      diskType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the disk (default is "pd-standard").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
     * "pd-standard" (Persistent Disk Hard Disk Drive)
     * "pd-balanced" (Balanced Persistent Disk)
     * "pd-extreme" (Extreme Persistent Disk)
     * </pre>
     *
     * <code>string disk_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskType() {
      diskType_ = getDefaultInstance().getDiskType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the disk (default is "pd-standard").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
     * "pd-standard" (Persistent Disk Hard Disk Drive)
     * "pd-balanced" (Balanced Persistent Disk)
     * "pd-extreme" (Extreme Persistent Disk)
     * </pre>
     *
     * <code>string disk_type = 1;</code>
     *
     * @param value The bytes for diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      diskType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long diskSizeGb_;
    /**
     *
     *
     * <pre>
     * Size in GB of the disk (default is 100GB).
     * </pre>
     *
     * <code>int64 disk_size_gb = 2;</code>
     *
     * @return The diskSizeGb.
     */
    @java.lang.Override
    public long getDiskSizeGb() {
      return diskSizeGb_;
    }
    /**
     *
     *
     * <pre>
     * Size in GB of the disk (default is 100GB).
     * </pre>
     *
     * <code>int64 disk_size_gb = 2;</code>
     *
     * @param value The diskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setDiskSizeGb(long value) {

      diskSizeGb_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size in GB of the disk (default is 100GB).
     * </pre>
     *
     * <code>int64 disk_size_gb = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      diskSizeGb_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1beta1.PersistentDiskSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1beta1.PersistentDiskSpec)
  private static final com.google.cloud.vertexai.api.PersistentDiskSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.PersistentDiskSpec();
  }

  public static com.google.cloud.vertexai.api.PersistentDiskSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersistentDiskSpec> PARSER =
      new com.google.protobuf.AbstractParser<PersistentDiskSpec>() {
        @java.lang.Override
        public PersistentDiskSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersistentDiskSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersistentDiskSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.PersistentDiskSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
