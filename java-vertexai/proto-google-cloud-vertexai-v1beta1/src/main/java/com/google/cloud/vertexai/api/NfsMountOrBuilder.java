/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vertexai/v1beta1/machine_resources.proto

package com.google.cloud.vertexai.api;

public interface NfsMountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.NfsMount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. IP address of the NFS server.
   * </pre>
   *
   * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The server.
   */
  java.lang.String getServer();
  /**
   *
   *
   * <pre>
   * Required. IP address of the NFS server.
   * </pre>
   *
   * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for server.
   */
  com.google.protobuf.ByteString getServerBytes();

  /**
   *
   *
   * <pre>
   * Required. Source path exported from NFS server.
   * Has to start with '/', and combined with the ip address, it indicates
   * the source mount path in the form of `server:path`
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Required. Source path exported from NFS server.
   * Has to start with '/', and combined with the ip address, it indicates
   * the source mount path in the form of `server:path`
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Required. Destination mount path. The NFS will be mounted for the user
   * under /mnt/nfs/&lt;mount_point&gt;
   * </pre>
   *
   * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mountPoint.
   */
  java.lang.String getMountPoint();
  /**
   *
   *
   * <pre>
   * Required. Destination mount path. The NFS will be mounted for the user
   * under /mnt/nfs/&lt;mount_point&gt;
   * </pre>
   *
   * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mountPoint.
   */
  com.google.protobuf.ByteString getMountPointBytes();
}
