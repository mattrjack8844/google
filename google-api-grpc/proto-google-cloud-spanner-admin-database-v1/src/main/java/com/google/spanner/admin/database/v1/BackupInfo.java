// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/backup.proto

package com.google.spanner.admin.database.v1;

/** Protobuf type {@code google.spanner.admin.database.v1.BackupInfo} */
public final class BackupInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.BackupInfo)
    BackupInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BackupInfo.newBuilder() to construct.
  private BackupInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackupInfo() {
    backup_ = "";
    sourceDatabase_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BackupInfo(
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

              backup_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (createTime_ != null) {
                subBuilder = createTime_.toBuilder();
              }
              createTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(createTime_);
                createTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              sourceDatabase_ = s;
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
    return com.google.spanner.admin.database.v1.BackupOuterClass
        .internal_static_google_spanner_admin_database_v1_BackupInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.BackupOuterClass
        .internal_static_google_spanner_admin_database_v1_BackupInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.BackupInfo.class,
            com.google.spanner.admin.database.v1.BackupInfo.Builder.class);
  }

  public static final int BACKUP_FIELD_NUMBER = 1;
  private volatile java.lang.Object backup_;
  /**
   *
   *
   * <pre>
   * Name of the backup.
   * </pre>
   *
   * <code>string backup = 1;</code>
   */
  public java.lang.String getBackup() {
    java.lang.Object ref = backup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backup_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the backup.
   * </pre>
   *
   * <code>string backup = 1;</code>
   */
  public com.google.protobuf.ByteString getBackupBytes() {
    java.lang.Object ref = backup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * The backup contains an externally consistent copy of `source_database` at
   * the timestamp specified by `create_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The backup contains an externally consistent copy of `source_database` at
   * the timestamp specified by `create_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   *
   *
   * <pre>
   * The backup contains an externally consistent copy of `source_database` at
   * the timestamp specified by `create_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int SOURCE_DATABASE_FIELD_NUMBER = 3;
  private volatile java.lang.Object sourceDatabase_;
  /**
   *
   *
   * <pre>
   * Name of the database the backup was created from.
   * </pre>
   *
   * <code>string source_database = 3;</code>
   */
  public java.lang.String getSourceDatabase() {
    java.lang.Object ref = sourceDatabase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceDatabase_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the database the backup was created from.
   * </pre>
   *
   * <code>string source_database = 3;</code>
   */
  public com.google.protobuf.ByteString getSourceDatabaseBytes() {
    java.lang.Object ref = sourceDatabase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceDatabase_ = b;
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
    if (!getBackupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, backup_);
    }
    if (createTime_ != null) {
      output.writeMessage(2, getCreateTime());
    }
    if (!getSourceDatabaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceDatabase_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBackupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, backup_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCreateTime());
    }
    if (!getSourceDatabaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceDatabase_);
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.BackupInfo)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.BackupInfo other =
        (com.google.spanner.admin.database.v1.BackupInfo) obj;

    boolean result = true;
    result = result && getBackup().equals(other.getBackup());
    result = result && (hasCreateTime() == other.hasCreateTime());
    if (hasCreateTime()) {
      result = result && getCreateTime().equals(other.getCreateTime());
    }
    result = result && getSourceDatabase().equals(other.getSourceDatabase());
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
    hash = (37 * hash) + BACKUP_FIELD_NUMBER;
    hash = (53 * hash) + getBackup().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + SOURCE_DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceDatabase().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.BackupInfo parseFrom(
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

  public static Builder newBuilder(com.google.spanner.admin.database.v1.BackupInfo prototype) {
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
  /** Protobuf type {@code google.spanner.admin.database.v1.BackupInfo} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.BackupInfo)
      com.google.spanner.admin.database.v1.BackupInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.BackupOuterClass
          .internal_static_google_spanner_admin_database_v1_BackupInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.BackupOuterClass
          .internal_static_google_spanner_admin_database_v1_BackupInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.BackupInfo.class,
              com.google.spanner.admin.database.v1.BackupInfo.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.BackupInfo.newBuilder()
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
      backup_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      sourceDatabase_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.BackupOuterClass
          .internal_static_google_spanner_admin_database_v1_BackupInfo_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.BackupInfo getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.BackupInfo build() {
      com.google.spanner.admin.database.v1.BackupInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.BackupInfo buildPartial() {
      com.google.spanner.admin.database.v1.BackupInfo result =
          new com.google.spanner.admin.database.v1.BackupInfo(this);
      result.backup_ = backup_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.sourceDatabase_ = sourceDatabase_;
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
      if (other instanceof com.google.spanner.admin.database.v1.BackupInfo) {
        return mergeFrom((com.google.spanner.admin.database.v1.BackupInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.BackupInfo other) {
      if (other == com.google.spanner.admin.database.v1.BackupInfo.getDefaultInstance())
        return this;
      if (!other.getBackup().isEmpty()) {
        backup_ = other.backup_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (!other.getSourceDatabase().isEmpty()) {
        sourceDatabase_ = other.sourceDatabase_;
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
      com.google.spanner.admin.database.v1.BackupInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.database.v1.BackupInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object backup_ = "";
    /**
     *
     *
     * <pre>
     * Name of the backup.
     * </pre>
     *
     * <code>string backup = 1;</code>
     */
    public java.lang.String getBackup() {
      java.lang.Object ref = backup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the backup.
     * </pre>
     *
     * <code>string backup = 1;</code>
     */
    public com.google.protobuf.ByteString getBackupBytes() {
      java.lang.Object ref = backup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the backup.
     * </pre>
     *
     * <code>string backup = 1;</code>
     */
    public Builder setBackup(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      backup_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the backup.
     * </pre>
     *
     * <code>string backup = 1;</code>
     */
    public Builder clearBackup() {

      backup_ = getDefaultInstance().getBackup();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the backup.
     * </pre>
     *
     * <code>string backup = 1;</code>
     */
    public Builder setBackupBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      backup_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        createTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
              com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {

      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The backup contains an externally consistent copy of `source_database` at
     * the timestamp specified by `create_time`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(), getParentForChildren(), isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private java.lang.Object sourceDatabase_ = "";
    /**
     *
     *
     * <pre>
     * Name of the database the backup was created from.
     * </pre>
     *
     * <code>string source_database = 3;</code>
     */
    public java.lang.String getSourceDatabase() {
      java.lang.Object ref = sourceDatabase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceDatabase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the database the backup was created from.
     * </pre>
     *
     * <code>string source_database = 3;</code>
     */
    public com.google.protobuf.ByteString getSourceDatabaseBytes() {
      java.lang.Object ref = sourceDatabase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceDatabase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the database the backup was created from.
     * </pre>
     *
     * <code>string source_database = 3;</code>
     */
    public Builder setSourceDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sourceDatabase_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the database the backup was created from.
     * </pre>
     *
     * <code>string source_database = 3;</code>
     */
    public Builder clearSourceDatabase() {

      sourceDatabase_ = getDefaultInstance().getSourceDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the database the backup was created from.
     * </pre>
     *
     * <code>string source_database = 3;</code>
     */
    public Builder setSourceDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      sourceDatabase_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.BackupInfo)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.BackupInfo)
  private static final com.google.spanner.admin.database.v1.BackupInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.BackupInfo();
  }

  public static com.google.spanner.admin.database.v1.BackupInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupInfo> PARSER =
      new com.google.protobuf.AbstractParser<BackupInfo>() {
        @java.lang.Override
        public BackupInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BackupInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BackupInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.BackupInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
