// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

/**
 *
 *
 * <pre>
 * Video annotation response. Included in the `response`
 * field of the `Operation` returned by the `GetOperation`
 * call of the `google::longrunning::Operations` service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse}
 */
public final class AnnotateVideoResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
    AnnotateVideoResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnnotateVideoResponse.newBuilder() to construct.
  private AnnotateVideoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnnotateVideoResponse() {
    annotationResults_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnnotateVideoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnnotateVideoResponse(
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
                annotationResults_ =
                    new java.util.ArrayList<
                        com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>();
                mutable_bitField0_ |= 0x00000001;
              }
              annotationResults_.add(
                  input.readMessage(
                      com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.parser(),
                      extensionRegistry));
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
        annotationResults_ = java.util.Collections.unmodifiableList(annotationResults_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_AnnotateVideoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_AnnotateVideoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse.class,
            com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse.Builder.class);
  }

  public static final int ANNOTATION_RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
      annotationResults_;
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  public java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
      getAnnotationResultsList() {
    return annotationResults_;
  }
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  public java.util.List<
          ? extends com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>
      getAnnotationResultsOrBuilderList() {
    return annotationResults_;
  }
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  public int getAnnotationResultsCount() {
    return annotationResults_.size();
  }
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults getAnnotationResults(
      int index) {
    return annotationResults_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder
      getAnnotationResultsOrBuilder(int index) {
    return annotationResults_.get(index);
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
    for (int i = 0; i < annotationResults_.size(); i++) {
      output.writeMessage(1, annotationResults_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < annotationResults_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, annotationResults_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse other =
        (com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse) obj;

    if (!getAnnotationResultsList().equals(other.getAnnotationResultsList())) return false;
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
    if (getAnnotationResultsCount() > 0) {
      hash = (37 * hash) + ANNOTATION_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parseFrom(
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
      com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse prototype) {
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
   * Video annotation response. Included in the `response`
   * field of the `Operation` returned by the `GetOperation`
   * call of the `google::longrunning::Operations` service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
      com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_AnnotateVideoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_AnnotateVideoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse.class,
              com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAnnotationResultsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (annotationResultsBuilder_ == null) {
        annotationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationResultsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_AnnotateVideoResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse build() {
      com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse result =
          new com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse(this);
      int from_bitField0_ = bitField0_;
      if (annotationResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotationResults_ = java.util.Collections.unmodifiableList(annotationResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotationResults_ = annotationResults_;
      } else {
        result.annotationResults_ = annotationResultsBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse other) {
      if (other
          == com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
              .getDefaultInstance()) return this;
      if (annotationResultsBuilder_ == null) {
        if (!other.annotationResults_.isEmpty()) {
          if (annotationResults_.isEmpty()) {
            annotationResults_ = other.annotationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationResultsIsMutable();
            annotationResults_.addAll(other.annotationResults_);
          }
          onChanged();
        }
      } else {
        if (!other.annotationResults_.isEmpty()) {
          if (annotationResultsBuilder_.isEmpty()) {
            annotationResultsBuilder_.dispose();
            annotationResultsBuilder_ = null;
            annotationResults_ = other.annotationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationResultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnnotationResultsFieldBuilder()
                    : null;
          } else {
            annotationResultsBuilder_.addAllMessages(other.annotationResults_);
          }
        }
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
      com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
        annotationResults_ = java.util.Collections.emptyList();

    private void ensureAnnotationResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotationResults_ =
            new java.util.ArrayList<
                com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>(
                annotationResults_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults,
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder,
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>
        annotationResultsBuilder_;

    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
        getAnnotationResultsList() {
      if (annotationResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotationResults_);
      } else {
        return annotationResultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public int getAnnotationResultsCount() {
      if (annotationResultsBuilder_ == null) {
        return annotationResults_.size();
      } else {
        return annotationResultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults getAnnotationResults(
        int index) {
      if (annotationResultsBuilder_ == null) {
        return annotationResults_.get(index);
      } else {
        return annotationResultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder setAnnotationResults(
        int index, com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults value) {
      if (annotationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationResultsIsMutable();
        annotationResults_.set(index, value);
        onChanged();
      } else {
        annotationResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder setAnnotationResults(
        int index,
        com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
            builderForValue) {
      if (annotationResultsBuilder_ == null) {
        ensureAnnotationResultsIsMutable();
        annotationResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder addAnnotationResults(
        com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults value) {
      if (annotationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationResultsIsMutable();
        annotationResults_.add(value);
        onChanged();
      } else {
        annotationResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder addAnnotationResults(
        int index, com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults value) {
      if (annotationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationResultsIsMutable();
        annotationResults_.add(index, value);
        onChanged();
      } else {
        annotationResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder addAnnotationResults(
        com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
            builderForValue) {
      if (annotationResultsBuilder_ == null) {
        ensureAnnotationResultsIsMutable();
        annotationResults_.add(builderForValue.build());
        onChanged();
      } else {
        annotationResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder addAnnotationResults(
        int index,
        com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
            builderForValue) {
      if (annotationResultsBuilder_ == null) {
        ensureAnnotationResultsIsMutable();
        annotationResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder addAllAnnotationResults(
        java.lang.Iterable<
                ? extends com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
            values) {
      if (annotationResultsBuilder_ == null) {
        ensureAnnotationResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotationResults_);
        onChanged();
      } else {
        annotationResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder clearAnnotationResults() {
      if (annotationResultsBuilder_ == null) {
        annotationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationResultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public Builder removeAnnotationResults(int index) {
      if (annotationResultsBuilder_ == null) {
        ensureAnnotationResultsIsMutable();
        annotationResults_.remove(index);
        onChanged();
      } else {
        annotationResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
        getAnnotationResultsBuilder(int index) {
      return getAnnotationResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder
        getAnnotationResultsOrBuilder(int index) {
      if (annotationResultsBuilder_ == null) {
        return annotationResults_.get(index);
      } else {
        return annotationResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>
        getAnnotationResultsOrBuilderList() {
      if (annotationResultsBuilder_ != null) {
        return annotationResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotationResults_);
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
        addAnnotationResultsBuilder() {
      return getAnnotationResultsFieldBuilder()
          .addBuilder(
              com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder
        addAnnotationResultsBuilder(int index) {
      return getAnnotationResultsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
     * </code>
     */
    public java.util.List<
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder>
        getAnnotationResultsBuilderList() {
      return getAnnotationResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults,
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder,
            com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>
        getAnnotationResultsFieldBuilder() {
      if (annotationResultsBuilder_ == null) {
        annotationResultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults,
                com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults.Builder,
                com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>(
                annotationResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotationResults_ = null;
      }
      return annotationResultsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
  private static final com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotateVideoResponse> PARSER =
      new com.google.protobuf.AbstractParser<AnnotateVideoResponse>() {
        @java.lang.Override
        public AnnotateVideoResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnnotateVideoResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnnotateVideoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotateVideoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
