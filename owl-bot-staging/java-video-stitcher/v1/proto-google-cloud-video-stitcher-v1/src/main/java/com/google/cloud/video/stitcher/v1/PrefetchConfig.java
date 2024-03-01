// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/live_configs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * The configuration for prefetch ads.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.PrefetchConfig}
 */
public final class PrefetchConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.PrefetchConfig)
    PrefetchConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrefetchConfig.newBuilder() to construct.
  private PrefetchConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrefetchConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrefetchConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.LiveConfigsProto.internal_static_google_cloud_video_stitcher_v1_PrefetchConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.LiveConfigsProto.internal_static_google_cloud_video_stitcher_v1_PrefetchConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.PrefetchConfig.class, com.google.cloud.video.stitcher.v1.PrefetchConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <pre>
   * Required. Indicates whether the option to prefetch ad requests is enabled.
   * </pre>
   *
   * <code>bool enabled = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int INITIAL_AD_REQUEST_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration initialAdRequestDuration_;
  /**
   * <pre>
   * The duration in seconds of the part of the break to be prefetched.
   * This field is only relevant if prefetch is enabled.
   * You should set this duration to as long as possible to increase the
   * benefits of prefetching, but not longer than the shortest ad break
   * expected. For example, for a live event with 30s and 60s ad breaks, the
   * initial duration should be set to 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
   * @return Whether the initialAdRequestDuration field is set.
   */
  @java.lang.Override
  public boolean hasInitialAdRequestDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The duration in seconds of the part of the break to be prefetched.
   * This field is only relevant if prefetch is enabled.
   * You should set this duration to as long as possible to increase the
   * benefits of prefetching, but not longer than the shortest ad break
   * expected. For example, for a live event with 30s and 60s ad breaks, the
   * initial duration should be set to 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
   * @return The initialAdRequestDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getInitialAdRequestDuration() {
    return initialAdRequestDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : initialAdRequestDuration_;
  }
  /**
   * <pre>
   * The duration in seconds of the part of the break to be prefetched.
   * This field is only relevant if prefetch is enabled.
   * You should set this duration to as long as possible to increase the
   * benefits of prefetching, but not longer than the shortest ad break
   * expected. For example, for a live event with 30s and 60s ad breaks, the
   * initial duration should be set to 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getInitialAdRequestDurationOrBuilder() {
    return initialAdRequestDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : initialAdRequestDuration_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getInitialAdRequestDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInitialAdRequestDuration());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.PrefetchConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.PrefetchConfig other = (com.google.cloud.video.stitcher.v1.PrefetchConfig) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (hasInitialAdRequestDuration() != other.hasInitialAdRequestDuration()) return false;
    if (hasInitialAdRequestDuration()) {
      if (!getInitialAdRequestDuration()
          .equals(other.getInitialAdRequestDuration())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    if (hasInitialAdRequestDuration()) {
      hash = (37 * hash) + INITIAL_AD_REQUEST_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getInitialAdRequestDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.PrefetchConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.PrefetchConfig prototype) {
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
   * The configuration for prefetch ads.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.PrefetchConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.PrefetchConfig)
      com.google.cloud.video.stitcher.v1.PrefetchConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.LiveConfigsProto.internal_static_google_cloud_video_stitcher_v1_PrefetchConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.LiveConfigsProto.internal_static_google_cloud_video_stitcher_v1_PrefetchConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.PrefetchConfig.class, com.google.cloud.video.stitcher.v1.PrefetchConfig.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.PrefetchConfig.newBuilder()
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
        getInitialAdRequestDurationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      initialAdRequestDuration_ = null;
      if (initialAdRequestDurationBuilder_ != null) {
        initialAdRequestDurationBuilder_.dispose();
        initialAdRequestDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.LiveConfigsProto.internal_static_google_cloud_video_stitcher_v1_PrefetchConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.PrefetchConfig getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.PrefetchConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.PrefetchConfig build() {
      com.google.cloud.video.stitcher.v1.PrefetchConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.PrefetchConfig buildPartial() {
      com.google.cloud.video.stitcher.v1.PrefetchConfig result = new com.google.cloud.video.stitcher.v1.PrefetchConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.PrefetchConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.initialAdRequestDuration_ = initialAdRequestDurationBuilder_ == null
            ? initialAdRequestDuration_
            : initialAdRequestDurationBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.video.stitcher.v1.PrefetchConfig) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.PrefetchConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.PrefetchConfig other) {
      if (other == com.google.cloud.video.stitcher.v1.PrefetchConfig.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.hasInitialAdRequestDuration()) {
        mergeInitialAdRequestDuration(other.getInitialAdRequestDuration());
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
            case 8: {
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getInitialAdRequestDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private boolean enabled_ ;
    /**
     * <pre>
     * Required. Indicates whether the option to prefetch ad requests is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Required. Indicates whether the option to prefetch ad requests is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Indicates whether the option to prefetch ad requests is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration initialAdRequestDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> initialAdRequestDurationBuilder_;
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     * @return Whether the initialAdRequestDuration field is set.
     */
    public boolean hasInitialAdRequestDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     * @return The initialAdRequestDuration.
     */
    public com.google.protobuf.Duration getInitialAdRequestDuration() {
      if (initialAdRequestDurationBuilder_ == null) {
        return initialAdRequestDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : initialAdRequestDuration_;
      } else {
        return initialAdRequestDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public Builder setInitialAdRequestDuration(com.google.protobuf.Duration value) {
      if (initialAdRequestDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        initialAdRequestDuration_ = value;
      } else {
        initialAdRequestDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public Builder setInitialAdRequestDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (initialAdRequestDurationBuilder_ == null) {
        initialAdRequestDuration_ = builderForValue.build();
      } else {
        initialAdRequestDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public Builder mergeInitialAdRequestDuration(com.google.protobuf.Duration value) {
      if (initialAdRequestDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          initialAdRequestDuration_ != null &&
          initialAdRequestDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getInitialAdRequestDurationBuilder().mergeFrom(value);
        } else {
          initialAdRequestDuration_ = value;
        }
      } else {
        initialAdRequestDurationBuilder_.mergeFrom(value);
      }
      if (initialAdRequestDuration_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public Builder clearInitialAdRequestDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      initialAdRequestDuration_ = null;
      if (initialAdRequestDurationBuilder_ != null) {
        initialAdRequestDurationBuilder_.dispose();
        initialAdRequestDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getInitialAdRequestDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInitialAdRequestDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getInitialAdRequestDurationOrBuilder() {
      if (initialAdRequestDurationBuilder_ != null) {
        return initialAdRequestDurationBuilder_.getMessageOrBuilder();
      } else {
        return initialAdRequestDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : initialAdRequestDuration_;
      }
    }
    /**
     * <pre>
     * The duration in seconds of the part of the break to be prefetched.
     * This field is only relevant if prefetch is enabled.
     * You should set this duration to as long as possible to increase the
     * benefits of prefetching, but not longer than the shortest ad break
     * expected. For example, for a live event with 30s and 60s ad breaks, the
     * initial duration should be set to 30s.
     * </pre>
     *
     * <code>.google.protobuf.Duration initial_ad_request_duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getInitialAdRequestDurationFieldBuilder() {
      if (initialAdRequestDurationBuilder_ == null) {
        initialAdRequestDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getInitialAdRequestDuration(),
                getParentForChildren(),
                isClean());
        initialAdRequestDuration_ = null;
      }
      return initialAdRequestDurationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.PrefetchConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.PrefetchConfig)
  private static final com.google.cloud.video.stitcher.v1.PrefetchConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.PrefetchConfig();
  }

  public static com.google.cloud.video.stitcher.v1.PrefetchConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrefetchConfig>
      PARSER = new com.google.protobuf.AbstractParser<PrefetchConfig>() {
    @java.lang.Override
    public PrefetchConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrefetchConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrefetchConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.PrefetchConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

