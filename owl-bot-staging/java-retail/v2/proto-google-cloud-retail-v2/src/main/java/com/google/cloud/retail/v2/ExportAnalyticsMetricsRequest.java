// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/export_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

/**
 * <pre>
 * Request message for the `ExportAnalyticsMetrics` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.ExportAnalyticsMetricsRequest}
 */
public final class ExportAnalyticsMetricsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.ExportAnalyticsMetricsRequest)
    ExportAnalyticsMetricsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportAnalyticsMetricsRequest.newBuilder() to construct.
  private ExportAnalyticsMetricsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportAnalyticsMetricsRequest() {
    catalog_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportAnalyticsMetricsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2.ExportConfigProto.internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ExportConfigProto.internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.class, com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CATALOG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object catalog_ = "";
  /**
   * <pre>
   * Required. Full resource name of the parent catalog.
   * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The catalog.
   */
  @java.lang.Override
  public java.lang.String getCatalog() {
    java.lang.Object ref = catalog_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      catalog_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Full resource name of the parent catalog.
   * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for catalog.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCatalogBytes() {
    java.lang.Object ref = catalog_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      catalog_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2.OutputConfig outputConfig_;
  /**
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Override
  public boolean hasOutputConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.OutputConfig getOutputConfig() {
    return outputConfig_ == null ? com.google.cloud.retail.v2.OutputConfig.getDefaultInstance() : outputConfig_;
  }
  /**
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.OutputConfigOrBuilder getOutputConfigOrBuilder() {
    return outputConfig_ == null ? com.google.cloud.retail.v2.OutputConfig.getDefaultInstance() : outputConfig_;
  }

  public static final int FILTER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   * <pre>
   * A filtering expression to specify restrictions on returned metrics.
   * The expression is a sequence of terms. Each term applies a restriction to
   * the returned metrics. Use this expression to restrict results to a
   * specific time range.
   *
   *   Currently we expect only one types of fields:
   *
   *    * `timestamp`: This can be specified twice, once with a
   *      less than operator and once with a greater than operator. The
   *      `timestamp` restriction should result in one, contiguous, valid,
   *      `timestamp` range.
   *
   *   Some examples of valid filters expressions:
   *
   *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
   *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
   *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A filtering expression to specify restrictions on returned metrics.
   * The expression is a sequence of terms. Each term applies a restriction to
   * the returned metrics. Use this expression to restrict results to a
   * specific time range.
   *
   *   Currently we expect only one types of fields:
   *
   *    * `timestamp`: This can be specified twice, once with a
   *      less than operator and once with a greater than operator. The
   *      `timestamp` restriction should result in one, contiguous, valid,
   *      `timestamp` range.
   *
   *   Some examples of valid filters expressions:
   *
   *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
   *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
   *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(catalog_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, catalog_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOutputConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(catalog_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, catalog_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOutputConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
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
    if (!(obj instanceof com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest other = (com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest) obj;

    if (!getCatalog()
        .equals(other.getCatalog())) return false;
    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig()
          .equals(other.getOutputConfig())) return false;
    }
    if (!getFilter()
        .equals(other.getFilter())) return false;
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
    hash = (37 * hash) + CATALOG_FIELD_NUMBER;
    hash = (53 * hash) + getCatalog().hashCode();
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for the `ExportAnalyticsMetrics` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.ExportAnalyticsMetricsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.ExportAnalyticsMetricsRequest)
      com.google.cloud.retail.v2.ExportAnalyticsMetricsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2.ExportConfigProto.internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ExportConfigProto.internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.class, com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOutputConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      catalog_ = "";
      outputConfig_ = null;
      if (outputConfigBuilder_ != null) {
        outputConfigBuilder_.dispose();
        outputConfigBuilder_ = null;
      }
      filter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2.ExportConfigProto.internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest build() {
      com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest buildPartial() {
      com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest result = new com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.catalog_ = catalog_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.outputConfig_ = outputConfigBuilder_ == null
            ? outputConfig_
            : outputConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.filter_ = filter_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest) {
        return mergeFrom((com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest other) {
      if (other == com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest.getDefaultInstance()) return this;
      if (!other.getCatalog().isEmpty()) {
        catalog_ = other.catalog_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              catalog_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOutputConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              filter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
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

    private java.lang.Object catalog_ = "";
    /**
     * <pre>
     * Required. Full resource name of the parent catalog.
     * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The catalog.
     */
    public java.lang.String getCatalog() {
      java.lang.Object ref = catalog_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        catalog_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Full resource name of the parent catalog.
     * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for catalog.
     */
    public com.google.protobuf.ByteString
        getCatalogBytes() {
      java.lang.Object ref = catalog_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        catalog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Full resource name of the parent catalog.
     * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The catalog to set.
     * @return This builder for chaining.
     */
    public Builder setCatalog(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      catalog_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Full resource name of the parent catalog.
     * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCatalog() {
      catalog_ = getDefaultInstance().getCatalog();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Full resource name of the parent catalog.
     * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for catalog to set.
     * @return This builder for chaining.
     */
    public Builder setCatalogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      catalog_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.retail.v2.OutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.OutputConfig, com.google.cloud.retail.v2.OutputConfig.Builder, com.google.cloud.retail.v2.OutputConfigOrBuilder> outputConfigBuilder_;
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the outputConfig field is set.
     */
    public boolean hasOutputConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The outputConfig.
     */
    public com.google.cloud.retail.v2.OutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null ? com.google.cloud.retail.v2.OutputConfig.getDefaultInstance() : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOutputConfig(com.google.cloud.retail.v2.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
      } else {
        outputConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOutputConfig(
        com.google.cloud.retail.v2.OutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeOutputConfig(com.google.cloud.retail.v2.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          outputConfig_ != null &&
          outputConfig_ != com.google.cloud.retail.v2.OutputConfig.getDefaultInstance()) {
          getOutputConfigBuilder().mergeFrom(value);
        } else {
          outputConfig_ = value;
        }
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }
      if (outputConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOutputConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      outputConfig_ = null;
      if (outputConfigBuilder_ != null) {
        outputConfigBuilder_.dispose();
        outputConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.OutputConfig.Builder getOutputConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.OutputConfigOrBuilder getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null ?
            com.google.cloud.retail.v2.OutputConfig.getDefaultInstance() : outputConfig_;
      }
    }
    /**
     * <pre>
     * Required. The output location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.OutputConfig, com.google.cloud.retail.v2.OutputConfig.Builder, com.google.cloud.retail.v2.OutputConfigOrBuilder> 
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.OutputConfig, com.google.cloud.retail.v2.OutputConfig.Builder, com.google.cloud.retail.v2.OutputConfigOrBuilder>(
                getOutputConfig(),
                getParentForChildren(),
                isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * A filtering expression to specify restrictions on returned metrics.
     * The expression is a sequence of terms. Each term applies a restriction to
     * the returned metrics. Use this expression to restrict results to a
     * specific time range.
     *
     *   Currently we expect only one types of fields:
     *
     *    * `timestamp`: This can be specified twice, once with a
     *      less than operator and once with a greater than operator. The
     *      `timestamp` restriction should result in one, contiguous, valid,
     *      `timestamp` range.
     *
     *   Some examples of valid filters expressions:
     *
     *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
     *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
     *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A filtering expression to specify restrictions on returned metrics.
     * The expression is a sequence of terms. Each term applies a restriction to
     * the returned metrics. Use this expression to restrict results to a
     * specific time range.
     *
     *   Currently we expect only one types of fields:
     *
     *    * `timestamp`: This can be specified twice, once with a
     *      less than operator and once with a greater than operator. The
     *      `timestamp` restriction should result in one, contiguous, valid,
     *      `timestamp` range.
     *
     *   Some examples of valid filters expressions:
     *
     *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
     *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
     *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A filtering expression to specify restrictions on returned metrics.
     * The expression is a sequence of terms. Each term applies a restriction to
     * the returned metrics. Use this expression to restrict results to a
     * specific time range.
     *
     *   Currently we expect only one types of fields:
     *
     *    * `timestamp`: This can be specified twice, once with a
     *      less than operator and once with a greater than operator. The
     *      `timestamp` restriction should result in one, contiguous, valid,
     *      `timestamp` range.
     *
     *   Some examples of valid filters expressions:
     *
     *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
     *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
     *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A filtering expression to specify restrictions on returned metrics.
     * The expression is a sequence of terms. Each term applies a restriction to
     * the returned metrics. Use this expression to restrict results to a
     * specific time range.
     *
     *   Currently we expect only one types of fields:
     *
     *    * `timestamp`: This can be specified twice, once with a
     *      less than operator and once with a greater than operator. The
     *      `timestamp` restriction should result in one, contiguous, valid,
     *      `timestamp` range.
     *
     *   Some examples of valid filters expressions:
     *
     *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
     *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
     *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A filtering expression to specify restrictions on returned metrics.
     * The expression is a sequence of terms. Each term applies a restriction to
     * the returned metrics. Use this expression to restrict results to a
     * specific time range.
     *
     *   Currently we expect only one types of fields:
     *
     *    * `timestamp`: This can be specified twice, once with a
     *      less than operator and once with a greater than operator. The
     *      `timestamp` restriction should result in one, contiguous, valid,
     *      `timestamp` range.
     *
     *   Some examples of valid filters expressions:
     *
     *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
     *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
     *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.ExportAnalyticsMetricsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.ExportAnalyticsMetricsRequest)
  private static final com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest();
  }

  public static com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportAnalyticsMetricsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportAnalyticsMetricsRequest>() {
    @java.lang.Override
    public ExportAnalyticsMetricsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportAnalyticsMetricsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportAnalyticsMetricsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.ExportAnalyticsMetricsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

