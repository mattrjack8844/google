// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/type/types.proto

package com.google.shopping.type;

/**
 * <pre>
 * Reporting contexts that your account and product issues apply to.
 *
 * Reporting contexts are groups of surfaces and formats for product results on
 * Google. They can represent the entire destination (for example, [Shopping
 * ads](https://support.google.com/merchants/answer/6149970)) or a subset of
 * formats within a destination (for example, [Discovery
 * ads](https://support.google.com/merchants/answer/13389785)).
 * </pre>
 *
 * Protobuf type {@code google.shopping.type.ReportingContext}
 */
public final class ReportingContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.shopping.type.ReportingContext)
    ReportingContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportingContext.newBuilder() to construct.
  private ReportingContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportingContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportingContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.shopping.type.TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.type.TypesProto.internal_static_google_shopping_type_ReportingContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.type.ReportingContext.class, com.google.shopping.type.ReportingContext.Builder.class);
  }

  /**
   * <pre>
   * Reporting context values.
   * </pre>
   *
   * Protobuf enum {@code google.shopping.type.ReportingContext.ReportingContextEnum}
   */
  public enum ReportingContextEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>REPORTING_CONTEXT_ENUM_UNSPECIFIED = 0;</code>
     */
    REPORTING_CONTEXT_ENUM_UNSPECIFIED(0),
    /**
     * <pre>
     * [Shopping ads](https://support.google.com/merchants/answer/6149970).
     * </pre>
     *
     * <code>SHOPPING_ADS = 1;</code>
     */
    SHOPPING_ADS(1),
    /**
     * <pre>
     * [Discovery and Demand Gen
     * ads](https://support.google.com/merchants/answer/13389785).
     * </pre>
     *
     * <code>DISCOVERY_ADS = 2;</code>
     */
    DISCOVERY_ADS(2),
    /**
     * <pre>
     * [Video ads](https://support.google.com/google-ads/answer/6340491).
     * </pre>
     *
     * <code>VIDEO_ADS = 3;</code>
     */
    VIDEO_ADS(3),
    /**
     * <pre>
     * [Display ads](https://support.google.com/merchants/answer/6069387).
     * </pre>
     *
     * <code>DISPLAY_ADS = 4;</code>
     */
    DISPLAY_ADS(4),
    /**
     * <pre>
     * [Local inventory
     * ads](https://support.google.com/merchants/answer/3271956).
     * </pre>
     *
     * <code>LOCAL_INVENTORY_ADS = 5;</code>
     */
    LOCAL_INVENTORY_ADS(5),
    /**
     * <pre>
     * [Vehicle inventory
     * ads](https://support.google.com/merchants/answer/11544533).
     * </pre>
     *
     * <code>VEHICLE_INVENTORY_ADS = 6;</code>
     */
    VEHICLE_INVENTORY_ADS(6),
    /**
     * <pre>
     * [Free product
     * listings](https://support.google.com/merchants/answer/9199328).
     * </pre>
     *
     * <code>FREE_LISTINGS = 7;</code>
     */
    FREE_LISTINGS(7),
    /**
     * <pre>
     * [Free local product
     * listings](https://support.google.com/merchants/answer/9825611).
     * </pre>
     *
     * <code>FREE_LOCAL_LISTINGS = 8;</code>
     */
    FREE_LOCAL_LISTINGS(8),
    /**
     * <pre>
     * [Free local vehicle
     * listings](https://support.google.com/merchants/answer/11544533).
     * </pre>
     *
     * <code>FREE_LOCAL_VEHICLE_LISTINGS = 9;</code>
     */
    FREE_LOCAL_VEHICLE_LISTINGS(9),
    /**
     * <pre>
     * [YouTube
     * Shopping](https://support.google.com/merchants/answer/13478370).
     * </pre>
     *
     * <code>YOUTUBE_SHOPPING = 10;</code>
     */
    YOUTUBE_SHOPPING(10),
    /**
     * <pre>
     * [Cloud retail](https://cloud.google.com/solutions/retail).
     * </pre>
     *
     * <code>CLOUD_RETAIL = 11;</code>
     */
    CLOUD_RETAIL(11),
    /**
     * <pre>
     * [Local cloud retail](https://cloud.google.com/solutions/retail).
     * </pre>
     *
     * <code>LOCAL_CLOUD_RETAIL = 12;</code>
     */
    LOCAL_CLOUD_RETAIL(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>REPORTING_CONTEXT_ENUM_UNSPECIFIED = 0;</code>
     */
    public static final int REPORTING_CONTEXT_ENUM_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * [Shopping ads](https://support.google.com/merchants/answer/6149970).
     * </pre>
     *
     * <code>SHOPPING_ADS = 1;</code>
     */
    public static final int SHOPPING_ADS_VALUE = 1;
    /**
     * <pre>
     * [Discovery and Demand Gen
     * ads](https://support.google.com/merchants/answer/13389785).
     * </pre>
     *
     * <code>DISCOVERY_ADS = 2;</code>
     */
    public static final int DISCOVERY_ADS_VALUE = 2;
    /**
     * <pre>
     * [Video ads](https://support.google.com/google-ads/answer/6340491).
     * </pre>
     *
     * <code>VIDEO_ADS = 3;</code>
     */
    public static final int VIDEO_ADS_VALUE = 3;
    /**
     * <pre>
     * [Display ads](https://support.google.com/merchants/answer/6069387).
     * </pre>
     *
     * <code>DISPLAY_ADS = 4;</code>
     */
    public static final int DISPLAY_ADS_VALUE = 4;
    /**
     * <pre>
     * [Local inventory
     * ads](https://support.google.com/merchants/answer/3271956).
     * </pre>
     *
     * <code>LOCAL_INVENTORY_ADS = 5;</code>
     */
    public static final int LOCAL_INVENTORY_ADS_VALUE = 5;
    /**
     * <pre>
     * [Vehicle inventory
     * ads](https://support.google.com/merchants/answer/11544533).
     * </pre>
     *
     * <code>VEHICLE_INVENTORY_ADS = 6;</code>
     */
    public static final int VEHICLE_INVENTORY_ADS_VALUE = 6;
    /**
     * <pre>
     * [Free product
     * listings](https://support.google.com/merchants/answer/9199328).
     * </pre>
     *
     * <code>FREE_LISTINGS = 7;</code>
     */
    public static final int FREE_LISTINGS_VALUE = 7;
    /**
     * <pre>
     * [Free local product
     * listings](https://support.google.com/merchants/answer/9825611).
     * </pre>
     *
     * <code>FREE_LOCAL_LISTINGS = 8;</code>
     */
    public static final int FREE_LOCAL_LISTINGS_VALUE = 8;
    /**
     * <pre>
     * [Free local vehicle
     * listings](https://support.google.com/merchants/answer/11544533).
     * </pre>
     *
     * <code>FREE_LOCAL_VEHICLE_LISTINGS = 9;</code>
     */
    public static final int FREE_LOCAL_VEHICLE_LISTINGS_VALUE = 9;
    /**
     * <pre>
     * [YouTube
     * Shopping](https://support.google.com/merchants/answer/13478370).
     * </pre>
     *
     * <code>YOUTUBE_SHOPPING = 10;</code>
     */
    public static final int YOUTUBE_SHOPPING_VALUE = 10;
    /**
     * <pre>
     * [Cloud retail](https://cloud.google.com/solutions/retail).
     * </pre>
     *
     * <code>CLOUD_RETAIL = 11;</code>
     */
    public static final int CLOUD_RETAIL_VALUE = 11;
    /**
     * <pre>
     * [Local cloud retail](https://cloud.google.com/solutions/retail).
     * </pre>
     *
     * <code>LOCAL_CLOUD_RETAIL = 12;</code>
     */
    public static final int LOCAL_CLOUD_RETAIL_VALUE = 12;


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
    public static ReportingContextEnum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReportingContextEnum forNumber(int value) {
      switch (value) {
        case 0: return REPORTING_CONTEXT_ENUM_UNSPECIFIED;
        case 1: return SHOPPING_ADS;
        case 2: return DISCOVERY_ADS;
        case 3: return VIDEO_ADS;
        case 4: return DISPLAY_ADS;
        case 5: return LOCAL_INVENTORY_ADS;
        case 6: return VEHICLE_INVENTORY_ADS;
        case 7: return FREE_LISTINGS;
        case 8: return FREE_LOCAL_LISTINGS;
        case 9: return FREE_LOCAL_VEHICLE_LISTINGS;
        case 10: return YOUTUBE_SHOPPING;
        case 11: return CLOUD_RETAIL;
        case 12: return LOCAL_CLOUD_RETAIL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReportingContextEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReportingContextEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReportingContextEnum>() {
            public ReportingContextEnum findValueByNumber(int number) {
              return ReportingContextEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.shopping.type.ReportingContext.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReportingContextEnum[] VALUES = values();

    public static ReportingContextEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReportingContextEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.shopping.type.ReportingContext.ReportingContextEnum)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.shopping.type.ReportingContext)) {
      return super.equals(obj);
    }
    com.google.shopping.type.ReportingContext other = (com.google.shopping.type.ReportingContext) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.type.ReportingContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.type.ReportingContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.type.ReportingContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.shopping.type.ReportingContext parseFrom(
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
  public static Builder newBuilder(com.google.shopping.type.ReportingContext prototype) {
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
   * Reporting contexts that your account and product issues apply to.
   *
   * Reporting contexts are groups of surfaces and formats for product results on
   * Google. They can represent the entire destination (for example, [Shopping
   * ads](https://support.google.com/merchants/answer/6149970)) or a subset of
   * formats within a destination (for example, [Discovery
   * ads](https://support.google.com/merchants/answer/13389785)).
   * </pre>
   *
   * Protobuf type {@code google.shopping.type.ReportingContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.shopping.type.ReportingContext)
      com.google.shopping.type.ReportingContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.shopping.type.TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.type.TypesProto.internal_static_google_shopping_type_ReportingContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.type.ReportingContext.class, com.google.shopping.type.ReportingContext.Builder.class);
    }

    // Construct using com.google.shopping.type.ReportingContext.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.shopping.type.TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.type.ReportingContext getDefaultInstanceForType() {
      return com.google.shopping.type.ReportingContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.type.ReportingContext build() {
      com.google.shopping.type.ReportingContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.type.ReportingContext buildPartial() {
      com.google.shopping.type.ReportingContext result = new com.google.shopping.type.ReportingContext(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.shopping.type.ReportingContext) {
        return mergeFrom((com.google.shopping.type.ReportingContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.type.ReportingContext other) {
      if (other == com.google.shopping.type.ReportingContext.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.shopping.type.ReportingContext)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.type.ReportingContext)
  private static final com.google.shopping.type.ReportingContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.shopping.type.ReportingContext();
  }

  public static com.google.shopping.type.ReportingContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportingContext>
      PARSER = new com.google.protobuf.AbstractParser<ReportingContext>() {
    @java.lang.Override
    public ReportingContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReportingContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportingContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.type.ReportingContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

