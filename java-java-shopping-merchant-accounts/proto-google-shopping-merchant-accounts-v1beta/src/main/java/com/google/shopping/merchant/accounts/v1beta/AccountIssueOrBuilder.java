/*
 * Copyright 2024 Google LLC
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
// source: google/shopping/merchant/accounts/v1beta/accountissue.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public interface AccountIssueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.AccountIssue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the account issue.
   * Format: `accounts/{account}/issues/{id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the account issue.
   * Format: `accounts/{account}/issues/{id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The localized title of the issue.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * The localized title of the issue.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The overall severity of the issue.
   * </pre>
   *
   * <code>.google.shopping.merchant.accounts.v1beta.AccountIssue.Severity severity = 3;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * The overall severity of the issue.
   * </pre>
   *
   * <code>.google.shopping.merchant.accounts.v1beta.AccountIssue.Severity severity = 3;</code>
   *
   * @return The severity.
   */
  com.google.shopping.merchant.accounts.v1beta.AccountIssue.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * The impact this issue has on various destinations.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination impacted_destinations = 4;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination>
      getImpactedDestinationsList();
  /**
   *
   *
   * <pre>
   * The impact this issue has on various destinations.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination impacted_destinations = 4;
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination
      getImpactedDestinations(int index);
  /**
   *
   *
   * <pre>
   * The impact this issue has on various destinations.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination impacted_destinations = 4;
   * </code>
   */
  int getImpactedDestinationsCount();
  /**
   *
   *
   * <pre>
   * The impact this issue has on various destinations.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination impacted_destinations = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.accounts.v1beta.AccountIssue
                  .ImpactedDestinationOrBuilder>
      getImpactedDestinationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The impact this issue has on various destinations.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestination impacted_destinations = 4;
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.AccountIssue.ImpactedDestinationOrBuilder
      getImpactedDestinationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Further localized details about the issue.
   * </pre>
   *
   * <code>string detail = 5;</code>
   *
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * Further localized details about the issue.
   * </pre>
   *
   * <code>string detail = 5;</code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();

  /**
   *
   *
   * <pre>
   * Link to Merchant Center Help Center providing further information about the
   * issue and how to fix it.
   * </pre>
   *
   * <code>string documentation_uri = 6;</code>
   *
   * @return The documentationUri.
   */
  java.lang.String getDocumentationUri();
  /**
   *
   *
   * <pre>
   * Link to Merchant Center Help Center providing further information about the
   * issue and how to fix it.
   * </pre>
   *
   * <code>string documentation_uri = 6;</code>
   *
   * @return The bytes for documentationUri.
   */
  com.google.protobuf.ByteString getDocumentationUriBytes();
}
