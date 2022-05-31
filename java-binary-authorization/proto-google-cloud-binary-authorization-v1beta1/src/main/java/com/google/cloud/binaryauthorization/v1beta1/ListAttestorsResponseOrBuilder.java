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
// source: google/cloud/binaryauthorization/v1beta1/service.proto

package com.google.cloud.binaryauthorization.v1beta1;

public interface ListAttestorsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.ListAttestorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [attestors][google.cloud.binaryauthorization.v1beta1.Attestor].
   * </pre>
   *
   * <code>repeated .google.cloud.binaryauthorization.v1beta1.Attestor attestors = 1;</code>
   */
  java.util.List<com.google.cloud.binaryauthorization.v1beta1.Attestor> getAttestorsList();
  /**
   *
   *
   * <pre>
   * The list of [attestors][google.cloud.binaryauthorization.v1beta1.Attestor].
   * </pre>
   *
   * <code>repeated .google.cloud.binaryauthorization.v1beta1.Attestor attestors = 1;</code>
   */
  com.google.cloud.binaryauthorization.v1beta1.Attestor getAttestors(int index);
  /**
   *
   *
   * <pre>
   * The list of [attestors][google.cloud.binaryauthorization.v1beta1.Attestor].
   * </pre>
   *
   * <code>repeated .google.cloud.binaryauthorization.v1beta1.Attestor attestors = 1;</code>
   */
  int getAttestorsCount();
  /**
   *
   *
   * <pre>
   * The list of [attestors][google.cloud.binaryauthorization.v1beta1.Attestor].
   * </pre>
   *
   * <code>repeated .google.cloud.binaryauthorization.v1beta1.Attestor attestors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder>
      getAttestorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [attestors][google.cloud.binaryauthorization.v1beta1.Attestor].
   * </pre>
   *
   * <code>repeated .google.cloud.binaryauthorization.v1beta1.Attestor attestors = 1;</code>
   */
  com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder getAttestorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in the
   * [ListAttestorsRequest.page_token][google.cloud.binaryauthorization.v1beta1.ListAttestorsRequest.page_token] field in the subsequent call to the
   * `ListAttestors` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in the
   * [ListAttestorsRequest.page_token][google.cloud.binaryauthorization.v1beta1.ListAttestorsRequest.page_token] field in the subsequent call to the
   * `ListAttestors` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
