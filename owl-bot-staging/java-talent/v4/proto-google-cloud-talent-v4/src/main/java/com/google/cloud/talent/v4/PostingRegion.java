// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

/**
 * <pre>
 * An enum that represents the job posting region. In most cases, job postings
 * don't need to specify a region. If a region is given, jobs are
 * eligible for searches in the specified region.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4.PostingRegion}
 */
public enum PostingRegion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * If the region is unspecified, the job is only returned if it
   * matches the [LocationFilter][google.cloud.talent.v4.LocationFilter].
   * </pre>
   *
   * <code>POSTING_REGION_UNSPECIFIED = 0;</code>
   */
  POSTING_REGION_UNSPECIFIED(0),
  /**
   * <pre>
   * In addition to exact location matching, job posting is returned when the
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] in the search query
   * is in the same administrative area as the returned job posting. For
   * example, if a `ADMINISTRATIVE_AREA` job is posted in "CA, USA", it's
   * returned if [LocationFilter][google.cloud.talent.v4.LocationFilter] has
   * "Mountain View".
   * Administrative area refers to top-level administrative subdivision of this
   * country. For example, US state, IT region, UK constituent nation and
   * JP prefecture.
   * </pre>
   *
   * <code>ADMINISTRATIVE_AREA = 1;</code>
   */
  ADMINISTRATIVE_AREA(1),
  /**
   * <pre>
   * In addition to exact location matching, job is returned when
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] in search query is
   * in the same country as this job. For example, if a `NATION_WIDE` job is
   * posted in "USA", it's returned if
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] has 'Mountain
   * View'.
   * </pre>
   *
   * <code>NATION = 2;</code>
   */
  NATION(2),
  /**
   * <pre>
   * Job allows employees to work remotely (telecommute).
   * If locations are provided with this value, the job is
   * considered as having a location, but telecommuting is allowed.
   * </pre>
   *
   * <code>TELECOMMUTE = 3;</code>
   */
  TELECOMMUTE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * If the region is unspecified, the job is only returned if it
   * matches the [LocationFilter][google.cloud.talent.v4.LocationFilter].
   * </pre>
   *
   * <code>POSTING_REGION_UNSPECIFIED = 0;</code>
   */
  public static final int POSTING_REGION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * In addition to exact location matching, job posting is returned when the
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] in the search query
   * is in the same administrative area as the returned job posting. For
   * example, if a `ADMINISTRATIVE_AREA` job is posted in "CA, USA", it's
   * returned if [LocationFilter][google.cloud.talent.v4.LocationFilter] has
   * "Mountain View".
   * Administrative area refers to top-level administrative subdivision of this
   * country. For example, US state, IT region, UK constituent nation and
   * JP prefecture.
   * </pre>
   *
   * <code>ADMINISTRATIVE_AREA = 1;</code>
   */
  public static final int ADMINISTRATIVE_AREA_VALUE = 1;
  /**
   * <pre>
   * In addition to exact location matching, job is returned when
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] in search query is
   * in the same country as this job. For example, if a `NATION_WIDE` job is
   * posted in "USA", it's returned if
   * [LocationFilter][google.cloud.talent.v4.LocationFilter] has 'Mountain
   * View'.
   * </pre>
   *
   * <code>NATION = 2;</code>
   */
  public static final int NATION_VALUE = 2;
  /**
   * <pre>
   * Job allows employees to work remotely (telecommute).
   * If locations are provided with this value, the job is
   * considered as having a location, but telecommuting is allowed.
   * </pre>
   *
   * <code>TELECOMMUTE = 3;</code>
   */
  public static final int TELECOMMUTE_VALUE = 3;


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
  public static PostingRegion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PostingRegion forNumber(int value) {
    switch (value) {
      case 0: return POSTING_REGION_UNSPECIFIED;
      case 1: return ADMINISTRATIVE_AREA;
      case 2: return NATION;
      case 3: return TELECOMMUTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PostingRegion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PostingRegion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PostingRegion>() {
          public PostingRegion findValueByNumber(int number) {
            return PostingRegion.forNumber(number);
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
    return com.google.cloud.talent.v4.CommonProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final PostingRegion[] VALUES = values();

  public static PostingRegion valueOf(
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

  private PostingRegion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4.PostingRegion)
}

