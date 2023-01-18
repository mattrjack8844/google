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
// source: google/cloud/aiplatform/v1/dataset.proto

package com.google.cloud.aiplatform.v1;

public interface DatasetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Dataset.
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
   * Output only. The resource name of the Dataset.
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
   * Required. The user-defined name of the Dataset.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
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
   * Required. The user-defined name of the Dataset.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
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
   * The description of the Dataset.
   * </pre>
   *
   * <code>string description = 16;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the Dataset.
   * </pre>
   *
   * <code>string description = 16;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * additional information about the Dataset. The schema is defined as an
   * OpenAPI 3.0.2 Schema Object. The schema files that can be used here are
   * found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
   * </pre>
   *
   * <code>string metadata_schema_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metadataSchemaUri.
   */
  java.lang.String getMetadataSchemaUri();
  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * additional information about the Dataset. The schema is defined as an
   * OpenAPI 3.0.2 Schema Object. The schema files that can be used here are
   * found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
   * </pre>
   *
   * <code>string metadata_schema_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for metadataSchemaUri.
   */
  com.google.protobuf.ByteString getMetadataSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Required. Additional information about the Dataset.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Required. Additional information about the Dataset.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   *
   *
   * <pre>
   * Required. Additional information about the Dataset.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Dataset was created.
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
   * Output only. Timestamp when this Dataset was created.
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
   * Output only. Timestamp when this Dataset was created.
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
   * Output only. Timestamp when this Dataset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Dataset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Dataset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema": output only, its
   *   value is the
   *   [metadata_schema's][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema": output only, its
   *   value is the
   *   [metadata_schema's][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema": output only, its
   *   value is the
   *   [metadata_schema's][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema": output only, its
   *   value is the
   *   [metadata_schema's][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
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
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema": output only, its
   *   value is the
   *   [metadata_schema's][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * All SavedQueries belong to the Dataset will be returned in List/Get
   * Dataset response. The [annotation_specs][SavedQuery.annotation_specs] field
   * will not be populated except for UI cases which will only use
   * [annotation_spec_count][google.cloud.aiplatform.v1.SavedQuery.annotation_spec_count].
   * In CreateDataset request, a SavedQuery is created together if
   * this field is set, up to one SavedQuery can be set in CreateDatasetRequest.
   * The SavedQuery should not contain any AnnotationSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SavedQuery saved_queries = 9;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.SavedQuery> getSavedQueriesList();
  /**
   *
   *
   * <pre>
   * All SavedQueries belong to the Dataset will be returned in List/Get
   * Dataset response. The [annotation_specs][SavedQuery.annotation_specs] field
   * will not be populated except for UI cases which will only use
   * [annotation_spec_count][google.cloud.aiplatform.v1.SavedQuery.annotation_spec_count].
   * In CreateDataset request, a SavedQuery is created together if
   * this field is set, up to one SavedQuery can be set in CreateDatasetRequest.
   * The SavedQuery should not contain any AnnotationSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SavedQuery saved_queries = 9;</code>
   */
  com.google.cloud.aiplatform.v1.SavedQuery getSavedQueries(int index);
  /**
   *
   *
   * <pre>
   * All SavedQueries belong to the Dataset will be returned in List/Get
   * Dataset response. The [annotation_specs][SavedQuery.annotation_specs] field
   * will not be populated except for UI cases which will only use
   * [annotation_spec_count][google.cloud.aiplatform.v1.SavedQuery.annotation_spec_count].
   * In CreateDataset request, a SavedQuery is created together if
   * this field is set, up to one SavedQuery can be set in CreateDatasetRequest.
   * The SavedQuery should not contain any AnnotationSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SavedQuery saved_queries = 9;</code>
   */
  int getSavedQueriesCount();
  /**
   *
   *
   * <pre>
   * All SavedQueries belong to the Dataset will be returned in List/Get
   * Dataset response. The [annotation_specs][SavedQuery.annotation_specs] field
   * will not be populated except for UI cases which will only use
   * [annotation_spec_count][google.cloud.aiplatform.v1.SavedQuery.annotation_spec_count].
   * In CreateDataset request, a SavedQuery is created together if
   * this field is set, up to one SavedQuery can be set in CreateDatasetRequest.
   * The SavedQuery should not contain any AnnotationSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SavedQuery saved_queries = 9;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.SavedQueryOrBuilder>
      getSavedQueriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All SavedQueries belong to the Dataset will be returned in List/Get
   * Dataset response. The [annotation_specs][SavedQuery.annotation_specs] field
   * will not be populated except for UI cases which will only use
   * [annotation_spec_count][google.cloud.aiplatform.v1.SavedQuery.annotation_spec_count].
   * In CreateDataset request, a SavedQuery is created together if
   * this field is set, up to one SavedQuery can be set in CreateDatasetRequest.
   * The SavedQuery should not contain any AnnotationSpec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SavedQuery saved_queries = 9;</code>
   */
  com.google.cloud.aiplatform.v1.SavedQueryOrBuilder getSavedQueriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a Dataset. If set, this Dataset
   * and all sub-resources of this Dataset will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 11;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a Dataset. If set, this Dataset
   * and all sub-resources of this Dataset will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 11;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a Dataset. If set, this Dataset
   * and all sub-resources of this Dataset will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 11;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Artifact that was created in
   * MetadataStore when creating the Dataset. The Artifact resource name pattern
   * is
   * `projects/{project}/locations/{location}/metadataStores/{metadata_store}/artifacts/{artifact}`.
   * </pre>
   *
   * <code>string metadata_artifact = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metadataArtifact.
   */
  java.lang.String getMetadataArtifact();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Artifact that was created in
   * MetadataStore when creating the Dataset. The Artifact resource name pattern
   * is
   * `projects/{project}/locations/{location}/metadataStores/{metadata_store}/artifacts/{artifact}`.
   * </pre>
   *
   * <code>string metadata_artifact = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for metadataArtifact.
   */
  com.google.protobuf.ByteString getMetadataArtifactBytes();
}
