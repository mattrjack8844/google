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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface SecurityPolicyAdvancedOptionsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Custom configuration to apply the JSON parsing. Only applicable when json_parsing is set to STANDARD.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfigJsonCustomConfig json_custom_config = 111570105;
   * </code>
   *
   * @return Whether the jsonCustomConfig field is set.
   */
  boolean hasJsonCustomConfig();
  /**
   *
   *
   * <pre>
   * Custom configuration to apply the JSON parsing. Only applicable when json_parsing is set to STANDARD.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfigJsonCustomConfig json_custom_config = 111570105;
   * </code>
   *
   * @return The jsonCustomConfig.
   */
  com.google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfigJsonCustomConfig
      getJsonCustomConfig();
  /**
   *
   *
   * <pre>
   * Custom configuration to apply the JSON parsing. Only applicable when json_parsing is set to STANDARD.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfigJsonCustomConfig json_custom_config = 111570105;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyAdvancedOptionsConfigJsonCustomConfigOrBuilder
      getJsonCustomConfigOrBuilder();

  /**
   *
   *
   * <pre>
   *
   * Check the JsonParsing enum for the list of possible values.
   * </pre>
   *
   * <code>optional string json_parsing = 282493529;</code>
   *
   * @return Whether the jsonParsing field is set.
   */
  boolean hasJsonParsing();
  /**
   *
   *
   * <pre>
   *
   * Check the JsonParsing enum for the list of possible values.
   * </pre>
   *
   * <code>optional string json_parsing = 282493529;</code>
   *
   * @return The jsonParsing.
   */
  java.lang.String getJsonParsing();
  /**
   *
   *
   * <pre>
   *
   * Check the JsonParsing enum for the list of possible values.
   * </pre>
   *
   * <code>optional string json_parsing = 282493529;</code>
   *
   * @return The bytes for jsonParsing.
   */
  com.google.protobuf.ByteString getJsonParsingBytes();

  /**
   *
   *
   * <pre>
   *
   * Check the LogLevel enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_level = 140582601;</code>
   *
   * @return Whether the logLevel field is set.
   */
  boolean hasLogLevel();
  /**
   *
   *
   * <pre>
   *
   * Check the LogLevel enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_level = 140582601;</code>
   *
   * @return The logLevel.
   */
  java.lang.String getLogLevel();
  /**
   *
   *
   * <pre>
   *
   * Check the LogLevel enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_level = 140582601;</code>
   *
   * @return The bytes for logLevel.
   */
  com.google.protobuf.ByteString getLogLevelBytes();

  /**
   *
   *
   * <pre>
   * An optional list of case-insensitive request header names to use for resolving the callers client IP address.
   * </pre>
   *
   * <code>repeated string user_ip_request_headers = 421050290;</code>
   *
   * @return A list containing the userIpRequestHeaders.
   */
  java.util.List<java.lang.String> getUserIpRequestHeadersList();
  /**
   *
   *
   * <pre>
   * An optional list of case-insensitive request header names to use for resolving the callers client IP address.
   * </pre>
   *
   * <code>repeated string user_ip_request_headers = 421050290;</code>
   *
   * @return The count of userIpRequestHeaders.
   */
  int getUserIpRequestHeadersCount();
  /**
   *
   *
   * <pre>
   * An optional list of case-insensitive request header names to use for resolving the callers client IP address.
   * </pre>
   *
   * <code>repeated string user_ip_request_headers = 421050290;</code>
   *
   * @param index The index of the element to return.
   * @return The userIpRequestHeaders at the given index.
   */
  java.lang.String getUserIpRequestHeaders(int index);
  /**
   *
   *
   * <pre>
   * An optional list of case-insensitive request header names to use for resolving the callers client IP address.
   * </pre>
   *
   * <code>repeated string user_ip_request_headers = 421050290;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the userIpRequestHeaders at the given index.
   */
  com.google.protobuf.ByteString getUserIpRequestHeadersBytes(int index);
}
