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
// source: google/cloud/networkservices/v1/dep.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkservices.v1;

public interface LbRouteExtensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.LbRouteExtension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Identifier. Name of the `LbRouteExtension` resource in the
   * following format:
   * `projects/{project}/locations/{location}/lbRouteExtensions/{lb_route_extension}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Identifier. Name of the `LbRouteExtension` resource in the
   * following format:
   * `projects/{project}/locations/{location}/lbRouteExtensions/{lb_route_extension}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description of the resource.
   * </pre>
   *
   * <code>string description = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A human-readable description of the resource.
   * </pre>
   *
   * <code>string description = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `LbRouteExtension` resource.
   *
   * The format must comply with [the requirements for
   * labels](https://cloud.google.com/compute/docs/labeling-resources#requirements)
   * for Google Cloud resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `LbRouteExtension` resource.
   *
   * The format must comply with [the requirements for
   * labels](https://cloud.google.com/compute/docs/labeling-resources#requirements)
   * for Google Cloud resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `LbRouteExtension` resource.
   *
   * The format must comply with [the requirements for
   * labels](https://cloud.google.com/compute/docs/labeling-resources#requirements)
   * for Google Cloud resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `LbRouteExtension` resource.
   *
   * The format must comply with [the requirements for
   * labels](https://cloud.google.com/compute/docs/labeling-resources#requirements)
   * for Google Cloud resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `LbRouteExtension` resource.
   *
   * The format must comply with [the requirements for
   * labels](https://cloud.google.com/compute/docs/labeling-resources#requirements)
   * for Google Cloud resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. A list of references to the forwarding rules to which this
   * service extension is attached to. At least one forwarding rule is required.
   * There can be only one `LbRouteExtension` resource per forwarding rule.
   * </pre>
   *
   * <code>repeated string forwarding_rules = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the forwardingRules.
   */
  java.util.List<java.lang.String> getForwardingRulesList();
  /**
   *
   *
   * <pre>
   * Required. A list of references to the forwarding rules to which this
   * service extension is attached to. At least one forwarding rule is required.
   * There can be only one `LbRouteExtension` resource per forwarding rule.
   * </pre>
   *
   * <code>repeated string forwarding_rules = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of forwardingRules.
   */
  int getForwardingRulesCount();
  /**
   *
   *
   * <pre>
   * Required. A list of references to the forwarding rules to which this
   * service extension is attached to. At least one forwarding rule is required.
   * There can be only one `LbRouteExtension` resource per forwarding rule.
   * </pre>
   *
   * <code>repeated string forwarding_rules = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The forwardingRules at the given index.
   */
  java.lang.String getForwardingRules(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of references to the forwarding rules to which this
   * service extension is attached to. At least one forwarding rule is required.
   * There can be only one `LbRouteExtension` resource per forwarding rule.
   * </pre>
   *
   * <code>repeated string forwarding_rules = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the forwardingRules at the given index.
   */
  com.google.protobuf.ByteString getForwardingRulesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. A set of ordered extension chains that contain the match
   * conditions and extensions to execute. Match conditions for each extension
   * chain are evaluated in sequence for a given request. The first extension
   * chain that has a condition that matches the request is executed.
   * Any subsequent extension chains do not execute.
   * Limited to 5 extension chains per resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.ExtensionChain extension_chains = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.networkservices.v1.ExtensionChain> getExtensionChainsList();
  /**
   *
   *
   * <pre>
   * Required. A set of ordered extension chains that contain the match
   * conditions and extensions to execute. Match conditions for each extension
   * chain are evaluated in sequence for a given request. The first extension
   * chain that has a condition that matches the request is executed.
   * Any subsequent extension chains do not execute.
   * Limited to 5 extension chains per resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.ExtensionChain extension_chains = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.ExtensionChain getExtensionChains(int index);
  /**
   *
   *
   * <pre>
   * Required. A set of ordered extension chains that contain the match
   * conditions and extensions to execute. Match conditions for each extension
   * chain are evaluated in sequence for a given request. The first extension
   * chain that has a condition that matches the request is executed.
   * Any subsequent extension chains do not execute.
   * Limited to 5 extension chains per resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.ExtensionChain extension_chains = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getExtensionChainsCount();
  /**
   *
   *
   * <pre>
   * Required. A set of ordered extension chains that contain the match
   * conditions and extensions to execute. Match conditions for each extension
   * chain are evaluated in sequence for a given request. The first extension
   * chain that has a condition that matches the request is executed.
   * Any subsequent extension chains do not execute.
   * Limited to 5 extension chains per resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.ExtensionChain extension_chains = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.networkservices.v1.ExtensionChainOrBuilder>
      getExtensionChainsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A set of ordered extension chains that contain the match
   * conditions and extensions to execute. Match conditions for each extension
   * chain are evaluated in sequence for a given request. The first extension
   * chain that has a condition that matches the request is executed.
   * Any subsequent extension chains do not execute.
   * Limited to 5 extension chains per resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.ExtensionChain extension_chains = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.ExtensionChainOrBuilder getExtensionChainsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. All backend services and forwarding rules referenced by this
   * extension must share the same load balancing scheme. Supported values:
   * `INTERNAL_MANAGED`, `EXTERNAL_MANAGED`. For more information, refer to
   * [Choosing a load
   * balancer](https://cloud.google.com/load-balancing/docs/backend-service).
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LoadBalancingScheme load_balancing_scheme = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for loadBalancingScheme.
   */
  int getLoadBalancingSchemeValue();
  /**
   *
   *
   * <pre>
   * Required. All backend services and forwarding rules referenced by this
   * extension must share the same load balancing scheme. Supported values:
   * `INTERNAL_MANAGED`, `EXTERNAL_MANAGED`. For more information, refer to
   * [Choosing a load
   * balancer](https://cloud.google.com/load-balancing/docs/backend-service).
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LoadBalancingScheme load_balancing_scheme = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The loadBalancingScheme.
   */
  com.google.cloud.networkservices.v1.LoadBalancingScheme getLoadBalancingScheme();

  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.lb_route_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.lb_route_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.lb_route_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();
}
