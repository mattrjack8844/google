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
 * Protobuf type {@code google.cloud.compute.v1.InstancesScopedList}
 */
public final class InstancesScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancesScopedList)
    InstancesScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstancesScopedList.newBuilder() to construct.
  private InstancesScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstancesScopedList() {
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstancesScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancesScopedList.class,
            com.google.cloud.compute.v1.InstancesScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCES_FIELD_NUMBER = 29097598;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.Instance> instances_;
  /**
   *
   *
   * <pre>
   * [Output Only] A list of instances contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Instance> getInstancesList() {
    return instances_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of instances contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.InstanceOrBuilder>
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of instances contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
   */
  @java.lang.Override
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of instances contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Instance getInstances(int index) {
    return instances_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of instances contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceOrBuilder getInstancesOrBuilder(int index) {
    return instances_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
   * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
   * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(29097598, instances_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(29097598, instances_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancesScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancesScopedList other =
        (com.google.cloud.compute.v1.InstancesScopedList) obj;

    if (!getInstancesList().equals(other.getInstancesList())) return false;
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
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstancesScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstancesScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancesScopedList)
      com.google.cloud.compute.v1.InstancesScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancesScopedList.class,
              com.google.cloud.compute.v1.InstancesScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstancesScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInstancesFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
      } else {
        instances_ = null;
        instancesBuilder_.clear();
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
          .internal_static_google_cloud_compute_v1_InstancesScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancesScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesScopedList build() {
      com.google.cloud.compute.v1.InstancesScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesScopedList buildPartial() {
      com.google.cloud.compute.v1.InstancesScopedList result =
          new com.google.cloud.compute.v1.InstancesScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.InstancesScopedList result) {
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstancesScopedList result) {
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
      if (other instanceof com.google.cloud.compute.v1.InstancesScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.InstancesScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstancesScopedList other) {
      if (other == com.google.cloud.compute.v1.InstancesScopedList.getDefaultInstance())
        return this;
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instancesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInstancesFieldBuilder()
                    : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
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
            case 232780786:
              {
                com.google.cloud.compute.v1.Instance m =
                    input.readMessage(
                        com.google.cloud.compute.v1.Instance.parser(), extensionRegistry);
                if (instancesBuilder_ == null) {
                  ensureInstancesIsMutable();
                  instances_.add(m);
                } else {
                  instancesBuilder_.addMessage(m);
                }
                break;
              } // case 232780786
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
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

    private java.util.List<com.google.cloud.compute.v1.Instance> instances_ =
        java.util.Collections.emptyList();

    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instances_ = new java.util.ArrayList<com.google.cloud.compute.v1.Instance>(instances_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Instance,
            com.google.cloud.compute.v1.Instance.Builder,
            com.google.cloud.compute.v1.InstanceOrBuilder>
        instancesBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Instance> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.Instance getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder setInstances(int index, com.google.cloud.compute.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.compute.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder addInstances(com.google.cloud.compute.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder addInstances(int index, com.google.cloud.compute.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder addInstances(com.google.cloud.compute.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.compute.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Instance> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.Instance.Builder getInstancesBuilder(int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.InstanceOrBuilder getInstancesOrBuilder(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.InstanceOrBuilder>
        getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.Instance.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Instance.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.Instance.Builder addInstancesBuilder(int index) {
      return getInstancesFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Instance.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of instances contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Instance instances = 29097598;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Instance.Builder> getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Instance,
            com.google.cloud.compute.v1.Instance.Builder,
            com.google.cloud.compute.v1.InstanceOrBuilder>
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Instance,
                com.google.cloud.compute.v1.Instance.Builder,
                com.google.cloud.compute.v1.InstanceOrBuilder>(
                instances_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        instances_ = null;
      }
      return instancesBuilder_;
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of instances when the list is empty.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancesScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancesScopedList)
  private static final com.google.cloud.compute.v1.InstancesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancesScopedList();
  }

  public static com.google.cloud.compute.v1.InstancesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesScopedList> PARSER =
      new com.google.protobuf.AbstractParser<InstancesScopedList>() {
        @java.lang.Override
        public InstancesScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancesScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
