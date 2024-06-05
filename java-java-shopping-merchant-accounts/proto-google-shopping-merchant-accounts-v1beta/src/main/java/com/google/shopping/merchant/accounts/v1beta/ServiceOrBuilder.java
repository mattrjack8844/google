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

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Free-form name of the service. Must be unique within target
   * account.
   * </pre>
   *
   * <code>optional string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the serviceName field is set.
   */
  boolean hasServiceName();
  /**
   *
   *
   * <pre>
   * Required. Free-form name of the service. Must be unique within target
   * account.
   * </pre>
   *
   * <code>optional string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * Required. Free-form name of the service. Must be unique within target
   * account.
   * </pre>
   *
   * <code>optional string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Required. A boolean exposing the active status of the shipping service.
   * </pre>
   *
   * <code>optional bool active = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   *
   *
   * <pre>
   * Required. A boolean exposing the active status of the shipping service.
   * </pre>
   *
   * <code>optional bool active = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The active.
   */
  boolean getActive();

  /**
   *
   *
   * <pre>
   * Required. The CLDR territory code of the countries to which the service
   * applies.
   * </pre>
   *
   * <code>repeated string delivery_countries = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the deliveryCountries.
   */
  java.util.List<java.lang.String> getDeliveryCountriesList();
  /**
   *
   *
   * <pre>
   * Required. The CLDR territory code of the countries to which the service
   * applies.
   * </pre>
   *
   * <code>repeated string delivery_countries = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of deliveryCountries.
   */
  int getDeliveryCountriesCount();
  /**
   *
   *
   * <pre>
   * Required. The CLDR territory code of the countries to which the service
   * applies.
   * </pre>
   *
   * <code>repeated string delivery_countries = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The deliveryCountries at the given index.
   */
  java.lang.String getDeliveryCountries(int index);
  /**
   *
   *
   * <pre>
   * Required. The CLDR territory code of the countries to which the service
   * applies.
   * </pre>
   *
   * <code>repeated string delivery_countries = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deliveryCountries at the given index.
   */
  com.google.protobuf.ByteString getDeliveryCountriesBytes(int index);

  /**
   *
   *
   * <pre>
   * The CLDR code of the currency to which this service applies. Must match
   * that of the prices in rate groups.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   *
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   *
   *
   * <pre>
   * The CLDR code of the currency to which this service applies. Must match
   * that of the prices in rate groups.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * The CLDR code of the currency to which this service applies. Must match
   * that of the prices in rate groups.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Time spent in various aspects from order to the delivery of the
   * product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.DeliveryTime delivery_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deliveryTime field is set.
   */
  boolean hasDeliveryTime();
  /**
   *
   *
   * <pre>
   * Required. Time spent in various aspects from order to the delivery of the
   * product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.DeliveryTime delivery_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deliveryTime.
   */
  com.google.shopping.merchant.accounts.v1beta.DeliveryTime getDeliveryTime();
  /**
   *
   *
   * <pre>
   * Required. Time spent in various aspects from order to the delivery of the
   * product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.DeliveryTime delivery_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.DeliveryTimeOrBuilder getDeliveryTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Shipping rate group definitions. Only the last one is allowed to
   * have an empty `applicable_shipping_labels`, which means "everything else".
   * The other `applicable_shipping_labels` must not overlap.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.RateGroup rate_groups = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.accounts.v1beta.RateGroup> getRateGroupsList();
  /**
   *
   *
   * <pre>
   * Optional. Shipping rate group definitions. Only the last one is allowed to
   * have an empty `applicable_shipping_labels`, which means "everything else".
   * The other `applicable_shipping_labels` must not overlap.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.RateGroup rate_groups = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.RateGroup getRateGroups(int index);
  /**
   *
   *
   * <pre>
   * Optional. Shipping rate group definitions. Only the last one is allowed to
   * have an empty `applicable_shipping_labels`, which means "everything else".
   * The other `applicable_shipping_labels` must not overlap.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.RateGroup rate_groups = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRateGroupsCount();
  /**
   *
   *
   * <pre>
   * Optional. Shipping rate group definitions. Only the last one is allowed to
   * have an empty `applicable_shipping_labels`, which means "everything else".
   * The other `applicable_shipping_labels` must not overlap.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.RateGroup rate_groups = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.RateGroupOrBuilder>
      getRateGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Shipping rate group definitions. Only the last one is allowed to
   * have an empty `applicable_shipping_labels`, which means "everything else".
   * The other `applicable_shipping_labels` must not overlap.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.RateGroup rate_groups = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.RateGroupOrBuilder getRateGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Type of locations this service ships orders to.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Service.ShipmentType shipment_type = 7;
   * </code>
   *
   * @return Whether the shipmentType field is set.
   */
  boolean hasShipmentType();
  /**
   *
   *
   * <pre>
   * Type of locations this service ships orders to.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Service.ShipmentType shipment_type = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for shipmentType.
   */
  int getShipmentTypeValue();
  /**
   *
   *
   * <pre>
   * Type of locations this service ships orders to.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.Service.ShipmentType shipment_type = 7;
   * </code>
   *
   * @return The shipmentType.
   */
  com.google.shopping.merchant.accounts.v1beta.Service.ShipmentType getShipmentType();

  /**
   *
   *
   * <pre>
   * Minimum order value for this service. If set, indicates that customers
   * will have to spend at least this amount.
   * All prices within a service must have the same currency.
   * Cannot be set together with minimum_order_value_table.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price minimum_order_value = 8;</code>
   *
   * @return Whether the minimumOrderValue field is set.
   */
  boolean hasMinimumOrderValue();
  /**
   *
   *
   * <pre>
   * Minimum order value for this service. If set, indicates that customers
   * will have to spend at least this amount.
   * All prices within a service must have the same currency.
   * Cannot be set together with minimum_order_value_table.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price minimum_order_value = 8;</code>
   *
   * @return The minimumOrderValue.
   */
  com.google.shopping.type.Price getMinimumOrderValue();
  /**
   *
   *
   * <pre>
   * Minimum order value for this service. If set, indicates that customers
   * will have to spend at least this amount.
   * All prices within a service must have the same currency.
   * Cannot be set together with minimum_order_value_table.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price minimum_order_value = 8;</code>
   */
  com.google.shopping.type.PriceOrBuilder getMinimumOrderValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Table of per store minimum order values for the pickup fulfillment type.
   * Cannot be set together with minimum_order_value.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable minimum_order_value_table = 9;
   * </code>
   *
   * @return Whether the minimumOrderValueTable field is set.
   */
  boolean hasMinimumOrderValueTable();
  /**
   *
   *
   * <pre>
   * Table of per store minimum order values for the pickup fulfillment type.
   * Cannot be set together with minimum_order_value.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable minimum_order_value_table = 9;
   * </code>
   *
   * @return The minimumOrderValueTable.
   */
  com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable getMinimumOrderValueTable();
  /**
   *
   *
   * <pre>
   * Table of per store minimum order values for the pickup fulfillment type.
   * Cannot be set together with minimum_order_value.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.accounts.v1beta.MinimumOrderValueTable minimum_order_value_table = 9;
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.MinimumOrderValueTableOrBuilder
      getMinimumOrderValueTableOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of stores your products are delivered from.
   * This is only valid for the local delivery shipment type.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Service.StoreConfig store_config = 10;
   * </code>
   *
   * @return Whether the storeConfig field is set.
   */
  boolean hasStoreConfig();
  /**
   *
   *
   * <pre>
   * A list of stores your products are delivered from.
   * This is only valid for the local delivery shipment type.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Service.StoreConfig store_config = 10;
   * </code>
   *
   * @return The storeConfig.
   */
  com.google.shopping.merchant.accounts.v1beta.Service.StoreConfig getStoreConfig();
  /**
   *
   *
   * <pre>
   * A list of stores your products are delivered from.
   * This is only valid for the local delivery shipment type.
   * </pre>
   *
   * <code>optional .google.shopping.merchant.accounts.v1beta.Service.StoreConfig store_config = 10;
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.Service.StoreConfigOrBuilder
      getStoreConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Loyalty programs that this shipping service is limited to.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram loyalty_programs = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram>
      getLoyaltyProgramsList();
  /**
   *
   *
   * <pre>
   * Optional. Loyalty programs that this shipping service is limited to.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram loyalty_programs = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram getLoyaltyPrograms(int index);
  /**
   *
   *
   * <pre>
   * Optional. Loyalty programs that this shipping service is limited to.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram loyalty_programs = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getLoyaltyProgramsCount();
  /**
   *
   *
   * <pre>
   * Optional. Loyalty programs that this shipping service is limited to.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram loyalty_programs = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgramOrBuilder>
      getLoyaltyProgramsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Loyalty programs that this shipping service is limited to.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgram loyalty_programs = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.Service.LoyaltyProgramOrBuilder
      getLoyaltyProgramsOrBuilder(int index);
}
