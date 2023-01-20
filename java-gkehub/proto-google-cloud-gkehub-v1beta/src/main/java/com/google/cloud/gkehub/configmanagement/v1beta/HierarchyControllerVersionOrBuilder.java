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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface HierarchyControllerVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Version for open source HNC
   * </pre>
   *
   * <code>string hnc = 1;</code>
   *
   * @return The hnc.
   */
  java.lang.String getHnc();
  /**
   *
   *
   * <pre>
   * Version for open source HNC
   * </pre>
   *
   * <code>string hnc = 1;</code>
   *
   * @return The bytes for hnc.
   */
  com.google.protobuf.ByteString getHncBytes();

  /**
   *
   *
   * <pre>
   * Version for Hierarchy Controller extension
   * </pre>
   *
   * <code>string extension = 2;</code>
   *
   * @return The extension.
   */
  java.lang.String getExtension();
  /**
   *
   *
   * <pre>
   * Version for Hierarchy Controller extension
   * </pre>
   *
   * <code>string extension = 2;</code>
   *
   * @return The bytes for extension.
   */
  com.google.protobuf.ByteString getExtensionBytes();
}
