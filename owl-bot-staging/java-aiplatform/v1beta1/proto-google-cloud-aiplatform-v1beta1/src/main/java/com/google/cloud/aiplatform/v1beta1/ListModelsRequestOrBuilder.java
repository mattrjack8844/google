// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListModelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to list the Models from.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to list the Models from.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * An expression for filtering the results of the request. For field names
   * both snake_case and camelCase are supported.
   *
   *   * `model` supports = and !=. `model` represents the Model ID,
   *     i.e. the last segment of the Model's [resource
   *     name][google.cloud.aiplatform.v1beta1.Model.name].
   *   * `display_name` supports = and !=
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `base_model_name` only supports =
   *
   * Some examples:
   *
   *   * `model=1234`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `baseModelName="text-bison"`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * An expression for filtering the results of the request. For field names
   * both snake_case and camelCase are supported.
   *
   *   * `model` supports = and !=. `model` represents the Model ID,
   *     i.e. the last segment of the Model's [resource
   *     name][google.cloud.aiplatform.v1beta1.Model.name].
   *   * `display_name` supports = and !=
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `base_model_name` only supports =
   *
   * Some examples:
   *
   *   * `model=1234`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `baseModelName="text-bison"`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListModelsResponse.next_page_token]
   * of the previous
   * [ModelService.ListModels][google.cloud.aiplatform.v1beta1.ModelService.ListModels]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListModelsResponse.next_page_token]
   * of the previous
   * [ModelService.ListModels][google.cloud.aiplatform.v1beta1.ModelService.ListModels]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
