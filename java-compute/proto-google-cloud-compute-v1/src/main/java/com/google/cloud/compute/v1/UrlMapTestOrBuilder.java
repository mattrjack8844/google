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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface UrlMapTestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlMapTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Description of this test case.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Description of this test case.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of this test case.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
   * </pre>
   *
   * <code>optional string expected_output_url = 433967384;</code>
   *
   * @return Whether the expectedOutputUrl field is set.
   */
  boolean hasExpectedOutputUrl();
  /**
   *
   *
   * <pre>
   * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
   * </pre>
   *
   * <code>optional string expected_output_url = 433967384;</code>
   *
   * @return The expectedOutputUrl.
   */
  java.lang.String getExpectedOutputUrl();
  /**
   *
   *
   * <pre>
   * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
   * </pre>
   *
   * <code>optional string expected_output_url = 433967384;</code>
   *
   * @return The bytes for expectedOutputUrl.
   */
  com.google.protobuf.ByteString getExpectedOutputUrlBytes();

  /**
   *
   *
   * <pre>
   * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
   * </pre>
   *
   * <code>optional int32 expected_redirect_response_code = 18888047;</code>
   *
   * @return Whether the expectedRedirectResponseCode field is set.
   */
  boolean hasExpectedRedirectResponseCode();
  /**
   *
   *
   * <pre>
   * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
   * </pre>
   *
   * <code>optional int32 expected_redirect_response_code = 18888047;</code>
   *
   * @return The expectedRedirectResponseCode.
   */
  int getExpectedRedirectResponseCode();

  /**
   *
   *
   * <pre>
   * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTestHeader headers = 258436998;</code>
   */
  java.util.List<com.google.cloud.compute.v1.UrlMapTestHeader> getHeadersList();
  /**
   *
   *
   * <pre>
   * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTestHeader headers = 258436998;</code>
   */
  com.google.cloud.compute.v1.UrlMapTestHeader getHeaders(int index);
  /**
   *
   *
   * <pre>
   * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTestHeader headers = 258436998;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTestHeader headers = 258436998;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.UrlMapTestHeaderOrBuilder>
      getHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTestHeader headers = 258436998;</code>
   */
  com.google.cloud.compute.v1.UrlMapTestHeaderOrBuilder getHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Host portion of the URL. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   *
   *
   * <pre>
   * Host portion of the URL. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Host portion of the URL. If headers contains a host header, then host must also match the header value.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Path portion of the URL.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   *
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   *
   *
   * <pre>
   * Path portion of the URL.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Path portion of the URL.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();
}
