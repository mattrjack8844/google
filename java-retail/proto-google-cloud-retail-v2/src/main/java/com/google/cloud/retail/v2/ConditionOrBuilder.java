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

public interface ConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.QueryTerm query_terms = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2.Condition.QueryTerm> getQueryTermsList();
  /**
   *
   *
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.QueryTerm query_terms = 1;</code>
   */
  com.google.cloud.retail.v2.Condition.QueryTerm getQueryTerms(int index);
  /**
   *
   *
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.QueryTerm query_terms = 1;</code>
   */
  int getQueryTermsCount();
  /**
   *
   *
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.QueryTerm query_terms = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2.Condition.QueryTermOrBuilder>
      getQueryTermsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.QueryTerm query_terms = 1;</code>
   */
  com.google.cloud.retail.v2.Condition.QueryTermOrBuilder getQueryTermsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.TimeRange active_time_range = 3;</code>
   */
  java.util.List<com.google.cloud.retail.v2.Condition.TimeRange> getActiveTimeRangeList();
  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.TimeRange active_time_range = 3;</code>
   */
  com.google.cloud.retail.v2.Condition.TimeRange getActiveTimeRange(int index);
  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.TimeRange active_time_range = 3;</code>
   */
  int getActiveTimeRangeCount();
  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.TimeRange active_time_range = 3;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2.Condition.TimeRangeOrBuilder>
      getActiveTimeRangeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.Condition.TimeRange active_time_range = 3;</code>
   */
  com.google.cloud.retail.v2.Condition.TimeRangeOrBuilder getActiveTimeRangeOrBuilder(int index);
}
