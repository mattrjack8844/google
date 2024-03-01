// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/user_event_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

/**
 * <pre>
 * Request message for RejoinUserEvents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.RejoinUserEventsRequest}
 */
public final class RejoinUserEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.RejoinUserEventsRequest)
    RejoinUserEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RejoinUserEventsRequest.newBuilder() to construct.
  private RejoinUserEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RejoinUserEventsRequest() {
    parent_ = "";
    userEventRejoinScope_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RejoinUserEventsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2.UserEventServiceProto.internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.UserEventServiceProto.internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.RejoinUserEventsRequest.class, com.google.cloud.retail.v2.RejoinUserEventsRequest.Builder.class);
  }

  /**
   * <pre>
   * The scope of user events to be rejoined with the latest product catalog.
   * If the rejoining aims at reducing number of unjoined events, set
   * `UserEventRejoinScope` to `UNJOINED_EVENTS`.
   * If the rejoining aims at correcting product catalog information in joined
   * events, set `UserEventRejoinScope` to `JOINED_EVENTS`.
   * If all events needs to be rejoined, set `UserEventRejoinScope` to
   * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED`.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope}
   */
  public enum UserEventRejoinScope
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Rejoin all events with the latest product catalog, including both joined
     * events and unjoined events.
     * </pre>
     *
     * <code>USER_EVENT_REJOIN_SCOPE_UNSPECIFIED = 0;</code>
     */
    USER_EVENT_REJOIN_SCOPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Only rejoin joined events with the latest product catalog.
     * </pre>
     *
     * <code>JOINED_EVENTS = 1;</code>
     */
    JOINED_EVENTS(1),
    /**
     * <pre>
     * Only rejoin unjoined events with the latest product catalog.
     * </pre>
     *
     * <code>UNJOINED_EVENTS = 2;</code>
     */
    UNJOINED_EVENTS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Rejoin all events with the latest product catalog, including both joined
     * events and unjoined events.
     * </pre>
     *
     * <code>USER_EVENT_REJOIN_SCOPE_UNSPECIFIED = 0;</code>
     */
    public static final int USER_EVENT_REJOIN_SCOPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Only rejoin joined events with the latest product catalog.
     * </pre>
     *
     * <code>JOINED_EVENTS = 1;</code>
     */
    public static final int JOINED_EVENTS_VALUE = 1;
    /**
     * <pre>
     * Only rejoin unjoined events with the latest product catalog.
     * </pre>
     *
     * <code>UNJOINED_EVENTS = 2;</code>
     */
    public static final int UNJOINED_EVENTS_VALUE = 2;


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
    public static UserEventRejoinScope valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserEventRejoinScope forNumber(int value) {
      switch (value) {
        case 0: return USER_EVENT_REJOIN_SCOPE_UNSPECIFIED;
        case 1: return JOINED_EVENTS;
        case 2: return UNJOINED_EVENTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserEventRejoinScope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserEventRejoinScope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserEventRejoinScope>() {
            public UserEventRejoinScope findValueByNumber(int number) {
              return UserEventRejoinScope.forNumber(number);
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
      return com.google.cloud.retail.v2.RejoinUserEventsRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserEventRejoinScope[] VALUES = values();

    public static UserEventRejoinScope valueOf(
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

    private UserEventRejoinScope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope)
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_EVENT_REJOIN_SCOPE_FIELD_NUMBER = 2;
  private int userEventRejoinScope_ = 0;
  /**
   * <pre>
   * The type of the user event rejoin to define the scope and range of the user
   * events to be rejoined with the latest product catalog. Defaults to
   * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
   * an invalid integer value.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
   * @return The enum numeric value on the wire for userEventRejoinScope.
   */
  @java.lang.Override public int getUserEventRejoinScopeValue() {
    return userEventRejoinScope_;
  }
  /**
   * <pre>
   * The type of the user event rejoin to define the scope and range of the user
   * events to be rejoined with the latest product catalog. Defaults to
   * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
   * an invalid integer value.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
   * @return The userEventRejoinScope.
   */
  @java.lang.Override public com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope getUserEventRejoinScope() {
    com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope result = com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.forNumber(userEventRejoinScope_);
    return result == null ? com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (userEventRejoinScope_ != com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.USER_EVENT_REJOIN_SCOPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, userEventRejoinScope_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (userEventRejoinScope_ != com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.USER_EVENT_REJOIN_SCOPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, userEventRejoinScope_);
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
    if (!(obj instanceof com.google.cloud.retail.v2.RejoinUserEventsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.RejoinUserEventsRequest other = (com.google.cloud.retail.v2.RejoinUserEventsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (userEventRejoinScope_ != other.userEventRejoinScope_) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + USER_EVENT_REJOIN_SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + userEventRejoinScope_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.RejoinUserEventsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2.RejoinUserEventsRequest prototype) {
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
   * Request message for RejoinUserEvents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.RejoinUserEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.RejoinUserEventsRequest)
      com.google.cloud.retail.v2.RejoinUserEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2.UserEventServiceProto.internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.UserEventServiceProto.internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.RejoinUserEventsRequest.class, com.google.cloud.retail.v2.RejoinUserEventsRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.RejoinUserEventsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      userEventRejoinScope_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2.UserEventServiceProto.internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.RejoinUserEventsRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.RejoinUserEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.RejoinUserEventsRequest build() {
      com.google.cloud.retail.v2.RejoinUserEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.RejoinUserEventsRequest buildPartial() {
      com.google.cloud.retail.v2.RejoinUserEventsRequest result = new com.google.cloud.retail.v2.RejoinUserEventsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.RejoinUserEventsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userEventRejoinScope_ = userEventRejoinScope_;
      }
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
      if (other instanceof com.google.cloud.retail.v2.RejoinUserEventsRequest) {
        return mergeFrom((com.google.cloud.retail.v2.RejoinUserEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.RejoinUserEventsRequest other) {
      if (other == com.google.cloud.retail.v2.RejoinUserEventsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.userEventRejoinScope_ != 0) {
        setUserEventRejoinScopeValue(other.getUserEventRejoinScopeValue());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              userEventRejoinScope_ = input.readEnum();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/1234/locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int userEventRejoinScope_ = 0;
    /**
     * <pre>
     * The type of the user event rejoin to define the scope and range of the user
     * events to be rejoined with the latest product catalog. Defaults to
     * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
     * an invalid integer value.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
     * @return The enum numeric value on the wire for userEventRejoinScope.
     */
    @java.lang.Override public int getUserEventRejoinScopeValue() {
      return userEventRejoinScope_;
    }
    /**
     * <pre>
     * The type of the user event rejoin to define the scope and range of the user
     * events to be rejoined with the latest product catalog. Defaults to
     * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
     * an invalid integer value.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
     * @param value The enum numeric value on the wire for userEventRejoinScope to set.
     * @return This builder for chaining.
     */
    public Builder setUserEventRejoinScopeValue(int value) {
      userEventRejoinScope_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the user event rejoin to define the scope and range of the user
     * events to be rejoined with the latest product catalog. Defaults to
     * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
     * an invalid integer value.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
     * @return The userEventRejoinScope.
     */
    @java.lang.Override
    public com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope getUserEventRejoinScope() {
      com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope result = com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.forNumber(userEventRejoinScope_);
      return result == null ? com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the user event rejoin to define the scope and range of the user
     * events to be rejoined with the latest product catalog. Defaults to
     * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
     * an invalid integer value.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
     * @param value The userEventRejoinScope to set.
     * @return This builder for chaining.
     */
    public Builder setUserEventRejoinScope(com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      userEventRejoinScope_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the user event rejoin to define the scope and range of the user
     * events to be rejoined with the latest product catalog. Defaults to
     * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
     * an invalid integer value.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserEventRejoinScope() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userEventRejoinScope_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.RejoinUserEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.RejoinUserEventsRequest)
  private static final com.google.cloud.retail.v2.RejoinUserEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.RejoinUserEventsRequest();
  }

  public static com.google.cloud.retail.v2.RejoinUserEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RejoinUserEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RejoinUserEventsRequest>() {
    @java.lang.Override
    public RejoinUserEventsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RejoinUserEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RejoinUserEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.RejoinUserEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

