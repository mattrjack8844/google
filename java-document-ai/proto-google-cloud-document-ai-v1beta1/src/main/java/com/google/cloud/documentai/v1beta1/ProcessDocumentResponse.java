/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

/**
 *
 *
 * <pre>
 * Response to a single document processing request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.ProcessDocumentResponse}
 */
public final class ProcessDocumentResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.ProcessDocumentResponse)
    ProcessDocumentResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProcessDocumentResponse.newBuilder() to construct.
  private ProcessDocumentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProcessDocumentResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProcessDocumentResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.class,
            com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder.class);
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.documentai.v1beta1.InputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * Information about the input file. This is the same as the corresponding
   * input config in the request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Information about the input file. This is the same as the corresponding
   * input config in the request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
   *
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.InputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.documentai.v1beta1.InputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Information about the input file. This is the same as the corresponding
   * input config in the request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
    return getInputConfig();
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1beta1.OutputConfig outputConfig_;
  /**
   *
   *
   * <pre>
   * The output location of the parsed responses. The responses are written to
   * this location as JSON-serialized `Document` objects.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Override
  public boolean hasOutputConfig() {
    return outputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The output location of the parsed responses. The responses are written to
   * this location as JSON-serialized `Document` objects.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
   *
   * @return The outputConfig.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.OutputConfig getOutputConfig() {
    return outputConfig_ == null
        ? com.google.cloud.documentai.v1beta1.OutputConfig.getDefaultInstance()
        : outputConfig_;
  }
  /**
   *
   *
   * <pre>
   * The output location of the parsed responses. The responses are written to
   * this location as JSON-serialized `Document` objects.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
    return getOutputConfig();
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
    if (outputConfig_ != null) {
      output.writeMessage(2, getOutputConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInputConfig());
    }
    if (outputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOutputConfig());
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.ProcessDocumentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.ProcessDocumentResponse other =
        (com.google.cloud.documentai.v1beta1.ProcessDocumentResponse) obj;

    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
    }
    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig().equals(other.getOutputConfig())) return false;
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
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse parseFrom(
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
      com.google.cloud.documentai.v1beta1.ProcessDocumentResponse prototype) {
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
   * Response to a single document processing request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.ProcessDocumentResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.ProcessDocumentResponse)
      com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.class,
              com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
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
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse build() {
      com.google.cloud.documentai.v1beta1.ProcessDocumentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse buildPartial() {
      com.google.cloud.documentai.v1beta1.ProcessDocumentResponse result =
          new com.google.cloud.documentai.v1beta1.ProcessDocumentResponse(this);
      if (inputConfigBuilder_ == null) {
        result.inputConfig_ = inputConfig_;
      } else {
        result.inputConfig_ = inputConfigBuilder_.build();
      }
      if (outputConfigBuilder_ == null) {
        result.outputConfig_ = outputConfig_;
      } else {
        result.outputConfig_ = outputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta1.ProcessDocumentResponse) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.ProcessDocumentResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta1.ProcessDocumentResponse other) {
      if (other == com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.getDefaultInstance())
        return this;
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
      }
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
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
            case 10:
              {
                input.readMessage(getInputConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getOutputConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            default:
              {
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

    private com.google.cloud.documentai.v1beta1.InputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.InputConfig,
            com.google.cloud.documentai.v1beta1.InputConfig.Builder,
            com.google.cloud.documentai.v1beta1.InputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     *
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return inputConfigBuilder_ != null || inputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     *
     * @return The inputConfig.
     */
    public com.google.cloud.documentai.v1beta1.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.documentai.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(com.google.cloud.documentai.v1beta1.InputConfig value) {
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
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.documentai.v1beta1.InputConfig.Builder builderForValue) {
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
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    public Builder mergeInputConfig(com.google.cloud.documentai.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (inputConfig_ != null) {
          inputConfig_ =
              com.google.cloud.documentai.v1beta1.InputConfig.newBuilder(inputConfig_)
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
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
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
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.InputConfig.Builder getInputConfigBuilder() {

      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.documentai.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the input file. This is the same as the corresponding
     * input config in the request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.InputConfig input_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.InputConfig,
            com.google.cloud.documentai.v1beta1.InputConfig.Builder,
            com.google.cloud.documentai.v1beta1.InputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta1.InputConfig,
                com.google.cloud.documentai.v1beta1.InputConfig.Builder,
                com.google.cloud.documentai.v1beta1.InputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
    }

    private com.google.cloud.documentai.v1beta1.OutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.OutputConfig,
            com.google.cloud.documentai.v1beta1.OutputConfig.Builder,
            com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder>
        outputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     *
     * @return Whether the outputConfig field is set.
     */
    public boolean hasOutputConfig() {
      return outputConfigBuilder_ != null || outputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     *
     * @return The outputConfig.
     */
    public com.google.cloud.documentai.v1beta1.OutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null
            ? com.google.cloud.documentai.v1beta1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public Builder setOutputConfig(com.google.cloud.documentai.v1beta1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public Builder setOutputConfig(
        com.google.cloud.documentai.v1beta1.OutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public Builder mergeOutputConfig(com.google.cloud.documentai.v1beta1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (outputConfig_ != null) {
          outputConfig_ =
              com.google.cloud.documentai.v1beta1.OutputConfig.newBuilder(outputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          outputConfig_ = value;
        }
        onChanged();
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public Builder clearOutputConfig() {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
        onChanged();
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public com.google.cloud.documentai.v1beta1.OutputConfig.Builder getOutputConfigBuilder() {

      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    public com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null
            ? com.google.cloud.documentai.v1beta1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The output location of the parsed responses. The responses are written to
     * this location as JSON-serialized `Document` objects.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.OutputConfig output_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.OutputConfig,
            com.google.cloud.documentai.v1beta1.OutputConfig.Builder,
            com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder>
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta1.OutputConfig,
                com.google.cloud.documentai.v1beta1.OutputConfig.Builder,
                com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder>(
                getOutputConfig(), getParentForChildren(), isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.ProcessDocumentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.ProcessDocumentResponse)
  private static final com.google.cloud.documentai.v1beta1.ProcessDocumentResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.ProcessDocumentResponse();
  }

  public static com.google.cloud.documentai.v1beta1.ProcessDocumentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessDocumentResponse> PARSER =
      new com.google.protobuf.AbstractParser<ProcessDocumentResponse>() {
        @java.lang.Override
        public ProcessDocumentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessDocumentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessDocumentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
