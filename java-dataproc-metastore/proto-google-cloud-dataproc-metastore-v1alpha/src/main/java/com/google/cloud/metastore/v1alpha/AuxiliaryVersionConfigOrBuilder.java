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
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

public interface AuxiliaryVersionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.AuxiliaryVersionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Hive metastore version of the auxiliary service. It must be less
   * than the primary Hive metastore service's version.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The Hive metastore version of the auxiliary service. It must be less
   * than the primary Hive metastore service's version.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * auxiliary Hive metastore (configured in `hive-site.xml`) in addition to
   * the primary version's overrides. If keys are present in both the auxiliary
   * version's overrides and the primary version's overrides, the value from
   * the auxiliary version's overrides takes precedence.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  int getConfigOverridesCount();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * auxiliary Hive metastore (configured in `hive-site.xml`) in addition to
   * the primary version's overrides. If keys are present in both the auxiliary
   * version's overrides and the primary version's overrides, the value from
   * the auxiliary version's overrides takes precedence.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  boolean containsConfigOverrides(java.lang.String key);
  /** Use {@link #getConfigOverridesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getConfigOverrides();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * auxiliary Hive metastore (configured in `hive-site.xml`) in addition to
   * the primary version's overrides. If keys are present in both the auxiliary
   * version's overrides and the primary version's overrides, the value from
   * the auxiliary version's overrides takes precedence.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getConfigOverridesMap();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * auxiliary Hive metastore (configured in `hive-site.xml`) in addition to
   * the primary version's overrides. If keys are present in both the auxiliary
   * version's overrides and the primary version's overrides, the value from
   * the auxiliary version's overrides takes precedence.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  /* nullable */
  java.lang.String getConfigOverridesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * auxiliary Hive metastore (configured in `hive-site.xml`) in addition to
   * the primary version's overrides. If keys are present in both the auxiliary
   * version's overrides and the primary version's overrides, the value from
   * the auxiliary version's overrides takes precedence.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  java.lang.String getConfigOverridesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The network configuration contains the endpoint URI(s) of the
   * auxiliary Hive metastore service.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.NetworkConfig network_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   *
   *
   * <pre>
   * Output only. The network configuration contains the endpoint URI(s) of the
   * auxiliary Hive metastore service.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.NetworkConfig network_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The networkConfig.
   */
  com.google.cloud.metastore.v1alpha.NetworkConfig getNetworkConfig();
  /**
   *
   *
   * <pre>
   * Output only. The network configuration contains the endpoint URI(s) of the
   * auxiliary Hive metastore service.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.NetworkConfig network_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1alpha.NetworkConfigOrBuilder getNetworkConfigOrBuilder();
}
