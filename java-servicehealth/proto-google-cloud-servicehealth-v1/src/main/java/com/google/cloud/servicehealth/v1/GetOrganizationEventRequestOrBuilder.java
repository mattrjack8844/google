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
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.servicehealth.v1;

public interface GetOrganizationEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.GetOrganizationEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the event in this scope including organization and
   * event ID using the form
   * `organizations/{organization_id}/locations/locations/global/organizationEvents/{event_id}`.
   *
   * `organization_id` - ID (number) of the project that contains the event. To
   * get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `event_id` - Organization event ID to retrieve.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique name of the event in this scope including organization and
   * event ID using the form
   * `organizations/{organization_id}/locations/locations/global/organizationEvents/{event_id}`.
   *
   * `organization_id` - ID (number) of the project that contains the event. To
   * get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `event_id` - Organization event ID to retrieve.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
