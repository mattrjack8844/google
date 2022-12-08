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
// source: google/cloud/aiplatform/v1/custom_job.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * All parameters related to queuing and scheduling of custom jobs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.Scheduling}
 */
public final class Scheduling extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.Scheduling)
    SchedulingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Scheduling.newBuilder() to construct.
  private Scheduling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Scheduling() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Scheduling();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.CustomJobProto
        .internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.CustomJobProto
        .internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.Scheduling.class,
            com.google.cloud.aiplatform.v1.Scheduling.Builder.class);
  }

  public static final int TIMEOUT_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration timeout_;
  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   *
   * @return Whether the timeout field is set.
   */
  @java.lang.Override
  public boolean hasTimeout() {
    return timeout_ != null;
  }
  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   *
   * @return The timeout.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeout() {
    return timeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeout_;
  }
  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder() {
    return getTimeout();
  }

  public static final int RESTART_JOB_ON_WORKER_RESTART_FIELD_NUMBER = 3;
  private boolean restartJobOnWorkerRestart_;
  /**
   *
   *
   * <pre>
   * Restarts the entire CustomJob if a worker gets restarted.
   * This feature can be used by distributed training jobs that are not
   * resilient to workers leaving and joining a job.
   * </pre>
   *
   * <code>bool restart_job_on_worker_restart = 3;</code>
   *
   * @return The restartJobOnWorkerRestart.
   */
  @java.lang.Override
  public boolean getRestartJobOnWorkerRestart() {
    return restartJobOnWorkerRestart_;
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
    if (timeout_ != null) {
      output.writeMessage(1, getTimeout());
    }
    if (restartJobOnWorkerRestart_ != false) {
      output.writeBool(3, restartJobOnWorkerRestart_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeout_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeout());
    }
    if (restartJobOnWorkerRestart_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, restartJobOnWorkerRestart_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.Scheduling)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.Scheduling other =
        (com.google.cloud.aiplatform.v1.Scheduling) obj;

    if (hasTimeout() != other.hasTimeout()) return false;
    if (hasTimeout()) {
      if (!getTimeout().equals(other.getTimeout())) return false;
    }
    if (getRestartJobOnWorkerRestart() != other.getRestartJobOnWorkerRestart()) return false;
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
    if (hasTimeout()) {
      hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeout().hashCode();
    }
    hash = (37 * hash) + RESTART_JOB_ON_WORKER_RESTART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getRestartJobOnWorkerRestart());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Scheduling parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.Scheduling prototype) {
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
   * All parameters related to queuing and scheduling of custom jobs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.Scheduling}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.Scheduling)
      com.google.cloud.aiplatform.v1.SchedulingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.CustomJobProto
          .internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.CustomJobProto
          .internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.Scheduling.class,
              com.google.cloud.aiplatform.v1.Scheduling.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.Scheduling.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timeoutBuilder_ == null) {
        timeout_ = null;
      } else {
        timeout_ = null;
        timeoutBuilder_ = null;
      }
      restartJobOnWorkerRestart_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.CustomJobProto
          .internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Scheduling getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.Scheduling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Scheduling build() {
      com.google.cloud.aiplatform.v1.Scheduling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Scheduling buildPartial() {
      com.google.cloud.aiplatform.v1.Scheduling result =
          new com.google.cloud.aiplatform.v1.Scheduling(this);
      if (timeoutBuilder_ == null) {
        result.timeout_ = timeout_;
      } else {
        result.timeout_ = timeoutBuilder_.build();
      }
      result.restartJobOnWorkerRestart_ = restartJobOnWorkerRestart_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.Scheduling) {
        return mergeFrom((com.google.cloud.aiplatform.v1.Scheduling) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.Scheduling other) {
      if (other == com.google.cloud.aiplatform.v1.Scheduling.getDefaultInstance()) return this;
      if (other.hasTimeout()) {
        mergeTimeout(other.getTimeout());
      }
      if (other.getRestartJobOnWorkerRestart() != false) {
        setRestartJobOnWorkerRestart(other.getRestartJobOnWorkerRestart());
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
            case 10:
              {
                input.readMessage(getTimeoutFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 24:
              {
                restartJobOnWorkerRestart_ = input.readBool();

                break;
              } // case 24
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

    private com.google.protobuf.Duration timeout_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeoutBuilder_;
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     *
     * @return Whether the timeout field is set.
     */
    public boolean hasTimeout() {
      return timeoutBuilder_ != null || timeout_ != null;
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     *
     * @return The timeout.
     */
    public com.google.protobuf.Duration getTimeout() {
      if (timeoutBuilder_ == null) {
        return timeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeout_;
      } else {
        return timeoutBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public Builder setTimeout(com.google.protobuf.Duration value) {
      if (timeoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeout_ = value;
        onChanged();
      } else {
        timeoutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public Builder setTimeout(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeoutBuilder_ == null) {
        timeout_ = builderForValue.build();
        onChanged();
      } else {
        timeoutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public Builder mergeTimeout(com.google.protobuf.Duration value) {
      if (timeoutBuilder_ == null) {
        if (timeout_ != null) {
          timeout_ =
              com.google.protobuf.Duration.newBuilder(timeout_).mergeFrom(value).buildPartial();
        } else {
          timeout_ = value;
        }
        onChanged();
      } else {
        timeoutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public Builder clearTimeout() {
      if (timeoutBuilder_ == null) {
        timeout_ = null;
        onChanged();
      } else {
        timeout_ = null;
        timeoutBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeoutBuilder() {

      onChanged();
      return getTimeoutFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder() {
      if (timeoutBuilder_ != null) {
        return timeoutBuilder_.getMessageOrBuilder();
      } else {
        return timeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeout_;
      }
    }
    /**
     *
     *
     * <pre>
     * The maximum job running time. The default is 7 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeoutFieldBuilder() {
      if (timeoutBuilder_ == null) {
        timeoutBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeout(), getParentForChildren(), isClean());
        timeout_ = null;
      }
      return timeoutBuilder_;
    }

    private boolean restartJobOnWorkerRestart_;
    /**
     *
     *
     * <pre>
     * Restarts the entire CustomJob if a worker gets restarted.
     * This feature can be used by distributed training jobs that are not
     * resilient to workers leaving and joining a job.
     * </pre>
     *
     * <code>bool restart_job_on_worker_restart = 3;</code>
     *
     * @return The restartJobOnWorkerRestart.
     */
    @java.lang.Override
    public boolean getRestartJobOnWorkerRestart() {
      return restartJobOnWorkerRestart_;
    }
    /**
     *
     *
     * <pre>
     * Restarts the entire CustomJob if a worker gets restarted.
     * This feature can be used by distributed training jobs that are not
     * resilient to workers leaving and joining a job.
     * </pre>
     *
     * <code>bool restart_job_on_worker_restart = 3;</code>
     *
     * @param value The restartJobOnWorkerRestart to set.
     * @return This builder for chaining.
     */
    public Builder setRestartJobOnWorkerRestart(boolean value) {

      restartJobOnWorkerRestart_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Restarts the entire CustomJob if a worker gets restarted.
     * This feature can be used by distributed training jobs that are not
     * resilient to workers leaving and joining a job.
     * </pre>
     *
     * <code>bool restart_job_on_worker_restart = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRestartJobOnWorkerRestart() {

      restartJobOnWorkerRestart_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.Scheduling)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.Scheduling)
  private static final com.google.cloud.aiplatform.v1.Scheduling DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.Scheduling();
  }

  public static com.google.cloud.aiplatform.v1.Scheduling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Scheduling> PARSER =
      new com.google.protobuf.AbstractParser<Scheduling>() {
        @java.lang.Override
        public Scheduling parsePartialFrom(
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

  public static com.google.protobuf.Parser<Scheduling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Scheduling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Scheduling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
