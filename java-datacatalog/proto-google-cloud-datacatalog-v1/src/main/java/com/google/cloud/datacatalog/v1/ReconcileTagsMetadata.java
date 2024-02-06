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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * [Long-running operation][google.longrunning.Operation]
 * metadata message returned by the
 * [ReconcileTags][google.cloud.datacatalog.v1.DataCatalog.ReconcileTags].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ReconcileTagsMetadata}
 */
public final class ReconcileTagsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ReconcileTagsMetadata)
    ReconcileTagsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReconcileTagsMetadata.newBuilder() to construct.
  private ReconcileTagsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReconcileTagsMetadata() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReconcileTagsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetErrors();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.class,
            com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum holding possible states of the reconciliation operation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState}
   */
  public enum ReconciliationState implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>RECONCILIATION_STATE_UNSPECIFIED = 0;</code>
     */
    RECONCILIATION_STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The reconciliation has been queued and awaits for execution.
     * </pre>
     *
     * <code>RECONCILIATION_QUEUED = 1;</code>
     */
    RECONCILIATION_QUEUED(1),
    /**
     *
     *
     * <pre>
     * The reconciliation is in progress.
     * </pre>
     *
     * <code>RECONCILIATION_IN_PROGRESS = 2;</code>
     */
    RECONCILIATION_IN_PROGRESS(2),
    /**
     *
     *
     * <pre>
     * The reconciliation has been finished.
     * </pre>
     *
     * <code>RECONCILIATION_DONE = 3;</code>
     */
    RECONCILIATION_DONE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>RECONCILIATION_STATE_UNSPECIFIED = 0;</code>
     */
    public static final int RECONCILIATION_STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The reconciliation has been queued and awaits for execution.
     * </pre>
     *
     * <code>RECONCILIATION_QUEUED = 1;</code>
     */
    public static final int RECONCILIATION_QUEUED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The reconciliation is in progress.
     * </pre>
     *
     * <code>RECONCILIATION_IN_PROGRESS = 2;</code>
     */
    public static final int RECONCILIATION_IN_PROGRESS_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The reconciliation has been finished.
     * </pre>
     *
     * <code>RECONCILIATION_DONE = 3;</code>
     */
    public static final int RECONCILIATION_DONE_VALUE = 3;

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
    public static ReconciliationState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReconciliationState forNumber(int value) {
      switch (value) {
        case 0:
          return RECONCILIATION_STATE_UNSPECIFIED;
        case 1:
          return RECONCILIATION_QUEUED;
        case 2:
          return RECONCILIATION_IN_PROGRESS;
        case 3:
          return RECONCILIATION_DONE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReconciliationState>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ReconciliationState>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ReconciliationState>() {
              public ReconciliationState findValueByNumber(int number) {
                return ReconciliationState.forNumber(number);
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
      return com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ReconciliationState[] VALUES = values();

    public static ReconciliationState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReconciliationState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * State of the reconciliation operation.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * State of the reconciliation operation.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState getState() {
    com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState result =
        com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState.forNumber(state_);
    return result == null
        ? com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState.UNRECOGNIZED
        : result;
  }

  public static final int ERRORS_FIELD_NUMBER = 2;

  private static final class ErrorsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, com.google.rpc.Status>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.rpc.Status>newDefaultInstance(
                    com.google.cloud.datacatalog.v1.Datacatalog
                        .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_ErrorsEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.rpc.Status.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.rpc.Status> errors_;

  private com.google.protobuf.MapField<java.lang.String, com.google.rpc.Status>
      internalGetErrors() {
    if (errors_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ErrorsDefaultEntryHolder.defaultEntry);
    }
    return errors_;
  }

  public int getErrorsCount() {
    return internalGetErrors().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  @java.lang.Override
  public boolean containsErrors(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetErrors().getMap().containsKey(key);
  }
  /** Use {@link #getErrorsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.rpc.Status> getErrors() {
    return getErrorsMap();
  }
  /**
   *
   *
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.rpc.Status> getErrorsMap() {
    return internalGetErrors().getMap();
  }
  /**
   *
   *
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.rpc.Status getErrorsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.rpc.Status defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.rpc.Status> map = internalGetErrors().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getErrorsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.rpc.Status> map = internalGetErrors().getMap();
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
    if (state_
        != com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState
            .RECONCILIATION_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, state_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetErrors(), ErrorsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState
            .RECONCILIATION_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.rpc.Status> entry :
        internalGetErrors().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.rpc.Status> errors__ =
          ErrorsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, errors__);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ReconcileTagsMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ReconcileTagsMetadata other =
        (com.google.cloud.datacatalog.v1.ReconcileTagsMetadata) obj;

    if (state_ != other.state_) return false;
    if (!internalGetErrors().equals(other.internalGetErrors())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (!internalGetErrors().getMap().isEmpty()) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetErrors().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata parseFrom(
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
      com.google.cloud.datacatalog.v1.ReconcileTagsMetadata prototype) {
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
   * [Long-running operation][google.longrunning.Operation]
   * metadata message returned by the
   * [ReconcileTags][google.cloud.datacatalog.v1.DataCatalog.ReconcileTags].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ReconcileTagsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ReconcileTagsMetadata)
      com.google.cloud.datacatalog.v1.ReconcileTagsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetErrors();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableErrors();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.class,
              com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      internalGetMutableErrors().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ReconcileTagsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata build() {
      com.google.cloud.datacatalog.v1.ReconcileTagsMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata buildPartial() {
      com.google.cloud.datacatalog.v1.ReconcileTagsMetadata result =
          new com.google.cloud.datacatalog.v1.ReconcileTagsMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.ReconcileTagsMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errors_ = internalGetErrors().build(ErrorsDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.cloud.datacatalog.v1.ReconcileTagsMetadata) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ReconcileTagsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ReconcileTagsMetadata other) {
      if (other == com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      internalGetMutableErrors().mergeFrom(other.internalGetErrors());
      bitField0_ |= 0x00000002;
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
                state_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, com.google.rpc.Status> errors__ =
                    input.readMessage(
                        ErrorsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableErrors()
                    .ensureBuilderMap()
                    .put(errors__.getKey(), errors__.getValue());
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

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * State of the reconciliation operation.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * State of the reconciliation operation.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * State of the reconciliation operation.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;
     * </code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState getState() {
      com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState result =
          com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState.forNumber(
              state_);
      return result == null
          ? com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * State of the reconciliation operation.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;
     * </code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * State of the reconciliation operation.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private static final class ErrorsConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String, com.google.rpc.StatusOrBuilder, com.google.rpc.Status> {
      @java.lang.Override
      public com.google.rpc.Status build(com.google.rpc.StatusOrBuilder val) {
        if (val instanceof com.google.rpc.Status) {
          return (com.google.rpc.Status) val;
        }
        return ((com.google.rpc.Status.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.rpc.Status> defaultEntry() {
        return ErrorsDefaultEntryHolder.defaultEntry;
      }
    };

    private static final ErrorsConverter errorsConverter = new ErrorsConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.rpc.StatusOrBuilder,
            com.google.rpc.Status,
            com.google.rpc.Status.Builder>
        errors_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.rpc.StatusOrBuilder,
            com.google.rpc.Status,
            com.google.rpc.Status.Builder>
        internalGetErrors() {
      if (errors_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(errorsConverter);
      }
      return errors_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.rpc.StatusOrBuilder,
            com.google.rpc.Status,
            com.google.rpc.Status.Builder>
        internalGetMutableErrors() {
      if (errors_ == null) {
        errors_ = new com.google.protobuf.MapFieldBuilder<>(errorsConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return errors_;
    }

    public int getErrorsCount() {
      return internalGetErrors().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    @java.lang.Override
    public boolean containsErrors(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetErrors().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getErrorsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.rpc.Status> getErrors() {
      return getErrorsMap();
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.rpc.Status> getErrorsMap() {
      return internalGetErrors().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.rpc.Status getErrorsOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.rpc.Status defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.rpc.StatusOrBuilder> map =
          internalGetMutableErrors().ensureBuilderMap();
      return map.containsKey(key) ? errorsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    @java.lang.Override
    public com.google.rpc.Status getErrorsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.rpc.StatusOrBuilder> map =
          internalGetMutableErrors().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return errorsConverter.build(map.get(key));
    }

    public Builder clearErrors() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableErrors().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    public Builder removeErrors(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableErrors().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.rpc.Status> getMutableErrors() {
      bitField0_ |= 0x00000002;
      return internalGetMutableErrors().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    public Builder putErrors(java.lang.String key, com.google.rpc.Status value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableErrors().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    public Builder putAllErrors(java.util.Map<java.lang.String, com.google.rpc.Status> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.rpc.Status> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableErrors().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maps the name of each tagged column (or empty string for a
     * sole entry) to tagging operation [status][google.rpc.Status].
     * </pre>
     *
     * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
     */
    public com.google.rpc.Status.Builder putErrorsBuilderIfAbsent(java.lang.String key) {
      java.util.Map<java.lang.String, com.google.rpc.StatusOrBuilder> builderMap =
          internalGetMutableErrors().ensureBuilderMap();
      com.google.rpc.StatusOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.rpc.Status.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.rpc.Status) {
        entry = ((com.google.rpc.Status) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.rpc.Status.Builder) entry;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ReconcileTagsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ReconcileTagsMetadata)
  private static final com.google.cloud.datacatalog.v1.ReconcileTagsMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ReconcileTagsMetadata();
  }

  public static com.google.cloud.datacatalog.v1.ReconcileTagsMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReconcileTagsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ReconcileTagsMetadata>() {
        @java.lang.Override
        public ReconcileTagsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReconcileTagsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReconcileTagsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ReconcileTagsMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
