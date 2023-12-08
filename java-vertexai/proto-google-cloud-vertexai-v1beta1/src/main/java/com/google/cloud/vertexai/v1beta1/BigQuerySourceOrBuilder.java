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
// source: google/cloud/vertexai/v1beta1/io.proto

package com.google.cloud.vertexai.v1beta1;

public interface BigQuerySourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.BigQuerySource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. BigQuery URI to a table, up to 2000 characters long.
   * Accepted forms:
   *
   * *  BigQuery path. For example: `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string input_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Required. BigQuery URI to a table, up to 2000 characters long.
   * Accepted forms:
   *
   * *  BigQuery path. For example: `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string input_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString getInputUriBytes();
}
