// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

/**
 * <pre>
 * Error details in public error message for
 * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1.DataprocMetastore.QueryMetadata].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1.ErrorDetails}
 */
public final class ErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErrorDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetDetails();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1.ErrorDetails.class, com.google.cloud.metastore.v1.ErrorDetails.Builder.class);
  }

  public static final int DETAILS_FIELD_NUMBER = 1;
  private static final class DetailsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_DetailsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> details_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetDetails() {
    if (details_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DetailsDefaultEntryHolder.defaultEntry);
    }
    return details_;
  }
  public int getDetailsCount() {
    return internalGetDetails().getMap().size();
  }
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  @java.lang.Override
  public boolean containsDetails(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetDetails().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDetailsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getDetails() {
    return getDetailsMap();
  }
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getDetailsMap() {
    return internalGetDetails().getMap();
  }
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getDetailsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDetails().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getDetailsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDetails().getMap();
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
        internalGetDetails(),
        DetailsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetDetails().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      details__ = DetailsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, details__);
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
    if (!(obj instanceof com.google.cloud.metastore.v1.ErrorDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1.ErrorDetails other = (com.google.cloud.metastore.v1.ErrorDetails) obj;

    if (!internalGetDetails().equals(
        other.internalGetDetails())) return false;
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
    if (!internalGetDetails().getMap().isEmpty()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDetails().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1.ErrorDetails parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1.ErrorDetails prototype) {
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
   * Error details in public error message for
   * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1.DataprocMetastore.QueryMetadata].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1.ErrorDetails)
      com.google.cloud.metastore.v1.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetDetails();
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
          return internalGetMutableDetails();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1.ErrorDetails.class, com.google.cloud.metastore.v1.ErrorDetails.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1.ErrorDetails.newBuilder()
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
      internalGetMutableDetails().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.ErrorDetails getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1.ErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.ErrorDetails build() {
      com.google.cloud.metastore.v1.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.ErrorDetails buildPartial() {
      com.google.cloud.metastore.v1.ErrorDetails result = new com.google.cloud.metastore.v1.ErrorDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1.ErrorDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.details_ = internalGetDetails();
        result.details_.makeImmutable();
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
      if (other instanceof com.google.cloud.metastore.v1.ErrorDetails) {
        return mergeFrom((com.google.cloud.metastore.v1.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1.ErrorDetails other) {
      if (other == com.google.cloud.metastore.v1.ErrorDetails.getDefaultInstance()) return this;
      internalGetMutableDetails().mergeFrom(
          other.internalGetDetails());
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
              details__ = input.readMessage(
                  DetailsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableDetails().getMutableMap().put(
                  details__.getKey(), details__.getValue());
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
        java.lang.String, java.lang.String> details_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetDetails() {
      if (details_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DetailsDefaultEntryHolder.defaultEntry);
      }
      return details_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableDetails() {
      if (details_ == null) {
        details_ = com.google.protobuf.MapField.newMapField(
            DetailsDefaultEntryHolder.defaultEntry);
      }
      if (!details_.isMutable()) {
        details_ = details_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return details_;
    }
    public int getDetailsCount() {
      return internalGetDetails().getMap().size();
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    @java.lang.Override
    public boolean containsDetails(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetDetails().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDetailsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getDetails() {
      return getDetailsMap();
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getDetailsMap() {
      return internalGetDetails().getMap();
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getDetailsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDetails().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getDetailsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDetails().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearDetails() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableDetails().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    public Builder removeDetails(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableDetails().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableDetails() {
      bitField0_ |= 0x00000001;
      return internalGetMutableDetails().getMutableMap();
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    public Builder putDetails(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableDetails().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Additional structured details about this error.
     *
     * Keys define the failure items.
     * Value describes the exception or details of the item.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 1;</code>
     */
    public Builder putAllDetails(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableDetails().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1.ErrorDetails)
  private static final com.google.cloud.metastore.v1.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1.ErrorDetails();
  }

  public static com.google.cloud.metastore.v1.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    @java.lang.Override
    public ErrorDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

