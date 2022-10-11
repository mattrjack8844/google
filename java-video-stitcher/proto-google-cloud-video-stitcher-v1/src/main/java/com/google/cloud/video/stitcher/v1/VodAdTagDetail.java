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
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

package com.google.cloud.video.stitcher.v1;

/**
 *
 *
 * <pre>
 * Information related to the details for one ad tag.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.VodAdTagDetail}
 */
public final class VodAdTagDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.VodAdTagDetail)
    VodAdTagDetailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VodAdTagDetail.newBuilder() to construct.
  private VodAdTagDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VodAdTagDetail() {
    name_ = "";
    adRequests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VodAdTagDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.VodAdTagDetail.class,
            com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the ad tag detail for the specified VOD session, in the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The name of the ad tag detail for the specified VOD session, in the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int AD_REQUESTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.video.stitcher.v1.AdRequest> adRequests_;
  /**
   *
   *
   * <pre>
   * A list of ad requests for one ad tag.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.AdRequest> getAdRequestsList() {
    return adRequests_;
  }
  /**
   *
   *
   * <pre>
   * A list of ad requests for one ad tag.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>
      getAdRequestsOrBuilderList() {
    return adRequests_;
  }
  /**
   *
   *
   * <pre>
   * A list of ad requests for one ad tag.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  @java.lang.Override
  public int getAdRequestsCount() {
    return adRequests_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of ad requests for one ad tag.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AdRequest getAdRequests(int index) {
    return adRequests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of ad requests for one ad tag.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AdRequestOrBuilder getAdRequestsOrBuilder(int index) {
    return adRequests_.get(index);
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
    for (int i = 0; i < adRequests_.size(); i++) {
      output.writeMessage(2, adRequests_.get(i));
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
    for (int i = 0; i < adRequests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, adRequests_.get(i));
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.VodAdTagDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.VodAdTagDetail other =
        (com.google.cloud.video.stitcher.v1.VodAdTagDetail) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAdRequestsList().equals(other.getAdRequestsList())) return false;
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
    if (getAdRequestsCount() > 0) {
      hash = (37 * hash) + AD_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getAdRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.VodAdTagDetail prototype) {
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
   * Information related to the details for one ad tag.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.VodAdTagDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.VodAdTagDetail)
      com.google.cloud.video.stitcher.v1.VodAdTagDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.VodAdTagDetail.class,
              com.google.cloud.video.stitcher.v1.VodAdTagDetail.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.VodAdTagDetail.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (adRequestsBuilder_ == null) {
        adRequests_ = java.util.Collections.emptyList();
      } else {
        adRequests_ = null;
        adRequestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.VodAdTagDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail build() {
      com.google.cloud.video.stitcher.v1.VodAdTagDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodAdTagDetail buildPartial() {
      com.google.cloud.video.stitcher.v1.VodAdTagDetail result =
          new com.google.cloud.video.stitcher.v1.VodAdTagDetail(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (adRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          adRequests_ = java.util.Collections.unmodifiableList(adRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adRequests_ = adRequests_;
      } else {
        result.adRequests_ = adRequestsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.video.stitcher.v1.VodAdTagDetail) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.VodAdTagDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.VodAdTagDetail other) {
      if (other == com.google.cloud.video.stitcher.v1.VodAdTagDetail.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (adRequestsBuilder_ == null) {
        if (!other.adRequests_.isEmpty()) {
          if (adRequests_.isEmpty()) {
            adRequests_ = other.adRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdRequestsIsMutable();
            adRequests_.addAll(other.adRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.adRequests_.isEmpty()) {
          if (adRequestsBuilder_.isEmpty()) {
            adRequestsBuilder_.dispose();
            adRequestsBuilder_ = null;
            adRequests_ = other.adRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adRequestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAdRequestsFieldBuilder()
                    : null;
          } else {
            adRequestsBuilder_.addAllMessages(other.adRequests_);
          }
        }
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

                break;
              } // case 10
            case 18:
              {
                com.google.cloud.video.stitcher.v1.AdRequest m =
                    input.readMessage(
                        com.google.cloud.video.stitcher.v1.AdRequest.parser(), extensionRegistry);
                if (adRequestsBuilder_ == null) {
                  ensureAdRequestsIsMutable();
                  adRequests_.add(m);
                } else {
                  adRequestsBuilder_.addMessage(m);
                }
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
     * The name of the ad tag detail for the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the ad tag detail for the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the ad tag detail for the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the ad tag detail for the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the ad tag detail for the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodAdTagDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.video.stitcher.v1.AdRequest> adRequests_ =
        java.util.Collections.emptyList();

    private void ensureAdRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        adRequests_ =
            new java.util.ArrayList<com.google.cloud.video.stitcher.v1.AdRequest>(adRequests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.AdRequest,
            com.google.cloud.video.stitcher.v1.AdRequest.Builder,
            com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>
        adRequestsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.AdRequest> getAdRequestsList() {
      if (adRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(adRequests_);
      } else {
        return adRequestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public int getAdRequestsCount() {
      if (adRequestsBuilder_ == null) {
        return adRequests_.size();
      } else {
        return adRequestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdRequest getAdRequests(int index) {
      if (adRequestsBuilder_ == null) {
        return adRequests_.get(index);
      } else {
        return adRequestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder setAdRequests(int index, com.google.cloud.video.stitcher.v1.AdRequest value) {
      if (adRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdRequestsIsMutable();
        adRequests_.set(index, value);
        onChanged();
      } else {
        adRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder setAdRequests(
        int index, com.google.cloud.video.stitcher.v1.AdRequest.Builder builderForValue) {
      if (adRequestsBuilder_ == null) {
        ensureAdRequestsIsMutable();
        adRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        adRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder addAdRequests(com.google.cloud.video.stitcher.v1.AdRequest value) {
      if (adRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdRequestsIsMutable();
        adRequests_.add(value);
        onChanged();
      } else {
        adRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder addAdRequests(int index, com.google.cloud.video.stitcher.v1.AdRequest value) {
      if (adRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdRequestsIsMutable();
        adRequests_.add(index, value);
        onChanged();
      } else {
        adRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder addAdRequests(
        com.google.cloud.video.stitcher.v1.AdRequest.Builder builderForValue) {
      if (adRequestsBuilder_ == null) {
        ensureAdRequestsIsMutable();
        adRequests_.add(builderForValue.build());
        onChanged();
      } else {
        adRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder addAdRequests(
        int index, com.google.cloud.video.stitcher.v1.AdRequest.Builder builderForValue) {
      if (adRequestsBuilder_ == null) {
        ensureAdRequestsIsMutable();
        adRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        adRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder addAllAdRequests(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.AdRequest> values) {
      if (adRequestsBuilder_ == null) {
        ensureAdRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, adRequests_);
        onChanged();
      } else {
        adRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder clearAdRequests() {
      if (adRequestsBuilder_ == null) {
        adRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public Builder removeAdRequests(int index) {
      if (adRequestsBuilder_ == null) {
        ensureAdRequestsIsMutable();
        adRequests_.remove(index);
        onChanged();
      } else {
        adRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdRequest.Builder getAdRequestsBuilder(int index) {
      return getAdRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdRequestOrBuilder getAdRequestsOrBuilder(int index) {
      if (adRequestsBuilder_ == null) {
        return adRequests_.get(index);
      } else {
        return adRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>
        getAdRequestsOrBuilderList() {
      if (adRequestsBuilder_ != null) {
        return adRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(adRequests_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdRequest.Builder addAdRequestsBuilder() {
      return getAdRequestsFieldBuilder()
          .addBuilder(com.google.cloud.video.stitcher.v1.AdRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdRequest.Builder addAdRequestsBuilder(int index) {
      return getAdRequestsFieldBuilder()
          .addBuilder(index, com.google.cloud.video.stitcher.v1.AdRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of ad requests for one ad tag.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.AdRequest.Builder>
        getAdRequestsBuilderList() {
      return getAdRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.AdRequest,
            com.google.cloud.video.stitcher.v1.AdRequest.Builder,
            com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>
        getAdRequestsFieldBuilder() {
      if (adRequestsBuilder_ == null) {
        adRequestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.video.stitcher.v1.AdRequest,
                com.google.cloud.video.stitcher.v1.AdRequest.Builder,
                com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>(
                adRequests_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        adRequests_ = null;
      }
      return adRequestsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.VodAdTagDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.VodAdTagDetail)
  private static final com.google.cloud.video.stitcher.v1.VodAdTagDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.VodAdTagDetail();
  }

  public static com.google.cloud.video.stitcher.v1.VodAdTagDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodAdTagDetail> PARSER =
      new com.google.protobuf.AbstractParser<VodAdTagDetail>() {
        @java.lang.Override
        public VodAdTagDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<VodAdTagDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodAdTagDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodAdTagDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
