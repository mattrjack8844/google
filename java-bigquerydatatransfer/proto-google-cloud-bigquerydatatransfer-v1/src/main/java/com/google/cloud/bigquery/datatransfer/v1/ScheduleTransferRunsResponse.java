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
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * A response to schedule transfer runs for a time range.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse}
 */
public final class ScheduleTransferRunsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse)
    ScheduleTransferRunsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ScheduleTransferRunsResponse.newBuilder() to construct.
  private ScheduleTransferRunsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ScheduleTransferRunsResponse() {
    runs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ScheduleTransferRunsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleTransferRunsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleTransferRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.class,
            com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.Builder.class);
  }

  public static final int RUNS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> runs_;
  /**
   *
   *
   * <pre>
   * The transfer runs that were scheduled.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getRunsList() {
    return runs_;
  }
  /**
   *
   *
   * <pre>
   * The transfer runs that were scheduled.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>
      getRunsOrBuilderList() {
    return runs_;
  }
  /**
   *
   *
   * <pre>
   * The transfer runs that were scheduled.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public int getRunsCount() {
    return runs_.size();
  }
  /**
   *
   *
   * <pre>
   * The transfer runs that were scheduled.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRun getRuns(int index) {
    return runs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The transfer runs that were scheduled.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getRunsOrBuilder(
      int index) {
    return runs_.get(index);
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
    for (int i = 0; i < runs_.size(); i++) {
      output.writeMessage(1, runs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < runs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, runs_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse other =
        (com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse) obj;

    if (!getRunsList().equals(other.getRunsList())) return false;
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
    if (getRunsCount() > 0) {
      hash = (37 * hash) + RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getRunsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse parseFrom(
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
      com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse prototype) {
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
   * A response to schedule transfer runs for a time range.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse)
      com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleTransferRunsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleTransferRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.class,
              com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (runsBuilder_ == null) {
        runs_ = java.util.Collections.emptyList();
      } else {
        runs_ = null;
        runsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleTransferRunsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse result =
          new com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse(this);
      int from_bitField0_ = bitField0_;
      if (runsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          runs_ = java.util.Collections.unmodifiableList(runs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.runs_ = runs_;
      } else {
        result.runs_ = runsBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse other) {
      if (other
          == com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
              .getDefaultInstance()) return this;
      if (runsBuilder_ == null) {
        if (!other.runs_.isEmpty()) {
          if (runs_.isEmpty()) {
            runs_ = other.runs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRunsIsMutable();
            runs_.addAll(other.runs_);
          }
          onChanged();
        }
      } else {
        if (!other.runs_.isEmpty()) {
          if (runsBuilder_.isEmpty()) {
            runsBuilder_.dispose();
            runsBuilder_ = null;
            runs_ = other.runs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            runsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRunsFieldBuilder()
                    : null;
          } else {
            runsBuilder_.addAllMessages(other.runs_);
          }
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
            case 10:
              {
                com.google.cloud.bigquery.datatransfer.v1.TransferRun m =
                    input.readMessage(
                        com.google.cloud.bigquery.datatransfer.v1.TransferRun.parser(),
                        extensionRegistry);
                if (runsBuilder_ == null) {
                  ensureRunsIsMutable();
                  runs_.add(m);
                } else {
                  runsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> runs_ =
        java.util.Collections.emptyList();

    private void ensureRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        runs_ =
            new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferRun>(runs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.TransferRun,
            com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder,
            com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>
        runsBuilder_;

    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getRunsList() {
      if (runsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(runs_);
      } else {
        return runsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public int getRunsCount() {
      if (runsBuilder_ == null) {
        return runs_.size();
      } else {
        return runsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun getRuns(int index) {
      if (runsBuilder_ == null) {
        return runs_.get(index);
      } else {
        return runsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder setRuns(int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.set(index, value);
        onChanged();
      } else {
        runsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder setRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.set(index, builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.add(value);
        onChanged();
      } else {
        runsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.add(index, value);
        onChanged();
      } else {
        runsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(
        com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.add(builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.add(index, builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addAllRuns(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRun>
            values) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, runs_);
        onChanged();
      } else {
        runsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder clearRuns() {
      if (runsBuilder_ == null) {
        runs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        runsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder removeRuns(int index) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.remove(index);
        onChanged();
      } else {
        runsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder getRunsBuilder(int index) {
      return getRunsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getRunsOrBuilder(
        int index) {
      if (runsBuilder_ == null) {
        return runs_.get(index);
      } else {
        return runsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>
        getRunsOrBuilderList() {
      if (runsBuilder_ != null) {
        return runsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(runs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addRunsBuilder() {
      return getRunsFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addRunsBuilder(int index) {
      return getRunsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The transfer runs that were scheduled.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder>
        getRunsBuilderList() {
      return getRunsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.TransferRun,
            com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder,
            com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>
        getRunsFieldBuilder() {
      if (runsBuilder_ == null) {
        runsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.datatransfer.v1.TransferRun,
                com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder,
                com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>(
                runs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        runs_ = null;
      }
      return runsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScheduleTransferRunsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ScheduleTransferRunsResponse>() {
        @java.lang.Override
        public ScheduleTransferRunsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScheduleTransferRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScheduleTransferRunsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
