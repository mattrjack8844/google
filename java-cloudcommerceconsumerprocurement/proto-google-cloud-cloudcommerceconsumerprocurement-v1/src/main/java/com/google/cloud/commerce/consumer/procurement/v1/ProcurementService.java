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
// source: google/cloud/commerce/consumer/procurement/v1/procurement_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.commerce.consumer.procurement.v1;

public final class ProcurementService {
  private ProcurementService() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1_GetOrderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/commerce/consumer/procure"
          + "ment/v1/procurement_service.proto\022-googl"
          + "e.cloud.commerce.consumer.procurement.v1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\0329goo"
          + "gle/cloud/commerce/consumer/procurement/"
          + "v1/order.proto\032#google/longrunning/opera"
          + "tions.proto\"\345\001\n\021PlaceOrderRequest\022B\n\006par"
          + "ent\030\001 \001(\tB2\340A\002\372A,\n*cloudbilling.googleap"
          + "is.com/BillingAccount\022\031\n\014display_name\030\006 "
          + "\001(\tB\003\340A\002\022X\n\016line_item_info\030\n \003(\0132;.googl"
          + "e.cloud.commerce.consumer.procurement.v1"
          + ".LineItemInfoB\003\340A\001\022\027\n\nrequest_id\030\007 \001(\tB\003"
          + "\340A\001\"\024\n\022PlaceOrderMetadata\"$\n\017GetOrderReq"
          + "uest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"_\n\021ListOrdersReq"
          + "uest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\021\n\tpage_size\030\002"
          + " \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t"
          + "\"s\n\022ListOrdersResponse\022D\n\006orders\030\001 \003(\01324"
          + ".google.cloud.commerce.consumer.procurem"
          + "ent.v1.Order\022\027\n\017next_page_token\030\002 \001(\t2\314\005"
          + "\n\032ConsumerProcurementService\022\303\001\n\nPlaceOr"
          + "der\022@.google.cloud.commerce.consumer.pro"
          + "curement.v1.PlaceOrderRequest\032\035.google.l"
          + "ongrunning.Operation\"T\312A\033\n\005Order\022\022PlaceO"
          + "rderMetadata\202\323\344\223\0020\"+/v1/{parent=billingA"
          + "ccounts/*}/orders:place:\001*\022\266\001\n\010GetOrder\022"
          + ">.google.cloud.commerce.consumer.procure"
          + "ment.v1.GetOrderRequest\0324.google.cloud.c"
          + "ommerce.consumer.procurement.v1.Order\"4\332"
          + "A\004name\202\323\344\223\002\'\022%/v1/{name=billingAccounts/"
          + "*/orders/*}\022\311\001\n\nListOrders\022@.google.clou"
          + "d.commerce.consumer.procurement.v1.ListO"
          + "rdersRequest\032A.google.cloud.commerce.con"
          + "sumer.procurement.v1.ListOrdersResponse\""
          + "6\332A\006parent\202\323\344\223\002\'\022%/v1/{parent=billingAcc"
          + "ounts/*}/orders\032c\312A/cloudcommerceconsume"
          + "rprocurement.googleapis.com\322A.https://ww"
          + "w.googleapis.com/auth/cloud-platformB\237\002\n"
          + "1com.google.cloud.commerce.consumer.proc"
          + "urement.v1P\001ZScloud.google.com/go/commer"
          + "ce/consumer/procurement/apiv1/procuremen"
          + "tpb;procurementpb\252\002-Google.Cloud.Commerc"
          + "e.Consumer.Procurement.V1\312\002-Google\\Cloud"
          + "\\Commerce\\Consumer\\Procurement\\V1\352\0022Goog"
          + "le::Cloud::Commerce::Consumer::Procureme"
          + "nt::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.commerce.consumer.procurement.v1.OrderOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DisplayName", "LineItemInfo", "RequestId",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1_PlaceOrderMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_commerce_consumer_procurement_v1_GetOrderRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_commerce_consumer_procurement_v1_GetOrderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1_GetOrderRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1_ListOrdersResponse_descriptor,
            new java.lang.String[] {
              "Orders", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.commerce.consumer.procurement.v1.OrderOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
