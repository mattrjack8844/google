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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface SecurityBulletinEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SecurityBulletinEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource type (node/control plane) that has the vulnerability. Multiple
   * notifications (1 notification per resource type) will be sent for a
   * vulnerability that affects &gt; 1 resource type.
   * </pre>
   *
   * <code>string resource_type_affected = 1;</code>
   *
   * @return The resourceTypeAffected.
   */
  java.lang.String getResourceTypeAffected();
  /**
   *
   *
   * <pre>
   * The resource type (node/control plane) that has the vulnerability. Multiple
   * notifications (1 notification per resource type) will be sent for a
   * vulnerability that affects &gt; 1 resource type.
   * </pre>
   *
   * <code>string resource_type_affected = 1;</code>
   *
   * @return The bytes for resourceTypeAffected.
   */
  com.google.protobuf.ByteString getResourceTypeAffectedBytes();

  /**
   *
   *
   * <pre>
   * The ID of the bulletin corresponding to the vulnerability.
   * </pre>
   *
   * <code>string bulletin_id = 2;</code>
   *
   * @return The bulletinId.
   */
  java.lang.String getBulletinId();
  /**
   *
   *
   * <pre>
   * The ID of the bulletin corresponding to the vulnerability.
   * </pre>
   *
   * <code>string bulletin_id = 2;</code>
   *
   * @return The bytes for bulletinId.
   */
  com.google.protobuf.ByteString getBulletinIdBytes();

  /**
   *
   *
   * <pre>
   * The CVEs associated with this bulletin.
   * </pre>
   *
   * <code>repeated string cve_ids = 3;</code>
   *
   * @return A list containing the cveIds.
   */
  java.util.List<java.lang.String> getCveIdsList();
  /**
   *
   *
   * <pre>
   * The CVEs associated with this bulletin.
   * </pre>
   *
   * <code>repeated string cve_ids = 3;</code>
   *
   * @return The count of cveIds.
   */
  int getCveIdsCount();
  /**
   *
   *
   * <pre>
   * The CVEs associated with this bulletin.
   * </pre>
   *
   * <code>repeated string cve_ids = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The cveIds at the given index.
   */
  java.lang.String getCveIds(int index);
  /**
   *
   *
   * <pre>
   * The CVEs associated with this bulletin.
   * </pre>
   *
   * <code>repeated string cve_ids = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cveIds at the given index.
   */
  com.google.protobuf.ByteString getCveIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The severity of this bulletin as it relates to GKE.
   * </pre>
   *
   * <code>string severity = 4;</code>
   *
   * @return The severity.
   */
  java.lang.String getSeverity();
  /**
   *
   *
   * <pre>
   * The severity of this bulletin as it relates to GKE.
   * </pre>
   *
   * <code>string severity = 4;</code>
   *
   * @return The bytes for severity.
   */
  com.google.protobuf.ByteString getSeverityBytes();

  /**
   *
   *
   * <pre>
   * The URI link to the bulletin on the website for more information.
   * </pre>
   *
   * <code>string bulletin_uri = 5;</code>
   *
   * @return The bulletinUri.
   */
  java.lang.String getBulletinUri();
  /**
   *
   *
   * <pre>
   * The URI link to the bulletin on the website for more information.
   * </pre>
   *
   * <code>string bulletin_uri = 5;</code>
   *
   * @return The bytes for bulletinUri.
   */
  com.google.protobuf.ByteString getBulletinUriBytes();

  /**
   *
   *
   * <pre>
   * A brief description of the bulletin. See the bulletin pointed to by the
   * bulletin_uri field for an expanded description.
   * </pre>
   *
   * <code>string brief_description = 6;</code>
   *
   * @return The briefDescription.
   */
  java.lang.String getBriefDescription();
  /**
   *
   *
   * <pre>
   * A brief description of the bulletin. See the bulletin pointed to by the
   * bulletin_uri field for an expanded description.
   * </pre>
   *
   * <code>string brief_description = 6;</code>
   *
   * @return The bytes for briefDescription.
   */
  com.google.protobuf.ByteString getBriefDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The GKE minor versions affected by this vulnerability.
   * </pre>
   *
   * <code>repeated string affected_supported_minors = 7;</code>
   *
   * @return A list containing the affectedSupportedMinors.
   */
  java.util.List<java.lang.String> getAffectedSupportedMinorsList();
  /**
   *
   *
   * <pre>
   * The GKE minor versions affected by this vulnerability.
   * </pre>
   *
   * <code>repeated string affected_supported_minors = 7;</code>
   *
   * @return The count of affectedSupportedMinors.
   */
  int getAffectedSupportedMinorsCount();
  /**
   *
   *
   * <pre>
   * The GKE minor versions affected by this vulnerability.
   * </pre>
   *
   * <code>repeated string affected_supported_minors = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The affectedSupportedMinors at the given index.
   */
  java.lang.String getAffectedSupportedMinors(int index);
  /**
   *
   *
   * <pre>
   * The GKE minor versions affected by this vulnerability.
   * </pre>
   *
   * <code>repeated string affected_supported_minors = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the affectedSupportedMinors at the given index.
   */
  com.google.protobuf.ByteString getAffectedSupportedMinorsBytes(int index);

  /**
   *
   *
   * <pre>
   * The GKE versions where this vulnerability is patched.
   * </pre>
   *
   * <code>repeated string patched_versions = 8;</code>
   *
   * @return A list containing the patchedVersions.
   */
  java.util.List<java.lang.String> getPatchedVersionsList();
  /**
   *
   *
   * <pre>
   * The GKE versions where this vulnerability is patched.
   * </pre>
   *
   * <code>repeated string patched_versions = 8;</code>
   *
   * @return The count of patchedVersions.
   */
  int getPatchedVersionsCount();
  /**
   *
   *
   * <pre>
   * The GKE versions where this vulnerability is patched.
   * </pre>
   *
   * <code>repeated string patched_versions = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The patchedVersions at the given index.
   */
  java.lang.String getPatchedVersions(int index);
  /**
   *
   *
   * <pre>
   * The GKE versions where this vulnerability is patched.
   * </pre>
   *
   * <code>repeated string patched_versions = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the patchedVersions at the given index.
   */
  com.google.protobuf.ByteString getPatchedVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * This represents a version selected from the patched_versions field that
   * the cluster receiving this notification should most likely want to upgrade
   * to based on its current version. Note that if this notification is being
   * received by a given cluster, it means that this version is currently
   * available as an upgrade target in that cluster's location.
   * </pre>
   *
   * <code>string suggested_upgrade_target = 9;</code>
   *
   * @return The suggestedUpgradeTarget.
   */
  java.lang.String getSuggestedUpgradeTarget();
  /**
   *
   *
   * <pre>
   * This represents a version selected from the patched_versions field that
   * the cluster receiving this notification should most likely want to upgrade
   * to based on its current version. Note that if this notification is being
   * received by a given cluster, it means that this version is currently
   * available as an upgrade target in that cluster's location.
   * </pre>
   *
   * <code>string suggested_upgrade_target = 9;</code>
   *
   * @return The bytes for suggestedUpgradeTarget.
   */
  com.google.protobuf.ByteString getSuggestedUpgradeTargetBytes();

  /**
   *
   *
   * <pre>
   * If this field is specified, it means there are manual steps that the user
   * must take to make their clusters safe.
   * </pre>
   *
   * <code>bool manual_steps_required = 10;</code>
   *
   * @return The manualStepsRequired.
   */
  boolean getManualStepsRequired();
}
