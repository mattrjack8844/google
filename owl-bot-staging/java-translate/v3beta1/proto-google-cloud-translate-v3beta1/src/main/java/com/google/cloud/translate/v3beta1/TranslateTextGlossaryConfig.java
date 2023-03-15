// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

/**
 * <pre>
 * Configures which glossary should be used for a specific target language,
 * and defines options for applying that glossary.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.TranslateTextGlossaryConfig}
 */
public final class TranslateTextGlossaryConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.TranslateTextGlossaryConfig)
    TranslateTextGlossaryConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TranslateTextGlossaryConfig.newBuilder() to construct.
  private TranslateTextGlossaryConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TranslateTextGlossaryConfig() {
    glossary_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TranslateTextGlossaryConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_TranslateTextGlossaryConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_TranslateTextGlossaryConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.class, com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder.class);
  }

  public static final int GLOSSARY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object glossary_ = "";
  /**
   * <pre>
   * Required. Specifies the glossary used for this translation. Use
   * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The glossary.
   */
  @java.lang.Override
  public java.lang.String getGlossary() {
    java.lang.Object ref = glossary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      glossary_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Specifies the glossary used for this translation. Use
   * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for glossary.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGlossaryBytes() {
    java.lang.Object ref = glossary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      glossary_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IGNORE_CASE_FIELD_NUMBER = 2;
  private boolean ignoreCase_ = false;
  /**
   * <pre>
   * Optional. Indicates match is case-insensitive.
   * Default value is false if missing.
   * </pre>
   *
   * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ignoreCase.
   */
  @java.lang.Override
  public boolean getIgnoreCase() {
    return ignoreCase_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(glossary_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, glossary_);
    }
    if (ignoreCase_ != false) {
      output.writeBool(2, ignoreCase_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(glossary_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, glossary_);
    }
    if (ignoreCase_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ignoreCase_);
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig other = (com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig) obj;

    if (!getGlossary()
        .equals(other.getGlossary())) return false;
    if (getIgnoreCase()
        != other.getIgnoreCase()) return false;
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
    hash = (37 * hash) + GLOSSARY_FIELD_NUMBER;
    hash = (53 * hash) + getGlossary().hashCode();
    hash = (37 * hash) + IGNORE_CASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreCase());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig prototype) {
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
   * Configures which glossary should be used for a specific target language,
   * and defines options for applying that glossary.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.TranslateTextGlossaryConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.TranslateTextGlossaryConfig)
      com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_TranslateTextGlossaryConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_TranslateTextGlossaryConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.class, com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.newBuilder()
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
      glossary_ = "";
      ignoreCase_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_TranslateTextGlossaryConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig build() {
      com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig buildPartial() {
      com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig result = new com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.glossary_ = glossary_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ignoreCase_ = ignoreCase_;
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
      if (other instanceof com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig) {
        return mergeFrom((com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig other) {
      if (other == com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.getDefaultInstance()) return this;
      if (!other.getGlossary().isEmpty()) {
        glossary_ = other.glossary_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getIgnoreCase() != false) {
        setIgnoreCase(other.getIgnoreCase());
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
              glossary_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              ignoreCase_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object glossary_ = "";
    /**
     * <pre>
     * Required. Specifies the glossary used for this translation. Use
     * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
     * </pre>
     *
     * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The glossary.
     */
    public java.lang.String getGlossary() {
      java.lang.Object ref = glossary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        glossary_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Specifies the glossary used for this translation. Use
     * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
     * </pre>
     *
     * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for glossary.
     */
    public com.google.protobuf.ByteString
        getGlossaryBytes() {
      java.lang.Object ref = glossary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        glossary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Specifies the glossary used for this translation. Use
     * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
     * </pre>
     *
     * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The glossary to set.
     * @return This builder for chaining.
     */
    public Builder setGlossary(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      glossary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the glossary used for this translation. Use
     * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
     * </pre>
     *
     * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearGlossary() {
      glossary_ = getDefaultInstance().getGlossary();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the glossary used for this translation. Use
     * this format: projects/&#42;&#47;locations/&#42;&#47;glossaries/&#42;
     * </pre>
     *
     * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for glossary to set.
     * @return This builder for chaining.
     */
    public Builder setGlossaryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      glossary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean ignoreCase_ ;
    /**
     * <pre>
     * Optional. Indicates match is case-insensitive.
     * Default value is false if missing.
     * </pre>
     *
     * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The ignoreCase.
     */
    @java.lang.Override
    public boolean getIgnoreCase() {
      return ignoreCase_;
    }
    /**
     * <pre>
     * Optional. Indicates match is case-insensitive.
     * Default value is false if missing.
     * </pre>
     *
     * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The ignoreCase to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreCase(boolean value) {
      
      ignoreCase_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Indicates match is case-insensitive.
     * Default value is false if missing.
     * </pre>
     *
     * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreCase() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ignoreCase_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.TranslateTextGlossaryConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.TranslateTextGlossaryConfig)
  private static final com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig();
  }

  public static com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslateTextGlossaryConfig>
      PARSER = new com.google.protobuf.AbstractParser<TranslateTextGlossaryConfig>() {
    @java.lang.Override
    public TranslateTextGlossaryConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TranslateTextGlossaryConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslateTextGlossaryConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

