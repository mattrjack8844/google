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
// source: google/cloud/channel/v1/entitlement_changes.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public final class EntitlementChangesProto {
  private EntitlementChangesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_EntitlementChange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_EntitlementChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/channel/v1/entitlement_ch"
          + "anges.proto\022\027google.cloud.channel.v1\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032*google/cloud/channel/v"
          + "1/entitlements.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\276\014\n\021EntitlementChange\022R\n\021s"
          + "uspension_reason\030\t \001(\01625.google.cloud.ch"
          + "annel.v1.Entitlement.SuspensionReasonH\000\022"
          + "\\\n\023cancellation_reason\030\n \001(\0162=.google.cl"
          + "oud.channel.v1.EntitlementChange.Cancell"
          + "ationReasonH\000\022X\n\021activation_reason\030\013 \001(\016"
          + "2;.google.cloud.channel.v1.EntitlementCh"
          + "ange.ActivationReasonH\000\022\035\n\023other_change_"
          + "reason\030d \001(\tH\000\022D\n\013entitlement\030\001 \001(\tB/\340A\002"
          + "\372A)\n\'cloudchannel.googleapis.com/Entitle"
          + "ment\0228\n\005offer\030\002 \001(\tB)\340A\002\372A#\n!cloudchanne"
          + "l.googleapis.com/Offer\022H\n\023provisioned_se"
          + "rvice\030\003 \001(\0132+.google.cloud.channel.v1.Pr"
          + "ovisionedService\022J\n\013change_type\030\004 \001(\01625."
          + "google.cloud.channel.v1.EntitlementChang"
          + "e.ChangeType\022/\n\013create_time\030\005 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022N\n\roperator_type\030\006"
          + " \001(\01627.google.cloud.channel.v1.Entitleme"
          + "ntChange.OperatorType\0226\n\nparameters\030\010 \003("
          + "\0132\".google.cloud.channel.v1.Parameter\022\020\n"
          + "\010operator\030\014 \001(\t\"\327\002\n\nChangeType\022\033\n\027CHANGE"
          + "_TYPE_UNSPECIFIED\020\000\022\013\n\007CREATED\020\001\022\027\n\023PRIC"
          + "E_PLAN_SWITCHED\020\003\022\026\n\022COMMITMENT_CHANGED\020"
          + "\004\022\013\n\007RENEWED\020\005\022\r\n\tSUSPENDED\020\006\022\r\n\tACTIVAT"
          + "ED\020\007\022\r\n\tCANCELLED\020\010\022\017\n\013SKU_CHANGED\020\t\022\033\n\027"
          + "RENEWAL_SETTING_CHANGED\020\n\022\035\n\031PAID_SUBSCR"
          + "IPTION_STARTED\020\013\022\027\n\023LICENSE_CAP_CHANGED\020"
          + "\014\022\036\n\032SUSPENSION_DETAILS_CHANGED\020\r\022\033\n\027TRI"
          + "AL_END_DATE_EXTENDED\020\016\022\021\n\rTRIAL_STARTED\020"
          + "\017\"z\n\014OperatorType\022\035\n\031OPERATOR_TYPE_UNSPE"
          + "CIFIED\020\000\022#\n\037CUSTOMER_SERVICE_REPRESENTAT"
          + "IVE\020\001\022\n\n\006SYSTEM\020\002\022\014\n\010CUSTOMER\020\003\022\014\n\010RESEL"
          + "LER\020\004\"\177\n\022CancellationReason\022#\n\037CANCELLAT"
          + "ION_REASON_UNSPECIFIED\020\000\022\026\n\022SERVICE_TERM"
          + "INATED\020\001\022\026\n\022RELATIONSHIP_ENDED\020\002\022\024\n\020PART"
          + "IAL_TRANSFER\020\003\"\264\001\n\020ActivationReason\022!\n\035A"
          + "CTIVATION_REASON_UNSPECIFIED\020\000\022\037\n\033RESELL"
          + "ER_REVOKED_SUSPENSION\020\001\022!\n\035CUSTOMER_ACCE"
          + "PTED_PENDING_TOS\020\002\022\034\n\030RENEWAL_SETTINGS_C"
          + "HANGED\020\003\022\033\n\027OTHER_ACTIVATION_REASON\020dB\017\n"
          + "\rchange_reasonBo\n\033com.google.cloud.chann"
          + "el.v1B\027EntitlementChangesProtoP\001Z5cloud."
          + "google.com/go/channel/apiv1/channelpb;ch"
          + "annelpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.EntitlementsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_EntitlementChange_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_EntitlementChange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_EntitlementChange_descriptor,
            new java.lang.String[] {
              "SuspensionReason",
              "CancellationReason",
              "ActivationReason",
              "OtherChangeReason",
              "Entitlement",
              "Offer",
              "ProvisionedService",
              "ChangeType",
              "CreateTime",
              "OperatorType",
              "Parameters",
              "Operator",
              "ChangeReason",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.EntitlementsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
