// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/write.proto

package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * A [Document][google.firestore.v1.Document] has changed.
 * May be the result of multiple [writes][google.firestore.v1.Write], including deletes, that
 * ultimately resulted in a new value for the [Document][google.firestore.v1.Document].
 * Multiple [DocumentChange][google.firestore.v1.DocumentChange] messages may be returned for the same logical
 * change, if multiple targets are affected.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.DocumentChange}
 */
public final class DocumentChange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.DocumentChange)
    DocumentChangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DocumentChange.newBuilder() to construct.
  private DocumentChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DocumentChange() {
    targetIds_ = emptyIntList();
    removedTargetIds_ = emptyIntList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DocumentChange(
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
              com.google.firestore.v1.Document.Builder subBuilder = null;
              if (document_ != null) {
                subBuilder = document_.toBuilder();
              }
              document_ =
                  input.readMessage(com.google.firestore.v1.Document.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(document_);
                document_ = subBuilder.buildPartial();
              }

              break;
            }
          case 40:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                targetIds_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              targetIds_.addInt(input.readInt32());
              break;
            }
          case 42:
            {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                targetIds_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                targetIds_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          case 48:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                removedTargetIds_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              removedTargetIds_.addInt(input.readInt32());
              break;
            }
          case 50:
            {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
                removedTargetIds_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                removedTargetIds_.addInt(input.readInt32());
              }
              input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        targetIds_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        removedTargetIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.WriteProto
        .internal_static_google_firestore_v1_DocumentChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.WriteProto
        .internal_static_google_firestore_v1_DocumentChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.DocumentChange.class,
            com.google.firestore.v1.DocumentChange.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private com.google.firestore.v1.Document document_;
  /**
   *
   *
   * <pre>
   * The new state of the [Document][google.firestore.v1.Document].
   * If `mask` is set, contains only fields that were updated or added.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   */
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   *
   *
   * <pre>
   * The new state of the [Document][google.firestore.v1.Document].
   * If `mask` is set, contains only fields that were updated or added.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   */
  public com.google.firestore.v1.Document getDocument() {
    return document_ == null ? com.google.firestore.v1.Document.getDefaultInstance() : document_;
  }
  /**
   *
   *
   * <pre>
   * The new state of the [Document][google.firestore.v1.Document].
   * If `mask` is set, contains only fields that were updated or added.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   */
  public com.google.firestore.v1.DocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
  }

  public static final int TARGET_IDS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList targetIds_;
  /**
   *
   *
   * <pre>
   * A set of target IDs of targets that match this document.
   * </pre>
   *
   * <code>repeated int32 target_ids = 5;</code>
   */
  public java.util.List<java.lang.Integer> getTargetIdsList() {
    return targetIds_;
  }
  /**
   *
   *
   * <pre>
   * A set of target IDs of targets that match this document.
   * </pre>
   *
   * <code>repeated int32 target_ids = 5;</code>
   */
  public int getTargetIdsCount() {
    return targetIds_.size();
  }
  /**
   *
   *
   * <pre>
   * A set of target IDs of targets that match this document.
   * </pre>
   *
   * <code>repeated int32 target_ids = 5;</code>
   */
  public int getTargetIds(int index) {
    return targetIds_.getInt(index);
  }

  private int targetIdsMemoizedSerializedSize = -1;

  public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
  private com.google.protobuf.Internal.IntList removedTargetIds_;
  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that no longer match this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 6;</code>
   */
  public java.util.List<java.lang.Integer> getRemovedTargetIdsList() {
    return removedTargetIds_;
  }
  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that no longer match this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 6;</code>
   */
  public int getRemovedTargetIdsCount() {
    return removedTargetIds_.size();
  }
  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that no longer match this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 6;</code>
   */
  public int getRemovedTargetIds(int index) {
    return removedTargetIds_.getInt(index);
  }

  private int removedTargetIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (document_ != null) {
      output.writeMessage(1, getDocument());
    }
    if (getTargetIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(targetIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < targetIds_.size(); i++) {
      output.writeInt32NoTag(targetIds_.getInt(i));
    }
    if (getRemovedTargetIdsList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(removedTargetIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < removedTargetIds_.size(); i++) {
      output.writeInt32NoTag(removedTargetIds_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDocument());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < targetIds_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(targetIds_.getInt(i));
      }
      size += dataSize;
      if (!getTargetIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      targetIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < removedTargetIds_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(
                removedTargetIds_.getInt(i));
      }
      size += dataSize;
      if (!getRemovedTargetIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      removedTargetIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.firestore.v1.DocumentChange)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.DocumentChange other = (com.google.firestore.v1.DocumentChange) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument().equals(other.getDocument())) return false;
    }
    if (!getTargetIdsList().equals(other.getTargetIdsList())) return false;
    if (!getRemovedTargetIdsList().equals(other.getRemovedTargetIdsList())) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    if (getTargetIdsCount() > 0) {
      hash = (37 * hash) + TARGET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetIdsList().hashCode();
    }
    if (getRemovedTargetIdsCount() > 0) {
      hash = (37 * hash) + REMOVED_TARGET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRemovedTargetIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentChange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentChange parseFrom(
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

  public static Builder newBuilder(com.google.firestore.v1.DocumentChange prototype) {
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
   * A [Document][google.firestore.v1.Document] has changed.
   * May be the result of multiple [writes][google.firestore.v1.Write], including deletes, that
   * ultimately resulted in a new value for the [Document][google.firestore.v1.Document].
   * Multiple [DocumentChange][google.firestore.v1.DocumentChange] messages may be returned for the same logical
   * change, if multiple targets are affected.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.DocumentChange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.DocumentChange)
      com.google.firestore.v1.DocumentChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_DocumentChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_DocumentChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.DocumentChange.class,
              com.google.firestore.v1.DocumentChange.Builder.class);
    }

    // Construct using com.google.firestore.v1.DocumentChange.newBuilder()
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
      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      targetIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      removedTargetIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_DocumentChange_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentChange getDefaultInstanceForType() {
      return com.google.firestore.v1.DocumentChange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentChange build() {
      com.google.firestore.v1.DocumentChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentChange buildPartial() {
      com.google.firestore.v1.DocumentChange result =
          new com.google.firestore.v1.DocumentChange(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        targetIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.targetIds_ = targetIds_;
      if (((bitField0_ & 0x00000004) != 0)) {
        removedTargetIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.removedTargetIds_ = removedTargetIds_;
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
      if (other instanceof com.google.firestore.v1.DocumentChange) {
        return mergeFrom((com.google.firestore.v1.DocumentChange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.DocumentChange other) {
      if (other == com.google.firestore.v1.DocumentChange.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (!other.targetIds_.isEmpty()) {
        if (targetIds_.isEmpty()) {
          targetIds_ = other.targetIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTargetIdsIsMutable();
          targetIds_.addAll(other.targetIds_);
        }
        onChanged();
      }
      if (!other.removedTargetIds_.isEmpty()) {
        if (removedTargetIds_.isEmpty()) {
          removedTargetIds_ = other.removedTargetIds_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureRemovedTargetIdsIsMutable();
          removedTargetIds_.addAll(other.removedTargetIds_);
        }
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
      com.google.firestore.v1.DocumentChange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.DocumentChange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.firestore.v1.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.Document,
            com.google.firestore.v1.Document.Builder,
            com.google.firestore.v1.DocumentOrBuilder>
        documentBuilder_;
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public com.google.firestore.v1.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null
            ? com.google.firestore.v1.Document.getDefaultInstance()
            : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public Builder setDocument(com.google.firestore.v1.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public Builder setDocument(com.google.firestore.v1.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public Builder mergeDocument(com.google.firestore.v1.Document value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
              com.google.firestore.v1.Document.newBuilder(document_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public com.google.firestore.v1.Document.Builder getDocumentBuilder() {

      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    public com.google.firestore.v1.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null
            ? com.google.firestore.v1.Document.getDefaultInstance()
            : document_;
      }
    }
    /**
     *
     *
     * <pre>
     * The new state of the [Document][google.firestore.v1.Document].
     * If `mask` is set, contains only fields that were updated or added.
     * </pre>
     *
     * <code>.google.firestore.v1.Document document = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.Document,
            com.google.firestore.v1.Document.Builder,
            com.google.firestore.v1.DocumentOrBuilder>
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.firestore.v1.Document,
                com.google.firestore.v1.Document.Builder,
                com.google.firestore.v1.DocumentOrBuilder>(
                getDocument(), getParentForChildren(), isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private com.google.protobuf.Internal.IntList targetIds_ = emptyIntList();

    private void ensureTargetIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        targetIds_ = mutableCopy(targetIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public java.util.List<java.lang.Integer> getTargetIdsList() {
      return ((bitField0_ & 0x00000002) != 0)
          ? java.util.Collections.unmodifiableList(targetIds_)
          : targetIds_;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public int getTargetIdsCount() {
      return targetIds_.size();
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public int getTargetIds(int index) {
      return targetIds_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public Builder setTargetIds(int index, int value) {
      ensureTargetIdsIsMutable();
      targetIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public Builder addTargetIds(int value) {
      ensureTargetIdsIsMutable();
      targetIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public Builder addAllTargetIds(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTargetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targetIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs of targets that match this document.
     * </pre>
     *
     * <code>repeated int32 target_ids = 5;</code>
     */
    public Builder clearTargetIds() {
      targetIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList removedTargetIds_ = emptyIntList();

    private void ensureRemovedTargetIdsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        removedTargetIds_ = mutableCopy(removedTargetIds_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public java.util.List<java.lang.Integer> getRemovedTargetIdsList() {
      return ((bitField0_ & 0x00000004) != 0)
          ? java.util.Collections.unmodifiableList(removedTargetIds_)
          : removedTargetIds_;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public int getRemovedTargetIdsCount() {
      return removedTargetIds_.size();
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public int getRemovedTargetIds(int index) {
      return removedTargetIds_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public Builder setRemovedTargetIds(int index, int value) {
      ensureRemovedTargetIdsIsMutable();
      removedTargetIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public Builder addRemovedTargetIds(int value) {
      ensureRemovedTargetIdsIsMutable();
      removedTargetIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public Builder addAllRemovedTargetIds(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRemovedTargetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, removedTargetIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of target IDs for targets that no longer match this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 6;</code>
     */
    public Builder clearRemovedTargetIds() {
      removedTargetIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
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

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.DocumentChange)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.DocumentChange)
  private static final com.google.firestore.v1.DocumentChange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.DocumentChange();
  }

  public static com.google.firestore.v1.DocumentChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentChange> PARSER =
      new com.google.protobuf.AbstractParser<DocumentChange>() {
        @java.lang.Override
        public DocumentChange parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DocumentChange(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DocumentChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.DocumentChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
