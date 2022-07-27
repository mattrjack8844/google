/*
 * Copyright 2020 Google LLC
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
// source: google/analytics/admin/v1beta/resources.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Various levels of service for Google Analytics.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1beta.ServiceLevel}
 */
public enum ServiceLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Service level not specified or invalid.
   * </pre>
   *
   * <code>SERVICE_LEVEL_UNSPECIFIED = 0;</code>
   */
  SERVICE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The standard version of Google Analytics.
   * </pre>
   *
   * <code>GOOGLE_ANALYTICS_STANDARD = 1;</code>
   */
  GOOGLE_ANALYTICS_STANDARD(1),
  /**
   *
   *
   * <pre>
   * The paid, premium version of Google Analytics.
   * </pre>
   *
   * <code>GOOGLE_ANALYTICS_360 = 2;</code>
   */
  GOOGLE_ANALYTICS_360(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Service level not specified or invalid.
   * </pre>
   *
   * <code>SERVICE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int SERVICE_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The standard version of Google Analytics.
   * </pre>
   *
   * <code>GOOGLE_ANALYTICS_STANDARD = 1;</code>
   */
  public static final int GOOGLE_ANALYTICS_STANDARD_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The paid, premium version of Google Analytics.
   * </pre>
   *
   * <code>GOOGLE_ANALYTICS_360 = 2;</code>
   */
  public static final int GOOGLE_ANALYTICS_360_VALUE = 2;

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
  public static ServiceLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceLevel forNumber(int value) {
    switch (value) {
      case 0:
        return SERVICE_LEVEL_UNSPECIFIED;
      case 1:
        return GOOGLE_ANALYTICS_STANDARD;
      case 2:
        return GOOGLE_ANALYTICS_360;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceLevel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServiceLevel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ServiceLevel>() {
        public ServiceLevel findValueByNumber(int number) {
          return ServiceLevel.forNumber(number);
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
    return com.google.analytics.admin.v1beta.ResourcesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ServiceLevel[] VALUES = values();

  public static ServiceLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServiceLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1beta.ServiceLevel)
}
