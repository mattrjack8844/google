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
// source: google/cloud/automl/v1beta1/tables.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * An information specific to given column and Tables Model, in context
 * of the Model and the predictions created by it.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TablesModelColumnInfo}
 */
public final class TablesModelColumnInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TablesModelColumnInfo)
    TablesModelColumnInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TablesModelColumnInfo.newBuilder() to construct.
  private TablesModelColumnInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TablesModelColumnInfo() {
    columnSpecName_ = "";
    columnDisplayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TablesModelColumnInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TablesModelColumnInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

              columnSpecName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              columnDisplayName_ = s;
              break;
            }
          case 29:
            {
              featureImportance_ = input.readFloat();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.Tables
        .internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.Tables
        .internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TablesModelColumnInfo.class,
            com.google.cloud.automl.v1beta1.TablesModelColumnInfo.Builder.class);
  }

  public static final int COLUMN_SPEC_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object columnSpecName_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the ColumnSpec describing the column. Not
   * populated when this proto is outputted to BigQuery.
   * </pre>
   *
   * <code>string column_spec_name = 1;</code>
   *
   * @return The columnSpecName.
   */
  @java.lang.Override
  public java.lang.String getColumnSpecName() {
    java.lang.Object ref = columnSpecName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnSpecName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the ColumnSpec describing the column. Not
   * populated when this proto is outputted to BigQuery.
   * </pre>
   *
   * <code>string column_spec_name = 1;</code>
   *
   * @return The bytes for columnSpecName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColumnSpecNameBytes() {
    java.lang.Object ref = columnSpecName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      columnSpecName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object columnDisplayName_;
  /**
   *
   *
   * <pre>
   * Output only. The display name of the column (same as the display_name of
   * its ColumnSpec).
   * </pre>
   *
   * <code>string column_display_name = 2;</code>
   *
   * @return The columnDisplayName.
   */
  @java.lang.Override
  public java.lang.String getColumnDisplayName() {
    java.lang.Object ref = columnDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnDisplayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The display name of the column (same as the display_name of
   * its ColumnSpec).
   * </pre>
   *
   * <code>string column_display_name = 2;</code>
   *
   * @return The bytes for columnDisplayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColumnDisplayNameBytes() {
    java.lang.Object ref = columnDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      columnDisplayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURE_IMPORTANCE_FIELD_NUMBER = 3;
  private float featureImportance_;
  /**
   *
   *
   * <pre>
   * Output only. When given as part of a Model (always populated):
   * Measurement of how much model predictions correctness on the TEST data
   * depend on values in this column. A value between 0 and 1, higher means
   * higher influence. These values are normalized - for all input feature
   * columns of a given model they add to 1.
   * When given back by Predict (populated iff
   * [feature_importance
   * param][google.cloud.automl.v1beta1.PredictRequest.params] is set) or Batch
   * Predict (populated iff
   * [feature_importance][google.cloud.automl.v1beta1.PredictRequest.params]
   * param is set):
   * Measurement of how impactful for the prediction returned for the given row
   * the value in this column was. Specifically, the feature importance
   * specifies the marginal contribution that the feature made to the prediction
   * score compared to the baseline score. These values are computed using the
   * Sampled Shapley method.
   * </pre>
   *
   * <code>float feature_importance = 3;</code>
   *
   * @return The featureImportance.
   */
  @java.lang.Override
  public float getFeatureImportance() {
    return featureImportance_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnSpecName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columnSpecName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnDisplayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, columnDisplayName_);
    }
    if (java.lang.Float.floatToRawIntBits(featureImportance_) != 0) {
      output.writeFloat(3, featureImportance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnSpecName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, columnSpecName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnDisplayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, columnDisplayName_);
    }
    if (java.lang.Float.floatToRawIntBits(featureImportance_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, featureImportance_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TablesModelColumnInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TablesModelColumnInfo other =
        (com.google.cloud.automl.v1beta1.TablesModelColumnInfo) obj;

    if (!getColumnSpecName().equals(other.getColumnSpecName())) return false;
    if (!getColumnDisplayName().equals(other.getColumnDisplayName())) return false;
    if (java.lang.Float.floatToIntBits(getFeatureImportance())
        != java.lang.Float.floatToIntBits(other.getFeatureImportance())) return false;
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
    hash = (37 * hash) + COLUMN_SPEC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnSpecName().hashCode();
    hash = (37 * hash) + COLUMN_DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnDisplayName().hashCode();
    hash = (37 * hash) + FEATURE_IMPORTANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getFeatureImportance());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo parseFrom(
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
      com.google.cloud.automl.v1beta1.TablesModelColumnInfo prototype) {
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
   * An information specific to given column and Tables Model, in context
   * of the Model and the predictions created by it.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TablesModelColumnInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TablesModelColumnInfo)
      com.google.cloud.automl.v1beta1.TablesModelColumnInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.Tables
          .internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.Tables
          .internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TablesModelColumnInfo.class,
              com.google.cloud.automl.v1beta1.TablesModelColumnInfo.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TablesModelColumnInfo.newBuilder()
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
      columnSpecName_ = "";

      columnDisplayName_ = "";

      featureImportance_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.Tables
          .internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TablesModelColumnInfo getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TablesModelColumnInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TablesModelColumnInfo build() {
      com.google.cloud.automl.v1beta1.TablesModelColumnInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TablesModelColumnInfo buildPartial() {
      com.google.cloud.automl.v1beta1.TablesModelColumnInfo result =
          new com.google.cloud.automl.v1beta1.TablesModelColumnInfo(this);
      result.columnSpecName_ = columnSpecName_;
      result.columnDisplayName_ = columnDisplayName_;
      result.featureImportance_ = featureImportance_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TablesModelColumnInfo) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TablesModelColumnInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TablesModelColumnInfo other) {
      if (other == com.google.cloud.automl.v1beta1.TablesModelColumnInfo.getDefaultInstance())
        return this;
      if (!other.getColumnSpecName().isEmpty()) {
        columnSpecName_ = other.columnSpecName_;
        onChanged();
      }
      if (!other.getColumnDisplayName().isEmpty()) {
        columnDisplayName_ = other.columnDisplayName_;
        onChanged();
      }
      if (other.getFeatureImportance() != 0F) {
        setFeatureImportance(other.getFeatureImportance());
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
      com.google.cloud.automl.v1beta1.TablesModelColumnInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.TablesModelColumnInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object columnSpecName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the ColumnSpec describing the column. Not
     * populated when this proto is outputted to BigQuery.
     * </pre>
     *
     * <code>string column_spec_name = 1;</code>
     *
     * @return The columnSpecName.
     */
    public java.lang.String getColumnSpecName() {
      java.lang.Object ref = columnSpecName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnSpecName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the ColumnSpec describing the column. Not
     * populated when this proto is outputted to BigQuery.
     * </pre>
     *
     * <code>string column_spec_name = 1;</code>
     *
     * @return The bytes for columnSpecName.
     */
    public com.google.protobuf.ByteString getColumnSpecNameBytes() {
      java.lang.Object ref = columnSpecName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        columnSpecName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the ColumnSpec describing the column. Not
     * populated when this proto is outputted to BigQuery.
     * </pre>
     *
     * <code>string column_spec_name = 1;</code>
     *
     * @param value The columnSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnSpecName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      columnSpecName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the ColumnSpec describing the column. Not
     * populated when this proto is outputted to BigQuery.
     * </pre>
     *
     * <code>string column_spec_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumnSpecName() {

      columnSpecName_ = getDefaultInstance().getColumnSpecName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the ColumnSpec describing the column. Not
     * populated when this proto is outputted to BigQuery.
     * </pre>
     *
     * <code>string column_spec_name = 1;</code>
     *
     * @param value The bytes for columnSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnSpecNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      columnSpecName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object columnDisplayName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The display name of the column (same as the display_name of
     * its ColumnSpec).
     * </pre>
     *
     * <code>string column_display_name = 2;</code>
     *
     * @return The columnDisplayName.
     */
    public java.lang.String getColumnDisplayName() {
      java.lang.Object ref = columnDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnDisplayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The display name of the column (same as the display_name of
     * its ColumnSpec).
     * </pre>
     *
     * <code>string column_display_name = 2;</code>
     *
     * @return The bytes for columnDisplayName.
     */
    public com.google.protobuf.ByteString getColumnDisplayNameBytes() {
      java.lang.Object ref = columnDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        columnDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The display name of the column (same as the display_name of
     * its ColumnSpec).
     * </pre>
     *
     * <code>string column_display_name = 2;</code>
     *
     * @param value The columnDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      columnDisplayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The display name of the column (same as the display_name of
     * its ColumnSpec).
     * </pre>
     *
     * <code>string column_display_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumnDisplayName() {

      columnDisplayName_ = getDefaultInstance().getColumnDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The display name of the column (same as the display_name of
     * its ColumnSpec).
     * </pre>
     *
     * <code>string column_display_name = 2;</code>
     *
     * @param value The bytes for columnDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      columnDisplayName_ = value;
      onChanged();
      return this;
    }

    private float featureImportance_;
    /**
     *
     *
     * <pre>
     * Output only. When given as part of a Model (always populated):
     * Measurement of how much model predictions correctness on the TEST data
     * depend on values in this column. A value between 0 and 1, higher means
     * higher influence. These values are normalized - for all input feature
     * columns of a given model they add to 1.
     * When given back by Predict (populated iff
     * [feature_importance
     * param][google.cloud.automl.v1beta1.PredictRequest.params] is set) or Batch
     * Predict (populated iff
     * [feature_importance][google.cloud.automl.v1beta1.PredictRequest.params]
     * param is set):
     * Measurement of how impactful for the prediction returned for the given row
     * the value in this column was. Specifically, the feature importance
     * specifies the marginal contribution that the feature made to the prediction
     * score compared to the baseline score. These values are computed using the
     * Sampled Shapley method.
     * </pre>
     *
     * <code>float feature_importance = 3;</code>
     *
     * @return The featureImportance.
     */
    @java.lang.Override
    public float getFeatureImportance() {
      return featureImportance_;
    }
    /**
     *
     *
     * <pre>
     * Output only. When given as part of a Model (always populated):
     * Measurement of how much model predictions correctness on the TEST data
     * depend on values in this column. A value between 0 and 1, higher means
     * higher influence. These values are normalized - for all input feature
     * columns of a given model they add to 1.
     * When given back by Predict (populated iff
     * [feature_importance
     * param][google.cloud.automl.v1beta1.PredictRequest.params] is set) or Batch
     * Predict (populated iff
     * [feature_importance][google.cloud.automl.v1beta1.PredictRequest.params]
     * param is set):
     * Measurement of how impactful for the prediction returned for the given row
     * the value in this column was. Specifically, the feature importance
     * specifies the marginal contribution that the feature made to the prediction
     * score compared to the baseline score. These values are computed using the
     * Sampled Shapley method.
     * </pre>
     *
     * <code>float feature_importance = 3;</code>
     *
     * @param value The featureImportance to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureImportance(float value) {

      featureImportance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. When given as part of a Model (always populated):
     * Measurement of how much model predictions correctness on the TEST data
     * depend on values in this column. A value between 0 and 1, higher means
     * higher influence. These values are normalized - for all input feature
     * columns of a given model they add to 1.
     * When given back by Predict (populated iff
     * [feature_importance
     * param][google.cloud.automl.v1beta1.PredictRequest.params] is set) or Batch
     * Predict (populated iff
     * [feature_importance][google.cloud.automl.v1beta1.PredictRequest.params]
     * param is set):
     * Measurement of how impactful for the prediction returned for the given row
     * the value in this column was. Specifically, the feature importance
     * specifies the marginal contribution that the feature made to the prediction
     * score compared to the baseline score. These values are computed using the
     * Sampled Shapley method.
     * </pre>
     *
     * <code>float feature_importance = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureImportance() {

      featureImportance_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TablesModelColumnInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TablesModelColumnInfo)
  private static final com.google.cloud.automl.v1beta1.TablesModelColumnInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TablesModelColumnInfo();
  }

  public static com.google.cloud.automl.v1beta1.TablesModelColumnInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TablesModelColumnInfo> PARSER =
      new com.google.protobuf.AbstractParser<TablesModelColumnInfo>() {
        @java.lang.Override
        public TablesModelColumnInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TablesModelColumnInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TablesModelColumnInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TablesModelColumnInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TablesModelColumnInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
