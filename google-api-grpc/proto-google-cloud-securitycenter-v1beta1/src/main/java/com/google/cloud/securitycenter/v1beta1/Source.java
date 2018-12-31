// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/source.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 *
 *
 * <pre>
 * Cloud Security Command Center's (Cloud SCC) finding source. A finding source
 * is an entity or a mechanism that can produce a finding. A source is like a
 * container of findings that come from the same scanner, logger, monitor, etc.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.Source}
 */
public final class Source extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.Source)
    SourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Source.newBuilder() to construct.
  private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Source() {
    name_ = "";
    displayName_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Source(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1beta1.SourceOuterClass
        .internal_static_google_cloud_securitycenter_v1beta1_Source_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.SourceOuterClass
        .internal_static_google_cloud_securitycenter_v1beta1_Source_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.Source.class,
            com.google.cloud.securitycenter.v1beta1.Source.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * The source’s display name.
   * A source’s display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must start and end with a letter or digit, may contain
   * letters, digits, spaces, hyphens, and underscores, and can be no longer
   * than 30 characters. This is captured by the regular expression:
   * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The source’s display name.
   * A source’s display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must start and end with a letter or digit, may contain
   * letters, digits, spaces, hyphens, and underscores, and can be no longer
   * than 30 characters. This is captured by the regular expression:
   * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Cloud Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Cloud Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.Source)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.Source other =
        (com.google.cloud.securitycenter.v1beta1.Source) obj;

    boolean result = true;
    result = result && getName().equals(other.getName());
    result = result && getDisplayName().equals(other.getDisplayName());
    result = result && getDescription().equals(other.getDescription());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.Source parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1beta1.Source prototype) {
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
   * Cloud Security Command Center's (Cloud SCC) finding source. A finding source
   * is an entity or a mechanism that can produce a finding. A source is like a
   * container of findings that come from the same scanner, logger, monitor, etc.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.Source}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.Source)
      com.google.cloud.securitycenter.v1beta1.SourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.SourceOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_Source_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.SourceOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_Source_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.Source.class,
              com.google.cloud.securitycenter.v1beta1.Source.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1beta1.Source.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      displayName_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.SourceOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_Source_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.Source getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.Source build() {
      com.google.cloud.securitycenter.v1beta1.Source result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.Source buildPartial() {
      com.google.cloud.securitycenter.v1beta1.Source result =
          new com.google.cloud.securitycenter.v1beta1.Source(this);
      result.name_ = name_;
      result.displayName_ = displayName_;
      result.description_ = description_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1beta1.Source) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.Source) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1beta1.Source other) {
      if (other == com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.securitycenter.v1beta1.Source parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1beta1.Source) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The relative resource name of this source. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456"
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of this source. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456"
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of this source. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456"
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of this source. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456"
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of this source. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456"
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * The source’s display name.
     * A source’s display name must be unique amongst its siblings, for example,
     * two sources with the same parent can't share the same display name.
     * The display name must start and end with a letter or digit, may contain
     * letters, digits, spaces, hyphens, and underscores, and can be no longer
     * than 30 characters. This is captured by the regular expression:
     * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source’s display name.
     * A source’s display name must be unique amongst its siblings, for example,
     * two sources with the same parent can't share the same display name.
     * The display name must start and end with a letter or digit, may contain
     * letters, digits, spaces, hyphens, and underscores, and can be no longer
     * than 30 characters. This is captured by the regular expression:
     * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source’s display name.
     * A source’s display name must be unique amongst its siblings, for example,
     * two sources with the same parent can't share the same display name.
     * The display name must start and end with a letter or digit, may contain
     * letters, digits, spaces, hyphens, and underscores, and can be no longer
     * than 30 characters. This is captured by the regular expression:
     * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source’s display name.
     * A source’s display name must be unique amongst its siblings, for example,
     * two sources with the same parent can't share the same display name.
     * The display name must start and end with a letter or digit, may contain
     * letters, digits, spaces, hyphens, and underscores, and can be no longer
     * than 30 characters. This is captured by the regular expression:
     * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source’s display name.
     * A source’s display name must be unique amongst its siblings, for example,
     * two sources with the same parent can't share the same display name.
     * The display name must start and end with a letter or digit, may contain
     * letters, digits, spaces, hyphens, and underscores, and can be no longer
     * than 30 characters. This is captured by the regular expression:
     * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * The description of the source (max of 1024 characters).
     * Example:
     * "Cloud Security Scanner is a web security scanner for common
     * vulnerabilities in App Engine applications. It can automatically
     * scan and detect four common vulnerabilities, including cross-site-scripting
     * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
     * outdated/insecure libraries."
     * </pre>
     *
     * <code>string description = 3;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The description of the source (max of 1024 characters).
     * Example:
     * "Cloud Security Scanner is a web security scanner for common
     * vulnerabilities in App Engine applications. It can automatically
     * scan and detect four common vulnerabilities, including cross-site-scripting
     * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
     * outdated/insecure libraries."
     * </pre>
     *
     * <code>string description = 3;</code>
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The description of the source (max of 1024 characters).
     * Example:
     * "Cloud Security Scanner is a web security scanner for common
     * vulnerabilities in App Engine applications. It can automatically
     * scan and detect four common vulnerabilities, including cross-site-scripting
     * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
     * outdated/insecure libraries."
     * </pre>
     *
     * <code>string description = 3;</code>
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The description of the source (max of 1024 characters).
     * Example:
     * "Cloud Security Scanner is a web security scanner for common
     * vulnerabilities in App Engine applications. It can automatically
     * scan and detect four common vulnerabilities, including cross-site-scripting
     * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
     * outdated/insecure libraries."
     * </pre>
     *
     * <code>string description = 3;</code>
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The description of the source (max of 1024 characters).
     * Example:
     * "Cloud Security Scanner is a web security scanner for common
     * vulnerabilities in App Engine applications. It can automatically
     * scan and detect four common vulnerabilities, including cross-site-scripting
     * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
     * outdated/insecure libraries."
     * </pre>
     *
     * <code>string description = 3;</code>
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.Source)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.Source)
  private static final com.google.cloud.securitycenter.v1beta1.Source DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.Source();
  }

  public static com.google.cloud.securitycenter.v1beta1.Source getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Source> PARSER =
      new com.google.protobuf.AbstractParser<Source>() {
        @java.lang.Override
        public Source parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Source(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Source> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Source> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.Source getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
