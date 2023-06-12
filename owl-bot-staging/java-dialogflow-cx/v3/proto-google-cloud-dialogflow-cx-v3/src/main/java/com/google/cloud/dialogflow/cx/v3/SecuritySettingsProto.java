// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public final class SecuritySettingsProto {
  private SecuritySettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_AudioExportSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_AudioExportSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3/security" +
      "_settings.proto\022\035google.cloud.dialogflow" +
      ".cx.v3\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\033google/protobuf/empty.proto\032 google/p" +
      "rotobuf/field_mask.proto\"_\n\032GetSecurityS" +
      "ettingsRequest\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*d" +
      "ialogflow.googleapis.com/SecuritySetting" +
      "s\"\250\001\n\035UpdateSecuritySettingsRequest\022P\n\021s" +
      "ecurity_settings\030\001 \001(\0132/.google.cloud.di" +
      "alogflow.cx.v3.SecuritySettingsB\004\342A\001\002\0225\n" +
      "\013update_mask\030\002 \001(\0132\032.google.protobuf.Fie" +
      "ldMaskB\004\342A\001\002\"\211\001\n\033ListSecuritySettingsReq" +
      "uest\022C\n\006parent\030\001 \001(\tB3\342A\001\002\372A,\022*dialogflo" +
      "w.googleapis.com/SecuritySettings\022\021\n\tpag" +
      "e_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\203\001\n\034Lis" +
      "tSecuritySettingsResponse\022J\n\021security_se" +
      "ttings\030\001 \003(\0132/.google.cloud.dialogflow.c" +
      "x.v3.SecuritySettings\022\027\n\017next_page_token" +
      "\030\002 \001(\t\"\266\001\n\035CreateSecuritySettingsRequest" +
      "\022C\n\006parent\030\001 \001(\tB3\342A\001\002\372A,\022*dialogflow.go" +
      "ogleapis.com/SecuritySettings\022P\n\021securit" +
      "y_settings\030\002 \001(\0132/.google.cloud.dialogfl" +
      "ow.cx.v3.SecuritySettingsB\004\342A\001\002\"b\n\035Delet" +
      "eSecuritySettingsRequest\022A\n\004name\030\001 \001(\tB3" +
      "\342A\001\002\372A,\n*dialogflow.googleapis.com/Secur" +
      "itySettings\"\226\013\n\020SecuritySettings\022\014\n\004name" +
      "\030\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022]\n\022re" +
      "daction_strategy\030\003 \001(\0162A.google.cloud.di" +
      "alogflow.cx.v3.SecuritySettings.Redactio" +
      "nStrategy\022W\n\017redaction_scope\030\004 \001(\0162>.goo" +
      "gle.cloud.dialogflow.cx.v3.SecuritySetti" +
      "ngs.RedactionScope\022A\n\020inspect_template\030\t" +
      " \001(\tB\'\372A$\n\"dlp.googleapis.com/InspectTem" +
      "plate\022G\n\023deidentify_template\030\021 \001(\tB*\372A\'\n" +
      "%dlp.googleapis.com/DeidentifyTemplate\022\037" +
      "\n\025retention_window_days\030\006 \001(\005H\000\022W\n\020purge" +
      "_data_types\030\010 \003(\0162=.google.cloud.dialogf" +
      "low.cx.v3.SecuritySettings.PurgeDataType" +
      "\022b\n\025audio_export_settings\030\014 \001(\0132C.google" +
      ".cloud.dialogflow.cx.v3.SecuritySettings" +
      ".AudioExportSettings\022h\n\030insights_export_" +
      "settings\030\r \001(\0132F.google.cloud.dialogflow" +
      ".cx.v3.SecuritySettings.InsightsExportSe" +
      "ttings\032\230\002\n\023AudioExportSettings\022\022\n\ngcs_bu" +
      "cket\030\001 \001(\t\022\034\n\024audio_export_pattern\030\002 \001(\t" +
      "\022\036\n\026enable_audio_redaction\030\003 \001(\010\022e\n\014audi" +
      "o_format\030\004 \001(\0162O.google.cloud.dialogflow" +
      ".cx.v3.SecuritySettings.AudioExportSetti" +
      "ngs.AudioFormat\"H\n\013AudioFormat\022\034\n\030AUDIO_" +
      "FORMAT_UNSPECIFIED\020\000\022\t\n\005MULAW\020\001\022\007\n\003MP3\020\002" +
      "\022\007\n\003OGG\020\003\0328\n\026InsightsExportSettings\022\036\n\026e" +
      "nable_insights_export\030\001 \001(\010\"P\n\021Redaction" +
      "Strategy\022\"\n\036REDACTION_STRATEGY_UNSPECIFI" +
      "ED\020\000\022\027\n\023REDACT_WITH_SERVICE\020\001\"J\n\016Redacti" +
      "onScope\022\037\n\033REDACTION_SCOPE_UNSPECIFIED\020\000" +
      "\022\027\n\023REDACT_DISK_STORAGE\020\002\"H\n\rPurgeDataTy" +
      "pe\022\037\n\033PURGE_DATA_TYPE_UNSPECIFIED\020\000\022\026\n\022D" +
      "IALOGFLOW_HISTORY\020\001:}\352Az\n*dialogflow.goo" +
      "gleapis.com/SecuritySettings\022Lprojects/{" +
      "project}/locations/{location}/securitySe" +
      "ttings/{security_settings}B\020\n\016data_reten" +
      "tion2\357\t\n\027SecuritySettingsService\022\363\001\n\026Cre" +
      "ateSecuritySettings\022<.google.cloud.dialo" +
      "gflow.cx.v3.CreateSecuritySettingsReques" +
      "t\032/.google.cloud.dialogflow.cx.v3.Securi" +
      "tySettings\"j\332A\030parent,security_settings\202" +
      "\323\344\223\002I\"4/v3/{parent=projects/*/locations/" +
      "*}/securitySettings:\021security_settings\022\306" +
      "\001\n\023GetSecuritySettings\0229.google.cloud.di" +
      "alogflow.cx.v3.GetSecuritySettingsReques" +
      "t\032/.google.cloud.dialogflow.cx.v3.Securi" +
      "tySettings\"C\332A\004name\202\323\344\223\0026\0224/v3/{name=pro" +
      "jects/*/locations/*/securitySettings/*}\022" +
      "\213\002\n\026UpdateSecuritySettings\022<.google.clou" +
      "d.dialogflow.cx.v3.UpdateSecuritySetting" +
      "sRequest\032/.google.cloud.dialogflow.cx.v3" +
      ".SecuritySettings\"\201\001\332A\035security_settings" +
      ",update_mask\202\323\344\223\002[2F/v3/{security_settin" +
      "gs.name=projects/*/locations/*/securityS" +
      "ettings/*}:\021security_settings\022\326\001\n\024ListSe" +
      "curitySettings\022:.google.cloud.dialogflow" +
      ".cx.v3.ListSecuritySettingsRequest\032;.goo" +
      "gle.cloud.dialogflow.cx.v3.ListSecurityS" +
      "ettingsResponse\"E\332A\006parent\202\323\344\223\0026\0224/v3/{p" +
      "arent=projects/*/locations/*}/securitySe" +
      "ttings\022\263\001\n\026DeleteSecuritySettings\022<.goog" +
      "le.cloud.dialogflow.cx.v3.DeleteSecurity" +
      "SettingsRequest\032\026.google.protobuf.Empty\"" +
      "C\332A\004name\202\323\344\223\0026*4/v3/{name=projects/*/loc" +
      "ations/*/securitySettings/*}\032x\312A\031dialogf" +
      "low.googleapis.com\322AYhttps://www.googlea" +
      "pis.com/auth/cloud-platform,https://www." +
      "googleapis.com/auth/dialogflowB\342\004\n!com.g" +
      "oogle.cloud.dialogflow.cx.v3B\025SecuritySe" +
      "ttingsProtoP\001Z1cloud.google.com/go/dialo" +
      "gflow/cx/apiv3/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Googl" +
      "e.Cloud.Dialogflow.Cx.V3\352\002!Google::Cloud" +
      "::Dialogflow::CX::V3\352A\310\001\n\"dlp.googleapis" +
      ".com/InspectTemplate\022Uorganizations/{org" +
      "anization}/locations/{location}/inspectT" +
      "emplates/{inspect_template}\022Kprojects/{p" +
      "roject}/locations/{location}/inspectTemp" +
      "lates/{inspect_template}\352A\327\001\n%dlp.google" +
      "apis.com/DeidentifyTemplate\022[organizatio" +
      "ns/{organization}/locations/{location}/d" +
      "eidentifyTemplates/{deidentify_template}" +
      "\022Qprojects/{project}/locations/{location" +
      "}/deidentifyTemplates/{deidentify_templa" +
      "te}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "SecuritySettings", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor,
        new java.lang.String[] { "SecuritySettings", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "SecuritySettings", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "RedactionStrategy", "RedactionScope", "InspectTemplate", "DeidentifyTemplate", "RetentionWindowDays", "PurgeDataTypes", "AudioExportSettings", "InsightsExportSettings", "DataRetention", });
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_AudioExportSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_AudioExportSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_AudioExportSettings_descriptor,
        new java.lang.String[] { "GcsBucket", "AudioExportPattern", "EnableAudioRedaction", "AudioFormat", });
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor,
        new java.lang.String[] { "EnableInsightsExport", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
