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
// source: google/shopping/merchant/accounts/v1beta/shippingsettings.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

public interface MinimumOrderValueTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A list of store code sets sharing the same minimum order value
   * (MOV). At least two sets are required and the last one must be empty, which
   * signifies 'MOV for all other stores'. Each store code can only appear once
   * across all the sets. All prices within a service must have the same
   * currency.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov store_code_set_with_movs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov>
      getStoreCodeSetWithMovsList();
  /**
   *
   *
   * <pre>
   * Required. A list of store code sets sharing the same minimum order value
   * (MOV). At least two sets are required and the last one must be empty, which
   * signifies 'MOV for all other stores'. Each store code can only appear once
   * across all the sets. All prices within a service must have the same
   * currency.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov store_code_set_with_movs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov
      getStoreCodeSetWithMovs(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of store code sets sharing the same minimum order value
   * (MOV). At least two sets are required and the last one must be empty, which
   * signifies 'MOV for all other stores'. Each store code can only appear once
   * across all the sets. All prices within a service must have the same
   * currency.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov store_code_set_with_movs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getStoreCodeSetWithMovsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of store code sets sharing the same minimum order value
   * (MOV). At least two sets are required and the last one must be empty, which
   * signifies 'MOV for all other stores'. Each store code can only appear once
   * across all the sets. All prices within a service must have the same
   * currency.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov store_code_set_with_movs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable
                  .StoreCodeSetWithMovOrBuilder>
      getStoreCodeSetWithMovsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A list of store code sets sharing the same minimum order value
   * (MOV). At least two sets are required and the last one must be empty, which
   * signifies 'MOV for all other stores'. Each store code can only appear once
   * across all the sets. All prices within a service must have the same
   * currency.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMov store_code_set_with_movs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable.StoreCodeSetWithMovOrBuilder
      getStoreCodeSetWithMovsOrBuilder(int index);
}
