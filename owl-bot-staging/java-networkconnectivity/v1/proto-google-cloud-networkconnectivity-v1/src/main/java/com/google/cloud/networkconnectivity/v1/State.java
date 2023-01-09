// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

/**
 * <pre>
 * The State enum represents the lifecycle stage of a Network Connectivity
 * Center resource.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.networkconnectivity.v1.State}
 */
public enum State
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No state information available
   * </pre>
   *
   * <code>STATE_UNSPECIFIED = 0;</code>
   */
  STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * The resource's create operation is in progress
   * </pre>
   *
   * <code>CREATING = 1;</code>
   */
  CREATING(1),
  /**
   * <pre>
   * The resource is active
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  ACTIVE(2),
  /**
   * <pre>
   * The resource's Delete operation is in progress
   * </pre>
   *
   * <code>DELETING = 3;</code>
   */
  DELETING(3),
  /**
   * <pre>
   * The resource's Update operation is in progress
   * </pre>
   *
   * <code>UPDATING = 6;</code>
   */
  UPDATING(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No state information available
   * </pre>
   *
   * <code>STATE_UNSPECIFIED = 0;</code>
   */
  public static final int STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The resource's create operation is in progress
   * </pre>
   *
   * <code>CREATING = 1;</code>
   */
  public static final int CREATING_VALUE = 1;
  /**
   * <pre>
   * The resource is active
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  public static final int ACTIVE_VALUE = 2;
  /**
   * <pre>
   * The resource's Delete operation is in progress
   * </pre>
   *
   * <code>DELETING = 3;</code>
   */
  public static final int DELETING_VALUE = 3;
  /**
   * <pre>
   * The resource's Update operation is in progress
   * </pre>
   *
   * <code>UPDATING = 6;</code>
   */
  public static final int UPDATING_VALUE = 6;


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
  public static State valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static State forNumber(int value) {
    switch (value) {
      case 0: return STATE_UNSPECIFIED;
      case 1: return CREATING;
      case 2: return ACTIVE;
      case 3: return DELETING;
      case 6: return UPDATING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<State>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
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
    return com.google.cloud.networkconnectivity.v1.HubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final State[] VALUES = values();

  public static State valueOf(
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

  private State(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.networkconnectivity.v1.State)
}

