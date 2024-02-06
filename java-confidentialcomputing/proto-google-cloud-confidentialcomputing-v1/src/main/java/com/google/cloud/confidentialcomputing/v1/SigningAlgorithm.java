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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * SigningAlgorithm enumerates all the supported signing algorithms.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.confidentialcomputing.v1.SigningAlgorithm}
 */
public enum SigningAlgorithm implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified signing algorithm.
   * </pre>
   *
   * <code>SIGNING_ALGORITHM_UNSPECIFIED = 0;</code>
   */
  SIGNING_ALGORITHM_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * RSASSA-PSS with a SHA256 digest.
   * </pre>
   *
   * <code>RSASSA_PSS_SHA256 = 1;</code>
   */
  RSASSA_PSS_SHA256(1),
  /**
   *
   *
   * <pre>
   * RSASSA-PKCS1 v1.5 with a SHA256 digest.
   * </pre>
   *
   * <code>RSASSA_PKCS1V15_SHA256 = 2;</code>
   */
  RSASSA_PKCS1V15_SHA256(2),
  /**
   *
   *
   * <pre>
   * ECDSA on the P-256 Curve with a SHA256 digest.
   * </pre>
   *
   * <code>ECDSA_P256_SHA256 = 3;</code>
   */
  ECDSA_P256_SHA256(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified signing algorithm.
   * </pre>
   *
   * <code>SIGNING_ALGORITHM_UNSPECIFIED = 0;</code>
   */
  public static final int SIGNING_ALGORITHM_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * RSASSA-PSS with a SHA256 digest.
   * </pre>
   *
   * <code>RSASSA_PSS_SHA256 = 1;</code>
   */
  public static final int RSASSA_PSS_SHA256_VALUE = 1;
  /**
   *
   *
   * <pre>
   * RSASSA-PKCS1 v1.5 with a SHA256 digest.
   * </pre>
   *
   * <code>RSASSA_PKCS1V15_SHA256 = 2;</code>
   */
  public static final int RSASSA_PKCS1V15_SHA256_VALUE = 2;
  /**
   *
   *
   * <pre>
   * ECDSA on the P-256 Curve with a SHA256 digest.
   * </pre>
   *
   * <code>ECDSA_P256_SHA256 = 3;</code>
   */
  public static final int ECDSA_P256_SHA256_VALUE = 3;

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
  public static SigningAlgorithm valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SigningAlgorithm forNumber(int value) {
    switch (value) {
      case 0:
        return SIGNING_ALGORITHM_UNSPECIFIED;
      case 1:
        return RSASSA_PSS_SHA256;
      case 2:
        return RSASSA_PKCS1V15_SHA256;
      case 3:
        return ECDSA_P256_SHA256;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SigningAlgorithm> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SigningAlgorithm> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SigningAlgorithm>() {
        public SigningAlgorithm findValueByNumber(int number) {
          return SigningAlgorithm.forNumber(number);
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
    return com.google.cloud.confidentialcomputing.v1.ServiceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final SigningAlgorithm[] VALUES = values();

  public static SigningAlgorithm valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SigningAlgorithm(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.confidentialcomputing.v1.SigningAlgorithm)
}
