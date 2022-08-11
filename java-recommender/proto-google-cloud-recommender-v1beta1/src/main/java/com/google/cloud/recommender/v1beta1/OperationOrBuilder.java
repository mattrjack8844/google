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
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface OperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of this operation. Contains one of 'add', 'remove', 'replace', 'move',
   * 'copy', 'test' and 'custom' operations. This field is case-insensitive and
   * always populated.
   * </pre>
   *
   * <code>string action = 1;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Type of this operation. Contains one of 'add', 'remove', 'replace', 'move',
   * 'copy', 'test' and 'custom' operations. This field is case-insensitive and
   * always populated.
   * </pre>
   *
   * <code>string action = 1;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * Type of GCP resource being modified/tested. This field is always populated.
   * Example: cloudresourcemanager.googleapis.com/Project,
   * compute.googleapis.com/Instance
   * </pre>
   *
   * <code>string resource_type = 2;</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * Type of GCP resource being modified/tested. This field is always populated.
   * Example: cloudresourcemanager.googleapis.com/Project,
   * compute.googleapis.com/Instance
   * </pre>
   *
   * <code>string resource_type = 2;</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();

  /**
   *
   *
   * <pre>
   * Contains the fully qualified resource name. This field is always populated.
   * ex: //cloudresourcemanager.googleapis.com/projects/foo.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Contains the fully qualified resource name. This field is always populated.
   * ex: //cloudresourcemanager.googleapis.com/projects/foo.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Path to the target field being operated on. If the operation is at the
   * resource level, then path should be "/". This field is always populated.
   * </pre>
   *
   * <code>string path = 4;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Path to the target field being operated on. If the operation is at the
   * resource level, then path should be "/". This field is always populated.
   * </pre>
   *
   * <code>string path = 4;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Can be set with action 'copy' to copy resource configuration across
   * different resources of the same type. Example: A resource clone can be
   * done via action = 'copy', path = "/", from = "/",
   * source_resource = &lt;source&gt; and resource_name = &lt;target&gt;.
   * This field is empty for all other values of `action`.
   * </pre>
   *
   * <code>string source_resource = 5;</code>
   *
   * @return The sourceResource.
   */
  java.lang.String getSourceResource();
  /**
   *
   *
   * <pre>
   * Can be set with action 'copy' to copy resource configuration across
   * different resources of the same type. Example: A resource clone can be
   * done via action = 'copy', path = "/", from = "/",
   * source_resource = &lt;source&gt; and resource_name = &lt;target&gt;.
   * This field is empty for all other values of `action`.
   * </pre>
   *
   * <code>string source_resource = 5;</code>
   *
   * @return The bytes for sourceResource.
   */
  com.google.protobuf.ByteString getSourceResourceBytes();

  /**
   *
   *
   * <pre>
   * Can be set with action 'copy' or 'move' to indicate the source field within
   * resource or source_resource, ignored if provided for other operation types.
   * </pre>
   *
   * <code>string source_path = 6;</code>
   *
   * @return The sourcePath.
   */
  java.lang.String getSourcePath();
  /**
   *
   *
   * <pre>
   * Can be set with action 'copy' or 'move' to indicate the source field within
   * resource or source_resource, ignored if provided for other operation types.
   * </pre>
   *
   * <code>string source_path = 6;</code>
   *
   * @return The bytes for sourcePath.
   */
  com.google.protobuf.ByteString getSourcePathBytes();

  /**
   *
   *
   * <pre>
   * Value for the `path` field. Will be set for actions:'add'/'replace'.
   * Maybe set for action: 'test'. Either this or `value_matcher` will be set
   * for 'test' operation. An exact match must be performed.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 7;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Value for the `path` field. Will be set for actions:'add'/'replace'.
   * Maybe set for action: 'test'. Either this or `value_matcher` will be set
   * for 'test' operation. An exact match must be performed.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 7;</code>
   *
   * @return The value.
   */
  com.google.protobuf.Value getValue();
  /**
   *
   *
   * <pre>
   * Value for the `path` field. Will be set for actions:'add'/'replace'.
   * Maybe set for action: 'test'. Either this or `value_matcher` will be set
   * for 'test' operation. An exact match must be performed.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 7;</code>
   */
  com.google.protobuf.ValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Can be set for action 'test' for advanced matching for the value of
   * 'path' field. Either this or `value` will be set for 'test' operation.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.ValueMatcher value_matcher = 10;</code>
   *
   * @return Whether the valueMatcher field is set.
   */
  boolean hasValueMatcher();
  /**
   *
   *
   * <pre>
   * Can be set for action 'test' for advanced matching for the value of
   * 'path' field. Either this or `value` will be set for 'test' operation.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.ValueMatcher value_matcher = 10;</code>
   *
   * @return The valueMatcher.
   */
  com.google.cloud.recommender.v1beta1.ValueMatcher getValueMatcher();
  /**
   *
   *
   * <pre>
   * Can be set for action 'test' for advanced matching for the value of
   * 'path' field. Either this or `value` will be set for 'test' operation.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.ValueMatcher value_matcher = 10;</code>
   */
  com.google.cloud.recommender.v1beta1.ValueMatcherOrBuilder getValueMatcherOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of filters to apply if `path` refers to array elements or nested array
   * elements in order to narrow down to a single unique element that is being
   * tested/modified.
   * This is intended to be an exact match per filter. To perform advanced
   * matching, use path_value_matchers.
   * * Example:
   * ```
   * {
   *   "/versions/&#42;&#47;name" : "it-123"
   *   "/versions/&#42;&#47;targetSize/percent": 20
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;condition" : null
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;members/&#42;" : ["x&#64;example.com", "y&#64;example.com"]
   * }
   * ```
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; path_filters = 8;</code>
   */
  int getPathFiltersCount();
  /**
   *
   *
   * <pre>
   * Set of filters to apply if `path` refers to array elements or nested array
   * elements in order to narrow down to a single unique element that is being
   * tested/modified.
   * This is intended to be an exact match per filter. To perform advanced
   * matching, use path_value_matchers.
   * * Example:
   * ```
   * {
   *   "/versions/&#42;&#47;name" : "it-123"
   *   "/versions/&#42;&#47;targetSize/percent": 20
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;condition" : null
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;members/&#42;" : ["x&#64;example.com", "y&#64;example.com"]
   * }
   * ```
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; path_filters = 8;</code>
   */
  boolean containsPathFilters(java.lang.String key);
  /** Use {@link #getPathFiltersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getPathFilters();
  /**
   *
   *
   * <pre>
   * Set of filters to apply if `path` refers to array elements or nested array
   * elements in order to narrow down to a single unique element that is being
   * tested/modified.
   * This is intended to be an exact match per filter. To perform advanced
   * matching, use path_value_matchers.
   * * Example:
   * ```
   * {
   *   "/versions/&#42;&#47;name" : "it-123"
   *   "/versions/&#42;&#47;targetSize/percent": 20
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;condition" : null
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;members/&#42;" : ["x&#64;example.com", "y&#64;example.com"]
   * }
   * ```
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; path_filters = 8;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getPathFiltersMap();
  /**
   *
   *
   * <pre>
   * Set of filters to apply if `path` refers to array elements or nested array
   * elements in order to narrow down to a single unique element that is being
   * tested/modified.
   * This is intended to be an exact match per filter. To perform advanced
   * matching, use path_value_matchers.
   * * Example:
   * ```
   * {
   *   "/versions/&#42;&#47;name" : "it-123"
   *   "/versions/&#42;&#47;targetSize/percent": 20
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;condition" : null
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;members/&#42;" : ["x&#64;example.com", "y&#64;example.com"]
   * }
   * ```
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; path_filters = 8;</code>
   */

  /* nullable */
  com.google.protobuf.Value getPathFiltersOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Set of filters to apply if `path` refers to array elements or nested array
   * elements in order to narrow down to a single unique element that is being
   * tested/modified.
   * This is intended to be an exact match per filter. To perform advanced
   * matching, use path_value_matchers.
   * * Example:
   * ```
   * {
   *   "/versions/&#42;&#47;name" : "it-123"
   *   "/versions/&#42;&#47;targetSize/percent": 20
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;condition" : null
   * }
   * ```
   * * Example:
   * ```
   * {
   *   "/bindings/&#42;&#47;role": "roles/owner"
   *   "/bindings/&#42;&#47;members/&#42;" : ["x&#64;example.com", "y&#64;example.com"]
   * }
   * ```
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; path_filters = 8;</code>
   */
  com.google.protobuf.Value getPathFiltersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Similar to path_filters, this contains set of filters to apply if `path`
   * field refers to array elements. This is meant to support value matching
   * beyond exact match. To perform exact match, use path_filters.
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommender.v1beta1.ValueMatcher&gt; path_value_matchers = 11;
   * </code>
   */
  int getPathValueMatchersCount();
  /**
   *
   *
   * <pre>
   * Similar to path_filters, this contains set of filters to apply if `path`
   * field refers to array elements. This is meant to support value matching
   * beyond exact match. To perform exact match, use path_filters.
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommender.v1beta1.ValueMatcher&gt; path_value_matchers = 11;
   * </code>
   */
  boolean containsPathValueMatchers(java.lang.String key);
  /** Use {@link #getPathValueMatchersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.recommender.v1beta1.ValueMatcher>
      getPathValueMatchers();
  /**
   *
   *
   * <pre>
   * Similar to path_filters, this contains set of filters to apply if `path`
   * field refers to array elements. This is meant to support value matching
   * beyond exact match. To perform exact match, use path_filters.
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommender.v1beta1.ValueMatcher&gt; path_value_matchers = 11;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.recommender.v1beta1.ValueMatcher>
      getPathValueMatchersMap();
  /**
   *
   *
   * <pre>
   * Similar to path_filters, this contains set of filters to apply if `path`
   * field refers to array elements. This is meant to support value matching
   * beyond exact match. To perform exact match, use path_filters.
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommender.v1beta1.ValueMatcher&gt; path_value_matchers = 11;
   * </code>
   */

  /* nullable */
  com.google.cloud.recommender.v1beta1.ValueMatcher getPathValueMatchersOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.recommender.v1beta1.ValueMatcher defaultValue);
  /**
   *
   *
   * <pre>
   * Similar to path_filters, this contains set of filters to apply if `path`
   * field refers to array elements. This is meant to support value matching
   * beyond exact match. To perform exact match, use path_filters.
   * When both path_filters and path_value_matchers are set, an implicit AND
   * must be performed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommender.v1beta1.ValueMatcher&gt; path_value_matchers = 11;
   * </code>
   */
  com.google.cloud.recommender.v1beta1.ValueMatcher getPathValueMatchersOrThrow(
      java.lang.String key);

  public com.google.cloud.recommender.v1beta1.Operation.PathValueCase getPathValueCase();
}
