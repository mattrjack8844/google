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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

public interface TaxonomyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.Taxonomy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this taxonomy in URL format.
   * Note: Policy tag manager generates unique taxonomy IDs.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this taxonomy in URL format.
   * Note: Policy tag manager generates unique taxonomy IDs.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. User-defined name of this taxonomy.
   * The name can't start or end with spaces, must contain only Unicode letters,
   * numbers, underscores, dashes, and spaces, and be at most 200 bytes long
   * when encoded in UTF-8.
   * The taxonomy display name must be unique within an organization.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. User-defined name of this taxonomy.
   * The name can't start or end with spaces, must contain only Unicode letters,
   * numbers, underscores, dashes, and spaces, and be at most 200 bytes long
   * when encoded in UTF-8.
   * The taxonomy display name must be unique within an organization.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description of this taxonomy. If not set, defaults to empty.
   * The description must contain only Unicode characters, tabs, newlines,
   * carriage returns, and page breaks, and be at most 2000 bytes long when
   * encoded in UTF-8.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of this taxonomy. If not set, defaults to empty.
   * The description must contain only Unicode characters, tabs, newlines,
   * carriage returns, and page breaks, and be at most 2000 bytes long when
   * encoded in UTF-8.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Number of policy tags in this taxonomy.
   * </pre>
   *
   * <code>int32 policy_tag_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The policyTagCount.
   */
  int getPolicyTagCount();

  /**
   *
   *
   * <pre>
   * Output only. Creation and modification timestamps of this taxonomy.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps taxonomy_timestamps = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the taxonomyTimestamps field is set.
   */
  boolean hasTaxonomyTimestamps();
  /**
   *
   *
   * <pre>
   * Output only. Creation and modification timestamps of this taxonomy.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps taxonomy_timestamps = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The taxonomyTimestamps.
   */
  com.google.cloud.datacatalog.v1.SystemTimestamps getTaxonomyTimestamps();
  /**
   *
   *
   * <pre>
   * Output only. Creation and modification timestamps of this taxonomy.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps taxonomy_timestamps = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder getTaxonomyTimestampsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of policy types that are activated for this taxonomy. If not set,
   * defaults to an empty list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.Taxonomy.PolicyType activated_policy_types = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the activatedPolicyTypes.
   */
  java.util.List<com.google.cloud.datacatalog.v1.Taxonomy.PolicyType> getActivatedPolicyTypesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of policy types that are activated for this taxonomy. If not set,
   * defaults to an empty list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.Taxonomy.PolicyType activated_policy_types = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of activatedPolicyTypes.
   */
  int getActivatedPolicyTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of policy types that are activated for this taxonomy. If not set,
   * defaults to an empty list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.Taxonomy.PolicyType activated_policy_types = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The activatedPolicyTypes at the given index.
   */
  com.google.cloud.datacatalog.v1.Taxonomy.PolicyType getActivatedPolicyTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of policy types that are activated for this taxonomy. If not set,
   * defaults to an empty list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.Taxonomy.PolicyType activated_policy_types = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for activatedPolicyTypes.
   */
  java.util.List<java.lang.Integer> getActivatedPolicyTypesValueList();
  /**
   *
   *
   * <pre>
   * Optional. A list of policy types that are activated for this taxonomy. If not set,
   * defaults to an empty list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.Taxonomy.PolicyType activated_policy_types = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of activatedPolicyTypes at the given index.
   */
  int getActivatedPolicyTypesValue(int index);
}
