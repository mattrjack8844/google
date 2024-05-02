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
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Content_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Blob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Blob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FileData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FileData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_VideoMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_VideoMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GenerationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SafetySetting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SafetySetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SafetyRating_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SafetyRating_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Candidate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Candidate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Segment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_Web_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_Web_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_RetrievedContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_RetrievedContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GroundingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GroundingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchEntryPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchEntryPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/conten"
          + "t.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032*googl"
          + "e/cloud/aiplatform/v1beta1/tool.proto\032\036g"
          + "oogle/protobuf/duration.proto\032\026google/ty"
          + "pe/date.proto\"W\n\007Content\022\021\n\004role\030\001 \001(\tB\003"
          + "\340A\001\0229\n\005parts\030\002 \003(\0132%.google.cloud.aiplat"
          + "form.v1beta1.PartB\003\340A\002\"\250\003\n\004Part\022\023\n\004text\030"
          + "\001 \001(\tB\003\340A\001H\000\022A\n\013inline_data\030\002 \001(\0132%.goog"
          + "le.cloud.aiplatform.v1beta1.BlobB\003\340A\001H\000\022"
          + "C\n\tfile_data\030\003 \001(\0132).google.cloud.aiplat"
          + "form.v1beta1.FileDataB\003\340A\001H\000\022K\n\rfunction"
          + "_call\030\005 \001(\0132-.google.cloud.aiplatform.v1"
          + "beta1.FunctionCallB\003\340A\001H\000\022S\n\021function_re"
          + "sponse\030\006 \001(\01321.google.cloud.aiplatform.v"
          + "1beta1.FunctionResponseB\003\340A\001H\000\022M\n\016video_"
          + "metadata\030\004 \001(\0132..google.cloud.aiplatform"
          + ".v1beta1.VideoMetadataB\003\340A\001H\001B\006\n\004dataB\n\n"
          + "\010metadata\"1\n\004Blob\022\026\n\tmime_type\030\001 \001(\tB\003\340A"
          + "\002\022\021\n\004data\030\002 \001(\014B\003\340A\002\"9\n\010FileData\022\026\n\tmime"
          + "_type\030\001 \001(\tB\003\340A\002\022\025\n\010file_uri\030\002 \001(\tB\003\340A\002\""
          + "y\n\rVideoMetadata\0224\n\014start_offset\030\001 \001(\0132\031"
          + ".google.protobuf.DurationB\003\340A\001\0222\n\nend_of"
          + "fset\030\002 \001(\0132\031.google.protobuf.DurationB\003\340"
          + "A\001\"\253\003\n\020GenerationConfig\022\035\n\013temperature\030\001"
          + " \001(\002B\003\340A\001H\000\210\001\001\022\027\n\005top_p\030\002 \001(\002B\003\340A\001H\001\210\001\001\022"
          + "\027\n\005top_k\030\003 \001(\002B\003\340A\001H\002\210\001\001\022!\n\017candidate_co"
          + "unt\030\004 \001(\005B\003\340A\001H\003\210\001\001\022#\n\021max_output_tokens"
          + "\030\005 \001(\005B\003\340A\001H\004\210\001\001\022\033\n\016stop_sequences\030\006 \003(\t"
          + "B\003\340A\001\022\"\n\020presence_penalty\030\010 \001(\002B\003\340A\001H\005\210\001"
          + "\001\022#\n\021frequency_penalty\030\t \001(\002B\003\340A\001H\006\210\001\001\022\037"
          + "\n\022response_mime_type\030\r \001(\tB\003\340A\001B\016\n\014_temp"
          + "eratureB\010\n\006_top_pB\010\n\006_top_kB\022\n\020_candidat"
          + "e_countB\024\n\022_max_output_tokensB\023\n\021_presen"
          + "ce_penaltyB\024\n\022_frequency_penalty\"\361\003\n\rSaf"
          + "etySetting\022D\n\010category\030\001 \001(\0162-.google.cl"
          + "oud.aiplatform.v1beta1.HarmCategoryB\003\340A\002"
          + "\022Y\n\tthreshold\030\002 \001(\0162A.google.cloud.aipla"
          + "tform.v1beta1.SafetySetting.HarmBlockThr"
          + "esholdB\003\340A\002\022S\n\006method\030\004 \001(\0162>.google.clo"
          + "ud.aiplatform.v1beta1.SafetySetting.Harm"
          + "BlockMethodB\003\340A\001\"\224\001\n\022HarmBlockThreshold\022"
          + "$\n HARM_BLOCK_THRESHOLD_UNSPECIFIED\020\000\022\027\n"
          + "\023BLOCK_LOW_AND_ABOVE\020\001\022\032\n\026BLOCK_MEDIUM_A"
          + "ND_ABOVE\020\002\022\023\n\017BLOCK_ONLY_HIGH\020\003\022\016\n\nBLOCK"
          + "_NONE\020\004\"S\n\017HarmBlockMethod\022!\n\035HARM_BLOCK"
          + "_METHOD_UNSPECIFIED\020\000\022\014\n\010SEVERITY\020\001\022\017\n\013P"
          + "ROBABILITY\020\002\"\316\004\n\014SafetyRating\022D\n\010categor"
          + "y\030\001 \001(\0162-.google.cloud.aiplatform.v1beta"
          + "1.HarmCategoryB\003\340A\003\022W\n\013probability\030\002 \001(\016"
          + "2=.google.cloud.aiplatform.v1beta1.Safet"
          + "yRating.HarmProbabilityB\003\340A\003\022\036\n\021probabil"
          + "ity_score\030\005 \001(\002B\003\340A\003\022Q\n\010severity\030\006 \001(\0162:"
          + ".google.cloud.aiplatform.v1beta1.SafetyR"
          + "ating.HarmSeverityB\003\340A\003\022\033\n\016severity_scor"
          + "e\030\007 \001(\002B\003\340A\003\022\024\n\007blocked\030\003 \001(\010B\003\340A\003\"b\n\017Ha"
          + "rmProbability\022 \n\034HARM_PROBABILITY_UNSPEC"
          + "IFIED\020\000\022\016\n\nNEGLIGIBLE\020\001\022\007\n\003LOW\020\002\022\n\n\006MEDI"
          + "UM\020\003\022\010\n\004HIGH\020\004\"\224\001\n\014HarmSeverity\022\035\n\031HARM_"
          + "SEVERITY_UNSPECIFIED\020\000\022\034\n\030HARM_SEVERITY_"
          + "NEGLIGIBLE\020\001\022\025\n\021HARM_SEVERITY_LOW\020\002\022\030\n\024H"
          + "ARM_SEVERITY_MEDIUM\020\003\022\026\n\022HARM_SEVERITY_H"
          + "IGH\020\004\"U\n\020CitationMetadata\022A\n\tcitations\030\001"
          + " \003(\0132).google.cloud.aiplatform.v1beta1.C"
          + "itationB\003\340A\003\"\252\001\n\010Citation\022\030\n\013start_index"
          + "\030\001 \001(\005B\003\340A\003\022\026\n\tend_index\030\002 \001(\005B\003\340A\003\022\020\n\003u"
          + "ri\030\003 \001(\tB\003\340A\003\022\022\n\005title\030\004 \001(\tB\003\340A\003\022\024\n\007lic"
          + "ense\030\005 \001(\tB\003\340A\003\0220\n\020publication_date\030\006 \001("
          + "\0132\021.google.type.DateB\003\340A\003\"\377\004\n\tCandidate\022"
          + "\022\n\005index\030\001 \001(\005B\003\340A\003\022>\n\007content\030\002 \001(\0132(.g"
          + "oogle.cloud.aiplatform.v1beta1.ContentB\003"
          + "\340A\003\022S\n\rfinish_reason\030\003 \001(\01627.google.clou"
          + "d.aiplatform.v1beta1.Candidate.FinishRea"
          + "sonB\003\340A\003\022J\n\016safety_ratings\030\004 \003(\0132-.googl"
          + "e.cloud.aiplatform.v1beta1.SafetyRatingB"
          + "\003\340A\003\022 \n\016finish_message\030\005 \001(\tB\003\340A\003H\000\210\001\001\022Q"
          + "\n\021citation_metadata\030\006 \001(\01321.google.cloud"
          + ".aiplatform.v1beta1.CitationMetadataB\003\340A"
          + "\003\022S\n\022grounding_metadata\030\007 \001(\01322.google.c"
          + "loud.aiplatform.v1beta1.GroundingMetadat"
          + "aB\003\340A\003\"\237\001\n\014FinishReason\022\035\n\031FINISH_REASON"
          + "_UNSPECIFIED\020\000\022\010\n\004STOP\020\001\022\016\n\nMAX_TOKENS\020\002"
          + "\022\n\n\006SAFETY\020\003\022\016\n\nRECITATION\020\004\022\t\n\005OTHER\020\005\022"
          + "\r\n\tBLOCKLIST\020\006\022\026\n\022PROHIBITED_CONTENT\020\007\022\010"
          + "\n\004SPII\020\010B\021\n\017_finish_message\"T\n\007Segment\022\027"
          + "\n\npart_index\030\001 \001(\005B\003\340A\003\022\030\n\013start_index\030\002"
          + " \001(\005B\003\340A\003\022\026\n\tend_index\030\003 \001(\005B\003\340A\003\"\277\003\n\024Gr"
          + "oundingAttribution\022M\n\003web\030\003 \001(\01329.google"
          + ".cloud.aiplatform.v1beta1.GroundingAttri"
          + "bution.WebB\003\340A\001H\000\022h\n\021retrieved_context\030\004"
          + " \001(\0132F.google.cloud.aiplatform.v1beta1.G"
          + "roundingAttribution.RetrievedContextB\003\340A"
          + "\001H\000\022>\n\007segment\030\001 \001(\0132(.google.cloud.aipl"
          + "atform.v1beta1.SegmentB\003\340A\003\022%\n\020confidenc"
          + "e_score\030\002 \001(\002B\006\340A\001\340A\003H\001\210\001\001\032+\n\003Web\022\020\n\003uri"
          + "\030\001 \001(\tB\003\340A\003\022\022\n\005title\030\002 \001(\tB\003\340A\003\0328\n\020Retri"
          + "evedContext\022\020\n\003uri\030\001 \001(\tB\003\340A\003\022\022\n\005title\030\002"
          + " \001(\tB\003\340A\003B\013\n\treferenceB\023\n\021_confidence_sc"
          + "ore\"\240\002\n\021GroundingMetadata\022\037\n\022web_search_"
          + "queries\030\001 \003(\tB\003\340A\001\022W\n\022search_entry_point"
          + "\030\004 \001(\01321.google.cloud.aiplatform.v1beta1"
          + ".SearchEntryPointB\003\340A\001H\000\210\001\001\022\036\n\021retrieval"
          + "_queries\030\003 \003(\tB\003\340A\001\022Z\n\026grounding_attribu"
          + "tions\030\002 \003(\01325.google.cloud.aiplatform.v1"
          + "beta1.GroundingAttributionB\003\340A\001B\025\n\023_sear"
          + "ch_entry_point\"H\n\020SearchEntryPoint\022\035\n\020re"
          + "ndered_content\030\001 \001(\tB\003\340A\001\022\025\n\010sdk_blob\030\002 "
          + "\001(\014B\003\340A\001*\264\001\n\014HarmCategory\022\035\n\031HARM_CATEGO"
          + "RY_UNSPECIFIED\020\000\022\035\n\031HARM_CATEGORY_HATE_S"
          + "PEECH\020\001\022#\n\037HARM_CATEGORY_DANGEROUS_CONTE"
          + "NT\020\002\022\034\n\030HARM_CATEGORY_HARASSMENT\020\003\022#\n\037HA"
          + "RM_CATEGORY_SEXUALLY_EXPLICIT\020\004B\343\001\n#com."
          + "google.cloud.aiplatform.v1beta1B\014Content"
          + "ProtoP\001ZCcloud.google.com/go/aiplatform/"
          + "apiv1beta1/aiplatformpb;aiplatformpb\252\002\037G"
          + "oogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\"
          + "Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud"
          + "::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Content_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Content_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Content_descriptor,
            new java.lang.String[] {
              "Role", "Parts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Part_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Part_descriptor,
            new java.lang.String[] {
              "Text",
              "InlineData",
              "FileData",
              "FunctionCall",
              "FunctionResponse",
              "VideoMetadata",
              "Data",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Blob_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Blob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Blob_descriptor,
            new java.lang.String[] {
              "MimeType", "Data",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FileData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FileData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FileData_descriptor,
            new java.lang.String[] {
              "MimeType", "FileUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_VideoMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_VideoMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_VideoMetadata_descriptor,
            new java.lang.String[] {
              "StartOffset", "EndOffset",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_GenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GenerationConfig_descriptor,
            new java.lang.String[] {
              "Temperature",
              "TopP",
              "TopK",
              "CandidateCount",
              "MaxOutputTokens",
              "StopSequences",
              "PresencePenalty",
              "FrequencyPenalty",
              "ResponseMimeType",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SafetySetting_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_SafetySetting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SafetySetting_descriptor,
            new java.lang.String[] {
              "Category", "Threshold", "Method",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SafetyRating_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_SafetyRating_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SafetyRating_descriptor,
            new java.lang.String[] {
              "Category", "Probability", "ProbabilityScore", "Severity", "SeverityScore", "Blocked",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor,
            new java.lang.String[] {
              "Citations",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Citation_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Uri", "Title", "License", "PublicationDate",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Candidate_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_Candidate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Candidate_descriptor,
            new java.lang.String[] {
              "Index",
              "Content",
              "FinishReason",
              "SafetyRatings",
              "FinishMessage",
              "CitationMetadata",
              "GroundingMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_Segment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor,
            new java.lang.String[] {
              "PartIndex", "StartIndex", "EndIndex",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_descriptor,
            new java.lang.String[] {
              "Web", "RetrievedContext", "Segment", "ConfidenceScore", "Reference",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_Web_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_Web_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_Web_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_RetrievedContext_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_RetrievedContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GroundingAttribution_RetrievedContext_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GroundingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_GroundingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GroundingMetadata_descriptor,
            new java.lang.String[] {
              "WebSearchQueries", "SearchEntryPoint", "RetrievalQueries", "GroundingAttributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchEntryPoint_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_SearchEntryPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchEntryPoint_descriptor,
            new java.lang.String[] {
              "RenderedContent", "SdkBlob",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
