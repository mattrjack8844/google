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
// source: google/cloud/discoveryengine/v1beta/conversational_search_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public final class ConversationalSearchServiceProto {
  private ConversationalSearchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/discoveryengine/v1beta/co"
          + "nversational_search_service.proto\022#googl"
          + "e.cloud.discoveryengine.v1beta\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\0326google/cloud/"
          + "discoveryengine/v1beta/conversation.prot"
          + "o\0328google/cloud/discoveryengine/v1beta/s"
          + "earch_service.proto\032\033google/protobuf/emp"
          + "ty.proto\032 google/protobuf/field_mask.pro"
          + "to\"\261\005\n\033ConverseConversationRequest\022A\n\004na"
          + "me\030\001 \001(\tB3\340A\002\372A-\n+discoveryengine.google"
          + "apis.com/Conversation\022B\n\005query\030\002 \001(\0132..g"
          + "oogle.cloud.discoveryengine.v1beta.TextI"
          + "nputB\003\340A\002\022I\n\016serving_config\030\003 \001(\tB1\372A.\n,"
          + "discoveryengine.googleapis.com/ServingCo"
          + "nfig\022G\n\014conversation\030\005 \001(\01321.google.clou"
          + "d.discoveryengine.v1beta.Conversation\022\023\n"
          + "\013safe_search\030\006 \001(\010\022e\n\013user_labels\030\007 \003(\0132"
          + "P.google.cloud.discoveryengine.v1beta.Co"
          + "nverseConversationRequest.UserLabelsEntr"
          + "y\022f\n\014summary_spec\030\010 \001(\0132P.google.cloud.d"
          + "iscoveryengine.v1beta.SearchRequest.Cont"
          + "entSearchSpec.SummarySpec\022\016\n\006filter\030\t \001("
          + "\t\022P\n\nboost_spec\030\n \001(\0132<.google.cloud.dis"
          + "coveryengine.v1beta.SearchRequest.BoostS"
          + "pec\0321\n\017UserLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\"\227\002\n\034ConverseConversationR"
          + "esponse\0229\n\005reply\030\001 \001(\0132*.google.cloud.di"
          + "scoveryengine.v1beta.Reply\022G\n\014conversati"
          + "on\030\002 \001(\01321.google.cloud.discoveryengine."
          + "v1beta.Conversation\022\031\n\021related_questions"
          + "\030\006 \003(\t\022X\n\016search_results\030\003 \003(\0132@.google."
          + "cloud.discoveryengine.v1beta.SearchRespo"
          + "nse.SearchResult\"\253\001\n\031CreateConversationR"
          + "equest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(discover"
          + "yengine.googleapis.com/DataStore\022L\n\014conv"
          + "ersation\030\002 \001(\01321.google.cloud.discoverye"
          + "ngine.v1beta.ConversationB\003\340A\002\"\232\001\n\031Updat"
          + "eConversationRequest\022L\n\014conversation\030\001 \001"
          + "(\01321.google.cloud.discoveryengine.v1beta"
          + ".ConversationB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMask\"^\n\031DeleteCon"
          + "versationRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+"
          + "discoveryengine.googleapis.com/Conversat"
          + "ion\"[\n\026GetConversationRequest\022A\n\004name\030\001 "
          + "\001(\tB3\340A\002\372A-\n+discoveryengine.googleapis."
          + "com/Conversation\"\245\001\n\030ListConversationsRe"
          + "quest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(discovery"
          + "engine.googleapis.com/DataStore\022\021\n\tpage_"
          + "size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter"
          + "\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"~\n\031ListConversa"
          + "tionsResponse\022H\n\rconversations\030\001 \003(\01321.g"
          + "oogle.cloud.discoveryengine.v1beta.Conve"
          + "rsation\022\027\n\017next_page_token\030\002 \001(\t2\321\024\n\033Con"
          + "versationalSearchService\022\277\003\n\024ConverseCon"
          + "versation\022@.google.cloud.discoveryengine"
          + ".v1beta.ConverseConversationRequest\032A.go"
          + "ogle.cloud.discoveryengine.v1beta.Conver"
          + "seConversationResponse\"\241\002\332A\nname,query\202\323"
          + "\344\223\002\215\002\"K/v1beta/{name=projects/*/location"
          + "s/*/dataStores/*/conversations/*}:conver"
          + "se:\001*Z^\"Y/v1beta/{name=projects/*/locati"
          + "ons/*/collections/*/dataStores/*/convers"
          + "ations/*}:converse:\001*Z[\"V/v1beta/{name=p"
          + "rojects/*/locations/*/collections/*/engi"
          + "nes/*/conversations/*}:converse:\001*\022\272\003\n\022C"
          + "reateConversation\022>.google.cloud.discove"
          + "ryengine.v1beta.CreateConversationReques"
          + "t\0321.google.cloud.discoveryengine.v1beta."
          + "Conversation\"\260\002\332A\023parent,conversation\202\323\344"
          + "\223\002\223\002\"B/v1beta/{parent=projects/*/locatio"
          + "ns/*/dataStores/*}/conversations:\014conver"
          + "sationZ`\"P/v1beta/{parent=projects/*/loc"
          + "ations/*/collections/*/dataStores/*}/con"
          + "versations:\014conversationZ]\"M/v1beta/{par"
          + "ent=projects/*/locations/*/collections/*"
          + "/engines/*}/conversations:\014conversation\022"
          + "\346\002\n\022DeleteConversation\022>.google.cloud.di"
          + "scoveryengine.v1beta.DeleteConversationR"
          + "equest\032\026.google.protobuf.Empty\"\367\001\332A\004name"
          + "\202\323\344\223\002\351\001*B/v1beta/{name=projects/*/locati"
          + "ons/*/dataStores/*/conversations/*}ZR*P/"
          + "v1beta/{name=projects/*/locations/*/coll"
          + "ections/*/dataStores/*/conversations/*}Z"
          + "O*M/v1beta/{name=projects/*/locations/*/"
          + "collections/*/engines/*/conversations/*}"
          + "\022\346\003\n\022UpdateConversation\022>.google.cloud.d"
          + "iscoveryengine.v1beta.UpdateConversation"
          + "Request\0321.google.cloud.discoveryengine.v"
          + "1beta.Conversation\"\334\002\332A\030conversation,upd"
          + "ate_mask\202\323\344\223\002\272\0022O/v1beta/{conversation.n"
          + "ame=projects/*/locations/*/dataStores/*/"
          + "conversations/*}:\014conversationZm2]/v1bet"
          + "a/{conversation.name=projects/*/location"
          + "s/*/collections/*/dataStores/*/conversat"
          + "ions/*}:\014conversationZj2Z/v1beta/{conver"
          + "sation.name=projects/*/locations/*/colle"
          + "ctions/*/engines/*/conversations/*}:\014con"
          + "versation\022\373\002\n\017GetConversation\022;.google.c"
          + "loud.discoveryengine.v1beta.GetConversat"
          + "ionRequest\0321.google.cloud.discoveryengin"
          + "e.v1beta.Conversation\"\367\001\332A\004name\202\323\344\223\002\351\001\022B"
          + "/v1beta/{name=projects/*/locations/*/dat"
          + "aStores/*/conversations/*}ZR\022P/v1beta/{n"
          + "ame=projects/*/locations/*/collections/*"
          + "/dataStores/*/conversations/*}ZO\022M/v1bet"
          + "a/{name=projects/*/locations/*/collectio"
          + "ns/*/engines/*/conversations/*}\022\216\003\n\021List"
          + "Conversations\022=.google.cloud.discoveryen"
          + "gine.v1beta.ListConversationsRequest\032>.g"
          + "oogle.cloud.discoveryengine.v1beta.ListC"
          + "onversationsResponse\"\371\001\332A\006parent\202\323\344\223\002\351\001\022"
          + "B/v1beta/{parent=projects/*/locations/*/"
          + "dataStores/*}/conversationsZR\022P/v1beta/{"
          + "parent=projects/*/locations/*/collection"
          + "s/*/dataStores/*}/conversationsZO\022M/v1be"
          + "ta/{parent=projects/*/locations/*/collec"
          + "tions/*/engines/*}/conversations\032R\312A\036dis"
          + "coveryengine.googleapis.com\322A.https://ww"
          + "w.googleapis.com/auth/cloud-platformB\247\002\n"
          + "\'com.google.cloud.discoveryengine.v1beta"
          + "B ConversationalSearchServiceProtoP\001ZQcl"
          + "oud.google.com/go/discoveryengine/apiv1b"
          + "eta/discoveryenginepb;discoveryenginepb\242"
          + "\002\017DISCOVERYENGINE\252\002#Google.Cloud.Discove"
          + "ryEngine.V1Beta\312\002#Google\\Cloud\\Discovery"
          + "Engine\\V1beta\352\002&Google::Cloud::Discovery"
          + "Engine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ConversationProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Query",
              "ServingConfig",
              "Conversation",
              "SafeSearch",
              "UserLabels",
              "SummarySpec",
              "Filter",
              "BoostSpec",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor,
            new java.lang.String[] {
              "Reply", "Conversation", "RelatedQuestions", "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Conversation",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor,
            new java.lang.String[] {
              "Conversation", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor,
            new java.lang.String[] {
              "Conversations", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ConversationProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
