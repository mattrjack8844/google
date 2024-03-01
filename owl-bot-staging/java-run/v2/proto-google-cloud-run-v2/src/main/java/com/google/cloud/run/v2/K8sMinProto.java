// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public final class K8sMinProto {
  private K8sMinProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Container_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Container_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ResourceRequirements_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ResourceRequirements_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_EnvVar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_EnvVar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_EnvVarSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_EnvVarSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_SecretKeySelector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SecretKeySelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ContainerPort_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ContainerPort_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_VolumeMount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_VolumeMount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Volume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_SecretVolumeSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SecretVolumeSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_VersionToPath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_VersionToPath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_CloudSqlInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_CloudSqlInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_EmptyDirVolumeSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Probe_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Probe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_HTTPGetAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_HTTPGetAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_HTTPHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_HTTPHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_TCPSocketAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TCPSocketAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_GRPCAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_GRPCAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/run/v2/k8s.min.proto\022\023goo" +
      "gle.cloud.run.v2\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\260\003\n" +
      "\tContainer\022\014\n\004name\030\001 \001(\t\022\022\n\005image\030\002 \001(\tB" +
      "\003\340A\002\022\017\n\007command\030\003 \003(\t\022\014\n\004args\030\004 \003(\t\022(\n\003e" +
      "nv\030\005 \003(\0132\033.google.cloud.run.v2.EnvVar\022<\n" +
      "\tresources\030\006 \001(\0132).google.cloud.run.v2.R" +
      "esourceRequirements\0221\n\005ports\030\007 \003(\0132\".goo" +
      "gle.cloud.run.v2.ContainerPort\0227\n\rvolume" +
      "_mounts\030\010 \003(\0132 .google.cloud.run.v2.Volu" +
      "meMount\022\023\n\013working_dir\030\t \001(\t\0222\n\016liveness" +
      "_probe\030\n \001(\0132\032.google.cloud.run.v2.Probe" +
      "\0221\n\rstartup_probe\030\013 \001(\0132\032.google.cloud.r" +
      "un.v2.Probe\022\022\n\ndepends_on\030\014 \003(\t\"\271\001\n\024Reso" +
      "urceRequirements\022E\n\006limits\030\001 \003(\01325.googl" +
      "e.cloud.run.v2.ResourceRequirements.Limi" +
      "tsEntry\022\020\n\010cpu_idle\030\002 \001(\010\022\031\n\021startup_cpu" +
      "_boost\030\003 \001(\010\032-\n\013LimitsEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t:\0028\001\"q\n\006EnvVar\022\021\n\004name\030\001 " +
      "\001(\tB\003\340A\002\022\017\n\005value\030\002 \001(\tH\000\0229\n\014value_sourc" +
      "e\030\003 \001(\0132!.google.cloud.run.v2.EnvVarSour" +
      "ceH\000B\010\n\006values\"N\n\014EnvVarSource\022>\n\016secret" +
      "_key_ref\030\001 \001(\0132&.google.cloud.run.v2.Sec" +
      "retKeySelector\"\222\001\n\021SecretKeySelector\022;\n\006" +
      "secret\030\001 \001(\tB+\340A\002\372A%\n#secretmanager.goog" +
      "leapis.com/Secret\022@\n\007version\030\002 \001(\tB/\372A,\n" +
      "*secretmanager.googleapis.com/SecretVers" +
      "ion\"5\n\rContainerPort\022\014\n\004name\030\001 \001(\t\022\026\n\016co" +
      "ntainer_port\030\003 \001(\005\"9\n\013VolumeMount\022\021\n\004nam" +
      "e\030\001 \001(\tB\003\340A\002\022\027\n\nmount_path\030\003 \001(\tB\003\340A\002\"\352\001" +
      "\n\006Volume\022\021\n\004name\030\001 \001(\tB\003\340A\002\0229\n\006secret\030\002 " +
      "\001(\0132\'.google.cloud.run.v2.SecretVolumeSo" +
      "urceH\000\022C\n\022cloud_sql_instance\030\003 \001(\0132%.goo" +
      "gle.cloud.run.v2.CloudSqlInstanceH\000\022>\n\te" +
      "mpty_dir\030\004 \001(\0132).google.cloud.run.v2.Emp" +
      "tyDirVolumeSourceH\000B\r\n\013volume_type\"r\n\022Se" +
      "cretVolumeSource\022\023\n\006secret\030\001 \001(\tB\003\340A\002\0221\n" +
      "\005items\030\002 \003(\0132\".google.cloud.run.v2.Versi" +
      "onToPath\022\024\n\014default_mode\030\003 \001(\005\"A\n\rVersio" +
      "nToPath\022\021\n\004path\030\001 \001(\tB\003\340A\002\022\017\n\007version\030\002 " +
      "\001(\t\022\014\n\004mode\030\003 \001(\005\"%\n\020CloudSqlInstance\022\021\n" +
      "\tinstances\030\001 \003(\t\"\232\001\n\024EmptyDirVolumeSourc" +
      "e\022@\n\006medium\030\001 \001(\01620.google.cloud.run.v2." +
      "EmptyDirVolumeSource.Medium\022\022\n\nsize_limi" +
      "t\030\002 \001(\t\",\n\006Medium\022\026\n\022MEDIUM_UNSPECIFIED\020" +
      "\000\022\n\n\006MEMORY\020\001\"\245\002\n\005Probe\022\035\n\025initial_delay" +
      "_seconds\030\001 \001(\005\022\027\n\017timeout_seconds\030\002 \001(\005\022" +
      "\026\n\016period_seconds\030\003 \001(\005\022\031\n\021failure_thres" +
      "hold\030\004 \001(\005\0226\n\010http_get\030\005 \001(\0132\".google.cl" +
      "oud.run.v2.HTTPGetActionH\000\022:\n\ntcp_socket" +
      "\030\006 \001(\0132$.google.cloud.run.v2.TCPSocketAc" +
      "tionH\000\022/\n\004grpc\030\007 \001(\0132\037.google.cloud.run." +
      "v2.GRPCActionH\000B\014\n\nprobe_type\"b\n\rHTTPGet" +
      "Action\022\014\n\004path\030\001 \001(\t\0225\n\014http_headers\030\004 \003" +
      "(\0132\037.google.cloud.run.v2.HTTPHeader\022\014\n\004p" +
      "ort\030\005 \001(\005\".\n\nHTTPHeader\022\021\n\004name\030\001 \001(\tB\003\340" +
      "A\002\022\r\n\005value\030\002 \001(\t\"\037\n\017TCPSocketAction\022\014\n\004" +
      "port\030\001 \001(\005\"+\n\nGRPCAction\022\014\n\004port\030\001 \001(\005\022\017" +
      "\n\007service\030\002 \001(\tB\351\003\n\027com.google.cloud.run" +
      ".v2B\013K8sMinProtoP\001Z)cloud.google.com/go/" +
      "run/apiv2/runpb;runpb\352Ax\n!cloudkms.googl" +
      "eapis.com/CryptoKey\022Sprojects/{project}/" +
      "locations/{location}/keyRings/{key_ring}" +
      "/cryptoKeys/{crypto_key}\352AJ\n#secretmanag" +
      "er.googleapis.com/Secret\022#projects/{proj" +
      "ect}/secrets/{secret}\352Ad\n*secretmanager." +
      "googleapis.com/SecretVersion\0226projects/{" +
      "project}/secrets/{secret}/versions/{vers" +
      "ion}\352Ad\n\"vpcaccess.googleapis.com/Connec" +
      "tor\022>projects/{project}/locations/{locat" +
      "ion}/connectors/{connector}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_Container_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_Container_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Container_descriptor,
        new java.lang.String[] { "Name", "Image", "Command", "Args", "Env", "Resources", "Ports", "VolumeMounts", "WorkingDir", "LivenessProbe", "StartupProbe", "DependsOn", });
    internal_static_google_cloud_run_v2_ResourceRequirements_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_ResourceRequirements_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ResourceRequirements_descriptor,
        new java.lang.String[] { "Limits", "CpuIdle", "StartupCpuBoost", });
    internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_descriptor =
      internal_static_google_cloud_run_v2_ResourceRequirements_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_EnvVar_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_EnvVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_EnvVar_descriptor,
        new java.lang.String[] { "Name", "Value", "ValueSource", "Values", });
    internal_static_google_cloud_run_v2_EnvVarSource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_run_v2_EnvVarSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_EnvVarSource_descriptor,
        new java.lang.String[] { "SecretKeyRef", });
    internal_static_google_cloud_run_v2_SecretKeySelector_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_run_v2_SecretKeySelector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_SecretKeySelector_descriptor,
        new java.lang.String[] { "Secret", "Version", });
    internal_static_google_cloud_run_v2_ContainerPort_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_run_v2_ContainerPort_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ContainerPort_descriptor,
        new java.lang.String[] { "Name", "ContainerPort", });
    internal_static_google_cloud_run_v2_VolumeMount_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_run_v2_VolumeMount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_VolumeMount_descriptor,
        new java.lang.String[] { "Name", "MountPath", });
    internal_static_google_cloud_run_v2_Volume_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_run_v2_Volume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Volume_descriptor,
        new java.lang.String[] { "Name", "Secret", "CloudSqlInstance", "EmptyDir", "VolumeType", });
    internal_static_google_cloud_run_v2_SecretVolumeSource_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_run_v2_SecretVolumeSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_SecretVolumeSource_descriptor,
        new java.lang.String[] { "Secret", "Items", "DefaultMode", });
    internal_static_google_cloud_run_v2_VersionToPath_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_run_v2_VersionToPath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_VersionToPath_descriptor,
        new java.lang.String[] { "Path", "Version", "Mode", });
    internal_static_google_cloud_run_v2_CloudSqlInstance_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_run_v2_CloudSqlInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_CloudSqlInstance_descriptor,
        new java.lang.String[] { "Instances", });
    internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_run_v2_EmptyDirVolumeSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor,
        new java.lang.String[] { "Medium", "SizeLimit", });
    internal_static_google_cloud_run_v2_Probe_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_run_v2_Probe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Probe_descriptor,
        new java.lang.String[] { "InitialDelaySeconds", "TimeoutSeconds", "PeriodSeconds", "FailureThreshold", "HttpGet", "TcpSocket", "Grpc", "ProbeType", });
    internal_static_google_cloud_run_v2_HTTPGetAction_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_run_v2_HTTPGetAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_HTTPGetAction_descriptor,
        new java.lang.String[] { "Path", "HttpHeaders", "Port", });
    internal_static_google_cloud_run_v2_HTTPHeader_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_run_v2_HTTPHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_HTTPHeader_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_google_cloud_run_v2_TCPSocketAction_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_run_v2_TCPSocketAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_TCPSocketAction_descriptor,
        new java.lang.String[] { "Port", });
    internal_static_google_cloud_run_v2_GRPCAction_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_run_v2_GRPCAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_GRPCAction_descriptor,
        new java.lang.String[] { "Port", "Service", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
