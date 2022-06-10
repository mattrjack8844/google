/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.batch.v1;

/**
 *
 *
 * <pre>
 * Status of a task
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1.TaskStatus}
 */
public final class TaskStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1.TaskStatus)
    TaskStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TaskStatus.newBuilder() to construct.
  private TaskStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TaskStatus() {
    state_ = 0;
    statusEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TaskStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TaskStatus(
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

              state_ = rawValue;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                statusEvents_ = new java.util.ArrayList<com.google.cloud.batch.v1.StatusEvent>();
                mutable_bitField0_ |= 0x00000001;
              }
              statusEvents_.add(
                  input.readMessage(
                      com.google.cloud.batch.v1.StatusEvent.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        statusEvents_ = java.util.Collections.unmodifiableList(statusEvents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_TaskStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1.TaskStatus.class,
            com.google.cloud.batch.v1.TaskStatus.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Task states.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.batch.v1.TaskStatus.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * unknown state
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The Task is created and waiting for resources.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     *
     *
     * <pre>
     * The Task is assigned to at least one VM.
     * </pre>
     *
     * <code>ASSIGNED = 2;</code>
     */
    ASSIGNED(2),
    /**
     *
     *
     * <pre>
     * The Task is running.
     * </pre>
     *
     * <code>RUNNING = 3;</code>
     */
    RUNNING(3),
    /**
     *
     *
     * <pre>
     * The Task has failed.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    FAILED(4),
    /**
     *
     *
     * <pre>
     * The Task has succeeded.
     * </pre>
     *
     * <code>SUCCEEDED = 5;</code>
     */
    SUCCEEDED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * unknown state
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The Task is created and waiting for resources.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The Task is assigned to at least one VM.
     * </pre>
     *
     * <code>ASSIGNED = 2;</code>
     */
    public static final int ASSIGNED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The Task is running.
     * </pre>
     *
     * <code>RUNNING = 3;</code>
     */
    public static final int RUNNING_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The Task has failed.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    public static final int FAILED_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The Task has succeeded.
     * </pre>
     *
     * <code>SUCCEEDED = 5;</code>
     */
    public static final int SUCCEEDED_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return PENDING;
        case 2:
          return ASSIGNED;
        case 3:
          return RUNNING;
        case 4:
          return FAILED;
        case 5:
          return SUCCEEDED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.batch.v1.TaskStatus.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.batch.v1.TaskStatus.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   *
   *
   * <pre>
   * Task state
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * Task state
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.TaskStatus.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.batch.v1.TaskStatus.State result =
        com.google.cloud.batch.v1.TaskStatus.State.valueOf(state_);
    return result == null ? com.google.cloud.batch.v1.TaskStatus.State.UNRECOGNIZED : result;
  }

  public static final int STATUS_EVENTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.batch.v1.StatusEvent> statusEvents_;
  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.batch.v1.StatusEvent> getStatusEventsList() {
    return statusEvents_;
  }
  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.batch.v1.StatusEventOrBuilder>
      getStatusEventsOrBuilderList() {
    return statusEvents_;
  }
  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
   */
  @java.lang.Override
  public int getStatusEventsCount() {
    return statusEvents_.size();
  }
  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.StatusEvent getStatusEvents(int index) {
    return statusEvents_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.StatusEventOrBuilder getStatusEventsOrBuilder(int index) {
    return statusEvents_.get(index);
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
    if (state_ != com.google.cloud.batch.v1.TaskStatus.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    for (int i = 0; i < statusEvents_.size(); i++) {
      output.writeMessage(2, statusEvents_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.batch.v1.TaskStatus.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    for (int i = 0; i < statusEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, statusEvents_.get(i));
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
    if (!(obj instanceof com.google.cloud.batch.v1.TaskStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1.TaskStatus other = (com.google.cloud.batch.v1.TaskStatus) obj;

    if (state_ != other.state_) return false;
    if (!getStatusEventsList().equals(other.getStatusEventsList())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (getStatusEventsCount() > 0) {
      hash = (37 * hash) + STATUS_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStatusEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.TaskStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1.TaskStatus prototype) {
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
   * Status of a task
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1.TaskStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1.TaskStatus)
      com.google.cloud.batch.v1.TaskStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_TaskStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1.TaskStatus.class,
              com.google.cloud.batch.v1.TaskStatus.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1.TaskStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStatusEventsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = 0;

      if (statusEventsBuilder_ == null) {
        statusEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        statusEventsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_TaskStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.TaskStatus getDefaultInstanceForType() {
      return com.google.cloud.batch.v1.TaskStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.TaskStatus build() {
      com.google.cloud.batch.v1.TaskStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.TaskStatus buildPartial() {
      com.google.cloud.batch.v1.TaskStatus result = new com.google.cloud.batch.v1.TaskStatus(this);
      int from_bitField0_ = bitField0_;
      result.state_ = state_;
      if (statusEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          statusEvents_ = java.util.Collections.unmodifiableList(statusEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.statusEvents_ = statusEvents_;
      } else {
        result.statusEvents_ = statusEventsBuilder_.build();
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
      if (other instanceof com.google.cloud.batch.v1.TaskStatus) {
        return mergeFrom((com.google.cloud.batch.v1.TaskStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1.TaskStatus other) {
      if (other == com.google.cloud.batch.v1.TaskStatus.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (statusEventsBuilder_ == null) {
        if (!other.statusEvents_.isEmpty()) {
          if (statusEvents_.isEmpty()) {
            statusEvents_ = other.statusEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatusEventsIsMutable();
            statusEvents_.addAll(other.statusEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.statusEvents_.isEmpty()) {
          if (statusEventsBuilder_.isEmpty()) {
            statusEventsBuilder_.dispose();
            statusEventsBuilder_ = null;
            statusEvents_ = other.statusEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statusEventsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStatusEventsFieldBuilder()
                    : null;
          } else {
            statusEventsBuilder_.addAllMessages(other.statusEvents_);
          }
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
      com.google.cloud.batch.v1.TaskStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.batch.v1.TaskStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * Task state
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * Task state
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {

      state_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task state
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.batch.v1.TaskStatus.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.batch.v1.TaskStatus.State result =
          com.google.cloud.batch.v1.TaskStatus.State.valueOf(state_);
      return result == null ? com.google.cloud.batch.v1.TaskStatus.State.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Task state
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.batch.v1.TaskStatus.State value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task state
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.batch.v1.StatusEvent> statusEvents_ =
        java.util.Collections.emptyList();

    private void ensureStatusEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        statusEvents_ =
            new java.util.ArrayList<com.google.cloud.batch.v1.StatusEvent>(statusEvents_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.batch.v1.StatusEvent,
            com.google.cloud.batch.v1.StatusEvent.Builder,
            com.google.cloud.batch.v1.StatusEventOrBuilder>
        statusEventsBuilder_;

    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public java.util.List<com.google.cloud.batch.v1.StatusEvent> getStatusEventsList() {
      if (statusEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(statusEvents_);
      } else {
        return statusEventsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public int getStatusEventsCount() {
      if (statusEventsBuilder_ == null) {
        return statusEvents_.size();
      } else {
        return statusEventsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public com.google.cloud.batch.v1.StatusEvent getStatusEvents(int index) {
      if (statusEventsBuilder_ == null) {
        return statusEvents_.get(index);
      } else {
        return statusEventsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder setStatusEvents(int index, com.google.cloud.batch.v1.StatusEvent value) {
      if (statusEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusEventsIsMutable();
        statusEvents_.set(index, value);
        onChanged();
      } else {
        statusEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder setStatusEvents(
        int index, com.google.cloud.batch.v1.StatusEvent.Builder builderForValue) {
      if (statusEventsBuilder_ == null) {
        ensureStatusEventsIsMutable();
        statusEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        statusEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder addStatusEvents(com.google.cloud.batch.v1.StatusEvent value) {
      if (statusEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusEventsIsMutable();
        statusEvents_.add(value);
        onChanged();
      } else {
        statusEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder addStatusEvents(int index, com.google.cloud.batch.v1.StatusEvent value) {
      if (statusEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusEventsIsMutable();
        statusEvents_.add(index, value);
        onChanged();
      } else {
        statusEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder addStatusEvents(com.google.cloud.batch.v1.StatusEvent.Builder builderForValue) {
      if (statusEventsBuilder_ == null) {
        ensureStatusEventsIsMutable();
        statusEvents_.add(builderForValue.build());
        onChanged();
      } else {
        statusEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder addStatusEvents(
        int index, com.google.cloud.batch.v1.StatusEvent.Builder builderForValue) {
      if (statusEventsBuilder_ == null) {
        ensureStatusEventsIsMutable();
        statusEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        statusEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder addAllStatusEvents(
        java.lang.Iterable<? extends com.google.cloud.batch.v1.StatusEvent> values) {
      if (statusEventsBuilder_ == null) {
        ensureStatusEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, statusEvents_);
        onChanged();
      } else {
        statusEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder clearStatusEvents() {
      if (statusEventsBuilder_ == null) {
        statusEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statusEventsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public Builder removeStatusEvents(int index) {
      if (statusEventsBuilder_ == null) {
        ensureStatusEventsIsMutable();
        statusEvents_.remove(index);
        onChanged();
      } else {
        statusEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public com.google.cloud.batch.v1.StatusEvent.Builder getStatusEventsBuilder(int index) {
      return getStatusEventsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public com.google.cloud.batch.v1.StatusEventOrBuilder getStatusEventsOrBuilder(int index) {
      if (statusEventsBuilder_ == null) {
        return statusEvents_.get(index);
      } else {
        return statusEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.batch.v1.StatusEventOrBuilder>
        getStatusEventsOrBuilderList() {
      if (statusEventsBuilder_ != null) {
        return statusEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(statusEvents_);
      }
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public com.google.cloud.batch.v1.StatusEvent.Builder addStatusEventsBuilder() {
      return getStatusEventsFieldBuilder()
          .addBuilder(com.google.cloud.batch.v1.StatusEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public com.google.cloud.batch.v1.StatusEvent.Builder addStatusEventsBuilder(int index) {
      return getStatusEventsFieldBuilder()
          .addBuilder(index, com.google.cloud.batch.v1.StatusEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Detailed info about why the state is reached.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.StatusEvent status_events = 2;</code>
     */
    public java.util.List<com.google.cloud.batch.v1.StatusEvent.Builder>
        getStatusEventsBuilderList() {
      return getStatusEventsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.batch.v1.StatusEvent,
            com.google.cloud.batch.v1.StatusEvent.Builder,
            com.google.cloud.batch.v1.StatusEventOrBuilder>
        getStatusEventsFieldBuilder() {
      if (statusEventsBuilder_ == null) {
        statusEventsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.batch.v1.StatusEvent,
                com.google.cloud.batch.v1.StatusEvent.Builder,
                com.google.cloud.batch.v1.StatusEventOrBuilder>(
                statusEvents_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        statusEvents_ = null;
      }
      return statusEventsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1.TaskStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1.TaskStatus)
  private static final com.google.cloud.batch.v1.TaskStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1.TaskStatus();
  }

  public static com.google.cloud.batch.v1.TaskStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskStatus> PARSER =
      new com.google.protobuf.AbstractParser<TaskStatus>() {
        @java.lang.Override
        public TaskStatus parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TaskStatus(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TaskStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1.TaskStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
