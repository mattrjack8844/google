// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

/**
 * <pre>
 * BlueprintView defines the type of view of the blueprint.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.telcoautomation.v1.BlueprintView}
 */
public enum BlueprintView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified enum value.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_UNSPECIFIED = 0;</code>
   */
  BLUEPRINT_VIEW_UNSPECIFIED(0),
  /**
   * <pre>
   * View which only contains metadata.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_BASIC = 1;</code>
   */
  BLUEPRINT_VIEW_BASIC(1),
  /**
   * <pre>
   * View which contains metadata and files it encapsulates.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_FULL = 2;</code>
   */
  BLUEPRINT_VIEW_FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified enum value.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int BLUEPRINT_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * View which only contains metadata.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_BASIC = 1;</code>
   */
  public static final int BLUEPRINT_VIEW_BASIC_VALUE = 1;
  /**
   * <pre>
   * View which contains metadata and files it encapsulates.
   * </pre>
   *
   * <code>BLUEPRINT_VIEW_FULL = 2;</code>
   */
  public static final int BLUEPRINT_VIEW_FULL_VALUE = 2;


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
  public static BlueprintView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BlueprintView forNumber(int value) {
    switch (value) {
      case 0: return BLUEPRINT_VIEW_UNSPECIFIED;
      case 1: return BLUEPRINT_VIEW_BASIC;
      case 2: return BLUEPRINT_VIEW_FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BlueprintView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BlueprintView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BlueprintView>() {
          public BlueprintView findValueByNumber(int number) {
            return BlueprintView.forNumber(number);
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
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final BlueprintView[] VALUES = values();

  public static BlueprintView valueOf(
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

  private BlueprintView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.telcoautomation.v1.BlueprintView)
}

