// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for
 * [ScheduleService.UpdateSchedule][google.cloud.aiplatform.v1beta1.ScheduleService.UpdateSchedule].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateScheduleRequest}
 */
public final class UpdateScheduleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)
    UpdateScheduleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateScheduleRequest.newBuilder() to construct.
  private UpdateScheduleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateScheduleRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateScheduleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ScheduleServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ScheduleServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.class, com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.Builder.class);
  }

  public static final int SCHEDULE_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.Schedule schedule_;
  /**
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the schedule field is set.
   */
  @java.lang.Override
  public boolean hasSchedule() {
    return schedule_ != null;
  }
  /**
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The schedule.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Schedule getSchedule() {
    return schedule_ == null ? com.google.cloud.aiplatform.v1beta1.Schedule.getDefaultInstance() : schedule_;
  }
  /**
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder getScheduleOrBuilder() {
    return schedule_ == null ? com.google.cloud.aiplatform.v1beta1.Schedule.getDefaultInstance() : schedule_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (schedule_ != null) {
      output.writeMessage(1, getSchedule());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schedule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSchedule());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest other = (com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest) obj;

    if (hasSchedule() != other.hasSchedule()) return false;
    if (hasSchedule()) {
      if (!getSchedule()
          .equals(other.getSchedule())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasSchedule()) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getSchedule().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest prototype) {
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
   * Request message for
   * [ScheduleService.UpdateSchedule][google.cloud.aiplatform.v1beta1.ScheduleService.UpdateSchedule].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateScheduleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)
      com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ScheduleServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ScheduleServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.class, com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.newBuilder()
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
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ScheduleServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest result = new com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schedule_ = scheduleBuilder_ == null
            ? schedule_
            : scheduleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest.getDefaultInstance()) return this;
      if (other.hasSchedule()) {
        mergeSchedule(other.getSchedule());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.cloud.aiplatform.v1beta1.Schedule schedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Schedule, com.google.cloud.aiplatform.v1beta1.Schedule.Builder, com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder> scheduleBuilder_;
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the schedule field is set.
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The schedule.
     */
    public com.google.cloud.aiplatform.v1beta1.Schedule getSchedule() {
      if (scheduleBuilder_ == null) {
        return schedule_ == null ? com.google.cloud.aiplatform.v1beta1.Schedule.getDefaultInstance() : schedule_;
      } else {
        return scheduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSchedule(com.google.cloud.aiplatform.v1beta1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedule_ = value;
      } else {
        scheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSchedule(
        com.google.cloud.aiplatform.v1beta1.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        schedule_ = builderForValue.build();
      } else {
        scheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSchedule(com.google.cloud.aiplatform.v1beta1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          schedule_ != null &&
          schedule_ != com.google.cloud.aiplatform.v1beta1.Schedule.getDefaultInstance()) {
          getScheduleBuilder().mergeFrom(value);
        } else {
          schedule_ = value;
        }
      } else {
        scheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSchedule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Schedule.Builder getScheduleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScheduleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder getScheduleOrBuilder() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilder();
      } else {
        return schedule_ == null ?
            com.google.cloud.aiplatform.v1beta1.Schedule.getDefaultInstance() : schedule_;
      }
    }
    /**
     * <pre>
     * Required. The Schedule which replaces the resource on the server.
     * The following restrictions will be applied:
     *
     *   * The scheduled request type cannot be changed.
     *   * The non-empty fields cannot be unset.
     *   * The output_only fields will be ignored if specified.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Schedule, com.google.cloud.aiplatform.v1beta1.Schedule.Builder, com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder> 
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Schedule, com.google.cloud.aiplatform.v1beta1.Schedule.Builder, com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder>(
                getSchedule(),
                getParentForChildren(),
                isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. See
     * [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScheduleRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateScheduleRequest>() {
    @java.lang.Override
    public UpdateScheduleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateScheduleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScheduleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateScheduleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

