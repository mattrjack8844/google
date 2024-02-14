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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.analyticshub.v1;

public interface SubscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Listing.
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * </pre>
   *
   * <code>string listing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the listing field is set.
   */
  boolean hasListing();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Listing.
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * </pre>
   *
   * <code>string listing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The listing.
   */
  java.lang.String getListing();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Listing.
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * </pre>
   *
   * <code>string listing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for listing.
   */
  com.google.protobuf.ByteString getListingBytes();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Data Exchange.
   * e.g. projects/123/locations/US/dataExchanges/456
   * </pre>
   *
   * <code>string data_exchange = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the dataExchange field is set.
   */
  boolean hasDataExchange();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Data Exchange.
   * e.g. projects/123/locations/US/dataExchanges/456
   * </pre>
   *
   * <code>string data_exchange = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataExchange.
   */
  java.lang.String getDataExchange();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the source Data Exchange.
   * e.g. projects/123/locations/US/dataExchanges/456
   * </pre>
   *
   * <code>string data_exchange = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dataExchange.
   */
  com.google.protobuf.ByteString getDataExchangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the subscription.
   * e.g. `projects/myproject/locations/US/subscriptions/123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the subscription.
   * e.g. `projects/myproject/locations/US/subscriptions/123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was last modified.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_modify_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastModifyTime field is set.
   */
  boolean hasLastModifyTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was last modified.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_modify_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastModifyTime.
   */
  com.google.protobuf.Timestamp getLastModifyTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the subscription was last modified.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_modify_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastModifyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Organization of the project this subscription belongs to.
   * </pre>
   *
   * <code>string organization_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   *
   *
   * <pre>
   * Output only. Organization of the project this subscription belongs to.
   * </pre>
   *
   * <code>string organization_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString getOrganizationIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Display name of the project of this subscription.
   * </pre>
   *
   * <code>string organization_display_name = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The organizationDisplayName.
   */
  java.lang.String getOrganizationDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. Display name of the project of this subscription.
   * </pre>
   *
   * <code>string organization_display_name = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for organizationDisplayName.
   */
  com.google.protobuf.ByteString getOrganizationDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the subscription.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Subscription.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the subscription.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Subscription.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.bigquery.analyticshub.v1.Subscription.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Map of listing resource names to associated linked resource,
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * -&gt;
   * projects/123/datasets/my_dataset
   *
   * For listing-level subscriptions, this is a map of size 1.
   * Only contains values if state == STATE_ACTIVE.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource&gt; linked_dataset_map = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getLinkedDatasetMapCount();
  /**
   *
   *
   * <pre>
   * Output only. Map of listing resource names to associated linked resource,
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * -&gt;
   * projects/123/datasets/my_dataset
   *
   * For listing-level subscriptions, this is a map of size 1.
   * Only contains values if state == STATE_ACTIVE.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource&gt; linked_dataset_map = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsLinkedDatasetMap(java.lang.String key);
  /** Use {@link #getLinkedDatasetMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource>
      getLinkedDatasetMap();
  /**
   *
   *
   * <pre>
   * Output only. Map of listing resource names to associated linked resource,
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * -&gt;
   * projects/123/datasets/my_dataset
   *
   * For listing-level subscriptions, this is a map of size 1.
   * Only contains values if state == STATE_ACTIVE.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource&gt; linked_dataset_map = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource>
      getLinkedDatasetMapMap();
  /**
   *
   *
   * <pre>
   * Output only. Map of listing resource names to associated linked resource,
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * -&gt;
   * projects/123/datasets/my_dataset
   *
   * For listing-level subscriptions, this is a map of size 1.
   * Only contains values if state == STATE_ACTIVE.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource&gt; linked_dataset_map = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource
      getLinkedDatasetMapOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map of listing resource names to associated linked resource,
   * e.g. projects/123/locations/US/dataExchanges/456/listings/789
   * -&gt;
   * projects/123/datasets/my_dataset
   *
   * For listing-level subscriptions, this is a map of size 1.
   * Only contains values if state == STATE_ACTIVE.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource&gt; linked_dataset_map = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.Subscription.LinkedResource getLinkedDatasetMapOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Email of the subscriber.
   * </pre>
   *
   * <code>string subscriber_contact = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The subscriberContact.
   */
  java.lang.String getSubscriberContact();
  /**
   *
   *
   * <pre>
   * Output only. Email of the subscriber.
   * </pre>
   *
   * <code>string subscriber_contact = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for subscriberContact.
   */
  com.google.protobuf.ByteString getSubscriberContactBytes();

  com.google.cloud.bigquery.analyticshub.v1.Subscription.ResourceNameCase getResourceNameCase();
}
