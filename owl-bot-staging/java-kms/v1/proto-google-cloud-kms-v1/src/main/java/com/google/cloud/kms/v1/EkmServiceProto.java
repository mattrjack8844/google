// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/ekm_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.kms.v1;

public final class EkmServiceProto {
  private EkmServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_GetEkmConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_GetEkmConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_UpdateEkmConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_UpdateEkmConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_EkmConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_EkmConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_EkmConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_EkmConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_VerifyConnectivityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_VerifyConnectivityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_VerifyConnectivityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_VerifyConnectivityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/kms/v1/ekm_service.proto\022" +
      "\023google.cloud.kms.v1\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032 google/protobuf/field_m" +
      "ask.proto\032\037google/protobuf/timestamp.pro" +
      "to\"\270\001\n\031ListEkmConnectionsRequest\022:\n\006pare" +
      "nt\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleapis." +
      "com/Location\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n" +
      "\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001(\tB" +
      "\004\342A\001\001\022\026\n\010order_by\030\005 \001(\tB\004\342A\001\001\"\206\001\n\032ListEk" +
      "mConnectionsResponse\022;\n\017ekm_connections\030" +
      "\001 \003(\0132\".google.cloud.kms.v1.EkmConnectio" +
      "n\022\027\n\017next_page_token\030\002 \001(\t\022\022\n\ntotal_size" +
      "\030\003 \001(\005\"W\n\027GetEkmConnectionRequest\022<\n\004nam" +
      "e\030\001 \001(\tB.\342A\001\002\372A\'\n%cloudkms.googleapis.co" +
      "m/EkmConnection\"\273\001\n\032CreateEkmConnectionR" +
      "equest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locatio" +
      "ns.googleapis.com/Location\022\037\n\021ekm_connec" +
      "tion_id\030\002 \001(\tB\004\342A\001\002\022@\n\016ekm_connection\030\003 " +
      "\001(\0132\".google.cloud.kms.v1.EkmConnectionB" +
      "\004\342A\001\002\"\225\001\n\032UpdateEkmConnectionRequest\022@\n\016" +
      "ekm_connection\030\001 \001(\0132\".google.cloud.kms." +
      "v1.EkmConnectionB\004\342A\001\002\0225\n\013update_mask\030\002 " +
      "\001(\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\"O\n" +
      "\023GetEkmConfigRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002" +
      "\372A#\n!cloudkms.googleapis.com/EkmConfig\"\211" +
      "\001\n\026UpdateEkmConfigRequest\0228\n\nekm_config\030" +
      "\001 \001(\0132\036.google.cloud.kms.v1.EkmConfigB\004\342" +
      "A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.google.protob" +
      "uf.FieldMaskB\004\342A\001\002\"\310\002\n\013Certificate\022\025\n\007ra" +
      "w_der\030\001 \001(\014B\004\342A\001\002\022\024\n\006parsed\030\002 \001(\010B\004\342A\001\003\022" +
      "\024\n\006issuer\030\003 \001(\tB\004\342A\001\003\022\025\n\007subject\030\004 \001(\tB\004" +
      "\342A\001\003\022+\n\035subject_alternative_dns_names\030\005 " +
      "\003(\tB\004\342A\001\003\0229\n\017not_before_time\030\006 \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\004\342A\001\003\0228\n\016not_afte" +
      "r_time\030\007 \001(\0132\032.google.protobuf.Timestamp" +
      "B\004\342A\001\003\022\033\n\rserial_number\030\010 \001(\tB\004\342A\001\003\022 \n\022s" +
      "ha256_fingerprint\030\t \001(\tB\004\342A\001\003\"\346\005\n\rEkmCon" +
      "nection\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\0225\n\013create_ti" +
      "me\030\002 \001(\0132\032.google.protobuf.TimestampB\004\342A" +
      "\001\003\022M\n\021service_resolvers\030\003 \003(\01322.google.c" +
      "loud.kms.v1.EkmConnection.ServiceResolve" +
      "r\022\022\n\004etag\030\005 \001(\tB\004\342A\001\001\022W\n\023key_management_" +
      "mode\030\006 \001(\01624.google.cloud.kms.v1.EkmConn" +
      "ection.KeyManagementModeB\004\342A\001\001\022\037\n\021crypto" +
      "_space_path\030\007 \001(\tB\004\342A\001\001\032\342\001\n\017ServiceResol" +
      "ver\022S\n\031service_directory_service\030\001 \001(\tB0" +
      "\342A\001\002\372A)\n\'servicedirectory.googleapis.com" +
      "/Service\022\035\n\017endpoint_filter\030\002 \001(\tB\004\342A\001\001\022" +
      "\026\n\010hostname\030\003 \001(\tB\004\342A\001\002\022C\n\023server_certif" +
      "icates\030\004 \003(\0132 .google.cloud.kms.v1.Certi" +
      "ficateB\004\342A\001\002\"S\n\021KeyManagementMode\022#\n\037KEY" +
      "_MANAGEMENT_MODE_UNSPECIFIED\020\000\022\n\n\006MANUAL" +
      "\020\001\022\r\n\tCLOUD_KMS\020\002:s\352Ap\n%cloudkms.googlea" +
      "pis.com/EkmConnection\022Gprojects/{project" +
      "}/locations/{location}/ekmConnections/{e" +
      "km_connection}\"\312\001\n\tEkmConfig\022\022\n\004name\030\001 \001" +
      "(\tB\004\342A\001\003\022N\n\026default_ekm_connection\030\002 \001(\t" +
      "B.\342A\001\001\372A\'\n%cloudkms.googleapis.com/EkmCo" +
      "nnection:Y\352AV\n!cloudkms.googleapis.com/E" +
      "kmConfig\0221projects/{project}/locations/{" +
      "location}/ekmConfig\"Y\n\031VerifyConnectivit" +
      "yRequest\022<\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%cloudkm" +
      "s.googleapis.com/EkmConnection\"\034\n\032Verify" +
      "ConnectivityResponse2\334\013\n\nEkmService\022\272\001\n\022" +
      "ListEkmConnections\022..google.cloud.kms.v1" +
      ".ListEkmConnectionsRequest\032/.google.clou" +
      "d.kms.v1.ListEkmConnectionsResponse\"C\332A\006" +
      "parent\202\323\344\223\0024\0222/v1/{parent=projects/*/loc" +
      "ations/*}/ekmConnections\022\247\001\n\020GetEkmConne" +
      "ction\022,.google.cloud.kms.v1.GetEkmConnec" +
      "tionRequest\032\".google.cloud.kms.v1.EkmCon" +
      "nection\"A\332A\004name\202\323\344\223\0024\0222/v1/{name=projec" +
      "ts/*/locations/*/ekmConnections/*}\022\340\001\n\023C" +
      "reateEkmConnection\022/.google.cloud.kms.v1" +
      ".CreateEkmConnectionRequest\032\".google.clo" +
      "ud.kms.v1.EkmConnection\"t\332A\'parent,ekm_c" +
      "onnection_id,ekm_connection\202\323\344\223\002D\"2/v1/{" +
      "parent=projects/*/locations/*}/ekmConnec" +
      "tions:\016ekm_connection\022\342\001\n\023UpdateEkmConne" +
      "ction\022/.google.cloud.kms.v1.UpdateEkmCon" +
      "nectionRequest\032\".google.cloud.kms.v1.Ekm" +
      "Connection\"v\332A\032ekm_connection,update_mas" +
      "k\202\323\344\223\002S2A/v1/{ekm_connection.name=projec" +
      "ts/*/locations/*/ekmConnections/*}:\016ekm_" +
      "connection\022\224\001\n\014GetEkmConfig\022(.google.clo" +
      "ud.kms.v1.GetEkmConfigRequest\032\036.google.c" +
      "loud.kms.v1.EkmConfig\":\332A\004name\202\323\344\223\002-\022+/v" +
      "1/{name=projects/*/locations/*/ekmConfig" +
      "}\022\303\001\n\017UpdateEkmConfig\022+.google.cloud.kms" +
      ".v1.UpdateEkmConfigRequest\032\036.google.clou" +
      "d.kms.v1.EkmConfig\"c\332A\026ekm_config,update" +
      "_mask\202\323\344\223\002D26/v1/{ekm_config.name=projec" +
      "ts/*/locations/*/ekmConfig}:\nekm_config\022" +
      "\313\001\n\022VerifyConnectivity\022..google.cloud.km" +
      "s.v1.VerifyConnectivityRequest\032/.google." +
      "cloud.kms.v1.VerifyConnectivityResponse\"" +
      "T\332A\004name\202\323\344\223\002G\022E/v1/{name=projects/*/loc" +
      "ations/*/ekmConnections/*}:verifyConnect" +
      "ivity\032t\312A\027cloudkms.googleapis.com\322AWhttp" +
      "s://www.googleapis.com/auth/cloud-platfo" +
      "rm,https://www.googleapis.com/auth/cloud" +
      "kmsB\205\002\n\027com.google.cloud.kms.v1B\017EkmServ" +
      "iceProtoP\001Z)cloud.google.com/go/kms/apiv" +
      "1/kmspb;kmspb\370\001\001\252\002\023Google.Cloud.Kms.V1\312\002" +
      "\023Google\\Cloud\\Kms\\V1\352A|\n\'servicedirector" +
      "y.googleapis.com/Service\022Qprojects/{proj" +
      "ect}/locations/{location}/namespaces/{na" +
      "mespace}/services/{service}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor,
        new java.lang.String[] { "EkmConnections", "NextPageToken", "TotalSize", });
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor,
        new java.lang.String[] { "Parent", "EkmConnectionId", "EkmConnection", });
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor,
        new java.lang.String[] { "EkmConnection", "UpdateMask", });
    internal_static_google_cloud_kms_v1_GetEkmConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_GetEkmConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_GetEkmConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_kms_v1_UpdateEkmConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_UpdateEkmConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_UpdateEkmConfigRequest_descriptor,
        new java.lang.String[] { "EkmConfig", "UpdateMask", });
    internal_static_google_cloud_kms_v1_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_kms_v1_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_Certificate_descriptor,
        new java.lang.String[] { "RawDer", "Parsed", "Issuer", "Subject", "SubjectAlternativeDnsNames", "NotBeforeTime", "NotAfterTime", "SerialNumber", "Sha256Fingerprint", });
    internal_static_google_cloud_kms_v1_EkmConnection_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_kms_v1_EkmConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_EkmConnection_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "ServiceResolvers", "Etag", "KeyManagementMode", "CryptoSpacePath", });
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor =
      internal_static_google_cloud_kms_v1_EkmConnection_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor,
        new java.lang.String[] { "ServiceDirectoryService", "EndpointFilter", "Hostname", "ServerCertificates", });
    internal_static_google_cloud_kms_v1_EkmConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_kms_v1_EkmConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_EkmConfig_descriptor,
        new java.lang.String[] { "Name", "DefaultEkmConnection", });
    internal_static_google_cloud_kms_v1_VerifyConnectivityRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_kms_v1_VerifyConnectivityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_VerifyConnectivityRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_kms_v1_VerifyConnectivityResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_kms_v1_VerifyConnectivityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_VerifyConnectivityResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
