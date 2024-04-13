// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/io.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ContainerRegistryDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ContainerRegistryDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Container Registry URI of a container image.
   * Only Google Container Registry and Artifact Registry are supported now.
   * Accepted forms:
   *
   * *  Google Container Registry path. For example:
   *    `gcr.io/projectId/imageName:tag`.
   *
   * *  Artifact Registry path. For example:
   *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
   *
   * If a tag is not specified, "latest" will be used as the default tag.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUri.
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * Required. Container Registry URI of a container image.
   * Only Google Container Registry and Artifact Registry are supported now.
   * Accepted forms:
   *
   * *  Google Container Registry path. For example:
   *    `gcr.io/projectId/imageName:tag`.
   *
   * *  Artifact Registry path. For example:
   *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
   *
   * If a tag is not specified, "latest" will be used as the default tag.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUri.
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();
}
