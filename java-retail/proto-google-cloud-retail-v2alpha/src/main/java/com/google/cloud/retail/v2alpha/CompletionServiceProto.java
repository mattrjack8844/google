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
// source: google/cloud/retail/v2alpha/completion_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_RecentSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResultsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResultsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/retail/v2alpha/completion"
          + "_service.proto\022\033google.cloud.retail.v2al"
          + "pha\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032("
          + "google/cloud/retail/v2alpha/common.proto"
          + "\032/google/cloud/retail/v2alpha/import_con"
          + "fig.proto\0320google/cloud/retail/v2alpha/s"
          + "earch_service.proto\032#google/longrunning/"
          + "operations.proto\"\203\002\n\024CompleteQueryReques"
          + "t\0226\n\007catalog\030\001 \001(\tB%\340A\002\372A\037\n\035retail.googl"
          + "eapis.com/Catalog\022\022\n\005query\030\002 \001(\tB\003\340A\002\022\022\n"
          + "\nvisitor_id\030\007 \001(\t\022\026\n\016language_codes\030\003 \003("
          + "\t\022\023\n\013device_type\030\004 \001(\t\022\017\n\007dataset\030\006 \001(\t\022"
          + "\027\n\017max_suggestions\030\005 \001(\005\022$\n\034enable_attri"
          + "bute_suggestions\030\t \001(\010\022\016\n\006entity\030\n \001(\t\"\203"
          + "\007\n\025CompleteQueryResponse\022_\n\022completion_r"
          + "esults\030\001 \003(\0132C.google.cloud.retail.v2alp"
          + "ha.CompleteQueryResponse.CompletionResul"
          + "t\022\031\n\021attribution_token\030\002 \001(\t\022d\n\025recent_s"
          + "earch_results\030\003 \003(\0132E.google.cloud.retai"
          + "l.v2alpha.CompleteQueryResponse.RecentSe"
          + "archResult\022c\n\021attribute_results\030\004 \003(\0132H."
          + "google.cloud.retail.v2alpha.CompleteQuer"
          + "yResponse.AttributeResultsEntry\032\320\002\n\020Comp"
          + "letionResult\022\022\n\nsuggestion\030\001 \001(\t\022g\n\nattr"
          + "ibutes\030\002 \003(\0132S.google.cloud.retail.v2alp"
          + "ha.CompleteQueryResponse.CompletionResul"
          + "t.AttributesEntry\022A\n\006facets\030\003 \003(\01321.goog"
          + "le.cloud.retail.v2alpha.SearchResponse.F"
          + "acet\022\033\n\023total_product_count\030\004 \001(\005\032_\n\017Att"
          + "ributesEntry\022\013\n\003key\030\001 \001(\t\022;\n\005value\030\002 \001(\013"
          + "2,.google.cloud.retail.v2alpha.CustomAtt"
          + "ribute:\0028\001\032+\n\022RecentSearchResult\022\025\n\rrece"
          + "nt_search\030\001 \001(\t\032&\n\017AttributeResult\022\023\n\013su"
          + "ggestions\030\001 \003(\t\032{\n\025AttributeResultsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022Q\n\005value\030\002 \001(\0132B.google.cl"
          + "oud.retail.v2alpha.CompleteQueryResponse"
          + ".AttributeResult:\0028\0012\325\004\n\021CompletionServi"
          + "ce\022\302\001\n\rCompleteQuery\0221.google.cloud.reta"
          + "il.v2alpha.CompleteQueryRequest\0322.google"
          + ".cloud.retail.v2alpha.CompleteQueryRespo"
          + "nse\"J\202\323\344\223\002D\022B/v2alpha/{catalog=projects/"
          + "*/locations/*/catalogs/*}:completeQuery\022"
          + "\257\002\n\024ImportCompletionData\0228.google.cloud."
          + "retail.v2alpha.ImportCompletionDataReque"
          + "st\032\035.google.longrunning.Operation\"\275\001\312Af\n"
          + "8google.cloud.retail.v2alpha.ImportCompl"
          + "etionDataResponse\022*google.cloud.retail.v"
          + "2alpha.ImportMetadata\202\323\344\223\002N\"I/v2alpha/{p"
          + "arent=projects/*/locations/*/catalogs/*}"
          + "/completionData:import:\001*\032I\312A\025retail.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\332\001\n\037com.google.clou"
          + "d.retail.v2alphaB\026CompletionServiceProto"
          + "P\001Z7cloud.google.com/go/retail/apiv2alph"
          + "a/retailpb;retailpb\242\002\006RETAIL\252\002\033Google.Cl"
          + "oud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail"
          + "\\V2alpha\352\002\036Google::Cloud::Retail::V2alph"
          + "ab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "Catalog",
              "Query",
              "VisitorId",
              "LanguageCodes",
              "DeviceType",
              "Dataset",
              "MaxSuggestions",
              "EnableAttributeSuggestions",
              "Entity",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "CompletionResults", "AttributionToken", "RecentSearchResults", "AttributeResults",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_descriptor =
        internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_descriptor,
            new java.lang.String[] {
              "Suggestion", "Attributes", "Facets", "TotalProductCount",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_RecentSearchResult_descriptor =
        internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_RecentSearchResult_descriptor,
            new java.lang.String[] {
              "RecentSearch",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResult_descriptor =
        internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResult_descriptor,
            new java.lang.String[] {
              "Suggestions",
            });
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResultsEntry_descriptor =
        internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResultsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompleteQueryResponse_AttributeResultsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor();
    com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
