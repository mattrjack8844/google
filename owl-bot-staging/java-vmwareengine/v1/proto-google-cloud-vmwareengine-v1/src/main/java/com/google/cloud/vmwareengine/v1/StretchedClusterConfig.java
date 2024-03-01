// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmwareengine.v1;

/**
 * <pre>
 * Configuration of a stretched cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.StretchedClusterConfig}
 */
public final class StretchedClusterConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.StretchedClusterConfig)
    StretchedClusterConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StretchedClusterConfig.newBuilder() to construct.
  private StretchedClusterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StretchedClusterConfig() {
    preferredLocation_ = "";
    secondaryLocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StretchedClusterConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto.internal_static_google_cloud_vmwareengine_v1_StretchedClusterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto.internal_static_google_cloud_vmwareengine_v1_StretchedClusterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.StretchedClusterConfig.class, com.google.cloud.vmwareengine.v1.StretchedClusterConfig.Builder.class);
  }

  public static final int PREFERRED_LOCATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object preferredLocation_ = "";
  /**
   * <pre>
   * Required. Zone that will remain operational when connection between the two
   * zones is lost. Specify the resource name of a zone that belongs to the
   * region of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-a` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The preferredLocation.
   */
  @java.lang.Override
  public java.lang.String getPreferredLocation() {
    java.lang.Object ref = preferredLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preferredLocation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Zone that will remain operational when connection between the two
   * zones is lost. Specify the resource name of a zone that belongs to the
   * region of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-a` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for preferredLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreferredLocationBytes() {
    java.lang.Object ref = preferredLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preferredLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECONDARY_LOCATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secondaryLocation_ = "";
  /**
   * <pre>
   * Required. Additional zone for a higher level of availability and load
   * balancing. Specify the resource name of a zone that belongs to the region
   * of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-b` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The secondaryLocation.
   */
  @java.lang.Override
  public java.lang.String getSecondaryLocation() {
    java.lang.Object ref = secondaryLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secondaryLocation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Additional zone for a higher level of availability and load
   * balancing. Specify the resource name of a zone that belongs to the region
   * of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-b` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for secondaryLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecondaryLocationBytes() {
    java.lang.Object ref = secondaryLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secondaryLocation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preferredLocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, preferredLocation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryLocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secondaryLocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preferredLocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, preferredLocation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryLocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secondaryLocation_);
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.StretchedClusterConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.StretchedClusterConfig other = (com.google.cloud.vmwareengine.v1.StretchedClusterConfig) obj;

    if (!getPreferredLocation()
        .equals(other.getPreferredLocation())) return false;
    if (!getSecondaryLocation()
        .equals(other.getSecondaryLocation())) return false;
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
    hash = (37 * hash) + PREFERRED_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getPreferredLocation().hashCode();
    hash = (37 * hash) + SECONDARY_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getSecondaryLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.StretchedClusterConfig prototype) {
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
   * Configuration of a stretched cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.StretchedClusterConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.StretchedClusterConfig)
      com.google.cloud.vmwareengine.v1.StretchedClusterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto.internal_static_google_cloud_vmwareengine_v1_StretchedClusterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto.internal_static_google_cloud_vmwareengine_v1_StretchedClusterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.StretchedClusterConfig.class, com.google.cloud.vmwareengine.v1.StretchedClusterConfig.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.StretchedClusterConfig.newBuilder()
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
      preferredLocation_ = "";
      secondaryLocation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto.internal_static_google_cloud_vmwareengine_v1_StretchedClusterConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.StretchedClusterConfig getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.StretchedClusterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.StretchedClusterConfig build() {
      com.google.cloud.vmwareengine.v1.StretchedClusterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.StretchedClusterConfig buildPartial() {
      com.google.cloud.vmwareengine.v1.StretchedClusterConfig result = new com.google.cloud.vmwareengine.v1.StretchedClusterConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.StretchedClusterConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.preferredLocation_ = preferredLocation_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secondaryLocation_ = secondaryLocation_;
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
      if (other instanceof com.google.cloud.vmwareengine.v1.StretchedClusterConfig) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.StretchedClusterConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.StretchedClusterConfig other) {
      if (other == com.google.cloud.vmwareengine.v1.StretchedClusterConfig.getDefaultInstance()) return this;
      if (!other.getPreferredLocation().isEmpty()) {
        preferredLocation_ = other.preferredLocation_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecondaryLocation().isEmpty()) {
        secondaryLocation_ = other.secondaryLocation_;
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
            case 10: {
              preferredLocation_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              secondaryLocation_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object preferredLocation_ = "";
    /**
     * <pre>
     * Required. Zone that will remain operational when connection between the two
     * zones is lost. Specify the resource name of a zone that belongs to the
     * region of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-a` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The preferredLocation.
     */
    public java.lang.String getPreferredLocation() {
      java.lang.Object ref = preferredLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preferredLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Zone that will remain operational when connection between the two
     * zones is lost. Specify the resource name of a zone that belongs to the
     * region of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-a` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for preferredLocation.
     */
    public com.google.protobuf.ByteString
        getPreferredLocationBytes() {
      java.lang.Object ref = preferredLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preferredLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Zone that will remain operational when connection between the two
     * zones is lost. Specify the resource name of a zone that belongs to the
     * region of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-a` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The preferredLocation to set.
     * @return This builder for chaining.
     */
    public Builder setPreferredLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      preferredLocation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Zone that will remain operational when connection between the two
     * zones is lost. Specify the resource name of a zone that belongs to the
     * region of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-a` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPreferredLocation() {
      preferredLocation_ = getDefaultInstance().getPreferredLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Zone that will remain operational when connection between the two
     * zones is lost. Specify the resource name of a zone that belongs to the
     * region of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-a` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for preferredLocation to set.
     * @return This builder for chaining.
     */
    public Builder setPreferredLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      preferredLocation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secondaryLocation_ = "";
    /**
     * <pre>
     * Required. Additional zone for a higher level of availability and load
     * balancing. Specify the resource name of a zone that belongs to the region
     * of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-b` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The secondaryLocation.
     */
    public java.lang.String getSecondaryLocation() {
      java.lang.Object ref = secondaryLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secondaryLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Additional zone for a higher level of availability and load
     * balancing. Specify the resource name of a zone that belongs to the region
     * of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-b` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for secondaryLocation.
     */
    public com.google.protobuf.ByteString
        getSecondaryLocationBytes() {
      java.lang.Object ref = secondaryLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secondaryLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Additional zone for a higher level of availability and load
     * balancing. Specify the resource name of a zone that belongs to the region
     * of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-b` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The secondaryLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secondaryLocation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Additional zone for a higher level of availability and load
     * balancing. Specify the resource name of a zone that belongs to the region
     * of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-b` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondaryLocation() {
      secondaryLocation_ = getDefaultInstance().getSecondaryLocation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Additional zone for a higher level of availability and load
     * balancing. Specify the resource name of a zone that belongs to the region
     * of the private cloud. For example:
     * `projects/{project}/locations/europe-west3-b` where `{project}` can either
     * be a project number or a project ID.
     * </pre>
     *
     * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for secondaryLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secondaryLocation_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.StretchedClusterConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.StretchedClusterConfig)
  private static final com.google.cloud.vmwareengine.v1.StretchedClusterConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.StretchedClusterConfig();
  }

  public static com.google.cloud.vmwareengine.v1.StretchedClusterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StretchedClusterConfig>
      PARSER = new com.google.protobuf.AbstractParser<StretchedClusterConfig>() {
    @java.lang.Override
    public StretchedClusterConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<StretchedClusterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StretchedClusterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.StretchedClusterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

