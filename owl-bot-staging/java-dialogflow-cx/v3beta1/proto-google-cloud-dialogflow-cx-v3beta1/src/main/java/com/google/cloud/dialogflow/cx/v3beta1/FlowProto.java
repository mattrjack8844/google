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
      "\n\032MODEL_TRAINING_MODE_MANUAL\020\002\"\346\003\n\004Flow\022" +
      "\014\n\004name\030\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB\004\342A\001" +
      "\002\022\023\n\013description\030\003 \001(\t\022N\n\021transition_rou" +
      "tes\030\004 \003(\01323.google.cloud.dialogflow.cx.v" +
      "3beta1.TransitionRoute\022H\n\016event_handlers" +
      "\030\n \003(\01320.google.cloud.dialogflow.cx.v3be" +
      "ta1.EventHandler\022T\n\027transition_route_gro" +
      "ups\030\017 \003(\tB3\372A0\n.dialogflow.googleapis.co" +
      "m/TransitionRouteGroup\022E\n\014nlu_settings\030\013" +
      " \001(\0132/.google.cloud.dialogflow.cx.v3beta" +
      "1.NluSettings:h\352Ae\n\036dialogflow.googleapi" +
      "s.com/Flow\022Cprojects/{project}/locations" +
      "/{location}/agents/{agent}/flows/{flow}\"" +
      "\241\001\n\021CreateFlowRequest\0227\n\006parent\030\001 \001(\tB\'\342" +
      "A\001\002\372A \022\036dialogflow.googleapis.com/Flow\022<" +
      "\n\004flow\030\002 \001(\0132(.google.cloud.dialogflow.c" +
      "x.v3beta1.FlowB\004\342A\001\002\022\025\n\rlanguage_code\030\003 " +
      "\001(\t\"Y\n\021DeleteFlowRequest\0225\n\004name\030\001 \001(\tB\'" +
      "\342A\001\002\372A \n\036dialogflow.googleapis.com/Flow\022" +
      "\r\n\005force\030\002 \001(\010\"\211\001\n\020ListFlowsRequest\0227\n\006p" +
      "arent\030\001 \001(\tB\'\342A\001\002\372A \022\036dialogflow.googlea" +
      "pis.com/Flow\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_" +
      "token\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\"e\n\021Li" +
      "stFlowsResponse\0227\n\005flows\030\001 \003(\0132(.google." +
      "cloud.dialogflow.cx.v3beta1.Flow\022\027\n\017next" +
      "_page_token\030\002 \001(\t\"^\n\016GetFlowRequest\0225\n\004n" +
      "ame\030\001 \001(\tB\'\342A\001\002\372A \n\036dialogflow.googleapi" +
      "s.com/Flow\022\025\n\rlanguage_code\030\002 \001(\t\"\231\001\n\021Up" +
      "dateFlowRequest\022<\n\004flow\030\001 \001(\0132(.google.c" +
      "loud.dialogflow.cx.v3beta1.FlowB\004\342A\001\002\022/\n" +
      "\013update_mask\030\002 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022\025\n\rlanguage_code\030\003 \001(\t\"I\n\020TrainFl" +
      "owRequest\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036dialog" +
      "flow.googleapis.com/Flow\"c\n\023ValidateFlow" +
      "Request\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036dialogfl" +
      "ow.googleapis.com/Flow\022\025\n\rlanguage_code\030" +
      "\002 \001(\t\"~\n\036GetFlowValidationResultRequest\022" +
      "E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n.dialogflow.googl" +
      "eapis.com/FlowValidationResult\022\025\n\rlangua" +
      "ge_code\030\002 \001(\t\"\266\002\n\024FlowValidationResult\022\014" +
      "\n\004name\030\001 \001(\t\022R\n\023validation_messages\030\002 \003(" +
      "\01325.google.cloud.dialogflow.cx.v3beta1.V" +
      "alidationMessage\022/\n\013update_time\030\003 \001(\0132\032." +
      "google.protobuf.Timestamp:\212\001\352A\206\001\n.dialog" +
      "flow.googleapis.com/FlowValidationResult" +
      "\022Tprojects/{project}/locations/{location" +
      "}/agents/{agent}/flows/{flow}/validation" +
      "Result\"\242\002\n\021ImportFlowRequest\0227\n\006parent\030\001" +
      " \001(\tB\'\342A\001\002\372A \022\036dialogflow.googleapis.com" +
      "/Flow\022\022\n\010flow_uri\030\002 \001(\tH\000\022\026\n\014flow_conten" +
      "t\030\003 \001(\014H\000\022Y\n\rimport_option\030\004 \001(\0162B.googl" +
      "e.cloud.dialogflow.cx.v3beta1.ImportFlow" +
      "Request.ImportOption\"E\n\014ImportOption\022\035\n\031" +
      "IMPORT_OPTION_UNSPECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n" +
      "\010FALLBACK\020\002B\006\n\004flow\"G\n\022ImportFlowRespons" +
      "e\0221\n\004flow\030\001 \001(\tB#\372A \n\036dialogflow.googlea" +
      "pis.com/Flow\"\212\001\n\021ExportFlowRequest\0225\n\004na" +
      "me\030\001 \001(\tB\'\342A\001\002\372A \n\036dialogflow.googleapis" +
      ".com/Flow\022\026\n\010flow_uri\030\002 \001(\tB\004\342A\001\001\022&\n\030inc" +
      "lude_referenced_flows\030\004 \001(\010B\004\342A\001\001\"H\n\022Exp" +
      "ortFlowResponse\022\022\n\010flow_uri\030\001 \001(\tH\000\022\026\n\014f" +
      "low_content\030\002 \001(\014H\000B\006\n\004flow2\233\021\n\005Flows\022\302\001" +
      "\n\nCreateFlow\0225.google.cloud.dialogflow.c" +
      "x.v3beta1.CreateFlowRequest\032(.google.clo" +
      "ud.dialogflow.cx.v3beta1.Flow\"S\332A\013parent" +
      ",flow\202\323\344\223\002?\"7/v3beta1/{parent=projects/*" +
      "/locations/*/agents/*}/flows:\004flow\022\243\001\n\nD" +
      "eleteFlow\0225.google.cloud.dialogflow.cx.v" +
      "3beta1.DeleteFlowRequest\032\026.google.protob" +
      "uf.Empty\"F\332A\004name\202\323\344\223\0029*7/v3beta1/{name=" +
      "projects/*/locations/*/agents/*/flows/*}" +
      "\022\302\001\n\tListFlows\0224.google.cloud.dialogflow" +
      ".cx.v3beta1.ListFlowsRequest\0325.google.cl" +
      "oud.dialogflow.cx.v3beta1.ListFlowsRespo" +
      "nse\"H\332A\006parent\202\323\344\223\0029\0227/v3beta1/{parent=p" +
      "rojects/*/locations/*/agents/*}/flows\022\257\001" +
      "\n\007GetFlow\0222.google.cloud.dialogflow.cx.v" +
      "3beta1.GetFlowRequest\032(.google.cloud.dia" +
      "logflow.cx.v3beta1.Flow\"F\332A\004name\202\323\344\223\0029\0227" +
      "/v3beta1/{name=projects/*/locations/*/ag" +
      "ents/*/flows/*}\022\314\001\n\nUpdateFlow\0225.google." +
      "cloud.dialogflow.cx.v3beta1.UpdateFlowRe" +
      "quest\032(.google.cloud.dialogflow.cx.v3bet" +
      "a1.Flow\"]\332A\020flow,update_mask\202\323\344\223\002D2</v3b" +
      "eta1/{flow.name=projects/*/locations/*/a" +
      "gents/*/flows/*}:\004flow\022\344\001\n\tTrainFlow\0224.g" +
      "oogle.cloud.dialogflow.cx.v3beta1.TrainF" +
      "lowRequest\032\035.google.longrunning.Operatio" +
      "n\"\201\001\312A/\n\025google.protobuf.Empty\022\026google.p" +
      "rotobuf.Struct\332A\004name\202\323\344\223\002B\"=/v3beta1/{n" +
      "ame=projects/*/locations/*/agents/*/flow" +
      "s/*}:train:\001*\022\316\001\n\014ValidateFlow\0227.google." +
      "cloud.dialogflow.cx.v3beta1.ValidateFlow" +
      "Request\0328.google.cloud.dialogflow.cx.v3b" +
      "eta1.FlowValidationResult\"K\202\323\344\223\002E\"@/v3be" +
      "ta1/{name=projects/*/locations/*/agents/" +
      "*/flows/*}:validate:\001*\022\360\001\n\027GetFlowValida" +
      "tionResult\022B.google.cloud.dialogflow.cx." +
      "v3beta1.GetFlowValidationResultRequest\0328" +
      ".google.cloud.dialogflow.cx.v3beta1.Flow" +
      "ValidationResult\"W\332A\004name\202\323\344\223\002J\022H/v3beta" +
      "1/{name=projects/*/locations/*/agents/*/" +
      "flows/*/validationResult}\022\334\001\n\nImportFlow" +
      "\0225.google.cloud.dialogflow.cx.v3beta1.Im" +
      "portFlowRequest\032\035.google.longrunning.Ope" +
      "ration\"x\312A,\n\022ImportFlowResponse\022\026google." +
      "protobuf.Struct\202\323\344\223\002C\">/v3beta1/{parent=" +
      "projects/*/locations/*/agents/*}/flows:i" +
      "mport:\001*\022\334\001\n\nExportFlow\0225.google.cloud.d" +
      "ialogflow.cx.v3beta1.ExportFlowRequest\032\035" +
      ".google.longrunning.Operation\"x\312A,\n\022Expo" +
      "rtFlowResponse\022\026google.protobuf.Struct\202\323" +
      "\344\223\002C\">/v3beta1/{name=projects/*/location" +
      "s/*/agents/*/flows/*}:export:\001*\032x\312A\031dial" +
      "ogflow.googleapis.com\322AYhttps://www.goog" +
      "leapis.com/auth/cloud-platform,https://w" +
      "ww.googleapis.com/auth/dialogflowB\303\001\n&co" +
      "m.google.cloud.dialogflow.cx.v3beta1B\tFl" +
      "owProtoP\001Z6cloud.google.com/go/dialogflo" +
      "w/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Goog" +
      "le.Cloud.Dialogflow.Cx.V3Beta1\352\002&Google:" +
      ":Cloud::Dialogflow::CX::V3beta1b\006proto3"
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
