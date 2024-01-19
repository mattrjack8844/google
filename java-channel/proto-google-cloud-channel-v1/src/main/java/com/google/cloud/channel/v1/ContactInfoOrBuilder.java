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
// source: google/cloud/channel/v1/customers.proto

package com.google.cloud.channel.v1;

public interface ContactInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ContactInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The customer account contact's first name. Optional for Team customers.
   * </pre>
   *
   * <code>string first_name = 1;</code>
   *
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   *
   *
   * <pre>
   * The customer account contact's first name. Optional for Team customers.
   * </pre>
   *
   * <code>string first_name = 1;</code>
   *
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString getFirstNameBytes();

  /**
   *
   *
   * <pre>
   * The customer account contact's last name. Optional for Team customers.
   * </pre>
   *
   * <code>string last_name = 2;</code>
   *
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   *
   *
   * <pre>
   * The customer account contact's last name. Optional for Team customers.
   * </pre>
   *
   * <code>string last_name = 2;</code>
   *
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString getLastNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The customer account contact's display name, formatted as a
   * combination of the customer's first and last name.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The customer account contact's display name, formatted as a
   * combination of the customer's first and last name.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The customer account's contact email. Required for entitlements that create
   * admin.google.com accounts, and serves as the customer's username for those
   * accounts. Use this email to invite Team customers.
   * </pre>
   *
   * <code>string email = 5;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * The customer account's contact email. Required for entitlements that create
   * admin.google.com accounts, and serves as the customer's username for those
   * accounts. Use this email to invite Team customers.
   * </pre>
   *
   * <code>string email = 5;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * Optional. The customer account contact's job title.
   * </pre>
   *
   * <code>string title = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Optional. The customer account contact's job title.
   * </pre>
   *
   * <code>string title = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The customer account's contact phone number.
   * </pre>
   *
   * <code>string phone = 7;</code>
   *
   * @return The phone.
   */
  java.lang.String getPhone();
  /**
   *
   *
   * <pre>
   * The customer account's contact phone number.
   * </pre>
   *
   * <code>string phone = 7;</code>
   *
   * @return The bytes for phone.
   */
  com.google.protobuf.ByteString getPhoneBytes();
}
