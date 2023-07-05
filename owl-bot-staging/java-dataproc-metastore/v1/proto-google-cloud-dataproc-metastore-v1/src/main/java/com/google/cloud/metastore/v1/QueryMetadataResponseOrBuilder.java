// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

public interface QueryMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.QueryMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The manifest URI  is link to a JSON instance in Cloud Storage.
   * This instance manifests immediately along with QueryMetadataResponse. The
   * content of the URI is not retriable until the long-running operation query
   * against the metadata finishes.
   * </pre>
   *
   * <code>string result_manifest_uri = 1;</code>
   * @return The resultManifestUri.
   */
  java.lang.String getResultManifestUri();
  /**
   * <pre>
   * The manifest URI  is link to a JSON instance in Cloud Storage.
   * This instance manifests immediately along with QueryMetadataResponse. The
   * content of the URI is not retriable until the long-running operation query
   * against the metadata finishes.
   * </pre>
   *
   * <code>string result_manifest_uri = 1;</code>
   * @return The bytes for resultManifestUri.
   */
  com.google.protobuf.ByteString
      getResultManifestUriBytes();
}
