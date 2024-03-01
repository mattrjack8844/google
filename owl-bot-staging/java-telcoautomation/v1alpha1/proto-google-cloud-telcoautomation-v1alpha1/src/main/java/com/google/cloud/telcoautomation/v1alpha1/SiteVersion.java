// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * SiteVersion Hydration is targeting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.SiteVersion}
 */
public final class SiteVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1alpha1.SiteVersion)
    SiteVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SiteVersion.newBuilder() to construct.
  private SiteVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SiteVersion() {
    nfVendor_ = "";
    nfType_ = "";
    nfVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SiteVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_SiteVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_SiteVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1alpha1.SiteVersion.class, com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder.class);
  }

  public static final int NF_VENDOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nfVendor_ = "";
  /**
   * <pre>
   * Output only. NF vendor.
   * </pre>
   *
   * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nfVendor.
   */
  @java.lang.Override
  public java.lang.String getNfVendor() {
    java.lang.Object ref = nfVendor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nfVendor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. NF vendor.
   * </pre>
   *
   * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nfVendor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNfVendorBytes() {
    java.lang.Object ref = nfVendor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nfVendor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NF_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nfType_ = "";
  /**
   * <pre>
   * Output only. NF vendor type.
   * </pre>
   *
   * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nfType.
   */
  @java.lang.Override
  public java.lang.String getNfType() {
    java.lang.Object ref = nfType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nfType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. NF vendor type.
   * </pre>
   *
   * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nfType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNfTypeBytes() {
    java.lang.Object ref = nfType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nfType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NF_VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nfVersion_ = "";
  /**
   * <pre>
   * Output only. NF version.
   * </pre>
   *
   * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nfVersion.
   */
  @java.lang.Override
  public java.lang.String getNfVersion() {
    java.lang.Object ref = nfVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nfVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. NF version.
   * </pre>
   *
   * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nfVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNfVersionBytes() {
    java.lang.Object ref = nfVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nfVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfVendor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nfVendor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nfType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nfVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfVendor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nfVendor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nfType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nfVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nfVersion_);
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1alpha1.SiteVersion)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1alpha1.SiteVersion other = (com.google.cloud.telcoautomation.v1alpha1.SiteVersion) obj;

    if (!getNfVendor()
        .equals(other.getNfVendor())) return false;
    if (!getNfType()
        .equals(other.getNfType())) return false;
    if (!getNfVersion()
        .equals(other.getNfVersion())) return false;
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
    hash = (37 * hash) + NF_VENDOR_FIELD_NUMBER;
    hash = (53 * hash) + getNfVendor().hashCode();
    hash = (37 * hash) + NF_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getNfType().hashCode();
    hash = (37 * hash) + NF_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getNfVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1alpha1.SiteVersion prototype) {
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
   * SiteVersion Hydration is targeting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.SiteVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1alpha1.SiteVersion)
      com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_SiteVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_SiteVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1alpha1.SiteVersion.class, com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1alpha1.SiteVersion.newBuilder()
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
      nfVendor_ = "";
      nfType_ = "";
      nfVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_SiteVersion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersion getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersion build() {
      com.google.cloud.telcoautomation.v1alpha1.SiteVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersion buildPartial() {
      com.google.cloud.telcoautomation.v1alpha1.SiteVersion result = new com.google.cloud.telcoautomation.v1alpha1.SiteVersion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1alpha1.SiteVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nfVendor_ = nfVendor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nfType_ = nfType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nfVersion_ = nfVersion_;
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
      if (other instanceof com.google.cloud.telcoautomation.v1alpha1.SiteVersion) {
        return mergeFrom((com.google.cloud.telcoautomation.v1alpha1.SiteVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1alpha1.SiteVersion other) {
      if (other == com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance()) return this;
      if (!other.getNfVendor().isEmpty()) {
        nfVendor_ = other.nfVendor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNfType().isEmpty()) {
        nfType_ = other.nfType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNfVersion().isEmpty()) {
        nfVersion_ = other.nfVersion_;
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
              nfVendor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              nfType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              nfVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object nfVendor_ = "";
    /**
     * <pre>
     * Output only. NF vendor.
     * </pre>
     *
     * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The nfVendor.
     */
    public java.lang.String getNfVendor() {
      java.lang.Object ref = nfVendor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nfVendor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF vendor.
     * </pre>
     *
     * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for nfVendor.
     */
    public com.google.protobuf.ByteString
        getNfVendorBytes() {
      java.lang.Object ref = nfVendor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nfVendor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF vendor.
     * </pre>
     *
     * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The nfVendor to set.
     * @return This builder for chaining.
     */
    public Builder setNfVendor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nfVendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF vendor.
     * </pre>
     *
     * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearNfVendor() {
      nfVendor_ = getDefaultInstance().getNfVendor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF vendor.
     * </pre>
     *
     * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for nfVendor to set.
     * @return This builder for chaining.
     */
    public Builder setNfVendorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nfVendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nfType_ = "";
    /**
     * <pre>
     * Output only. NF vendor type.
     * </pre>
     *
     * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The nfType.
     */
    public java.lang.String getNfType() {
      java.lang.Object ref = nfType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nfType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF vendor type.
     * </pre>
     *
     * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for nfType.
     */
    public com.google.protobuf.ByteString
        getNfTypeBytes() {
      java.lang.Object ref = nfType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nfType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF vendor type.
     * </pre>
     *
     * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The nfType to set.
     * @return This builder for chaining.
     */
    public Builder setNfType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nfType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF vendor type.
     * </pre>
     *
     * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearNfType() {
      nfType_ = getDefaultInstance().getNfType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF vendor type.
     * </pre>
     *
     * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for nfType to set.
     * @return This builder for chaining.
     */
    public Builder setNfTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nfType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object nfVersion_ = "";
    /**
     * <pre>
     * Output only. NF version.
     * </pre>
     *
     * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The nfVersion.
     */
    public java.lang.String getNfVersion() {
      java.lang.Object ref = nfVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nfVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF version.
     * </pre>
     *
     * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for nfVersion.
     */
    public com.google.protobuf.ByteString
        getNfVersionBytes() {
      java.lang.Object ref = nfVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nfVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. NF version.
     * </pre>
     *
     * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The nfVersion to set.
     * @return This builder for chaining.
     */
    public Builder setNfVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nfVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF version.
     * </pre>
     *
     * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearNfVersion() {
      nfVersion_ = getDefaultInstance().getNfVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. NF version.
     * </pre>
     *
     * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for nfVersion to set.
     * @return This builder for chaining.
     */
    public Builder setNfVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nfVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1alpha1.SiteVersion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1alpha1.SiteVersion)
  private static final com.google.cloud.telcoautomation.v1alpha1.SiteVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1alpha1.SiteVersion();
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SiteVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SiteVersion>
      PARSER = new com.google.protobuf.AbstractParser<SiteVersion>() {
    @java.lang.Override
    public SiteVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<SiteVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SiteVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.SiteVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

