/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public interface ConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.Connection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the connection in the form of:
   * `projects/{project_id}/locations/{location_id}/connections/{connection_id}`
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
   * The resource name of the connection in the form of:
   * `projects/{project_id}/locations/{location_id}/connections/{connection_id}`
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
   * User provided display name for the connection.
   * </pre>
   *
   * <code>string friendly_name = 2;</code>
   *
   * @return The friendlyName.
   */
  java.lang.String getFriendlyName();
  /**
   *
   *
   * <pre>
   * User provided display name for the connection.
   * </pre>
   *
   * <code>string friendly_name = 2;</code>
   *
   * @return The bytes for friendlyName.
   */
  com.google.protobuf.ByteString getFriendlyNameBytes();

  /**
   *
   *
   * <pre>
   * User provided description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User provided description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Cloud SQL properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSqlProperties cloud_sql = 4;</code>
   *
   * @return Whether the cloudSql field is set.
   */
  boolean hasCloudSql();
  /**
   *
   *
   * <pre>
   * Cloud SQL properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSqlProperties cloud_sql = 4;</code>
   *
   * @return The cloudSql.
   */
  com.google.cloud.bigquery.connection.v1.CloudSqlProperties getCloudSql();
  /**
   *
   *
   * <pre>
   * Cloud SQL properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSqlProperties cloud_sql = 4;</code>
   */
  com.google.cloud.bigquery.connection.v1.CloudSqlPropertiesOrBuilder getCloudSqlOrBuilder();

  /**
   *
   *
   * <pre>
   * Amazon Web Services (AWS) properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsProperties aws = 8;</code>
   *
   * @return Whether the aws field is set.
   */
  boolean hasAws();
  /**
   *
   *
   * <pre>
   * Amazon Web Services (AWS) properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsProperties aws = 8;</code>
   *
   * @return The aws.
   */
  com.google.cloud.bigquery.connection.v1.AwsProperties getAws();
  /**
   *
   *
   * <pre>
   * Amazon Web Services (AWS) properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsProperties aws = 8;</code>
   */
  com.google.cloud.bigquery.connection.v1.AwsPropertiesOrBuilder getAwsOrBuilder();

  /**
   *
   *
   * <pre>
   * Azure properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AzureProperties azure = 11;</code>
   *
   * @return Whether the azure field is set.
   */
  boolean hasAzure();
  /**
   *
   *
   * <pre>
   * Azure properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AzureProperties azure = 11;</code>
   *
   * @return The azure.
   */
  com.google.cloud.bigquery.connection.v1.AzureProperties getAzure();
  /**
   *
   *
   * <pre>
   * Azure properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AzureProperties azure = 11;</code>
   */
  com.google.cloud.bigquery.connection.v1.AzurePropertiesOrBuilder getAzureOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Spanner properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSpannerProperties cloud_spanner = 21;</code>
   *
   * @return Whether the cloudSpanner field is set.
   */
  boolean hasCloudSpanner();
  /**
   *
   *
   * <pre>
   * Cloud Spanner properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSpannerProperties cloud_spanner = 21;</code>
   *
   * @return The cloudSpanner.
   */
  com.google.cloud.bigquery.connection.v1.CloudSpannerProperties getCloudSpanner();
  /**
   *
   *
   * <pre>
   * Cloud Spanner properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSpannerProperties cloud_spanner = 21;</code>
   */
  com.google.cloud.bigquery.connection.v1.CloudSpannerPropertiesOrBuilder
      getCloudSpannerOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Resource properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudResourceProperties cloud_resource = 22;</code>
   *
   * @return Whether the cloudResource field is set.
   */
  boolean hasCloudResource();
  /**
   *
   *
   * <pre>
   * Cloud Resource properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudResourceProperties cloud_resource = 22;</code>
   *
   * @return The cloudResource.
   */
  com.google.cloud.bigquery.connection.v1.CloudResourceProperties getCloudResource();
  /**
   *
   *
   * <pre>
   * Cloud Resource properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudResourceProperties cloud_resource = 22;</code>
   */
  com.google.cloud.bigquery.connection.v1.CloudResourcePropertiesOrBuilder
      getCloudResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Spark properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.SparkProperties spark = 23;</code>
   *
   * @return Whether the spark field is set.
   */
  boolean hasSpark();
  /**
   *
   *
   * <pre>
   * Spark properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.SparkProperties spark = 23;</code>
   *
   * @return The spark.
   */
  com.google.cloud.bigquery.connection.v1.SparkProperties getSpark();
  /**
   *
   *
   * <pre>
   * Spark properties.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.SparkProperties spark = 23;</code>
   */
  com.google.cloud.bigquery.connection.v1.SparkPropertiesOrBuilder getSparkOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Salesforce DataCloud properties. This field is intended for
   * use only by Salesforce partner projects. This field contains properties
   * for your Salesforce DataCloud connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties salesforce_data_cloud = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the salesforceDataCloud field is set.
   */
  boolean hasSalesforceDataCloud();
  /**
   *
   *
   * <pre>
   * Optional. Salesforce DataCloud properties. This field is intended for
   * use only by Salesforce partner projects. This field contains properties
   * for your Salesforce DataCloud connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties salesforce_data_cloud = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The salesforceDataCloud.
   */
  com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties getSalesforceDataCloud();
  /**
   *
   *
   * <pre>
   * Optional. Salesforce DataCloud properties. This field is intended for
   * use only by Salesforce partner projects. This field contains properties
   * for your Salesforce DataCloud connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties salesforce_data_cloud = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.connection.v1.SalesforceDataCloudPropertiesOrBuilder
      getSalesforceDataCloudOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the connection.
   * </pre>
   *
   * <code>int64 creation_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creationTime.
   */
  long getCreationTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the connection.
   * </pre>
   *
   * <code>int64 last_modified_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The lastModifiedTime.
   */
  long getLastModifiedTime();

  /**
   *
   *
   * <pre>
   * Output only. True, if credential is configured for this connection.
   * </pre>
   *
   * <code>bool has_credential = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The hasCredential.
   */
  boolean getHasCredential();

  com.google.cloud.bigquery.connection.v1.Connection.PropertiesCase getPropertiesCase();
}
