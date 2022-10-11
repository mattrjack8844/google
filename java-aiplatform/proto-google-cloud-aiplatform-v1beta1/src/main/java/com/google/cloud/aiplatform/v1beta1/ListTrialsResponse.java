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
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [VizierService.ListTrials][google.cloud.aiplatform.v1beta1.VizierService.ListTrials].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListTrialsResponse}
 */
public final class ListTrialsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListTrialsResponse)
    ListTrialsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTrialsResponse.newBuilder() to construct.
  private ListTrialsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTrialsResponse() {
    trials_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTrialsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListTrialsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListTrialsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.Builder.class);
  }

  public static final int TRIALS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> trials_;
  /**
   *
   *
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> getTrialsList() {
    return trials_;
  }
  /**
   *
   *
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
      getTrialsOrBuilderList() {
    return trials_;
  }
  /**
   *
   *
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
   */
  @java.lang.Override
  public int getTrialsCount() {
    return trials_.size();
  }
  /**
   *
   *
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Trial getTrials(int index) {
    return trials_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The Trials associated with the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TrialOrBuilder getTrialsOrBuilder(int index) {
    return trials_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
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
   * Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
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
    for (int i = 0; i < trials_.size(); i++) {
      output.writeMessage(1, trials_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < trials_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, trials_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListTrialsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListTrialsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListTrialsResponse) obj;

    if (!getTrialsList().equals(other.getTrialsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getTrialsCount() > 0) {
      hash = (37 * hash) + TRIALS_FIELD_NUMBER;
      hash = (53 * hash) + getTrialsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListTrialsResponse prototype) {
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
   * Response message for [VizierService.ListTrials][google.cloud.aiplatform.v1beta1.VizierService.ListTrials].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListTrialsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListTrialsResponse)
      com.google.cloud.aiplatform.v1beta1.ListTrialsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTrialsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTrialsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (trialsBuilder_ == null) {
        trials_ = java.util.Collections.emptyList();
      } else {
        trials_ = null;
        trialsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTrialsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTrialsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTrialsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListTrialsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTrialsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListTrialsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListTrialsResponse(this);
      int from_bitField0_ = bitField0_;
      if (trialsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trials_ = java.util.Collections.unmodifiableList(trials_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trials_ = trials_;
      } else {
        result.trials_ = trialsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListTrialsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListTrialsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListTrialsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListTrialsResponse.getDefaultInstance())
        return this;
      if (trialsBuilder_ == null) {
        if (!other.trials_.isEmpty()) {
          if (trials_.isEmpty()) {
            trials_ = other.trials_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrialsIsMutable();
            trials_.addAll(other.trials_);
          }
          onChanged();
        }
      } else {
        if (!other.trials_.isEmpty()) {
          if (trialsBuilder_.isEmpty()) {
            trialsBuilder_.dispose();
            trialsBuilder_ = null;
            trials_ = other.trials_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trialsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTrialsFieldBuilder()
                    : null;
          } else {
            trialsBuilder_.addAllMessages(other.trials_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.aiplatform.v1beta1.Trial m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Trial.parser(), extensionRegistry);
                if (trialsBuilder_ == null) {
                  ensureTrialsIsMutable();
                  trials_.add(m);
                } else {
                  trialsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> trials_ =
        java.util.Collections.emptyList();

    private void ensureTrialsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trials_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Trial>(trials_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Trial,
            com.google.cloud.aiplatform.v1beta1.Trial.Builder,
            com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        trialsBuilder_;

    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> getTrialsList() {
      if (trialsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trials_);
      } else {
        return trialsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public int getTrialsCount() {
      if (trialsBuilder_ == null) {
        return trials_.size();
      } else {
        return trialsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial getTrials(int index) {
      if (trialsBuilder_ == null) {
        return trials_.get(index);
      } else {
        return trialsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder setTrials(int index, com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (trialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialsIsMutable();
        trials_.set(index, value);
        onChanged();
      } else {
        trialsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder setTrials(
        int index, com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (trialsBuilder_ == null) {
        ensureTrialsIsMutable();
        trials_.set(index, builderForValue.build());
        onChanged();
      } else {
        trialsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder addTrials(com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (trialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialsIsMutable();
        trials_.add(value);
        onChanged();
      } else {
        trialsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder addTrials(int index, com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (trialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialsIsMutable();
        trials_.add(index, value);
        onChanged();
      } else {
        trialsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder addTrials(com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (trialsBuilder_ == null) {
        ensureTrialsIsMutable();
        trials_.add(builderForValue.build());
        onChanged();
      } else {
        trialsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder addTrials(
        int index, com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (trialsBuilder_ == null) {
        ensureTrialsIsMutable();
        trials_.add(index, builderForValue.build());
        onChanged();
      } else {
        trialsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder addAllTrials(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Trial> values) {
      if (trialsBuilder_ == null) {
        ensureTrialsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, trials_);
        onChanged();
      } else {
        trialsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder clearTrials() {
      if (trialsBuilder_ == null) {
        trials_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trialsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public Builder removeTrials(int index) {
      if (trialsBuilder_ == null) {
        ensureTrialsIsMutable();
        trials_.remove(index);
        onChanged();
      } else {
        trialsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder getTrialsBuilder(int index) {
      return getTrialsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TrialOrBuilder getTrialsOrBuilder(int index) {
      if (trialsBuilder_ == null) {
        return trials_.get(index);
      } else {
        return trialsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        getTrialsOrBuilderList() {
      if (trialsBuilder_ != null) {
        return trialsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trials_);
      }
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder addTrialsBuilder() {
      return getTrialsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Trial.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder addTrialsBuilder(int index) {
      return getTrialsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Trial.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Trials associated with the Study.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial trials = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial.Builder>
        getTrialsBuilderList() {
      return getTrialsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Trial,
            com.google.cloud.aiplatform.v1beta1.Trial.Builder,
            com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        getTrialsFieldBuilder() {
      if (trialsBuilder_ == null) {
        trialsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Trial,
                com.google.cloud.aiplatform.v1beta1.Trial.Builder,
                com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>(
                trials_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        trials_ = null;
      }
      return trialsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Pass this token as the `page_token` field of the request for a
     * subsequent call.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
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
     * Pass this token as the `page_token` field of the request for a
     * subsequent call.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
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
     * Pass this token as the `page_token` field of the request for a
     * subsequent call.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
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
     * Pass this token as the `page_token` field of the request for a
     * subsequent call.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
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
     * Pass this token as the `page_token` field of the request for a
     * subsequent call.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListTrialsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListTrialsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListTrialsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListTrialsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTrialsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTrialsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTrialsResponse>() {
        @java.lang.Override
        public ListTrialsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTrialsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTrialsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListTrialsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
