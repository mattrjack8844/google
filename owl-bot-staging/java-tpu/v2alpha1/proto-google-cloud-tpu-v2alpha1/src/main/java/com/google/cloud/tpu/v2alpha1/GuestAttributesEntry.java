// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * A guest attributes namespace/key/value entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.GuestAttributesEntry}
 */
public final class GuestAttributesEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.GuestAttributesEntry)
    GuestAttributesEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuestAttributesEntry.newBuilder() to construct.
  private GuestAttributesEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuestAttributesEntry() {
    namespace_ = "";
    key_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuestAttributesEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GuestAttributesEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GuestAttributesEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.class, com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.Builder.class);
  }

  public static final int NAMESPACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";
  /**
   * <pre>
   * Namespace for the guest attribute entry.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Namespace for the guest attribute entry.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <pre>
   * Key for the guest attribute entry.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Key for the guest attribute entry.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <pre>
   * Value for the guest attribute entry.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Value for the guest attribute entry.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.GuestAttributesEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.GuestAttributesEntry other = (com.google.cloud.tpu.v2alpha1.GuestAttributesEntry) obj;

    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.GuestAttributesEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A guest attributes namespace/key/value entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.GuestAttributesEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.GuestAttributesEntry)
      com.google.cloud.tpu.v2alpha1.GuestAttributesEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GuestAttributesEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GuestAttributesEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.class, com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      namespace_ = "";
      key_ = "";
      value_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_GuestAttributesEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GuestAttributesEntry getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GuestAttributesEntry build() {
      com.google.cloud.tpu.v2alpha1.GuestAttributesEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GuestAttributesEntry buildPartial() {
      com.google.cloud.tpu.v2alpha1.GuestAttributesEntry result = new com.google.cloud.tpu.v2alpha1.GuestAttributesEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.GuestAttributesEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namespace_ = namespace_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tpu.v2alpha1.GuestAttributesEntry) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.GuestAttributesEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.GuestAttributesEntry other) {
      if (other == com.google.cloud.tpu.v2alpha1.GuestAttributesEntry.getDefaultInstance()) return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              namespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              key_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
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

    private java.lang.Object namespace_ = "";
    /**
     * <pre>
     * Namespace for the guest attribute entry.
     * </pre>
     *
     * <code>string namespace = 1;</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Namespace for the guest attribute entry.
     * </pre>
     *
     * <code>string namespace = 1;</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Namespace for the guest attribute entry.
     * </pre>
     *
     * <code>string namespace = 1;</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace for the guest attribute entry.
     * </pre>
     *
     * <code>string namespace = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace for the guest attribute entry.
     * </pre>
     *
     * <code>string namespace = 1;</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * Key for the guest attribute entry.
     * </pre>
     *
     * <code>string key = 2;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Key for the guest attribute entry.
     * </pre>
     *
     * <code>string key = 2;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Key for the guest attribute entry.
     * </pre>
     *
     * <code>string key = 2;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key for the guest attribute entry.
     * </pre>
     *
     * <code>string key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key for the guest attribute entry.
     * </pre>
     *
     * <code>string key = 2;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * Value for the guest attribute entry.
     * </pre>
     *
     * <code>string value = 3;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Value for the guest attribute entry.
     * </pre>
     *
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Value for the guest attribute entry.
     * </pre>
     *
     * <code>string value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value for the guest attribute entry.
     * </pre>
     *
     * <code>string value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value for the guest attribute entry.
     * </pre>
     *
     * <code>string value = 3;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.GuestAttributesEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.GuestAttributesEntry)
  private static final com.google.cloud.tpu.v2alpha1.GuestAttributesEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.GuestAttributesEntry();
  }

  public static com.google.cloud.tpu.v2alpha1.GuestAttributesEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestAttributesEntry>
      PARSER = new com.google.protobuf.AbstractParser<GuestAttributesEntry>() {
    @java.lang.Override
    public GuestAttributesEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuestAttributesEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestAttributesEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GuestAttributesEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

