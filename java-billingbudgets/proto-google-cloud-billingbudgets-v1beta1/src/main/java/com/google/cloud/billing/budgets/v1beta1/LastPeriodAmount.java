/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

package com.google.cloud.billing.budgets.v1beta1;

/**
 *
 *
 * <pre>
 * Describes a budget amount targeted to the last [Filter.calendar_period][google.cloud.billing.budgets.v1beta1.Filter.calendar_period]
 * spend. At this time, the amount is automatically 100% of the last calendar
 * period's spend; that is, there are no other options yet.
 * Future configuration options will be described here (for example, configuring
 * a percentage of last period's spend).
 * LastPeriodAmount cannot be set for a budget configured with
 * a [Filter.custom_period][google.cloud.billing.budgets.v1beta1.Filter.custom_period].
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.budgets.v1beta1.LastPeriodAmount}
 */
public final class LastPeriodAmount extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.budgets.v1beta1.LastPeriodAmount)
    LastPeriodAmountOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LastPeriodAmount.newBuilder() to construct.
  private LastPeriodAmount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LastPeriodAmount() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LastPeriodAmount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LastPeriodAmount(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetModel
        .internal_static_google_cloud_billing_budgets_v1beta1_LastPeriodAmount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetModel
        .internal_static_google_cloud_billing_budgets_v1beta1_LastPeriodAmount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.class,
            com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount other =
        (com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parseFrom(
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
      com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount prototype) {
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
   * Describes a budget amount targeted to the last [Filter.calendar_period][google.cloud.billing.budgets.v1beta1.Filter.calendar_period]
   * spend. At this time, the amount is automatically 100% of the last calendar
   * period's spend; that is, there are no other options yet.
   * Future configuration options will be described here (for example, configuring
   * a percentage of last period's spend).
   * LastPeriodAmount cannot be set for a budget configured with
   * a [Filter.custom_period][google.cloud.billing.budgets.v1beta1.Filter.custom_period].
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.budgets.v1beta1.LastPeriodAmount}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.budgets.v1beta1.LastPeriodAmount)
      com.google.cloud.billing.budgets.v1beta1.LastPeriodAmountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetModel
          .internal_static_google_cloud_billing_budgets_v1beta1_LastPeriodAmount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetModel
          .internal_static_google_cloud_billing_budgets_v1beta1_LastPeriodAmount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.class,
              com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.Builder.class);
    }

    // Construct using com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetModel
          .internal_static_google_cloud_billing_budgets_v1beta1_LastPeriodAmount_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount getDefaultInstanceForType() {
      return com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount build() {
      com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount buildPartial() {
      com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount result =
          new com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount(this);
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
      if (other instanceof com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount) {
        return mergeFrom((com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount other) {
      if (other == com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount.getDefaultInstance())
        return this;
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
      com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.budgets.v1beta1.LastPeriodAmount)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.budgets.v1beta1.LastPeriodAmount)
  private static final com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount();
  }

  public static com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LastPeriodAmount> PARSER =
      new com.google.protobuf.AbstractParser<LastPeriodAmount>() {
        @java.lang.Override
        public LastPeriodAmount parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LastPeriodAmount(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LastPeriodAmount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LastPeriodAmount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.budgets.v1beta1.LastPeriodAmount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
