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
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Data disk assignment information for a specific key-range of a sharded
 * computation.
 * Currently we only support UTF-8 character splits to simplify encoding into
 * JSON.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.KeyRangeDataDiskAssignment}
 */
public final class KeyRangeDataDiskAssignment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.KeyRangeDataDiskAssignment)
    KeyRangeDataDiskAssignmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use KeyRangeDataDiskAssignment.newBuilder() to construct.
  private KeyRangeDataDiskAssignment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private KeyRangeDataDiskAssignment() {
    start_ = "";
    end_ = "";
    dataDisk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new KeyRangeDataDiskAssignment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.class,
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object start_ = "";
  /**
   *
   *
   * <pre>
   * The start (inclusive) of the key range.
   * </pre>
   *
   * <code>string start = 1;</code>
   *
   * @return The start.
   */
  @java.lang.Override
  public java.lang.String getStart() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      start_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The start (inclusive) of the key range.
   * </pre>
   *
   * <code>string start = 1;</code>
   *
   * @return The bytes for start.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStartBytes() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      start_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object end_ = "";
  /**
   *
   *
   * <pre>
   * The end (exclusive) of the key range.
   * </pre>
   *
   * <code>string end = 2;</code>
   *
   * @return The end.
   */
  @java.lang.Override
  public java.lang.String getEnd() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      end_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The end (exclusive) of the key range.
   * </pre>
   *
   * <code>string end = 2;</code>
   *
   * @return The bytes for end.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndBytes() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      end_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_DISK_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataDisk_ = "";
  /**
   *
   *
   * <pre>
   * The name of the data disk where data for this range is stored.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 3;</code>
   *
   * @return The dataDisk.
   */
  @java.lang.Override
  public java.lang.String getDataDisk() {
    java.lang.Object ref = dataDisk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataDisk_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the data disk where data for this range is stored.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 3;</code>
   *
   * @return The bytes for dataDisk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataDiskBytes() {
    java.lang.Object ref = dataDisk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataDisk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(start_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, start_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(end_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, end_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataDisk_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataDisk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(start_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, start_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(end_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, end_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataDisk_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataDisk_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment other =
        (com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment) obj;

    if (!getStart().equals(other.getStart())) return false;
    if (!getEnd().equals(other.getEnd())) return false;
    if (!getDataDisk().equals(other.getDataDisk())) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart().hashCode();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd().hashCode();
    hash = (37 * hash) + DATA_DISK_FIELD_NUMBER;
    hash = (53 * hash) + getDataDisk().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment parseFrom(
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
      com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment prototype) {
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
   * Data disk assignment information for a specific key-range of a sharded
   * computation.
   * Currently we only support UTF-8 character splits to simplify encoding into
   * JSON.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.KeyRangeDataDiskAssignment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.KeyRangeDataDiskAssignment)
      com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.class,
              com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      start_ = "";
      end_ = "";
      dataDisk_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment build() {
      com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment buildPartial() {
      com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment result =
          new com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = start_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = end_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataDisk_ = dataDisk_;
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
      if (other instanceof com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment) {
        return mergeFrom((com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment other) {
      if (other == com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.getDefaultInstance())
        return this;
      if (!other.getStart().isEmpty()) {
        start_ = other.start_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEnd().isEmpty()) {
        end_ = other.end_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDataDisk().isEmpty()) {
        dataDisk_ = other.dataDisk_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                start_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                end_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                dataDisk_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object start_ = "";
    /**
     *
     *
     * <pre>
     * The start (inclusive) of the key range.
     * </pre>
     *
     * <code>string start = 1;</code>
     *
     * @return The start.
     */
    public java.lang.String getStart() {
      java.lang.Object ref = start_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        start_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The start (inclusive) of the key range.
     * </pre>
     *
     * <code>string start = 1;</code>
     *
     * @return The bytes for start.
     */
    public com.google.protobuf.ByteString getStartBytes() {
      java.lang.Object ref = start_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        start_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The start (inclusive) of the key range.
     * </pre>
     *
     * <code>string start = 1;</code>
     *
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      start_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start (inclusive) of the key range.
     * </pre>
     *
     * <code>string start = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      start_ = getDefaultInstance().getStart();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start (inclusive) of the key range.
     * </pre>
     *
     * <code>string start = 1;</code>
     *
     * @param value The bytes for start to set.
     * @return This builder for chaining.
     */
    public Builder setStartBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      start_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object end_ = "";
    /**
     *
     *
     * <pre>
     * The end (exclusive) of the key range.
     * </pre>
     *
     * <code>string end = 2;</code>
     *
     * @return The end.
     */
    public java.lang.String getEnd() {
      java.lang.Object ref = end_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        end_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The end (exclusive) of the key range.
     * </pre>
     *
     * <code>string end = 2;</code>
     *
     * @return The bytes for end.
     */
    public com.google.protobuf.ByteString getEndBytes() {
      java.lang.Object ref = end_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        end_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The end (exclusive) of the key range.
     * </pre>
     *
     * <code>string end = 2;</code>
     *
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      end_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The end (exclusive) of the key range.
     * </pre>
     *
     * <code>string end = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      end_ = getDefaultInstance().getEnd();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The end (exclusive) of the key range.
     * </pre>
     *
     * <code>string end = 2;</code>
     *
     * @param value The bytes for end to set.
     * @return This builder for chaining.
     */
    public Builder setEndBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      end_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object dataDisk_ = "";
    /**
     *
     *
     * <pre>
     * The name of the data disk where data for this range is stored.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 3;</code>
     *
     * @return The dataDisk.
     */
    public java.lang.String getDataDisk() {
      java.lang.Object ref = dataDisk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataDisk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the data disk where data for this range is stored.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 3;</code>
     *
     * @return The bytes for dataDisk.
     */
    public com.google.protobuf.ByteString getDataDiskBytes() {
      java.lang.Object ref = dataDisk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataDisk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the data disk where data for this range is stored.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 3;</code>
     *
     * @param value The dataDisk to set.
     * @return This builder for chaining.
     */
    public Builder setDataDisk(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataDisk_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the data disk where data for this range is stored.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataDisk() {
      dataDisk_ = getDefaultInstance().getDataDisk();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the data disk where data for this range is stored.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 3;</code>
     *
     * @param value The bytes for dataDisk to set.
     * @return This builder for chaining.
     */
    public Builder setDataDiskBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataDisk_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.KeyRangeDataDiskAssignment)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.KeyRangeDataDiskAssignment)
  private static final com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment();
  }

  public static com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyRangeDataDiskAssignment> PARSER =
      new com.google.protobuf.AbstractParser<KeyRangeDataDiskAssignment>() {
        @java.lang.Override
        public KeyRangeDataDiskAssignment parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeyRangeDataDiskAssignment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyRangeDataDiskAssignment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
