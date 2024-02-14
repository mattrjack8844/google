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

public interface DiskTypesScopedListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DiskTypesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  java.util.List<com.google.cloud.compute.v1.DiskType> getDiskTypesList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  com.google.cloud.compute.v1.DiskType getDiskTypes(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  int getDiskTypesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DiskTypeOrBuilder>
      getDiskTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  com.google.cloud.compute.v1.DiskTypeOrBuilder getDiskTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
