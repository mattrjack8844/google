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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public interface BillingAccountPurchaseInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.BillingAccountPurchaseInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The billing account resource.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.BillingAccount billing_account = 1;</code>
   *
   * @return Whether the billingAccount field is set.
   */
  boolean hasBillingAccount();
  /**
   *
   *
   * <pre>
   * The billing account resource.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.BillingAccount billing_account = 1;</code>
   *
   * @return The billingAccount.
   */
  com.google.cloud.channel.v1.BillingAccount getBillingAccount();
  /**
   *
   *
   * <pre>
   * The billing account resource.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.BillingAccount billing_account = 1;</code>
   */
  com.google.cloud.channel.v1.BillingAccountOrBuilder getBillingAccountOrBuilder();
}
