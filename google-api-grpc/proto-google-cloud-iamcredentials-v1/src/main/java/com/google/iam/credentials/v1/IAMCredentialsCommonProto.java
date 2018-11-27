// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

public final class IAMCredentialsCommonProto {
  private IAMCredentialsCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateAccessTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateAccessTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateAccessTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateAccessTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_SignBlobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_SignBlobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_SignBlobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_SignJwtRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_SignJwtRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_SignJwtResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_SignJwtResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateIdTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateIdTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateIdTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateIdTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/iam/credentials/v1/common.proto" +
      "\022\031google.iam.credentials.v1\032\036google/prot" +
      "obuf/duration.proto\032\037google/protobuf/tim" +
      "estamp.proto\"y\n\032GenerateAccessTokenReque" +
      "st\022\014\n\004name\030\001 \001(\t\022\021\n\tdelegates\030\002 \003(\t\022\r\n\005s" +
      "cope\030\004 \003(\t\022+\n\010lifetime\030\007 \001(\0132\031.google.pr" +
      "otobuf.Duration\"d\n\033GenerateAccessTokenRe" +
      "sponse\022\024\n\014access_token\030\001 \001(\t\022/\n\013expire_t" +
      "ime\030\003 \001(\0132\032.google.protobuf.Timestamp\"C\n" +
      "\017SignBlobRequest\022\014\n\004name\030\001 \001(\t\022\021\n\tdelega" +
      "tes\030\003 \003(\t\022\017\n\007payload\030\005 \001(\014\"7\n\020SignBlobRe" +
      "sponse\022\016\n\006key_id\030\001 \001(\t\022\023\n\013signed_blob\030\004 " +
      "\001(\014\"B\n\016SignJwtRequest\022\014\n\004name\030\001 \001(\t\022\021\n\td" +
      "elegates\030\003 \003(\t\022\017\n\007payload\030\005 \001(\t\"5\n\017SignJ" +
      "wtResponse\022\016\n\006key_id\030\001 \001(\t\022\022\n\nsigned_jwt" +
      "\030\002 \001(\t\"b\n\026GenerateIdTokenRequest\022\014\n\004name" +
      "\030\001 \001(\t\022\021\n\tdelegates\030\002 \003(\t\022\020\n\010audience\030\003 " +
      "\001(\t\022\025\n\rinclude_email\030\004 \001(\010\"(\n\027GenerateId" +
      "TokenResponse\022\r\n\005token\030\001 \001(\t\"U\n)Generate" +
      "IdentityBindingAccessTokenRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022\r\n\005scope\030\002 \003(\t\022\013\n\003jwt\030\003 \001(\t\"s\n*G" +
      "enerateIdentityBindingAccessTokenRespons" +
      "e\022\024\n\014access_token\030\001 \001(\t\022/\n\013expire_time\030\002" +
      " \001(\0132\032.google.protobuf.TimestampB\205\001\n\035com" +
      ".google.iam.credentials.v1B\031IAMCredentia" +
      "lsCommonProtoP\001ZDgoogle.golang.org/genpr" +
      "oto/googleapis/iam/credentials/v1;creden" +
      "tials\370\001\001b\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_iam_credentials_v1_GenerateAccessTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_iam_credentials_v1_GenerateAccessTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateAccessTokenRequest_descriptor,
        new java.lang.String[] { "Name", "Delegates", "Scope", "Lifetime", });
    internal_static_google_iam_credentials_v1_GenerateAccessTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_iam_credentials_v1_GenerateAccessTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateAccessTokenResponse_descriptor,
        new java.lang.String[] { "AccessToken", "ExpireTime", });
    internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_iam_credentials_v1_SignBlobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor,
        new java.lang.String[] { "Name", "Delegates", "Payload", });
    internal_static_google_iam_credentials_v1_SignBlobResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_iam_credentials_v1_SignBlobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_SignBlobResponse_descriptor,
        new java.lang.String[] { "KeyId", "SignedBlob", });
    internal_static_google_iam_credentials_v1_SignJwtRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_iam_credentials_v1_SignJwtRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_SignJwtRequest_descriptor,
        new java.lang.String[] { "Name", "Delegates", "Payload", });
    internal_static_google_iam_credentials_v1_SignJwtResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_iam_credentials_v1_SignJwtResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_SignJwtResponse_descriptor,
        new java.lang.String[] { "KeyId", "SignedJwt", });
    internal_static_google_iam_credentials_v1_GenerateIdTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_iam_credentials_v1_GenerateIdTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateIdTokenRequest_descriptor,
        new java.lang.String[] { "Name", "Delegates", "Audience", "IncludeEmail", });
    internal_static_google_iam_credentials_v1_GenerateIdTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_iam_credentials_v1_GenerateIdTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateIdTokenResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenRequest_descriptor,
        new java.lang.String[] { "Name", "Scope", "Jwt", });
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor,
        new java.lang.String[] { "AccessToken", "ExpireTime", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
