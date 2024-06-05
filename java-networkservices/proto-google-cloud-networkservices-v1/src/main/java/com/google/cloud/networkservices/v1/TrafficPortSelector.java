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
// source: google/cloud/networkservices/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkservices.v1;

/**
 *
 *
 * <pre>
 * Specification of a port-based selector.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkservices.v1.TrafficPortSelector}
 */
public final class TrafficPortSelector extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkservices.v1.TrafficPortSelector)
    TrafficPortSelectorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TrafficPortSelector.newBuilder() to construct.
  private TrafficPortSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TrafficPortSelector() {
    ports_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TrafficPortSelector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkservices.v1.CommonProto
        .internal_static_google_cloud_networkservices_v1_TrafficPortSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkservices.v1.CommonProto
        .internal_static_google_cloud_networkservices_v1_TrafficPortSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkservices.v1.TrafficPortSelector.class,
            com.google.cloud.networkservices.v1.TrafficPortSelector.Builder.class);
  }

  public static final int PORTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ports_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. A list of ports. Can be port numbers or port range
   * (example, [80-90] specifies all ports from 80 to 90, including
   * 80 and 90) or named ports or * to specify all ports. If the
   * list is empty, all ports are selected.
   * </pre>
   *
   * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the ports.
   */
  public com.google.protobuf.ProtocolStringList getPortsList() {
    return ports_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of ports. Can be port numbers or port range
   * (example, [80-90] specifies all ports from 80 to 90, including
   * 80 and 90) or named ports or * to specify all ports. If the
   * list is empty, all ports are selected.
   * </pre>
   *
   * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of ports.
   */
  public int getPortsCount() {
    return ports_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of ports. Can be port numbers or port range
   * (example, [80-90] specifies all ports from 80 to 90, including
   * 80 and 90) or named ports or * to specify all ports. If the
   * list is empty, all ports are selected.
   * </pre>
   *
   * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The ports at the given index.
   */
  public java.lang.String getPorts(int index) {
    return ports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of ports. Can be port numbers or port range
   * (example, [80-90] specifies all ports from 80 to 90, including
   * 80 and 90) or named ports or * to specify all ports. If the
   * list is empty, all ports are selected.
   * </pre>
   *
   * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ports at the given index.
   */
  public com.google.protobuf.ByteString getPortsBytes(int index) {
    return ports_.getByteString(index);
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
    for (int i = 0; i < ports_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ports_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ports_.size(); i++) {
        dataSize += computeStringSizeNoTag(ports_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPortsList().size();
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
    if (!(obj instanceof com.google.cloud.networkservices.v1.TrafficPortSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.networkservices.v1.TrafficPortSelector other =
        (com.google.cloud.networkservices.v1.TrafficPortSelector) obj;

    if (!getPortsList().equals(other.getPortsList())) return false;
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
    if (getPortsCount() > 0) {
      hash = (37 * hash) + PORTS_FIELD_NUMBER;
      hash = (53 * hash) + getPortsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector parseFrom(
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
      com.google.cloud.networkservices.v1.TrafficPortSelector prototype) {
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
   * Specification of a port-based selector.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkservices.v1.TrafficPortSelector}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkservices.v1.TrafficPortSelector)
      com.google.cloud.networkservices.v1.TrafficPortSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkservices.v1.CommonProto
          .internal_static_google_cloud_networkservices_v1_TrafficPortSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkservices.v1.CommonProto
          .internal_static_google_cloud_networkservices_v1_TrafficPortSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkservices.v1.TrafficPortSelector.class,
              com.google.cloud.networkservices.v1.TrafficPortSelector.Builder.class);
    }

    // Construct using com.google.cloud.networkservices.v1.TrafficPortSelector.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ports_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkservices.v1.CommonProto
          .internal_static_google_cloud_networkservices_v1_TrafficPortSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.TrafficPortSelector getDefaultInstanceForType() {
      return com.google.cloud.networkservices.v1.TrafficPortSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.TrafficPortSelector build() {
      com.google.cloud.networkservices.v1.TrafficPortSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.TrafficPortSelector buildPartial() {
      com.google.cloud.networkservices.v1.TrafficPortSelector result =
          new com.google.cloud.networkservices.v1.TrafficPortSelector(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkservices.v1.TrafficPortSelector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        ports_.makeImmutable();
        result.ports_ = ports_;
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
      if (other instanceof com.google.cloud.networkservices.v1.TrafficPortSelector) {
        return mergeFrom((com.google.cloud.networkservices.v1.TrafficPortSelector) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkservices.v1.TrafficPortSelector other) {
      if (other == com.google.cloud.networkservices.v1.TrafficPortSelector.getDefaultInstance())
        return this;
      if (!other.ports_.isEmpty()) {
        if (ports_.isEmpty()) {
          ports_ = other.ports_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePortsIsMutable();
          ports_.addAll(other.ports_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensurePortsIsMutable();
                ports_.add(s);
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

    private com.google.protobuf.LazyStringArrayList ports_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePortsIsMutable() {
      if (!ports_.isModifiable()) {
        ports_ = new com.google.protobuf.LazyStringArrayList(ports_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the ports.
     */
    public com.google.protobuf.ProtocolStringList getPortsList() {
      ports_.makeImmutable();
      return ports_;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of ports.
     */
    public int getPortsCount() {
      return ports_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The ports at the given index.
     */
    public java.lang.String getPorts(int index) {
      return ports_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the ports at the given index.
     */
    public com.google.protobuf.ByteString getPortsBytes(int index) {
      return ports_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The ports to set.
     * @return This builder for chaining.
     */
    public Builder setPorts(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePortsIsMutable();
      ports_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The ports to add.
     * @return This builder for chaining.
     */
    public Builder addPorts(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePortsIsMutable();
      ports_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The ports to add.
     * @return This builder for chaining.
     */
    public Builder addAllPorts(java.lang.Iterable<java.lang.String> values) {
      ensurePortsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ports_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPorts() {
      ports_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of ports. Can be port numbers or port range
     * (example, [80-90] specifies all ports from 80 to 90, including
     * 80 and 90) or named ports or * to specify all ports. If the
     * list is empty, all ports are selected.
     * </pre>
     *
     * <code>repeated string ports = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the ports to add.
     * @return This builder for chaining.
     */
    public Builder addPortsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePortsIsMutable();
      ports_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkservices.v1.TrafficPortSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkservices.v1.TrafficPortSelector)
  private static final com.google.cloud.networkservices.v1.TrafficPortSelector DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkservices.v1.TrafficPortSelector();
  }

  public static com.google.cloud.networkservices.v1.TrafficPortSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficPortSelector> PARSER =
      new com.google.protobuf.AbstractParser<TrafficPortSelector>() {
        @java.lang.Override
        public TrafficPortSelector parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficPortSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficPortSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkservices.v1.TrafficPortSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
