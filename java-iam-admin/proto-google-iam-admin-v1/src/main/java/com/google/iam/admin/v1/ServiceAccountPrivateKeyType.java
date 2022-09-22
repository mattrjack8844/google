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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Supported private key output formats.
 * </pre>
 *
 * Protobuf enum {@code google.iam.admin.v1.ServiceAccountPrivateKeyType}
 */
public enum ServiceAccountPrivateKeyType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified. Equivalent to `TYPE_GOOGLE_CREDENTIALS_FILE`.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * PKCS12 format.
   * The password for the PKCS12 file is `notasecret`.
   * For more information, see https://tools.ietf.org/html/rfc7292.
   * </pre>
   *
   * <code>TYPE_PKCS12_FILE = 1;</code>
   */
  TYPE_PKCS12_FILE(1),
  /**
   *
   *
   * <pre>
   * Google Credentials File format.
   * </pre>
   *
   * <code>TYPE_GOOGLE_CREDENTIALS_FILE = 2;</code>
   */
  TYPE_GOOGLE_CREDENTIALS_FILE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified. Equivalent to `TYPE_GOOGLE_CREDENTIALS_FILE`.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * PKCS12 format.
   * The password for the PKCS12 file is `notasecret`.
   * For more information, see https://tools.ietf.org/html/rfc7292.
   * </pre>
   *
   * <code>TYPE_PKCS12_FILE = 1;</code>
   */
  public static final int TYPE_PKCS12_FILE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Google Credentials File format.
   * </pre>
   *
   * <code>TYPE_GOOGLE_CREDENTIALS_FILE = 2;</code>
   */
  public static final int TYPE_GOOGLE_CREDENTIALS_FILE_VALUE = 2;

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
  public static ServiceAccountPrivateKeyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceAccountPrivateKeyType forNumber(int value) {
    switch (value) {
      case 0:
        return TYPE_UNSPECIFIED;
      case 1:
        return TYPE_PKCS12_FILE;
      case 2:
        return TYPE_GOOGLE_CREDENTIALS_FILE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPrivateKeyType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPrivateKeyType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPrivateKeyType>() {
            public ServiceAccountPrivateKeyType findValueByNumber(int number) {
              return ServiceAccountPrivateKeyType.forNumber(number);
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
    return com.google.iam.admin.v1.Iam.getDescriptor().getEnumTypes().get(1);
  }

  private static final ServiceAccountPrivateKeyType[] VALUES = values();

  public static ServiceAccountPrivateKeyType valueOf(
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

  private ServiceAccountPrivateKeyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.iam.admin.v1.ServiceAccountPrivateKeyType)
}
