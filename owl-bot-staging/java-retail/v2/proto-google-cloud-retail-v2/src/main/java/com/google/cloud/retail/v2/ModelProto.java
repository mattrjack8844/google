// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public final class ModelProto {
  private ModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Model_ServingConfigList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/retail/v2/model.proto\022\026go" +
      "ogle.cloud.retail.v2\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032#google/cloud/retail/v2/common.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\"\242\n\n\005Model" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\031\n\014display_name\030\002 \001(" +
      "\tB\003\340A\002\022H\n\016training_state\030\003 \001(\0162+.google." +
      "cloud.retail.v2.Model.TrainingStateB\003\340A\001" +
      "\022F\n\rserving_state\030\004 \001(\0162*.google.cloud.r" +
      "etail.v2.Model.ServingStateB\003\340A\003\0224\n\013crea" +
      "te_time\030\005 \001(\0132\032.google.protobuf.Timestam" +
      "pB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\022\021\n\004type\030\007 \001(\tB\003\340A\002\022" +
      "#\n\026optimization_objective\030\010 \001(\tB\003\340A\001\022U\n\025" +
      "periodic_tuning_state\030\013 \001(\01621.google.clo" +
      "ud.retail.v2.Model.PeriodicTuningStateB\003" +
      "\340A\001\0227\n\016last_tune_time\030\014 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\022\035\n\020tuning_operation" +
      "\030\017 \001(\tB\003\340A\003\022@\n\ndata_state\030\020 \001(\0162\'.google" +
      ".cloud.retail.v2.Model.DataStateB\003\340A\003\022U\n" +
      "\020filtering_option\030\022 \001(\01626.google.cloud.r" +
      "etail.v2.RecommendationsFilteringOptionB" +
      "\003\340A\001\022R\n\024serving_config_lists\030\023 \003(\0132/.goo" +
      "gle.cloud.retail.v2.Model.ServingConfigL" +
      "istB\003\340A\003\0324\n\021ServingConfigList\022\037\n\022serving" +
      "_config_ids\030\001 \003(\tB\003\340A\001\"R\n\014ServingState\022\035" +
      "\n\031SERVING_STATE_UNSPECIFIED\020\000\022\014\n\010INACTIV" +
      "E\020\001\022\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020\003\"I\n\rTrainingSt" +
      "ate\022\036\n\032TRAINING_STATE_UNSPECIFIED\020\000\022\n\n\006P" +
      "AUSED\020\001\022\014\n\010TRAINING\020\002\"\220\001\n\023PeriodicTuning" +
      "State\022%\n!PERIODIC_TUNING_STATE_UNSPECIFI" +
      "ED\020\000\022\034\n\030PERIODIC_TUNING_DISABLED\020\001\022\027\n\023AL" +
      "L_TUNING_DISABLED\020\003\022\033\n\027PERIODIC_TUNING_E" +
      "NABLED\020\002\"D\n\tDataState\022\032\n\026DATA_STATE_UNSP" +
      "ECIFIED\020\000\022\013\n\007DATA_OK\020\001\022\016\n\nDATA_ERROR\020\002:k" +
      "\352Ah\n\033retail.googleapis.com/Model\022Iprojec" +
      "ts/{project}/locations/{location}/catalo" +
      "gs/{catalog}/models/{model}B\265\001\n\032com.goog" +
      "le.cloud.retail.v2B\nModelProtoP\001Z2cloud." +
      "google.com/go/retail/apiv2/retailpb;reta" +
      "ilpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002" +
      "\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud:" +
      ":Retail::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2_Model_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Model_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "TrainingState", "ServingState", "CreateTime", "UpdateTime", "Type", "OptimizationObjective", "PeriodicTuningState", "LastTuneTime", "TuningOperation", "DataState", "FilteringOption", "ServingConfigLists", });
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor =
      internal_static_google_cloud_retail_v2_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor,
        new java.lang.String[] { "ServingConfigIds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
