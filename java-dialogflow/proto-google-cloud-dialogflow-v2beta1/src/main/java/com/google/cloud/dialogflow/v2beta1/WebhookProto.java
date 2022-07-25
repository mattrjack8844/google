/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

public final class WebhookProto {
  private WebhookProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/webhoo"
          + "k.proto\022\037google.cloud.dialogflow.v2beta1"
          + "\032-google/cloud/dialogflow/v2beta1/contex"
          + "t.proto\032,google/cloud/dialogflow/v2beta1"
          + "/intent.proto\032-google/cloud/dialogflow/v"
          + "2beta1/session.proto\0329google/cloud/dialo"
          + "gflow/v2beta1/session_entity_type.proto\032"
          + "\034google/protobuf/struct.proto\"\261\002\n\016Webhoo"
          + "kRequest\022\017\n\007session\030\004 \001(\t\022\023\n\013response_id"
          + "\030\001 \001(\t\022B\n\014query_result\030\002 \001(\0132,.google.cl"
          + "oud.dialogflow.v2beta1.QueryResult\022O\n\031al"
          + "ternative_query_results\030\005 \003(\0132,.google.c"
          + "loud.dialogflow.v2beta1.QueryResult\022d\n\036o"
          + "riginal_detect_intent_request\030\003 \001(\0132<.go"
          + "ogle.cloud.dialogflow.v2beta1.OriginalDe"
          + "tectIntentRequest\"\311\003\n\017WebhookResponse\022\030\n"
          + "\020fulfillment_text\030\001 \001(\t\022M\n\024fulfillment_m"
          + "essages\030\002 \003(\0132/.google.cloud.dialogflow."
          + "v2beta1.Intent.Message\022\016\n\006source\030\003 \001(\t\022("
          + "\n\007payload\030\004 \001(\0132\027.google.protobuf.Struct"
          + "\022A\n\017output_contexts\030\005 \003(\0132(.google.cloud"
          + ".dialogflow.v2beta1.Context\022I\n\024followup_"
          + "event_input\030\006 \001(\0132+.google.cloud.dialogf"
          + "low.v2beta1.EventInput\022\032\n\022live_agent_han"
          + "doff\030\007 \001(\010\022\027\n\017end_interaction\030\010 \001(\010\022P\n\024s"
          + "ession_entity_types\030\n \003(\01322.google.cloud"
          + ".dialogflow.v2beta1.SessionEntityType\"h\n"
          + "\033OriginalDetectIntentRequest\022\016\n\006source\030\001"
          + " \001(\t\022\017\n\007version\030\002 \001(\t\022(\n\007payload\030\003 \001(\0132\027"
          + ".google.protobuf.StructB\252\001\n#com.google.c"
          + "loud.dialogflow.v2beta1B\014WebhookProtoP\001Z"
          + "Igoogle.golang.org/genproto/googleapis/c"
          + "loud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002"
          + "DF\252\002\037Google.Cloud.Dialogflow.V2beta1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "ResponseId",
              "QueryResult",
              "AlternativeQueryResults",
              "OriginalDetectIntentRequest",
            });
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor,
            new java.lang.String[] {
              "FulfillmentText",
              "FulfillmentMessages",
              "Source",
              "Payload",
              "OutputContexts",
              "FollowupEventInput",
              "LiveAgentHandoff",
              "EndInteraction",
              "SessionEntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Source", "Version", "Payload",
            });
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
