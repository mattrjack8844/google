// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class FlowProto {
  private FlowProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/cx/v3beta1/flo" +
      "w.proto\022\"google.cloud.dialogflow.cx.v3be" +
      "ta1\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032-" +
      "google/cloud/dialogflow/cx/v3beta1/page." +
      "proto\032;google/cloud/dialogflow/cx/v3beta" +
      "1/validation_message.proto\032#google/longr" +
      "unning/operations.proto\032\033google/protobuf" +
      "/empty.proto\032 google/protobuf/field_mask" +
      ".proto\032\034google/protobuf/struct.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\266\003\n\013NluSet" +
      "tings\022M\n\nmodel_type\030\001 \001(\01629.google.cloud" +
      ".dialogflow.cx.v3beta1.NluSettings.Model" +
      "Type\022 \n\030classification_threshold\030\003 \001(\002\022^" +
      "\n\023model_training_mode\030\004 \001(\0162A.google.clo" +
      "ud.dialogflow.cx.v3beta1.NluSettings.Mod" +
      "elTrainingMode\"Y\n\tModelType\022\032\n\026MODEL_TYP" +
      "E_UNSPECIFIED\020\000\022\027\n\023MODEL_TYPE_STANDARD\020\001" +
      "\022\027\n\023MODEL_TYPE_ADVANCED\020\003\"{\n\021ModelTraini" +
      "ngMode\022#\n\037MODEL_TRAINING_MODE_UNSPECIFIE" +
      "D\020\000\022!\n\035MODEL_TRAINING_MODE_AUTOMATIC\020\001\022\036" +
      "\n\032MODEL_TRAINING_MODE_MANUAL\020\002\"\345\003\n\004Flow\022" +
      "\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002" +
      "\022\023\n\013description\030\003 \001(\t\022N\n\021transition_rout" +
      "es\030\004 \003(\01323.google.cloud.dialogflow.cx.v3" +
      "beta1.TransitionRoute\022H\n\016event_handlers\030" +
      "\n \003(\01320.google.cloud.dialogflow.cx.v3bet" +
      "a1.EventHandler\022T\n\027transition_route_grou" +
      "ps\030\017 \003(\tB3\372A0\n.dialogflow.googleapis.com" +
      "/TransitionRouteGroup\022E\n\014nlu_settings\030\013 " +
      "\001(\0132/.google.cloud.dialogflow.cx.v3beta1" +
      ".NluSettings:h\352Ae\n\036dialogflow.googleapis" +
      ".com/Flow\022Cprojects/{project}/locations/" +
      "{location}/agents/{agent}/flows/{flow}\"\237" +
      "\001\n\021CreateFlowRequest\0226\n\006parent\030\001 \001(\tB&\340A" +
      "\002\372A \022\036dialogflow.googleapis.com/Flow\022;\n\004" +
      "flow\030\002 \001(\0132(.google.cloud.dialogflow.cx." +
      "v3beta1.FlowB\003\340A\002\022\025\n\rlanguage_code\030\003 \001(\t" +
      "\"X\n\021DeleteFlowRequest\0224\n\004name\030\001 \001(\tB&\340A\002" +
      "\372A \n\036dialogflow.googleapis.com/Flow\022\r\n\005f" +
      "orce\030\002 \001(\010\"\210\001\n\020ListFlowsRequest\0226\n\006paren" +
      "t\030\001 \001(\tB&\340A\002\372A \022\036dialogflow.googleapis.c" +
      "om/Flow\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token" +
      "\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\"e\n\021ListFlo" +
      "wsResponse\0227\n\005flows\030\001 \003(\0132(.google.cloud" +
      ".dialogflow.cx.v3beta1.Flow\022\027\n\017next_page" +
      "_token\030\002 \001(\t\"]\n\016GetFlowRequest\0224\n\004name\030\001" +
      " \001(\tB&\340A\002\372A \n\036dialogflow.googleapis.com/" +
      "Flow\022\025\n\rlanguage_code\030\002 \001(\t\"\230\001\n\021UpdateFl" +
      "owRequest\022;\n\004flow\030\001 \001(\0132(.google.cloud.d" +
      "ialogflow.cx.v3beta1.FlowB\003\340A\002\022/\n\013update" +
      "_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\022" +
      "\025\n\rlanguage_code\030\003 \001(\t\"H\n\020TrainFlowReque" +
      "st\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.goo" +
      "gleapis.com/Flow\"b\n\023ValidateFlowRequest\022" +
      "4\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.google" +
      "apis.com/Flow\022\025\n\rlanguage_code\030\002 \001(\t\"}\n\036" +
      "GetFlowValidationResultRequest\022D\n\004name\030\001" +
      " \001(\tB6\340A\002\372A0\n.dialogflow.googleapis.com/" +
      "FlowValidationResult\022\025\n\rlanguage_code\030\002 " +
      "\001(\t\"\266\002\n\024FlowValidationResult\022\014\n\004name\030\001 \001" +
      "(\t\022R\n\023validation_messages\030\002 \003(\01325.google" +
      ".cloud.dialogflow.cx.v3beta1.ValidationM" +
      "essage\022/\n\013update_time\030\003 \001(\0132\032.google.pro" +
      "tobuf.Timestamp:\212\001\352A\206\001\n.dialogflow.googl" +
      "eapis.com/FlowValidationResult\022Tprojects" +
      "/{project}/locations/{location}/agents/{" +
      "agent}/flows/{flow}/validationResult\"\241\002\n" +
      "\021ImportFlowRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372" +
      "A \022\036dialogflow.googleapis.com/Flow\022\022\n\010fl" +
      "ow_uri\030\002 \001(\tH\000\022\026\n\014flow_content\030\003 \001(\014H\000\022Y" +
      "\n\rimport_option\030\004 \001(\0162B.google.cloud.dia" +
      "logflow.cx.v3beta1.ImportFlowRequest.Imp" +
      "ortOption\"E\n\014ImportOption\022\035\n\031IMPORT_OPTI" +
      "ON_UNSPECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FALLBACK\020\002" +
      "B\006\n\004flow\"G\n\022ImportFlowResponse\0221\n\004flow\030\001" +
      " \001(\tB#\372A \n\036dialogflow.googleapis.com/Flo" +
      "w\"\207\001\n\021ExportFlowRequest\0224\n\004name\030\001 \001(\tB&\340" +
      "A\002\372A \n\036dialogflow.googleapis.com/Flow\022\025\n" +
      "\010flow_uri\030\002 \001(\tB\003\340A\001\022%\n\030include_referenc" +
      "ed_flows\030\004 \001(\010B\003\340A\001\"H\n\022ExportFlowRespons" +
      "e\022\022\n\010flow_uri\030\001 \001(\tH\000\022\026\n\014flow_content\030\002 " +
      "\001(\014H\000B\006\n\004flow2\233\021\n\005Flows\022\302\001\n\nCreateFlow\0225" +
      ".google.cloud.dialogflow.cx.v3beta1.Crea" +
      "teFlowRequest\032(.google.cloud.dialogflow." +
      "cx.v3beta1.Flow\"S\202\323\344\223\002?\"7/v3beta1/{paren" +
      "t=projects/*/locations/*/agents/*}/flows" +
      ":\004flow\332A\013parent,flow\022\243\001\n\nDeleteFlow\0225.go" +
      "ogle.cloud.dialogflow.cx.v3beta1.DeleteF" +
      "lowRequest\032\026.google.protobuf.Empty\"F\202\323\344\223" +
      "\0029*7/v3beta1/{name=projects/*/locations/" +
      "*/agents/*/flows/*}\332A\004name\022\302\001\n\tListFlows" +
      "\0224.google.cloud.dialogflow.cx.v3beta1.Li" +
      "stFlowsRequest\0325.google.cloud.dialogflow" +
      ".cx.v3beta1.ListFlowsResponse\"H\202\323\344\223\0029\0227/" +
      "v3beta1/{parent=projects/*/locations/*/a" +
      "gents/*}/flows\332A\006parent\022\257\001\n\007GetFlow\0222.go" +
      "ogle.cloud.dialogflow.cx.v3beta1.GetFlow" +
      "Request\032(.google.cloud.dialogflow.cx.v3b" +
      "eta1.Flow\"F\202\323\344\223\0029\0227/v3beta1/{name=projec" +
      "ts/*/locations/*/agents/*/flows/*}\332A\004nam" +
      "e\022\314\001\n\nUpdateFlow\0225.google.cloud.dialogfl" +
      "ow.cx.v3beta1.UpdateFlowRequest\032(.google" +
      ".cloud.dialogflow.cx.v3beta1.Flow\"]\202\323\344\223\002" +
      "D2</v3beta1/{flow.name=projects/*/locati" +
      "ons/*/agents/*/flows/*}:\004flow\332A\020flow,upd" +
      "ate_mask\022\344\001\n\tTrainFlow\0224.google.cloud.di" +
      "alogflow.cx.v3beta1.TrainFlowRequest\032\035.g" +
      "oogle.longrunning.Operation\"\201\001\202\323\344\223\002B\"=/v" +
      "3beta1/{name=projects/*/locations/*/agen" +
      "ts/*/flows/*}:train:\001*\332A\004name\312A/\n\025google" +
      ".protobuf.Empty\022\026google.protobuf.Struct\022" +
      "\316\001\n\014ValidateFlow\0227.google.cloud.dialogfl" +
      "ow.cx.v3beta1.ValidateFlowRequest\0328.goog" +
      "le.cloud.dialogflow.cx.v3beta1.FlowValid" +
      "ationResult\"K\202\323\344\223\002E\"@/v3beta1/{name=proj" +
      "ects/*/locations/*/agents/*/flows/*}:val" +
      "idate:\001*\022\360\001\n\027GetFlowValidationResult\022B.g" +
      "oogle.cloud.dialogflow.cx.v3beta1.GetFlo" +
      "wValidationResultRequest\0328.google.cloud." +
      "dialogflow.cx.v3beta1.FlowValidationResu" +
      "lt\"W\202\323\344\223\002J\022H/v3beta1/{name=projects/*/lo" +
      "cations/*/agents/*/flows/*/validationRes" +
      "ult}\332A\004name\022\334\001\n\nImportFlow\0225.google.clou" +
      "d.dialogflow.cx.v3beta1.ImportFlowReques" +
      "t\032\035.google.longrunning.Operation\"x\202\323\344\223\002C" +
      "\">/v3beta1/{parent=projects/*/locations/" +
      "*/agents/*}/flows:import:\001*\312A,\n\022ImportFl" +
      "owResponse\022\026google.protobuf.Struct\022\334\001\n\nE" +
      "xportFlow\0225.google.cloud.dialogflow.cx.v" +
      "3beta1.ExportFlowRequest\032\035.google.longru" +
      "nning.Operation\"x\202\323\344\223\002C\">/v3beta1/{name=" +
      "projects/*/locations/*/agents/*/flows/*}" +
      ":export:\001*\312A,\n\022ExportFlowResponse\022\026googl" +
      "e.protobuf.Struct\032x\312A\031dialogflow.googlea" +
      "pis.com\322AYhttps://www.googleapis.com/aut" +
      "h/cloud-platform,https://www.googleapis." +
      "com/auth/dialogflowB\303\001\n&com.google.cloud" +
      ".dialogflow.cx.v3beta1B\tFlowProtoP\001Z6clo" +
      "ud.google.com/go/dialogflow/cx/apiv3beta" +
      "1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialo" +
      "gflow.Cx.V3Beta1\352\002&Google::Cloud::Dialog" +
      "flow::CX::V3beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor,
        new java.lang.String[] { "ModelType", "ClassificationThreshold", "ModelTrainingMode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "TransitionRoutes", "EventHandlers", "TransitionRouteGroups", "NluSettings", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor,
        new java.lang.String[] { "Parent", "Flow", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor,
        new java.lang.String[] { "Flows", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor,
        new java.lang.String[] { "Flow", "UpdateMask", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor,
        new java.lang.String[] { "Name", "ValidationMessages", "UpdateTime", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor,
        new java.lang.String[] { "Parent", "FlowUri", "FlowContent", "ImportOption", "Flow", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor,
        new java.lang.String[] { "Flow", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor,
        new java.lang.String[] { "Name", "FlowUri", "IncludeReferencedFlows", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor,
        new java.lang.String[] { "FlowUri", "FlowContent", "Flow", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
