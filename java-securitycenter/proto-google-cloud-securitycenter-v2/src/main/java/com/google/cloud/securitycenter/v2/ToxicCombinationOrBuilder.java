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
// source: google/cloud/securitycenter/v2/toxic_combination.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public interface ToxicCombinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.ToxicCombination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The
   * [Attack exposure
   * score](https://cloud.google.com/security-command-center/docs/attack-exposure-learn#attack_exposure_scores)
   * of this toxic combination. The score is a measure of how much this toxic
   * combination exposes one or more high-value resources to potential attack.
   * </pre>
   *
   * <code>double attack_exposure_score = 1;</code>
   *
   * @return The attackExposureScore.
   */
  double getAttackExposureScore();

  /**
   *
   *
   * <pre>
   * List of resource names of findings associated with this toxic combination.
   * For example, `organizations/123/sources/456/findings/789`.
   * </pre>
   *
   * <code>repeated string related_findings = 2;</code>
   *
   * @return A list containing the relatedFindings.
   */
  java.util.List<java.lang.String> getRelatedFindingsList();
  /**
   *
   *
   * <pre>
   * List of resource names of findings associated with this toxic combination.
   * For example, `organizations/123/sources/456/findings/789`.
   * </pre>
   *
   * <code>repeated string related_findings = 2;</code>
   *
   * @return The count of relatedFindings.
   */
  int getRelatedFindingsCount();
  /**
   *
   *
   * <pre>
   * List of resource names of findings associated with this toxic combination.
   * For example, `organizations/123/sources/456/findings/789`.
   * </pre>
   *
   * <code>repeated string related_findings = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The relatedFindings at the given index.
   */
  java.lang.String getRelatedFindings(int index);
  /**
   *
   *
   * <pre>
   * List of resource names of findings associated with this toxic combination.
   * For example, `organizations/123/sources/456/findings/789`.
   * </pre>
   *
   * <code>repeated string related_findings = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relatedFindings at the given index.
   */
  com.google.protobuf.ByteString getRelatedFindingsBytes(int index);
}
