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
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

/**
 *
 *
 * <pre>
 * The response message for language detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.DetectLanguageResponse}
 */
public final class DetectLanguageResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.DetectLanguageResponse)
    DetectLanguageResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DetectLanguageResponse.newBuilder() to construct.
  private DetectLanguageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DetectLanguageResponse() {
    languages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DetectLanguageResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_DetectLanguageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_DetectLanguageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.DetectLanguageResponse.class,
            com.google.cloud.translate.v3beta1.DetectLanguageResponse.Builder.class);
  }

  public static final int LANGUAGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.translate.v3beta1.DetectedLanguage> languages_;
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.translate.v3beta1.DetectedLanguage> getLanguagesList() {
    return languages_;
  }
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder>
      getLanguagesOrBuilderList() {
    return languages_;
  }
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
   */
  @java.lang.Override
  public int getLanguagesCount() {
    return languages_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3beta1.DetectedLanguage getLanguages(int index) {
    return languages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder getLanguagesOrBuilder(
      int index) {
    return languages_.get(index);
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
    for (int i = 0; i < languages_.size(); i++) {
      output.writeMessage(1, languages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < languages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, languages_.get(i));
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.DetectLanguageResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.DetectLanguageResponse other =
        (com.google.cloud.translate.v3beta1.DetectLanguageResponse) obj;

    if (!getLanguagesList().equals(other.getLanguagesList())) return false;
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
    if (getLanguagesCount() > 0) {
      hash = (37 * hash) + LANGUAGES_FIELD_NUMBER;
      hash = (53 * hash) + getLanguagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse parseFrom(
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
      com.google.cloud.translate.v3beta1.DetectLanguageResponse prototype) {
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
   * The response message for language detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.DetectLanguageResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.DetectLanguageResponse)
      com.google.cloud.translate.v3beta1.DetectLanguageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_DetectLanguageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_DetectLanguageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.DetectLanguageResponse.class,
              com.google.cloud.translate.v3beta1.DetectLanguageResponse.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.DetectLanguageResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (languagesBuilder_ == null) {
        languages_ = java.util.Collections.emptyList();
      } else {
        languages_ = null;
        languagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_DetectLanguageResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DetectLanguageResponse getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.DetectLanguageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DetectLanguageResponse build() {
      com.google.cloud.translate.v3beta1.DetectLanguageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DetectLanguageResponse buildPartial() {
      com.google.cloud.translate.v3beta1.DetectLanguageResponse result =
          new com.google.cloud.translate.v3beta1.DetectLanguageResponse(this);
      int from_bitField0_ = bitField0_;
      if (languagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          languages_ = java.util.Collections.unmodifiableList(languages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.languages_ = languages_;
      } else {
        result.languages_ = languagesBuilder_.build();
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
      if (other instanceof com.google.cloud.translate.v3beta1.DetectLanguageResponse) {
        return mergeFrom((com.google.cloud.translate.v3beta1.DetectLanguageResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.DetectLanguageResponse other) {
      if (other == com.google.cloud.translate.v3beta1.DetectLanguageResponse.getDefaultInstance())
        return this;
      if (languagesBuilder_ == null) {
        if (!other.languages_.isEmpty()) {
          if (languages_.isEmpty()) {
            languages_ = other.languages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLanguagesIsMutable();
            languages_.addAll(other.languages_);
          }
          onChanged();
        }
      } else {
        if (!other.languages_.isEmpty()) {
          if (languagesBuilder_.isEmpty()) {
            languagesBuilder_.dispose();
            languagesBuilder_ = null;
            languages_ = other.languages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            languagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLanguagesFieldBuilder()
                    : null;
          } else {
            languagesBuilder_.addAllMessages(other.languages_);
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
                com.google.cloud.translate.v3beta1.DetectedLanguage m =
                    input.readMessage(
                        com.google.cloud.translate.v3beta1.DetectedLanguage.parser(),
                        extensionRegistry);
                if (languagesBuilder_ == null) {
                  ensureLanguagesIsMutable();
                  languages_.add(m);
                } else {
                  languagesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.translate.v3beta1.DetectedLanguage> languages_ =
        java.util.Collections.emptyList();

    private void ensureLanguagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languages_ =
            new java.util.ArrayList<com.google.cloud.translate.v3beta1.DetectedLanguage>(
                languages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.translate.v3beta1.DetectedLanguage,
            com.google.cloud.translate.v3beta1.DetectedLanguage.Builder,
            com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder>
        languagesBuilder_;

    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public java.util.List<com.google.cloud.translate.v3beta1.DetectedLanguage> getLanguagesList() {
      if (languagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(languages_);
      } else {
        return languagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public int getLanguagesCount() {
      if (languagesBuilder_ == null) {
        return languages_.size();
      } else {
        return languagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public com.google.cloud.translate.v3beta1.DetectedLanguage getLanguages(int index) {
      if (languagesBuilder_ == null) {
        return languages_.get(index);
      } else {
        return languagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder setLanguages(
        int index, com.google.cloud.translate.v3beta1.DetectedLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.set(index, value);
        onChanged();
      } else {
        languagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder setLanguages(
        int index, com.google.cloud.translate.v3beta1.DetectedLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.set(index, builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder addLanguages(com.google.cloud.translate.v3beta1.DetectedLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.add(value);
        onChanged();
      } else {
        languagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder addLanguages(
        int index, com.google.cloud.translate.v3beta1.DetectedLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.add(index, value);
        onChanged();
      } else {
        languagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder addLanguages(
        com.google.cloud.translate.v3beta1.DetectedLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.add(builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder addLanguages(
        int index, com.google.cloud.translate.v3beta1.DetectedLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.add(index, builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder addAllLanguages(
        java.lang.Iterable<? extends com.google.cloud.translate.v3beta1.DetectedLanguage> values) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, languages_);
        onChanged();
      } else {
        languagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder clearLanguages() {
      if (languagesBuilder_ == null) {
        languages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        languagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public Builder removeLanguages(int index) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.remove(index);
        onChanged();
      } else {
        languagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public com.google.cloud.translate.v3beta1.DetectedLanguage.Builder getLanguagesBuilder(
        int index) {
      return getLanguagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder getLanguagesOrBuilder(
        int index) {
      if (languagesBuilder_ == null) {
        return languages_.get(index);
      } else {
        return languagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder>
        getLanguagesOrBuilderList() {
      if (languagesBuilder_ != null) {
        return languagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(languages_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public com.google.cloud.translate.v3beta1.DetectedLanguage.Builder addLanguagesBuilder() {
      return getLanguagesFieldBuilder()
          .addBuilder(com.google.cloud.translate.v3beta1.DetectedLanguage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public com.google.cloud.translate.v3beta1.DetectedLanguage.Builder addLanguagesBuilder(
        int index) {
      return getLanguagesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.translate.v3beta1.DetectedLanguage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of detected languages sorted by detection confidence in descending
     * order. The most probable language first.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3beta1.DetectedLanguage languages = 1;</code>
     */
    public java.util.List<com.google.cloud.translate.v3beta1.DetectedLanguage.Builder>
        getLanguagesBuilderList() {
      return getLanguagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.translate.v3beta1.DetectedLanguage,
            com.google.cloud.translate.v3beta1.DetectedLanguage.Builder,
            com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder>
        getLanguagesFieldBuilder() {
      if (languagesBuilder_ == null) {
        languagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.translate.v3beta1.DetectedLanguage,
                com.google.cloud.translate.v3beta1.DetectedLanguage.Builder,
                com.google.cloud.translate.v3beta1.DetectedLanguageOrBuilder>(
                languages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        languages_ = null;
      }
      return languagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.DetectLanguageResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.DetectLanguageResponse)
  private static final com.google.cloud.translate.v3beta1.DetectLanguageResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.DetectLanguageResponse();
  }

  public static com.google.cloud.translate.v3beta1.DetectLanguageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetectLanguageResponse> PARSER =
      new com.google.protobuf.AbstractParser<DetectLanguageResponse>() {
        @java.lang.Override
        public DetectLanguageResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DetectLanguageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetectLanguageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.DetectLanguageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
