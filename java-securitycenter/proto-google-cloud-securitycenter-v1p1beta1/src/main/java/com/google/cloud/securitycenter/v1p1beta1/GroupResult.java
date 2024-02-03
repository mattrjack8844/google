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
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v1p1beta1;

/**
 *
 *
 * <pre>
 * Result containing the properties and count of a groupBy request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.GroupResult}
 */
public final class GroupResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1p1beta1.GroupResult)
    GroupResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GroupResult.newBuilder() to construct.
  private GroupResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GroupResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GroupResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetProperties();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1p1beta1.GroupResult.class,
            com.google.cloud.securitycenter.v1p1beta1.GroupResult.Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;

  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.protobuf.Value>newDefaultInstance(
                    com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
                        .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_PropertiesEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.protobuf.Value.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value> properties_;

  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value>
      internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }

  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  @java.lang.Override
  public boolean containsProperties(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetProperties().getMap().containsKey(key);
  }
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Value> getProperties() {
    return getPropertiesMap();
  }
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.Value> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.protobuf.Value getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.protobuf.Value> map =
        internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Value getPropertiesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.protobuf.Value> map =
        internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_ = 0L;
  /**
   *
   *
   * <pre>
   * Total count of resources for the given properties.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   *
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
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
        output, internalGetProperties(), PropertiesDefaultEntryHolder.defaultEntry, 1);
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> entry :
        internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value> properties__ =
          PropertiesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, properties__);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, count_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1p1beta1.GroupResult)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1p1beta1.GroupResult other =
        (com.google.cloud.securitycenter.v1p1beta1.GroupResult) obj;

    if (!internalGetProperties().equals(other.internalGetProperties())) return false;
    if (getCount() != other.getCount()) return false;
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
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult parseFrom(
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
      com.google.cloud.securitycenter.v1p1beta1.GroupResult prototype) {
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
   * Result containing the properties and count of a groupBy request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.GroupResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1p1beta1.GroupResult)
      com.google.cloud.securitycenter.v1p1beta1.GroupResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetProperties();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1p1beta1.GroupResult.class,
              com.google.cloud.securitycenter.v1p1beta1.GroupResult.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1p1beta1.GroupResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableProperties().clear();
      count_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1p1beta1_GroupResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.GroupResult getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1p1beta1.GroupResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.GroupResult build() {
      com.google.cloud.securitycenter.v1p1beta1.GroupResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.GroupResult buildPartial() {
      com.google.cloud.securitycenter.v1p1beta1.GroupResult result =
          new com.google.cloud.securitycenter.v1p1beta1.GroupResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1p1beta1.GroupResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.properties_ =
            internalGetProperties().build(PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
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
      if (other instanceof com.google.cloud.securitycenter.v1p1beta1.GroupResult) {
        return mergeFrom((com.google.cloud.securitycenter.v1p1beta1.GroupResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1p1beta1.GroupResult other) {
      if (other == com.google.cloud.securitycenter.v1p1beta1.GroupResult.getDefaultInstance())
        return this;
      internalGetMutableProperties().mergeFrom(other.internalGetProperties());
      bitField0_ |= 0x00000001;
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
                com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
                    properties__ =
                        input.readMessage(
                            PropertiesDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableProperties()
                    .ensureBuilderMap()
                    .put(properties__.getKey(), properties__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                count_ = input.readInt64();
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

    private static final class PropertiesConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String, com.google.protobuf.ValueOrBuilder, com.google.protobuf.Value> {
      @java.lang.Override
      public com.google.protobuf.Value build(com.google.protobuf.ValueOrBuilder val) {
        if (val instanceof com.google.protobuf.Value) {
          return (com.google.protobuf.Value) val;
        }
        return ((com.google.protobuf.Value.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
          defaultEntry() {
        return PropertiesDefaultEntryHolder.defaultEntry;
      }
    };

    private static final PropertiesConverter propertiesConverter = new PropertiesConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        properties_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        internalGetProperties() {
      if (properties_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(propertiesConverter);
      }
      return properties_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        internalGetMutableProperties() {
      if (properties_ == null) {
        properties_ = new com.google.protobuf.MapFieldBuilder<>(propertiesConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return properties_;
    }

    public int getPropertiesCount() {
      return internalGetProperties().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    @java.lang.Override
    public boolean containsProperties(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetProperties().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getPropertiesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getProperties() {
      return getPropertiesMap();
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getPropertiesMap() {
      return internalGetProperties().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.protobuf.Value getPropertiesOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.protobuf.Value defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> map =
          internalGetMutableProperties().ensureBuilderMap();
      return map.containsKey(key) ? propertiesConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Value getPropertiesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> map =
          internalGetMutableProperties().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return propertiesConverter.build(map.get(key));
    }

    public Builder clearProperties() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableProperties().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    public Builder removeProperties(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableProperties().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getMutableProperties() {
      bitField0_ |= 0x00000001;
      return internalGetMutableProperties().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    public Builder putProperties(java.lang.String key, com.google.protobuf.Value value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableProperties().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    public Builder putAllProperties(
        java.util.Map<java.lang.String, com.google.protobuf.Value> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableProperties().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties matching the groupBy fields in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
     */
    public com.google.protobuf.Value.Builder putPropertiesBuilderIfAbsent(java.lang.String key) {
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> builderMap =
          internalGetMutableProperties().ensureBuilderMap();
      com.google.protobuf.ValueOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.protobuf.Value.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.protobuf.Value) {
        entry = ((com.google.protobuf.Value) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.protobuf.Value.Builder) entry;
    }

    private long count_;
    /**
     *
     *
     * <pre>
     * Total count of resources for the given properties.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     *
     *
     * <pre>
     * Total count of resources for the given properties.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Total count of resources for the given properties.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1p1beta1.GroupResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1p1beta1.GroupResult)
  private static final com.google.cloud.securitycenter.v1p1beta1.GroupResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1p1beta1.GroupResult();
  }

  public static com.google.cloud.securitycenter.v1p1beta1.GroupResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupResult> PARSER =
      new com.google.protobuf.AbstractParser<GroupResult>() {
        @java.lang.Override
        public GroupResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.GroupResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
