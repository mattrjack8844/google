/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * Utilization metrics values for a single VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.VmUtilizationMetrics}
 */
public final class VmUtilizationMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.VmUtilizationMetrics)
    VmUtilizationMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VmUtilizationMetrics.newBuilder() to construct.
  private VmUtilizationMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VmUtilizationMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VmUtilizationMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_VmUtilizationMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_VmUtilizationMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.VmUtilizationMetrics.class,
            com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder.class);
  }

  public static final int CPU_MAX_PERCENT_FIELD_NUMBER = 9;
  private int cpuMaxPercent_ = 0;
  /**
   *
   *
   * <pre>
   * Max CPU usage, percent.
   * </pre>
   *
   * <code>int32 cpu_max_percent = 9;</code>
   *
   * @return The cpuMaxPercent.
   */
  @java.lang.Override
  public int getCpuMaxPercent() {
    return cpuMaxPercent_;
  }

  public static final int CPU_AVERAGE_PERCENT_FIELD_NUMBER = 10;
  private int cpuAveragePercent_ = 0;
  /**
   *
   *
   * <pre>
   * Average CPU usage, percent.
   * </pre>
   *
   * <code>int32 cpu_average_percent = 10;</code>
   *
   * @return The cpuAveragePercent.
   */
  @java.lang.Override
  public int getCpuAveragePercent() {
    return cpuAveragePercent_;
  }

  public static final int MEMORY_MAX_PERCENT_FIELD_NUMBER = 11;
  private int memoryMaxPercent_ = 0;
  /**
   *
   *
   * <pre>
   * Max memory usage, percent.
   * </pre>
   *
   * <code>int32 memory_max_percent = 11;</code>
   *
   * @return The memoryMaxPercent.
   */
  @java.lang.Override
  public int getMemoryMaxPercent() {
    return memoryMaxPercent_;
  }

  public static final int MEMORY_AVERAGE_PERCENT_FIELD_NUMBER = 12;
  private int memoryAveragePercent_ = 0;
  /**
   *
   *
   * <pre>
   * Average memory usage, percent.
   * </pre>
   *
   * <code>int32 memory_average_percent = 12;</code>
   *
   * @return The memoryAveragePercent.
   */
  @java.lang.Override
  public int getMemoryAveragePercent() {
    return memoryAveragePercent_;
  }

  public static final int DISK_IO_RATE_MAX_KBPS_FIELD_NUMBER = 13;
  private long diskIoRateMaxKbps_ = 0L;
  /**
   *
   *
   * <pre>
   * Max disk IO rate, in kilobytes per second.
   * </pre>
   *
   * <code>int64 disk_io_rate_max_kbps = 13;</code>
   *
   * @return The diskIoRateMaxKbps.
   */
  @java.lang.Override
  public long getDiskIoRateMaxKbps() {
    return diskIoRateMaxKbps_;
  }

  public static final int DISK_IO_RATE_AVERAGE_KBPS_FIELD_NUMBER = 14;
  private long diskIoRateAverageKbps_ = 0L;
  /**
   *
   *
   * <pre>
   * Average disk IO rate, in kilobytes per second.
   * </pre>
   *
   * <code>int64 disk_io_rate_average_kbps = 14;</code>
   *
   * @return The diskIoRateAverageKbps.
   */
  @java.lang.Override
  public long getDiskIoRateAverageKbps() {
    return diskIoRateAverageKbps_;
  }

  public static final int NETWORK_THROUGHPUT_MAX_KBPS_FIELD_NUMBER = 15;
  private long networkThroughputMaxKbps_ = 0L;
  /**
   *
   *
   * <pre>
   * Max network throughput (combined transmit-rates and receive-rates), in
   * kilobytes per second.
   * </pre>
   *
   * <code>int64 network_throughput_max_kbps = 15;</code>
   *
   * @return The networkThroughputMaxKbps.
   */
  @java.lang.Override
  public long getNetworkThroughputMaxKbps() {
    return networkThroughputMaxKbps_;
  }

  public static final int NETWORK_THROUGHPUT_AVERAGE_KBPS_FIELD_NUMBER = 16;
  private long networkThroughputAverageKbps_ = 0L;
  /**
   *
   *
   * <pre>
   * Average network throughput (combined transmit-rates and receive-rates), in
   * kilobytes per second.
   * </pre>
   *
   * <code>int64 network_throughput_average_kbps = 16;</code>
   *
   * @return The networkThroughputAverageKbps.
   */
  @java.lang.Override
  public long getNetworkThroughputAverageKbps() {
    return networkThroughputAverageKbps_;
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
    if (cpuMaxPercent_ != 0) {
      output.writeInt32(9, cpuMaxPercent_);
    }
    if (cpuAveragePercent_ != 0) {
      output.writeInt32(10, cpuAveragePercent_);
    }
    if (memoryMaxPercent_ != 0) {
      output.writeInt32(11, memoryMaxPercent_);
    }
    if (memoryAveragePercent_ != 0) {
      output.writeInt32(12, memoryAveragePercent_);
    }
    if (diskIoRateMaxKbps_ != 0L) {
      output.writeInt64(13, diskIoRateMaxKbps_);
    }
    if (diskIoRateAverageKbps_ != 0L) {
      output.writeInt64(14, diskIoRateAverageKbps_);
    }
    if (networkThroughputMaxKbps_ != 0L) {
      output.writeInt64(15, networkThroughputMaxKbps_);
    }
    if (networkThroughputAverageKbps_ != 0L) {
      output.writeInt64(16, networkThroughputAverageKbps_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpuMaxPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(9, cpuMaxPercent_);
    }
    if (cpuAveragePercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(10, cpuAveragePercent_);
    }
    if (memoryMaxPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(11, memoryMaxPercent_);
    }
    if (memoryAveragePercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(12, memoryAveragePercent_);
    }
    if (diskIoRateMaxKbps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(13, diskIoRateMaxKbps_);
    }
    if (diskIoRateAverageKbps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(14, diskIoRateAverageKbps_);
    }
    if (networkThroughputMaxKbps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(15, networkThroughputMaxKbps_);
    }
    if (networkThroughputAverageKbps_ != 0L) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(16, networkThroughputAverageKbps_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.VmUtilizationMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.VmUtilizationMetrics other =
        (com.google.cloud.vmmigration.v1.VmUtilizationMetrics) obj;

    if (getCpuMaxPercent() != other.getCpuMaxPercent()) return false;
    if (getCpuAveragePercent() != other.getCpuAveragePercent()) return false;
    if (getMemoryMaxPercent() != other.getMemoryMaxPercent()) return false;
    if (getMemoryAveragePercent() != other.getMemoryAveragePercent()) return false;
    if (getDiskIoRateMaxKbps() != other.getDiskIoRateMaxKbps()) return false;
    if (getDiskIoRateAverageKbps() != other.getDiskIoRateAverageKbps()) return false;
    if (getNetworkThroughputMaxKbps() != other.getNetworkThroughputMaxKbps()) return false;
    if (getNetworkThroughputAverageKbps() != other.getNetworkThroughputAverageKbps()) return false;
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
    hash = (37 * hash) + CPU_MAX_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getCpuMaxPercent();
    hash = (37 * hash) + CPU_AVERAGE_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getCpuAveragePercent();
    hash = (37 * hash) + MEMORY_MAX_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getMemoryMaxPercent();
    hash = (37 * hash) + MEMORY_AVERAGE_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getMemoryAveragePercent();
    hash = (37 * hash) + DISK_IO_RATE_MAX_KBPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDiskIoRateMaxKbps());
    hash = (37 * hash) + DISK_IO_RATE_AVERAGE_KBPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDiskIoRateAverageKbps());
    hash = (37 * hash) + NETWORK_THROUGHPUT_MAX_KBPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getNetworkThroughputMaxKbps());
    hash = (37 * hash) + NETWORK_THROUGHPUT_AVERAGE_KBPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getNetworkThroughputAverageKbps());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vmmigration.v1.VmUtilizationMetrics prototype) {
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
   * Utilization metrics values for a single VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.VmUtilizationMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.VmUtilizationMetrics)
      com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmUtilizationMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmUtilizationMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.VmUtilizationMetrics.class,
              com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.VmUtilizationMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cpuMaxPercent_ = 0;
      cpuAveragePercent_ = 0;
      memoryMaxPercent_ = 0;
      memoryAveragePercent_ = 0;
      diskIoRateMaxKbps_ = 0L;
      diskIoRateAverageKbps_ = 0L;
      networkThroughputMaxKbps_ = 0L;
      networkThroughputAverageKbps_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmUtilizationMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationMetrics getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationMetrics build() {
      com.google.cloud.vmmigration.v1.VmUtilizationMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationMetrics buildPartial() {
      com.google.cloud.vmmigration.v1.VmUtilizationMetrics result =
          new com.google.cloud.vmmigration.v1.VmUtilizationMetrics(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.VmUtilizationMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpuMaxPercent_ = cpuMaxPercent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpuAveragePercent_ = cpuAveragePercent_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.memoryMaxPercent_ = memoryMaxPercent_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.memoryAveragePercent_ = memoryAveragePercent_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.diskIoRateMaxKbps_ = diskIoRateMaxKbps_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.diskIoRateAverageKbps_ = diskIoRateAverageKbps_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.networkThroughputMaxKbps_ = networkThroughputMaxKbps_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.networkThroughputAverageKbps_ = networkThroughputAverageKbps_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vmmigration.v1.VmUtilizationMetrics) {
        return mergeFrom((com.google.cloud.vmmigration.v1.VmUtilizationMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.VmUtilizationMetrics other) {
      if (other == com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance())
        return this;
      if (other.getCpuMaxPercent() != 0) {
        setCpuMaxPercent(other.getCpuMaxPercent());
      }
      if (other.getCpuAveragePercent() != 0) {
        setCpuAveragePercent(other.getCpuAveragePercent());
      }
      if (other.getMemoryMaxPercent() != 0) {
        setMemoryMaxPercent(other.getMemoryMaxPercent());
      }
      if (other.getMemoryAveragePercent() != 0) {
        setMemoryAveragePercent(other.getMemoryAveragePercent());
      }
      if (other.getDiskIoRateMaxKbps() != 0L) {
        setDiskIoRateMaxKbps(other.getDiskIoRateMaxKbps());
      }
      if (other.getDiskIoRateAverageKbps() != 0L) {
        setDiskIoRateAverageKbps(other.getDiskIoRateAverageKbps());
      }
      if (other.getNetworkThroughputMaxKbps() != 0L) {
        setNetworkThroughputMaxKbps(other.getNetworkThroughputMaxKbps());
      }
      if (other.getNetworkThroughputAverageKbps() != 0L) {
        setNetworkThroughputAverageKbps(other.getNetworkThroughputAverageKbps());
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
            case 72:
              {
                cpuMaxPercent_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
            case 80:
              {
                cpuAveragePercent_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
            case 88:
              {
                memoryMaxPercent_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
            case 96:
              {
                memoryAveragePercent_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
            case 104:
              {
                diskIoRateMaxKbps_ = input.readInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 104
            case 112:
              {
                diskIoRateAverageKbps_ = input.readInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 112
            case 120:
              {
                networkThroughputMaxKbps_ = input.readInt64();
                bitField0_ |= 0x00000040;
                break;
              } // case 120
            case 128:
              {
                networkThroughputAverageKbps_ = input.readInt64();
                bitField0_ |= 0x00000080;
                break;
              } // case 128
            default:
              {
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

    private int cpuMaxPercent_;
    /**
     *
     *
     * <pre>
     * Max CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_max_percent = 9;</code>
     *
     * @return The cpuMaxPercent.
     */
    @java.lang.Override
    public int getCpuMaxPercent() {
      return cpuMaxPercent_;
    }
    /**
     *
     *
     * <pre>
     * Max CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_max_percent = 9;</code>
     *
     * @param value The cpuMaxPercent to set.
     * @return This builder for chaining.
     */
    public Builder setCpuMaxPercent(int value) {

      cpuMaxPercent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_max_percent = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpuMaxPercent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cpuMaxPercent_ = 0;
      onChanged();
      return this;
    }

    private int cpuAveragePercent_;
    /**
     *
     *
     * <pre>
     * Average CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_average_percent = 10;</code>
     *
     * @return The cpuAveragePercent.
     */
    @java.lang.Override
    public int getCpuAveragePercent() {
      return cpuAveragePercent_;
    }
    /**
     *
     *
     * <pre>
     * Average CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_average_percent = 10;</code>
     *
     * @param value The cpuAveragePercent to set.
     * @return This builder for chaining.
     */
    public Builder setCpuAveragePercent(int value) {

      cpuAveragePercent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average CPU usage, percent.
     * </pre>
     *
     * <code>int32 cpu_average_percent = 10;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpuAveragePercent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpuAveragePercent_ = 0;
      onChanged();
      return this;
    }

    private int memoryMaxPercent_;
    /**
     *
     *
     * <pre>
     * Max memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_max_percent = 11;</code>
     *
     * @return The memoryMaxPercent.
     */
    @java.lang.Override
    public int getMemoryMaxPercent() {
      return memoryMaxPercent_;
    }
    /**
     *
     *
     * <pre>
     * Max memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_max_percent = 11;</code>
     *
     * @param value The memoryMaxPercent to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryMaxPercent(int value) {

      memoryMaxPercent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_max_percent = 11;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMemoryMaxPercent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      memoryMaxPercent_ = 0;
      onChanged();
      return this;
    }

    private int memoryAveragePercent_;
    /**
     *
     *
     * <pre>
     * Average memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_average_percent = 12;</code>
     *
     * @return The memoryAveragePercent.
     */
    @java.lang.Override
    public int getMemoryAveragePercent() {
      return memoryAveragePercent_;
    }
    /**
     *
     *
     * <pre>
     * Average memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_average_percent = 12;</code>
     *
     * @param value The memoryAveragePercent to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryAveragePercent(int value) {

      memoryAveragePercent_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average memory usage, percent.
     * </pre>
     *
     * <code>int32 memory_average_percent = 12;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMemoryAveragePercent() {
      bitField0_ = (bitField0_ & ~0x00000008);
      memoryAveragePercent_ = 0;
      onChanged();
      return this;
    }

    private long diskIoRateMaxKbps_;
    /**
     *
     *
     * <pre>
     * Max disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_max_kbps = 13;</code>
     *
     * @return The diskIoRateMaxKbps.
     */
    @java.lang.Override
    public long getDiskIoRateMaxKbps() {
      return diskIoRateMaxKbps_;
    }
    /**
     *
     *
     * <pre>
     * Max disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_max_kbps = 13;</code>
     *
     * @param value The diskIoRateMaxKbps to set.
     * @return This builder for chaining.
     */
    public Builder setDiskIoRateMaxKbps(long value) {

      diskIoRateMaxKbps_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_max_kbps = 13;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskIoRateMaxKbps() {
      bitField0_ = (bitField0_ & ~0x00000010);
      diskIoRateMaxKbps_ = 0L;
      onChanged();
      return this;
    }

    private long diskIoRateAverageKbps_;
    /**
     *
     *
     * <pre>
     * Average disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_average_kbps = 14;</code>
     *
     * @return The diskIoRateAverageKbps.
     */
    @java.lang.Override
    public long getDiskIoRateAverageKbps() {
      return diskIoRateAverageKbps_;
    }
    /**
     *
     *
     * <pre>
     * Average disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_average_kbps = 14;</code>
     *
     * @param value The diskIoRateAverageKbps to set.
     * @return This builder for chaining.
     */
    public Builder setDiskIoRateAverageKbps(long value) {

      diskIoRateAverageKbps_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average disk IO rate, in kilobytes per second.
     * </pre>
     *
     * <code>int64 disk_io_rate_average_kbps = 14;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskIoRateAverageKbps() {
      bitField0_ = (bitField0_ & ~0x00000020);
      diskIoRateAverageKbps_ = 0L;
      onChanged();
      return this;
    }

    private long networkThroughputMaxKbps_;
    /**
     *
     *
     * <pre>
     * Max network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_max_kbps = 15;</code>
     *
     * @return The networkThroughputMaxKbps.
     */
    @java.lang.Override
    public long getNetworkThroughputMaxKbps() {
      return networkThroughputMaxKbps_;
    }
    /**
     *
     *
     * <pre>
     * Max network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_max_kbps = 15;</code>
     *
     * @param value The networkThroughputMaxKbps to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkThroughputMaxKbps(long value) {

      networkThroughputMaxKbps_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_max_kbps = 15;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetworkThroughputMaxKbps() {
      bitField0_ = (bitField0_ & ~0x00000040);
      networkThroughputMaxKbps_ = 0L;
      onChanged();
      return this;
    }

    private long networkThroughputAverageKbps_;
    /**
     *
     *
     * <pre>
     * Average network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_average_kbps = 16;</code>
     *
     * @return The networkThroughputAverageKbps.
     */
    @java.lang.Override
    public long getNetworkThroughputAverageKbps() {
      return networkThroughputAverageKbps_;
    }
    /**
     *
     *
     * <pre>
     * Average network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_average_kbps = 16;</code>
     *
     * @param value The networkThroughputAverageKbps to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkThroughputAverageKbps(long value) {

      networkThroughputAverageKbps_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average network throughput (combined transmit-rates and receive-rates), in
     * kilobytes per second.
     * </pre>
     *
     * <code>int64 network_throughput_average_kbps = 16;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetworkThroughputAverageKbps() {
      bitField0_ = (bitField0_ & ~0x00000080);
      networkThroughputAverageKbps_ = 0L;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.VmUtilizationMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.VmUtilizationMetrics)
  private static final com.google.cloud.vmmigration.v1.VmUtilizationMetrics DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.VmUtilizationMetrics();
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmUtilizationMetrics> PARSER =
      new com.google.protobuf.AbstractParser<VmUtilizationMetrics>() {
        @java.lang.Override
        public VmUtilizationMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<VmUtilizationMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmUtilizationMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmUtilizationMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
