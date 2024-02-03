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
// source: google/cloud/retail/v2beta/completion_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2beta/completion_"
          + "service.proto\022\032google.cloud.retail.v2bet"
          + "a\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032\'go"
          + "ogle/cloud/retail/v2beta/common.proto\032.g"
          + "oogle/cloud/retail/v2beta/import_config."
          + "proto\032#google/longrunning/operations.pro"
          + "to\"\337\001\n\024CompleteQueryRequest\0227\n\007catalog\030\001"
          + " \001(\tB&\342A\001\002\372A\037\n\035retail.googleapis.com/Cat"
          + "alog\022\023\n\005query\030\002 \001(\tB\004\342A\001\002\022\022\n\nvisitor_id\030"
          + "\007 \001(\t\022\026\n\016language_codes\030\003 \003(\t\022\023\n\013device_"
          + "type\030\004 \001(\t\022\017\n\007dataset\030\006 \001(\t\022\027\n\017max_sugge"
          + "stions\030\005 \001(\005\022\016\n\006entity\030\n \001(\t\"\225\004\n\025Complet"
          + "eQueryResponse\022^\n\022completion_results\030\001 \003"
          + "(\0132B.google.cloud.retail.v2beta.Complete"
          + "QueryResponse.CompletionResult\022\031\n\021attrib"
          + "ution_token\030\002 \001(\t\022c\n\025recent_search_resul"
          + "ts\030\003 \003(\0132D.google.cloud.retail.v2beta.Co"
          + "mpleteQueryResponse.RecentSearchResult\032\356"
          + "\001\n\020CompletionResult\022\022\n\nsuggestion\030\001 \001(\t\022"
          + "f\n\nattributes\030\002 \003(\0132R.google.cloud.retai"
          + "l.v2beta.CompleteQueryResponse.Completio"
          + "nResult.AttributesEntry\032^\n\017AttributesEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google."
          + "cloud.retail.v2beta.CustomAttribute:\0028\001\032"
          + "+\n\022RecentSearchResult\022\025\n\rrecent_search\030\001"
          + " \001(\t2\316\004\n\021CompletionService\022\277\001\n\rCompleteQ"
          + "uery\0220.google.cloud.retail.v2beta.Comple"
          + "teQueryRequest\0321.google.cloud.retail.v2b"
          + "eta.CompleteQueryResponse\"I\202\323\344\223\002C\022A/v2be"
          + "ta/{catalog=projects/*/locations/*/catal"
          + "ogs/*}:completeQuery\022\253\002\n\024ImportCompletio"
          + "nData\0227.google.cloud.retail.v2beta.Impor"
          + "tCompletionDataRequest\032\035.google.longrunn"
          + "ing.Operation\"\272\001\312Ad\n7google.cloud.retail"
          + ".v2beta.ImportCompletionDataResponse\022)go"
          + "ogle.cloud.retail.v2beta.ImportMetadata\202"
          + "\323\344\223\002M\"H/v2beta/{parent=projects/*/locati"
          + "ons/*/catalogs/*}/completionData:import:"
          + "\001*\032I\312A\025retail.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\325\001"
          + "\n\036com.google.cloud.retail.v2betaB\026Comple"
          + "tionServiceProtoP\001Z6cloud.google.com/go/"
          + "retail/apiv2beta/retailpb;retailpb\242\002\006RET"
          + "AIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Googl"
          + "e\\Cloud\\Retail\\V2beta\352\002\035Google::Cloud::R"
          + "etail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "Catalog",
              "Query",
              "VisitorId",
              "LanguageCodes",
              "DeviceType",
              "Dataset",
              "MaxSuggestions",
              "Entity",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "CompletionResults", "AttributionToken", "RecentSearchResults",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor,
            new java.lang.String[] {
              "Suggestion", "Attributes",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor,
            new java.lang.String[] {
              "RecentSearch",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
