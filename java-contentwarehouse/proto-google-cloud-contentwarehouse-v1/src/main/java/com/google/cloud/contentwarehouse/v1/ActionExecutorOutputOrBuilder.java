/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface ActionExecutorOutputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.ActionExecutorOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.RuleActionsPair> getRuleActionsPairsList();
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleActionsPair getRuleActionsPairs(int index);
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  int getRuleActionsPairsCount();
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder>
      getRuleActionsPairsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of rule and corresponding actions result.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.RuleActionsPair rule_actions_pairs = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder getRuleActionsPairsOrBuilder(
      int index);
}
