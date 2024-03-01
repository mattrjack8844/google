// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securesourcemanager.v1;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A unique identifier for a repository. The name should be of the
   * format:
   * `projects/{project}/locations/{location_id}/repositories/{repository_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional. A unique identifier for a repository. The name should be of the
   * format:
   * `projects/{project}/locations/{location_id}/repositories/{repository_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Description of the repository, which cannot exceed 500
   * characters.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the repository, which cannot exceed 500
   * characters.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. The name of the instance in which the repository is hosted,
   * formatted as
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`
   * </pre>
   *
   * <code>string instance = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Output only. The name of the instance in which the repository is hosted,
   * formatted as
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`
   * </pre>
   *
   * <code>string instance = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * Output only. Unique identifier of the repository.
   * </pre>
   *
   * <code>string uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. Unique identifier of the repository.
   * </pre>
   *
   * <code>string uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * Output only. Create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Output only. URIs for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.URIs uris = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the uris field is set.
   */
  boolean hasUris();
  /**
   * <pre>
   * Output only. URIs for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.URIs uris = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uris.
   */
  com.google.cloud.securesourcemanager.v1.Repository.URIs getUris();
  /**
   * <pre>
   * Output only. URIs for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.URIs uris = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.securesourcemanager.v1.Repository.URIsOrBuilder getUrisOrBuilder();

  /**
   * <pre>
   * Input only. Initial configurations for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.InitialConfig initial_config = 10 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return Whether the initialConfig field is set.
   */
  boolean hasInitialConfig();
  /**
   * <pre>
   * Input only. Initial configurations for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.InitialConfig initial_config = 10 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The initialConfig.
   */
  com.google.cloud.securesourcemanager.v1.Repository.InitialConfig getInitialConfig();
  /**
   * <pre>
   * Input only. Initial configurations for the repository.
   * </pre>
   *
   * <code>.google.cloud.securesourcemanager.v1.Repository.InitialConfig initial_config = 10 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  com.google.cloud.securesourcemanager.v1.Repository.InitialConfigOrBuilder getInitialConfigOrBuilder();
}
