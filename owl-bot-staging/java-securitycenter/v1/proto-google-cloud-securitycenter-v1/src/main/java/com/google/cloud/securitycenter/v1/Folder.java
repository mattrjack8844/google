// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/folder.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * Message that contains the resource name and display name of a folder
 * resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.Folder}
 */
public final class Folder extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.Folder)
    FolderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Folder.newBuilder() to construct.
  private Folder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Folder() {
    resourceFolder_ = "";
    resourceFolderDisplayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Folder();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1.FolderProto.internal_static_google_cloud_securitycenter_v1_Folder_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.FolderProto.internal_static_google_cloud_securitycenter_v1_Folder_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.Folder.class, com.google.cloud.securitycenter.v1.Folder.Builder.class);
  }

  public static final int RESOURCE_FOLDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceFolder_ = "";
  /**
   * <pre>
   * Full resource name of this folder. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string resource_folder = 1;</code>
   * @return The resourceFolder.
   */
  @java.lang.Override
  public java.lang.String getResourceFolder() {
    java.lang.Object ref = resourceFolder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceFolder_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Full resource name of this folder. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string resource_folder = 1;</code>
   * @return The bytes for resourceFolder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceFolderBytes() {
    java.lang.Object ref = resourceFolder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceFolder_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FOLDER_DISPLAY_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceFolderDisplayName_ = "";
  /**
   * <pre>
   * The user defined display name for this folder.
   * </pre>
   *
   * <code>string resource_folder_display_name = 2;</code>
   * @return The resourceFolderDisplayName.
   */
  @java.lang.Override
  public java.lang.String getResourceFolderDisplayName() {
    java.lang.Object ref = resourceFolderDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceFolderDisplayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user defined display name for this folder.
   * </pre>
   *
   * <code>string resource_folder_display_name = 2;</code>
   * @return The bytes for resourceFolderDisplayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceFolderDisplayNameBytes() {
    java.lang.Object ref = resourceFolderDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceFolderDisplayName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceFolder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceFolder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceFolderDisplayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceFolderDisplayName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceFolder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceFolder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceFolderDisplayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceFolderDisplayName_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.Folder)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.Folder other = (com.google.cloud.securitycenter.v1.Folder) obj;

    if (!getResourceFolder()
        .equals(other.getResourceFolder())) return false;
    if (!getResourceFolderDisplayName()
        .equals(other.getResourceFolderDisplayName())) return false;
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
    hash = (37 * hash) + RESOURCE_FOLDER_FIELD_NUMBER;
    hash = (53 * hash) + getResourceFolder().hashCode();
    hash = (37 * hash) + RESOURCE_FOLDER_DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceFolderDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.Folder parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.Folder prototype) {
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
   * Message that contains the resource name and display name of a folder
   * resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.Folder}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.Folder)
      com.google.cloud.securitycenter.v1.FolderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.FolderProto.internal_static_google_cloud_securitycenter_v1_Folder_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.FolderProto.internal_static_google_cloud_securitycenter_v1_Folder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.Folder.class, com.google.cloud.securitycenter.v1.Folder.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.Folder.newBuilder()
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
      resourceFolder_ = "";
      resourceFolderDisplayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.FolderProto.internal_static_google_cloud_securitycenter_v1_Folder_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Folder getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.Folder.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Folder build() {
      com.google.cloud.securitycenter.v1.Folder result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Folder buildPartial() {
      com.google.cloud.securitycenter.v1.Folder result = new com.google.cloud.securitycenter.v1.Folder(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.Folder result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceFolder_ = resourceFolder_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceFolderDisplayName_ = resourceFolderDisplayName_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.Folder) {
        return mergeFrom((com.google.cloud.securitycenter.v1.Folder)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.Folder other) {
      if (other == com.google.cloud.securitycenter.v1.Folder.getDefaultInstance()) return this;
      if (!other.getResourceFolder().isEmpty()) {
        resourceFolder_ = other.resourceFolder_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResourceFolderDisplayName().isEmpty()) {
        resourceFolderDisplayName_ = other.resourceFolderDisplayName_;
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
              resourceFolder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              resourceFolderDisplayName_ = input.readStringRequireUtf8();
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

    private java.lang.Object resourceFolder_ = "";
    /**
     * <pre>
     * Full resource name of this folder. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * </pre>
     *
     * <code>string resource_folder = 1;</code>
     * @return The resourceFolder.
     */
    public java.lang.String getResourceFolder() {
      java.lang.Object ref = resourceFolder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceFolder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Full resource name of this folder. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * </pre>
     *
     * <code>string resource_folder = 1;</code>
     * @return The bytes for resourceFolder.
     */
    public com.google.protobuf.ByteString
        getResourceFolderBytes() {
      java.lang.Object ref = resourceFolder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceFolder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Full resource name of this folder. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * </pre>
     *
     * <code>string resource_folder = 1;</code>
     * @param value The resourceFolder to set.
     * @return This builder for chaining.
     */
    public Builder setResourceFolder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceFolder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full resource name of this folder. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * </pre>
     *
     * <code>string resource_folder = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceFolder() {
      resourceFolder_ = getDefaultInstance().getResourceFolder();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full resource name of this folder. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * </pre>
     *
     * <code>string resource_folder = 1;</code>
     * @param value The bytes for resourceFolder to set.
     * @return This builder for chaining.
     */
    public Builder setResourceFolderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceFolder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object resourceFolderDisplayName_ = "";
    /**
     * <pre>
     * The user defined display name for this folder.
     * </pre>
     *
     * <code>string resource_folder_display_name = 2;</code>
     * @return The resourceFolderDisplayName.
     */
    public java.lang.String getResourceFolderDisplayName() {
      java.lang.Object ref = resourceFolderDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceFolderDisplayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user defined display name for this folder.
     * </pre>
     *
     * <code>string resource_folder_display_name = 2;</code>
     * @return The bytes for resourceFolderDisplayName.
     */
    public com.google.protobuf.ByteString
        getResourceFolderDisplayNameBytes() {
      java.lang.Object ref = resourceFolderDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceFolderDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user defined display name for this folder.
     * </pre>
     *
     * <code>string resource_folder_display_name = 2;</code>
     * @param value The resourceFolderDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceFolderDisplayName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceFolderDisplayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user defined display name for this folder.
     * </pre>
     *
     * <code>string resource_folder_display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceFolderDisplayName() {
      resourceFolderDisplayName_ = getDefaultInstance().getResourceFolderDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user defined display name for this folder.
     * </pre>
     *
     * <code>string resource_folder_display_name = 2;</code>
     * @param value The bytes for resourceFolderDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceFolderDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceFolderDisplayName_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.Folder)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.Folder)
  private static final com.google.cloud.securitycenter.v1.Folder DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.Folder();
  }

  public static com.google.cloud.securitycenter.v1.Folder getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Folder>
      PARSER = new com.google.protobuf.AbstractParser<Folder>() {
    @java.lang.Override
    public Folder parsePartialFrom(
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

  public static com.google.protobuf.Parser<Folder> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Folder> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Folder getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

