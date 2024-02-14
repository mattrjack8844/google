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
// source: google/cloud/bigquery/migration/v2alpha/assessment_task.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.migration.v2alpha;

/**
 *
 *
 * <pre>
 * Details for an assessment task orchestration result.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails}
 */
public final class AssessmentOrchestrationResultDetails
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
    AssessmentOrchestrationResultDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AssessmentOrchestrationResultDetails.newBuilder() to construct.
  private AssessmentOrchestrationResultDetails(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AssessmentOrchestrationResultDetails() {
    outputTablesSchemaVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AssessmentOrchestrationResultDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails.class,
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails.Builder
                .class);
  }

  public static final int OUTPUT_TABLES_SCHEMA_VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object outputTablesSchemaVersion_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The version used for the output table schemas.
   * </pre>
   *
   * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The outputTablesSchemaVersion.
   */
  @java.lang.Override
  public java.lang.String getOutputTablesSchemaVersion() {
    java.lang.Object ref = outputTablesSchemaVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputTablesSchemaVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The version used for the output table schemas.
   * </pre>
   *
   * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for outputTablesSchemaVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOutputTablesSchemaVersionBytes() {
    java.lang.Object ref = outputTablesSchemaVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      outputTablesSchemaVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputTablesSchemaVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputTablesSchemaVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputTablesSchemaVersion_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputTablesSchemaVersion_);
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
    if (!(obj
        instanceof
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails other =
        (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails) obj;

    if (!getOutputTablesSchemaVersion().equals(other.getOutputTablesSchemaVersion())) return false;
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
    hash = (37 * hash) + OUTPUT_TABLES_SCHEMA_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getOutputTablesSchemaVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      parseFrom(
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
      com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails prototype) {
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
   * Details for an assessment task orchestration result.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
      com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                  .class,
              com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      outputTablesSchemaVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        build() {
      com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails result =
          new com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.outputTablesSchemaVersion_ = outputTablesSchemaVersion_;
      }
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
      if (other
          instanceof
          com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails) {
        return mergeFrom(
            (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails other) {
      if (other
          == com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
              .getDefaultInstance()) return this;
      if (!other.getOutputTablesSchemaVersion().isEmpty()) {
        outputTablesSchemaVersion_ = other.outputTablesSchemaVersion_;
        bitField0_ |= 0x00000001;
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
            case 10:
              {
                outputTablesSchemaVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object outputTablesSchemaVersion_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The version used for the output table schemas.
     * </pre>
     *
     * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The outputTablesSchemaVersion.
     */
    public java.lang.String getOutputTablesSchemaVersion() {
      java.lang.Object ref = outputTablesSchemaVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputTablesSchemaVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The version used for the output table schemas.
     * </pre>
     *
     * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The bytes for outputTablesSchemaVersion.
     */
    public com.google.protobuf.ByteString getOutputTablesSchemaVersionBytes() {
      java.lang.Object ref = outputTablesSchemaVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        outputTablesSchemaVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The version used for the output table schemas.
     * </pre>
     *
     * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The outputTablesSchemaVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOutputTablesSchemaVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      outputTablesSchemaVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The version used for the output table schemas.
     * </pre>
     *
     * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutputTablesSchemaVersion() {
      outputTablesSchemaVersion_ = getDefaultInstance().getOutputTablesSchemaVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The version used for the output table schemas.
     * </pre>
     *
     * <code>string output_tables_schema_version = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The bytes for outputTablesSchemaVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOutputTablesSchemaVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      outputTablesSchemaVersion_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
  private static final com.google.cloud.bigquery.migration.v2alpha
          .AssessmentOrchestrationResultDetails
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssessmentOrchestrationResultDetails> PARSER =
      new com.google.protobuf.AbstractParser<AssessmentOrchestrationResultDetails>() {
        @java.lang.Override
        public AssessmentOrchestrationResultDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssessmentOrchestrationResultDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssessmentOrchestrationResultDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
