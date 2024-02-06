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
// source: google/cloud/datacatalog/v1/bigquery.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface BigQueryRoutineSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.BigQueryRoutineSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @return A list containing the importedLibraries.
   */
  java.util.List<java.lang.String> getImportedLibrariesList();
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @return The count of importedLibraries.
   */
  int getImportedLibrariesCount();
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The importedLibraries at the given index.
   */
  java.lang.String getImportedLibraries(int index);
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the importedLibraries at the given index.
   */
  com.google.protobuf.ByteString getImportedLibrariesBytes(int index);
}
