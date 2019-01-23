// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/** Protobuf type {@code google.spanner.admin.database.v1.RestoreInfo} */
public final class RestoreInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.RestoreInfo)
    RestoreInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RestoreInfo.newBuilder() to construct.
  private RestoreInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RestoreInfo() {
    sourceType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RestoreInfo(
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
          case 8:
            {
              int rawValue = input.readEnum();

              sourceType_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.spanner.admin.database.v1.BackupInfo.Builder subBuilder = null;
              if (sourceInfoCase_ == 2) {
                subBuilder =
                    ((com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_).toBuilder();
              }
              sourceInfo_ =
                  input.readMessage(
                      com.google.spanner.admin.database.v1.BackupInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_);
                sourceInfo_ = subBuilder.buildPartial();
              }
              sourceInfoCase_ = 2;
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
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_RestoreInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.RestoreInfo.class,
            com.google.spanner.admin.database.v1.RestoreInfo.Builder.class);
  }

  private int sourceInfoCase_ = 0;
  private java.lang.Object sourceInfo_;

  public enum SourceInfoCase implements com.google.protobuf.Internal.EnumLite {
    BACKUP_INFO(2),
    SOURCEINFO_NOT_SET(0);
    private final int value;

    private SourceInfoCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static SourceInfoCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceInfoCase forNumber(int value) {
      switch (value) {
        case 2:
          return BACKUP_INFO;
        case 0:
          return SOURCEINFO_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceInfoCase getSourceInfoCase() {
    return SourceInfoCase.forNumber(sourceInfoCase_);
  }

  public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
  private int sourceType_;
  /**
   *
   *
   * <pre>
   * The type of the restore source.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
   */
  public int getSourceTypeValue() {
    return sourceType_;
  }
  /**
   *
   *
   * <pre>
   * The type of the restore source.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
   */
  public com.google.spanner.admin.database.v1.RestoreSourceType getSourceType() {
    @SuppressWarnings("deprecation")
    com.google.spanner.admin.database.v1.RestoreSourceType result =
        com.google.spanner.admin.database.v1.RestoreSourceType.valueOf(sourceType_);
    return result == null
        ? com.google.spanner.admin.database.v1.RestoreSourceType.UNRECOGNIZED
        : result;
  }

  public static final int BACKUP_INFO_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Information about the backup used to restore the database. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
   */
  public boolean hasBackupInfo() {
    return sourceInfoCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Information about the backup used to restore the database. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
   */
  public com.google.spanner.admin.database.v1.BackupInfo getBackupInfo() {
    if (sourceInfoCase_ == 2) {
      return (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_;
    }
    return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Information about the backup used to restore the database. The backup
   * may no longer exist.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
   */
  public com.google.spanner.admin.database.v1.BackupInfoOrBuilder getBackupInfoOrBuilder() {
    if (sourceInfoCase_ == 2) {
      return (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_;
    }
    return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
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
    if (sourceType_
        != com.google.spanner.admin.database.v1.RestoreSourceType.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, sourceType_);
    }
    if (sourceInfoCase_ == 2) {
      output.writeMessage(2, (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceType_
        != com.google.spanner.admin.database.v1.RestoreSourceType.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, sourceType_);
    }
    if (sourceInfoCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_);
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.RestoreInfo)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.RestoreInfo other =
        (com.google.spanner.admin.database.v1.RestoreInfo) obj;

    boolean result = true;
    result = result && sourceType_ == other.sourceType_;
    result = result && getSourceInfoCase().equals(other.getSourceInfoCase());
    if (!result) return false;
    switch (sourceInfoCase_) {
      case 2:
        result = result && getBackupInfo().equals(other.getBackupInfo());
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + sourceType_;
    switch (sourceInfoCase_) {
      case 2:
        hash = (37 * hash) + BACKUP_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBackupInfo().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo parseFrom(
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

  public static Builder newBuilder(com.google.spanner.admin.database.v1.RestoreInfo prototype) {
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
  /** Protobuf type {@code google.spanner.admin.database.v1.RestoreInfo} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.RestoreInfo)
      com.google.spanner.admin.database.v1.RestoreInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_RestoreInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.RestoreInfo.class,
              com.google.spanner.admin.database.v1.RestoreInfo.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.RestoreInfo.newBuilder()
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
      sourceType_ = 0;

      sourceInfoCase_ = 0;
      sourceInfo_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.RestoreInfo getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.RestoreInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.RestoreInfo build() {
      com.google.spanner.admin.database.v1.RestoreInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.RestoreInfo buildPartial() {
      com.google.spanner.admin.database.v1.RestoreInfo result =
          new com.google.spanner.admin.database.v1.RestoreInfo(this);
      result.sourceType_ = sourceType_;
      if (sourceInfoCase_ == 2) {
        if (backupInfoBuilder_ == null) {
          result.sourceInfo_ = sourceInfo_;
        } else {
          result.sourceInfo_ = backupInfoBuilder_.build();
        }
      }
      result.sourceInfoCase_ = sourceInfoCase_;
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
      if (other instanceof com.google.spanner.admin.database.v1.RestoreInfo) {
        return mergeFrom((com.google.spanner.admin.database.v1.RestoreInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.RestoreInfo other) {
      if (other == com.google.spanner.admin.database.v1.RestoreInfo.getDefaultInstance())
        return this;
      if (other.sourceType_ != 0) {
        setSourceTypeValue(other.getSourceTypeValue());
      }
      switch (other.getSourceInfoCase()) {
        case BACKUP_INFO:
          {
            mergeBackupInfo(other.getBackupInfo());
            break;
          }
        case SOURCEINFO_NOT_SET:
          {
            break;
          }
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
      com.google.spanner.admin.database.v1.RestoreInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.database.v1.RestoreInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceInfoCase_ = 0;
    private java.lang.Object sourceInfo_;

    public SourceInfoCase getSourceInfoCase() {
      return SourceInfoCase.forNumber(sourceInfoCase_);
    }

    public Builder clearSourceInfo() {
      sourceInfoCase_ = 0;
      sourceInfo_ = null;
      onChanged();
      return this;
    }

    private int sourceType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of the restore source.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
     */
    public int getSourceTypeValue() {
      return sourceType_;
    }
    /**
     *
     *
     * <pre>
     * The type of the restore source.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
     */
    public Builder setSourceTypeValue(int value) {
      sourceType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the restore source.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
     */
    public com.google.spanner.admin.database.v1.RestoreSourceType getSourceType() {
      @SuppressWarnings("deprecation")
      com.google.spanner.admin.database.v1.RestoreSourceType result =
          com.google.spanner.admin.database.v1.RestoreSourceType.valueOf(sourceType_);
      return result == null
          ? com.google.spanner.admin.database.v1.RestoreSourceType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of the restore source.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
     */
    public Builder setSourceType(com.google.spanner.admin.database.v1.RestoreSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the restore source.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.RestoreSourceType source_type = 1;</code>
     */
    public Builder clearSourceType() {

      sourceType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.admin.database.v1.BackupInfo,
            com.google.spanner.admin.database.v1.BackupInfo.Builder,
            com.google.spanner.admin.database.v1.BackupInfoOrBuilder>
        backupInfoBuilder_;
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public boolean hasBackupInfo() {
      return sourceInfoCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public com.google.spanner.admin.database.v1.BackupInfo getBackupInfo() {
      if (backupInfoBuilder_ == null) {
        if (sourceInfoCase_ == 2) {
          return (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_;
        }
        return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
      } else {
        if (sourceInfoCase_ == 2) {
          return backupInfoBuilder_.getMessage();
        }
        return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public Builder setBackupInfo(com.google.spanner.admin.database.v1.BackupInfo value) {
      if (backupInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceInfo_ = value;
        onChanged();
      } else {
        backupInfoBuilder_.setMessage(value);
      }
      sourceInfoCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public Builder setBackupInfo(
        com.google.spanner.admin.database.v1.BackupInfo.Builder builderForValue) {
      if (backupInfoBuilder_ == null) {
        sourceInfo_ = builderForValue.build();
        onChanged();
      } else {
        backupInfoBuilder_.setMessage(builderForValue.build());
      }
      sourceInfoCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public Builder mergeBackupInfo(com.google.spanner.admin.database.v1.BackupInfo value) {
      if (backupInfoBuilder_ == null) {
        if (sourceInfoCase_ == 2
            && sourceInfo_
                != com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance()) {
          sourceInfo_ =
              com.google.spanner.admin.database.v1.BackupInfo.newBuilder(
                      (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sourceInfo_ = value;
        }
        onChanged();
      } else {
        if (sourceInfoCase_ == 2) {
          backupInfoBuilder_.mergeFrom(value);
        }
        backupInfoBuilder_.setMessage(value);
      }
      sourceInfoCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public Builder clearBackupInfo() {
      if (backupInfoBuilder_ == null) {
        if (sourceInfoCase_ == 2) {
          sourceInfoCase_ = 0;
          sourceInfo_ = null;
          onChanged();
        }
      } else {
        if (sourceInfoCase_ == 2) {
          sourceInfoCase_ = 0;
          sourceInfo_ = null;
        }
        backupInfoBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public com.google.spanner.admin.database.v1.BackupInfo.Builder getBackupInfoBuilder() {
      return getBackupInfoFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    public com.google.spanner.admin.database.v1.BackupInfoOrBuilder getBackupInfoOrBuilder() {
      if ((sourceInfoCase_ == 2) && (backupInfoBuilder_ != null)) {
        return backupInfoBuilder_.getMessageOrBuilder();
      } else {
        if (sourceInfoCase_ == 2) {
          return (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_;
        }
        return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the backup used to restore the database. The backup
     * may no longer exist.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.BackupInfo backup_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.admin.database.v1.BackupInfo,
            com.google.spanner.admin.database.v1.BackupInfo.Builder,
            com.google.spanner.admin.database.v1.BackupInfoOrBuilder>
        getBackupInfoFieldBuilder() {
      if (backupInfoBuilder_ == null) {
        if (!(sourceInfoCase_ == 2)) {
          sourceInfo_ = com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
        }
        backupInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.admin.database.v1.BackupInfo,
                com.google.spanner.admin.database.v1.BackupInfo.Builder,
                com.google.spanner.admin.database.v1.BackupInfoOrBuilder>(
                (com.google.spanner.admin.database.v1.BackupInfo) sourceInfo_,
                getParentForChildren(),
                isClean());
        sourceInfo_ = null;
      }
      sourceInfoCase_ = 2;
      onChanged();
      ;
      return backupInfoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.RestoreInfo)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.RestoreInfo)
  private static final com.google.spanner.admin.database.v1.RestoreInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.RestoreInfo();
  }

  public static com.google.spanner.admin.database.v1.RestoreInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreInfo> PARSER =
      new com.google.protobuf.AbstractParser<RestoreInfo>() {
        @java.lang.Override
        public RestoreInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RestoreInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RestoreInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.RestoreInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
