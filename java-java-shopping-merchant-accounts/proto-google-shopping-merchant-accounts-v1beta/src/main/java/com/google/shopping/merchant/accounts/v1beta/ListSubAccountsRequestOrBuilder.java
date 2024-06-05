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
// source: google/shopping/merchant/accounts/v1beta/accounts.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public interface ListSubAccountsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.ListSubAccountsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent account.
   * Format: `accounts/{account}`
   * </pre>
   *
   * <code>
   * string provider = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   *
   *
   * <pre>
   * Required. The parent account.
   * Format: `accounts/{account}`
   * </pre>
   *
   * <code>
   * string provider = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString getProviderBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of accounts to return. The service may return
   * fewer than this value.  If unspecified, at most 250 accounts are returned.
   * The maximum value is 500; values above 500 are coerced to 500.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListAccounts` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListAccounts` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListAccounts` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListAccounts` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
