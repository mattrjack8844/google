/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Entry specyfication for a Dataplex fileset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DataplexFilesetSpec}
 */
public final class DataplexFilesetSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DataplexFilesetSpec)
    DataplexFilesetSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataplexFilesetSpec.newBuilder() to construct.
  private DataplexFilesetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataplexFilesetSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataplexFilesetSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.DataplexSpecProto
        .internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.DataplexSpecProto
        .internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec.class,
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder.class);
  }

  private int bitField0_;
  public static final int DATAPLEX_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.DataplexSpec dataplexSpec_;
  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
   *
   * @return Whether the dataplexSpec field is set.
   */
  @java.lang.Override
  public boolean hasDataplexSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
   *
   * @return The dataplexSpec.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexSpec getDataplexSpec() {
    return dataplexSpec_ == null
        ? com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()
        : dataplexSpec_;
  }
  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder getDataplexSpecOrBuilder() {
    return dataplexSpec_ == null
        ? com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()
        : dataplexSpec_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getDataplexSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataplexSpec());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DataplexFilesetSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DataplexFilesetSpec other =
        (com.google.cloud.datacatalog.v1.DataplexFilesetSpec) obj;

    if (hasDataplexSpec() != other.hasDataplexSpec()) return false;
    if (hasDataplexSpec()) {
      if (!getDataplexSpec().equals(other.getDataplexSpec())) return false;
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
    if (hasDataplexSpec()) {
      hash = (37 * hash) + DATAPLEX_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getDataplexSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.DataplexFilesetSpec prototype) {
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
   * Entry specyfication for a Dataplex fileset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DataplexFilesetSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DataplexFilesetSpec)
      com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DataplexFilesetSpec.class,
              com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DataplexFilesetSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataplexSpecFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataplexSpec_ = null;
      if (dataplexSpecBuilder_ != null) {
        dataplexSpecBuilder_.dispose();
        dataplexSpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpec build() {
      com.google.cloud.datacatalog.v1.DataplexFilesetSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpec buildPartial() {
      com.google.cloud.datacatalog.v1.DataplexFilesetSpec result =
          new com.google.cloud.datacatalog.v1.DataplexFilesetSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.DataplexFilesetSpec result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataplexSpec_ =
            dataplexSpecBuilder_ == null ? dataplexSpec_ : dataplexSpecBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.DataplexFilesetSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DataplexFilesetSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DataplexFilesetSpec other) {
      if (other == com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance())
        return this;
      if (other.hasDataplexSpec()) {
        mergeDataplexSpec(other.getDataplexSpec());
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
                input.readMessage(getDataplexSpecFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private int bitField0_;

    private com.google.cloud.datacatalog.v1.DataplexSpec dataplexSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexSpec,
            com.google.cloud.datacatalog.v1.DataplexSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder>
        dataplexSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     *
     * @return Whether the dataplexSpec field is set.
     */
    public boolean hasDataplexSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     *
     * @return The dataplexSpec.
     */
    public com.google.cloud.datacatalog.v1.DataplexSpec getDataplexSpec() {
      if (dataplexSpecBuilder_ == null) {
        return dataplexSpec_ == null
            ? com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()
            : dataplexSpec_;
      } else {
        return dataplexSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public Builder setDataplexSpec(com.google.cloud.datacatalog.v1.DataplexSpec value) {
      if (dataplexSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataplexSpec_ = value;
      } else {
        dataplexSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public Builder setDataplexSpec(
        com.google.cloud.datacatalog.v1.DataplexSpec.Builder builderForValue) {
      if (dataplexSpecBuilder_ == null) {
        dataplexSpec_ = builderForValue.build();
      } else {
        dataplexSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public Builder mergeDataplexSpec(com.google.cloud.datacatalog.v1.DataplexSpec value) {
      if (dataplexSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataplexSpec_ != null
            && dataplexSpec_ != com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()) {
          getDataplexSpecBuilder().mergeFrom(value);
        } else {
          dataplexSpec_ = value;
        }
      } else {
        dataplexSpecBuilder_.mergeFrom(value);
      }
      if (dataplexSpec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public Builder clearDataplexSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataplexSpec_ = null;
      if (dataplexSpecBuilder_ != null) {
        dataplexSpecBuilder_.dispose();
        dataplexSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.DataplexSpec.Builder getDataplexSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataplexSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder getDataplexSpecOrBuilder() {
      if (dataplexSpecBuilder_ != null) {
        return dataplexSpecBuilder_.getMessageOrBuilder();
      } else {
        return dataplexSpec_ == null
            ? com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()
            : dataplexSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Common Dataplex fields.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexSpec,
            com.google.cloud.datacatalog.v1.DataplexSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder>
        getDataplexSpecFieldBuilder() {
      if (dataplexSpecBuilder_ == null) {
        dataplexSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.DataplexSpec,
                com.google.cloud.datacatalog.v1.DataplexSpec.Builder,
                com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder>(
                getDataplexSpec(), getParentForChildren(), isClean());
        dataplexSpec_ = null;
      }
      return dataplexSpecBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DataplexFilesetSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DataplexFilesetSpec)
  private static final com.google.cloud.datacatalog.v1.DataplexFilesetSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DataplexFilesetSpec();
  }

  public static com.google.cloud.datacatalog.v1.DataplexFilesetSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataplexFilesetSpec> PARSER =
      new com.google.protobuf.AbstractParser<DataplexFilesetSpec>() {
        @java.lang.Override
        public DataplexFilesetSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataplexFilesetSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataplexFilesetSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexFilesetSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
