// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/image_object_detection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class ImageObjectDetectionPredictionInstanceProto {
  private ImageObjectDetectionPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nTgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/instance/image_object_detection" +
      ".proto\0227google.cloud.aiplatform.v1beta1." +
      "schema.predict.instance\"L\n&ImageObjectDe" +
      "tectionPredictionInstance\022\017\n\007content\030\001 \001" +
      "(\t\022\021\n\tmime_type\030\002 \001(\tB\371\002\n;com.google.clo" +
      "ud.aiplatform.v1beta1.schema.predict.ins" +
      "tanceB+ImageObjectDetectionPredictionIns" +
      "tanceProtoP\001ZWcloud.google.com/go/aiplat" +
      "form/apiv1beta1/schema/predict/instance/" +
      "instancepb;instancepb\252\0027Google.Cloud.AIP" +
      "latform.V1Beta1.Schema.Predict.Instance\312" +
      "\0027Google\\Cloud\\AIPlatform\\V1beta1\\Schema" +
      "\\Predict\\Instance\352\002=Google::Cloud::AIPla" +
      "tform::V1beta1::Schema::Predict::Instanc" +
      "eb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
