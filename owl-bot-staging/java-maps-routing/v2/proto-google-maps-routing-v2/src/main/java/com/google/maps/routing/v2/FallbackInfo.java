// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/fallback_info.proto

package com.google.maps.routing.v2;

/**
 * <pre>
 * Information related to how and why a fallback result was used. If this field
 * is set, then it means the server used a different routing mode from your
 * preferred mode as fallback.
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.FallbackInfo}
 */
public final class FallbackInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.FallbackInfo)
    FallbackInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FallbackInfo.newBuilder() to construct.
  private FallbackInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FallbackInfo() {
    routingMode_ = 0;
    reason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FallbackInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.routing.v2.FallbackInfoProto.internal_static_google_maps_routing_v2_FallbackInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.FallbackInfoProto.internal_static_google_maps_routing_v2_FallbackInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.FallbackInfo.class, com.google.maps.routing.v2.FallbackInfo.Builder.class);
  }

  public static final int ROUTING_MODE_FIELD_NUMBER = 1;
  private int routingMode_;
  /**
   * <pre>
   * Routing mode used for the response. If fallback was triggered, the mode
   * may be different from routing preference set in the original client
   * request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
   * @return The enum numeric value on the wire for routingMode.
   */
  @java.lang.Override public int getRoutingModeValue() {
    return routingMode_;
  }
  /**
   * <pre>
   * Routing mode used for the response. If fallback was triggered, the mode
   * may be different from routing preference set in the original client
   * request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
   * @return The routingMode.
   */
  @java.lang.Override public com.google.maps.routing.v2.FallbackRoutingMode getRoutingMode() {
    @SuppressWarnings("deprecation")
    com.google.maps.routing.v2.FallbackRoutingMode result = com.google.maps.routing.v2.FallbackRoutingMode.valueOf(routingMode_);
    return result == null ? com.google.maps.routing.v2.FallbackRoutingMode.UNRECOGNIZED : result;
  }

  public static final int REASON_FIELD_NUMBER = 2;
  private int reason_;
  /**
   * <pre>
   * The reason why fallback response was used instead of the original response.
   * This field is only populated when the fallback mode is triggered and the
   * fallback response is returned.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
   * @return The enum numeric value on the wire for reason.
   */
  @java.lang.Override public int getReasonValue() {
    return reason_;
  }
  /**
   * <pre>
   * The reason why fallback response was used instead of the original response.
   * This field is only populated when the fallback mode is triggered and the
   * fallback response is returned.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
   * @return The reason.
   */
  @java.lang.Override public com.google.maps.routing.v2.FallbackReason getReason() {
    @SuppressWarnings("deprecation")
    com.google.maps.routing.v2.FallbackReason result = com.google.maps.routing.v2.FallbackReason.valueOf(reason_);
    return result == null ? com.google.maps.routing.v2.FallbackReason.UNRECOGNIZED : result;
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
    if (routingMode_ != com.google.maps.routing.v2.FallbackRoutingMode.FALLBACK_ROUTING_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, routingMode_);
    }
    if (reason_ != com.google.maps.routing.v2.FallbackReason.FALLBACK_REASON_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, reason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (routingMode_ != com.google.maps.routing.v2.FallbackRoutingMode.FALLBACK_ROUTING_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, routingMode_);
    }
    if (reason_ != com.google.maps.routing.v2.FallbackReason.FALLBACK_REASON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, reason_);
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
    if (!(obj instanceof com.google.maps.routing.v2.FallbackInfo)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.FallbackInfo other = (com.google.maps.routing.v2.FallbackInfo) obj;

    if (routingMode_ != other.routingMode_) return false;
    if (reason_ != other.reason_) return false;
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
    hash = (37 * hash) + ROUTING_MODE_FIELD_NUMBER;
    hash = (53 * hash) + routingMode_;
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + reason_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routing.v2.FallbackInfo parseFrom(
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
  public static Builder newBuilder(com.google.maps.routing.v2.FallbackInfo prototype) {
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
   * Information related to how and why a fallback result was used. If this field
   * is set, then it means the server used a different routing mode from your
   * preferred mode as fallback.
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.FallbackInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.FallbackInfo)
      com.google.maps.routing.v2.FallbackInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.routing.v2.FallbackInfoProto.internal_static_google_maps_routing_v2_FallbackInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.FallbackInfoProto.internal_static_google_maps_routing_v2_FallbackInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.FallbackInfo.class, com.google.maps.routing.v2.FallbackInfo.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.FallbackInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      routingMode_ = 0;

      reason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.routing.v2.FallbackInfoProto.internal_static_google_maps_routing_v2_FallbackInfo_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.FallbackInfo getDefaultInstanceForType() {
      return com.google.maps.routing.v2.FallbackInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.FallbackInfo build() {
      com.google.maps.routing.v2.FallbackInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.FallbackInfo buildPartial() {
      com.google.maps.routing.v2.FallbackInfo result = new com.google.maps.routing.v2.FallbackInfo(this);
      result.routingMode_ = routingMode_;
      result.reason_ = reason_;
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
      if (other instanceof com.google.maps.routing.v2.FallbackInfo) {
        return mergeFrom((com.google.maps.routing.v2.FallbackInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.FallbackInfo other) {
      if (other == com.google.maps.routing.v2.FallbackInfo.getDefaultInstance()) return this;
      if (other.routingMode_ != 0) {
        setRoutingModeValue(other.getRoutingModeValue());
      }
      if (other.reason_ != 0) {
        setReasonValue(other.getReasonValue());
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
            case 8: {
              routingMode_ = input.readEnum();

              break;
            } // case 8
            case 16: {
              reason_ = input.readEnum();

              break;
            } // case 16
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

    private int routingMode_ = 0;
    /**
     * <pre>
     * Routing mode used for the response. If fallback was triggered, the mode
     * may be different from routing preference set in the original client
     * request.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
     * @return The enum numeric value on the wire for routingMode.
     */
    @java.lang.Override public int getRoutingModeValue() {
      return routingMode_;
    }
    /**
     * <pre>
     * Routing mode used for the response. If fallback was triggered, the mode
     * may be different from routing preference set in the original client
     * request.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
     * @param value The enum numeric value on the wire for routingMode to set.
     * @return This builder for chaining.
     */
    public Builder setRoutingModeValue(int value) {
      
      routingMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Routing mode used for the response. If fallback was triggered, the mode
     * may be different from routing preference set in the original client
     * request.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
     * @return The routingMode.
     */
    @java.lang.Override
    public com.google.maps.routing.v2.FallbackRoutingMode getRoutingMode() {
      @SuppressWarnings("deprecation")
      com.google.maps.routing.v2.FallbackRoutingMode result = com.google.maps.routing.v2.FallbackRoutingMode.valueOf(routingMode_);
      return result == null ? com.google.maps.routing.v2.FallbackRoutingMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Routing mode used for the response. If fallback was triggered, the mode
     * may be different from routing preference set in the original client
     * request.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
     * @param value The routingMode to set.
     * @return This builder for chaining.
     */
    public Builder setRoutingMode(com.google.maps.routing.v2.FallbackRoutingMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      routingMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Routing mode used for the response. If fallback was triggered, the mode
     * may be different from routing preference set in the original client
     * request.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoutingMode() {
      
      routingMode_ = 0;
      onChanged();
      return this;
    }

    private int reason_ = 0;
    /**
     * <pre>
     * The reason why fallback response was used instead of the original response.
     * This field is only populated when the fallback mode is triggered and the
     * fallback response is returned.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <pre>
     * The reason why fallback response was used instead of the original response.
     * This field is only populated when the fallback mode is triggered and the
     * fallback response is returned.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
     * @param value The enum numeric value on the wire for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonValue(int value) {
      
      reason_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason why fallback response was used instead of the original response.
     * This field is only populated when the fallback mode is triggered and the
     * fallback response is returned.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override
    public com.google.maps.routing.v2.FallbackReason getReason() {
      @SuppressWarnings("deprecation")
      com.google.maps.routing.v2.FallbackReason result = com.google.maps.routing.v2.FallbackReason.valueOf(reason_);
      return result == null ? com.google.maps.routing.v2.FallbackReason.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The reason why fallback response was used instead of the original response.
     * This field is only populated when the fallback mode is triggered and the
     * fallback response is returned.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(com.google.maps.routing.v2.FallbackReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      reason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason why fallback response was used instead of the original response.
     * This field is only populated when the fallback mode is triggered and the
     * fallback response is returned.
     * </pre>
     *
     * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      
      reason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.FallbackInfo)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.FallbackInfo)
  private static final com.google.maps.routing.v2.FallbackInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.FallbackInfo();
  }

  public static com.google.maps.routing.v2.FallbackInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FallbackInfo>
      PARSER = new com.google.protobuf.AbstractParser<FallbackInfo>() {
    @java.lang.Override
    public FallbackInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<FallbackInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FallbackInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.FallbackInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

