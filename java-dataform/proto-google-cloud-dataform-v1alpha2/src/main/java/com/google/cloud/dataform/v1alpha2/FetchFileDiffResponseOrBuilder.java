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
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1alpha2;

public interface FetchFileDiffResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.FetchFileDiffResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw formatted Git diff for the file.
   * </pre>
   *
   * <code>string formatted_diff = 1;</code>
   *
   * @return The formattedDiff.
   */
  java.lang.String getFormattedDiff();
  /**
   *
   *
   * <pre>
   * The raw formatted Git diff for the file.
   * </pre>
   *
   * <code>string formatted_diff = 1;</code>
   *
   * @return The bytes for formattedDiff.
   */
  com.google.protobuf.ByteString getFormattedDiffBytes();
}
