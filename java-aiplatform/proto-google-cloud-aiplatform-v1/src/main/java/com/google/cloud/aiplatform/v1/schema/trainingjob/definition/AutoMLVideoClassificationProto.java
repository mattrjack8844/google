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
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_classification.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLVideoClassificationProto {
  private AutoMLVideoClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nZgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_video_classifi"
          + "cation.proto\0228google.cloud.aiplatform.v1"
          + ".schema.trainingjob.definition\"\206\001\n\031AutoM"
          + "lVideoClassification\022i\n\006inputs\030\001 \001(\0132Y.g"
          + "oogle.cloud.aiplatform.v1.schema.trainin"
          + "gjob.definition.AutoMlVideoClassificatio"
          + "nInputs\"\205\002\n\037AutoMlVideoClassificationInp"
          + "uts\022w\n\nmodel_type\030\001 \001(\0162c.google.cloud.a"
          + "iplatform.v1.schema.trainingjob.definiti"
          + "on.AutoMlVideoClassificationInputs.Model"
          + "Type\"i\n\tModelType\022\032\n\026MODEL_TYPE_UNSPECIF"
          + "IED\020\000\022\t\n\005CLOUD\020\001\022\026\n\022MOBILE_VERSATILE_1\020\002"
          + "\022\035\n\031MOBILE_JETSON_VERSATILE_1\020\003B\365\002\n<com."
          + "google.cloud.aiplatform.v1.schema.traini"
          + "ngjob.definitionB\036AutoMLVideoClassificat"
          + "ionProtoP\001Z\\cloud.google.com/go/aiplatfo"
          + "rm/apiv1/schema/trainingjob/definition/d"
          + "efinitionpb;definitionpb\252\0028Google.Cloud."
          + "AIPlatform.V1.Schema.TrainingJob.Definit"
          + "ion\312\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\"
          + "TrainingJob\\Definition\352\002>Google::Cloud::"
          + "AIPlatform::V1::Schema::TrainingJob::Def"
          + "initionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
