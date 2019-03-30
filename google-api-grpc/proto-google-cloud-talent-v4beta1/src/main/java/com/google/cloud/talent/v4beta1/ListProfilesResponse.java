// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * The List profiles response object.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.ListProfilesResponse}
 */
public final class ListProfilesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.ListProfilesResponse)
    ListProfilesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProfilesResponse.newBuilder() to construct.
  private ListProfilesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProfilesResponse() {
    profiles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListProfilesResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                profiles_ = new java.util.ArrayList<com.google.cloud.talent.v4beta1.Profile>();
                mutable_bitField0_ |= 0x00000001;
              }
              profiles_.add(
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Profile.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        profiles_ = java.util.Collections.unmodifiableList(profiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.ProfileServiceProto
        .internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ProfileServiceProto
        .internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.ListProfilesResponse.class,
            com.google.cloud.talent.v4beta1.ListProfilesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PROFILES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.talent.v4beta1.Profile> profiles_;
  /**
   *
   *
   * <pre>
   * Profiles for the specific tenant.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
   */
  public java.util.List<com.google.cloud.talent.v4beta1.Profile> getProfilesList() {
    return profiles_;
  }
  /**
   *
   *
   * <pre>
   * Profiles for the specific tenant.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.talent.v4beta1.ProfileOrBuilder>
      getProfilesOrBuilderList() {
    return profiles_;
  }
  /**
   *
   *
   * <pre>
   * Profiles for the specific tenant.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
   */
  public int getProfilesCount() {
    return profiles_.size();
  }
  /**
   *
   *
   * <pre>
   * Profiles for the specific tenant.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.Profile getProfiles(int index) {
    return profiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Profiles for the specific tenant.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfilesOrBuilder(int index) {
    return profiles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This is empty if there are no
   * more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This is empty if there are no
   * more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < profiles_.size(); i++) {
      output.writeMessage(1, profiles_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < profiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, profiles_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.ListProfilesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.ListProfilesResponse other =
        (com.google.cloud.talent.v4beta1.ListProfilesResponse) obj;

    if (!getProfilesList().equals(other.getProfilesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getProfilesCount() > 0) {
      hash = (37 * hash) + PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getProfilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.ListProfilesResponse prototype) {
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
   * The List profiles response object.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.ListProfilesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.ListProfilesResponse)
      com.google.cloud.talent.v4beta1.ListProfilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto
          .internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto
          .internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.ListProfilesResponse.class,
              com.google.cloud.talent.v4beta1.ListProfilesResponse.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.ListProfilesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProfilesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (profilesBuilder_ == null) {
        profiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        profilesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto
          .internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ListProfilesResponse getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.ListProfilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ListProfilesResponse build() {
      com.google.cloud.talent.v4beta1.ListProfilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ListProfilesResponse buildPartial() {
      com.google.cloud.talent.v4beta1.ListProfilesResponse result =
          new com.google.cloud.talent.v4beta1.ListProfilesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (profilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          profiles_ = java.util.Collections.unmodifiableList(profiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.profiles_ = profiles_;
      } else {
        result.profiles_ = profilesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.ListProfilesResponse) {
        return mergeFrom((com.google.cloud.talent.v4beta1.ListProfilesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.ListProfilesResponse other) {
      if (other == com.google.cloud.talent.v4beta1.ListProfilesResponse.getDefaultInstance())
        return this;
      if (profilesBuilder_ == null) {
        if (!other.profiles_.isEmpty()) {
          if (profiles_.isEmpty()) {
            profiles_ = other.profiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProfilesIsMutable();
            profiles_.addAll(other.profiles_);
          }
          onChanged();
        }
      } else {
        if (!other.profiles_.isEmpty()) {
          if (profilesBuilder_.isEmpty()) {
            profilesBuilder_.dispose();
            profilesBuilder_ = null;
            profiles_ = other.profiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            profilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProfilesFieldBuilder()
                    : null;
          } else {
            profilesBuilder_.addAllMessages(other.profiles_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.talent.v4beta1.ListProfilesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.ListProfilesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.talent.v4beta1.Profile> profiles_ =
        java.util.Collections.emptyList();

    private void ensureProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        profiles_ = new java.util.ArrayList<com.google.cloud.talent.v4beta1.Profile>(profiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Profile,
            com.google.cloud.talent.v4beta1.Profile.Builder,
            com.google.cloud.talent.v4beta1.ProfileOrBuilder>
        profilesBuilder_;

    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public java.util.List<com.google.cloud.talent.v4beta1.Profile> getProfilesList() {
      if (profilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(profiles_);
      } else {
        return profilesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public int getProfilesCount() {
      if (profilesBuilder_ == null) {
        return profiles_.size();
      } else {
        return profilesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Profile getProfiles(int index) {
      if (profilesBuilder_ == null) {
        return profiles_.get(index);
      } else {
        return profilesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder setProfiles(int index, com.google.cloud.talent.v4beta1.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.set(index, value);
        onChanged();
      } else {
        profilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder setProfiles(
        int index, com.google.cloud.talent.v4beta1.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder addProfiles(com.google.cloud.talent.v4beta1.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.add(value);
        onChanged();
      } else {
        profilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder addProfiles(int index, com.google.cloud.talent.v4beta1.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.add(index, value);
        onChanged();
      } else {
        profilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder addProfiles(com.google.cloud.talent.v4beta1.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.add(builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder addProfiles(
        int index, com.google.cloud.talent.v4beta1.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder addAllProfiles(
        java.lang.Iterable<? extends com.google.cloud.talent.v4beta1.Profile> values) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, profiles_);
        onChanged();
      } else {
        profilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder clearProfiles() {
      if (profilesBuilder_ == null) {
        profiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        profilesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public Builder removeProfiles(int index) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.remove(index);
        onChanged();
      } else {
        profilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Profile.Builder getProfilesBuilder(int index) {
      return getProfilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfilesOrBuilder(int index) {
      if (profilesBuilder_ == null) {
        return profiles_.get(index);
      } else {
        return profilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.talent.v4beta1.ProfileOrBuilder>
        getProfilesOrBuilderList() {
      if (profilesBuilder_ != null) {
        return profilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(profiles_);
      }
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Profile.Builder addProfilesBuilder() {
      return getProfilesFieldBuilder()
          .addBuilder(com.google.cloud.talent.v4beta1.Profile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Profile.Builder addProfilesBuilder(int index) {
      return getProfilesFieldBuilder()
          .addBuilder(index, com.google.cloud.talent.v4beta1.Profile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Profiles for the specific tenant.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4beta1.Profile profiles = 1;</code>
     */
    public java.util.List<com.google.cloud.talent.v4beta1.Profile.Builder>
        getProfilesBuilderList() {
      return getProfilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Profile,
            com.google.cloud.talent.v4beta1.Profile.Builder,
            com.google.cloud.talent.v4beta1.ProfileOrBuilder>
        getProfilesFieldBuilder() {
      if (profilesBuilder_ == null) {
        profilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Profile,
                com.google.cloud.talent.v4beta1.Profile.Builder,
                com.google.cloud.talent.v4beta1.ProfileOrBuilder>(
                profiles_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        profiles_ = null;
      }
      return profilesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This is empty if there are no
     * more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This is empty if there are no
     * more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This is empty if there are no
     * more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This is empty if there are no
     * more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This is empty if there are no
     * more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.ListProfilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.ListProfilesResponse)
  private static final com.google.cloud.talent.v4beta1.ListProfilesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.ListProfilesResponse();
  }

  public static com.google.cloud.talent.v4beta1.ListProfilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProfilesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProfilesResponse>() {
        @java.lang.Override
        public ListProfilesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListProfilesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListProfilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProfilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ListProfilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
