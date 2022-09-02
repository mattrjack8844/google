// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * A summary of import result. The UserEventImportSummary summarizes
 * the import status for user events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.UserEventImportSummary}
 */
public final class UserEventImportSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.UserEventImportSummary)
    UserEventImportSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserEventImportSummary.newBuilder() to construct.
  private UserEventImportSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserEventImportSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserEventImportSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserEventImportSummary(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            joinedEventsCount_ = input.readInt64();
            break;
          }
          case 16: {

            unjoinedEventsCount_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_UserEventImportSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.UserEventImportSummary.class, com.google.cloud.retail.v2beta.UserEventImportSummary.Builder.class);
  }

  public static final int JOINED_EVENTS_COUNT_FIELD_NUMBER = 1;
  private long joinedEventsCount_;
  /**
   * <pre>
   * Count of user events imported with complete existing catalog information.
   * </pre>
   *
   * <code>int64 joined_events_count = 1;</code>
   * @return The joinedEventsCount.
   */
  @java.lang.Override
  public long getJoinedEventsCount() {
    return joinedEventsCount_;
  }

  public static final int UNJOINED_EVENTS_COUNT_FIELD_NUMBER = 2;
  private long unjoinedEventsCount_;
  /**
   * <pre>
   * Count of user events imported, but with catalog information not found
   * in the imported catalog.
   * </pre>
   *
   * <code>int64 unjoined_events_count = 2;</code>
   * @return The unjoinedEventsCount.
   */
  @java.lang.Override
  public long getUnjoinedEventsCount() {
    return unjoinedEventsCount_;
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
    if (joinedEventsCount_ != 0L) {
      output.writeInt64(1, joinedEventsCount_);
    }
    if (unjoinedEventsCount_ != 0L) {
      output.writeInt64(2, unjoinedEventsCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (joinedEventsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, joinedEventsCount_);
    }
    if (unjoinedEventsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, unjoinedEventsCount_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.UserEventImportSummary)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.UserEventImportSummary other = (com.google.cloud.retail.v2beta.UserEventImportSummary) obj;

    if (getJoinedEventsCount()
        != other.getJoinedEventsCount()) return false;
    if (getUnjoinedEventsCount()
        != other.getUnjoinedEventsCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + JOINED_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJoinedEventsCount());
    hash = (37 * hash) + UNJOINED_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnjoinedEventsCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.UserEventImportSummary parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.UserEventImportSummary prototype) {
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
   * A summary of import result. The UserEventImportSummary summarizes
   * the import status for user events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.UserEventImportSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.UserEventImportSummary)
      com.google.cloud.retail.v2beta.UserEventImportSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_UserEventImportSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.UserEventImportSummary.class, com.google.cloud.retail.v2beta.UserEventImportSummary.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.UserEventImportSummary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      joinedEventsCount_ = 0L;

      unjoinedEventsCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UserEventImportSummary getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.UserEventImportSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UserEventImportSummary build() {
      com.google.cloud.retail.v2beta.UserEventImportSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UserEventImportSummary buildPartial() {
      com.google.cloud.retail.v2beta.UserEventImportSummary result = new com.google.cloud.retail.v2beta.UserEventImportSummary(this);
      result.joinedEventsCount_ = joinedEventsCount_;
      result.unjoinedEventsCount_ = unjoinedEventsCount_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.retail.v2beta.UserEventImportSummary) {
        return mergeFrom((com.google.cloud.retail.v2beta.UserEventImportSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.UserEventImportSummary other) {
      if (other == com.google.cloud.retail.v2beta.UserEventImportSummary.getDefaultInstance()) return this;
      if (other.getJoinedEventsCount() != 0L) {
        setJoinedEventsCount(other.getJoinedEventsCount());
      }
      if (other.getUnjoinedEventsCount() != 0L) {
        setUnjoinedEventsCount(other.getUnjoinedEventsCount());
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
      com.google.cloud.retail.v2beta.UserEventImportSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.UserEventImportSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long joinedEventsCount_ ;
    /**
     * <pre>
     * Count of user events imported with complete existing catalog information.
     * </pre>
     *
     * <code>int64 joined_events_count = 1;</code>
     * @return The joinedEventsCount.
     */
    @java.lang.Override
    public long getJoinedEventsCount() {
      return joinedEventsCount_;
    }
    /**
     * <pre>
     * Count of user events imported with complete existing catalog information.
     * </pre>
     *
     * <code>int64 joined_events_count = 1;</code>
     * @param value The joinedEventsCount to set.
     * @return This builder for chaining.
     */
    public Builder setJoinedEventsCount(long value) {
      
      joinedEventsCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of user events imported with complete existing catalog information.
     * </pre>
     *
     * <code>int64 joined_events_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoinedEventsCount() {
      
      joinedEventsCount_ = 0L;
      onChanged();
      return this;
    }

    private long unjoinedEventsCount_ ;
    /**
     * <pre>
     * Count of user events imported, but with catalog information not found
     * in the imported catalog.
     * </pre>
     *
     * <code>int64 unjoined_events_count = 2;</code>
     * @return The unjoinedEventsCount.
     */
    @java.lang.Override
    public long getUnjoinedEventsCount() {
      return unjoinedEventsCount_;
    }
    /**
     * <pre>
     * Count of user events imported, but with catalog information not found
     * in the imported catalog.
     * </pre>
     *
     * <code>int64 unjoined_events_count = 2;</code>
     * @param value The unjoinedEventsCount to set.
     * @return This builder for chaining.
     */
    public Builder setUnjoinedEventsCount(long value) {
      
      unjoinedEventsCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of user events imported, but with catalog information not found
     * in the imported catalog.
     * </pre>
     *
     * <code>int64 unjoined_events_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnjoinedEventsCount() {
      
      unjoinedEventsCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.UserEventImportSummary)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.UserEventImportSummary)
  private static final com.google.cloud.retail.v2beta.UserEventImportSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.UserEventImportSummary();
  }

  public static com.google.cloud.retail.v2beta.UserEventImportSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserEventImportSummary>
      PARSER = new com.google.protobuf.AbstractParser<UserEventImportSummary>() {
    @java.lang.Override
    public UserEventImportSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserEventImportSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserEventImportSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserEventImportSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.UserEventImportSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

