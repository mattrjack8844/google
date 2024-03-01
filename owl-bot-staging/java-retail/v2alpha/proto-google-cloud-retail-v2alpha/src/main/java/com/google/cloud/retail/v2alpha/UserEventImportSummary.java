// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

/**
 * <pre>
 * A summary of import result. The UserEventImportSummary summarizes
 * the import status for user events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.UserEventImportSummary}
 */
public final class UserEventImportSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.UserEventImportSummary)
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

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2alpha.ImportConfigProto.internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.ImportConfigProto.internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.UserEventImportSummary.class, com.google.cloud.retail.v2alpha.UserEventImportSummary.Builder.class);
  }

  public static final int JOINED_EVENTS_COUNT_FIELD_NUMBER = 1;
  private long joinedEventsCount_ = 0L;
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
  private long unjoinedEventsCount_ = 0L;
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
    getUnknownFields().writeTo(output);
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.retail.v2alpha.UserEventImportSummary)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.UserEventImportSummary other = (com.google.cloud.retail.v2alpha.UserEventImportSummary) obj;

    if (getJoinedEventsCount()
        != other.getJoinedEventsCount()) return false;
    if (getUnjoinedEventsCount()
        != other.getUnjoinedEventsCount()) return false;
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
    hash = (37 * hash) + JOINED_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJoinedEventsCount());
    hash = (37 * hash) + UNJOINED_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnjoinedEventsCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2alpha.UserEventImportSummary parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2alpha.UserEventImportSummary prototype) {
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
   * Protobuf type {@code google.cloud.retail.v2alpha.UserEventImportSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.UserEventImportSummary)
      com.google.cloud.retail.v2alpha.UserEventImportSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto.internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto.internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.UserEventImportSummary.class, com.google.cloud.retail.v2alpha.UserEventImportSummary.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.UserEventImportSummary.newBuilder()
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
      joinedEventsCount_ = 0L;
      unjoinedEventsCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto.internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UserEventImportSummary getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.UserEventImportSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UserEventImportSummary build() {
      com.google.cloud.retail.v2alpha.UserEventImportSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UserEventImportSummary buildPartial() {
      com.google.cloud.retail.v2alpha.UserEventImportSummary result = new com.google.cloud.retail.v2alpha.UserEventImportSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.UserEventImportSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.joinedEventsCount_ = joinedEventsCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unjoinedEventsCount_ = unjoinedEventsCount_;
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
      if (other instanceof com.google.cloud.retail.v2alpha.UserEventImportSummary) {
        return mergeFrom((com.google.cloud.retail.v2alpha.UserEventImportSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.UserEventImportSummary other) {
      if (other == com.google.cloud.retail.v2alpha.UserEventImportSummary.getDefaultInstance()) return this;
      if (other.getJoinedEventsCount() != 0L) {
        setJoinedEventsCount(other.getJoinedEventsCount());
      }
      if (other.getUnjoinedEventsCount() != 0L) {
        setUnjoinedEventsCount(other.getUnjoinedEventsCount());
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
            case 8: {
              joinedEventsCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              unjoinedEventsCount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
      bitField0_ |= 0x00000001;
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
      bitField0_ = (bitField0_ & ~0x00000001);
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
      bitField0_ |= 0x00000002;
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
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.UserEventImportSummary)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.UserEventImportSummary)
  private static final com.google.cloud.retail.v2alpha.UserEventImportSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.UserEventImportSummary();
  }

  public static com.google.cloud.retail.v2alpha.UserEventImportSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserEventImportSummary>
      PARSER = new com.google.protobuf.AbstractParser<UserEventImportSummary>() {
    @java.lang.Override
    public UserEventImportSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserEventImportSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserEventImportSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.UserEventImportSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

