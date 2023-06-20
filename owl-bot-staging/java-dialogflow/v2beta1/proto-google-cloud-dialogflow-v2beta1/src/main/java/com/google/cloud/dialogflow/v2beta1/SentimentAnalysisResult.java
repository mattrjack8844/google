// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The result of sentiment analysis. Sentiment analysis inspects user input
 * and identifies the prevailing subjective opinion, especially to determine a
 * user's attitude as positive, negative, or neutral.
 * For [Participants.DetectIntent][], it needs to be configured in
 * [DetectIntentRequest.query_params][google.cloud.dialogflow.v2beta1.DetectIntentRequest.query_params].
 * For [Participants.StreamingDetectIntent][], it needs to be configured in
 * [StreamingDetectIntentRequest.query_params][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.query_params].
 * And for
 * [Participants.AnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.AnalyzeContent]
 * and
 * [Participants.StreamingAnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.StreamingAnalyzeContent],
 * it needs to be configured in
 * [ConversationProfile.human_agent_assistant_config][google.cloud.dialogflow.v2beta1.ConversationProfile.human_agent_assistant_config]
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SentimentAnalysisResult}
 */
public final class SentimentAnalysisResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)
    SentimentAnalysisResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentimentAnalysisResult.newBuilder() to construct.
  private SentimentAnalysisResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentimentAnalysisResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SentimentAnalysisResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.SessionProto.internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.SessionProto.internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.class, com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.Builder.class);
  }

  public static final int QUERY_TEXT_SENTIMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.Sentiment queryTextSentiment_;
  /**
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   * @return Whether the queryTextSentiment field is set.
   */
  @java.lang.Override
  public boolean hasQueryTextSentiment() {
    return queryTextSentiment_ != null;
  }
  /**
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   * @return The queryTextSentiment.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Sentiment getQueryTextSentiment() {
    return queryTextSentiment_ == null ? com.google.cloud.dialogflow.v2beta1.Sentiment.getDefaultInstance() : queryTextSentiment_;
  }
  /**
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder getQueryTextSentimentOrBuilder() {
    return queryTextSentiment_ == null ? com.google.cloud.dialogflow.v2beta1.Sentiment.getDefaultInstance() : queryTextSentiment_;
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
    if (queryTextSentiment_ != null) {
      output.writeMessage(1, getQueryTextSentiment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queryTextSentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQueryTextSentiment());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult other = (com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult) obj;

    if (hasQueryTextSentiment() != other.hasQueryTextSentiment()) return false;
    if (hasQueryTextSentiment()) {
      if (!getQueryTextSentiment()
          .equals(other.getQueryTextSentiment())) return false;
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
    if (hasQueryTextSentiment()) {
      hash = (37 * hash) + QUERY_TEXT_SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getQueryTextSentiment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult prototype) {
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
   * The result of sentiment analysis. Sentiment analysis inspects user input
   * and identifies the prevailing subjective opinion, especially to determine a
   * user's attitude as positive, negative, or neutral.
   * For [Participants.DetectIntent][], it needs to be configured in
   * [DetectIntentRequest.query_params][google.cloud.dialogflow.v2beta1.DetectIntentRequest.query_params].
   * For [Participants.StreamingDetectIntent][], it needs to be configured in
   * [StreamingDetectIntentRequest.query_params][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.query_params].
   * And for
   * [Participants.AnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.AnalyzeContent]
   * and
   * [Participants.StreamingAnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.StreamingAnalyzeContent],
   * it needs to be configured in
   * [ConversationProfile.human_agent_assistant_config][google.cloud.dialogflow.v2beta1.ConversationProfile.human_agent_assistant_config]
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SentimentAnalysisResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)
      com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.SessionProto.internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.SessionProto.internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.class, com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.newBuilder()
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
      queryTextSentiment_ = null;
      if (queryTextSentimentBuilder_ != null) {
        queryTextSentimentBuilder_.dispose();
        queryTextSentimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.SessionProto.internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult build() {
      com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult result = new com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queryTextSentiment_ = queryTextSentimentBuilder_ == null
            ? queryTextSentiment_
            : queryTextSentimentBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.getDefaultInstance()) return this;
      if (other.hasQueryTextSentiment()) {
        mergeQueryTextSentiment(other.getQueryTextSentiment());
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
              input.readMessage(
                  getQueryTextSentimentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.dialogflow.v2beta1.Sentiment queryTextSentiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Sentiment, com.google.cloud.dialogflow.v2beta1.Sentiment.Builder, com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder> queryTextSentimentBuilder_;
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     * @return Whether the queryTextSentiment field is set.
     */
    public boolean hasQueryTextSentiment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     * @return The queryTextSentiment.
     */
    public com.google.cloud.dialogflow.v2beta1.Sentiment getQueryTextSentiment() {
      if (queryTextSentimentBuilder_ == null) {
        return queryTextSentiment_ == null ? com.google.cloud.dialogflow.v2beta1.Sentiment.getDefaultInstance() : queryTextSentiment_;
      } else {
        return queryTextSentimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder setQueryTextSentiment(com.google.cloud.dialogflow.v2beta1.Sentiment value) {
      if (queryTextSentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryTextSentiment_ = value;
      } else {
        queryTextSentimentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder setQueryTextSentiment(
        com.google.cloud.dialogflow.v2beta1.Sentiment.Builder builderForValue) {
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentiment_ = builderForValue.build();
      } else {
        queryTextSentimentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder mergeQueryTextSentiment(com.google.cloud.dialogflow.v2beta1.Sentiment value) {
      if (queryTextSentimentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          queryTextSentiment_ != null &&
          queryTextSentiment_ != com.google.cloud.dialogflow.v2beta1.Sentiment.getDefaultInstance()) {
          getQueryTextSentimentBuilder().mergeFrom(value);
        } else {
          queryTextSentiment_ = value;
        }
      } else {
        queryTextSentimentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder clearQueryTextSentiment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      queryTextSentiment_ = null;
      if (queryTextSentimentBuilder_ != null) {
        queryTextSentimentBuilder_.dispose();
        queryTextSentimentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Sentiment.Builder getQueryTextSentimentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueryTextSentimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder getQueryTextSentimentOrBuilder() {
      if (queryTextSentimentBuilder_ != null) {
        return queryTextSentimentBuilder_.getMessageOrBuilder();
      } else {
        return queryTextSentiment_ == null ?
            com.google.cloud.dialogflow.v2beta1.Sentiment.getDefaultInstance() : queryTextSentiment_;
      }
    }
    /**
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Sentiment, com.google.cloud.dialogflow.v2beta1.Sentiment.Builder, com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder> 
        getQueryTextSentimentFieldBuilder() {
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Sentiment, com.google.cloud.dialogflow.v2beta1.Sentiment.Builder, com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder>(
                getQueryTextSentiment(),
                getParentForChildren(),
                isClean());
        queryTextSentiment_ = null;
      }
      return queryTextSentimentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)
  private static final com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult();
  }

  public static com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentimentAnalysisResult>
      PARSER = new com.google.protobuf.AbstractParser<SentimentAnalysisResult>() {
    @java.lang.Override
    public SentimentAnalysisResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<SentimentAnalysisResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentimentAnalysisResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

