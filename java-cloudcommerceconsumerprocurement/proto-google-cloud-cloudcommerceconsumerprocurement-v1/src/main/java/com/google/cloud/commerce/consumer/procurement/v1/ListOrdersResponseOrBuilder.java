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
// source: google/cloud/commerce/consumer/procurement/v1/procurement_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.commerce.consumer.procurement.v1;

public interface ListOrdersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.ListOrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1.Order orders = 1;</code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1.Order> getOrdersList();
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1.Order orders = 1;</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.Order getOrders(int index);
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1.Order orders = 1;</code>
   */
  int getOrdersCount();
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1.Order orders = 1;</code>
   */
  java.util.List<? extends com.google.cloud.commerce.consumer.procurement.v1.OrderOrBuilder>
      getOrdersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1.Order orders = 1;</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.OrderOrBuilder getOrdersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token for fetching the next page.
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
   * The token for fetching the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
