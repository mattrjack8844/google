// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * Response message for Bigtable.CheckAndMutateRow.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.CheckAndMutateRowResponse}
 */
public final class CheckAndMutateRowResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.CheckAndMutateRowResponse)
    CheckAndMutateRowResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CheckAndMutateRowResponse.newBuilder() to construct.
  private CheckAndMutateRowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CheckAndMutateRowResponse() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CheckAndMutateRowResponse(
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
          case 8:
            {
              predicateMatched_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_CheckAndMutateRowResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_CheckAndMutateRowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.CheckAndMutateRowResponse.class,
            com.google.bigtable.v2.CheckAndMutateRowResponse.Builder.class);
  }

  public static final int PREDICATE_MATCHED_FIELD_NUMBER = 1;
  private boolean predicateMatched_;
  /**
   *
   *
   * <pre>
   * Whether or not the request's `predicate_filter` yielded any results for
   * the specified row.
   * </pre>
   *
   * <code>bool predicate_matched = 1;</code>
   */
  public boolean getPredicateMatched() {
    return predicateMatched_;
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
    if (predicateMatched_ != false) {
      output.writeBool(1, predicateMatched_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (predicateMatched_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, predicateMatched_);
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
    if (!(obj instanceof com.google.bigtable.v2.CheckAndMutateRowResponse)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.CheckAndMutateRowResponse other =
        (com.google.bigtable.v2.CheckAndMutateRowResponse) obj;

    if (getPredicateMatched() != other.getPredicateMatched()) return false;
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
    hash = (37 * hash) + PREDICATE_MATCHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPredicateMatched());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse parseFrom(
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

  public static Builder newBuilder(com.google.bigtable.v2.CheckAndMutateRowResponse prototype) {
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
   * Response message for Bigtable.CheckAndMutateRow.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.CheckAndMutateRowResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.CheckAndMutateRowResponse)
      com.google.bigtable.v2.CheckAndMutateRowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_CheckAndMutateRowResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_CheckAndMutateRowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.CheckAndMutateRowResponse.class,
              com.google.bigtable.v2.CheckAndMutateRowResponse.Builder.class);
    }

    // Construct using com.google.bigtable.v2.CheckAndMutateRowResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      predicateMatched_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_CheckAndMutateRowResponse_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.CheckAndMutateRowResponse getDefaultInstanceForType() {
      return com.google.bigtable.v2.CheckAndMutateRowResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.CheckAndMutateRowResponse build() {
      com.google.bigtable.v2.CheckAndMutateRowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.CheckAndMutateRowResponse buildPartial() {
      com.google.bigtable.v2.CheckAndMutateRowResponse result =
          new com.google.bigtable.v2.CheckAndMutateRowResponse(this);
      result.predicateMatched_ = predicateMatched_;
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
      if (other instanceof com.google.bigtable.v2.CheckAndMutateRowResponse) {
        return mergeFrom((com.google.bigtable.v2.CheckAndMutateRowResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.CheckAndMutateRowResponse other) {
      if (other == com.google.bigtable.v2.CheckAndMutateRowResponse.getDefaultInstance())
        return this;
      if (other.getPredicateMatched() != false) {
        setPredicateMatched(other.getPredicateMatched());
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
      com.google.bigtable.v2.CheckAndMutateRowResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.CheckAndMutateRowResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean predicateMatched_;
    /**
     *
     *
     * <pre>
     * Whether or not the request's `predicate_filter` yielded any results for
     * the specified row.
     * </pre>
     *
     * <code>bool predicate_matched = 1;</code>
     */
    public boolean getPredicateMatched() {
      return predicateMatched_;
    }
    /**
     *
     *
     * <pre>
     * Whether or not the request's `predicate_filter` yielded any results for
     * the specified row.
     * </pre>
     *
     * <code>bool predicate_matched = 1;</code>
     */
    public Builder setPredicateMatched(boolean value) {

      predicateMatched_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether or not the request's `predicate_filter` yielded any results for
     * the specified row.
     * </pre>
     *
     * <code>bool predicate_matched = 1;</code>
     */
    public Builder clearPredicateMatched() {

      predicateMatched_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.CheckAndMutateRowResponse)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.CheckAndMutateRowResponse)
  private static final com.google.bigtable.v2.CheckAndMutateRowResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.CheckAndMutateRowResponse();
  }

  public static com.google.bigtable.v2.CheckAndMutateRowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckAndMutateRowResponse> PARSER =
      new com.google.protobuf.AbstractParser<CheckAndMutateRowResponse>() {
        @java.lang.Override
        public CheckAndMutateRowResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CheckAndMutateRowResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CheckAndMutateRowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckAndMutateRowResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.CheckAndMutateRowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
