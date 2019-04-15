// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * A structured text document e.g. a PDF.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.Document}
 */
public final class Document extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.Document)
    DocumentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Document.newBuilder() to construct.
  private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Document() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Document(
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
              com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder subBuilder = null;
              if (inputConfig_ != null) {
                subBuilder = inputConfig_.toBuilder();
              }
              inputConfig_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.DocumentInputConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inputConfig_);
                inputConfig_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_Document_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_Document_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.Document.class,
            com.google.cloud.automl.v1beta1.Document.Builder.class);
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1beta1.DocumentInputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.DocumentInputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.automl.v1beta1.DocumentInputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder getInputConfigOrBuilder() {
    return getInputConfig();
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
    if (inputConfig_ != null) {
      output.writeMessage(1, getInputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInputConfig());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.Document)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.Document other = (com.google.cloud.automl.v1beta1.Document) obj;

    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
    }
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
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Document parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Document parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Document parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.Document prototype) {
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
   * A structured text document e.g. a PDF.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.Document}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.Document)
      com.google.cloud.automl.v1beta1.DocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Document_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.Document.class,
              com.google.cloud.automl.v1beta1.Document.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.Document.newBuilder()
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
      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Document_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Document getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.Document.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Document build() {
      com.google.cloud.automl.v1beta1.Document result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Document buildPartial() {
      com.google.cloud.automl.v1beta1.Document result =
          new com.google.cloud.automl.v1beta1.Document(this);
      if (inputConfigBuilder_ == null) {
        result.inputConfig_ = inputConfig_;
      } else {
        result.inputConfig_ = inputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.Document) {
        return mergeFrom((com.google.cloud.automl.v1beta1.Document) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.Document other) {
      if (other == com.google.cloud.automl.v1beta1.Document.getDefaultInstance()) return this;
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
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
      com.google.cloud.automl.v1beta1.Document parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.Document) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1beta1.DocumentInputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.DocumentInputConfig,
            com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder,
            com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public boolean hasInputConfig() {
      return inputConfigBuilder_ != null || inputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.DocumentInputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.automl.v1beta1.DocumentInputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(com.google.cloud.automl.v1beta1.DocumentInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public Builder mergeInputConfig(com.google.cloud.automl.v1beta1.DocumentInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (inputConfig_ != null) {
          inputConfig_ =
              com.google.cloud.automl.v1beta1.DocumentInputConfig.newBuilder(inputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          inputConfig_ = value;
        }
        onChanged();
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public Builder clearInputConfig() {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
        onChanged();
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder getInputConfigBuilder() {

      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.automl.v1beta1.DocumentInputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the document.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.DocumentInputConfig input_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.DocumentInputConfig,
            com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder,
            com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.DocumentInputConfig,
                com.google.cloud.automl.v1beta1.DocumentInputConfig.Builder,
                com.google.cloud.automl.v1beta1.DocumentInputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.Document)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.Document)
  private static final com.google.cloud.automl.v1beta1.Document DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.Document();
  }

  public static com.google.cloud.automl.v1beta1.Document getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Document> PARSER =
      new com.google.protobuf.AbstractParser<Document>() {
        @java.lang.Override
        public Document parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Document(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Document> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Document> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.Document getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
