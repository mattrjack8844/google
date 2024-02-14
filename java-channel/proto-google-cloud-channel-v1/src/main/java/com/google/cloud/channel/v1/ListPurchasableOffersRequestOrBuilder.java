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

public interface ListPurchasableOffersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListPurchasableOffersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List Offers for CreateEntitlement purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.CreateEntitlementPurchase create_entitlement_purchase = 2;
   * </code>
   *
   * @return Whether the createEntitlementPurchase field is set.
   */
  boolean hasCreateEntitlementPurchase();
  /**
   *
   *
   * <pre>
   * List Offers for CreateEntitlement purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.CreateEntitlementPurchase create_entitlement_purchase = 2;
   * </code>
   *
   * @return The createEntitlementPurchase.
   */
  com.google.cloud.channel.v1.ListPurchasableOffersRequest.CreateEntitlementPurchase
      getCreateEntitlementPurchase();
  /**
   *
   *
   * <pre>
   * List Offers for CreateEntitlement purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.CreateEntitlementPurchase create_entitlement_purchase = 2;
   * </code>
   */
  com.google.cloud.channel.v1.ListPurchasableOffersRequest.CreateEntitlementPurchaseOrBuilder
      getCreateEntitlementPurchaseOrBuilder();

  /**
   *
   *
   * <pre>
   * List Offers for ChangeOffer purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.ChangeOfferPurchase change_offer_purchase = 3;
   * </code>
   *
   * @return Whether the changeOfferPurchase field is set.
   */
  boolean hasChangeOfferPurchase();
  /**
   *
   *
   * <pre>
   * List Offers for ChangeOffer purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.ChangeOfferPurchase change_offer_purchase = 3;
   * </code>
   *
   * @return The changeOfferPurchase.
   */
  com.google.cloud.channel.v1.ListPurchasableOffersRequest.ChangeOfferPurchase
      getChangeOfferPurchase();
  /**
   *
   *
   * <pre>
   * List Offers for ChangeOffer purchase.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ListPurchasableOffersRequest.ChangeOfferPurchase change_offer_purchase = 3;
   * </code>
   */
  com.google.cloud.channel.v1.ListPurchasableOffersRequest.ChangeOfferPurchaseOrBuilder
      getChangeOfferPurchaseOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the customer to list Offers for.
   * Format: accounts/{account_id}/customers/{customer_id}.
   * </pre>
   *
   * <code>
   * string customer = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the customer to list Offers for.
   * Format: accounts/{account_id}/customers/{customer_id}.
   * </pre>
   *
   * <code>
   * string customer = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString getCustomerBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server might return fewer results than
   * requested. If unspecified, returns at most 100 Offers. The maximum value is
   * 1000; the server will coerce values above 1000.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token for a page of results other than the first page.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token for a page of results other than the first page.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code. For example, "en-US". The
   * response will localize in the corresponding language code, if specified.
   * The default value is "en-US".
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code. For example, "en-US". The
   * response will localize in the corresponding language code, if specified.
   * The default value is "en-US".
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  com.google.cloud.channel.v1.ListPurchasableOffersRequest.PurchaseOptionCase
      getPurchaseOptionCase();
}
