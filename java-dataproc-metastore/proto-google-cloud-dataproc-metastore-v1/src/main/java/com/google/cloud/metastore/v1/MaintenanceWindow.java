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
// source: google/cloud/metastore/v1/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1;

/**
 *
 *
 * <pre>
 * Maintenance window. This specifies when Dataproc Metastore
 * may perform system maintenance operation to the service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1.MaintenanceWindow}
 */
public final class MaintenanceWindow extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1.MaintenanceWindow)
    MaintenanceWindowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MaintenanceWindow.newBuilder() to construct.
  private MaintenanceWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MaintenanceWindow() {
    dayOfWeek_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MaintenanceWindow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_MaintenanceWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_MaintenanceWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1.MaintenanceWindow.class,
            com.google.cloud.metastore.v1.MaintenanceWindow.Builder.class);
  }

  private int bitField0_;
  public static final int HOUR_OF_DAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value hourOfDay_;
  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   *
   * @return Whether the hourOfDay field is set.
   */
  @java.lang.Override
  public boolean hasHourOfDay() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   *
   * @return The hourOfDay.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getHourOfDay() {
    return hourOfDay_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : hourOfDay_;
  }
  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getHourOfDayOrBuilder() {
    return hourOfDay_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : hourOfDay_;
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 2;
  private int dayOfWeek_ = 0;
  /**
   *
   *
   * <pre>
   * The day of week, when the window starts.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  @java.lang.Override
  public int getDayOfWeekValue() {
    return dayOfWeek_;
  }
  /**
   *
   *
   * <pre>
   * The day of week, when the window starts.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The dayOfWeek.
   */
  @java.lang.Override
  public com.google.type.DayOfWeek getDayOfWeek() {
    com.google.type.DayOfWeek result = com.google.type.DayOfWeek.forNumber(dayOfWeek_);
    return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHourOfDay());
    }
    if (dayOfWeek_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, dayOfWeek_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHourOfDay());
    }
    if (dayOfWeek_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, dayOfWeek_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1.MaintenanceWindow)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1.MaintenanceWindow other =
        (com.google.cloud.metastore.v1.MaintenanceWindow) obj;

    if (hasHourOfDay() != other.hasHourOfDay()) return false;
    if (hasHourOfDay()) {
      if (!getHourOfDay().equals(other.getHourOfDay())) return false;
    }
    if (dayOfWeek_ != other.dayOfWeek_) return false;
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
    if (hasHourOfDay()) {
      hash = (37 * hash) + HOUR_OF_DAY_FIELD_NUMBER;
      hash = (53 * hash) + getHourOfDay().hashCode();
    }
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + dayOfWeek_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow parseFrom(
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

  public static Builder newBuilder(com.google.cloud.metastore.v1.MaintenanceWindow prototype) {
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
   * Maintenance window. This specifies when Dataproc Metastore
   * may perform system maintenance operation to the service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1.MaintenanceWindow}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1.MaintenanceWindow)
      com.google.cloud.metastore.v1.MaintenanceWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MaintenanceWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MaintenanceWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1.MaintenanceWindow.class,
              com.google.cloud.metastore.v1.MaintenanceWindow.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1.MaintenanceWindow.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHourOfDayFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hourOfDay_ = null;
      if (hourOfDayBuilder_ != null) {
        hourOfDayBuilder_.dispose();
        hourOfDayBuilder_ = null;
      }
      dayOfWeek_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MaintenanceWindow_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MaintenanceWindow getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1.MaintenanceWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MaintenanceWindow build() {
      com.google.cloud.metastore.v1.MaintenanceWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MaintenanceWindow buildPartial() {
      com.google.cloud.metastore.v1.MaintenanceWindow result =
          new com.google.cloud.metastore.v1.MaintenanceWindow(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1.MaintenanceWindow result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hourOfDay_ = hourOfDayBuilder_ == null ? hourOfDay_ : hourOfDayBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dayOfWeek_ = dayOfWeek_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.metastore.v1.MaintenanceWindow) {
        return mergeFrom((com.google.cloud.metastore.v1.MaintenanceWindow) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1.MaintenanceWindow other) {
      if (other == com.google.cloud.metastore.v1.MaintenanceWindow.getDefaultInstance())
        return this;
      if (other.hasHourOfDay()) {
        mergeHourOfDay(other.getHourOfDay());
      }
      if (other.dayOfWeek_ != 0) {
        setDayOfWeekValue(other.getDayOfWeekValue());
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
                input.readMessage(getHourOfDayFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                dayOfWeek_ = input.readEnum();
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

    private com.google.protobuf.Int32Value hourOfDay_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value,
            com.google.protobuf.Int32Value.Builder,
            com.google.protobuf.Int32ValueOrBuilder>
        hourOfDayBuilder_;
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     *
     * @return Whether the hourOfDay field is set.
     */
    public boolean hasHourOfDay() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     *
     * @return The hourOfDay.
     */
    public com.google.protobuf.Int32Value getHourOfDay() {
      if (hourOfDayBuilder_ == null) {
        return hourOfDay_ == null
            ? com.google.protobuf.Int32Value.getDefaultInstance()
            : hourOfDay_;
      } else {
        return hourOfDayBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public Builder setHourOfDay(com.google.protobuf.Int32Value value) {
      if (hourOfDayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hourOfDay_ = value;
      } else {
        hourOfDayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public Builder setHourOfDay(com.google.protobuf.Int32Value.Builder builderForValue) {
      if (hourOfDayBuilder_ == null) {
        hourOfDay_ = builderForValue.build();
      } else {
        hourOfDayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public Builder mergeHourOfDay(com.google.protobuf.Int32Value value) {
      if (hourOfDayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && hourOfDay_ != null
            && hourOfDay_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
          getHourOfDayBuilder().mergeFrom(value);
        } else {
          hourOfDay_ = value;
        }
      } else {
        hourOfDayBuilder_.mergeFrom(value);
      }
      if (hourOfDay_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public Builder clearHourOfDay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hourOfDay_ = null;
      if (hourOfDayBuilder_ != null) {
        hourOfDayBuilder_.dispose();
        hourOfDayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public com.google.protobuf.Int32Value.Builder getHourOfDayBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHourOfDayFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getHourOfDayOrBuilder() {
      if (hourOfDayBuilder_ != null) {
        return hourOfDayBuilder_.getMessageOrBuilder();
      } else {
        return hourOfDay_ == null
            ? com.google.protobuf.Int32Value.getDefaultInstance()
            : hourOfDay_;
      }
    }
    /**
     *
     *
     * <pre>
     * The hour of day (0-23) when the window starts.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value,
            com.google.protobuf.Int32Value.Builder,
            com.google.protobuf.Int32ValueOrBuilder>
        getHourOfDayFieldBuilder() {
      if (hourOfDayBuilder_ == null) {
        hourOfDayBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Int32Value,
                com.google.protobuf.Int32Value.Builder,
                com.google.protobuf.Int32ValueOrBuilder>(
                getHourOfDay(), getParentForChildren(), isClean());
        hourOfDay_ = null;
      }
      return hourOfDayBuilder_;
    }

    private int dayOfWeek_ = 0;
    /**
     *
     *
     * <pre>
     * The day of week, when the window starts.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2;</code>
     *
     * @return The enum numeric value on the wire for dayOfWeek.
     */
    @java.lang.Override
    public int getDayOfWeekValue() {
      return dayOfWeek_;
    }
    /**
     *
     *
     * <pre>
     * The day of week, when the window starts.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2;</code>
     *
     * @param value The enum numeric value on the wire for dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeekValue(int value) {
      dayOfWeek_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The day of week, when the window starts.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2;</code>
     *
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public com.google.type.DayOfWeek getDayOfWeek() {
      com.google.type.DayOfWeek result = com.google.type.DayOfWeek.forNumber(dayOfWeek_);
      return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The day of week, when the window starts.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2;</code>
     *
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(com.google.type.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dayOfWeek_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The day of week, when the window starts.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day_of_week = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dayOfWeek_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1.MaintenanceWindow)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1.MaintenanceWindow)
  private static final com.google.cloud.metastore.v1.MaintenanceWindow DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1.MaintenanceWindow();
  }

  public static com.google.cloud.metastore.v1.MaintenanceWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaintenanceWindow> PARSER =
      new com.google.protobuf.AbstractParser<MaintenanceWindow>() {
        @java.lang.Override
        public MaintenanceWindow parsePartialFrom(
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

  public static com.google.protobuf.Parser<MaintenanceWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaintenanceWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1.MaintenanceWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
