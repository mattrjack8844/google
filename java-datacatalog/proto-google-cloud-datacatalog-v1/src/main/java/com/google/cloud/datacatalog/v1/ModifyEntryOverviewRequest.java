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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ModifyEntryOverview][google.cloud.datacatalog.v1.DataCatalog.ModifyEntryOverview].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ModifyEntryOverviewRequest}
 */
public final class ModifyEntryOverviewRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ModifyEntryOverviewRequest)
    ModifyEntryOverviewRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModifyEntryOverviewRequest.newBuilder() to construct.
  private ModifyEntryOverviewRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModifyEntryOverviewRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModifyEntryOverviewRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ModifyEntryOverviewRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ModifyEntryOverviewRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.class,
            com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
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
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int ENTRY_OVERVIEW_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.EntryOverview entryOverview_;
  /**
   *
   *
   * <pre>
   * Required. The new value for the Entry Overview.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entryOverview field is set.
   */
  @java.lang.Override
  public boolean hasEntryOverview() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The new value for the Entry Overview.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entryOverview.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOverview getEntryOverview() {
    return entryOverview_ == null
        ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()
        : entryOverview_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new value for the Entry Overview.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder getEntryOverviewOrBuilder() {
    return entryOverview_ == null
        ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()
        : entryOverview_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEntryOverview());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntryOverview());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest other =
        (com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasEntryOverview() != other.hasEntryOverview()) return false;
    if (hasEntryOverview()) {
      if (!getEntryOverview().equals(other.getEntryOverview())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasEntryOverview()) {
      hash = (37 * hash) + ENTRY_OVERVIEW_FIELD_NUMBER;
      hash = (53 * hash) + getEntryOverview().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest parseFrom(
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
      com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest prototype) {
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
   * Request message for
   * [ModifyEntryOverview][google.cloud.datacatalog.v1.DataCatalog.ModifyEntryOverview].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ModifyEntryOverviewRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ModifyEntryOverviewRequest)
      com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryOverviewRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryOverviewRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.class,
              com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntryOverviewFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      entryOverview_ = null;
      if (entryOverviewBuilder_ != null) {
        entryOverviewBuilder_.dispose();
        entryOverviewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryOverviewRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest build() {
      com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest buildPartial() {
      com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest result =
          new com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entryOverview_ =
            entryOverviewBuilder_ == null ? entryOverview_ : entryOverviewBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest other) {
      if (other == com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEntryOverview()) {
        mergeEntryOverview(other.getEntryOverview());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEntryOverviewFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the entry.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
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
     * Required. The full resource name of the entry.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
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
     * Required. The full resource name of the entry.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the entry.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the entry.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.EntryOverview entryOverview_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryOverview,
            com.google.cloud.datacatalog.v1.EntryOverview.Builder,
            com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder>
        entryOverviewBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entryOverview field is set.
     */
    public boolean hasEntryOverview() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entryOverview.
     */
    public com.google.cloud.datacatalog.v1.EntryOverview getEntryOverview() {
      if (entryOverviewBuilder_ == null) {
        return entryOverview_ == null
            ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()
            : entryOverview_;
      } else {
        return entryOverviewBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryOverview(com.google.cloud.datacatalog.v1.EntryOverview value) {
      if (entryOverviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryOverview_ = value;
      } else {
        entryOverviewBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryOverview(
        com.google.cloud.datacatalog.v1.EntryOverview.Builder builderForValue) {
      if (entryOverviewBuilder_ == null) {
        entryOverview_ = builderForValue.build();
      } else {
        entryOverviewBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntryOverview(com.google.cloud.datacatalog.v1.EntryOverview value) {
      if (entryOverviewBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && entryOverview_ != null
            && entryOverview_
                != com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()) {
          getEntryOverviewBuilder().mergeFrom(value);
        } else {
          entryOverview_ = value;
        }
      } else {
        entryOverviewBuilder_.mergeFrom(value);
      }
      if (entryOverview_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntryOverview() {
      bitField0_ = (bitField0_ & ~0x00000002);
      entryOverview_ = null;
      if (entryOverviewBuilder_ != null) {
        entryOverviewBuilder_.dispose();
        entryOverviewBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryOverview.Builder getEntryOverviewBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEntryOverviewFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder getEntryOverviewOrBuilder() {
      if (entryOverviewBuilder_ != null) {
        return entryOverviewBuilder_.getMessageOrBuilder();
      } else {
        return entryOverview_ == null
            ? com.google.cloud.datacatalog.v1.EntryOverview.getDefaultInstance()
            : entryOverview_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Entry Overview.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryOverview entry_overview = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryOverview,
            com.google.cloud.datacatalog.v1.EntryOverview.Builder,
            com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder>
        getEntryOverviewFieldBuilder() {
      if (entryOverviewBuilder_ == null) {
        entryOverviewBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.EntryOverview,
                com.google.cloud.datacatalog.v1.EntryOverview.Builder,
                com.google.cloud.datacatalog.v1.EntryOverviewOrBuilder>(
                getEntryOverview(), getParentForChildren(), isClean());
        entryOverview_ = null;
      }
      return entryOverviewBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ModifyEntryOverviewRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ModifyEntryOverviewRequest)
  private static final com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest();
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyEntryOverviewRequest> PARSER =
      new com.google.protobuf.AbstractParser<ModifyEntryOverviewRequest>() {
        @java.lang.Override
        public ModifyEntryOverviewRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModifyEntryOverviewRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyEntryOverviewRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ModifyEntryOverviewRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
