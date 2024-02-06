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
// source: google/cloud/contentwarehouse/v1/document_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface EnumTypeOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.EnumTypeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the possibleValues.
   */
  java.util.List<java.lang.String> getPossibleValuesList();
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of possibleValues.
   */
  int getPossibleValuesCount();
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The possibleValues at the given index.
   */
  java.lang.String getPossibleValues(int index);
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the possibleValues at the given index.
   */
  com.google.protobuf.ByteString getPossibleValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * Make sure the Enum property value provided in the document is in the
   * possile value list during document creation. The validation check runs by
   * default.
   * </pre>
   *
   * <code>bool validation_check_disabled = 2;</code>
   *
   * @return The validationCheckDisabled.
   */
  boolean getValidationCheckDisabled();
}
