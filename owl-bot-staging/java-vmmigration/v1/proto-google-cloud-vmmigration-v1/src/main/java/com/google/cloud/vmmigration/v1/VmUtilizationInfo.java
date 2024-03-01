// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

/**
 * <pre>
 * Utilization information of a single VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.VmUtilizationInfo}
 */
public final class VmUtilizationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.VmUtilizationInfo)
    VmUtilizationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VmUtilizationInfo.newBuilder() to construct.
  private VmUtilizationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VmUtilizationInfo() {
    vmId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VmUtilizationInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_VmUtilizationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_VmUtilizationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.VmUtilizationInfo.class, com.google.cloud.vmmigration.v1.VmUtilizationInfo.Builder.class);
  }

  private int bitField0_;
  private int vmDetailsCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object vmDetails_;
  public enum VmDetailsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VMWARE_VM_DETAILS(1),
    VMDETAILS_NOT_SET(0);
    private final int value;
    private VmDetailsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VmDetailsCase valueOf(int value) {
      return forNumber(value);
    }

    public static VmDetailsCase forNumber(int value) {
      switch (value) {
        case 1: return VMWARE_VM_DETAILS;
        case 0: return VMDETAILS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public VmDetailsCase
  getVmDetailsCase() {
    return VmDetailsCase.forNumber(
        vmDetailsCase_);
  }

  public static final int VMWARE_VM_DETAILS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   * @return Whether the vmwareVmDetails field is set.
   */
  @java.lang.Override
  public boolean hasVmwareVmDetails() {
    return vmDetailsCase_ == 1;
  }
  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   * @return The vmwareVmDetails.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmwareVmDetails getVmwareVmDetails() {
    if (vmDetailsCase_ == 1) {
       return (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_;
    }
    return com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
  }
  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder getVmwareVmDetailsOrBuilder() {
    if (vmDetailsCase_ == 1) {
       return (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_;
    }
    return com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
  }

  public static final int VM_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vmId_ = "";
  /**
   * <pre>
   * The VM's ID in the source.
   * </pre>
   *
   * <code>string vm_id = 3;</code>
   * @return The vmId.
   */
  @java.lang.Override
  public java.lang.String getVmId() {
    java.lang.Object ref = vmId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The VM's ID in the source.
   * </pre>
   *
   * <code>string vm_id = 3;</code>
   * @return The bytes for vmId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVmIdBytes() {
    java.lang.Object ref = vmId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vmId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTILIZATION_FIELD_NUMBER = 2;
  private com.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization_;
  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   * @return Whether the utilization field is set.
   */
  @java.lang.Override
  public boolean hasUtilization() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   * @return The utilization.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmUtilizationMetrics getUtilization() {
    return utilization_ == null ? com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance() : utilization_;
  }
  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder getUtilizationOrBuilder() {
    return utilization_ == null ? com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance() : utilization_;
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
    if (vmDetailsCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getUtilization());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, vmId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vmDetailsCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUtilization());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, vmId_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.VmUtilizationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.VmUtilizationInfo other = (com.google.cloud.vmmigration.v1.VmUtilizationInfo) obj;

    if (!getVmId()
        .equals(other.getVmId())) return false;
    if (hasUtilization() != other.hasUtilization()) return false;
    if (hasUtilization()) {
      if (!getUtilization()
          .equals(other.getUtilization())) return false;
    }
    if (!getVmDetailsCase().equals(other.getVmDetailsCase())) return false;
    switch (vmDetailsCase_) {
      case 1:
        if (!getVmwareVmDetails()
            .equals(other.getVmwareVmDetails())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + VM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVmId().hashCode();
    if (hasUtilization()) {
      hash = (37 * hash) + UTILIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getUtilization().hashCode();
    }
    switch (vmDetailsCase_) {
      case 1:
        hash = (37 * hash) + VMWARE_VM_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getVmwareVmDetails().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vmmigration.v1.VmUtilizationInfo prototype) {
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
   * Utilization information of a single VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.VmUtilizationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.VmUtilizationInfo)
      com.google.cloud.vmmigration.v1.VmUtilizationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_VmUtilizationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_VmUtilizationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.VmUtilizationInfo.class, com.google.cloud.vmmigration.v1.VmUtilizationInfo.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.VmUtilizationInfo.newBuilder()
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
        getUtilizationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (vmwareVmDetailsBuilder_ != null) {
        vmwareVmDetailsBuilder_.clear();
      }
      vmId_ = "";
      utilization_ = null;
      if (utilizationBuilder_ != null) {
        utilizationBuilder_.dispose();
        utilizationBuilder_ = null;
      }
      vmDetailsCase_ = 0;
      vmDetails_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_VmUtilizationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationInfo getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.VmUtilizationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationInfo build() {
      com.google.cloud.vmmigration.v1.VmUtilizationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmUtilizationInfo buildPartial() {
      com.google.cloud.vmmigration.v1.VmUtilizationInfo result = new com.google.cloud.vmmigration.v1.VmUtilizationInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.VmUtilizationInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vmId_ = vmId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.utilization_ = utilizationBuilder_ == null
            ? utilization_
            : utilizationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.vmmigration.v1.VmUtilizationInfo result) {
      result.vmDetailsCase_ = vmDetailsCase_;
      result.vmDetails_ = this.vmDetails_;
      if (vmDetailsCase_ == 1 &&
          vmwareVmDetailsBuilder_ != null) {
        result.vmDetails_ = vmwareVmDetailsBuilder_.build();
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
      if (other instanceof com.google.cloud.vmmigration.v1.VmUtilizationInfo) {
        return mergeFrom((com.google.cloud.vmmigration.v1.VmUtilizationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.VmUtilizationInfo other) {
      if (other == com.google.cloud.vmmigration.v1.VmUtilizationInfo.getDefaultInstance()) return this;
      if (!other.getVmId().isEmpty()) {
        vmId_ = other.vmId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasUtilization()) {
        mergeUtilization(other.getUtilization());
      }
      switch (other.getVmDetailsCase()) {
        case VMWARE_VM_DETAILS: {
          mergeVmwareVmDetails(other.getVmwareVmDetails());
          break;
        }
        case VMDETAILS_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getVmwareVmDetailsFieldBuilder().getBuilder(),
                  extensionRegistry);
              vmDetailsCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUtilizationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 18
            case 26: {
              vmId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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
    private int vmDetailsCase_ = 0;
    private java.lang.Object vmDetails_;
    public VmDetailsCase
        getVmDetailsCase() {
      return VmDetailsCase.forNumber(
          vmDetailsCase_);
    }

    public Builder clearVmDetails() {
      vmDetailsCase_ = 0;
      vmDetails_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.VmwareVmDetails, com.google.cloud.vmmigration.v1.VmwareVmDetails.Builder, com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder> vmwareVmDetailsBuilder_;
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     * @return Whether the vmwareVmDetails field is set.
     */
    @java.lang.Override
    public boolean hasVmwareVmDetails() {
      return vmDetailsCase_ == 1;
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     * @return The vmwareVmDetails.
     */
    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareVmDetails getVmwareVmDetails() {
      if (vmwareVmDetailsBuilder_ == null) {
        if (vmDetailsCase_ == 1) {
          return (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_;
        }
        return com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
      } else {
        if (vmDetailsCase_ == 1) {
          return vmwareVmDetailsBuilder_.getMessage();
        }
        return com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    public Builder setVmwareVmDetails(com.google.cloud.vmmigration.v1.VmwareVmDetails value) {
      if (vmwareVmDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vmDetails_ = value;
        onChanged();
      } else {
        vmwareVmDetailsBuilder_.setMessage(value);
      }
      vmDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    public Builder setVmwareVmDetails(
        com.google.cloud.vmmigration.v1.VmwareVmDetails.Builder builderForValue) {
      if (vmwareVmDetailsBuilder_ == null) {
        vmDetails_ = builderForValue.build();
        onChanged();
      } else {
        vmwareVmDetailsBuilder_.setMessage(builderForValue.build());
      }
      vmDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    public Builder mergeVmwareVmDetails(com.google.cloud.vmmigration.v1.VmwareVmDetails value) {
      if (vmwareVmDetailsBuilder_ == null) {
        if (vmDetailsCase_ == 1 &&
            vmDetails_ != com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance()) {
          vmDetails_ = com.google.cloud.vmmigration.v1.VmwareVmDetails.newBuilder((com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_)
              .mergeFrom(value).buildPartial();
        } else {
          vmDetails_ = value;
        }
        onChanged();
      } else {
        if (vmDetailsCase_ == 1) {
          vmwareVmDetailsBuilder_.mergeFrom(value);
        } else {
          vmwareVmDetailsBuilder_.setMessage(value);
        }
      }
      vmDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    public Builder clearVmwareVmDetails() {
      if (vmwareVmDetailsBuilder_ == null) {
        if (vmDetailsCase_ == 1) {
          vmDetailsCase_ = 0;
          vmDetails_ = null;
          onChanged();
        }
      } else {
        if (vmDetailsCase_ == 1) {
          vmDetailsCase_ = 0;
          vmDetails_ = null;
        }
        vmwareVmDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    public com.google.cloud.vmmigration.v1.VmwareVmDetails.Builder getVmwareVmDetailsBuilder() {
      return getVmwareVmDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder getVmwareVmDetailsOrBuilder() {
      if ((vmDetailsCase_ == 1) && (vmwareVmDetailsBuilder_ != null)) {
        return vmwareVmDetailsBuilder_.getMessageOrBuilder();
      } else {
        if (vmDetailsCase_ == 1) {
          return (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_;
        }
        return com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The description of the VM in a Source of type Vmware.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.VmwareVmDetails, com.google.cloud.vmmigration.v1.VmwareVmDetails.Builder, com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder> 
        getVmwareVmDetailsFieldBuilder() {
      if (vmwareVmDetailsBuilder_ == null) {
        if (!(vmDetailsCase_ == 1)) {
          vmDetails_ = com.google.cloud.vmmigration.v1.VmwareVmDetails.getDefaultInstance();
        }
        vmwareVmDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.VmwareVmDetails, com.google.cloud.vmmigration.v1.VmwareVmDetails.Builder, com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder>(
                (com.google.cloud.vmmigration.v1.VmwareVmDetails) vmDetails_,
                getParentForChildren(),
                isClean());
        vmDetails_ = null;
      }
      vmDetailsCase_ = 1;
      onChanged();
      return vmwareVmDetailsBuilder_;
    }

    private java.lang.Object vmId_ = "";
    /**
     * <pre>
     * The VM's ID in the source.
     * </pre>
     *
     * <code>string vm_id = 3;</code>
     * @return The vmId.
     */
    public java.lang.String getVmId() {
      java.lang.Object ref = vmId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The VM's ID in the source.
     * </pre>
     *
     * <code>string vm_id = 3;</code>
     * @return The bytes for vmId.
     */
    public com.google.protobuf.ByteString
        getVmIdBytes() {
      java.lang.Object ref = vmId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vmId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The VM's ID in the source.
     * </pre>
     *
     * <code>string vm_id = 3;</code>
     * @param value The vmId to set.
     * @return This builder for chaining.
     */
    public Builder setVmId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vmId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The VM's ID in the source.
     * </pre>
     *
     * <code>string vm_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVmId() {
      vmId_ = getDefaultInstance().getVmId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The VM's ID in the source.
     * </pre>
     *
     * <code>string vm_id = 3;</code>
     * @param value The bytes for vmId to set.
     * @return This builder for chaining.
     */
    public Builder setVmIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      vmId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.VmUtilizationMetrics, com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder, com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder> utilizationBuilder_;
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     * @return Whether the utilization field is set.
     */
    public boolean hasUtilization() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     * @return The utilization.
     */
    public com.google.cloud.vmmigration.v1.VmUtilizationMetrics getUtilization() {
      if (utilizationBuilder_ == null) {
        return utilization_ == null ? com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance() : utilization_;
      } else {
        return utilizationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public Builder setUtilization(com.google.cloud.vmmigration.v1.VmUtilizationMetrics value) {
      if (utilizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        utilization_ = value;
      } else {
        utilizationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public Builder setUtilization(
        com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder builderForValue) {
      if (utilizationBuilder_ == null) {
        utilization_ = builderForValue.build();
      } else {
        utilizationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public Builder mergeUtilization(com.google.cloud.vmmigration.v1.VmUtilizationMetrics value) {
      if (utilizationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          utilization_ != null &&
          utilization_ != com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance()) {
          getUtilizationBuilder().mergeFrom(value);
        } else {
          utilization_ = value;
        }
      } else {
        utilizationBuilder_.mergeFrom(value);
      }
      if (utilization_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public Builder clearUtilization() {
      bitField0_ = (bitField0_ & ~0x00000004);
      utilization_ = null;
      if (utilizationBuilder_ != null) {
        utilizationBuilder_.dispose();
        utilizationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder getUtilizationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUtilizationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    public com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder getUtilizationOrBuilder() {
      if (utilizationBuilder_ != null) {
        return utilizationBuilder_.getMessageOrBuilder();
      } else {
        return utilization_ == null ?
            com.google.cloud.vmmigration.v1.VmUtilizationMetrics.getDefaultInstance() : utilization_;
      }
    }
    /**
     * <pre>
     * Utilization metrics for this VM.
     * </pre>
     *
     * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vmmigration.v1.VmUtilizationMetrics, com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder, com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder> 
        getUtilizationFieldBuilder() {
      if (utilizationBuilder_ == null) {
        utilizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.VmUtilizationMetrics, com.google.cloud.vmmigration.v1.VmUtilizationMetrics.Builder, com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder>(
                getUtilization(),
                getParentForChildren(),
                isClean());
        utilization_ = null;
      }
      return utilizationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.VmUtilizationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.VmUtilizationInfo)
  private static final com.google.cloud.vmmigration.v1.VmUtilizationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.VmUtilizationInfo();
  }

  public static com.google.cloud.vmmigration.v1.VmUtilizationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmUtilizationInfo>
      PARSER = new com.google.protobuf.AbstractParser<VmUtilizationInfo>() {
    @java.lang.Override
    public VmUtilizationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VmUtilizationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmUtilizationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmUtilizationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

