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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification for vertex dataset resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.VertexDatasetSpec}
 */
public final class VertexDatasetSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.VertexDatasetSpec)
    VertexDatasetSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VertexDatasetSpec.newBuilder() to construct.
  private VertexDatasetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VertexDatasetSpec() {
    dataType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VertexDatasetSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_VertexDatasetSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_VertexDatasetSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.VertexDatasetSpec.class,
            com.google.cloud.datacatalog.v1.VertexDatasetSpec.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of data stored in the dataset.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datacatalog.v1.VertexDatasetSpec.DataType}
   */
  public enum DataType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
     */
    DATA_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Structured data dataset.
     * </pre>
     *
     * <code>TABLE = 1;</code>
     */
    TABLE(1),
    /**
     *
     *
     * <pre>
     * Image dataset which supports ImageClassification, ImageObjectDetection
     * and ImageSegmentation problems.
     * </pre>
     *
     * <code>IMAGE = 2;</code>
     */
    IMAGE(2),
    /**
     *
     *
     * <pre>
     * Document dataset which supports TextClassification, TextExtraction and
     * TextSentiment problems.
     * </pre>
     *
     * <code>TEXT = 3;</code>
     */
    TEXT(3),
    /**
     *
     *
     * <pre>
     * Video dataset which supports VideoClassification, VideoObjectTracking and
     * VideoActionRecognition problems.
     * </pre>
     *
     * <code>VIDEO = 4;</code>
     */
    VIDEO(4),
    /**
     *
     *
     * <pre>
     * Conversation dataset which supports conversation problems.
     * </pre>
     *
     * <code>CONVERSATION = 5;</code>
     */
    CONVERSATION(5),
    /**
     *
     *
     * <pre>
     * TimeSeries dataset.
     * </pre>
     *
     * <code>TIME_SERIES = 6;</code>
     */
    TIME_SERIES(6),
    /**
     *
     *
     * <pre>
     * Document dataset which supports DocumentAnnotation problems.
     * </pre>
     *
     * <code>DOCUMENT = 7;</code>
     */
    DOCUMENT(7),
    /**
     *
     *
     * <pre>
     * TextToSpeech dataset which supports TextToSpeech problems.
     * </pre>
     *
     * <code>TEXT_TO_SPEECH = 8;</code>
     */
    TEXT_TO_SPEECH(8),
    /**
     *
     *
     * <pre>
     * Translation dataset which supports Translation problems.
     * </pre>
     *
     * <code>TRANSLATION = 9;</code>
     */
    TRANSLATION(9),
    /**
     *
     *
     * <pre>
     * Store Vision dataset which is used for HITL integration.
     * </pre>
     *
     * <code>STORE_VISION = 10;</code>
     */
    STORE_VISION(10),
    /**
     *
     *
     * <pre>
     * Enterprise Knowledge Graph dataset which is used for HITL labeling
     * integration.
     * </pre>
     *
     * <code>ENTERPRISE_KNOWLEDGE_GRAPH = 11;</code>
     */
    ENTERPRISE_KNOWLEDGE_GRAPH(11),
    /**
     *
     *
     * <pre>
     * Text prompt dataset which supports Large Language Models.
     * </pre>
     *
     * <code>TEXT_PROMPT = 12;</code>
     */
    TEXT_PROMPT(12),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int DATA_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Structured data dataset.
     * </pre>
     *
     * <code>TABLE = 1;</code>
     */
    public static final int TABLE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Image dataset which supports ImageClassification, ImageObjectDetection
     * and ImageSegmentation problems.
     * </pre>
     *
     * <code>IMAGE = 2;</code>
     */
    public static final int IMAGE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Document dataset which supports TextClassification, TextExtraction and
     * TextSentiment problems.
     * </pre>
     *
     * <code>TEXT = 3;</code>
     */
    public static final int TEXT_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Video dataset which supports VideoClassification, VideoObjectTracking and
     * VideoActionRecognition problems.
     * </pre>
     *
     * <code>VIDEO = 4;</code>
     */
    public static final int VIDEO_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Conversation dataset which supports conversation problems.
     * </pre>
     *
     * <code>CONVERSATION = 5;</code>
     */
    public static final int CONVERSATION_VALUE = 5;
    /**
     *
     *
     * <pre>
     * TimeSeries dataset.
     * </pre>
     *
     * <code>TIME_SERIES = 6;</code>
     */
    public static final int TIME_SERIES_VALUE = 6;
    /**
     *
     *
     * <pre>
     * Document dataset which supports DocumentAnnotation problems.
     * </pre>
     *
     * <code>DOCUMENT = 7;</code>
     */
    public static final int DOCUMENT_VALUE = 7;
    /**
     *
     *
     * <pre>
     * TextToSpeech dataset which supports TextToSpeech problems.
     * </pre>
     *
     * <code>TEXT_TO_SPEECH = 8;</code>
     */
    public static final int TEXT_TO_SPEECH_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Translation dataset which supports Translation problems.
     * </pre>
     *
     * <code>TRANSLATION = 9;</code>
     */
    public static final int TRANSLATION_VALUE = 9;
    /**
     *
     *
     * <pre>
     * Store Vision dataset which is used for HITL integration.
     * </pre>
     *
     * <code>STORE_VISION = 10;</code>
     */
    public static final int STORE_VISION_VALUE = 10;
    /**
     *
     *
     * <pre>
     * Enterprise Knowledge Graph dataset which is used for HITL labeling
     * integration.
     * </pre>
     *
     * <code>ENTERPRISE_KNOWLEDGE_GRAPH = 11;</code>
     */
    public static final int ENTERPRISE_KNOWLEDGE_GRAPH_VALUE = 11;
    /**
     *
     *
     * <pre>
     * Text prompt dataset which supports Large Language Models.
     * </pre>
     *
     * <code>TEXT_PROMPT = 12;</code>
     */
    public static final int TEXT_PROMPT_VALUE = 12;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DataType forNumber(int value) {
      switch (value) {
        case 0:
          return DATA_TYPE_UNSPECIFIED;
        case 1:
          return TABLE;
        case 2:
          return IMAGE;
        case 3:
          return TEXT;
        case 4:
          return VIDEO;
        case 5:
          return CONVERSATION;
        case 6:
          return TIME_SERIES;
        case 7:
          return DOCUMENT;
        case 8:
          return TEXT_TO_SPEECH;
        case 9:
          return TRANSLATION;
        case 10:
          return STORE_VISION;
        case 11:
          return ENTERPRISE_KNOWLEDGE_GRAPH;
        case 12:
          return TEXT_PROMPT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.VertexDatasetSpec.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final DataType[] VALUES = values();

    public static DataType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DataType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.VertexDatasetSpec.DataType)
  }

  public static final int DATA_ITEM_COUNT_FIELD_NUMBER = 1;
  private long dataItemCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The number of DataItems in this Dataset. Only apply for non-structured
   * Dataset.
   * </pre>
   *
   * <code>int64 data_item_count = 1;</code>
   *
   * @return The dataItemCount.
   */
  @java.lang.Override
  public long getDataItemCount() {
    return dataItemCount_;
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;
  private int dataType_ = 0;
  /**
   *
   *
   * <pre>
   * Type of the dataset.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
   *
   * @return The enum numeric value on the wire for dataType.
   */
  @java.lang.Override
  public int getDataTypeValue() {
    return dataType_;
  }
  /**
   *
   *
   * <pre>
   * Type of the dataset.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
   *
   * @return The dataType.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType getDataType() {
    com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType result =
        com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.forNumber(dataType_);
    return result == null
        ? com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.UNRECOGNIZED
        : result;
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
    if (dataItemCount_ != 0L) {
      output.writeInt64(1, dataItemCount_);
    }
    if (dataType_
        != com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.DATA_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, dataType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataItemCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, dataItemCount_);
    }
    if (dataType_
        != com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.DATA_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, dataType_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.VertexDatasetSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.VertexDatasetSpec other =
        (com.google.cloud.datacatalog.v1.VertexDatasetSpec) obj;

    if (getDataItemCount() != other.getDataItemCount()) return false;
    if (dataType_ != other.dataType_) return false;
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
    hash = (37 * hash) + DATA_ITEM_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDataItemCount());
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.VertexDatasetSpec prototype) {
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
   * Specification for vertex dataset resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.VertexDatasetSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.VertexDatasetSpec)
      com.google.cloud.datacatalog.v1.VertexDatasetSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_VertexDatasetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_VertexDatasetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.VertexDatasetSpec.class,
              com.google.cloud.datacatalog.v1.VertexDatasetSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.VertexDatasetSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataItemCount_ = 0L;
      dataType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_VertexDatasetSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.VertexDatasetSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.VertexDatasetSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.VertexDatasetSpec build() {
      com.google.cloud.datacatalog.v1.VertexDatasetSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.VertexDatasetSpec buildPartial() {
      com.google.cloud.datacatalog.v1.VertexDatasetSpec result =
          new com.google.cloud.datacatalog.v1.VertexDatasetSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.VertexDatasetSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataItemCount_ = dataItemCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataType_ = dataType_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.VertexDatasetSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.VertexDatasetSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.VertexDatasetSpec other) {
      if (other == com.google.cloud.datacatalog.v1.VertexDatasetSpec.getDefaultInstance())
        return this;
      if (other.getDataItemCount() != 0L) {
        setDataItemCount(other.getDataItemCount());
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
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
            case 8:
              {
                dataItemCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                dataType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private long dataItemCount_;
    /**
     *
     *
     * <pre>
     * The number of DataItems in this Dataset. Only apply for non-structured
     * Dataset.
     * </pre>
     *
     * <code>int64 data_item_count = 1;</code>
     *
     * @return The dataItemCount.
     */
    @java.lang.Override
    public long getDataItemCount() {
      return dataItemCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of DataItems in this Dataset. Only apply for non-structured
     * Dataset.
     * </pre>
     *
     * <code>int64 data_item_count = 1;</code>
     *
     * @param value The dataItemCount to set.
     * @return This builder for chaining.
     */
    public Builder setDataItemCount(long value) {

      dataItemCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of DataItems in this Dataset. Only apply for non-structured
     * Dataset.
     * </pre>
     *
     * <code>int64 data_item_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataItemCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataItemCount_ = 0L;
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     *
     *
     * <pre>
     * Type of the dataset.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
     *
     * @return The enum numeric value on the wire for dataType.
     */
    @java.lang.Override
    public int getDataTypeValue() {
      return dataType_;
    }
    /**
     *
     *
     * <pre>
     * Type of the dataset.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeValue(int value) {
      dataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the dataset.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
     *
     * @return The dataType.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType getDataType() {
      com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType result =
          com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.forNumber(dataType_);
      return result == null
          ? com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of the dataset.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
     *
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(com.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the dataset.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.VertexDatasetSpec.DataType data_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.VertexDatasetSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.VertexDatasetSpec)
  private static final com.google.cloud.datacatalog.v1.VertexDatasetSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.VertexDatasetSpec();
  }

  public static com.google.cloud.datacatalog.v1.VertexDatasetSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VertexDatasetSpec> PARSER =
      new com.google.protobuf.AbstractParser<VertexDatasetSpec>() {
        @java.lang.Override
        public VertexDatasetSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<VertexDatasetSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VertexDatasetSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.VertexDatasetSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
