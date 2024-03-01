// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tasks.v2beta3;

/**
 * <pre>
 * Request message for forcing a task to run now using
 * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.RunTaskRequest}
 */
public final class RunTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.RunTaskRequest)
    RunTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunTaskRequest.newBuilder() to construct.
  private RunTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunTaskRequest() {
    name_ = "";
    responseView_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunTaskRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.RunTaskRequest.class, com.google.cloud.tasks.v2beta3.RunTaskRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_VIEW_FIELD_NUMBER = 2;
  private int responseView_ = 0;
  /**
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
   * @return The enum numeric value on the wire for responseView.
   */
  @java.lang.Override public int getResponseViewValue() {
    return responseView_;
  }
  /**
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
   * @return The responseView.
   */
  @java.lang.Override public com.google.cloud.tasks.v2beta3.Task.View getResponseView() {
    com.google.cloud.tasks.v2beta3.Task.View result = com.google.cloud.tasks.v2beta3.Task.View.forNumber(responseView_);
    return result == null ? com.google.cloud.tasks.v2beta3.Task.View.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (responseView_ != com.google.cloud.tasks.v2beta3.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, responseView_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (responseView_ != com.google.cloud.tasks.v2beta3.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, responseView_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.RunTaskRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.RunTaskRequest other = (com.google.cloud.tasks.v2beta3.RunTaskRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (responseView_ != other.responseView_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RESPONSE_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + responseView_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.RunTaskRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.RunTaskRequest prototype) {
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
   * Request message for forcing a task to run now using
   * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.RunTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.RunTaskRequest)
      com.google.cloud.tasks.v2beta3.RunTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.RunTaskRequest.class, com.google.cloud.tasks.v2beta3.RunTaskRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.RunTaskRequest.newBuilder()
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
      name_ = "";
      responseView_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RunTaskRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.RunTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RunTaskRequest build() {
      com.google.cloud.tasks.v2beta3.RunTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RunTaskRequest buildPartial() {
      com.google.cloud.tasks.v2beta3.RunTaskRequest result = new com.google.cloud.tasks.v2beta3.RunTaskRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tasks.v2beta3.RunTaskRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.responseView_ = responseView_;
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
      if (other instanceof com.google.cloud.tasks.v2beta3.RunTaskRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.RunTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.RunTaskRequest other) {
      if (other == com.google.cloud.tasks.v2beta3.RunTaskRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.responseView_ != 0) {
        setResponseViewValue(other.getResponseViewValue());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              responseView_ = input.readEnum();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int responseView_ = 0;
    /**
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
     *
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     *
     * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta3.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
     * @return The enum numeric value on the wire for responseView.
     */
    @java.lang.Override public int getResponseViewValue() {
      return responseView_;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
     *
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     *
     * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta3.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
     * @param value The enum numeric value on the wire for responseView to set.
     * @return This builder for chaining.
     */
    public Builder setResponseViewValue(int value) {
      responseView_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
     *
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     *
     * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta3.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
     * @return The responseView.
     */
    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.Task.View getResponseView() {
      com.google.cloud.tasks.v2beta3.Task.View result = com.google.cloud.tasks.v2beta3.Task.View.forNumber(responseView_);
      return result == null ? com.google.cloud.tasks.v2beta3.Task.View.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
     *
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     *
     * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta3.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
     * @param value The responseView to set.
     * @return This builder for chaining.
     */
    public Builder setResponseView(com.google.cloud.tasks.v2beta3.Task.View value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      responseView_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta3.Task] will be returned.
     *
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     *
     * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta3.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseView() {
      bitField0_ = (bitField0_ & ~0x00000002);
      responseView_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.RunTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.RunTaskRequest)
  private static final com.google.cloud.tasks.v2beta3.RunTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.RunTaskRequest();
  }

  public static com.google.cloud.tasks.v2beta3.RunTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<RunTaskRequest>() {
    @java.lang.Override
    public RunTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.RunTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

