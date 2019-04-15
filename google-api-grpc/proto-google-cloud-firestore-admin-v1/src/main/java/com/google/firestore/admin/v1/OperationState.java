// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/operation.proto

package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * Describes the state of the operation.
 * </pre>
 *
 * Protobuf enum {@code google.firestore.admin.v1.OperationState}
 */
public enum OperationState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>OPERATION_STATE_UNSPECIFIED = 0;</code>
   */
  OPERATION_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Request is being prepared for processing.
   * </pre>
   *
   * <code>INITIALIZING = 1;</code>
   */
  INITIALIZING(1),
  /**
   *
   *
   * <pre>
   * Request is actively being processed.
   * </pre>
   *
   * <code>PROCESSING = 2;</code>
   */
  PROCESSING(2),
  /**
   *
   *
   * <pre>
   * Request is in the process of being cancelled after user called
   * google.longrunning.Operations.CancelOperation on the operation.
   * </pre>
   *
   * <code>CANCELLING = 3;</code>
   */
  CANCELLING(3),
  /**
   *
   *
   * <pre>
   * Request has been processed and is in its finalization stage.
   * </pre>
   *
   * <code>FINALIZING = 4;</code>
   */
  FINALIZING(4),
  /**
   *
   *
   * <pre>
   * Request has completed successfully.
   * </pre>
   *
   * <code>SUCCESSFUL = 5;</code>
   */
  SUCCESSFUL(5),
  /**
   *
   *
   * <pre>
   * Request has finished being processed, but encountered an error.
   * </pre>
   *
   * <code>FAILED = 6;</code>
   */
  FAILED(6),
  /**
   *
   *
   * <pre>
   * Request has finished being cancelled after user called
   * google.longrunning.Operations.CancelOperation.
   * </pre>
   *
   * <code>CANCELLED = 7;</code>
   */
  CANCELLED(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>OPERATION_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int OPERATION_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Request is being prepared for processing.
   * </pre>
   *
   * <code>INITIALIZING = 1;</code>
   */
  public static final int INITIALIZING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Request is actively being processed.
   * </pre>
   *
   * <code>PROCESSING = 2;</code>
   */
  public static final int PROCESSING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Request is in the process of being cancelled after user called
   * google.longrunning.Operations.CancelOperation on the operation.
   * </pre>
   *
   * <code>CANCELLING = 3;</code>
   */
  public static final int CANCELLING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Request has been processed and is in its finalization stage.
   * </pre>
   *
   * <code>FINALIZING = 4;</code>
   */
  public static final int FINALIZING_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Request has completed successfully.
   * </pre>
   *
   * <code>SUCCESSFUL = 5;</code>
   */
  public static final int SUCCESSFUL_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Request has finished being processed, but encountered an error.
   * </pre>
   *
   * <code>FAILED = 6;</code>
   */
  public static final int FAILED_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Request has finished being cancelled after user called
   * google.longrunning.Operations.CancelOperation.
   * </pre>
   *
   * <code>CANCELLED = 7;</code>
   */
  public static final int CANCELLED_VALUE = 7;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static OperationState valueOf(int value) {
    return forNumber(value);
  }

  public static OperationState forNumber(int value) {
    switch (value) {
      case 0:
        return OPERATION_STATE_UNSPECIFIED;
      case 1:
        return INITIALIZING;
      case 2:
        return PROCESSING;
      case 3:
        return CANCELLING;
      case 4:
        return FINALIZING;
      case 5:
        return SUCCESSFUL;
      case 6:
        return FAILED;
      case 7:
        return CANCELLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OperationState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<OperationState>() {
        public OperationState findValueByNumber(int number) {
          return OperationState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.firestore.admin.v1.OperationProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OperationState[] VALUES = values();

  public static OperationState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OperationState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.firestore.admin.v1.OperationState)
}
