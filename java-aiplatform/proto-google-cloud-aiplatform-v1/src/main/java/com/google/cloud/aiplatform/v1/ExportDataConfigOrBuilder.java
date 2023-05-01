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

public interface ExportDataConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportDataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.aiplatform.v1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   *
   * @return Whether the fractionSplit field is set.
   */
  boolean hasFractionSplit();
  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   *
   * @return The fractionSplit.
   */
  com.google.cloud.aiplatform.v1.ExportFractionSplit getFractionSplit();
  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   */
  com.google.cloud.aiplatform.v1.ExportFractionSplitOrBuilder getFractionSplitOrBuilder();

  /**
   *
   *
   * <pre>
   * An expression for filtering what part of the Dataset is to be exported.
   * Only Annotations that match this filter will be exported. The filter syntax
   * is the same as in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations].
   * </pre>
   *
   * <code>string annotations_filter = 2;</code>
   *
   * @return The annotationsFilter.
   */
  java.lang.String getAnnotationsFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering what part of the Dataset is to be exported.
   * Only Annotations that match this filter will be exported. The filter syntax
   * is the same as in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations].
   * </pre>
   *
   * <code>string annotations_filter = 2;</code>
   *
   * @return The bytes for annotationsFilter.
   */
  com.google.protobuf.ByteString getAnnotationsFilterBytes();

  public com.google.cloud.aiplatform.v1.ExportDataConfig.DestinationCase getDestinationCase();

  public com.google.cloud.aiplatform.v1.ExportDataConfig.SplitCase getSplitCase();
}
