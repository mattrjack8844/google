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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections}
 */
public final class InterconnectRemoteLocationPermittedConnections
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections)
    InterconnectRemoteLocationPermittedConnectionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectRemoteLocationPermittedConnections.newBuilder() to construct.
  private InterconnectRemoteLocationPermittedConnections(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectRemoteLocationPermittedConnections() {
    interconnectLocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectRemoteLocationPermittedConnections();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectRemoteLocationPermittedConnections_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectRemoteLocationPermittedConnections_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections.class,
            com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections.Builder
                .class);
  }

  private int bitField0_;
  public static final int INTERCONNECT_LOCATION_FIELD_NUMBER = 492235846;

  @SuppressWarnings("serial")
  private volatile java.lang.Object interconnectLocation_ = "";
  /**
   *
   *
   * <pre>
   * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
   * </pre>
   *
   * <code>optional string interconnect_location = 492235846;</code>
   *
   * @return Whether the interconnectLocation field is set.
   */
  @java.lang.Override
  public boolean hasInterconnectLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
   * </pre>
   *
   * <code>optional string interconnect_location = 492235846;</code>
   *
   * @return The interconnectLocation.
   */
  @java.lang.Override
  public java.lang.String getInterconnectLocation() {
    java.lang.Object ref = interconnectLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interconnectLocation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
   * </pre>
   *
   * <code>optional string interconnect_location = 492235846;</code>
   *
   * @return The bytes for interconnectLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInterconnectLocationBytes() {
    java.lang.Object ref = interconnectLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      interconnectLocation_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 492235846, interconnectLocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              492235846, interconnectLocation_);
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections other =
        (com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections) obj;

    if (hasInterconnectLocation() != other.hasInterconnectLocation()) return false;
    if (hasInterconnectLocation()) {
      if (!getInterconnectLocation().equals(other.getInterconnectLocation())) return false;
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
    if (hasInterconnectLocation()) {
      hash = (37 * hash) + INTERCONNECT_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getInterconnectLocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      parseFrom(
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
      com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections)
      com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnectionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectRemoteLocationPermittedConnections_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectRemoteLocationPermittedConnections_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections.class,
              com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      interconnectLocation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectRemoteLocationPermittedConnections_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections build() {
      com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
        buildPartial() {
      com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections result =
          new com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interconnectLocation_ = interconnectLocation_;
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
      if (other
          instanceof com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections other) {
      if (other
          == com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
              .getDefaultInstance()) return this;
      if (other.hasInterconnectLocation()) {
        interconnectLocation_ = other.interconnectLocation_;
        bitField0_ |= 0x00000001;
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
            case -357080526:
              {
                interconnectLocation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -357080526
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

    private java.lang.Object interconnectLocation_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @return Whether the interconnectLocation field is set.
     */
    public boolean hasInterconnectLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @return The interconnectLocation.
     */
    public java.lang.String getInterconnectLocation() {
      java.lang.Object ref = interconnectLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interconnectLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @return The bytes for interconnectLocation.
     */
    public com.google.protobuf.ByteString getInterconnectLocationBytes() {
      java.lang.Object ref = interconnectLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        interconnectLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @param value The interconnectLocation to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      interconnectLocation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInterconnectLocation() {
      interconnectLocation_ = getDefaultInstance().getInterconnectLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
     * </pre>
     *
     * <code>optional string interconnect_location = 492235846;</code>
     *
     * @param value The bytes for interconnectLocation to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      interconnectLocation_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections)
  private static final com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections();
  }

  public static com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectRemoteLocationPermittedConnections>
      PARSER =
          new com.google.protobuf.AbstractParser<InterconnectRemoteLocationPermittedConnections>() {
            @java.lang.Override
            public InterconnectRemoteLocationPermittedConnections parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<InterconnectRemoteLocationPermittedConnections>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectRemoteLocationPermittedConnections>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectRemoteLocationPermittedConnections
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
