// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3;

/**
 * <pre>
 * An AdaptiveMtTranslate response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.AdaptiveMtTranslateResponse}
 */
public final class AdaptiveMtTranslateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.AdaptiveMtTranslateResponse)
    AdaptiveMtTranslateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdaptiveMtTranslateResponse.newBuilder() to construct.
  private AdaptiveMtTranslateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdaptiveMtTranslateResponse() {
    translations_ = java.util.Collections.emptyList();
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdaptiveMtTranslateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.class, com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.Builder.class);
  }

  public static final int TRANSLATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation> translations_;
  /**
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation> getTranslationsList() {
    return translations_;
  }
  /**
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder> 
      getTranslationsOrBuilderList() {
    return translations_;
  }
  /**
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public int getTranslationsCount() {
    return translations_.size();
  }
  /**
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.AdaptiveMtTranslation getTranslations(int index) {
    return translations_.get(index);
  }
  /**
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder getTranslationsOrBuilder(
      int index) {
    return translations_.get(index);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   * <pre>
   * Output only. The translation's language code.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The translation's language code.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < translations_.size(); i++) {
      output.writeMessage(1, translations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < translations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, translations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, languageCode_);
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
    if (!(obj instanceof com.google.cloud.translate.v3.AdaptiveMtTranslateResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.AdaptiveMtTranslateResponse other = (com.google.cloud.translate.v3.AdaptiveMtTranslateResponse) obj;

    if (!getTranslationsList()
        .equals(other.getTranslationsList())) return false;
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
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
    if (getTranslationsCount() > 0) {
      hash = (37 * hash) + TRANSLATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTranslationsList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3.AdaptiveMtTranslateResponse prototype) {
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
   * An AdaptiveMtTranslate response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.AdaptiveMtTranslateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.AdaptiveMtTranslateResponse)
      com.google.cloud.translate.v3.AdaptiveMtTranslateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.class, com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.newBuilder()
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
      if (translationsBuilder_ == null) {
        translations_ = java.util.Collections.emptyList();
      } else {
        translations_ = null;
        translationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3.AdaptiveMtProto.internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.AdaptiveMtTranslateResponse getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.AdaptiveMtTranslateResponse build() {
      com.google.cloud.translate.v3.AdaptiveMtTranslateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.AdaptiveMtTranslateResponse buildPartial() {
      com.google.cloud.translate.v3.AdaptiveMtTranslateResponse result = new com.google.cloud.translate.v3.AdaptiveMtTranslateResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.translate.v3.AdaptiveMtTranslateResponse result) {
      if (translationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          translations_ = java.util.Collections.unmodifiableList(translations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.translations_ = translations_;
      } else {
        result.translations_ = translationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.translate.v3.AdaptiveMtTranslateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.translate.v3.AdaptiveMtTranslateResponse) {
        return mergeFrom((com.google.cloud.translate.v3.AdaptiveMtTranslateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.AdaptiveMtTranslateResponse other) {
      if (other == com.google.cloud.translate.v3.AdaptiveMtTranslateResponse.getDefaultInstance()) return this;
      if (translationsBuilder_ == null) {
        if (!other.translations_.isEmpty()) {
          if (translations_.isEmpty()) {
            translations_ = other.translations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTranslationsIsMutable();
            translations_.addAll(other.translations_);
          }
          onChanged();
        }
      } else {
        if (!other.translations_.isEmpty()) {
          if (translationsBuilder_.isEmpty()) {
            translationsBuilder_.dispose();
            translationsBuilder_ = null;
            translations_ = other.translations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            translationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTranslationsFieldBuilder() : null;
          } else {
            translationsBuilder_.addAllMessages(other.translations_);
          }
        }
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              com.google.cloud.translate.v3.AdaptiveMtTranslation m =
                  input.readMessage(
                      com.google.cloud.translate.v3.AdaptiveMtTranslation.parser(),
                      extensionRegistry);
              if (translationsBuilder_ == null) {
                ensureTranslationsIsMutable();
                translations_.add(m);
              } else {
                translationsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              languageCode_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation> translations_ =
      java.util.Collections.emptyList();
    private void ensureTranslationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        translations_ = new java.util.ArrayList<com.google.cloud.translate.v3.AdaptiveMtTranslation>(translations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.translate.v3.AdaptiveMtTranslation, com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder, com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder> translationsBuilder_;

    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation> getTranslationsList() {
      if (translationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(translations_);
      } else {
        return translationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public int getTranslationsCount() {
      if (translationsBuilder_ == null) {
        return translations_.size();
      } else {
        return translationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtTranslation getTranslations(int index) {
      if (translationsBuilder_ == null) {
        return translations_.get(index);
      } else {
        return translationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setTranslations(
        int index, com.google.cloud.translate.v3.AdaptiveMtTranslation value) {
      if (translationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTranslationsIsMutable();
        translations_.set(index, value);
        onChanged();
      } else {
        translationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setTranslations(
        int index, com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder builderForValue) {
      if (translationsBuilder_ == null) {
        ensureTranslationsIsMutable();
        translations_.set(index, builderForValue.build());
        onChanged();
      } else {
        translationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTranslations(com.google.cloud.translate.v3.AdaptiveMtTranslation value) {
      if (translationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTranslationsIsMutable();
        translations_.add(value);
        onChanged();
      } else {
        translationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTranslations(
        int index, com.google.cloud.translate.v3.AdaptiveMtTranslation value) {
      if (translationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTranslationsIsMutable();
        translations_.add(index, value);
        onChanged();
      } else {
        translationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTranslations(
        com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder builderForValue) {
      if (translationsBuilder_ == null) {
        ensureTranslationsIsMutable();
        translations_.add(builderForValue.build());
        onChanged();
      } else {
        translationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTranslations(
        int index, com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder builderForValue) {
      if (translationsBuilder_ == null) {
        ensureTranslationsIsMutable();
        translations_.add(index, builderForValue.build());
        onChanged();
      } else {
        translationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addAllTranslations(
        java.lang.Iterable<? extends com.google.cloud.translate.v3.AdaptiveMtTranslation> values) {
      if (translationsBuilder_ == null) {
        ensureTranslationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, translations_);
        onChanged();
      } else {
        translationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearTranslations() {
      if (translationsBuilder_ == null) {
        translations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        translationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeTranslations(int index) {
      if (translationsBuilder_ == null) {
        ensureTranslationsIsMutable();
        translations_.remove(index);
        onChanged();
      } else {
        translationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder getTranslationsBuilder(
        int index) {
      return getTranslationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder getTranslationsOrBuilder(
        int index) {
      if (translationsBuilder_ == null) {
        return translations_.get(index);  } else {
        return translationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<? extends com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder> 
         getTranslationsOrBuilderList() {
      if (translationsBuilder_ != null) {
        return translationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(translations_);
      }
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder addTranslationsBuilder() {
      return getTranslationsFieldBuilder().addBuilder(
          com.google.cloud.translate.v3.AdaptiveMtTranslation.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder addTranslationsBuilder(
        int index) {
      return getTranslationsFieldBuilder().addBuilder(
          index, com.google.cloud.translate.v3.AdaptiveMtTranslation.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The translation.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder> 
         getTranslationsBuilderList() {
      return getTranslationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.translate.v3.AdaptiveMtTranslation, com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder, com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder> 
        getTranslationsFieldBuilder() {
      if (translationsBuilder_ == null) {
        translationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.translate.v3.AdaptiveMtTranslation, com.google.cloud.translate.v3.AdaptiveMtTranslation.Builder, com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder>(
                translations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        translations_ = null;
      }
      return translationsBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * Output only. The translation's language code.
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The translation's language code.
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The translation's language code.
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The translation's language code.
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The translation's language code.
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.AdaptiveMtTranslateResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.AdaptiveMtTranslateResponse)
  private static final com.google.cloud.translate.v3.AdaptiveMtTranslateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.AdaptiveMtTranslateResponse();
  }

  public static com.google.cloud.translate.v3.AdaptiveMtTranslateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdaptiveMtTranslateResponse>
      PARSER = new com.google.protobuf.AbstractParser<AdaptiveMtTranslateResponse>() {
    @java.lang.Override
    public AdaptiveMtTranslateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdaptiveMtTranslateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdaptiveMtTranslateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.AdaptiveMtTranslateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

