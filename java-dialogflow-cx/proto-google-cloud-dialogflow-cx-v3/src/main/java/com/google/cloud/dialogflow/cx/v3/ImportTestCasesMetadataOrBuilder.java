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
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ImportTestCasesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ImportTestCasesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestCaseError errors = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.TestCaseError> getErrorsList();
  /**
   *
   *
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestCaseError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.TestCaseError getErrors(int index);
  /**
   *
   *
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestCaseError errors = 1;</code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestCaseError errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.TestCaseErrorOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestCaseError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.TestCaseErrorOrBuilder getErrorsOrBuilder(int index);
}
