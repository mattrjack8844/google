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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface UpdateWorkerPoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.UpdateWorkerPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `WorkerPool` to update.
   *
   * The `name` field is used to identify the `WorkerPool` to update.
   * Format: `projects/{project}/locations/{location}/workerPools/{workerPool}`.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.WorkerPool worker_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workerPool field is set.
   */
  boolean hasWorkerPool();
  /**
   *
   *
   * <pre>
   * Required. The `WorkerPool` to update.
   *
   * The `name` field is used to identify the `WorkerPool` to update.
   * Format: `projects/{project}/locations/{location}/workerPools/{workerPool}`.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.WorkerPool worker_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workerPool.
   */
  com.google.cloudbuild.v1.WorkerPool getWorkerPool();
  /**
   *
   *
   * <pre>
   * Required. The `WorkerPool` to update.
   *
   * The `name` field is used to identify the `WorkerPool` to update.
   * Format: `projects/{project}/locations/{location}/workerPools/{workerPool}`.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.WorkerPool worker_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolOrBuilder();

  /**
   *
   *
   * <pre>
   * A mask specifying which fields in `worker_pool` to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * A mask specifying which fields in `worker_pool` to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * A mask specifying which fields in `worker_pool` to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the response, but do not actually
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
