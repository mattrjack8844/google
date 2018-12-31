// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

public final class Image {
  private Image() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_image_Layer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_image_Layer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_image_Fingerprint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_image_Fingerprint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_image_Basis_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_image_Basis_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_image_Details_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_image_Details_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_image_Derived_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_image_Derived_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/devtools/containeranalysis/v1be"
          + "ta1/image/image.proto\022\025grafeas.v1beta1.i"
          + "mage\"\310\002\n\005Layer\0229\n\tdirective\030\001 \001(\0162&.graf"
          + "eas.v1beta1.image.Layer.Directive\022\021\n\targ"
          + "uments\030\002 \001(\t\"\360\001\n\tDirective\022\031\n\025DIRECTIVE_"
          + "UNSPECIFIED\020\000\022\016\n\nMAINTAINER\020\001\022\007\n\003RUN\020\002\022\007"
          + "\n\003CMD\020\003\022\t\n\005LABEL\020\004\022\n\n\006EXPOSE\020\005\022\007\n\003ENV\020\006\022"
          + "\007\n\003ADD\020\007\022\010\n\004COPY\020\010\022\016\n\nENTRYPOINT\020\t\022\n\n\006VO"
          + "LUME\020\n\022\010\n\004USER\020\013\022\013\n\007WORKDIR\020\014\022\007\n\003ARG\020\r\022\013"
          + "\n\007ONBUILD\020\016\022\016\n\nSTOPSIGNAL\020\017\022\017\n\013HEALTHCHE"
          + "CK\020\020\022\t\n\005SHELL\020\021\"@\n\013Fingerprint\022\017\n\007v1_nam"
          + "e\030\001 \001(\t\022\017\n\007v2_blob\030\002 \003(\t\022\017\n\007v2_name\030\003 \001("
          + "\t\"V\n\005Basis\022\024\n\014resource_url\030\001 \001(\t\0227\n\013fing"
          + "erprint\030\002 \001(\0132\".grafeas.v1beta1.image.Fi"
          + "ngerprint\"@\n\007Details\0225\n\rderived_image\030\001 "
          + "\001(\0132\036.grafeas.v1beta1.image.Derived\"\241\001\n\007"
          + "Derived\0227\n\013fingerprint\030\001 \001(\0132\".grafeas.v"
          + "1beta1.image.Fingerprint\022\020\n\010distance\030\002 \001"
          + "(\005\0220\n\nlayer_info\030\003 \003(\0132\034.grafeas.v1beta1"
          + ".image.Layer\022\031\n\021base_resource_url\030\004 \001(\tB"
          + "x\n\030io.grafeas.v1beta1.imageP\001ZTgoogle.go"
          + "lang.org/genproto/googleapis/devtools/co"
          + "ntaineranalysis/v1beta1/image;image\242\002\003GR"
          + "Ab\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_grafeas_v1beta1_image_Layer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_image_Layer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_image_Layer_descriptor,
            new java.lang.String[] {
              "Directive", "Arguments",
            });
    internal_static_grafeas_v1beta1_image_Fingerprint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_image_Fingerprint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_image_Fingerprint_descriptor,
            new java.lang.String[] {
              "V1Name", "V2Blob", "V2Name",
            });
    internal_static_grafeas_v1beta1_image_Basis_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_image_Basis_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_image_Basis_descriptor,
            new java.lang.String[] {
              "ResourceUrl", "Fingerprint",
            });
    internal_static_grafeas_v1beta1_image_Details_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1beta1_image_Details_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_image_Details_descriptor,
            new java.lang.String[] {
              "DerivedImage",
            });
    internal_static_grafeas_v1beta1_image_Derived_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1beta1_image_Derived_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_image_Derived_descriptor,
            new java.lang.String[] {
              "Fingerprint", "Distance", "LayerInfo", "BaseResourceUrl",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
