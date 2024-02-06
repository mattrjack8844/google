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
 * External table registered by Dataplex.
 * Dataplex publishes data discovered from an asset into multiple other systems
 * (BigQuery, DPMS) in form of tables. We call them "external tables". External
 * tables are also synced into the Data Catalog.
 * This message contains pointers to
 * those external tables (fully qualified name, resource name et cetera) within
 * the Data Catalog.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DataplexExternalTable}
 */
public final class DataplexExternalTable extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DataplexExternalTable)
    DataplexExternalTableOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataplexExternalTable.newBuilder() to construct.
  private DataplexExternalTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataplexExternalTable() {
    system_ = 0;
    fullyQualifiedName_ = "";
    googleCloudResource_ = "";
    dataCatalogEntry_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataplexExternalTable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.DataplexSpecProto
        .internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.DataplexSpecProto
        .internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DataplexExternalTable.class,
            com.google.cloud.datacatalog.v1.DataplexExternalTable.Builder.class);
  }

  public static final int SYSTEM_FIELD_NUMBER = 1;
  private int system_ = 0;
  /**
   *
   *
   * <pre>
   * Service in which the external table is registered.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
   *
   * @return The enum numeric value on the wire for system.
   */
  @java.lang.Override
  public int getSystemValue() {
    return system_;
  }
  /**
   *
   *
   * <pre>
   * Service in which the external table is registered.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
   *
   * @return The system.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.IntegratedSystem getSystem() {
    com.google.cloud.datacatalog.v1.IntegratedSystem result =
        com.google.cloud.datacatalog.v1.IntegratedSystem.forNumber(system_);
    return result == null ? com.google.cloud.datacatalog.v1.IntegratedSystem.UNRECOGNIZED : result;
  }

  public static final int FULLY_QUALIFIED_NAME_FIELD_NUMBER = 28;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fullyQualifiedName_ = "";
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the external table.
   * </pre>
   *
   * <code>string fully_qualified_name = 28;</code>
   *
   * @return The fullyQualifiedName.
   */
  @java.lang.Override
  public java.lang.String getFullyQualifiedName() {
    java.lang.Object ref = fullyQualifiedName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullyQualifiedName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the external table.
   * </pre>
   *
   * <code>string fully_qualified_name = 28;</code>
   *
   * @return The bytes for fullyQualifiedName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFullyQualifiedNameBytes() {
    java.lang.Object ref = fullyQualifiedName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fullyQualifiedName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOOGLE_CLOUD_RESOURCE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object googleCloudResource_ = "";
  /**
   *
   *
   * <pre>
   * Google Cloud resource name of the external table.
   * </pre>
   *
   * <code>string google_cloud_resource = 3;</code>
   *
   * @return The googleCloudResource.
   */
  @java.lang.Override
  public java.lang.String getGoogleCloudResource() {
    java.lang.Object ref = googleCloudResource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      googleCloudResource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Google Cloud resource name of the external table.
   * </pre>
   *
   * <code>string google_cloud_resource = 3;</code>
   *
   * @return The bytes for googleCloudResource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGoogleCloudResourceBytes() {
    java.lang.Object ref = googleCloudResource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      googleCloudResource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_CATALOG_ENTRY_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataCatalogEntry_ = "";
  /**
   *
   *
   * <pre>
   * Name of the Data Catalog entry representing the external table.
   * </pre>
   *
   * <code>string data_catalog_entry = 4;</code>
   *
   * @return The dataCatalogEntry.
   */
  @java.lang.Override
  public java.lang.String getDataCatalogEntry() {
    java.lang.Object ref = dataCatalogEntry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataCatalogEntry_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the Data Catalog entry representing the external table.
   * </pre>
   *
   * <code>string data_catalog_entry = 4;</code>
   *
   * @return The bytes for dataCatalogEntry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataCatalogEntryBytes() {
    java.lang.Object ref = dataCatalogEntry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataCatalogEntry_ = b;
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
    if (system_
        != com.google.cloud.datacatalog.v1.IntegratedSystem.INTEGRATED_SYSTEM_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, system_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(googleCloudResource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, googleCloudResource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataCatalogEntry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dataCatalogEntry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullyQualifiedName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 28, fullyQualifiedName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (system_
        != com.google.cloud.datacatalog.v1.IntegratedSystem.INTEGRATED_SYSTEM_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, system_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(googleCloudResource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, googleCloudResource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataCatalogEntry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dataCatalogEntry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullyQualifiedName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(28, fullyQualifiedName_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DataplexExternalTable)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DataplexExternalTable other =
        (com.google.cloud.datacatalog.v1.DataplexExternalTable) obj;

    if (system_ != other.system_) return false;
    if (!getFullyQualifiedName().equals(other.getFullyQualifiedName())) return false;
    if (!getGoogleCloudResource().equals(other.getGoogleCloudResource())) return false;
    if (!getDataCatalogEntry().equals(other.getDataCatalogEntry())) return false;
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
    hash = (37 * hash) + SYSTEM_FIELD_NUMBER;
    hash = (53 * hash) + system_;
    hash = (37 * hash) + FULLY_QUALIFIED_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullyQualifiedName().hashCode();
    hash = (37 * hash) + GOOGLE_CLOUD_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getGoogleCloudResource().hashCode();
    hash = (37 * hash) + DATA_CATALOG_ENTRY_FIELD_NUMBER;
    hash = (53 * hash) + getDataCatalogEntry().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable parseFrom(
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
      com.google.cloud.datacatalog.v1.DataplexExternalTable prototype) {
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
   * External table registered by Dataplex.
   * Dataplex publishes data discovered from an asset into multiple other systems
   * (BigQuery, DPMS) in form of tables. We call them "external tables". External
   * tables are also synced into the Data Catalog.
   * This message contains pointers to
   * those external tables (fully qualified name, resource name et cetera) within
   * the Data Catalog.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DataplexExternalTable}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DataplexExternalTable)
      com.google.cloud.datacatalog.v1.DataplexExternalTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DataplexExternalTable.class,
              com.google.cloud.datacatalog.v1.DataplexExternalTable.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DataplexExternalTable.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      system_ = 0;
      fullyQualifiedName_ = "";
      googleCloudResource_ = "";
      dataCatalogEntry_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto
          .internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexExternalTable getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DataplexExternalTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexExternalTable build() {
      com.google.cloud.datacatalog.v1.DataplexExternalTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexExternalTable buildPartial() {
      com.google.cloud.datacatalog.v1.DataplexExternalTable result =
          new com.google.cloud.datacatalog.v1.DataplexExternalTable(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.DataplexExternalTable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.system_ = system_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fullyQualifiedName_ = fullyQualifiedName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.googleCloudResource_ = googleCloudResource_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dataCatalogEntry_ = dataCatalogEntry_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.DataplexExternalTable) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DataplexExternalTable) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DataplexExternalTable other) {
      if (other == com.google.cloud.datacatalog.v1.DataplexExternalTable.getDefaultInstance())
        return this;
      if (other.system_ != 0) {
        setSystemValue(other.getSystemValue());
      }
      if (!other.getFullyQualifiedName().isEmpty()) {
        fullyQualifiedName_ = other.fullyQualifiedName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getGoogleCloudResource().isEmpty()) {
        googleCloudResource_ = other.googleCloudResource_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDataCatalogEntry().isEmpty()) {
        dataCatalogEntry_ = other.dataCatalogEntry_;
        bitField0_ |= 0x00000008;
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
            case 8:
              {
                system_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 26:
              {
                googleCloudResource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                dataCatalogEntry_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
            case 226:
              {
                fullyQualifiedName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 226
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

    private int system_ = 0;
    /**
     *
     *
     * <pre>
     * Service in which the external table is registered.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
     *
     * @return The enum numeric value on the wire for system.
     */
    @java.lang.Override
    public int getSystemValue() {
      return system_;
    }
    /**
     *
     *
     * <pre>
     * Service in which the external table is registered.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
     *
     * @param value The enum numeric value on the wire for system to set.
     * @return This builder for chaining.
     */
    public Builder setSystemValue(int value) {
      system_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service in which the external table is registered.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
     *
     * @return The system.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.IntegratedSystem getSystem() {
      com.google.cloud.datacatalog.v1.IntegratedSystem result =
          com.google.cloud.datacatalog.v1.IntegratedSystem.forNumber(system_);
      return result == null
          ? com.google.cloud.datacatalog.v1.IntegratedSystem.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Service in which the external table is registered.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
     *
     * @param value The system to set.
     * @return This builder for chaining.
     */
    public Builder setSystem(com.google.cloud.datacatalog.v1.IntegratedSystem value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      system_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service in which the external table is registered.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSystem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      system_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fullyQualifiedName_ = "";
    /**
     *
     *
     * <pre>
     * Fully qualified name (FQN) of the external table.
     * </pre>
     *
     * <code>string fully_qualified_name = 28;</code>
     *
     * @return The fullyQualifiedName.
     */
    public java.lang.String getFullyQualifiedName() {
      java.lang.Object ref = fullyQualifiedName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullyQualifiedName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name (FQN) of the external table.
     * </pre>
     *
     * <code>string fully_qualified_name = 28;</code>
     *
     * @return The bytes for fullyQualifiedName.
     */
    public com.google.protobuf.ByteString getFullyQualifiedNameBytes() {
      java.lang.Object ref = fullyQualifiedName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fullyQualifiedName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name (FQN) of the external table.
     * </pre>
     *
     * <code>string fully_qualified_name = 28;</code>
     *
     * @param value The fullyQualifiedName to set.
     * @return This builder for chaining.
     */
    public Builder setFullyQualifiedName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fullyQualifiedName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name (FQN) of the external table.
     * </pre>
     *
     * <code>string fully_qualified_name = 28;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFullyQualifiedName() {
      fullyQualifiedName_ = getDefaultInstance().getFullyQualifiedName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified name (FQN) of the external table.
     * </pre>
     *
     * <code>string fully_qualified_name = 28;</code>
     *
     * @param value The bytes for fullyQualifiedName to set.
     * @return This builder for chaining.
     */
    public Builder setFullyQualifiedNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fullyQualifiedName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object googleCloudResource_ = "";
    /**
     *
     *
     * <pre>
     * Google Cloud resource name of the external table.
     * </pre>
     *
     * <code>string google_cloud_resource = 3;</code>
     *
     * @return The googleCloudResource.
     */
    public java.lang.String getGoogleCloudResource() {
      java.lang.Object ref = googleCloudResource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        googleCloudResource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud resource name of the external table.
     * </pre>
     *
     * <code>string google_cloud_resource = 3;</code>
     *
     * @return The bytes for googleCloudResource.
     */
    public com.google.protobuf.ByteString getGoogleCloudResourceBytes() {
      java.lang.Object ref = googleCloudResource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        googleCloudResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud resource name of the external table.
     * </pre>
     *
     * <code>string google_cloud_resource = 3;</code>
     *
     * @param value The googleCloudResource to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleCloudResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      googleCloudResource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud resource name of the external table.
     * </pre>
     *
     * <code>string google_cloud_resource = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoogleCloudResource() {
      googleCloudResource_ = getDefaultInstance().getGoogleCloudResource();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud resource name of the external table.
     * </pre>
     *
     * <code>string google_cloud_resource = 3;</code>
     *
     * @param value The bytes for googleCloudResource to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleCloudResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      googleCloudResource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object dataCatalogEntry_ = "";
    /**
     *
     *
     * <pre>
     * Name of the Data Catalog entry representing the external table.
     * </pre>
     *
     * <code>string data_catalog_entry = 4;</code>
     *
     * @return The dataCatalogEntry.
     */
    public java.lang.String getDataCatalogEntry() {
      java.lang.Object ref = dataCatalogEntry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataCatalogEntry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Data Catalog entry representing the external table.
     * </pre>
     *
     * <code>string data_catalog_entry = 4;</code>
     *
     * @return The bytes for dataCatalogEntry.
     */
    public com.google.protobuf.ByteString getDataCatalogEntryBytes() {
      java.lang.Object ref = dataCatalogEntry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataCatalogEntry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Data Catalog entry representing the external table.
     * </pre>
     *
     * <code>string data_catalog_entry = 4;</code>
     *
     * @param value The dataCatalogEntry to set.
     * @return This builder for chaining.
     */
    public Builder setDataCatalogEntry(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataCatalogEntry_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Data Catalog entry representing the external table.
     * </pre>
     *
     * <code>string data_catalog_entry = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataCatalogEntry() {
      dataCatalogEntry_ = getDefaultInstance().getDataCatalogEntry();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Data Catalog entry representing the external table.
     * </pre>
     *
     * <code>string data_catalog_entry = 4;</code>
     *
     * @param value The bytes for dataCatalogEntry to set.
     * @return This builder for chaining.
     */
    public Builder setDataCatalogEntryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataCatalogEntry_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DataplexExternalTable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DataplexExternalTable)
  private static final com.google.cloud.datacatalog.v1.DataplexExternalTable DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DataplexExternalTable();
  }

  public static com.google.cloud.datacatalog.v1.DataplexExternalTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataplexExternalTable> PARSER =
      new com.google.protobuf.AbstractParser<DataplexExternalTable>() {
        @java.lang.Override
        public DataplexExternalTable parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataplexExternalTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataplexExternalTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexExternalTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
