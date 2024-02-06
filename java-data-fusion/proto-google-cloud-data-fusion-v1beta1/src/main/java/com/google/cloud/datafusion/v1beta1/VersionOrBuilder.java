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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1beta1;

public interface VersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   *
   * @return The versionNumber.
   */
  java.lang.String getVersionNumber();
  /**
   *
   *
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   *
   * @return The bytes for versionNumber.
   */
  com.google.protobuf.ByteString getVersionNumberBytes();

  /**
   *
   *
   * <pre>
   * Whether this is currently the default version for Cloud Data Fusion
   * </pre>
   *
   * <code>bool default_version = 2;</code>
   *
   * @return The defaultVersion.
   */
  boolean getDefaultVersion();

  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @return A list containing the availableFeatures.
   */
  java.util.List<java.lang.String> getAvailableFeaturesList();
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @return The count of availableFeatures.
   */
  int getAvailableFeaturesCount();
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The availableFeatures at the given index.
   */
  java.lang.String getAvailableFeatures(int index);
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the availableFeatures at the given index.
   */
  com.google.protobuf.ByteString getAvailableFeaturesBytes(int index);

  /**
   *
   *
   * <pre>
   * Type represents the release availability of the version
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type represents the release availability of the version
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
   *
   * @return The type.
   */
  com.google.cloud.datafusion.v1beta1.Version.Type getType();
}
