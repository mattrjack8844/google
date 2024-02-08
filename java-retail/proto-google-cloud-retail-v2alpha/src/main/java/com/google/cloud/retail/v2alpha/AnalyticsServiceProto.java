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
// source: google/cloud/retail/v2alpha/analytics_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public final class AnalyticsServiceProto {
  private AnalyticsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2alpha/analytics_"
          + "service.proto\022\033google.cloud.retail.v2alp"
          + "ha\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032/g"
          + "oogle/cloud/retail/v2alpha/export_config"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto2\227\003\n\020AnalyticsService\022\267\002\n\026ExportAnaly"
          + "ticsMetrics\022:.google.cloud.retail.v2alph"
          + "a.ExportAnalyticsMetricsRequest\032\035.google"
          + ".longrunning.Operation\"\301\001\312Ah\n:google.clo"
          + "ud.retail.v2alpha.ExportAnalyticsMetrics"
          + "Response\022*google.cloud.retail.v2alpha.Ex"
          + "portMetadata\202\323\344\223\002P\"K/v2alpha/{catalog=pr"
          + "ojects/*/locations/*/catalogs/*}:exportA"
          + "nalyticsMetrics:\001*\032I\312A\025retail.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\331\001\n\037com.google.cloud.retai"
          + "l.v2alphaB\025AnalyticsServiceProtoP\001Z7clou"
          + "d.google.com/go/retail/apiv2alpha/retail"
          + "pb;retailpb\242\002\006RETAIL\252\002\033Google.Cloud.Reta"
          + "il.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha"
          + "\352\002\036Google::Cloud::Retail::V2alphab\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.ExportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ExportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
