// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/deployment.proto

package io.grafeas.v1;

/**
 * <pre>
 * An artifact that can be deployed in some runtime.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.DeploymentNote}
 */
public final class DeploymentNote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.DeploymentNote)
    DeploymentNoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeploymentNote.newBuilder() to construct.
  private DeploymentNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeploymentNote() {
    resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeploymentNote();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1.Deployment.internal_static_grafeas_v1_DeploymentNote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Deployment.internal_static_grafeas_v1_DeploymentNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.DeploymentNote.class, io.grafeas.v1.DeploymentNote.Builder.class);
  }

  public static final int RESOURCE_URI_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList resourceUri_;
  /**
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   * @return A list containing the resourceUri.
   */
  public com.google.protobuf.ProtocolStringList
      getResourceUriList() {
    return resourceUri_;
  }
  /**
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   * @return The count of resourceUri.
   */
  public int getResourceUriCount() {
    return resourceUri_.size();
  }
  /**
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   * @param index The index of the element to return.
   * @return The resourceUri at the given index.
   */
  public java.lang.String getResourceUri(int index) {
    return resourceUri_.get(index);
  }
  /**
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourceUri at the given index.
   */
  public com.google.protobuf.ByteString
      getResourceUriBytes(int index) {
    return resourceUri_.getByteString(index);
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
    for (int i = 0; i < resourceUri_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceUri_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < resourceUri_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceUri_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceUriList().size();
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
    if (!(obj instanceof io.grafeas.v1.DeploymentNote)) {
      return super.equals(obj);
    }
    io.grafeas.v1.DeploymentNote other = (io.grafeas.v1.DeploymentNote) obj;

    if (!getResourceUriList()
        .equals(other.getResourceUriList())) return false;
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
    if (getResourceUriCount() > 0) {
      hash = (37 * hash) + RESOURCE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getResourceUriList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.DeploymentNote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.DeploymentNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.DeploymentNote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.DeploymentNote parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1.DeploymentNote prototype) {
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
   * An artifact that can be deployed in some runtime.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.DeploymentNote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.DeploymentNote)
      io.grafeas.v1.DeploymentNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1.Deployment.internal_static_grafeas_v1_DeploymentNote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Deployment.internal_static_grafeas_v1_DeploymentNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.DeploymentNote.class, io.grafeas.v1.DeploymentNote.Builder.class);
    }

    // Construct using io.grafeas.v1.DeploymentNote.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1.Deployment.internal_static_grafeas_v1_DeploymentNote_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.DeploymentNote getDefaultInstanceForType() {
      return io.grafeas.v1.DeploymentNote.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.DeploymentNote build() {
      io.grafeas.v1.DeploymentNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.DeploymentNote buildPartial() {
      io.grafeas.v1.DeploymentNote result = new io.grafeas.v1.DeploymentNote(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        resourceUri_ = resourceUri_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.resourceUri_ = resourceUri_;
      onBuilt();
      return result;
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
      if (other instanceof io.grafeas.v1.DeploymentNote) {
        return mergeFrom((io.grafeas.v1.DeploymentNote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.DeploymentNote other) {
      if (other == io.grafeas.v1.DeploymentNote.getDefaultInstance()) return this;
      if (!other.resourceUri_.isEmpty()) {
        if (resourceUri_.isEmpty()) {
          resourceUri_ = other.resourceUri_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureResourceUriIsMutable();
          resourceUri_.addAll(other.resourceUri_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureResourceUriIsMutable();
              resourceUri_.add(s);
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

    private com.google.protobuf.LazyStringList resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureResourceUriIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceUri_ = new com.google.protobuf.LazyStringArrayList(resourceUri_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @return A list containing the resourceUri.
     */
    public com.google.protobuf.ProtocolStringList
        getResourceUriList() {
      return resourceUri_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @return The count of resourceUri.
     */
    public int getResourceUriCount() {
      return resourceUri_.size();
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param index The index of the element to return.
     * @return The resourceUri at the given index.
     */
    public java.lang.String getResourceUri(int index) {
      return resourceUri_.get(index);
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the resourceUri at the given index.
     */
    public com.google.protobuf.ByteString
        getResourceUriBytes(int index) {
      return resourceUri_.getByteString(index);
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param index The index to set the value at.
     * @param value The resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUri(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourceUriIsMutable();
      resourceUri_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param value The resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addResourceUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourceUriIsMutable();
      resourceUri_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param values The resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceUri(
        java.lang.Iterable<java.lang.String> values) {
      ensureResourceUriIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourceUri_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceUri() {
      resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     * @param value The bytes of the resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addResourceUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureResourceUriIsMutable();
      resourceUri_.add(value);
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1.DeploymentNote)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.DeploymentNote)
  private static final io.grafeas.v1.DeploymentNote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.DeploymentNote();
  }

  public static io.grafeas.v1.DeploymentNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeploymentNote>
      PARSER = new com.google.protobuf.AbstractParser<DeploymentNote>() {
    @java.lang.Override
    public DeploymentNote parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeploymentNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeploymentNote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.DeploymentNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

