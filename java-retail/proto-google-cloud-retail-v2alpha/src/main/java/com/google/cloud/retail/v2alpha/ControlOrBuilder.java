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
// source: google/cloud/retail/v2alpha/control.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ControlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.Control)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A facet specification to perform faceted search.
   *
   * Note that this field is deprecated and will throw NOT_IMPLEMENTED if
   * used for creating a control.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchRequest.FacetSpec facet_spec = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.retail.v2alpha.Control.facet_spec is deprecated. See
   *     google/cloud/retail/v2alpha/control.proto;l=51
   * @return Whether the facetSpec field is set.
   */
  @java.lang.Deprecated
  boolean hasFacetSpec();
  /**
   *
   *
   * <pre>
   * A facet specification to perform faceted search.
   *
   * Note that this field is deprecated and will throw NOT_IMPLEMENTED if
   * used for creating a control.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchRequest.FacetSpec facet_spec = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.retail.v2alpha.Control.facet_spec is deprecated. See
   *     google/cloud/retail/v2alpha/control.proto;l=51
   * @return The facetSpec.
   */
  @java.lang.Deprecated
  com.google.cloud.retail.v2alpha.SearchRequest.FacetSpec getFacetSpec();
  /**
   *
   *
   * <pre>
   * A facet specification to perform faceted search.
   *
   * Note that this field is deprecated and will throw NOT_IMPLEMENTED if
   * used for creating a control.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchRequest.FacetSpec facet_spec = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.retail.v2alpha.SearchRequest.FacetSpecOrBuilder getFacetSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * A rule control - a condition-action pair.
   * Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Rule rule = 4;</code>
   *
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   *
   *
   * <pre>
   * A rule control - a condition-action pair.
   * Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Rule rule = 4;</code>
   *
   * @return The rule.
   */
  com.google.cloud.retail.v2alpha.Rule getRule();
  /**
   *
   *
   * <pre>
   * A rule control - a condition-action pair.
   * Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Rule rule = 4;</code>
   */
  com.google.cloud.retail.v2alpha.RuleOrBuilder getRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/&#42;&#47;locations/global/catalogs/&#42;&#47;controls/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/&#42;&#47;locations/global/catalogs/&#42;&#47;controls/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human readable control display name. Used in Retail UI.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is thrown.
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
   * Required. The human readable control display name. Used in Retail UI.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is thrown.
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
   * Output only. List of [serving
   * config][google.cloud.retail.v2alpha.ServingConfig] ids that are associated
   * with this control in the same
   * [Catalog][google.cloud.retail.v2alpha.Catalog].
   *
   * Note the association is managed via the
   * [ServingConfig][google.cloud.retail.v2alpha.ServingConfig], this is an
   * output only denormalized view.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the associatedServingConfigIds.
   */
  java.util.List<java.lang.String> getAssociatedServingConfigIdsList();
  /**
   *
   *
   * <pre>
   * Output only. List of [serving
   * config][google.cloud.retail.v2alpha.ServingConfig] ids that are associated
   * with this control in the same
   * [Catalog][google.cloud.retail.v2alpha.Catalog].
   *
   * Note the association is managed via the
   * [ServingConfig][google.cloud.retail.v2alpha.ServingConfig], this is an
   * output only denormalized view.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of associatedServingConfigIds.
   */
  int getAssociatedServingConfigIdsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of [serving
   * config][google.cloud.retail.v2alpha.ServingConfig] ids that are associated
   * with this control in the same
   * [Catalog][google.cloud.retail.v2alpha.Catalog].
   *
   * Note the association is managed via the
   * [ServingConfig][google.cloud.retail.v2alpha.ServingConfig], this is an
   * output only denormalized view.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The associatedServingConfigIds at the given index.
   */
  java.lang.String getAssociatedServingConfigIds(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of [serving
   * config][google.cloud.retail.v2alpha.ServingConfig] ids that are associated
   * with this control in the same
   * [Catalog][google.cloud.retail.v2alpha.Catalog].
   *
   * Note the association is managed via the
   * [ServingConfig][google.cloud.retail.v2alpha.ServingConfig], this is an
   * output only denormalized view.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the associatedServingConfigIds at the given index.
   */
  com.google.protobuf.ByteString getAssociatedServingConfigIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Immutable. The solution types that the control is used for.
   * Currently we support setting only one type of solution at creation time.
   *
   * Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
   * If no solution type is provided at creation time, will default to
   * [SOLUTION_TYPE_SEARCH][google.cloud.retail.v2alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType solution_types = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return A list containing the solutionTypes.
   */
  java.util.List<com.google.cloud.retail.v2alpha.SolutionType> getSolutionTypesList();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The solution types that the control is used for.
   * Currently we support setting only one type of solution at creation time.
   *
   * Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
   * If no solution type is provided at creation time, will default to
   * [SOLUTION_TYPE_SEARCH][google.cloud.retail.v2alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType solution_types = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The count of solutionTypes.
   */
  int getSolutionTypesCount();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The solution types that the control is used for.
   * Currently we support setting only one type of solution at creation time.
   *
   * Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
   * If no solution type is provided at creation time, will default to
   * [SOLUTION_TYPE_SEARCH][google.cloud.retail.v2alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType solution_types = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The solutionTypes at the given index.
   */
  com.google.cloud.retail.v2alpha.SolutionType getSolutionTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. Immutable. The solution types that the control is used for.
   * Currently we support setting only one type of solution at creation time.
   *
   * Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
   * If no solution type is provided at creation time, will default to
   * [SOLUTION_TYPE_SEARCH][google.cloud.retail.v2alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType solution_types = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for solutionTypes.
   */
  java.util.List<java.lang.Integer> getSolutionTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The solution types that the control is used for.
   * Currently we support setting only one type of solution at creation time.
   *
   * Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
   * If no solution type is provided at creation time, will default to
   * [SOLUTION_TYPE_SEARCH][google.cloud.retail.v2alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType solution_types = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of solutionTypes at the given index.
   */
  int getSolutionTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only settable by search controls.
   * Will default to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2alpha.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH]
   * if not specified. Currently only allow one search_solution_use_case per
   * control.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchSolutionUseCase search_solution_use_case = 7;
   * </code>
   *
   * @return A list containing the searchSolutionUseCase.
   */
  java.util.List<com.google.cloud.retail.v2alpha.SearchSolutionUseCase>
      getSearchSolutionUseCaseList();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only settable by search controls.
   * Will default to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2alpha.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH]
   * if not specified. Currently only allow one search_solution_use_case per
   * control.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchSolutionUseCase search_solution_use_case = 7;
   * </code>
   *
   * @return The count of searchSolutionUseCase.
   */
  int getSearchSolutionUseCaseCount();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only settable by search controls.
   * Will default to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2alpha.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH]
   * if not specified. Currently only allow one search_solution_use_case per
   * control.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchSolutionUseCase search_solution_use_case = 7;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The searchSolutionUseCase at the given index.
   */
  com.google.cloud.retail.v2alpha.SearchSolutionUseCase getSearchSolutionUseCase(int index);
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only settable by search controls.
   * Will default to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2alpha.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH]
   * if not specified. Currently only allow one search_solution_use_case per
   * control.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchSolutionUseCase search_solution_use_case = 7;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for searchSolutionUseCase.
   */
  java.util.List<java.lang.Integer> getSearchSolutionUseCaseValueList();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only settable by search controls.
   * Will default to
   * [SEARCH_SOLUTION_USE_CASE_SEARCH][google.cloud.retail.v2alpha.SearchSolutionUseCase.SEARCH_SOLUTION_USE_CASE_SEARCH]
   * if not specified. Currently only allow one search_solution_use_case per
   * control.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchSolutionUseCase search_solution_use_case = 7;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of searchSolutionUseCase at the given index.
   */
  int getSearchSolutionUseCaseValue(int index);

  com.google.cloud.retail.v2alpha.Control.ControlCase getControlCase();
}
