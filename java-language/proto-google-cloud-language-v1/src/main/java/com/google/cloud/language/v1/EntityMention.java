// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 * <pre>
 * Represents a mention for an entity in the text. Currently, proper noun
 * mentions are supported.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.EntityMention}
 */
public  final class EntityMention extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.EntityMention)
    EntityMentionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityMention.newBuilder() to construct.
  private EntityMention(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityMention() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityMention(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.language.v1.TextSpan.Builder subBuilder = null;
            if (text_ != null) {
              subBuilder = text_.toBuilder();
            }
            text_ = input.readMessage(com.google.cloud.language.v1.TextSpan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(text_);
              text_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            com.google.cloud.language.v1.Sentiment.Builder subBuilder = null;
            if (sentiment_ != null) {
              subBuilder = sentiment_.toBuilder();
            }
            sentiment_ = input.readMessage(com.google.cloud.language.v1.Sentiment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sentiment_);
              sentiment_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_EntityMention_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_EntityMention_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.EntityMention.class, com.google.cloud.language.v1.EntityMention.Builder.class);
  }

  /**
   * <pre>
   * The supported types of mentions.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.language.v1.EntityMention.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>TYPE_UNKNOWN = 0;</code>
     */
    TYPE_UNKNOWN(0),
    /**
     * <pre>
     * Proper name
     * </pre>
     *
     * <code>PROPER = 1;</code>
     */
    PROPER(1),
    /**
     * <pre>
     * Common noun (or noun compound)
     * </pre>
     *
     * <code>COMMON = 2;</code>
     */
    COMMON(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>TYPE_UNKNOWN = 0;</code>
     */
    public static final int TYPE_UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * Proper name
     * </pre>
     *
     * <code>PROPER = 1;</code>
     */
    public static final int PROPER_VALUE = 1;
    /**
     * <pre>
     * Common noun (or noun compound)
     * </pre>
     *
     * <code>COMMON = 2;</code>
     */
    public static final int COMMON_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TYPE_UNKNOWN;
        case 1: return PROPER;
        case 2: return COMMON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.language.v1.EntityMention.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.language.v1.EntityMention.Type)
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1.TextSpan text_;
  /**
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1.TextSpan getText() {
    return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
   */
  public com.google.cloud.language.v1.EntityMention.Type getType() {
    com.google.cloud.language.v1.EntityMention.Type result = com.google.cloud.language.v1.EntityMention.Type.valueOf(type_);
    return result == null ? com.google.cloud.language.v1.EntityMention.Type.UNRECOGNIZED : result;
  }

  public static final int SENTIMENT_FIELD_NUMBER = 3;
  private com.google.cloud.language.v1.Sentiment sentiment_;
  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  public boolean hasSentiment() {
    return sentiment_ != null;
  }
  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  public com.google.cloud.language.v1.Sentiment getSentiment() {
    return sentiment_ == null ? com.google.cloud.language.v1.Sentiment.getDefaultInstance() : sentiment_;
  }
  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  public com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder() {
    return getSentiment();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (type_ != com.google.cloud.language.v1.EntityMention.Type.TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (sentiment_ != null) {
      output.writeMessage(3, getSentiment());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getText());
    }
    if (type_ != com.google.cloud.language.v1.EntityMention.Type.TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (sentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSentiment());
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
    if (!(obj instanceof com.google.cloud.language.v1.EntityMention)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.EntityMention other = (com.google.cloud.language.v1.EntityMention) obj;

    boolean result = true;
    result = result && (hasText() == other.hasText());
    if (hasText()) {
      result = result && getText()
          .equals(other.getText());
    }
    result = result && type_ == other.type_;
    result = result && (hasSentiment() == other.hasSentiment());
    if (hasSentiment()) {
      result = result && getSentiment()
          .equals(other.getSentiment());
    }
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasSentiment()) {
      hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSentiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.EntityMention parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.EntityMention parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.EntityMention parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.EntityMention parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.language.v1.EntityMention prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Represents a mention for an entity in the text. Currently, proper noun
   * mentions are supported.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.EntityMention}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.EntityMention)
      com.google.cloud.language.v1.EntityMentionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_EntityMention_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_EntityMention_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.EntityMention.class, com.google.cloud.language.v1.EntityMention.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.EntityMention.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      type_ = 0;

      if (sentimentBuilder_ == null) {
        sentiment_ = null;
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_EntityMention_descriptor;
    }

    public com.google.cloud.language.v1.EntityMention getDefaultInstanceForType() {
      return com.google.cloud.language.v1.EntityMention.getDefaultInstance();
    }

    public com.google.cloud.language.v1.EntityMention build() {
      com.google.cloud.language.v1.EntityMention result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1.EntityMention buildPartial() {
      com.google.cloud.language.v1.EntityMention result = new com.google.cloud.language.v1.EntityMention(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      result.type_ = type_;
      if (sentimentBuilder_ == null) {
        result.sentiment_ = sentiment_;
      } else {
        result.sentiment_ = sentimentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.language.v1.EntityMention) {
        return mergeFrom((com.google.cloud.language.v1.EntityMention)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.EntityMention other) {
      if (other == com.google.cloud.language.v1.EntityMention.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasSentiment()) {
        mergeSentiment(other.getSentiment());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.language.v1.EntityMention parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1.EntityMention) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1.TextSpan text_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder> textBuilder_;
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpan getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(
        com.google.cloud.language.v1.TextSpan.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder mergeText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
            com.google.cloud.language.v1.TextSpan.newBuilder(text_).mergeFrom(value).buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpan.Builder getTextBuilder() {
      
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * The mention text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
     */
    public com.google.cloud.language.v1.EntityMention.Type getType() {
      com.google.cloud.language.v1.EntityMention.Type result = com.google.cloud.language.v1.EntityMention.Type.valueOf(type_);
      return result == null ? com.google.cloud.language.v1.EntityMention.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
     */
    public Builder setType(com.google.cloud.language.v1.EntityMention.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.language.v1.Sentiment sentiment_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.Sentiment, com.google.cloud.language.v1.Sentiment.Builder, com.google.cloud.language.v1.SentimentOrBuilder> sentimentBuilder_;
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public boolean hasSentiment() {
      return sentimentBuilder_ != null || sentiment_ != null;
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public com.google.cloud.language.v1.Sentiment getSentiment() {
      if (sentimentBuilder_ == null) {
        return sentiment_ == null ? com.google.cloud.language.v1.Sentiment.getDefaultInstance() : sentiment_;
      } else {
        return sentimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public Builder setSentiment(com.google.cloud.language.v1.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentiment_ = value;
        onChanged();
      } else {
        sentimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public Builder setSentiment(
        com.google.cloud.language.v1.Sentiment.Builder builderForValue) {
      if (sentimentBuilder_ == null) {
        sentiment_ = builderForValue.build();
        onChanged();
      } else {
        sentimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public Builder mergeSentiment(com.google.cloud.language.v1.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (sentiment_ != null) {
          sentiment_ =
            com.google.cloud.language.v1.Sentiment.newBuilder(sentiment_).mergeFrom(value).buildPartial();
        } else {
          sentiment_ = value;
        }
        onChanged();
      } else {
        sentimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public Builder clearSentiment() {
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
        onChanged();
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public com.google.cloud.language.v1.Sentiment.Builder getSentimentBuilder() {
      
      onChanged();
      return getSentimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    public com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder() {
      if (sentimentBuilder_ != null) {
        return sentimentBuilder_.getMessageOrBuilder();
      } else {
        return sentiment_ == null ?
            com.google.cloud.language.v1.Sentiment.getDefaultInstance() : sentiment_;
      }
    }
    /**
     * <pre>
     * For calls to [AnalyzeEntitySentiment][] or if
     * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
     * true, this field will contain the sentiment expressed for this mention of
     * the entity in the provided document.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.Sentiment, com.google.cloud.language.v1.Sentiment.Builder, com.google.cloud.language.v1.SentimentOrBuilder> 
        getSentimentFieldBuilder() {
      if (sentimentBuilder_ == null) {
        sentimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.Sentiment, com.google.cloud.language.v1.Sentiment.Builder, com.google.cloud.language.v1.SentimentOrBuilder>(
                getSentiment(),
                getParentForChildren(),
                isClean());
        sentiment_ = null;
      }
      return sentimentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.EntityMention)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.EntityMention)
  private static final com.google.cloud.language.v1.EntityMention DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.EntityMention();
  }

  public static com.google.cloud.language.v1.EntityMention getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityMention>
      PARSER = new com.google.protobuf.AbstractParser<EntityMention>() {
    public EntityMention parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityMention(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityMention> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityMention> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1.EntityMention getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

