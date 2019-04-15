// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/firestore_admin.proto

package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * The request for [FirestoreAdmin.ImportDocuments][google.firestore.admin.v1.FirestoreAdmin.ImportDocuments].
 * </pre>
 *
 * Protobuf type {@code google.firestore.admin.v1.ImportDocumentsRequest}
 */
public final class ImportDocumentsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.admin.v1.ImportDocumentsRequest)
    ImportDocumentsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportDocumentsRequest.newBuilder() to construct.
  private ImportDocumentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportDocumentsRequest() {
    name_ = "";
    collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    inputUriPrefix_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImportDocumentsRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                collectionIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              collectionIds_.add(s);
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              inputUriPrefix_ = s;
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
        collectionIds_ = collectionIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ImportDocumentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.admin.v1.ImportDocumentsRequest.class,
            com.google.firestore.admin.v1.ImportDocumentsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Database to import into. Should be of the form:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Database to import into. Should be of the form:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLECTION_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList collectionIds_;
  /**
   *
   *
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getCollectionIdsList() {
    return collectionIds_;
  }
  /**
   *
   *
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   */
  public int getCollectionIdsCount() {
    return collectionIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   */
  public java.lang.String getCollectionIds(int index) {
    return collectionIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   */
  public com.google.protobuf.ByteString getCollectionIdsBytes(int index) {
    return collectionIds_.getByteString(index);
  }

  public static final int INPUT_URI_PREFIX_FIELD_NUMBER = 3;
  private volatile java.lang.Object inputUriPrefix_;
  /**
   *
   *
   * <pre>
   * Location of the exported files.
   * This must match the output_uri_prefix of an ExportDocumentsResponse from
   * an export that has completed successfully.
   * See:
   * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
   * </pre>
   *
   * <code>string input_uri_prefix = 3;</code>
   */
  public java.lang.String getInputUriPrefix() {
    java.lang.Object ref = inputUriPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputUriPrefix_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Location of the exported files.
   * This must match the output_uri_prefix of an ExportDocumentsResponse from
   * an export that has completed successfully.
   * See:
   * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
   * </pre>
   *
   * <code>string input_uri_prefix = 3;</code>
   */
  public com.google.protobuf.ByteString getInputUriPrefixBytes() {
    java.lang.Object ref = inputUriPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      inputUriPrefix_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < collectionIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, collectionIds_.getRaw(i));
    }
    if (!getInputUriPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, inputUriPrefix_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < collectionIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(collectionIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCollectionIdsList().size();
    }
    if (!getInputUriPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, inputUriPrefix_);
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
    if (!(obj instanceof com.google.firestore.admin.v1.ImportDocumentsRequest)) {
      return super.equals(obj);
    }
    com.google.firestore.admin.v1.ImportDocumentsRequest other =
        (com.google.firestore.admin.v1.ImportDocumentsRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCollectionIdsList().equals(other.getCollectionIdsList())) return false;
    if (!getInputUriPrefix().equals(other.getInputUriPrefix())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getCollectionIdsCount() > 0) {
      hash = (37 * hash) + COLLECTION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionIdsList().hashCode();
    }
    hash = (37 * hash) + INPUT_URI_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getInputUriPrefix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest parseFrom(
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

  public static Builder newBuilder(com.google.firestore.admin.v1.ImportDocumentsRequest prototype) {
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
   * The request for [FirestoreAdmin.ImportDocuments][google.firestore.admin.v1.FirestoreAdmin.ImportDocuments].
   * </pre>
   *
   * Protobuf type {@code google.firestore.admin.v1.ImportDocumentsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.admin.v1.ImportDocumentsRequest)
      com.google.firestore.admin.v1.ImportDocumentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ImportDocumentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.admin.v1.ImportDocumentsRequest.class,
              com.google.firestore.admin.v1.ImportDocumentsRequest.Builder.class);
    }

    // Construct using com.google.firestore.admin.v1.ImportDocumentsRequest.newBuilder()
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
      name_ = "";

      collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      inputUriPrefix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ImportDocumentsRequest getDefaultInstanceForType() {
      return com.google.firestore.admin.v1.ImportDocumentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ImportDocumentsRequest build() {
      com.google.firestore.admin.v1.ImportDocumentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ImportDocumentsRequest buildPartial() {
      com.google.firestore.admin.v1.ImportDocumentsRequest result =
          new com.google.firestore.admin.v1.ImportDocumentsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) != 0)) {
        collectionIds_ = collectionIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.collectionIds_ = collectionIds_;
      result.inputUriPrefix_ = inputUriPrefix_;
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
      if (other instanceof com.google.firestore.admin.v1.ImportDocumentsRequest) {
        return mergeFrom((com.google.firestore.admin.v1.ImportDocumentsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.admin.v1.ImportDocumentsRequest other) {
      if (other == com.google.firestore.admin.v1.ImportDocumentsRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.collectionIds_.isEmpty()) {
        if (collectionIds_.isEmpty()) {
          collectionIds_ = other.collectionIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCollectionIdsIsMutable();
          collectionIds_.addAll(other.collectionIds_);
        }
        onChanged();
      }
      if (!other.getInputUriPrefix().isEmpty()) {
        inputUriPrefix_ = other.inputUriPrefix_;
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
      com.google.firestore.admin.v1.ImportDocumentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.firestore.admin.v1.ImportDocumentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Database to import into. Should be of the form:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Database to import into. Should be of the form:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Database to import into. Should be of the form:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database to import into. Should be of the form:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database to import into. Should be of the form:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList collectionIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureCollectionIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        collectionIds_ = new com.google.protobuf.LazyStringArrayList(collectionIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getCollectionIdsList() {
      return collectionIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public int getCollectionIdsCount() {
      return collectionIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public java.lang.String getCollectionIds(int index) {
      return collectionIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public com.google.protobuf.ByteString getCollectionIdsBytes(int index) {
      return collectionIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public Builder setCollectionIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCollectionIdsIsMutable();
      collectionIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public Builder addCollectionIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public Builder addAllCollectionIds(java.lang.Iterable<java.lang.String> values) {
      ensureCollectionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, collectionIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public Builder clearCollectionIds() {
      collectionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which collection ids to import. Unspecified means all collections included
     * in the import.
     * </pre>
     *
     * <code>repeated string collection_ids = 2;</code>
     */
    public Builder addCollectionIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object inputUriPrefix_ = "";
    /**
     *
     *
     * <pre>
     * Location of the exported files.
     * This must match the output_uri_prefix of an ExportDocumentsResponse from
     * an export that has completed successfully.
     * See:
     * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
     * </pre>
     *
     * <code>string input_uri_prefix = 3;</code>
     */
    public java.lang.String getInputUriPrefix() {
      java.lang.Object ref = inputUriPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputUriPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location of the exported files.
     * This must match the output_uri_prefix of an ExportDocumentsResponse from
     * an export that has completed successfully.
     * See:
     * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
     * </pre>
     *
     * <code>string input_uri_prefix = 3;</code>
     */
    public com.google.protobuf.ByteString getInputUriPrefixBytes() {
      java.lang.Object ref = inputUriPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        inputUriPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location of the exported files.
     * This must match the output_uri_prefix of an ExportDocumentsResponse from
     * an export that has completed successfully.
     * See:
     * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
     * </pre>
     *
     * <code>string input_uri_prefix = 3;</code>
     */
    public Builder setInputUriPrefix(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      inputUriPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location of the exported files.
     * This must match the output_uri_prefix of an ExportDocumentsResponse from
     * an export that has completed successfully.
     * See:
     * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
     * </pre>
     *
     * <code>string input_uri_prefix = 3;</code>
     */
    public Builder clearInputUriPrefix() {

      inputUriPrefix_ = getDefaultInstance().getInputUriPrefix();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location of the exported files.
     * This must match the output_uri_prefix of an ExportDocumentsResponse from
     * an export that has completed successfully.
     * See:
     * [google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix].
     * </pre>
     *
     * <code>string input_uri_prefix = 3;</code>
     */
    public Builder setInputUriPrefixBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      inputUriPrefix_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.firestore.admin.v1.ImportDocumentsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.admin.v1.ImportDocumentsRequest)
  private static final com.google.firestore.admin.v1.ImportDocumentsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.admin.v1.ImportDocumentsRequest();
  }

  public static com.google.firestore.admin.v1.ImportDocumentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportDocumentsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportDocumentsRequest>() {
        @java.lang.Override
        public ImportDocumentsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImportDocumentsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImportDocumentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportDocumentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.admin.v1.ImportDocumentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
