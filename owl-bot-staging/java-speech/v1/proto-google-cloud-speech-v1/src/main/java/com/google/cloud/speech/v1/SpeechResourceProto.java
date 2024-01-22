// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/resource.proto

package com.google.cloud.speech.v1;

public final class SpeechResourceProto {
  private SpeechResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_CustomClass_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CustomClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_PhraseSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_PhraseSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechAdaptation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechAdaptation_ABNFGrammar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechAdaptation_ABNFGrammar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_TranscriptNormalization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_TranscriptNormalization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_TranscriptNormalization_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_TranscriptNormalization_Entry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/speech/v1/resource.proto\022" +
      "\026google.cloud.speech.v1\032\031google/api/reso" +
      "urce.proto\"\374\001\n\013CustomClass\022\014\n\004name\030\001 \001(\t" +
      "\022\027\n\017custom_class_id\030\002 \001(\t\022<\n\005items\030\003 \003(\013" +
      "2-.google.cloud.speech.v1.CustomClass.Cl" +
      "assItem\032\032\n\tClassItem\022\r\n\005value\030\001 \001(\t:l\352Ai" +
      "\n!speech.googleapis.com/CustomClass\022Dpro" +
      "jects/{project}/locations/{location}/cus" +
      "tomClasses/{custom_class}\"\362\001\n\tPhraseSet\022" +
      "\014\n\004name\030\001 \001(\t\0229\n\007phrases\030\002 \003(\0132(.google." +
      "cloud.speech.v1.PhraseSet.Phrase\022\r\n\005boos" +
      "t\030\004 \001(\002\032&\n\006Phrase\022\r\n\005value\030\001 \001(\t\022\r\n\005boos" +
      "t\030\002 \001(\002:e\352Ab\n\037speech.googleapis.com/Phra" +
      "seSet\022?projects/{project}/locations/{loc" +
      "ation}/phraseSets/{phrase_set}\"\275\002\n\020Speec" +
      "hAdaptation\0226\n\013phrase_sets\030\001 \003(\0132!.googl" +
      "e.cloud.speech.v1.PhraseSet\022C\n\025phrase_se" +
      "t_references\030\002 \003(\tB$\372A!\n\037speech.googleap" +
      "is.com/PhraseSet\022;\n\016custom_classes\030\003 \003(\013" +
      "2#.google.cloud.speech.v1.CustomClass\022J\n" +
      "\014abnf_grammar\030\004 \001(\01324.google.cloud.speec" +
      "h.v1.SpeechAdaptation.ABNFGrammar\032#\n\013ABN" +
      "FGrammar\022\024\n\014abnf_strings\030\001 \003(\t\"\243\001\n\027Trans" +
      "criptNormalization\022F\n\007entries\030\001 \003(\01325.go" +
      "ogle.cloud.speech.v1.TranscriptNormaliza" +
      "tion.Entry\032@\n\005Entry\022\016\n\006search\030\001 \001(\t\022\017\n\007r" +
      "eplace\030\002 \001(\t\022\026\n\016case_sensitive\030\003 \001(\010Bp\n\032" +
      "com.google.cloud.speech.v1B\023SpeechResour" +
      "ceProtoP\001Z2cloud.google.com/go/speech/ap" +
      "iv1/speechpb;speechpb\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_speech_v1_CustomClass_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_CustomClass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_CustomClass_descriptor,
        new java.lang.String[] { "Name", "CustomClassId", "Items", });
    internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor =
      internal_static_google_cloud_speech_v1_CustomClass_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_google_cloud_speech_v1_PhraseSet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_PhraseSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_PhraseSet_descriptor,
        new java.lang.String[] { "Name", "Phrases", "Boost", });
    internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor =
      internal_static_google_cloud_speech_v1_PhraseSet_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor,
        new java.lang.String[] { "Value", "Boost", });
    internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_SpeechAdaptation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor,
        new java.lang.String[] { "PhraseSets", "PhraseSetReferences", "CustomClasses", "AbnfGrammar", });
    internal_static_google_cloud_speech_v1_SpeechAdaptation_ABNFGrammar_descriptor =
      internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_SpeechAdaptation_ABNFGrammar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechAdaptation_ABNFGrammar_descriptor,
        new java.lang.String[] { "AbnfStrings", });
    internal_static_google_cloud_speech_v1_TranscriptNormalization_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_TranscriptNormalization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_TranscriptNormalization_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_google_cloud_speech_v1_TranscriptNormalization_Entry_descriptor =
      internal_static_google_cloud_speech_v1_TranscriptNormalization_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_TranscriptNormalization_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_TranscriptNormalization_Entry_descriptor,
        new java.lang.String[] { "Search", "Replace", "CaseSensitive", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
