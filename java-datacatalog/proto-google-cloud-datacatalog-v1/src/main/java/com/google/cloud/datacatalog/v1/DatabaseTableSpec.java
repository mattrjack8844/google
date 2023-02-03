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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification that applies to a table resource. Valid only
 * for entries with the `TABLE` type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DatabaseTableSpec}
 */
public final class DatabaseTableSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DatabaseTableSpec)
    DatabaseTableSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DatabaseTableSpec.newBuilder() to construct.
  private DatabaseTableSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DatabaseTableSpec() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DatabaseTableSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_DatabaseTableSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_DatabaseTableSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DatabaseTableSpec.class,
            com.google.cloud.datacatalog.v1.DatabaseTableSpec.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of the table.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datacatalog.v1.DatabaseTableSpec.TableType}
   */
  public enum TableType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default unknown table type.
     * </pre>
     *
     * <code>TABLE_TYPE_UNSPECIFIED = 0;</code>
     */
    TABLE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Native table.
     * </pre>
     *
     * <code>NATIVE = 1;</code>
     */
    NATIVE(1),
    /**
     *
     *
     * <pre>
     * External table.
     * </pre>
     *
     * <code>EXTERNAL = 2;</code>
     */
    EXTERNAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default unknown table type.
     * </pre>
     *
     * <code>TABLE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TABLE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Native table.
     * </pre>
     *
     * <code>NATIVE = 1;</code>
     */
    public static final int NATIVE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * External table.
     * </pre>
     *
     * <code>EXTERNAL = 2;</code>
     */
    public static final int EXTERNAL_VALUE = 2;

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
    public static TableType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TableType forNumber(int value) {
      switch (value) {
        case 0:
          return TABLE_TYPE_UNSPECIFIED;
        case 1:
          return NATIVE;
        case 2:
          return EXTERNAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TableType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TableType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TableType>() {
          public TableType findValueByNumber(int number) {
            return TableType.forNumber(number);
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
      return com.google.cloud.datacatalog.v1.DatabaseTableSpec.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final TableType[] VALUES = values();

    public static TableType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TableType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.DatabaseTableSpec.TableType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Type of this table.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Type of this table.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType getType() {
    com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType result =
        com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.forNumber(type_);
    return result == null
        ? com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.UNRECOGNIZED
        : result;
  }

  public static final int DATAPLEX_TABLE_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.DataplexTableSpec dataplexTable_;
  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataplexTable field is set.
   */
  @java.lang.Override
  public boolean hasDataplexTable() {
    return dataplexTable_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataplexTable.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexTableSpec getDataplexTable() {
    return dataplexTable_ == null
        ? com.google.cloud.datacatalog.v1.DataplexTableSpec.getDefaultInstance()
        : dataplexTable_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder getDataplexTableOrBuilder() {
    return dataplexTable_ == null
        ? com.google.cloud.datacatalog.v1.DataplexTableSpec.getDefaultInstance()
        : dataplexTable_;
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
    if (type_
        != com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.TABLE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, type_);
    }
    if (dataplexTable_ != null) {
      output.writeMessage(2, getDataplexTable());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.TABLE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (dataplexTable_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDataplexTable());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DatabaseTableSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DatabaseTableSpec other =
        (com.google.cloud.datacatalog.v1.DatabaseTableSpec) obj;

    if (type_ != other.type_) return false;
    if (hasDataplexTable() != other.hasDataplexTable()) return false;
    if (hasDataplexTable()) {
      if (!getDataplexTable().equals(other.getDataplexTable())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasDataplexTable()) {
      hash = (37 * hash) + DATAPLEX_TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getDataplexTable().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.DatabaseTableSpec prototype) {
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
   * Specification that applies to a table resource. Valid only
   * for entries with the `TABLE` type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DatabaseTableSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DatabaseTableSpec)
      com.google.cloud.datacatalog.v1.DatabaseTableSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_DatabaseTableSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_DatabaseTableSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DatabaseTableSpec.class,
              com.google.cloud.datacatalog.v1.DatabaseTableSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DatabaseTableSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      dataplexTable_ = null;
      if (dataplexTableBuilder_ != null) {
        dataplexTableBuilder_.dispose();
        dataplexTableBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_DatabaseTableSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DatabaseTableSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DatabaseTableSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DatabaseTableSpec build() {
      com.google.cloud.datacatalog.v1.DatabaseTableSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DatabaseTableSpec buildPartial() {
      com.google.cloud.datacatalog.v1.DatabaseTableSpec result =
          new com.google.cloud.datacatalog.v1.DatabaseTableSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.DatabaseTableSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataplexTable_ =
            dataplexTableBuilder_ == null ? dataplexTable_ : dataplexTableBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.DatabaseTableSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DatabaseTableSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DatabaseTableSpec other) {
      if (other == com.google.cloud.datacatalog.v1.DatabaseTableSpec.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasDataplexTable()) {
        mergeDataplexTable(other.getDataplexTable());
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
                type_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getDataplexTableFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of this table.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Type of this table.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of this table.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType getType() {
      com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType result =
          com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.forNumber(type_);
      return result == null
          ? com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of this table.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of this table.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.DataplexTableSpec dataplexTable_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexTableSpec,
            com.google.cloud.datacatalog.v1.DataplexTableSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder>
        dataplexTableBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the dataplexTable field is set.
     */
    public boolean hasDataplexTable() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The dataplexTable.
     */
    public com.google.cloud.datacatalog.v1.DataplexTableSpec getDataplexTable() {
      if (dataplexTableBuilder_ == null) {
        return dataplexTable_ == null
            ? com.google.cloud.datacatalog.v1.DataplexTableSpec.getDefaultInstance()
            : dataplexTable_;
      } else {
        return dataplexTableBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setDataplexTable(com.google.cloud.datacatalog.v1.DataplexTableSpec value) {
      if (dataplexTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataplexTable_ = value;
      } else {
        dataplexTableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setDataplexTable(
        com.google.cloud.datacatalog.v1.DataplexTableSpec.Builder builderForValue) {
      if (dataplexTableBuilder_ == null) {
        dataplexTable_ = builderForValue.build();
      } else {
        dataplexTableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeDataplexTable(com.google.cloud.datacatalog.v1.DataplexTableSpec value) {
      if (dataplexTableBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataplexTable_ != null
            && dataplexTable_
                != com.google.cloud.datacatalog.v1.DataplexTableSpec.getDefaultInstance()) {
          getDataplexTableBuilder().mergeFrom(value);
        } else {
          dataplexTable_ = value;
        }
      } else {
        dataplexTableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearDataplexTable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataplexTable_ = null;
      if (dataplexTableBuilder_ != null) {
        dataplexTableBuilder_.dispose();
        dataplexTableBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.DataplexTableSpec.Builder getDataplexTableBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataplexTableFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder getDataplexTableOrBuilder() {
      if (dataplexTableBuilder_ != null) {
        return dataplexTableBuilder_.getMessageOrBuilder();
      } else {
        return dataplexTable_ == null
            ? com.google.cloud.datacatalog.v1.DataplexTableSpec.getDefaultInstance()
            : dataplexTable_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Fields specific to a Dataplex table and present only in the
     * Dataplex table entries.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexTableSpec,
            com.google.cloud.datacatalog.v1.DataplexTableSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder>
        getDataplexTableFieldBuilder() {
      if (dataplexTableBuilder_ == null) {
        dataplexTableBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.DataplexTableSpec,
                com.google.cloud.datacatalog.v1.DataplexTableSpec.Builder,
                com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder>(
                getDataplexTable(), getParentForChildren(), isClean());
        dataplexTable_ = null;
      }
      return dataplexTableBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DatabaseTableSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DatabaseTableSpec)
  private static final com.google.cloud.datacatalog.v1.DatabaseTableSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DatabaseTableSpec();
  }

  public static com.google.cloud.datacatalog.v1.DatabaseTableSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseTableSpec> PARSER =
      new com.google.protobuf.AbstractParser<DatabaseTableSpec>() {
        @java.lang.Override
        public DatabaseTableSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatabaseTableSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseTableSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DatabaseTableSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
