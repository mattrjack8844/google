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
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface MountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Mount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the disk to mount, as specified in the resources section.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The disk.
   */
  java.lang.String getDisk();
  /**
   *
   *
   * <pre>
   * The name of the disk to mount, as specified in the resources section.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The bytes for disk.
   */
  com.google.protobuf.ByteString getDiskBytes();

  /**
   *
   *
   * <pre>
   * The path to mount the disk inside the container.
   * </pre>
   *
   * <code>string path = 2;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * The path to mount the disk inside the container.
   * </pre>
   *
   * <code>string path = 2;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * If true, the disk is mounted read-only inside the container.
   * </pre>
   *
   * <code>bool read_only = 3;</code>
   *
   * @return The readOnly.
   */
  boolean getReadOnly();
}
