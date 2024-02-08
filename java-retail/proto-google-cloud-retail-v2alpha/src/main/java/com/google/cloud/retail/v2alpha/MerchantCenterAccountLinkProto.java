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
// source: google/cloud/retail/v2alpha/merchant_center_account_link.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public final class MerchantCenterAccountLinkProto {
  private MerchantCenterAccountLinkProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_MerchantCenterFeedFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_MerchantCenterFeedFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/retail/v2alpha/merchant_c"
          + "enter_account_link.proto\022\033google.cloud.r"
          + "etail.v2alpha\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\037googl"
          + "e/protobuf/timestamp.proto\"\306\005\n\031MerchantC"
          + "enterAccountLink\022\024\n\004name\030\001 \001(\tB\006\340A\005\340A\003\022\022"
          + "\n\002id\030\010 \001(\tB\006\340A\005\340A\003\022\'\n\032merchant_center_ac"
          + "count_id\030\002 \001(\003B\003\340A\002\022\026\n\tbranch_id\030\003 \001(\tB\003"
          + "\340A\002\022\022\n\nfeed_label\030\004 \001(\t\022\025\n\rlanguage_code"
          + "\030\005 \001(\t\022e\n\014feed_filters\030\006 \003(\0132O.google.cl"
          + "oud.retail.v2alpha.MerchantCenterAccount"
          + "Link.MerchantCenterFeedFilter\022P\n\005state\030\007"
          + " \001(\0162<.google.cloud.retail.v2alpha.Merch"
          + "antCenterAccountLink.StateB\003\340A\003\022\027\n\nproje"
          + "ct_id\030\t \001(\tB\003\340A\003\032N\n\030MerchantCenterFeedFi"
          + "lter\022\027\n\017primary_feed_id\030\001 \001(\003\022\031\n\021primary"
          + "_feed_name\030\002 \001(\t\"C\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\013\n\007PENDING\020\001\022\n\n\006ACTIVE\020\002\022\n\n\006FAI"
          + "LED\020\003:\253\001\352A\247\001\n/retail.googleapis.com/Merc"
          + "hantCenterAccountLink\022tprojects/{project"
          + "}/locations/{location}/catalogs/{catalog"
          + "}/merchantCenterAccountLinks/{merchant_c"
          + "enter_account_link}\"\213\001\n\'CreateMerchantCe"
          + "nterAccountLinkMetadata\022/\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.Timestamp\022/\n\013upda"
          + "te_time\030\002 \001(\0132\032.google.protobuf.Timestam"
          + "pB\342\001\n\037com.google.cloud.retail.v2alphaB\036M"
          + "erchantCenterAccountLinkProtoP\001Z7cloud.g"
          + "oogle.com/go/retail/apiv2alpha/retailpb;"
          + "retailpb\242\002\006RETAIL\252\002\033Google.Cloud.Retail."
          + "V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036"
          + "Google::Cloud::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "MerchantCenterAccountId",
              "BranchId",
              "FeedLabel",
              "LanguageCode",
              "FeedFilters",
              "State",
              "ProjectId",
            });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_MerchantCenterFeedFilter_descriptor =
        internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_MerchantCenterFeedFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_MerchantCenterAccountLink_MerchantCenterFeedFilter_descriptor,
            new java.lang.String[] {
              "PrimaryFeedId", "PrimaryFeedName",
            });
    internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
