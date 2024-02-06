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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1alpha1;

public interface GcsProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.GcsProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full project and resource path for Cloud Storage bucket including the
   * name.
   * </pre>
   *
   * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   *
   *
   * <pre>
   * Required. The full project and resource path for Cloud Storage bucket including the
   * name.
   * </pre>
   *
   * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString getBucketNameBytes();

  /**
   *
   *
   * <pre>
   * The root path inside the Cloud Storage bucket.
   * </pre>
   *
   * <code>string root_path = 2;</code>
   *
   * @return The rootPath.
   */
  java.lang.String getRootPath();
  /**
   *
   *
   * <pre>
   * The root path inside the Cloud Storage bucket.
   * </pre>
   *
   * <code>string root_path = 2;</code>
   *
   * @return The bytes for rootPath.
   */
  com.google.protobuf.ByteString getRootPathBytes();
}
