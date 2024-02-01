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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

public interface CreateSubpropertyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateSubpropertyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ordinary property for which to create a subproperty.
   * Format: properties/property_id
   * Example: properties/123
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The ordinary property for which to create a subproperty.
   * Format: properties/property_id
   * Example: properties/123
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The subproperty to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property subproperty = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the subproperty field is set.
   */
  boolean hasSubproperty();
  /**
   *
   *
   * <pre>
   * Required. The subproperty to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property subproperty = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The subproperty.
   */
  com.google.analytics.admin.v1alpha.Property getSubproperty();
  /**
   *
   *
   * <pre>
   * Required. The subproperty to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property subproperty = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.PropertyOrBuilder getSubpropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The subproperty event filter to create on an ordinary property.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the subpropertyEventFilter field is set.
   */
  boolean hasSubpropertyEventFilter();
  /**
   *
   *
   * <pre>
   * Optional. The subproperty event filter to create on an ordinary property.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The subpropertyEventFilter.
   */
  com.google.analytics.admin.v1alpha.SubpropertyEventFilter getSubpropertyEventFilter();
  /**
   *
   *
   * <pre>
   * Optional. The subproperty event filter to create on an ordinary property.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder
      getSubpropertyEventFilterOrBuilder();
}
