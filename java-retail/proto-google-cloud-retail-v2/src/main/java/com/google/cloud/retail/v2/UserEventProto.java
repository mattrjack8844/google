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
// source: google/cloud/retail/v2/user_event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public final class UserEventProto {
  private UserEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ProductDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CompletionDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CompletionDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PurchaseTransaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/retail/v2/user_event.prot"
          + "o\022\026google.cloud.retail.v2\032\037google/api/fi"
          + "eld_behavior.proto\032#google/cloud/retail/"
          + "v2/common.proto\032$google/cloud/retail/v2/"
          + "product.proto\032\037google/protobuf/timestamp"
          + ".proto\032\036google/protobuf/wrappers.proto\"\227"
          + "\006\n\tUserEvent\022\027\n\nevent_type\030\001 \001(\tB\003\340A\002\022\027\n"
          + "\nvisitor_id\030\002 \001(\tB\003\340A\002\022\022\n\nsession_id\030\025 \001"
          + "(\t\022.\n\nevent_time\030\003 \001(\0132\032.google.protobuf"
          + ".Timestamp\022\026\n\016experiment_ids\030\004 \003(\t\022\031\n\021at"
          + "tribution_token\030\005 \001(\t\022>\n\017product_details"
          + "\030\006 \003(\0132%.google.cloud.retail.v2.ProductD"
          + "etail\022C\n\021completion_detail\030\026 \001(\0132(.googl"
          + "e.cloud.retail.v2.CompletionDetail\022E\n\nat"
          + "tributes\030\007 \003(\01321.google.cloud.retail.v2."
          + "UserEvent.AttributesEntry\022\017\n\007cart_id\030\010 \001"
          + "(\t\022I\n\024purchase_transaction\030\t \001(\0132+.googl"
          + "e.cloud.retail.v2.PurchaseTransaction\022\024\n"
          + "\014search_query\030\n \001(\t\022\016\n\006filter\030\020 \001(\t\022\020\n\010o"
          + "rder_by\030\021 \001(\t\022\016\n\006offset\030\022 \001(\005\022\027\n\017page_ca"
          + "tegories\030\013 \003(\t\0223\n\tuser_info\030\014 \001(\0132 .goog"
          + "le.cloud.retail.v2.UserInfo\022\013\n\003uri\030\r \001(\t"
          + "\022\024\n\014referrer_uri\030\016 \001(\t\022\024\n\014page_view_id\030\017"
          + " \001(\t\022\016\n\006entity\030\027 \001(\t\032Z\n\017AttributesEntry\022"
          + "\013\n\003key\030\001 \001(\t\0226\n\005value\030\002 \001(\0132\'.google.clo"
          + "ud.retail.v2.CustomAttribute:\0028\001\"u\n\rProd"
          + "uctDetail\0225\n\007product\030\001 \001(\0132\037.google.clou"
          + "d.retail.v2.ProductB\003\340A\002\022-\n\010quantity\030\002 \001"
          + "(\0132\033.google.protobuf.Int32Value\"p\n\020Compl"
          + "etionDetail\022$\n\034completion_attribution_to"
          + "ken\030\001 \001(\t\022\033\n\023selected_suggestion\030\002 \001(\t\022\031"
          + "\n\021selected_position\030\003 \001(\005\"n\n\023PurchaseTra"
          + "nsaction\022\n\n\002id\030\001 \001(\t\022\024\n\007revenue\030\002 \001(\002B\003\340"
          + "A\002\022\013\n\003tax\030\003 \001(\002\022\014\n\004cost\030\004 \001(\002\022\032\n\rcurrenc"
          + "y_code\030\005 \001(\tB\003\340A\002B\271\001\n\032com.google.cloud.r"
          + "etail.v2B\016UserEventProtoP\001Z2cloud.google"
          + ".com/go/retail/apiv2/retailpb;retailpb\242\002"
          + "\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Googl"
          + "e\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retai"
          + "l::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.ProductProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_UserEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_UserEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEvent_descriptor,
            new java.lang.String[] {
              "EventType",
              "VisitorId",
              "SessionId",
              "EventTime",
              "ExperimentIds",
              "AttributionToken",
              "ProductDetails",
              "CompletionDetail",
              "Attributes",
              "CartId",
              "PurchaseTransaction",
              "SearchQuery",
              "Filter",
              "OrderBy",
              "Offset",
              "PageCategories",
              "UserInfo",
              "Uri",
              "ReferrerUri",
              "PageViewId",
              "Entity",
            });
    internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2_UserEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_ProductDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_ProductDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ProductDetail_descriptor,
            new java.lang.String[] {
              "Product", "Quantity",
            });
    internal_static_google_cloud_retail_v2_CompletionDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_CompletionDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CompletionDetail_descriptor,
            new java.lang.String[] {
              "CompletionAttributionToken", "SelectedSuggestion", "SelectedPosition",
            });
    internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_PurchaseTransaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor,
            new java.lang.String[] {
              "Id", "Revenue", "Tax", "Cost", "CurrencyCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.ProductProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
