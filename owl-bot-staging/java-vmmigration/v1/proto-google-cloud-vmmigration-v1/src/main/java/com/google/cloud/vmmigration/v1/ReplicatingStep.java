// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

/**
 * <pre>
 * ReplicatingStep contains specific step details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.ReplicatingStep}
 */
public final class ReplicatingStep extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.ReplicatingStep)
    ReplicatingStepOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplicatingStep.newBuilder() to construct.
  private ReplicatingStep(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplicatingStep() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplicatingStep();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ReplicatingStep_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ReplicatingStep_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.ReplicatingStep.class, com.google.cloud.vmmigration.v1.ReplicatingStep.Builder.class);
  }

  public static final int TOTAL_BYTES_FIELD_NUMBER = 1;
  private long totalBytes_ = 0L;
  /**
   * <pre>
   * Total bytes to be handled in the step.
   * </pre>
   *
   * <code>int64 total_bytes = 1;</code>
   * @return The totalBytes.
   */
  @java.lang.Override
  public long getTotalBytes() {
    return totalBytes_;
  }

  public static final int REPLICATED_BYTES_FIELD_NUMBER = 2;
  private long replicatedBytes_ = 0L;
  /**
   * <pre>
   * Replicated bytes in the step.
   * </pre>
   *
   * <code>int64 replicated_bytes = 2;</code>
   * @return The replicatedBytes.
   */
  @java.lang.Override
  public long getReplicatedBytes() {
    return replicatedBytes_;
  }

  public static final int LAST_TWO_MINUTES_AVERAGE_BYTES_PER_SECOND_FIELD_NUMBER = 3;
  private long lastTwoMinutesAverageBytesPerSecond_ = 0L;
  /**
   * <pre>
   * The source disks replication rate for the last 2 minutes in bytes per
   * second.
   * </pre>
   *
   * <code>int64 last_two_minutes_average_bytes_per_second = 3;</code>
   * @return The lastTwoMinutesAverageBytesPerSecond.
   */
  @java.lang.Override
  public long getLastTwoMinutesAverageBytesPerSecond() {
    return lastTwoMinutesAverageBytesPerSecond_;
  }

  public static final int LAST_THIRTY_MINUTES_AVERAGE_BYTES_PER_SECOND_FIELD_NUMBER = 4;
  private long lastThirtyMinutesAverageBytesPerSecond_ = 0L;
  /**
   * <pre>
   * The source disks replication rate for the last 30 minutes in bytes per
   * second.
   * </pre>
   *
   * <code>int64 last_thirty_minutes_average_bytes_per_second = 4;</code>
   * @return The lastThirtyMinutesAverageBytesPerSecond.
   */
  @java.lang.Override
  public long getLastThirtyMinutesAverageBytesPerSecond() {
    return lastThirtyMinutesAverageBytesPerSecond_;
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
    if (totalBytes_ != 0L) {
      output.writeInt64(1, totalBytes_);
    }
    if (replicatedBytes_ != 0L) {
      output.writeInt64(2, replicatedBytes_);
    }
    if (lastTwoMinutesAverageBytesPerSecond_ != 0L) {
      output.writeInt64(3, lastTwoMinutesAverageBytesPerSecond_);
    }
    if (lastThirtyMinutesAverageBytesPerSecond_ != 0L) {
      output.writeInt64(4, lastThirtyMinutesAverageBytesPerSecond_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, totalBytes_);
    }
    if (replicatedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, replicatedBytes_);
    }
    if (lastTwoMinutesAverageBytesPerSecond_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastTwoMinutesAverageBytesPerSecond_);
    }
    if (lastThirtyMinutesAverageBytesPerSecond_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastThirtyMinutesAverageBytesPerSecond_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.ReplicatingStep)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.ReplicatingStep other = (com.google.cloud.vmmigration.v1.ReplicatingStep) obj;

    if (getTotalBytes()
        != other.getTotalBytes()) return false;
    if (getReplicatedBytes()
        != other.getReplicatedBytes()) return false;
    if (getLastTwoMinutesAverageBytesPerSecond()
        != other.getLastTwoMinutesAverageBytesPerSecond()) return false;
    if (getLastThirtyMinutesAverageBytesPerSecond()
        != other.getLastThirtyMinutesAverageBytesPerSecond()) return false;
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
    hash = (37 * hash) + TOTAL_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalBytes());
    hash = (37 * hash) + REPLICATED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReplicatedBytes());
    hash = (37 * hash) + LAST_TWO_MINUTES_AVERAGE_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastTwoMinutesAverageBytesPerSecond());
    hash = (37 * hash) + LAST_THIRTY_MINUTES_AVERAGE_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastThirtyMinutesAverageBytesPerSecond());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.ReplicatingStep parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmmigration.v1.ReplicatingStep prototype) {
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
   * ReplicatingStep contains specific step details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.ReplicatingStep}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.ReplicatingStep)
      com.google.cloud.vmmigration.v1.ReplicatingStepOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ReplicatingStep_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ReplicatingStep_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.ReplicatingStep.class, com.google.cloud.vmmigration.v1.ReplicatingStep.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.ReplicatingStep.newBuilder()
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
      totalBytes_ = 0L;
      replicatedBytes_ = 0L;
      lastTwoMinutesAverageBytesPerSecond_ = 0L;
      lastThirtyMinutesAverageBytesPerSecond_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ReplicatingStep_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ReplicatingStep getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.ReplicatingStep.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ReplicatingStep build() {
      com.google.cloud.vmmigration.v1.ReplicatingStep result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ReplicatingStep buildPartial() {
      com.google.cloud.vmmigration.v1.ReplicatingStep result = new com.google.cloud.vmmigration.v1.ReplicatingStep(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.ReplicatingStep result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalBytes_ = totalBytes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.replicatedBytes_ = replicatedBytes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastTwoMinutesAverageBytesPerSecond_ = lastTwoMinutesAverageBytesPerSecond_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lastThirtyMinutesAverageBytesPerSecond_ = lastThirtyMinutesAverageBytesPerSecond_;
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
      if (other instanceof com.google.cloud.vmmigration.v1.ReplicatingStep) {
        return mergeFrom((com.google.cloud.vmmigration.v1.ReplicatingStep)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.ReplicatingStep other) {
      if (other == com.google.cloud.vmmigration.v1.ReplicatingStep.getDefaultInstance()) return this;
      if (other.getTotalBytes() != 0L) {
        setTotalBytes(other.getTotalBytes());
      }
      if (other.getReplicatedBytes() != 0L) {
        setReplicatedBytes(other.getReplicatedBytes());
      }
      if (other.getLastTwoMinutesAverageBytesPerSecond() != 0L) {
        setLastTwoMinutesAverageBytesPerSecond(other.getLastTwoMinutesAverageBytesPerSecond());
      }
      if (other.getLastThirtyMinutesAverageBytesPerSecond() != 0L) {
        setLastThirtyMinutesAverageBytesPerSecond(other.getLastThirtyMinutesAverageBytesPerSecond());
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
              totalBytes_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              replicatedBytes_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              lastTwoMinutesAverageBytesPerSecond_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              lastThirtyMinutesAverageBytesPerSecond_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long totalBytes_ ;
    /**
     * <pre>
     * Total bytes to be handled in the step.
     * </pre>
     *
     * <code>int64 total_bytes = 1;</code>
     * @return The totalBytes.
     */
    @java.lang.Override
    public long getTotalBytes() {
      return totalBytes_;
    }
    /**
     * <pre>
     * Total bytes to be handled in the step.
     * </pre>
     *
     * <code>int64 total_bytes = 1;</code>
     * @param value The totalBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBytes(long value) {

      totalBytes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total bytes to be handled in the step.
     * </pre>
     *
     * <code>int64 total_bytes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalBytes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalBytes_ = 0L;
      onChanged();
      return this;
    }

    private long replicatedBytes_ ;
    /**
     * <pre>
     * Replicated bytes in the step.
     * </pre>
     *
     * <code>int64 replicated_bytes = 2;</code>
     * @return The replicatedBytes.
     */
    @java.lang.Override
    public long getReplicatedBytes() {
      return replicatedBytes_;
    }
    /**
     * <pre>
     * Replicated bytes in the step.
     * </pre>
     *
     * <code>int64 replicated_bytes = 2;</code>
     * @param value The replicatedBytes to set.
     * @return This builder for chaining.
     */
    public Builder setReplicatedBytes(long value) {

      replicatedBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Replicated bytes in the step.
     * </pre>
     *
     * <code>int64 replicated_bytes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplicatedBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      replicatedBytes_ = 0L;
      onChanged();
      return this;
    }

    private long lastTwoMinutesAverageBytesPerSecond_ ;
    /**
     * <pre>
     * The source disks replication rate for the last 2 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_two_minutes_average_bytes_per_second = 3;</code>
     * @return The lastTwoMinutesAverageBytesPerSecond.
     */
    @java.lang.Override
    public long getLastTwoMinutesAverageBytesPerSecond() {
      return lastTwoMinutesAverageBytesPerSecond_;
    }
    /**
     * <pre>
     * The source disks replication rate for the last 2 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_two_minutes_average_bytes_per_second = 3;</code>
     * @param value The lastTwoMinutesAverageBytesPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setLastTwoMinutesAverageBytesPerSecond(long value) {

      lastTwoMinutesAverageBytesPerSecond_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source disks replication rate for the last 2 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_two_minutes_average_bytes_per_second = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastTwoMinutesAverageBytesPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastTwoMinutesAverageBytesPerSecond_ = 0L;
      onChanged();
      return this;
    }

    private long lastThirtyMinutesAverageBytesPerSecond_ ;
    /**
     * <pre>
     * The source disks replication rate for the last 30 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_thirty_minutes_average_bytes_per_second = 4;</code>
     * @return The lastThirtyMinutesAverageBytesPerSecond.
     */
    @java.lang.Override
    public long getLastThirtyMinutesAverageBytesPerSecond() {
      return lastThirtyMinutesAverageBytesPerSecond_;
    }
    /**
     * <pre>
     * The source disks replication rate for the last 30 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_thirty_minutes_average_bytes_per_second = 4;</code>
     * @param value The lastThirtyMinutesAverageBytesPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setLastThirtyMinutesAverageBytesPerSecond(long value) {

      lastThirtyMinutesAverageBytesPerSecond_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source disks replication rate for the last 30 minutes in bytes per
     * second.
     * </pre>
     *
     * <code>int64 last_thirty_minutes_average_bytes_per_second = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastThirtyMinutesAverageBytesPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lastThirtyMinutesAverageBytesPerSecond_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.ReplicatingStep)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.ReplicatingStep)
  private static final com.google.cloud.vmmigration.v1.ReplicatingStep DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.ReplicatingStep();
  }

  public static com.google.cloud.vmmigration.v1.ReplicatingStep getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplicatingStep>
      PARSER = new com.google.protobuf.AbstractParser<ReplicatingStep>() {
    @java.lang.Override
    public ReplicatingStep parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplicatingStep> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplicatingStep> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ReplicatingStep getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

