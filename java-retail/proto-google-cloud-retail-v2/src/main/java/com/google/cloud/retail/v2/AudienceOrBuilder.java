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
// source: google/cloud/retail/v2/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface AudienceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.Audience)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The genders of the audience. Strongly encouraged to use the standard
   * values: "male", "female", "unisex".
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [gender](https://support.google.com/merchants/answer/6324479). Schema.org
   * property
   * [Product.audience.suggestedGender](https://schema.org/suggestedGender).
   * </pre>
   *
   * <code>repeated string genders = 1;</code>
   *
   * @return A list containing the genders.
   */
  java.util.List<java.lang.String> getGendersList();
  /**
   *
   *
   * <pre>
   * The genders of the audience. Strongly encouraged to use the standard
   * values: "male", "female", "unisex".
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [gender](https://support.google.com/merchants/answer/6324479). Schema.org
   * property
   * [Product.audience.suggestedGender](https://schema.org/suggestedGender).
   * </pre>
   *
   * <code>repeated string genders = 1;</code>
   *
   * @return The count of genders.
   */
  int getGendersCount();
  /**
   *
   *
   * <pre>
   * The genders of the audience. Strongly encouraged to use the standard
   * values: "male", "female", "unisex".
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [gender](https://support.google.com/merchants/answer/6324479). Schema.org
   * property
   * [Product.audience.suggestedGender](https://schema.org/suggestedGender).
   * </pre>
   *
   * <code>repeated string genders = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The genders at the given index.
   */
  java.lang.String getGenders(int index);
  /**
   *
   *
   * <pre>
   * The genders of the audience. Strongly encouraged to use the standard
   * values: "male", "female", "unisex".
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [gender](https://support.google.com/merchants/answer/6324479). Schema.org
   * property
   * [Product.audience.suggestedGender](https://schema.org/suggestedGender).
   * </pre>
   *
   * <code>repeated string genders = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the genders at the given index.
   */
  com.google.protobuf.ByteString getGendersBytes(int index);

  /**
   *
   *
   * <pre>
   * The age groups of the audience. Strongly encouraged to use the standard
   * values: "newborn" (up to 3 months old), "infant" (3–12 months old),
   * "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically
   * teens or older).
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [age_group](https://support.google.com/merchants/answer/6324463).
   * Schema.org property
   * [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and
   * [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
   * </pre>
   *
   * <code>repeated string age_groups = 2;</code>
   *
   * @return A list containing the ageGroups.
   */
  java.util.List<java.lang.String> getAgeGroupsList();
  /**
   *
   *
   * <pre>
   * The age groups of the audience. Strongly encouraged to use the standard
   * values: "newborn" (up to 3 months old), "infant" (3–12 months old),
   * "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically
   * teens or older).
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [age_group](https://support.google.com/merchants/answer/6324463).
   * Schema.org property
   * [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and
   * [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
   * </pre>
   *
   * <code>repeated string age_groups = 2;</code>
   *
   * @return The count of ageGroups.
   */
  int getAgeGroupsCount();
  /**
   *
   *
   * <pre>
   * The age groups of the audience. Strongly encouraged to use the standard
   * values: "newborn" (up to 3 months old), "infant" (3–12 months old),
   * "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically
   * teens or older).
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [age_group](https://support.google.com/merchants/answer/6324463).
   * Schema.org property
   * [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and
   * [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
   * </pre>
   *
   * <code>repeated string age_groups = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The ageGroups at the given index.
   */
  java.lang.String getAgeGroups(int index);
  /**
   *
   *
   * <pre>
   * The age groups of the audience. Strongly encouraged to use the standard
   * values: "newborn" (up to 3 months old), "infant" (3–12 months old),
   * "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically
   * teens or older).
   *
   * At most 5 values are allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error
   * is returned.
   *
   * Google Merchant Center property
   * [age_group](https://support.google.com/merchants/answer/6324463).
   * Schema.org property
   * [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and
   * [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
   * </pre>
   *
   * <code>repeated string age_groups = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ageGroups at the given index.
   */
  com.google.protobuf.ByteString getAgeGroupsBytes(int index);
}
