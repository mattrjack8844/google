/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vertexai/v1/explanation_metadata.proto

package com.google.cloud.vertexai.v1;

public final class ExplanationMetadataProto {
  private ExplanationMetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/vertexai/v1/explanation_m"
          + "etadata.proto\022\030google.cloud.vertexai.v1\032"
          + "\037google/api/field_behavior.proto\032\034google"
          + "/protobuf/struct.proto\"\273\022\n\023ExplanationMe"
          + "tadata\022O\n\006inputs\030\001 \003(\01329.google.cloud.ve"
          + "rtexai.v1.ExplanationMetadata.InputsEntr"
          + "yB\004\342A\001\002\022Q\n\007outputs\030\002 \003(\0132:.google.cloud."
          + "vertexai.v1.ExplanationMetadata.OutputsE"
          + "ntryB\004\342A\001\002\022\'\n\037feature_attributions_schem"
          + "a_uri\030\003 \001(\t\022\033\n\023latent_space_source\030\005 \001(\t"
          + "\032\266\r\n\rInputMetadata\022/\n\017input_baselines\030\001 "
          + "\003(\0132\026.google.protobuf.Value\022\031\n\021input_ten"
          + "sor_name\030\002 \001(\t\022V\n\010encoding\030\003 \001(\0162D.googl"
          + "e.cloud.vertexai.v1.ExplanationMetadata."
          + "InputMetadata.Encoding\022\020\n\010modality\030\004 \001(\t"
          + "\022l\n\024feature_value_domain\030\005 \001(\0132N.google."
          + "cloud.vertexai.v1.ExplanationMetadata.In"
          + "putMetadata.FeatureValueDomain\022\033\n\023indice"
          + "s_tensor_name\030\006 \001(\t\022\037\n\027dense_shape_tenso"
          + "r_name\030\007 \001(\t\022\035\n\025index_feature_mapping\030\010 "
          + "\003(\t\022\033\n\023encoded_tensor_name\030\t \001(\t\0221\n\021enco"
          + "ded_baselines\030\n \003(\0132\026.google.protobuf.Va"
          + "lue\022`\n\rvisualization\030\013 \001(\0132I.google.clou"
          + "d.vertexai.v1.ExplanationMetadata.InputM"
          + "etadata.Visualization\022\022\n\ngroup_name\030\014 \001("
          + "\t\032j\n\022FeatureValueDomain\022\021\n\tmin_value\030\001 \001"
          + "(\002\022\021\n\tmax_value\030\002 \001(\002\022\025\n\roriginal_mean\030\003"
          + " \001(\002\022\027\n\017original_stddev\030\004 \001(\002\032\316\006\n\rVisual"
          + "ization\022\\\n\004type\030\001 \001(\0162N.google.cloud.ver"
          + "texai.v1.ExplanationMetadata.InputMetada"
          + "ta.Visualization.Type\022d\n\010polarity\030\002 \001(\0162"
          + "R.google.cloud.vertexai.v1.ExplanationMe"
          + "tadata.InputMetadata.Visualization.Polar"
          + "ity\022e\n\tcolor_map\030\003 \001(\0162R.google.cloud.ve"
          + "rtexai.v1.ExplanationMetadata.InputMetad"
          + "ata.Visualization.ColorMap\022\037\n\027clip_perce"
          + "nt_upperbound\030\004 \001(\002\022\037\n\027clip_percent_lowe"
          + "rbound\030\005 \001(\002\022k\n\014overlay_type\030\006 \001(\0162U.goo"
          + "gle.cloud.vertexai.v1.ExplanationMetadat"
          + "a.InputMetadata.Visualization.OverlayTyp"
          + "e\"6\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006PIXEL"
          + "S\020\001\022\014\n\010OUTLINES\020\002\"J\n\010Polarity\022\030\n\024POLARIT"
          + "Y_UNSPECIFIED\020\000\022\014\n\010POSITIVE\020\001\022\014\n\010NEGATIV"
          + "E\020\002\022\010\n\004BOTH\020\003\"{\n\010ColorMap\022\031\n\025COLOR_MAP_U"
          + "NSPECIFIED\020\000\022\016\n\nPINK_GREEN\020\001\022\013\n\007VIRIDIS\020"
          + "\002\022\007\n\003RED\020\003\022\t\n\005GREEN\020\004\022\r\n\tRED_GREEN\020\006\022\024\n\020"
          + "PINK_WHITE_GREEN\020\005\"b\n\013OverlayType\022\034\n\030OVE"
          + "RLAY_TYPE_UNSPECIFIED\020\000\022\010\n\004NONE\020\001\022\014\n\010ORI"
          + "GINAL\020\002\022\r\n\tGRAYSCALE\020\003\022\016\n\nMASK_BLACK\020\004\"\240"
          + "\001\n\010Encoding\022\030\n\024ENCODING_UNSPECIFIED\020\000\022\014\n"
          + "\010IDENTITY\020\001\022\023\n\017BAG_OF_FEATURES\020\002\022\032\n\026BAG_"
          + "OF_FEATURES_SPARSE\020\003\022\r\n\tINDICATOR\020\004\022\026\n\022C"
          + "OMBINED_EMBEDDING\020\005\022\024\n\020CONCAT_EMBEDDING\020"
          + "\006\032\246\001\n\016OutputMetadata\022<\n\032index_display_na"
          + "me_mapping\030\001 \001(\0132\026.google.protobuf.Value"
          + "H\000\022\"\n\030display_name_mapping_key\030\002 \001(\tH\000\022\032"
          + "\n\022output_tensor_name\030\003 \001(\tB\026\n\024display_na"
          + "me_mapping\032j\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022J"
          + "\n\005value\030\002 \001(\0132;.google.cloud.vertexai.v1"
          + ".ExplanationMetadata.InputMetadata:\0028\001\032l"
          + "\n\014OutputsEntry\022\013\n\003key\030\001 \001(\t\022K\n\005value\030\002 \001"
          + "(\0132<.google.cloud.vertexai.v1.Explanatio"
          + "nMetadata.OutputMetadata:\0028\001B\310\001\n\034com.goo"
          + "gle.cloud.vertexai.v1B\030ExplanationMetada"
          + "taProtoP\001Z8cloud.google.com/go/vertexai/"
          + "apiv1/vertexaipb;vertexaipb\252\002\030Google.Clo"
          + "ud.VertexAI.V1\312\002\030Google\\Cloud\\VertexAI\\V"
          + "1\352\002\033Google::Cloud::VertexAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor,
            new java.lang.String[] {
              "Inputs", "Outputs", "FeatureAttributionsSchemaUri", "LatentSpaceSource",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_descriptor,
            new java.lang.String[] {
              "InputBaselines",
              "InputTensorName",
              "Encoding",
              "Modality",
              "FeatureValueDomain",
              "IndicesTensorName",
              "DenseShapeTensorName",
              "IndexFeatureMapping",
              "EncodedTensorName",
              "EncodedBaselines",
              "Visualization",
              "GroupName",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "OriginalMean", "OriginalStddev",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor,
            new java.lang.String[] {
              "Type",
              "Polarity",
              "ColorMap",
              "ClipPercentUpperbound",
              "ClipPercentLowerbound",
              "OverlayType",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputMetadata_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputMetadata_descriptor,
            new java.lang.String[] {
              "IndexDisplayNameMapping",
              "DisplayNameMappingKey",
              "OutputTensorName",
              "DisplayNameMapping",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadata_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
