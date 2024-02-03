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
// source: google/api/serviceusage/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.serviceusage.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1_ServiceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1_ServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/api/serviceusage/v1/resources.p"
          + "roto\022\032google.api.serviceusage.v1\032\025google"
          + "/api/auth.proto\032\036google/api/documentatio"
          + "n.proto\032\031google/api/endpoint.proto\032#goog"
          + "le/api/monitored_resource.proto\032\033google/"
          + "api/monitoring.proto\032\026google/api/quota.p"
          + "roto\032\031google/api/resource.proto\032\026google/"
          + "api/usage.proto\032\031google/protobuf/api.pro"
          + "to\"\275\002\n\007Service\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030\005"
          + " \001(\t\0229\n\006config\030\002 \001(\0132).google.api.servic"
          + "eusage.v1.ServiceConfig\0220\n\005state\030\004 \001(\0162!"
          + ".google.api.serviceusage.v1.State:\246\001\352A\242\001"
          + "\n#serviceusage.googleapis.com/Service\022%p"
          + "rojects/{project}/services/{service}\022#fo"
          + "lders/{folder}/services/{service}\022/organ"
          + "izations/{organization}/services/{servic"
          + "e}\"\225\003\n\rServiceConfig\022\014\n\004name\030\001 \001(\t\022\r\n\005ti"
          + "tle\030\002 \001(\t\022\"\n\004apis\030\003 \003(\0132\024.google.protobu"
          + "f.Api\0220\n\rdocumentation\030\006 \001(\0132\031.google.ap"
          + "i.Documentation\022 \n\005quota\030\n \001(\0132\021.google."
          + "api.Quota\0222\n\016authentication\030\013 \001(\0132\032.goog"
          + "le.api.Authentication\022 \n\005usage\030\017 \001(\0132\021.g"
          + "oogle.api.Usage\022\'\n\tendpoints\030\022 \003(\0132\024.goo"
          + "gle.api.Endpoint\022D\n\023monitored_resources\030"
          + "\031 \003(\0132\'.google.api.MonitoredResourceDesc"
          + "riptor\022*\n\nmonitoring\030\034 \001(\0132\026.google.api."
          + "Monitoring\"+\n\021OperationMetadata\022\026\n\016resou"
          + "rce_names\030\002 \003(\t*9\n\005State\022\025\n\021STATE_UNSPEC"
          + "IFIED\020\000\022\014\n\010DISABLED\020\001\022\013\n\007ENABLED\020\002B\330\001\n\036c"
          + "om.google.api.serviceusage.v1B\016Resources"
          + "ProtoP\001ZDcloud.google.com/go/serviceusag"
          + "e/apiv1/serviceusagepb;serviceusagepb\252\002\034"
          + "Google.Cloud.ServiceUsage.V1\312\002\034Google\\Cl"
          + "oud\\ServiceUsage\\V1\352\002\037Google::Cloud::Ser"
          + "viceUsage::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AuthProto.getDescriptor(),
              com.google.api.DocumentationProto.getDescriptor(),
              com.google.api.EndpointProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.MonitoringProto.getDescriptor(),
              com.google.api.QuotaProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.UsageProto.getDescriptor(),
              com.google.protobuf.ApiProto.getDescriptor(),
            });
    internal_static_google_api_serviceusage_v1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_serviceusage_v1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1_Service_descriptor,
            new java.lang.String[] {
              "Name", "Parent", "Config", "State",
            });
    internal_static_google_api_serviceusage_v1_ServiceConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_serviceusage_v1_ServiceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1_ServiceConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "Apis",
              "Documentation",
              "Quota",
              "Authentication",
              "Usage",
              "Endpoints",
              "MonitoredResources",
              "Monitoring",
            });
    internal_static_google_api_serviceusage_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_serviceusage_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "ResourceNames",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AuthProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.EndpointProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.QuotaProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
