// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.serviceusage.v1beta1;

/**
 * <pre>
 * Selected view of quota. Can be used to request more detailed quota
 * information when retrieving quota metrics and limits.
 * </pre>
 *
 * Protobuf enum {@code google.api.serviceusage.v1beta1.QuotaView}
 */
public enum QuotaView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No quota view specified. Requests that do not specify a quota view will
   * typically default to the BASIC view.
   * </pre>
   *
   * <code>QUOTA_VIEW_UNSPECIFIED = 0;</code>
   */
  QUOTA_VIEW_UNSPECIFIED(0),
  /**
   * <pre>
   * Only buckets with overrides are shown in the response.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   * <pre>
   * Include per-location buckets even if they do not have overrides.
   * When the view is FULL, and a limit has regional or zonal quota, the limit
   * will include buckets for all regions or zones that could support
   * overrides, even if none are currently present. In some cases this will
   * cause the response to become very large; callers that do not need this
   * extra information should use the BASIC view instead.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No quota view specified. Requests that do not specify a quota view will
   * typically default to the BASIC view.
   * </pre>
   *
   * <code>QUOTA_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int QUOTA_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Only buckets with overrides are shown in the response.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;
  /**
   * <pre>
   * Include per-location buckets even if they do not have overrides.
   * When the view is FULL, and a limit has regional or zonal quota, the limit
   * will include buckets for all regions or zones that could support
   * overrides, even if none are currently present. In some cases this will
   * cause the response to become very large; callers that do not need this
   * extra information should use the BASIC view instead.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;


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
  public static QuotaView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QuotaView forNumber(int value) {
    switch (value) {
      case 0: return QUOTA_VIEW_UNSPECIFIED;
      case 1: return BASIC;
      case 2: return FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QuotaView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      QuotaView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QuotaView>() {
          public QuotaView findValueByNumber(int number) {
            return QuotaView.forNumber(number);
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
    return com.google.api.serviceusage.v1beta1.ResourcesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final QuotaView[] VALUES = values();

  public static QuotaView valueOf(
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

  private QuotaView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.serviceusage.v1beta1.QuotaView)
}

