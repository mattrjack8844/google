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
// source: google/cloud/retail/v2beta/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * The use case of Cloud Retail Search.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.retail.v2beta.SearchSolutionUseCase}
 */
public enum SearchSolutionUseCase implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The value when it's unspecified. In this case, server behavior defaults to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2beta.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_UNSPECIFIED = 0;</code>
   */
  SEARCH_SOLUTION_USE_CASE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Search use case. Expects the traffic has a non-empty
   * [query][google.cloud.retail.v2beta.SearchRequest.query].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_SEARCH = 1;</code>
   */
  SEARCH_SOLUTION_USE_CASE_SEARCH(1),
  /**
   *
   *
   * <pre>
   * Browse use case. Expects the traffic has an empty
   * [query][google.cloud.retail.v2beta.SearchRequest.query].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_BROWSE = 2;</code>
   */
  SEARCH_SOLUTION_USE_CASE_BROWSE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The value when it's unspecified. In this case, server behavior defaults to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2beta.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_UNSPECIFIED = 0;</code>
   */
  public static final int SEARCH_SOLUTION_USE_CASE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Search use case. Expects the traffic has a non-empty
   * [query][google.cloud.retail.v2beta.SearchRequest.query].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_SEARCH = 1;</code>
   */
  public static final int SEARCH_SOLUTION_USE_CASE_SEARCH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Browse use case. Expects the traffic has an empty
   * [query][google.cloud.retail.v2beta.SearchRequest.query].
   * </pre>
   *
   * <code>SEARCH_SOLUTION_USE_CASE_BROWSE = 2;</code>
   */
  public static final int SEARCH_SOLUTION_USE_CASE_BROWSE_VALUE = 2;

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
  public static SearchSolutionUseCase valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SearchSolutionUseCase forNumber(int value) {
    switch (value) {
      case 0:
        return SEARCH_SOLUTION_USE_CASE_UNSPECIFIED;
      case 1:
        return SEARCH_SOLUTION_USE_CASE_SEARCH;
      case 2:
        return SEARCH_SOLUTION_USE_CASE_BROWSE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchSolutionUseCase>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SearchSolutionUseCase>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SearchSolutionUseCase>() {
            public SearchSolutionUseCase findValueByNumber(int number) {
              return SearchSolutionUseCase.forNumber(number);
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
    return com.google.cloud.retail.v2beta.CommonProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final SearchSolutionUseCase[] VALUES = values();

  public static SearchSolutionUseCase valueOf(
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

  private SearchSolutionUseCase(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.retail.v2beta.SearchSolutionUseCase)
}
