// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

/**
 * <pre>
 * Types of licenses used in OS adaptation.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.vmmigration.v1.ComputeEngineLicenseType}
 */
public enum ComputeEngineLicenseType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The license type is the default for the OS.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_DEFAULT = 0;</code>
   */
  COMPUTE_ENGINE_LICENSE_TYPE_DEFAULT(0),
  /**
   * <pre>
   * The license type is Pay As You Go license type.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_PAYG = 1;</code>
   */
  COMPUTE_ENGINE_LICENSE_TYPE_PAYG(1),
  /**
   * <pre>
   * The license type is Bring Your Own License type.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_BYOL = 2;</code>
   */
  COMPUTE_ENGINE_LICENSE_TYPE_BYOL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The license type is the default for the OS.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_DEFAULT = 0;</code>
   */
  public static final int COMPUTE_ENGINE_LICENSE_TYPE_DEFAULT_VALUE = 0;
  /**
   * <pre>
   * The license type is Pay As You Go license type.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_PAYG = 1;</code>
   */
  public static final int COMPUTE_ENGINE_LICENSE_TYPE_PAYG_VALUE = 1;
  /**
   * <pre>
   * The license type is Bring Your Own License type.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_LICENSE_TYPE_BYOL = 2;</code>
   */
  public static final int COMPUTE_ENGINE_LICENSE_TYPE_BYOL_VALUE = 2;


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
  public static ComputeEngineLicenseType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ComputeEngineLicenseType forNumber(int value) {
    switch (value) {
      case 0: return COMPUTE_ENGINE_LICENSE_TYPE_DEFAULT;
      case 1: return COMPUTE_ENGINE_LICENSE_TYPE_PAYG;
      case 2: return COMPUTE_ENGINE_LICENSE_TYPE_BYOL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComputeEngineLicenseType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ComputeEngineLicenseType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ComputeEngineLicenseType>() {
          public ComputeEngineLicenseType findValueByNumber(int number) {
            return ComputeEngineLicenseType.forNumber(number);
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
    return com.google.cloud.vmmigration.v1.VmMigrationProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final ComputeEngineLicenseType[] VALUES = values();

  public static ComputeEngineLicenseType valueOf(
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

  private ComputeEngineLicenseType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.vmmigration.v1.ComputeEngineLicenseType)
}

