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
 * Protobuf type {@code google.cloud.compute.v1.SubnetworksScopedList}
 */
public final class SubnetworksScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SubnetworksScopedList)
    SubnetworksScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubnetworksScopedList.newBuilder() to construct.
  private SubnetworksScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubnetworksScopedList() {
    subnetworks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubnetworksScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SubnetworksScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SubnetworksScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SubnetworksScopedList.class,
            com.google.cloud.compute.v1.SubnetworksScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int SUBNETWORKS_FIELD_NUMBER = 415853125;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.Subnetwork> subnetworks_;
  /**
   *
   *
   * <pre>
   * A list of subnetworks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Subnetwork> getSubnetworksList() {
    return subnetworks_;
  }
  /**
   *
   *
   * <pre>
   * A list of subnetworks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.SubnetworkOrBuilder>
      getSubnetworksOrBuilderList() {
    return subnetworks_;
  }
  /**
   *
   *
   * <pre>
   * A list of subnetworks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
   */
  @java.lang.Override
  public int getSubnetworksCount() {
    return subnetworks_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of subnetworks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Subnetwork getSubnetworks(int index) {
    return subnetworks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of subnetworks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SubnetworkOrBuilder getSubnetworksOrBuilder(int index) {
    return subnetworks_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * An informational warning that appears when the list of addresses is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * An informational warning that appears when the list of addresses is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   *
   *
   * <pre>
   * An informational warning that appears when the list of addresses is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < subnetworks_.size(); i++) {
      output.writeMessage(415853125, subnetworks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < subnetworks_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(415853125, subnetworks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.SubnetworksScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SubnetworksScopedList other =
        (com.google.cloud.compute.v1.SubnetworksScopedList) obj;

    if (!getSubnetworksList().equals(other.getSubnetworksList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getSubnetworksCount() > 0) {
      hash = (37 * hash) + SUBNETWORKS_FIELD_NUMBER;
      hash = (53 * hash) + getSubnetworksList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.SubnetworksScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SubnetworksScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SubnetworksScopedList)
      com.google.cloud.compute.v1.SubnetworksScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SubnetworksScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SubnetworksScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SubnetworksScopedList.class,
              com.google.cloud.compute.v1.SubnetworksScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SubnetworksScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSubnetworksFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (subnetworksBuilder_ == null) {
        subnetworks_ = java.util.Collections.emptyList();
      } else {
        subnetworks_ = null;
        subnetworksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SubnetworksScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SubnetworksScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksScopedList build() {
      com.google.cloud.compute.v1.SubnetworksScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksScopedList buildPartial() {
      com.google.cloud.compute.v1.SubnetworksScopedList result =
          new com.google.cloud.compute.v1.SubnetworksScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.SubnetworksScopedList result) {
      if (subnetworksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subnetworks_ = java.util.Collections.unmodifiableList(subnetworks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subnetworks_ = subnetworks_;
      } else {
        result.subnetworks_ = subnetworksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.SubnetworksScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.SubnetworksScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.SubnetworksScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SubnetworksScopedList other) {
      if (other == com.google.cloud.compute.v1.SubnetworksScopedList.getDefaultInstance())
        return this;
      if (subnetworksBuilder_ == null) {
        if (!other.subnetworks_.isEmpty()) {
          if (subnetworks_.isEmpty()) {
            subnetworks_ = other.subnetworks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubnetworksIsMutable();
            subnetworks_.addAll(other.subnetworks_);
          }
          onChanged();
        }
      } else {
        if (!other.subnetworks_.isEmpty()) {
          if (subnetworksBuilder_.isEmpty()) {
            subnetworksBuilder_.dispose();
            subnetworksBuilder_ = null;
            subnetworks_ = other.subnetworks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subnetworksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSubnetworksFieldBuilder()
                    : null;
          } else {
            subnetworksBuilder_.addAllMessages(other.subnetworks_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case -968142294:
              {
                com.google.cloud.compute.v1.Subnetwork m =
                    input.readMessage(
                        com.google.cloud.compute.v1.Subnetwork.parser(), extensionRegistry);
                if (subnetworksBuilder_ == null) {
                  ensureSubnetworksIsMutable();
                  subnetworks_.add(m);
                } else {
                  subnetworksBuilder_.addMessage(m);
                }
                break;
              } // case -968142294
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

    private java.util.List<com.google.cloud.compute.v1.Subnetwork> subnetworks_ =
        java.util.Collections.emptyList();

    private void ensureSubnetworksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subnetworks_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.Subnetwork>(subnetworks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Subnetwork,
            com.google.cloud.compute.v1.Subnetwork.Builder,
            com.google.cloud.compute.v1.SubnetworkOrBuilder>
        subnetworksBuilder_;

    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Subnetwork> getSubnetworksList() {
      if (subnetworksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subnetworks_);
      } else {
        return subnetworksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public int getSubnetworksCount() {
      if (subnetworksBuilder_ == null) {
        return subnetworks_.size();
      } else {
        return subnetworksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public com.google.cloud.compute.v1.Subnetwork getSubnetworks(int index) {
      if (subnetworksBuilder_ == null) {
        return subnetworks_.get(index);
      } else {
        return subnetworksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder setSubnetworks(int index, com.google.cloud.compute.v1.Subnetwork value) {
      if (subnetworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubnetworksIsMutable();
        subnetworks_.set(index, value);
        onChanged();
      } else {
        subnetworksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder setSubnetworks(
        int index, com.google.cloud.compute.v1.Subnetwork.Builder builderForValue) {
      if (subnetworksBuilder_ == null) {
        ensureSubnetworksIsMutable();
        subnetworks_.set(index, builderForValue.build());
        onChanged();
      } else {
        subnetworksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder addSubnetworks(com.google.cloud.compute.v1.Subnetwork value) {
      if (subnetworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubnetworksIsMutable();
        subnetworks_.add(value);
        onChanged();
      } else {
        subnetworksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder addSubnetworks(int index, com.google.cloud.compute.v1.Subnetwork value) {
      if (subnetworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubnetworksIsMutable();
        subnetworks_.add(index, value);
        onChanged();
      } else {
        subnetworksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder addSubnetworks(com.google.cloud.compute.v1.Subnetwork.Builder builderForValue) {
      if (subnetworksBuilder_ == null) {
        ensureSubnetworksIsMutable();
        subnetworks_.add(builderForValue.build());
        onChanged();
      } else {
        subnetworksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder addSubnetworks(
        int index, com.google.cloud.compute.v1.Subnetwork.Builder builderForValue) {
      if (subnetworksBuilder_ == null) {
        ensureSubnetworksIsMutable();
        subnetworks_.add(index, builderForValue.build());
        onChanged();
      } else {
        subnetworksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder addAllSubnetworks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Subnetwork> values) {
      if (subnetworksBuilder_ == null) {
        ensureSubnetworksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, subnetworks_);
        onChanged();
      } else {
        subnetworksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder clearSubnetworks() {
      if (subnetworksBuilder_ == null) {
        subnetworks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subnetworksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public Builder removeSubnetworks(int index) {
      if (subnetworksBuilder_ == null) {
        ensureSubnetworksIsMutable();
        subnetworks_.remove(index);
        onChanged();
      } else {
        subnetworksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public com.google.cloud.compute.v1.Subnetwork.Builder getSubnetworksBuilder(int index) {
      return getSubnetworksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public com.google.cloud.compute.v1.SubnetworkOrBuilder getSubnetworksOrBuilder(int index) {
      if (subnetworksBuilder_ == null) {
        return subnetworks_.get(index);
      } else {
        return subnetworksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.SubnetworkOrBuilder>
        getSubnetworksOrBuilderList() {
      if (subnetworksBuilder_ != null) {
        return subnetworksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subnetworks_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public com.google.cloud.compute.v1.Subnetwork.Builder addSubnetworksBuilder() {
      return getSubnetworksFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Subnetwork.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public com.google.cloud.compute.v1.Subnetwork.Builder addSubnetworksBuilder(int index) {
      return getSubnetworksFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Subnetwork.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of subnetworks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Subnetwork subnetworks = 415853125;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Subnetwork.Builder>
        getSubnetworksBuilderList() {
      return getSubnetworksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Subnetwork,
            com.google.cloud.compute.v1.Subnetwork.Builder,
            com.google.cloud.compute.v1.SubnetworkOrBuilder>
        getSubnetworksFieldBuilder() {
      if (subnetworksBuilder_ == null) {
        subnetworksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Subnetwork,
                com.google.cloud.compute.v1.Subnetwork.Builder,
                com.google.cloud.compute.v1.SubnetworkOrBuilder>(
                subnetworks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        subnetworks_ = null;
      }
      return subnetworksBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }
    /**
     *
     *
     * <pre>
     * An informational warning that appears when the list of addresses is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SubnetworksScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SubnetworksScopedList)
  private static final com.google.cloud.compute.v1.SubnetworksScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SubnetworksScopedList();
  }

  public static com.google.cloud.compute.v1.SubnetworksScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubnetworksScopedList> PARSER =
      new com.google.protobuf.AbstractParser<SubnetworksScopedList>() {
        @java.lang.Override
        public SubnetworksScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubnetworksScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubnetworksScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SubnetworksScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
