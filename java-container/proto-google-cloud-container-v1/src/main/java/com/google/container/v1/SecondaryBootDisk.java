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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * SecondaryBootDisk represents a persistent disk attached to a node
 * with special configurations based on its mode.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.SecondaryBootDisk}
 */
public final class SecondaryBootDisk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.SecondaryBootDisk)
    SecondaryBootDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecondaryBootDisk.newBuilder() to construct.
  private SecondaryBootDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecondaryBootDisk() {
    mode_ = 0;
    diskImage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecondaryBootDisk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_SecondaryBootDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_SecondaryBootDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.SecondaryBootDisk.class,
            com.google.container.v1.SecondaryBootDisk.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Mode specifies how the secondary boot disk will be used.
   * This triggers mode-specified logic in the control plane.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.SecondaryBootDisk.Mode}
   */
  public enum Mode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * MODE_UNSPECIFIED is when mode is not set.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * CONTAINER_IMAGE_CACHE is for using the secondary boot disk as
     * a container image cache.
     * </pre>
     *
     * <code>CONTAINER_IMAGE_CACHE = 1;</code>
     */
    CONTAINER_IMAGE_CACHE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * MODE_UNSPECIFIED is when mode is not set.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * CONTAINER_IMAGE_CACHE is for using the secondary boot disk as
     * a container image cache.
     * </pre>
     *
     * <code>CONTAINER_IMAGE_CACHE = 1;</code>
     */
    public static final int CONTAINER_IMAGE_CACHE_VALUE = 1;

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
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0:
          return MODE_UNSPECIFIED;
        case 1:
          return CONTAINER_IMAGE_CACHE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Mode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
          public Mode findValueByNumber(int number) {
            return Mode.forNumber(number);
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
      return com.google.container.v1.SecondaryBootDisk.getDescriptor().getEnumTypes().get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.SecondaryBootDisk.Mode)
  }

  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_ = 0;
  /**
   *
   *
   * <pre>
   * Disk mode (container image cache, etc.)
   * </pre>
   *
   * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * Disk mode (container image cache, etc.)
   * </pre>
   *
   * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.container.v1.SecondaryBootDisk.Mode getMode() {
    com.google.container.v1.SecondaryBootDisk.Mode result =
        com.google.container.v1.SecondaryBootDisk.Mode.forNumber(mode_);
    return result == null ? com.google.container.v1.SecondaryBootDisk.Mode.UNRECOGNIZED : result;
  }

  public static final int DISK_IMAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object diskImage_ = "";
  /**
   *
   *
   * <pre>
   * Fully-qualified resource ID for an existing disk image.
   * </pre>
   *
   * <code>string disk_image = 2;</code>
   *
   * @return The diskImage.
   */
  @java.lang.Override
  public java.lang.String getDiskImage() {
    java.lang.Object ref = diskImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskImage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fully-qualified resource ID for an existing disk image.
   * </pre>
   *
   * <code>string disk_image = 2;</code>
   *
   * @return The bytes for diskImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDiskImageBytes() {
    java.lang.Object ref = diskImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      diskImage_ = b;
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
    if (mode_ != com.google.container.v1.SecondaryBootDisk.Mode.MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, mode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diskImage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode_ != com.google.container.v1.SecondaryBootDisk.Mode.MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, mode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diskImage_);
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
    if (!(obj instanceof com.google.container.v1.SecondaryBootDisk)) {
      return super.equals(obj);
    }
    com.google.container.v1.SecondaryBootDisk other =
        (com.google.container.v1.SecondaryBootDisk) obj;

    if (mode_ != other.mode_) return false;
    if (!getDiskImage().equals(other.getDiskImage())) return false;
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
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (37 * hash) + DISK_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getDiskImage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.SecondaryBootDisk parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.SecondaryBootDisk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.SecondaryBootDisk parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.SecondaryBootDisk prototype) {
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
   * SecondaryBootDisk represents a persistent disk attached to a node
   * with special configurations based on its mode.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.SecondaryBootDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.SecondaryBootDisk)
      com.google.container.v1.SecondaryBootDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_SecondaryBootDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_SecondaryBootDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.SecondaryBootDisk.class,
              com.google.container.v1.SecondaryBootDisk.Builder.class);
    }

    // Construct using com.google.container.v1.SecondaryBootDisk.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mode_ = 0;
      diskImage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_SecondaryBootDisk_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.SecondaryBootDisk getDefaultInstanceForType() {
      return com.google.container.v1.SecondaryBootDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.SecondaryBootDisk build() {
      com.google.container.v1.SecondaryBootDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.SecondaryBootDisk buildPartial() {
      com.google.container.v1.SecondaryBootDisk result =
          new com.google.container.v1.SecondaryBootDisk(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.SecondaryBootDisk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode_ = mode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diskImage_ = diskImage_;
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
      if (other instanceof com.google.container.v1.SecondaryBootDisk) {
        return mergeFrom((com.google.container.v1.SecondaryBootDisk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.SecondaryBootDisk other) {
      if (other == com.google.container.v1.SecondaryBootDisk.getDefaultInstance()) return this;
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (!other.getDiskImage().isEmpty()) {
        diskImage_ = other.diskImage_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                mode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                diskImage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * Disk mode (container image cache, etc.)
     * </pre>
     *
     * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * Disk mode (container image cache, etc.)
     * </pre>
     *
     * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Disk mode (container image cache, etc.)
     * </pre>
     *
     * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.container.v1.SecondaryBootDisk.Mode getMode() {
      com.google.container.v1.SecondaryBootDisk.Mode result =
          com.google.container.v1.SecondaryBootDisk.Mode.forNumber(mode_);
      return result == null ? com.google.container.v1.SecondaryBootDisk.Mode.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Disk mode (container image cache, etc.)
     * </pre>
     *
     * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.container.v1.SecondaryBootDisk.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Disk mode (container image cache, etc.)
     * </pre>
     *
     * <code>.google.container.v1.SecondaryBootDisk.Mode mode = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object diskImage_ = "";
    /**
     *
     *
     * <pre>
     * Fully-qualified resource ID for an existing disk image.
     * </pre>
     *
     * <code>string disk_image = 2;</code>
     *
     * @return The diskImage.
     */
    public java.lang.String getDiskImage() {
      java.lang.Object ref = diskImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully-qualified resource ID for an existing disk image.
     * </pre>
     *
     * <code>string disk_image = 2;</code>
     *
     * @return The bytes for diskImage.
     */
    public com.google.protobuf.ByteString getDiskImageBytes() {
      java.lang.Object ref = diskImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        diskImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully-qualified resource ID for an existing disk image.
     * </pre>
     *
     * <code>string disk_image = 2;</code>
     *
     * @param value The diskImage to set.
     * @return This builder for chaining.
     */
    public Builder setDiskImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      diskImage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully-qualified resource ID for an existing disk image.
     * </pre>
     *
     * <code>string disk_image = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskImage() {
      diskImage_ = getDefaultInstance().getDiskImage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully-qualified resource ID for an existing disk image.
     * </pre>
     *
     * <code>string disk_image = 2;</code>
     *
     * @param value The bytes for diskImage to set.
     * @return This builder for chaining.
     */
    public Builder setDiskImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      diskImage_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.SecondaryBootDisk)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.SecondaryBootDisk)
  private static final com.google.container.v1.SecondaryBootDisk DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.SecondaryBootDisk();
  }

  public static com.google.container.v1.SecondaryBootDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecondaryBootDisk> PARSER =
      new com.google.protobuf.AbstractParser<SecondaryBootDisk>() {
        @java.lang.Override
        public SecondaryBootDisk parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecondaryBootDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecondaryBootDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.SecondaryBootDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
