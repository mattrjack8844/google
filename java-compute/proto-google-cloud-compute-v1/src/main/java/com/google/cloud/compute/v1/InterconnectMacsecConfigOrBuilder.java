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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InterconnectMacsecConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectMacsecConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey>
      getPreSharedKeysList();
  /**
   *
   *
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey getPreSharedKeys(int index);
  /**
   *
   *
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;
   * </code>
   */
  int getPreSharedKeysCount();
  /**
   *
   *
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKeyOrBuilder>
      getPreSharedKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKeyOrBuilder
      getPreSharedKeysOrBuilder(int index);
}
