// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/sessions.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Describes what was stitched into a VOD session's manifest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.Interstitials}
 */
public final class Interstitials extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.Interstitials)
    InterstitialsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Interstitials.newBuilder() to construct.
  private Interstitials(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Interstitials() {
    adBreaks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Interstitials();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_Interstitials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.Interstitials.class, com.google.cloud.video.stitcher.v1.Interstitials.Builder.class);
  }

  public static final int AD_BREAKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.video.stitcher.v1.VodSessionAdBreak> adBreaks_;
  /**
   * <pre>
   * List of ad breaks ordered by time.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.VodSessionAdBreak> getAdBreaksList() {
    return adBreaks_;
  }
  /**
   * <pre>
   * List of ad breaks ordered by time.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder> 
      getAdBreaksOrBuilderList() {
    return adBreaks_;
  }
  /**
   * <pre>
   * List of ad breaks ordered by time.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
   */
  @java.lang.Override
  public int getAdBreaksCount() {
    return adBreaks_.size();
  }
  /**
   * <pre>
   * List of ad breaks ordered by time.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodSessionAdBreak getAdBreaks(int index) {
    return adBreaks_.get(index);
  }
  /**
   * <pre>
   * List of ad breaks ordered by time.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder getAdBreaksOrBuilder(
      int index) {
    return adBreaks_.get(index);
  }

  public static final int SESSION_CONTENT_FIELD_NUMBER = 2;
  private com.google.cloud.video.stitcher.v1.VodSessionContent sessionContent_;
  /**
   * <pre>
   * Information related to the content of the VOD session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
   * @return Whether the sessionContent field is set.
   */
  @java.lang.Override
  public boolean hasSessionContent() {
    return sessionContent_ != null;
  }
  /**
   * <pre>
   * Information related to the content of the VOD session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
   * @return The sessionContent.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodSessionContent getSessionContent() {
    return sessionContent_ == null ? com.google.cloud.video.stitcher.v1.VodSessionContent.getDefaultInstance() : sessionContent_;
  }
  /**
   * <pre>
   * Information related to the content of the VOD session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodSessionContentOrBuilder getSessionContentOrBuilder() {
    return sessionContent_ == null ? com.google.cloud.video.stitcher.v1.VodSessionContent.getDefaultInstance() : sessionContent_;
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
    for (int i = 0; i < adBreaks_.size(); i++) {
      output.writeMessage(1, adBreaks_.get(i));
    }
    if (sessionContent_ != null) {
      output.writeMessage(2, getSessionContent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < adBreaks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, adBreaks_.get(i));
    }
    if (sessionContent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSessionContent());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.Interstitials)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.Interstitials other = (com.google.cloud.video.stitcher.v1.Interstitials) obj;

    if (!getAdBreaksList()
        .equals(other.getAdBreaksList())) return false;
    if (hasSessionContent() != other.hasSessionContent()) return false;
    if (hasSessionContent()) {
      if (!getSessionContent()
          .equals(other.getSessionContent())) return false;
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
    if (getAdBreaksCount() > 0) {
      hash = (37 * hash) + AD_BREAKS_FIELD_NUMBER;
      hash = (53 * hash) + getAdBreaksList().hashCode();
    }
    if (hasSessionContent()) {
      hash = (37 * hash) + SESSION_CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getSessionContent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.Interstitials parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.Interstitials parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.Interstitials parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.Interstitials prototype) {
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
   * Describes what was stitched into a VOD session's manifest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.Interstitials}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.Interstitials)
      com.google.cloud.video.stitcher.v1.InterstitialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_Interstitials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.Interstitials.class, com.google.cloud.video.stitcher.v1.Interstitials.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.Interstitials.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (adBreaksBuilder_ == null) {
        adBreaks_ = java.util.Collections.emptyList();
      } else {
        adBreaks_ = null;
        adBreaksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionContent_ = null;
      if (sessionContentBuilder_ != null) {
        sessionContentBuilder_.dispose();
        sessionContentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.Interstitials getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.Interstitials.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.Interstitials build() {
      com.google.cloud.video.stitcher.v1.Interstitials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.Interstitials buildPartial() {
      com.google.cloud.video.stitcher.v1.Interstitials result = new com.google.cloud.video.stitcher.v1.Interstitials(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.video.stitcher.v1.Interstitials result) {
      if (adBreaksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          adBreaks_ = java.util.Collections.unmodifiableList(adBreaks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adBreaks_ = adBreaks_;
      } else {
        result.adBreaks_ = adBreaksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.Interstitials result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionContent_ = sessionContentBuilder_ == null
            ? sessionContent_
            : sessionContentBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.video.stitcher.v1.Interstitials) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.Interstitials)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.Interstitials other) {
      if (other == com.google.cloud.video.stitcher.v1.Interstitials.getDefaultInstance()) return this;
      if (adBreaksBuilder_ == null) {
        if (!other.adBreaks_.isEmpty()) {
          if (adBreaks_.isEmpty()) {
            adBreaks_ = other.adBreaks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdBreaksIsMutable();
            adBreaks_.addAll(other.adBreaks_);
          }
          onChanged();
        }
      } else {
        if (!other.adBreaks_.isEmpty()) {
          if (adBreaksBuilder_.isEmpty()) {
            adBreaksBuilder_.dispose();
            adBreaksBuilder_ = null;
            adBreaks_ = other.adBreaks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adBreaksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAdBreaksFieldBuilder() : null;
          } else {
            adBreaksBuilder_.addAllMessages(other.adBreaks_);
          }
        }
      }
      if (other.hasSessionContent()) {
        mergeSessionContent(other.getSessionContent());
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
            case 10: {
              com.google.cloud.video.stitcher.v1.VodSessionAdBreak m =
                  input.readMessage(
                      com.google.cloud.video.stitcher.v1.VodSessionAdBreak.parser(),
                      extensionRegistry);
              if (adBreaksBuilder_ == null) {
                ensureAdBreaksIsMutable();
                adBreaks_.add(m);
              } else {
                adBreaksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSessionContentFieldBuilder().getBuilder(),
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

    private java.util.List<com.google.cloud.video.stitcher.v1.VodSessionAdBreak> adBreaks_ =
      java.util.Collections.emptyList();
    private void ensureAdBreaksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        adBreaks_ = new java.util.ArrayList<com.google.cloud.video.stitcher.v1.VodSessionAdBreak>(adBreaks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodSessionAdBreak, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder, com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder> adBreaksBuilder_;

    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.VodSessionAdBreak> getAdBreaksList() {
      if (adBreaksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(adBreaks_);
      } else {
        return adBreaksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public int getAdBreaksCount() {
      if (adBreaksBuilder_ == null) {
        return adBreaks_.size();
      } else {
        return adBreaksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionAdBreak getAdBreaks(int index) {
      if (adBreaksBuilder_ == null) {
        return adBreaks_.get(index);
      } else {
        return adBreaksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder setAdBreaks(
        int index, com.google.cloud.video.stitcher.v1.VodSessionAdBreak value) {
      if (adBreaksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdBreaksIsMutable();
        adBreaks_.set(index, value);
        onChanged();
      } else {
        adBreaksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder setAdBreaks(
        int index, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder builderForValue) {
      if (adBreaksBuilder_ == null) {
        ensureAdBreaksIsMutable();
        adBreaks_.set(index, builderForValue.build());
        onChanged();
      } else {
        adBreaksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder addAdBreaks(com.google.cloud.video.stitcher.v1.VodSessionAdBreak value) {
      if (adBreaksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdBreaksIsMutable();
        adBreaks_.add(value);
        onChanged();
      } else {
        adBreaksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder addAdBreaks(
        int index, com.google.cloud.video.stitcher.v1.VodSessionAdBreak value) {
      if (adBreaksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdBreaksIsMutable();
        adBreaks_.add(index, value);
        onChanged();
      } else {
        adBreaksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder addAdBreaks(
        com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder builderForValue) {
      if (adBreaksBuilder_ == null) {
        ensureAdBreaksIsMutable();
        adBreaks_.add(builderForValue.build());
        onChanged();
      } else {
        adBreaksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder addAdBreaks(
        int index, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder builderForValue) {
      if (adBreaksBuilder_ == null) {
        ensureAdBreaksIsMutable();
        adBreaks_.add(index, builderForValue.build());
        onChanged();
      } else {
        adBreaksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder addAllAdBreaks(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.VodSessionAdBreak> values) {
      if (adBreaksBuilder_ == null) {
        ensureAdBreaksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, adBreaks_);
        onChanged();
      } else {
        adBreaksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder clearAdBreaks() {
      if (adBreaksBuilder_ == null) {
        adBreaks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adBreaksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public Builder removeAdBreaks(int index) {
      if (adBreaksBuilder_ == null) {
        ensureAdBreaksIsMutable();
        adBreaks_.remove(index);
        onChanged();
      } else {
        adBreaksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder getAdBreaksBuilder(
        int index) {
      return getAdBreaksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder getAdBreaksOrBuilder(
        int index) {
      if (adBreaksBuilder_ == null) {
        return adBreaks_.get(index);  } else {
        return adBreaksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder> 
         getAdBreaksOrBuilderList() {
      if (adBreaksBuilder_ != null) {
        return adBreaksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(adBreaks_);
      }
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder addAdBreaksBuilder() {
      return getAdBreaksFieldBuilder().addBuilder(
          com.google.cloud.video.stitcher.v1.VodSessionAdBreak.getDefaultInstance());
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder addAdBreaksBuilder(
        int index) {
      return getAdBreaksFieldBuilder().addBuilder(
          index, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.getDefaultInstance());
    }
    /**
     * <pre>
     * List of ad breaks ordered by time.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.VodSessionAdBreak ad_breaks = 1;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder> 
         getAdBreaksBuilderList() {
      return getAdBreaksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodSessionAdBreak, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder, com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder> 
        getAdBreaksFieldBuilder() {
      if (adBreaksBuilder_ == null) {
        adBreaksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.VodSessionAdBreak, com.google.cloud.video.stitcher.v1.VodSessionAdBreak.Builder, com.google.cloud.video.stitcher.v1.VodSessionAdBreakOrBuilder>(
                adBreaks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        adBreaks_ = null;
      }
      return adBreaksBuilder_;
    }

    private com.google.cloud.video.stitcher.v1.VodSessionContent sessionContent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodSessionContent, com.google.cloud.video.stitcher.v1.VodSessionContent.Builder, com.google.cloud.video.stitcher.v1.VodSessionContentOrBuilder> sessionContentBuilder_;
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     * @return Whether the sessionContent field is set.
     */
    public boolean hasSessionContent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     * @return The sessionContent.
     */
    public com.google.cloud.video.stitcher.v1.VodSessionContent getSessionContent() {
      if (sessionContentBuilder_ == null) {
        return sessionContent_ == null ? com.google.cloud.video.stitcher.v1.VodSessionContent.getDefaultInstance() : sessionContent_;
      } else {
        return sessionContentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public Builder setSessionContent(com.google.cloud.video.stitcher.v1.VodSessionContent value) {
      if (sessionContentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionContent_ = value;
      } else {
        sessionContentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public Builder setSessionContent(
        com.google.cloud.video.stitcher.v1.VodSessionContent.Builder builderForValue) {
      if (sessionContentBuilder_ == null) {
        sessionContent_ = builderForValue.build();
      } else {
        sessionContentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public Builder mergeSessionContent(com.google.cloud.video.stitcher.v1.VodSessionContent value) {
      if (sessionContentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          sessionContent_ != null &&
          sessionContent_ != com.google.cloud.video.stitcher.v1.VodSessionContent.getDefaultInstance()) {
          getSessionContentBuilder().mergeFrom(value);
        } else {
          sessionContent_ = value;
        }
      } else {
        sessionContentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public Builder clearSessionContent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionContent_ = null;
      if (sessionContentBuilder_ != null) {
        sessionContentBuilder_.dispose();
        sessionContentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionContent.Builder getSessionContentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSessionContentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.VodSessionContentOrBuilder getSessionContentOrBuilder() {
      if (sessionContentBuilder_ != null) {
        return sessionContentBuilder_.getMessageOrBuilder();
      } else {
        return sessionContent_ == null ?
            com.google.cloud.video.stitcher.v1.VodSessionContent.getDefaultInstance() : sessionContent_;
      }
    }
    /**
     * <pre>
     * Information related to the content of the VOD session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.VodSessionContent session_content = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.VodSessionContent, com.google.cloud.video.stitcher.v1.VodSessionContent.Builder, com.google.cloud.video.stitcher.v1.VodSessionContentOrBuilder> 
        getSessionContentFieldBuilder() {
      if (sessionContentBuilder_ == null) {
        sessionContentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.VodSessionContent, com.google.cloud.video.stitcher.v1.VodSessionContent.Builder, com.google.cloud.video.stitcher.v1.VodSessionContentOrBuilder>(
                getSessionContent(),
                getParentForChildren(),
                isClean());
        sessionContent_ = null;
      }
      return sessionContentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.Interstitials)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.Interstitials)
  private static final com.google.cloud.video.stitcher.v1.Interstitials DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.Interstitials();
  }

  public static com.google.cloud.video.stitcher.v1.Interstitials getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Interstitials>
      PARSER = new com.google.protobuf.AbstractParser<Interstitials>() {
    @java.lang.Override
    public Interstitials parsePartialFrom(
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

  public static com.google.protobuf.Parser<Interstitials> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Interstitials> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.Interstitials getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

