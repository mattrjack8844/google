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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Enum of possible outcomes of transformations. SUCCESS if transformation and
 * storing of transformation was successful, otherwise, reason for not
 * transforming.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.TransformationResultStatusType}
 */
public enum TransformationResultStatusType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>STATE_TYPE_UNSPECIFIED = 0;</code>
   */
  STATE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * This will be set when a finding could not be transformed (i.e. outside user
   * set bucket range).
   * </pre>
   *
   * <code>INVALID_TRANSFORM = 1;</code>
   */
  INVALID_TRANSFORM(1),
  /**
   *
   *
   * <pre>
   * This will be set when a BigQuery transformation was successful but could
   * not be stored back in BigQuery because the transformed row exceeds
   * BigQuery's max row size.
   * </pre>
   *
   * <code>BIGQUERY_MAX_ROW_SIZE_EXCEEDED = 2;</code>
   */
  BIGQUERY_MAX_ROW_SIZE_EXCEEDED(2),
  /**
   *
   *
   * <pre>
   * This will be set when there is a finding in the custom metadata of a file,
   * but at the write time of the transformed file, this key / value pair is
   * unretrievable.
   * </pre>
   *
   * <code>METADATA_UNRETRIEVABLE = 3;</code>
   */
  METADATA_UNRETRIEVABLE(3),
  /**
   *
   *
   * <pre>
   * This will be set when the transformation and storing of it is successful.
   * </pre>
   *
   * <code>SUCCESS = 4;</code>
   */
  SUCCESS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>STATE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int STATE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * This will be set when a finding could not be transformed (i.e. outside user
   * set bucket range).
   * </pre>
   *
   * <code>INVALID_TRANSFORM = 1;</code>
   */
  public static final int INVALID_TRANSFORM_VALUE = 1;
  /**
   *
   *
   * <pre>
   * This will be set when a BigQuery transformation was successful but could
   * not be stored back in BigQuery because the transformed row exceeds
   * BigQuery's max row size.
   * </pre>
   *
   * <code>BIGQUERY_MAX_ROW_SIZE_EXCEEDED = 2;</code>
   */
  public static final int BIGQUERY_MAX_ROW_SIZE_EXCEEDED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * This will be set when there is a finding in the custom metadata of a file,
   * but at the write time of the transformed file, this key / value pair is
   * unretrievable.
   * </pre>
   *
   * <code>METADATA_UNRETRIEVABLE = 3;</code>
   */
  public static final int METADATA_UNRETRIEVABLE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * This will be set when the transformation and storing of it is successful.
   * </pre>
   *
   * <code>SUCCESS = 4;</code>
   */
  public static final int SUCCESS_VALUE = 4;

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
  public static TransformationResultStatusType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransformationResultStatusType forNumber(int value) {
    switch (value) {
      case 0:
        return STATE_TYPE_UNSPECIFIED;
      case 1:
        return INVALID_TRANSFORM;
      case 2:
        return BIGQUERY_MAX_ROW_SIZE_EXCEEDED;
      case 3:
        return METADATA_UNRETRIEVABLE;
      case 4:
        return SUCCESS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransformationResultStatusType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransformationResultStatusType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransformationResultStatusType>() {
            public TransformationResultStatusType findValueByNumber(int number) {
              return TransformationResultStatusType.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransformationResultStatusType[] VALUES = values();

  public static TransformationResultStatusType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransformationResultStatusType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.TransformationResultStatusType)
}
