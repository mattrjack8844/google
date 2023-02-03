// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

public interface HTTPGetActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.HTTPGetAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path to access on the HTTP server. Defaults to '/'.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Path to access on the HTTP server. Defaults to '/'.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  java.util.List<com.google.cloud.run.v2.HTTPHeader> 
      getHttpHeadersList();
  /**
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  com.google.cloud.run.v2.HTTPHeader getHttpHeaders(int index);
  /**
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  int getHttpHeadersCount();
  /**
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.HTTPHeaderOrBuilder> 
      getHttpHeadersOrBuilderList();
  /**
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  com.google.cloud.run.v2.HTTPHeaderOrBuilder getHttpHeadersOrBuilder(
      int index);
}
