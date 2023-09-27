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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface TestConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TestConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   *
   * @return A list containing the trackingParameters.
   */
  java.util.List<java.lang.String> getTrackingParametersList();
  /**
   *
   *
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   *
   * @return The count of trackingParameters.
   */
  int getTrackingParametersCount();
  /**
   *
   *
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The trackingParameters at the given index.
   */
  java.lang.String getTrackingParameters(int index);
  /**
   *
   *
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the trackingParameters at the given index.
   */
  com.google.protobuf.ByteString getTrackingParametersBytes(int index);

  /**
   *
   *
   * <pre>
   * Flow name to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   *
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The flow.
   */
  java.lang.String getFlow();
  /**
   *
   *
   * <pre>
   * Flow name to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   *
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for flow.
   */
  com.google.protobuf.ByteString getFlowBytes();

  /**
   *
   *
   * <pre>
   * The [page][google.cloud.dialogflow.cx.v3beta1.Page] to start the test case
   * with. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   *
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The page.
   */
  java.lang.String getPage();
  /**
   *
   *
   * <pre>
   * The [page][google.cloud.dialogflow.cx.v3beta1.Page] to start the test case
   * with. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   *
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for page.
   */
  com.google.protobuf.ByteString getPageBytes();
}
