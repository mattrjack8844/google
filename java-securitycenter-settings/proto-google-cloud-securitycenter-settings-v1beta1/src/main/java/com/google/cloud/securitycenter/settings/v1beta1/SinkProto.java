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
// source: google/cloud/securitycenter/settings/v1beta1/sink_settings.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.settings.v1beta1;

public final class SinkProto {
  private SinkProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/securitycenter/settings/v"
          + "1beta1/sink_settings.proto\022,google.cloud"
          + ".securitycenter.settings.v1beta1\",\n\014Sink"
          + "Settings\022\034\n\024logging_sink_project\030\001 \001(\tB\241"
          + "\002\n0com.google.cloud.securitycenter.setti"
          + "ngs.v1beta1B\tSinkProtoP\001ZLcloud.google.c"
          + "om/go/securitycenter/settings/apiv1beta1"
          + "/settingspb;settingspb\370\001\001\252\002,Google.Cloud"
          + ".SecurityCenter.Settings.V1Beta1\312\002,Googl"
          + "e\\Cloud\\SecurityCenter\\Settings\\V1beta1\352"
          + "\0020Google::Cloud::SecurityCenter::Setting"
          + "s::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor,
            new java.lang.String[] {
              "LoggingSinkProject",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
