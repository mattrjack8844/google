// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

/**
 *
 *
 * <pre>
 * Stored in the [google.longrunning.Operation.metadata][google.longrunning.Operation.metadata] field returned by
 * CreateGlossary.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.CreateGlossaryMetadata}
 */
public final class CreateGlossaryMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.CreateGlossaryMetadata)
    CreateGlossaryMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGlossaryMetadata.newBuilder() to construct.
  private CreateGlossaryMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGlossaryMetadata() {
    name_ = "";
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateGlossaryMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (submitTime_ != null) {
                subBuilder = submitTime_.toBuilder();
              }
              submitTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(submitTime_);
                submitTime_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_CreateGlossaryMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_CreateGlossaryMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.class,
            com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enumerates the possible states that the creation request can be in.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.translation.v3beta1.CreateGlossaryMetadata.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Request is being processed.
     * </pre>
     *
     * <code>RUNNING = 1;</code>
     */
    RUNNING(1),
    /**
     *
     *
     * <pre>
     * The glossary has been successfully created.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    SUCCEEDED(2),
    /**
     *
     *
     * <pre>
     * Failed to create the glossary.
     * </pre>
     *
     * <code>FAILED = 3;</code>
     */
    FAILED(3),
    /**
     *
     *
     * <pre>
     * Request is in the process of being canceled after caller invoked
     * longrunning.Operations.CancelOperation on the request id.
     * </pre>
     *
     * <code>CANCELLING = 4;</code>
     */
    CANCELLING(4),
    /**
     *
     *
     * <pre>
     * The glossary creation request has been successfully canceled.
     * </pre>
     *
     * <code>CANCELLED = 5;</code>
     */
    CANCELLED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Request is being processed.
     * </pre>
     *
     * <code>RUNNING = 1;</code>
     */
    public static final int RUNNING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The glossary has been successfully created.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    public static final int SUCCEEDED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Failed to create the glossary.
     * </pre>
     *
     * <code>FAILED = 3;</code>
     */
    public static final int FAILED_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Request is in the process of being canceled after caller invoked
     * longrunning.Operations.CancelOperation on the request id.
     * </pre>
     *
     * <code>CANCELLING = 4;</code>
     */
    public static final int CANCELLING_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The glossary creation request has been successfully canceled.
     * </pre>
     *
     * <code>CANCELLED = 5;</code>
     */
    public static final int CANCELLED_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return RUNNING;
        case 2:
          return SUCCEEDED;
        case 3:
          return FAILED;
        case 4:
          return CANCELLING;
        case 5:
          return CANCELLED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.translation.v3beta1.CreateGlossaryMetadata.State)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the glossary that is being created.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the glossary that is being created.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_;
  /**
   *
   *
   * <pre>
   * The current state of the glossary creation operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The current state of the glossary creation operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
   */
  public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State result =
        com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.valueOf(state_);
    return result == null
        ? com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.UNRECOGNIZED
        : result;
  }

  public static final int SUBMIT_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp submitTime_;
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   */
  public boolean hasSubmitTime() {
    return submitTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   */
  public com.google.protobuf.Timestamp getSubmitTime() {
    return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
    return getSubmitTime();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (state_
        != com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, state_);
    }
    if (submitTime_ != null) {
      output.writeMessage(3, getSubmitTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (state_
        != com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, state_);
    }
    if (submitTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSubmitTime());
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.CreateGlossaryMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.CreateGlossaryMetadata other =
        (com.google.cloud.translate.v3beta1.CreateGlossaryMetadata) obj;

    if (!getName().equals(other.getName())) return false;
    if (state_ != other.state_) return false;
    if (hasSubmitTime() != other.hasSubmitTime()) return false;
    if (hasSubmitTime()) {
      if (!getSubmitTime().equals(other.getSubmitTime())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (hasSubmitTime()) {
      hash = (37 * hash) + SUBMIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parseFrom(
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
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadata prototype) {
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
   * Stored in the [google.longrunning.Operation.metadata][google.longrunning.Operation.metadata] field returned by
   * CreateGlossary.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.CreateGlossaryMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.CreateGlossaryMetadata)
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_CreateGlossaryMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_CreateGlossaryMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.class,
              com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.newBuilder()
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
      name_ = "";

      state_ = 0;

      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_CreateGlossaryMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata build() {
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata buildPartial() {
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadata result =
          new com.google.cloud.translate.v3beta1.CreateGlossaryMetadata(this);
      result.name_ = name_;
      result.state_ = state_;
      if (submitTimeBuilder_ == null) {
        result.submitTime_ = submitTime_;
      } else {
        result.submitTime_ = submitTimeBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.translate.v3beta1.CreateGlossaryMetadata) {
        return mergeFrom((com.google.cloud.translate.v3beta1.CreateGlossaryMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.CreateGlossaryMetadata other) {
      if (other == com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.hasSubmitTime()) {
        mergeSubmitTime(other.getSubmitTime());
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
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.translate.v3beta1.CreateGlossaryMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the glossary that is being created.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the glossary that is being created.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the glossary that is being created.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the glossary that is being created.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the glossary that is being created.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The current state of the glossary creation operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The current state of the glossary creation operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current state of the glossary creation operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
     */
    public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State result =
          com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.valueOf(state_);
      return result == null
          ? com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The current state of the glossary creation operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
     */
    public Builder setState(com.google.cloud.translate.v3beta1.CreateGlossaryMetadata.State value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current state of the glossary creation operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.CreateGlossaryMetadata.State state = 2;</code>
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp submitTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        submitTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public boolean hasSubmitTime() {
      return submitTimeBuilder_ != null || submitTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public com.google.protobuf.Timestamp getSubmitTime() {
      if (submitTimeBuilder_ == null) {
        return submitTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : submitTime_;
      } else {
        return submitTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submitTime_ = value;
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (submitTimeBuilder_ == null) {
        submitTime_ = builderForValue.build();
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public Builder mergeSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (submitTime_ != null) {
          submitTime_ =
              com.google.protobuf.Timestamp.newBuilder(submitTime_).mergeFrom(value).buildPartial();
        } else {
          submitTime_ = value;
        }
        onChanged();
      } else {
        submitTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public Builder clearSubmitTime() {
      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
        onChanged();
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSubmitTimeBuilder() {

      onChanged();
      return getSubmitTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
      if (submitTimeBuilder_ != null) {
        return submitTimeBuilder_.getMessageOrBuilder();
      } else {
        return submitTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : submitTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getSubmitTimeFieldBuilder() {
      if (submitTimeBuilder_ == null) {
        submitTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getSubmitTime(), getParentForChildren(), isClean());
        submitTime_ = null;
      }
      return submitTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.CreateGlossaryMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.CreateGlossaryMetadata)
  private static final com.google.cloud.translate.v3beta1.CreateGlossaryMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.CreateGlossaryMetadata();
  }

  public static com.google.cloud.translate.v3beta1.CreateGlossaryMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGlossaryMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CreateGlossaryMetadata>() {
        @java.lang.Override
        public CreateGlossaryMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateGlossaryMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateGlossaryMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGlossaryMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.CreateGlossaryMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
