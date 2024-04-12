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
// source: google/cloud/discoveryengine/v1/data_store.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

public interface DataStoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.DataStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the data store.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
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
   * Immutable. The full resource name of the data store.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
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
   * Required. The data store display name.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
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
   * Required. The data store display name.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
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
   * Immutable. The industry vertical that the data store registers.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.IndustryVertical industry_vertical = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for industryVertical.
   */
  int getIndustryVerticalValue();
  /**
   *
   *
   * <pre>
   * Immutable. The industry vertical that the data store registers.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.IndustryVertical industry_vertical = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The industryVertical.
   */
  com.google.cloud.discoveryengine.v1.IndustryVertical getIndustryVertical();

  /**
   *
   *
   * <pre>
   * The solutions that the data store enrolls. Available solutions for each
   * [industry_vertical][google.cloud.discoveryengine.v1.DataStore.industry_vertical]:
   *
   * * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`.
   * * `SITE_SEARCH`: `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other
   *   solutions cannot be enrolled.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SolutionType solution_types = 5;</code>
   *
   * @return A list containing the solutionTypes.
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SolutionType> getSolutionTypesList();
  /**
   *
   *
   * <pre>
   * The solutions that the data store enrolls. Available solutions for each
   * [industry_vertical][google.cloud.discoveryengine.v1.DataStore.industry_vertical]:
   *
   * * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`.
   * * `SITE_SEARCH`: `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other
   *   solutions cannot be enrolled.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SolutionType solution_types = 5;</code>
   *
   * @return The count of solutionTypes.
   */
  int getSolutionTypesCount();
  /**
   *
   *
   * <pre>
   * The solutions that the data store enrolls. Available solutions for each
   * [industry_vertical][google.cloud.discoveryengine.v1.DataStore.industry_vertical]:
   *
   * * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`.
   * * `SITE_SEARCH`: `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other
   *   solutions cannot be enrolled.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SolutionType solution_types = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The solutionTypes at the given index.
   */
  com.google.cloud.discoveryengine.v1.SolutionType getSolutionTypes(int index);
  /**
   *
   *
   * <pre>
   * The solutions that the data store enrolls. Available solutions for each
   * [industry_vertical][google.cloud.discoveryengine.v1.DataStore.industry_vertical]:
   *
   * * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`.
   * * `SITE_SEARCH`: `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other
   *   solutions cannot be enrolled.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SolutionType solution_types = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for solutionTypes.
   */
  java.util.List<java.lang.Integer> getSolutionTypesValueList();
  /**
   *
   *
   * <pre>
   * The solutions that the data store enrolls. Available solutions for each
   * [industry_vertical][google.cloud.discoveryengine.v1.DataStore.industry_vertical]:
   *
   * * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`.
   * * `SITE_SEARCH`: `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other
   *   solutions cannot be enrolled.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SolutionType solution_types = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of solutionTypes at the given index.
   */
  int getSolutionTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Output only. The id of the default
   * [Schema][google.cloud.discoveryengine.v1.Schema] asscociated to this data
   * store.
   * </pre>
   *
   * <code>string default_schema_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The defaultSchemaId.
   */
  java.lang.String getDefaultSchemaId();
  /**
   *
   *
   * <pre>
   * Output only. The id of the default
   * [Schema][google.cloud.discoveryengine.v1.Schema] asscociated to this data
   * store.
   * </pre>
   *
   * <code>string default_schema_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for defaultSchemaId.
   */
  com.google.protobuf.ByteString getDefaultSchemaIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The content config of the data store. If this field is unset,
   * the server behavior defaults to
   * [ContentConfig.NO_CONTENT][google.cloud.discoveryengine.v1.DataStore.ContentConfig.NO_CONTENT].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.DataStore.ContentConfig content_config = 6 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for contentConfig.
   */
  int getContentConfigValue();
  /**
   *
   *
   * <pre>
   * Immutable. The content config of the data store. If this field is unset,
   * the server behavior defaults to
   * [ContentConfig.NO_CONTENT][google.cloud.discoveryengine.v1.DataStore.ContentConfig.NO_CONTENT].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.DataStore.ContentConfig content_config = 6 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The contentConfig.
   */
  com.google.cloud.discoveryengine.v1.DataStore.ContentConfig getContentConfig();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The start schema to use for this
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] when provisioning
   * it. If unset, a default vertical specialized schema will be used.
   *
   * This field is only used by [CreateDataStore][] API, and will be ignored if
   * used in other APIs. This field will be omitted from all API responses
   * including [CreateDataStore][] API. To retrieve a schema of a
   * [DataStore][google.cloud.discoveryengine.v1.DataStore], use
   * [SchemaService.GetSchema][google.cloud.discoveryengine.v1.SchemaService.GetSchema]
   * API instead.
   *
   * The provided schema will be validated against certain rules on schema.
   * Learn more from [this
   * doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Schema starting_schema = 28;</code>
   *
   * @return Whether the startingSchema field is set.
   */
  boolean hasStartingSchema();
  /**
   *
   *
   * <pre>
   * The start schema to use for this
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] when provisioning
   * it. If unset, a default vertical specialized schema will be used.
   *
   * This field is only used by [CreateDataStore][] API, and will be ignored if
   * used in other APIs. This field will be omitted from all API responses
   * including [CreateDataStore][] API. To retrieve a schema of a
   * [DataStore][google.cloud.discoveryengine.v1.DataStore], use
   * [SchemaService.GetSchema][google.cloud.discoveryengine.v1.SchemaService.GetSchema]
   * API instead.
   *
   * The provided schema will be validated against certain rules on schema.
   * Learn more from [this
   * doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Schema starting_schema = 28;</code>
   *
   * @return The startingSchema.
   */
  com.google.cloud.discoveryengine.v1.Schema getStartingSchema();
  /**
   *
   *
   * <pre>
   * The start schema to use for this
   * [DataStore][google.cloud.discoveryengine.v1.DataStore] when provisioning
   * it. If unset, a default vertical specialized schema will be used.
   *
   * This field is only used by [CreateDataStore][] API, and will be ignored if
   * used in other APIs. This field will be omitted from all API responses
   * including [CreateDataStore][] API. To retrieve a schema of a
   * [DataStore][google.cloud.discoveryengine.v1.DataStore], use
   * [SchemaService.GetSchema][google.cloud.discoveryengine.v1.SchemaService.GetSchema]
   * API instead.
   *
   * The provided schema will be validated against certain rules on schema.
   * Learn more from [this
   * doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Schema starting_schema = 28;</code>
   */
  com.google.cloud.discoveryengine.v1.SchemaOrBuilder getStartingSchemaOrBuilder();
}
