// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v1/logging_config.proto

package com.google.logging.v1;

/**
 * Protobuf type {@code google.logging.v1.LogError}
 *
 * <pre>
 * Describes a problem with a logging resource or operation.
 * </pre>
 */
public  final class LogError extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.logging.v1.LogError)
    LogErrorOrBuilder {
  // Use LogError.newBuilder() to construct.
  private LogError(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LogError() {
    resource_ = "";
    timeNanos_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LogError(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 18: {
            com.google.rpc.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            timeNanos_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v1.LoggingConfig.internal_static_google_logging_v1_LogError_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v1.LoggingConfig.internal_static_google_logging_v1_LogError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v1.LogError.class, com.google.logging.v1.LogError.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resource_;
  /**
   * <code>optional string resource = 1;</code>
   *
   * <pre>
   * A resource name associated with this error. For example,
   * the name of a Cloud Storage bucket that has insufficient permissions
   * to be a destination for log entries.
   * </pre>
   */
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <code>optional string resource = 1;</code>
   *
   * <pre>
   * A resource name associated with this error. For example,
   * the name of a Cloud Storage bucket that has insufficient permissions
   * to be a destination for log entries.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   * <code>optional .google.rpc.Status status = 2;</code>
   *
   * <pre>
   * The error description, including a classification code,
   * an error message, and other details.
   * </pre>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>optional .google.rpc.Status status = 2;</code>
   *
   * <pre>
   * The error description, including a classification code,
   * an error message, and other details.
   * </pre>
   */
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>optional .google.rpc.Status status = 2;</code>
   *
   * <pre>
   * The error description, including a classification code,
   * an error message, and other details.
   * </pre>
   */
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int TIME_NANOS_FIELD_NUMBER = 3;
  private long timeNanos_;
  /**
   * <code>optional int64 time_nanos = 3;</code>
   *
   * <pre>
   * The time the error was observed, in nanoseconds since the Unix epoch.
   * </pre>
   */
  public long getTimeNanos() {
    return timeNanos_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, resource_);
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    if (timeNanos_ != 0L) {
      output.writeInt64(3, timeNanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, resource_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
    }
    if (timeNanos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeNanos_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.logging.v1.LogError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v1.LogError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v1.LogError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v1.LogError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v1.LogError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v1.LogError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.logging.v1.LogError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.logging.v1.LogError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.logging.v1.LogError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v1.LogError parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v1.LogError prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.logging.v1.LogError}
   *
   * <pre>
   * Describes a problem with a logging resource or operation.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v1.LogError)
      com.google.logging.v1.LogErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v1.LoggingConfig.internal_static_google_logging_v1_LogError_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v1.LoggingConfig.internal_static_google_logging_v1_LogError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v1.LogError.class, com.google.logging.v1.LogError.Builder.class);
    }

    // Construct using com.google.logging.v1.LogError.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      resource_ = "";

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      timeNanos_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v1.LoggingConfig.internal_static_google_logging_v1_LogError_descriptor;
    }

    public com.google.logging.v1.LogError getDefaultInstanceForType() {
      return com.google.logging.v1.LogError.getDefaultInstance();
    }

    public com.google.logging.v1.LogError build() {
      com.google.logging.v1.LogError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v1.LogError buildPartial() {
      com.google.logging.v1.LogError result = new com.google.logging.v1.LogError(this);
      result.resource_ = resource_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.timeNanos_ = timeNanos_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v1.LogError) {
        return mergeFrom((com.google.logging.v1.LogError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v1.LogError other) {
      if (other == com.google.logging.v1.LogError.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.getTimeNanos() != 0L) {
        setTimeNanos(other.getTimeNanos());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v1.LogError parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v1.LogError) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     * <code>optional string resource = 1;</code>
     *
     * <pre>
     * A resource name associated with this error. For example,
     * the name of a Cloud Storage bucket that has insufficient permissions
     * to be a destination for log entries.
     * </pre>
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string resource = 1;</code>
     *
     * <pre>
     * A resource name associated with this error. For example,
     * the name of a Cloud Storage bucket that has insufficient permissions
     * to be a destination for log entries.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string resource = 1;</code>
     *
     * <pre>
     * A resource name associated with this error. For example,
     * the name of a Cloud Storage bucket that has insufficient permissions
     * to be a destination for log entries.
     * </pre>
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string resource = 1;</code>
     *
     * <pre>
     * A resource name associated with this error. For example,
     * the name of a Cloud Storage bucket that has insufficient permissions
     * to be a destination for log entries.
     * </pre>
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <code>optional string resource = 1;</code>
     *
     * <pre>
     * A resource name associated with this error. For example,
     * the name of a Cloud Storage bucket that has insufficient permissions
     * to be a destination for log entries.
     * </pre>
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
      onChanged();
      return this;
    }

    private com.google.rpc.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.google.rpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>optional .google.rpc.Status status = 2;</code>
     *
     * <pre>
     * The error description, including a classification code,
     * an error message, and other details.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private long timeNanos_ ;
    /**
     * <code>optional int64 time_nanos = 3;</code>
     *
     * <pre>
     * The time the error was observed, in nanoseconds since the Unix epoch.
     * </pre>
     */
    public long getTimeNanos() {
      return timeNanos_;
    }
    /**
     * <code>optional int64 time_nanos = 3;</code>
     *
     * <pre>
     * The time the error was observed, in nanoseconds since the Unix epoch.
     * </pre>
     */
    public Builder setTimeNanos(long value) {
      
      timeNanos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 time_nanos = 3;</code>
     *
     * <pre>
     * The time the error was observed, in nanoseconds since the Unix epoch.
     * </pre>
     */
    public Builder clearTimeNanos() {
      
      timeNanos_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v1.LogError)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v1.LogError)
  private static final com.google.logging.v1.LogError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v1.LogError();
  }

  public static com.google.logging.v1.LogError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogError>
      PARSER = new com.google.protobuf.AbstractParser<LogError>() {
    public LogError parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LogError(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<LogError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogError> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v1.LogError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

