// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * Request message for acknowledging a task using
 * [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.AcknowledgeTaskRequest}
 */
public final class AcknowledgeTaskRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
    AcknowledgeTaskRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcknowledgeTaskRequest.newBuilder() to construct.
  private AcknowledgeTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcknowledgeTaskRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcknowledgeTaskRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AcknowledgeTaskRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (scheduleTime_ != null) {
                subBuilder = scheduleTime_.toBuilder();
              }
              scheduleTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scheduleTime_);
                scheduleTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_AcknowledgeTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_AcknowledgeTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.class,
            com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEDULE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp scheduleTime_;
  /**
   *
   *
   * <pre>
   * Required.
   * The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
   */
  public boolean hasScheduleTime() {
    return scheduleTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getScheduleTime() {
    return scheduleTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : scheduleTime_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder() {
    return getScheduleTime();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (scheduleTime_ != null) {
      output.writeMessage(2, getScheduleTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (scheduleTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getScheduleTime());
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest other =
        (com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasScheduleTime() != other.hasScheduleTime()) return false;
    if (hasScheduleTime()) {
      if (!getScheduleTime().equals(other.getScheduleTime())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasScheduleTime()) {
      hash = (37 * hash) + SCHEDULE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest prototype) {
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
   * Request message for acknowledging a task using
   * [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.AcknowledgeTaskRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
      com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_AcknowledgeTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_AcknowledgeTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.class,
              com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.newBuilder()
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
      name_ = "";

      if (scheduleTimeBuilder_ == null) {
        scheduleTime_ = null;
      } else {
        scheduleTime_ = null;
        scheduleTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_AcknowledgeTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest build() {
      com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest buildPartial() {
      com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest result =
          new com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest(this);
      result.name_ = name_;
      if (scheduleTimeBuilder_ == null) {
        result.scheduleTime_ = scheduleTime_;
      } else {
        result.scheduleTime_ = scheduleTimeBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest other) {
      if (other == com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasScheduleTime()) {
        mergeScheduleTime(other.getScheduleTime());
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
      com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp scheduleTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        scheduleTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public boolean hasScheduleTime() {
      return scheduleTimeBuilder_ != null || scheduleTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getScheduleTime() {
      if (scheduleTimeBuilder_ == null) {
        return scheduleTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : scheduleTime_;
      } else {
        return scheduleTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public Builder setScheduleTime(com.google.protobuf.Timestamp value) {
      if (scheduleTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scheduleTime_ = value;
        onChanged();
      } else {
        scheduleTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public Builder setScheduleTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (scheduleTimeBuilder_ == null) {
        scheduleTime_ = builderForValue.build();
        onChanged();
      } else {
        scheduleTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public Builder mergeScheduleTime(com.google.protobuf.Timestamp value) {
      if (scheduleTimeBuilder_ == null) {
        if (scheduleTime_ != null) {
          scheduleTime_ =
              com.google.protobuf.Timestamp.newBuilder(scheduleTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          scheduleTime_ = value;
        }
        onChanged();
      } else {
        scheduleTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public Builder clearScheduleTime() {
      if (scheduleTimeBuilder_ == null) {
        scheduleTime_ = null;
        onChanged();
      } else {
        scheduleTime_ = null;
        scheduleTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getScheduleTimeBuilder() {

      onChanged();
      return getScheduleTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder() {
      if (scheduleTimeBuilder_ != null) {
        return scheduleTimeBuilder_.getMessageOrBuilder();
      } else {
        return scheduleTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : scheduleTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task's current schedule time, available in the
     * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
     * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
     * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
     * This restriction is to ensure that your worker currently holds the lease.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp schedule_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getScheduleTimeFieldBuilder() {
      if (scheduleTimeBuilder_ == null) {
        scheduleTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getScheduleTime(), getParentForChildren(), isClean());
        scheduleTime_ = null;
      }
      return scheduleTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
  private static final com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest();
  }

  public static com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeTaskRequest> PARSER =
      new com.google.protobuf.AbstractParser<AcknowledgeTaskRequest>() {
        @java.lang.Override
        public AcknowledgeTaskRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AcknowledgeTaskRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AcknowledgeTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
