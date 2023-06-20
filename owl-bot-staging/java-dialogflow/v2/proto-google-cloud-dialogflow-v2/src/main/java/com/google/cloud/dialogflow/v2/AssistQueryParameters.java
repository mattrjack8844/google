// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Represents the parameters of human assist query.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.AssistQueryParameters}
 */
public final class AssistQueryParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.AssistQueryParameters)
    AssistQueryParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssistQueryParameters.newBuilder() to construct.
  private AssistQueryParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssistQueryParameters() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssistQueryParameters();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetDocumentsMetadataFilters();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.AssistQueryParameters.class, com.google.cloud.dialogflow.v2.AssistQueryParameters.Builder.class);
  }

  public static final int DOCUMENTS_METADATA_FILTERS_FIELD_NUMBER = 1;
  private static final class DocumentsMetadataFiltersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_DocumentsMetadataFiltersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> documentsMetadataFilters_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetDocumentsMetadataFilters() {
    if (documentsMetadataFilters_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry);
    }
    return documentsMetadataFilters_;
  }
  public int getDocumentsMetadataFiltersCount() {
    return internalGetDocumentsMetadataFilters().getMap().size();
  }
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  @java.lang.Override
  public boolean containsDocumentsMetadataFilters(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetDocumentsMetadataFilters().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDocumentsMetadataFiltersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFilters() {
    return getDocumentsMetadataFiltersMap();
  }
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFiltersMap() {
    return internalGetDocumentsMetadataFilters().getMap();
  }
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getDocumentsMetadataFiltersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDocumentsMetadataFilters().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getDocumentsMetadataFiltersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDocumentsMetadataFilters().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetDocumentsMetadataFilters(),
        DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetDocumentsMetadataFilters().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      documentsMetadataFilters__ = DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, documentsMetadataFilters__);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.AssistQueryParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.AssistQueryParameters other = (com.google.cloud.dialogflow.v2.AssistQueryParameters) obj;

    if (!internalGetDocumentsMetadataFilters().equals(
        other.internalGetDocumentsMetadataFilters())) return false;
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
    if (!internalGetDocumentsMetadataFilters().getMap().isEmpty()) {
      hash = (37 * hash) + DOCUMENTS_METADATA_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDocumentsMetadataFilters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.AssistQueryParameters parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.AssistQueryParameters prototype) {
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
   * Represents the parameters of human assist query.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.AssistQueryParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.AssistQueryParameters)
      com.google.cloud.dialogflow.v2.AssistQueryParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetDocumentsMetadataFilters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableDocumentsMetadataFilters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.AssistQueryParameters.class, com.google.cloud.dialogflow.v2.AssistQueryParameters.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.AssistQueryParameters.newBuilder()
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
      internalGetMutableDocumentsMetadataFilters().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_AssistQueryParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AssistQueryParameters getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.AssistQueryParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AssistQueryParameters build() {
      com.google.cloud.dialogflow.v2.AssistQueryParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AssistQueryParameters buildPartial() {
      com.google.cloud.dialogflow.v2.AssistQueryParameters result = new com.google.cloud.dialogflow.v2.AssistQueryParameters(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.AssistQueryParameters result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.documentsMetadataFilters_ = internalGetDocumentsMetadataFilters();
        result.documentsMetadataFilters_.makeImmutable();
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
      if (other instanceof com.google.cloud.dialogflow.v2.AssistQueryParameters) {
        return mergeFrom((com.google.cloud.dialogflow.v2.AssistQueryParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.AssistQueryParameters other) {
      if (other == com.google.cloud.dialogflow.v2.AssistQueryParameters.getDefaultInstance()) return this;
      internalGetMutableDocumentsMetadataFilters().mergeFrom(
          other.internalGetDocumentsMetadataFilters());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              documentsMetadataFilters__ = input.readMessage(
                  DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableDocumentsMetadataFilters().getMutableMap().put(
                  documentsMetadataFilters__.getKey(), documentsMetadataFilters__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> documentsMetadataFilters_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetDocumentsMetadataFilters() {
      if (documentsMetadataFilters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry);
      }
      return documentsMetadataFilters_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableDocumentsMetadataFilters() {
      if (documentsMetadataFilters_ == null) {
        documentsMetadataFilters_ = com.google.protobuf.MapField.newMapField(
            DocumentsMetadataFiltersDefaultEntryHolder.defaultEntry);
      }
      if (!documentsMetadataFilters_.isMutable()) {
        documentsMetadataFilters_ = documentsMetadataFilters_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return documentsMetadataFilters_;
    }
    public int getDocumentsMetadataFiltersCount() {
      return internalGetDocumentsMetadataFilters().getMap().size();
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    @java.lang.Override
    public boolean containsDocumentsMetadataFilters(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetDocumentsMetadataFilters().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDocumentsMetadataFiltersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFilters() {
      return getDocumentsMetadataFiltersMap();
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFiltersMap() {
      return internalGetDocumentsMetadataFilters().getMap();
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getDocumentsMetadataFiltersOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDocumentsMetadataFilters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getDocumentsMetadataFiltersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDocumentsMetadataFilters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearDocumentsMetadataFilters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableDocumentsMetadataFilters().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    public Builder removeDocumentsMetadataFilters(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableDocumentsMetadataFilters().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableDocumentsMetadataFilters() {
      bitField0_ |= 0x00000001;
      return internalGetMutableDocumentsMetadataFilters().getMutableMap();
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    public Builder putDocumentsMetadataFilters(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableDocumentsMetadataFilters().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Key-value filters on the metadata of documents returned by article
     * suggestion. If specified, article suggestion only returns suggested
     * documents that match all filters in their
     * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
     * values for a metadata key should be concatenated by comma. For example,
     * filters to match all documents that have 'US' or 'CA' in their market
     * metadata values and 'agent' in their user metadata values will be
     * ```
     * documents_metadata_filters {
     *   key: "market"
     *   value: "US,CA"
     * }
     * documents_metadata_filters {
     *   key: "user"
     *   value: "agent"
     * }
     * ```
     * </pre>
     *
     * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
     */
    public Builder putAllDocumentsMetadataFilters(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableDocumentsMetadataFilters().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.AssistQueryParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.AssistQueryParameters)
  private static final com.google.cloud.dialogflow.v2.AssistQueryParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.AssistQueryParameters();
  }

  public static com.google.cloud.dialogflow.v2.AssistQueryParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssistQueryParameters>
      PARSER = new com.google.protobuf.AbstractParser<AssistQueryParameters>() {
    @java.lang.Override
    public AssistQueryParameters parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssistQueryParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssistQueryParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AssistQueryParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

