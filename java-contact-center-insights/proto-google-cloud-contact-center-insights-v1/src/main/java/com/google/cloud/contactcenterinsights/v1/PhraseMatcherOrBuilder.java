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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface PhraseMatcherOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.PhraseMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the phrase matcher.
   * Format:
   * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the phrase matcher.
   * Format:
   * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the phrase matcher.
   * A new revision is committed whenever the matcher is changed, except when it
   * is activated or deactivated. A server generated random ID will be used.
   * Example: locations/global/phraseMatchers/my-first-matcher&#64;1234567
   * </pre>
   *
   * <code>
   * string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the phrase matcher.
   * A new revision is committed whenever the matcher is changed, except when it
   * is activated or deactivated. A server generated random ID will be used.
   * Example: locations/global/phraseMatchers/my-first-matcher&#64;1234567
   * </pre>
   *
   * <code>
   * string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * The customized version tag to use for the phrase matcher. If not specified,
   * it will default to `revision_id`.
   * </pre>
   *
   * <code>string version_tag = 3;</code>
   *
   * @return The versionTag.
   */
  java.lang.String getVersionTag();
  /**
   *
   *
   * <pre>
   * The customized version tag to use for the phrase matcher. If not specified,
   * it will default to `revision_id`.
   * </pre>
   *
   * <code>string version_tag = 3;</code>
   *
   * @return The bytes for versionTag.
   */
  com.google.protobuf.ByteString getVersionTagBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the revision was created. It is also the
   * create time when a new matcher is added.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the revision was created. It is also the
   * create time when a new matcher is added.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the revision was created. It is also the
   * create time when a new matcher is added.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of this phrase matcher.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatcher.PhraseMatcherType type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of this phrase matcher.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatcher.PhraseMatcherType type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatcher.PhraseMatcherType getType();

  /**
   *
   *
   * <pre>
   * Applies the phrase matcher only when it is active.
   * </pre>
   *
   * <code>bool active = 7;</code>
   *
   * @return The active.
   */
  boolean getActive();

  /**
   *
   *
   * <pre>
   * A list of phase match rule groups that are included in this matcher.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup phrase_match_rule_groups = 8;
   * </code>
   */
  java.util.List<com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup>
      getPhraseMatchRuleGroupsList();
  /**
   *
   *
   * <pre>
   * A list of phase match rule groups that are included in this matcher.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup phrase_match_rule_groups = 8;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup getPhraseMatchRuleGroups(
      int index);
  /**
   *
   *
   * <pre>
   * A list of phase match rule groups that are included in this matcher.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup phrase_match_rule_groups = 8;
   * </code>
   */
  int getPhraseMatchRuleGroupsCount();
  /**
   *
   *
   * <pre>
   * A list of phase match rule groups that are included in this matcher.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup phrase_match_rule_groups = 8;
   * </code>
   */
  java.util.List<? extends com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroupOrBuilder>
      getPhraseMatchRuleGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of phase match rule groups that are included in this matcher.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup phrase_match_rule_groups = 8;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroupOrBuilder
      getPhraseMatchRuleGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the activation status was
   * updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp activation_update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the activationUpdateTime field is set.
   */
  boolean hasActivationUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the activation status was
   * updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp activation_update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The activationUpdateTime.
   */
  com.google.protobuf.Timestamp getActivationUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the activation status was
   * updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp activation_update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getActivationUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The role whose utterances the phrase matcher should be matched
   * against. If the role is ROLE_UNSPECIFIED it will be matched against any
   * utterances in the transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role role_match = 10;
   * </code>
   *
   * @return The enum numeric value on the wire for roleMatch.
   */
  int getRoleMatchValue();
  /**
   *
   *
   * <pre>
   * The role whose utterances the phrase matcher should be matched
   * against. If the role is ROLE_UNSPECIFIED it will be matched against any
   * utterances in the transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role role_match = 10;
   * </code>
   *
   * @return The roleMatch.
   */
  com.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role getRoleMatch();

  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the phrase matcher was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the phrase matcher was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the phrase matcher was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
