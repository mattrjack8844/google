// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/any.proto

package com.google.protobuf;

public final class AnyProto {
  private AnyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Any_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_protobuf_Any_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/protobuf/any.proto\022\017google.prot" +
      "obuf\".\n\003Any\022\024\n\010type_url\030\001 \001(\tB\002\010\002\022\021\n\005val" +
      "ue\030\002 \001(\014B\002\010\001B*\n\023com.google.protobufB\010Any" +
      "ProtoP\001\240\001\001\242\002\003GPBb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_protobuf_Any_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Any_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_protobuf_Any_descriptor,
        new java.lang.String[] { "TypeUrl", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
