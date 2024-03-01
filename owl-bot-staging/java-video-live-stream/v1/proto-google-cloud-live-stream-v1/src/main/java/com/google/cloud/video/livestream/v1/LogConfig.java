// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

/**
 * <pre>
 * Configuration of platform logs.
 * See [Using and managing platform
 * logs](https://cloud.google.com/logging/docs/api/platform-logs#managing-logs)
 * for more information about how to view platform logs through Cloud Logging.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.LogConfig}
 */
public final class LogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.LogConfig)
    LogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogConfig.newBuilder() to construct.
  private LogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogConfig() {
    logSeverity_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto.internal_static_google_cloud_video_livestream_v1_LogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto.internal_static_google_cloud_video_livestream_v1_LogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.LogConfig.class, com.google.cloud.video.livestream.v1.LogConfig.Builder.class);
  }

  /**
   * <pre>
   * The severity level of platform logging for this channel. Logs with a
   * severity level higher than or equal to the chosen severity level will be
   * logged and can be viewed through Cloud Logging.
   * The severity level of a log is ranked as followed from low to high: DEBUG &lt;
   * INFO &lt; NOTICE &lt; WARNING &lt; ERROR &lt; CRITICAL &lt; ALERT &lt; EMERGENCY.
   * See
   * [LogSeverity](https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry#logseverity)
   * for more information.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.video.livestream.v1.LogConfig.LogSeverity}
   */
  public enum LogSeverity
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Log severity is not specified. This is the same as log severity is OFF.
     * </pre>
     *
     * <code>LOG_SEVERITY_UNSPECIFIED = 0;</code>
     */
    LOG_SEVERITY_UNSPECIFIED(0),
    /**
     * <pre>
     * Log is turned off.
     * </pre>
     *
     * <code>OFF = 1;</code>
     */
    OFF(1),
    /**
     * <pre>
     * Log with severity higher than or equal to DEBUG are logged.
     * </pre>
     *
     * <code>DEBUG = 100;</code>
     */
    DEBUG(100),
    /**
     * <pre>
     * Logs with severity higher than or equal to INFO are logged.
     * </pre>
     *
     * <code>INFO = 200;</code>
     */
    INFO(200),
    /**
     * <pre>
     * Logs with severity higher than or equal to WARNING are logged.
     * </pre>
     *
     * <code>WARNING = 400;</code>
     */
    WARNING(400),
    /**
     * <pre>
     * Logs with severity higher than or equal to ERROR are logged.
     * </pre>
     *
     * <code>ERROR = 500;</code>
     */
    ERROR(500),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Log severity is not specified. This is the same as log severity is OFF.
     * </pre>
     *
     * <code>LOG_SEVERITY_UNSPECIFIED = 0;</code>
     */
    public static final int LOG_SEVERITY_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Log is turned off.
     * </pre>
     *
     * <code>OFF = 1;</code>
     */
    public static final int OFF_VALUE = 1;
    /**
     * <pre>
     * Log with severity higher than or equal to DEBUG are logged.
     * </pre>
     *
     * <code>DEBUG = 100;</code>
     */
    public static final int DEBUG_VALUE = 100;
    /**
     * <pre>
     * Logs with severity higher than or equal to INFO are logged.
     * </pre>
     *
     * <code>INFO = 200;</code>
     */
    public static final int INFO_VALUE = 200;
    /**
     * <pre>
     * Logs with severity higher than or equal to WARNING are logged.
     * </pre>
     *
     * <code>WARNING = 400;</code>
     */
    public static final int WARNING_VALUE = 400;
    /**
     * <pre>
     * Logs with severity higher than or equal to ERROR are logged.
     * </pre>
     *
     * <code>ERROR = 500;</code>
     */
    public static final int ERROR_VALUE = 500;


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
    public static LogSeverity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogSeverity forNumber(int value) {
      switch (value) {
        case 0: return LOG_SEVERITY_UNSPECIFIED;
        case 1: return OFF;
        case 100: return DEBUG;
        case 200: return INFO;
        case 400: return WARNING;
        case 500: return ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogSeverity>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LogSeverity> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LogSeverity>() {
            public LogSeverity findValueByNumber(int number) {
              return LogSeverity.forNumber(number);
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
      return com.google.cloud.video.livestream.v1.LogConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final LogSeverity[] VALUES = values();

    public static LogSeverity valueOf(
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

    private LogSeverity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.video.livestream.v1.LogConfig.LogSeverity)
  }

  public static final int LOG_SEVERITY_FIELD_NUMBER = 1;
  private int logSeverity_ = 0;
  /**
   * <pre>
   * The severity level of platform logging for this resource.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
   * @return The enum numeric value on the wire for logSeverity.
   */
  @java.lang.Override public int getLogSeverityValue() {
    return logSeverity_;
  }
  /**
   * <pre>
   * The severity level of platform logging for this resource.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
   * @return The logSeverity.
   */
  @java.lang.Override public com.google.cloud.video.livestream.v1.LogConfig.LogSeverity getLogSeverity() {
    com.google.cloud.video.livestream.v1.LogConfig.LogSeverity result = com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.forNumber(logSeverity_);
    return result == null ? com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.UNRECOGNIZED : result;
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
    if (logSeverity_ != com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.LOG_SEVERITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, logSeverity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logSeverity_ != com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.LOG_SEVERITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, logSeverity_);
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.LogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.LogConfig other = (com.google.cloud.video.livestream.v1.LogConfig) obj;

    if (logSeverity_ != other.logSeverity_) return false;
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
    hash = (37 * hash) + LOG_SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + logSeverity_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.LogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.LogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.livestream.v1.LogConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.livestream.v1.LogConfig prototype) {
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
   * Configuration of platform logs.
   * See [Using and managing platform
   * logs](https://cloud.google.com/logging/docs/api/platform-logs#managing-logs)
   * for more information about how to view platform logs through Cloud Logging.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.LogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.LogConfig)
      com.google.cloud.video.livestream.v1.LogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto.internal_static_google_cloud_video_livestream_v1_LogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto.internal_static_google_cloud_video_livestream_v1_LogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.LogConfig.class, com.google.cloud.video.livestream.v1.LogConfig.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.LogConfig.newBuilder()
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
      logSeverity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto.internal_static_google_cloud_video_livestream_v1_LogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.LogConfig getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.LogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.LogConfig build() {
      com.google.cloud.video.livestream.v1.LogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.LogConfig buildPartial() {
      com.google.cloud.video.livestream.v1.LogConfig result = new com.google.cloud.video.livestream.v1.LogConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.livestream.v1.LogConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logSeverity_ = logSeverity_;
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
      if (other instanceof com.google.cloud.video.livestream.v1.LogConfig) {
        return mergeFrom((com.google.cloud.video.livestream.v1.LogConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.LogConfig other) {
      if (other == com.google.cloud.video.livestream.v1.LogConfig.getDefaultInstance()) return this;
      if (other.logSeverity_ != 0) {
        setLogSeverityValue(other.getLogSeverityValue());
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
              logSeverity_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int logSeverity_ = 0;
    /**
     * <pre>
     * The severity level of platform logging for this resource.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
     * @return The enum numeric value on the wire for logSeverity.
     */
    @java.lang.Override public int getLogSeverityValue() {
      return logSeverity_;
    }
    /**
     * <pre>
     * The severity level of platform logging for this resource.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
     * @param value The enum numeric value on the wire for logSeverity to set.
     * @return This builder for chaining.
     */
    public Builder setLogSeverityValue(int value) {
      logSeverity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The severity level of platform logging for this resource.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
     * @return The logSeverity.
     */
    @java.lang.Override
    public com.google.cloud.video.livestream.v1.LogConfig.LogSeverity getLogSeverity() {
      com.google.cloud.video.livestream.v1.LogConfig.LogSeverity result = com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.forNumber(logSeverity_);
      return result == null ? com.google.cloud.video.livestream.v1.LogConfig.LogSeverity.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The severity level of platform logging for this resource.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
     * @param value The logSeverity to set.
     * @return This builder for chaining.
     */
    public Builder setLogSeverity(com.google.cloud.video.livestream.v1.LogConfig.LogSeverity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      logSeverity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The severity level of platform logging for this resource.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogSeverity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      logSeverity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.LogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.LogConfig)
  private static final com.google.cloud.video.livestream.v1.LogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.LogConfig();
  }

  public static com.google.cloud.video.livestream.v1.LogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogConfig>
      PARSER = new com.google.protobuf.AbstractParser<LogConfig>() {
    @java.lang.Override
    public LogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.LogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

