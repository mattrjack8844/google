// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface PostureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.Posture)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Identifier. The name of this Posture resource, in the format of
   * organizations/{org_id}/locations/{location_id}/postures/{posture}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Identifier. The name of this Posture resource, in the format of
   * organizations/{org_id}/locations/{location_id}/postures/{posture}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. State of Posture resource.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.Posture.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Required. State of Posture resource.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.Posture.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The state.
   */
  com.google.cloud.securityposture.v1.Posture.State getState();

  /**
   * <pre>
   * Output only. Immutable. The revision ID of the posture.
   * The format is an 8-character hexadecimal string.
   * https://google.aip.dev/162
   * </pre>
   *
   * <code>string revision_id = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * Output only. Immutable. The revision ID of the posture.
   * The format is an 8-character hexadecimal string.
   * https://google.aip.dev/162
   * </pre>
   *
   * <code>string revision_id = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();

  /**
   * <pre>
   * Output only. The timestamp that the posture was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp that the posture was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp that the posture was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp that the posture was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp that the posture was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp that the posture was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. User provided description of the posture.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. User provided description of the posture.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required. List of Policy sets.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicySet policy_sets = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.securityposture.v1.PolicySet> 
      getPolicySetsList();
  /**
   * <pre>
   * Required. List of Policy sets.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicySet policy_sets = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securityposture.v1.PolicySet getPolicySets(int index);
  /**
   * <pre>
   * Required. List of Policy sets.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicySet policy_sets = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getPolicySetsCount();
  /**
   * <pre>
   * Required. List of Policy sets.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicySet policy_sets = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.securityposture.v1.PolicySetOrBuilder> 
      getPolicySetsOrBuilderList();
  /**
   * <pre>
   * Required. List of Policy sets.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicySet policy_sets = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securityposture.v1.PolicySetOrBuilder getPolicySetsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. An opaque tag indicating the current version of the Posture, used
   * for concurrency control. When the `Posture` is returned from either a
   * `GetPosture` or a `ListPostures` request, this `etag` indicates the version
   * of the current `Posture` to use when executing a read-modify-write loop.
   *
   * When the `Posture` is used in a `UpdatePosture` method, use the `etag`
   * value that was returned from a `GetPosture` request as part of a
   * read-modify-write loop for concurrency control. Not setting the `etag` in a
   * `UpdatePosture` request will result in an unconditional write of the
   * `Posture`.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. An opaque tag indicating the current version of the Posture, used
   * for concurrency control. When the `Posture` is returned from either a
   * `GetPosture` or a `ListPostures` request, this `etag` indicates the version
   * of the current `Posture` to use when executing a read-modify-write loop.
   *
   * When the `Posture` is used in a `UpdatePosture` method, use the `etag`
   * value that was returned from a `GetPosture` request as part of a
   * read-modify-write loop for concurrency control. Not setting the `etag` in a
   * `UpdatePosture` request will result in an unconditional write of the
   * `Posture`.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Google Security Postures.
   * .
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Google Security Postures.
   * .
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Google Security Postures.
   * .
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Google Security Postures.
   * .
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Google Security Postures.
   * .
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Whether or not this Posture is in the process of being
   * updated.
   * </pre>
   *
   * <code>bool reconciling = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reconciling.
   */
  boolean getReconciling();
}
