// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

public interface CreateMetadataSchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateMetadataSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the MetadataSchema should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the MetadataSchema should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metadataSchema field is set.
   */
  boolean hasMetadataSchema();
  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metadataSchema.
   */
  com.google.cloud.aiplatform.v1.MetadataSchema getMetadataSchema();
  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder getMetadataSchemaOrBuilder();

  /**
   * <pre>
   * The {metadata_schema} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataSchemas in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataSchema.)
   * </pre>
   *
   * <code>string metadata_schema_id = 3;</code>
   * @return The metadataSchemaId.
   */
  java.lang.String getMetadataSchemaId();
  /**
   * <pre>
   * The {metadata_schema} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataSchemas in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataSchema.)
   * </pre>
   *
   * <code>string metadata_schema_id = 3;</code>
   * @return The bytes for metadataSchemaId.
   */
  com.google.protobuf.ByteString
      getMetadataSchemaIdBytes();
}
