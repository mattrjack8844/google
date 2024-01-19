/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/bigquery/migration/v2/translation_config.proto

package com.google.cloud.bigquery.migration.v2;

/**
 *
 *
 * <pre>
 * Represents a map of name mappings using a list of key:value proto messages of
 * existing name to desired output name.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2.ObjectNameMappingList}
 */
public final class ObjectNameMappingList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2.ObjectNameMappingList)
    ObjectNameMappingListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectNameMappingList.newBuilder() to construct.
  private ObjectNameMappingList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectNameMappingList() {
    nameMap_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ObjectNameMappingList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
        .internal_static_google_cloud_bigquery_migration_v2_ObjectNameMappingList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
        .internal_static_google_cloud_bigquery_migration_v2_ObjectNameMappingList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.class,
            com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.Builder.class);
  }

  public static final int NAME_MAP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping> nameMap_;
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping> getNameMapList() {
    return nameMap_;
  }
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>
      getNameMapOrBuilderList() {
    return nameMap_;
  }
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  @java.lang.Override
  public int getNameMapCount() {
    return nameMap_.size();
  }
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.ObjectNameMapping getNameMap(int index) {
    return nameMap_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder getNameMapOrBuilder(
      int index) {
    return nameMap_.get(index);
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
    for (int i = 0; i < nameMap_.size(); i++) {
      output.writeMessage(1, nameMap_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nameMap_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, nameMap_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2.ObjectNameMappingList)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2.ObjectNameMappingList other =
        (com.google.cloud.bigquery.migration.v2.ObjectNameMappingList) obj;

    if (!getNameMapList().equals(other.getNameMapList())) return false;
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
    if (getNameMapCount() > 0) {
      hash = (37 * hash) + NAME_MAP_FIELD_NUMBER;
      hash = (53 * hash) + getNameMapList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList parseFrom(
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
      com.google.cloud.bigquery.migration.v2.ObjectNameMappingList prototype) {
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
   * Represents a map of name mappings using a list of key:value proto messages of
   * existing name to desired output name.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2.ObjectNameMappingList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2.ObjectNameMappingList)
      com.google.cloud.bigquery.migration.v2.ObjectNameMappingListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_ObjectNameMappingList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_ObjectNameMappingList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.class,
              com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (nameMapBuilder_ == null) {
        nameMap_ = java.util.Collections.emptyList();
      } else {
        nameMap_ = null;
        nameMapBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_ObjectNameMappingList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMappingList
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMappingList build() {
      com.google.cloud.bigquery.migration.v2.ObjectNameMappingList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMappingList buildPartial() {
      com.google.cloud.bigquery.migration.v2.ObjectNameMappingList result =
          new com.google.cloud.bigquery.migration.v2.ObjectNameMappingList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.bigquery.migration.v2.ObjectNameMappingList result) {
      if (nameMapBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nameMap_ = java.util.Collections.unmodifiableList(nameMap_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nameMap_ = nameMap_;
      } else {
        result.nameMap_ = nameMapBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.bigquery.migration.v2.ObjectNameMappingList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2.ObjectNameMappingList) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2.ObjectNameMappingList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2.ObjectNameMappingList other) {
      if (other
          == com.google.cloud.bigquery.migration.v2.ObjectNameMappingList.getDefaultInstance())
        return this;
      if (nameMapBuilder_ == null) {
        if (!other.nameMap_.isEmpty()) {
          if (nameMap_.isEmpty()) {
            nameMap_ = other.nameMap_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNameMapIsMutable();
            nameMap_.addAll(other.nameMap_);
          }
          onChanged();
        }
      } else {
        if (!other.nameMap_.isEmpty()) {
          if (nameMapBuilder_.isEmpty()) {
            nameMapBuilder_.dispose();
            nameMapBuilder_ = null;
            nameMap_ = other.nameMap_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nameMapBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNameMapFieldBuilder()
                    : null;
          } else {
            nameMapBuilder_.addAllMessages(other.nameMap_);
          }
        }
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
                com.google.cloud.bigquery.migration.v2.ObjectNameMapping m =
                    input.readMessage(
                        com.google.cloud.bigquery.migration.v2.ObjectNameMapping.parser(),
                        extensionRegistry);
                if (nameMapBuilder_ == null) {
                  ensureNameMapIsMutable();
                  nameMap_.add(m);
                } else {
                  nameMapBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping> nameMap_ =
        java.util.Collections.emptyList();

    private void ensureNameMapIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nameMap_ =
            new java.util.ArrayList<com.google.cloud.bigquery.migration.v2.ObjectNameMapping>(
                nameMap_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.ObjectNameMapping,
            com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder,
            com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>
        nameMapBuilder_;

    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping>
        getNameMapList() {
      if (nameMapBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nameMap_);
      } else {
        return nameMapBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public int getNameMapCount() {
      if (nameMapBuilder_ == null) {
        return nameMap_.size();
      } else {
        return nameMapBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping getNameMap(int index) {
      if (nameMapBuilder_ == null) {
        return nameMap_.get(index);
      } else {
        return nameMapBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder setNameMap(
        int index, com.google.cloud.bigquery.migration.v2.ObjectNameMapping value) {
      if (nameMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameMapIsMutable();
        nameMap_.set(index, value);
        onChanged();
      } else {
        nameMapBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder setNameMap(
        int index,
        com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder builderForValue) {
      if (nameMapBuilder_ == null) {
        ensureNameMapIsMutable();
        nameMap_.set(index, builderForValue.build());
        onChanged();
      } else {
        nameMapBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder addNameMap(com.google.cloud.bigquery.migration.v2.ObjectNameMapping value) {
      if (nameMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameMapIsMutable();
        nameMap_.add(value);
        onChanged();
      } else {
        nameMapBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder addNameMap(
        int index, com.google.cloud.bigquery.migration.v2.ObjectNameMapping value) {
      if (nameMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNameMapIsMutable();
        nameMap_.add(index, value);
        onChanged();
      } else {
        nameMapBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder addNameMap(
        com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder builderForValue) {
      if (nameMapBuilder_ == null) {
        ensureNameMapIsMutable();
        nameMap_.add(builderForValue.build());
        onChanged();
      } else {
        nameMapBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder addNameMap(
        int index,
        com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder builderForValue) {
      if (nameMapBuilder_ == null) {
        ensureNameMapIsMutable();
        nameMap_.add(index, builderForValue.build());
        onChanged();
      } else {
        nameMapBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder addAllNameMap(
        java.lang.Iterable<? extends com.google.cloud.bigquery.migration.v2.ObjectNameMapping>
            values) {
      if (nameMapBuilder_ == null) {
        ensureNameMapIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nameMap_);
        onChanged();
      } else {
        nameMapBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder clearNameMap() {
      if (nameMapBuilder_ == null) {
        nameMap_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nameMapBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public Builder removeNameMap(int index) {
      if (nameMapBuilder_ == null) {
        ensureNameMapIsMutable();
        nameMap_.remove(index);
        onChanged();
      } else {
        nameMapBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder getNameMapBuilder(
        int index) {
      return getNameMapFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder getNameMapOrBuilder(
        int index) {
      if (nameMapBuilder_ == null) {
        return nameMap_.get(index);
      } else {
        return nameMapBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>
        getNameMapOrBuilderList() {
      if (nameMapBuilder_ != null) {
        return nameMapBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nameMap_);
      }
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder addNameMapBuilder() {
      return getNameMapFieldBuilder()
          .addBuilder(
              com.google.cloud.bigquery.migration.v2.ObjectNameMapping.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder addNameMapBuilder(
        int index) {
      return getNameMapFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.migration.v2.ObjectNameMapping.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The elements of the object name map.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder>
        getNameMapBuilderList() {
      return getNameMapFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.ObjectNameMapping,
            com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder,
            com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>
        getNameMapFieldBuilder() {
      if (nameMapBuilder_ == null) {
        nameMapBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.migration.v2.ObjectNameMapping,
                com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder,
                com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>(
                nameMap_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        nameMap_ = null;
      }
      return nameMapBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2.ObjectNameMappingList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2.ObjectNameMappingList)
  private static final com.google.cloud.bigquery.migration.v2.ObjectNameMappingList
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2.ObjectNameMappingList();
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMappingList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectNameMappingList> PARSER =
      new com.google.protobuf.AbstractParser<ObjectNameMappingList>() {
        @java.lang.Override
        public ObjectNameMappingList parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectNameMappingList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectNameMappingList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.ObjectNameMappingList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
