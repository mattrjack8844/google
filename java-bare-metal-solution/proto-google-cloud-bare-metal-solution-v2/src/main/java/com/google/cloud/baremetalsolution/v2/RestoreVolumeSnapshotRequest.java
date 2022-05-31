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
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for restoring a volume snapshot.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest}
 */
public final class RestoreVolumeSnapshotRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)
    RestoreVolumeSnapshotRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RestoreVolumeSnapshotRequest.newBuilder() to construct.
  private RestoreVolumeSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RestoreVolumeSnapshotRequest() {
    volumeSnapshot_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RestoreVolumeSnapshotRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RestoreVolumeSnapshotRequest(
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

              volumeSnapshot_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
        .internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
        .internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest.class,
            com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest.Builder.class);
  }

  public static final int VOLUME_SNAPSHOT_FIELD_NUMBER = 1;
  private volatile java.lang.Object volumeSnapshot_;
  /**
   *
   *
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>
   * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The volumeSnapshot.
   */
  @java.lang.Override
  public java.lang.String getVolumeSnapshot() {
    java.lang.Object ref = volumeSnapshot_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volumeSnapshot_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>
   * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for volumeSnapshot.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVolumeSnapshotBytes() {
    java.lang.Object ref = volumeSnapshot_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      volumeSnapshot_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeSnapshot_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, volumeSnapshot_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeSnapshot_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, volumeSnapshot_);
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest other =
        (com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest) obj;

    if (!getVolumeSnapshot().equals(other.getVolumeSnapshot())) return false;
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
    hash = (37 * hash) + VOLUME_SNAPSHOT_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeSnapshot().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest prototype) {
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
   * Message for restoring a volume snapshot.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)
      com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest.class,
              com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest.newBuilder()
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
      volumeSnapshot_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
        getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest build() {
      com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest buildPartial() {
      com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest result =
          new com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest(this);
      result.volumeSnapshot_ = volumeSnapshot_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest) {
        return mergeFrom(
            (com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest other) {
      if (other
          == com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
              .getDefaultInstance()) return this;
      if (!other.getVolumeSnapshot().isEmpty()) {
        volumeSnapshot_ = other.volumeSnapshot_;
        onChanged();
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
      com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object volumeSnapshot_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the resource.
     * </pre>
     *
     * <code>
     * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The volumeSnapshot.
     */
    public java.lang.String getVolumeSnapshot() {
      java.lang.Object ref = volumeSnapshot_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volumeSnapshot_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource.
     * </pre>
     *
     * <code>
     * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for volumeSnapshot.
     */
    public com.google.protobuf.ByteString getVolumeSnapshotBytes() {
      java.lang.Object ref = volumeSnapshot_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        volumeSnapshot_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource.
     * </pre>
     *
     * <code>
     * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The volumeSnapshot to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeSnapshot(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      volumeSnapshot_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource.
     * </pre>
     *
     * <code>
     * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVolumeSnapshot() {

      volumeSnapshot_ = getDefaultInstance().getVolumeSnapshot();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource.
     * </pre>
     *
     * <code>
     * string volume_snapshot = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for volumeSnapshot to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeSnapshotBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      volumeSnapshot_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest)
  private static final com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreVolumeSnapshotRequest> PARSER =
      new com.google.protobuf.AbstractParser<RestoreVolumeSnapshotRequest>() {
        @java.lang.Override
        public RestoreVolumeSnapshotRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RestoreVolumeSnapshotRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RestoreVolumeSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreVolumeSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.RestoreVolumeSnapshotRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
