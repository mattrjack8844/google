/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/batch/v1/task.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1;

/**
 *
 *
 * <pre>
 * Compute resource requirements.
 *
 * ComputeResource defines the amount of resources required for each task.
 * Make sure your tasks have enough resources to successfully run.
 * If you also define the types of resources for a job to use with the
 * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
 * field, make sure both fields are compatible with each other.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1.ComputeResource}
 */
public final class ComputeResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1.ComputeResource)
    ComputeResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputeResource.newBuilder() to construct.
  private ComputeResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeResource() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_ComputeResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1.ComputeResource.class,
            com.google.cloud.batch.v1.ComputeResource.Builder.class);
  }

  public static final int CPU_MILLI_FIELD_NUMBER = 1;
  private long cpuMilli_ = 0L;
  /**
   *
   *
   * <pre>
   * The milliCPU count.
   *
   * `cpuMilli` defines the amount of CPU resources per task in milliCPU units.
   * For example, `1000` corresponds to 1 vCPU per task. If undefined, the
   * default value is `2000`.
   *
   * If you also define the VM's machine type using the `machineType` in
   * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
   * field or inside the `instanceTemplate` in the
   * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
   * field, make sure the CPU resources for both fields are compatible with each
   * other and with how many tasks you want to allow to run on the same VM at
   * the same time.
   *
   * For example, if you specify the `n2-standard-2` machine type, which has 2
   * vCPUs each, you are recommended to set `cpuMilli` no more than `2000`, or
   * you are recommended to run two tasks on the same VM if you set `cpuMilli`
   * to `1000` or less.
   * </pre>
   *
   * <code>int64 cpu_milli = 1;</code>
   *
   * @return The cpuMilli.
   */
  @java.lang.Override
  public long getCpuMilli() {
    return cpuMilli_;
  }

  public static final int MEMORY_MIB_FIELD_NUMBER = 2;
  private long memoryMib_ = 0L;
  /**
   *
   *
   * <pre>
   * Memory in MiB.
   *
   * `memoryMib` defines the amount of memory per task in MiB units.
   * If undefined, the default value is `2000`.
   * If you also define the VM's machine type using the `machineType` in
   * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
   * field or inside the `instanceTemplate` in the
   * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
   * field, make sure the memory resources for both fields are compatible with
   * each other and with how many tasks you want to allow to run on the same VM
   * at the same time.
   *
   * For example, if you specify the `n2-standard-2` machine type, which has 8
   * GiB each, you are recommended to set `memoryMib` to no more than `8192`,
   * or you are recommended to run two tasks on the same VM if you set
   * `memoryMib` to `4096` or less.
   * </pre>
   *
   * <code>int64 memory_mib = 2;</code>
   *
   * @return The memoryMib.
   */
  @java.lang.Override
  public long getMemoryMib() {
    return memoryMib_;
  }

  public static final int BOOT_DISK_MIB_FIELD_NUMBER = 4;
  private long bootDiskMib_ = 0L;
  /**
   *
   *
   * <pre>
   * Extra boot disk size in MiB for each task.
   * </pre>
   *
   * <code>int64 boot_disk_mib = 4;</code>
   *
   * @return The bootDiskMib.
   */
  @java.lang.Override
  public long getBootDiskMib() {
    return bootDiskMib_;
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
    if (cpuMilli_ != 0L) {
      output.writeInt64(1, cpuMilli_);
    }
    if (memoryMib_ != 0L) {
      output.writeInt64(2, memoryMib_);
    }
    if (bootDiskMib_ != 0L) {
      output.writeInt64(4, bootDiskMib_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpuMilli_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, cpuMilli_);
    }
    if (memoryMib_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, memoryMib_);
    }
    if (bootDiskMib_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, bootDiskMib_);
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
    if (!(obj instanceof com.google.cloud.batch.v1.ComputeResource)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1.ComputeResource other =
        (com.google.cloud.batch.v1.ComputeResource) obj;

    if (getCpuMilli() != other.getCpuMilli()) return false;
    if (getMemoryMib() != other.getMemoryMib()) return false;
    if (getBootDiskMib() != other.getBootDiskMib()) return false;
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
    hash = (37 * hash) + CPU_MILLI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCpuMilli());
    hash = (37 * hash) + MEMORY_MIB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMemoryMib());
    hash = (37 * hash) + BOOT_DISK_MIB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getBootDiskMib());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ComputeResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1.ComputeResource prototype) {
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
   * Compute resource requirements.
   *
   * ComputeResource defines the amount of resources required for each task.
   * Make sure your tasks have enough resources to successfully run.
   * If you also define the types of resources for a job to use with the
   * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
   * field, make sure both fields are compatible with each other.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1.ComputeResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1.ComputeResource)
      com.google.cloud.batch.v1.ComputeResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_ComputeResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1.ComputeResource.class,
              com.google.cloud.batch.v1.ComputeResource.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1.ComputeResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cpuMilli_ = 0L;
      memoryMib_ = 0L;
      bootDiskMib_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_ComputeResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ComputeResource getDefaultInstanceForType() {
      return com.google.cloud.batch.v1.ComputeResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ComputeResource build() {
      com.google.cloud.batch.v1.ComputeResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ComputeResource buildPartial() {
      com.google.cloud.batch.v1.ComputeResource result =
          new com.google.cloud.batch.v1.ComputeResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.batch.v1.ComputeResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpuMilli_ = cpuMilli_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.memoryMib_ = memoryMib_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bootDiskMib_ = bootDiskMib_;
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
      if (other instanceof com.google.cloud.batch.v1.ComputeResource) {
        return mergeFrom((com.google.cloud.batch.v1.ComputeResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1.ComputeResource other) {
      if (other == com.google.cloud.batch.v1.ComputeResource.getDefaultInstance()) return this;
      if (other.getCpuMilli() != 0L) {
        setCpuMilli(other.getCpuMilli());
      }
      if (other.getMemoryMib() != 0L) {
        setMemoryMib(other.getMemoryMib());
      }
      if (other.getBootDiskMib() != 0L) {
        setBootDiskMib(other.getBootDiskMib());
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
            case 8:
              {
                cpuMilli_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                memoryMib_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 32:
              {
                bootDiskMib_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private long cpuMilli_;
    /**
     *
     *
     * <pre>
     * The milliCPU count.
     *
     * `cpuMilli` defines the amount of CPU resources per task in milliCPU units.
     * For example, `1000` corresponds to 1 vCPU per task. If undefined, the
     * default value is `2000`.
     *
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the CPU resources for both fields are compatible with each
     * other and with how many tasks you want to allow to run on the same VM at
     * the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 2
     * vCPUs each, you are recommended to set `cpuMilli` no more than `2000`, or
     * you are recommended to run two tasks on the same VM if you set `cpuMilli`
     * to `1000` or less.
     * </pre>
     *
     * <code>int64 cpu_milli = 1;</code>
     *
     * @return The cpuMilli.
     */
    @java.lang.Override
    public long getCpuMilli() {
      return cpuMilli_;
    }
    /**
     *
     *
     * <pre>
     * The milliCPU count.
     *
     * `cpuMilli` defines the amount of CPU resources per task in milliCPU units.
     * For example, `1000` corresponds to 1 vCPU per task. If undefined, the
     * default value is `2000`.
     *
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the CPU resources for both fields are compatible with each
     * other and with how many tasks you want to allow to run on the same VM at
     * the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 2
     * vCPUs each, you are recommended to set `cpuMilli` no more than `2000`, or
     * you are recommended to run two tasks on the same VM if you set `cpuMilli`
     * to `1000` or less.
     * </pre>
     *
     * <code>int64 cpu_milli = 1;</code>
     *
     * @param value The cpuMilli to set.
     * @return This builder for chaining.
     */
    public Builder setCpuMilli(long value) {

      cpuMilli_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The milliCPU count.
     *
     * `cpuMilli` defines the amount of CPU resources per task in milliCPU units.
     * For example, `1000` corresponds to 1 vCPU per task. If undefined, the
     * default value is `2000`.
     *
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the CPU resources for both fields are compatible with each
     * other and with how many tasks you want to allow to run on the same VM at
     * the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 2
     * vCPUs each, you are recommended to set `cpuMilli` no more than `2000`, or
     * you are recommended to run two tasks on the same VM if you set `cpuMilli`
     * to `1000` or less.
     * </pre>
     *
     * <code>int64 cpu_milli = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpuMilli() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cpuMilli_ = 0L;
      onChanged();
      return this;
    }

    private long memoryMib_;
    /**
     *
     *
     * <pre>
     * Memory in MiB.
     *
     * `memoryMib` defines the amount of memory per task in MiB units.
     * If undefined, the default value is `2000`.
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the memory resources for both fields are compatible with
     * each other and with how many tasks you want to allow to run on the same VM
     * at the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 8
     * GiB each, you are recommended to set `memoryMib` to no more than `8192`,
     * or you are recommended to run two tasks on the same VM if you set
     * `memoryMib` to `4096` or less.
     * </pre>
     *
     * <code>int64 memory_mib = 2;</code>
     *
     * @return The memoryMib.
     */
    @java.lang.Override
    public long getMemoryMib() {
      return memoryMib_;
    }
    /**
     *
     *
     * <pre>
     * Memory in MiB.
     *
     * `memoryMib` defines the amount of memory per task in MiB units.
     * If undefined, the default value is `2000`.
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the memory resources for both fields are compatible with
     * each other and with how many tasks you want to allow to run on the same VM
     * at the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 8
     * GiB each, you are recommended to set `memoryMib` to no more than `8192`,
     * or you are recommended to run two tasks on the same VM if you set
     * `memoryMib` to `4096` or less.
     * </pre>
     *
     * <code>int64 memory_mib = 2;</code>
     *
     * @param value The memoryMib to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryMib(long value) {

      memoryMib_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Memory in MiB.
     *
     * `memoryMib` defines the amount of memory per task in MiB units.
     * If undefined, the default value is `2000`.
     * If you also define the VM's machine type using the `machineType` in
     * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
     * field or inside the `instanceTemplate` in the
     * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
     * field, make sure the memory resources for both fields are compatible with
     * each other and with how many tasks you want to allow to run on the same VM
     * at the same time.
     *
     * For example, if you specify the `n2-standard-2` machine type, which has 8
     * GiB each, you are recommended to set `memoryMib` to no more than `8192`,
     * or you are recommended to run two tasks on the same VM if you set
     * `memoryMib` to `4096` or less.
     * </pre>
     *
     * <code>int64 memory_mib = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMemoryMib() {
      bitField0_ = (bitField0_ & ~0x00000002);
      memoryMib_ = 0L;
      onChanged();
      return this;
    }

    private long bootDiskMib_;
    /**
     *
     *
     * <pre>
     * Extra boot disk size in MiB for each task.
     * </pre>
     *
     * <code>int64 boot_disk_mib = 4;</code>
     *
     * @return The bootDiskMib.
     */
    @java.lang.Override
    public long getBootDiskMib() {
      return bootDiskMib_;
    }
    /**
     *
     *
     * <pre>
     * Extra boot disk size in MiB for each task.
     * </pre>
     *
     * <code>int64 boot_disk_mib = 4;</code>
     *
     * @param value The bootDiskMib to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskMib(long value) {

      bootDiskMib_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Extra boot disk size in MiB for each task.
     * </pre>
     *
     * <code>int64 boot_disk_mib = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBootDiskMib() {
      bitField0_ = (bitField0_ & ~0x00000004);
      bootDiskMib_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1.ComputeResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1.ComputeResource)
  private static final com.google.cloud.batch.v1.ComputeResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1.ComputeResource();
  }

  public static com.google.cloud.batch.v1.ComputeResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeResource> PARSER =
      new com.google.protobuf.AbstractParser<ComputeResource>() {
        @java.lang.Override
        public ComputeResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1.ComputeResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
