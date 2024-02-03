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
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface UserEventImportSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.UserEventImportSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Count of user events imported with complete existing catalog information.
   * </pre>
   *
   * <code>int64 joined_events_count = 1;</code>
   *
   * @return The joinedEventsCount.
   */
  long getJoinedEventsCount();

  /**
   *
   *
   * <pre>
   * Count of user events imported, but with catalog information not found
   * in the imported catalog.
   * </pre>
   *
   * <code>int64 unjoined_events_count = 2;</code>
   *
   * @return The unjoinedEventsCount.
   */
  long getUnjoinedEventsCount();
}
