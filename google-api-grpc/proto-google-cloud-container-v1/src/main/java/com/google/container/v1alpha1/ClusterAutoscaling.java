// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

/**
 * <pre>
 * ClusterAutoscaling contains global, per-cluster information
 * required by Cluster Autoscaler to automatically adjust
 * the size of the cluster and create/delete
 * node pools based on the current needs.
 * </pre>
 *
 * Protobuf type {@code google.container.v1alpha1.ClusterAutoscaling}
 */
public  final class ClusterAutoscaling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1alpha1.ClusterAutoscaling)
    ClusterAutoscalingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClusterAutoscaling.newBuilder() to construct.
  private ClusterAutoscaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterAutoscaling() {
    enableNodeAutoprovisioning_ = false;
    resourceLimits_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClusterAutoscaling(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            enableNodeAutoprovisioning_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              resourceLimits_ = new java.util.ArrayList<com.google.container.v1alpha1.ResourceLimit>();
              mutable_bitField0_ |= 0x00000002;
            }
            resourceLimits_.add(
                input.readMessage(com.google.container.v1alpha1.ResourceLimit.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        resourceLimits_ = java.util.Collections.unmodifiableList(resourceLimits_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ClusterAutoscaling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ClusterAutoscaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1alpha1.ClusterAutoscaling.class, com.google.container.v1alpha1.ClusterAutoscaling.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_NODE_AUTOPROVISIONING_FIELD_NUMBER = 1;
  private boolean enableNodeAutoprovisioning_;
  /**
   * <pre>
   * Enables automatic node pool creation and deletion.
   * </pre>
   *
   * <code>bool enable_node_autoprovisioning = 1;</code>
   */
  public boolean getEnableNodeAutoprovisioning() {
    return enableNodeAutoprovisioning_;
  }

  public static final int RESOURCE_LIMITS_FIELD_NUMBER = 2;
  private java.util.List<com.google.container.v1alpha1.ResourceLimit> resourceLimits_;
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  public java.util.List<com.google.container.v1alpha1.ResourceLimit> getResourceLimitsList() {
    return resourceLimits_;
  }
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  public java.util.List<? extends com.google.container.v1alpha1.ResourceLimitOrBuilder> 
      getResourceLimitsOrBuilderList() {
    return resourceLimits_;
  }
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  public int getResourceLimitsCount() {
    return resourceLimits_.size();
  }
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  public com.google.container.v1alpha1.ResourceLimit getResourceLimits(int index) {
    return resourceLimits_.get(index);
  }
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  public com.google.container.v1alpha1.ResourceLimitOrBuilder getResourceLimitsOrBuilder(
      int index) {
    return resourceLimits_.get(index);
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
    if (enableNodeAutoprovisioning_ != false) {
      output.writeBool(1, enableNodeAutoprovisioning_);
    }
    for (int i = 0; i < resourceLimits_.size(); i++) {
      output.writeMessage(2, resourceLimits_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableNodeAutoprovisioning_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableNodeAutoprovisioning_);
    }
    for (int i = 0; i < resourceLimits_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, resourceLimits_.get(i));
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
    if (!(obj instanceof com.google.container.v1alpha1.ClusterAutoscaling)) {
      return super.equals(obj);
    }
    com.google.container.v1alpha1.ClusterAutoscaling other = (com.google.container.v1alpha1.ClusterAutoscaling) obj;

    boolean result = true;
    result = result && (getEnableNodeAutoprovisioning()
        == other.getEnableNodeAutoprovisioning());
    result = result && getResourceLimitsList()
        .equals(other.getResourceLimitsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENABLE_NODE_AUTOPROVISIONING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableNodeAutoprovisioning());
    if (getResourceLimitsCount() > 0) {
      hash = (37 * hash) + RESOURCE_LIMITS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceLimitsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1alpha1.ClusterAutoscaling parseFrom(
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
  public static Builder newBuilder(com.google.container.v1alpha1.ClusterAutoscaling prototype) {
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
   * ClusterAutoscaling contains global, per-cluster information
   * required by Cluster Autoscaler to automatically adjust
   * the size of the cluster and create/delete
   * node pools based on the current needs.
   * </pre>
   *
   * Protobuf type {@code google.container.v1alpha1.ClusterAutoscaling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1alpha1.ClusterAutoscaling)
      com.google.container.v1alpha1.ClusterAutoscalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ClusterAutoscaling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ClusterAutoscaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1alpha1.ClusterAutoscaling.class, com.google.container.v1alpha1.ClusterAutoscaling.Builder.class);
    }

    // Construct using com.google.container.v1alpha1.ClusterAutoscaling.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResourceLimitsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enableNodeAutoprovisioning_ = false;

      if (resourceLimitsBuilder_ == null) {
        resourceLimits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        resourceLimitsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1alpha1.ClusterServiceProto.internal_static_google_container_v1alpha1_ClusterAutoscaling_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ClusterAutoscaling getDefaultInstanceForType() {
      return com.google.container.v1alpha1.ClusterAutoscaling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ClusterAutoscaling build() {
      com.google.container.v1alpha1.ClusterAutoscaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1alpha1.ClusterAutoscaling buildPartial() {
      com.google.container.v1alpha1.ClusterAutoscaling result = new com.google.container.v1alpha1.ClusterAutoscaling(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.enableNodeAutoprovisioning_ = enableNodeAutoprovisioning_;
      if (resourceLimitsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          resourceLimits_ = java.util.Collections.unmodifiableList(resourceLimits_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.resourceLimits_ = resourceLimits_;
      } else {
        result.resourceLimits_ = resourceLimitsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1alpha1.ClusterAutoscaling) {
        return mergeFrom((com.google.container.v1alpha1.ClusterAutoscaling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1alpha1.ClusterAutoscaling other) {
      if (other == com.google.container.v1alpha1.ClusterAutoscaling.getDefaultInstance()) return this;
      if (other.getEnableNodeAutoprovisioning() != false) {
        setEnableNodeAutoprovisioning(other.getEnableNodeAutoprovisioning());
      }
      if (resourceLimitsBuilder_ == null) {
        if (!other.resourceLimits_.isEmpty()) {
          if (resourceLimits_.isEmpty()) {
            resourceLimits_ = other.resourceLimits_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureResourceLimitsIsMutable();
            resourceLimits_.addAll(other.resourceLimits_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceLimits_.isEmpty()) {
          if (resourceLimitsBuilder_.isEmpty()) {
            resourceLimitsBuilder_.dispose();
            resourceLimitsBuilder_ = null;
            resourceLimits_ = other.resourceLimits_;
            bitField0_ = (bitField0_ & ~0x00000002);
            resourceLimitsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceLimitsFieldBuilder() : null;
          } else {
            resourceLimitsBuilder_.addAllMessages(other.resourceLimits_);
          }
        }
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
      com.google.container.v1alpha1.ClusterAutoscaling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1alpha1.ClusterAutoscaling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean enableNodeAutoprovisioning_ ;
    /**
     * <pre>
     * Enables automatic node pool creation and deletion.
     * </pre>
     *
     * <code>bool enable_node_autoprovisioning = 1;</code>
     */
    public boolean getEnableNodeAutoprovisioning() {
      return enableNodeAutoprovisioning_;
    }
    /**
     * <pre>
     * Enables automatic node pool creation and deletion.
     * </pre>
     *
     * <code>bool enable_node_autoprovisioning = 1;</code>
     */
    public Builder setEnableNodeAutoprovisioning(boolean value) {
      
      enableNodeAutoprovisioning_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enables automatic node pool creation and deletion.
     * </pre>
     *
     * <code>bool enable_node_autoprovisioning = 1;</code>
     */
    public Builder clearEnableNodeAutoprovisioning() {
      
      enableNodeAutoprovisioning_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.google.container.v1alpha1.ResourceLimit> resourceLimits_ =
      java.util.Collections.emptyList();
    private void ensureResourceLimitsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        resourceLimits_ = new java.util.ArrayList<com.google.container.v1alpha1.ResourceLimit>(resourceLimits_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1alpha1.ResourceLimit, com.google.container.v1alpha1.ResourceLimit.Builder, com.google.container.v1alpha1.ResourceLimitOrBuilder> resourceLimitsBuilder_;

    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public java.util.List<com.google.container.v1alpha1.ResourceLimit> getResourceLimitsList() {
      if (resourceLimitsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceLimits_);
      } else {
        return resourceLimitsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public int getResourceLimitsCount() {
      if (resourceLimitsBuilder_ == null) {
        return resourceLimits_.size();
      } else {
        return resourceLimitsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public com.google.container.v1alpha1.ResourceLimit getResourceLimits(int index) {
      if (resourceLimitsBuilder_ == null) {
        return resourceLimits_.get(index);
      } else {
        return resourceLimitsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder setResourceLimits(
        int index, com.google.container.v1alpha1.ResourceLimit value) {
      if (resourceLimitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLimitsIsMutable();
        resourceLimits_.set(index, value);
        onChanged();
      } else {
        resourceLimitsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder setResourceLimits(
        int index, com.google.container.v1alpha1.ResourceLimit.Builder builderForValue) {
      if (resourceLimitsBuilder_ == null) {
        ensureResourceLimitsIsMutable();
        resourceLimits_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceLimitsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder addResourceLimits(com.google.container.v1alpha1.ResourceLimit value) {
      if (resourceLimitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLimitsIsMutable();
        resourceLimits_.add(value);
        onChanged();
      } else {
        resourceLimitsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder addResourceLimits(
        int index, com.google.container.v1alpha1.ResourceLimit value) {
      if (resourceLimitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLimitsIsMutable();
        resourceLimits_.add(index, value);
        onChanged();
      } else {
        resourceLimitsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder addResourceLimits(
        com.google.container.v1alpha1.ResourceLimit.Builder builderForValue) {
      if (resourceLimitsBuilder_ == null) {
        ensureResourceLimitsIsMutable();
        resourceLimits_.add(builderForValue.build());
        onChanged();
      } else {
        resourceLimitsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder addResourceLimits(
        int index, com.google.container.v1alpha1.ResourceLimit.Builder builderForValue) {
      if (resourceLimitsBuilder_ == null) {
        ensureResourceLimitsIsMutable();
        resourceLimits_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceLimitsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder addAllResourceLimits(
        java.lang.Iterable<? extends com.google.container.v1alpha1.ResourceLimit> values) {
      if (resourceLimitsBuilder_ == null) {
        ensureResourceLimitsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceLimits_);
        onChanged();
      } else {
        resourceLimitsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder clearResourceLimits() {
      if (resourceLimitsBuilder_ == null) {
        resourceLimits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        resourceLimitsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public Builder removeResourceLimits(int index) {
      if (resourceLimitsBuilder_ == null) {
        ensureResourceLimitsIsMutable();
        resourceLimits_.remove(index);
        onChanged();
      } else {
        resourceLimitsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public com.google.container.v1alpha1.ResourceLimit.Builder getResourceLimitsBuilder(
        int index) {
      return getResourceLimitsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public com.google.container.v1alpha1.ResourceLimitOrBuilder getResourceLimitsOrBuilder(
        int index) {
      if (resourceLimitsBuilder_ == null) {
        return resourceLimits_.get(index);  } else {
        return resourceLimitsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public java.util.List<? extends com.google.container.v1alpha1.ResourceLimitOrBuilder> 
         getResourceLimitsOrBuilderList() {
      if (resourceLimitsBuilder_ != null) {
        return resourceLimitsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceLimits_);
      }
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public com.google.container.v1alpha1.ResourceLimit.Builder addResourceLimitsBuilder() {
      return getResourceLimitsFieldBuilder().addBuilder(
          com.google.container.v1alpha1.ResourceLimit.getDefaultInstance());
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public com.google.container.v1alpha1.ResourceLimit.Builder addResourceLimitsBuilder(
        int index) {
      return getResourceLimitsFieldBuilder().addBuilder(
          index, com.google.container.v1alpha1.ResourceLimit.getDefaultInstance());
    }
    /**
     * <pre>
     * Contains global constraints regarding minimum and maximum
     * amount of resources in the cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
     */
    public java.util.List<com.google.container.v1alpha1.ResourceLimit.Builder> 
         getResourceLimitsBuilderList() {
      return getResourceLimitsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1alpha1.ResourceLimit, com.google.container.v1alpha1.ResourceLimit.Builder, com.google.container.v1alpha1.ResourceLimitOrBuilder> 
        getResourceLimitsFieldBuilder() {
      if (resourceLimitsBuilder_ == null) {
        resourceLimitsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1alpha1.ResourceLimit, com.google.container.v1alpha1.ResourceLimit.Builder, com.google.container.v1alpha1.ResourceLimitOrBuilder>(
                resourceLimits_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        resourceLimits_ = null;
      }
      return resourceLimitsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1alpha1.ClusterAutoscaling)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1alpha1.ClusterAutoscaling)
  private static final com.google.container.v1alpha1.ClusterAutoscaling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1alpha1.ClusterAutoscaling();
  }

  public static com.google.container.v1alpha1.ClusterAutoscaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterAutoscaling>
      PARSER = new com.google.protobuf.AbstractParser<ClusterAutoscaling>() {
    @java.lang.Override
    public ClusterAutoscaling parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClusterAutoscaling(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterAutoscaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterAutoscaling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1alpha1.ClusterAutoscaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

