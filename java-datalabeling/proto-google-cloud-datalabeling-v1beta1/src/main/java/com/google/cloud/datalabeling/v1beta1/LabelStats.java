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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Statistics about annotation specs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelStats}
 */
public final class LabelStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.LabelStats)
    LabelStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LabelStats.newBuilder() to construct.
  private LabelStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LabelStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LabelStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetExampleCount();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.LabelStats.class,
            com.google.cloud.datalabeling.v1beta1.LabelStats.Builder.class);
  }

  public static final int EXAMPLE_COUNT_FIELD_NUMBER = 1;

  private static final class ExampleCountDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.Long>newDefaultInstance(
            com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
                .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> exampleCount_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetExampleCount() {
    if (exampleCount_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ExampleCountDefaultEntryHolder.defaultEntry);
    }
    return exampleCount_;
  }

  public int getExampleCountCount() {
    return internalGetExampleCount().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map of each annotation spec's example count. Key is the annotation spec
   * name and value is the number of examples for that annotation spec.
   * If the annotated dataset does not have annotation spec, the map will return
   * a pair where the key is empty string and value is the total number of
   * annotations.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; example_count = 1;</code>
   */
  @java.lang.Override
  public boolean containsExampleCount(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetExampleCount().getMap().containsKey(key);
  }
  /** Use {@link #getExampleCountMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getExampleCount() {
    return getExampleCountMap();
  }
  /**
   *
   *
   * <pre>
   * Map of each annotation spec's example count. Key is the annotation spec
   * name and value is the number of examples for that annotation spec.
   * If the annotated dataset does not have annotation spec, the map will return
   * a pair where the key is empty string and value is the total number of
   * annotations.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; example_count = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getExampleCountMap() {
    return internalGetExampleCount().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map of each annotation spec's example count. Key is the annotation spec
   * name and value is the number of examples for that annotation spec.
   * If the annotated dataset does not have annotation spec, the map will return
   * a pair where the key is empty string and value is the total number of
   * annotations.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; example_count = 1;</code>
   */
  @java.lang.Override
  public long getExampleCountOrDefault(java.lang.String key, long defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetExampleCount().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map of each annotation spec's example count. Key is the annotation spec
   * name and value is the number of examples for that annotation spec.
   * If the annotated dataset does not have annotation spec, the map will return
   * a pair where the key is empty string and value is the total number of
   * annotations.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; example_count = 1;</code>
   */
  @java.lang.Override
  public long getExampleCountOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetExampleCount().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetExampleCount(), ExampleCountDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry :
        internalGetExampleCount().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> exampleCount__ =
          ExampleCountDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, exampleCount__);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.LabelStats)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.LabelStats other =
        (com.google.cloud.datalabeling.v1beta1.LabelStats) obj;

    if (!internalGetExampleCount().equals(other.internalGetExampleCount())) return false;
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
    if (!internalGetExampleCount().getMap().isEmpty()) {
      hash = (37 * hash) + EXAMPLE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetExampleCount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.LabelStats prototype) {
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
   * Statistics about annotation specs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.LabelStats)
      com.google.cloud.datalabeling.v1beta1.LabelStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetExampleCount();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableExampleCount();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.LabelStats.class,
              com.google.cloud.datalabeling.v1beta1.LabelStats.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.LabelStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableExampleCount().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelStats getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.LabelStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelStats build() {
      com.google.cloud.datalabeling.v1beta1.LabelStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelStats buildPartial() {
      com.google.cloud.datalabeling.v1beta1.LabelStats result =
          new com.google.cloud.datalabeling.v1beta1.LabelStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.LabelStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exampleCount_ = internalGetExampleCount();
        result.exampleCount_.makeImmutable();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.LabelStats) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.LabelStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.LabelStats other) {
      if (other == com.google.cloud.datalabeling.v1beta1.LabelStats.getDefaultInstance())
        return this;
      internalGetMutableExampleCount().mergeFrom(other.internalGetExampleCount());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> exampleCount__ =
                    input.readMessage(
                        ExampleCountDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableExampleCount()
                    .getMutableMap()
                    .put(exampleCount__.getKey(), exampleCount__.getValue());
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> exampleCount_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetExampleCount() {
      if (exampleCount_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExampleCountDefaultEntryHolder.defaultEntry);
      }
      return exampleCount_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableExampleCount() {
      if (exampleCount_ == null) {
        exampleCount_ =
            com.google.protobuf.MapField.newMapField(ExampleCountDefaultEntryHolder.defaultEntry);
      }
      if (!exampleCount_.isMutable()) {
        exampleCount_ = exampleCount_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return exampleCount_;
    }

    public int getExampleCountCount() {
      return internalGetExampleCount().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    @java.lang.Override
    public boolean containsExampleCount(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetExampleCount().getMap().containsKey(key);
    }
    /** Use {@link #getExampleCountMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getExampleCount() {
      return getExampleCountMap();
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getExampleCountMap() {
      return internalGetExampleCount().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    @java.lang.Override
    public long getExampleCountOrDefault(java.lang.String key, long defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetExampleCount().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    @java.lang.Override
    public long getExampleCountOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetExampleCount().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearExampleCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableExampleCount().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    public Builder removeExampleCount(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableExampleCount().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMutableExampleCount() {
      bitField0_ |= 0x00000001;
      return internalGetMutableExampleCount().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    public Builder putExampleCount(java.lang.String key, long value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }

      internalGetMutableExampleCount().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of each annotation spec's example count. Key is the annotation spec
     * name and value is the number of examples for that annotation spec.
     * If the annotated dataset does not have annotation spec, the map will return
     * a pair where the key is empty string and value is the total number of
     * annotations.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; example_count = 1;</code>
     */
    public Builder putAllExampleCount(java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableExampleCount().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.LabelStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.LabelStats)
  private static final com.google.cloud.datalabeling.v1beta1.LabelStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.LabelStats();
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelStats> PARSER =
      new com.google.protobuf.AbstractParser<LabelStats>() {
        @java.lang.Override
        public LabelStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<LabelStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.LabelStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
