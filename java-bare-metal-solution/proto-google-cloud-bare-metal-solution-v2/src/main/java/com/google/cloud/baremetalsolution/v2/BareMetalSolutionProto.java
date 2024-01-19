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
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

package com.google.cloud.baremetalsolution.v2;

public final class BareMetalSolutionProto {
  private BareMetalSolutionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/baremetalsolution/v2/bare"
          + "metalsolution.proto\022!google.cloud.bareme"
          + "talsolution.v2\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\0320google/cloud/bar"
          + "emetalsolution/v2/instance.proto\032+google"
          + "/cloud/baremetalsolution/v2/lun.proto\032/g"
          + "oogle/cloud/baremetalsolution/v2/network"
          + ".proto\0321google/cloud/baremetalsolution/v"
          + "2/nfs_share.proto\032/google/cloud/baremeta"
          + "lsolution/v2/osimage.proto\0324google/cloud"
          + "/baremetalsolution/v2/provisioning.proto"
          + "\032/google/cloud/baremetalsolution/v2/ssh_"
          + "key.proto\032.google/cloud/baremetalsolutio"
          + "n/v2/volume.proto\0327google/cloud/baremeta"
          + "lsolution/v2/volume_snapshot.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\207\002\n\021OperationMetadata\0225\n\013c"
          + "reate_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\0222\n\010end_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004"
          + "\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004\342A\001\003\022\034\n\016status_messa"
          + "ge\030\005 \001(\tB\004\342A\001\003\022$\n\026requested_cancellation"
          + "\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_version\030\007 \001(\tB\004\342A\001\003\""
          + "\027\n\025ResetInstanceResponse2\272K\n\021BareMetalSo"
          + "lution\022\302\001\n\rListInstances\0227.google.cloud."
          + "baremetalsolution.v2.ListInstancesReques"
          + "t\0328.google.cloud.baremetalsolution.v2.Li"
          + "stInstancesResponse\">\332A\006parent\202\323\344\223\002/\022-/v"
          + "2/{parent=projects/*/locations/*}/instan"
          + "ces\022\257\001\n\013GetInstance\0225.google.cloud.barem"
          + "etalsolution.v2.GetInstanceRequest\032+.goo"
          + "gle.cloud.baremetalsolution.v2.Instance\""
          + "<\332A\004name\202\323\344\223\002/\022-/v2/{name=projects/*/loc"
          + "ations/*/instances/*}\022\352\001\n\016UpdateInstance"
          + "\0228.google.cloud.baremetalsolution.v2.Upd"
          + "ateInstanceRequest\032\035.google.longrunning."
          + "Operation\"\177\312A\035\n\010Instance\022\021OperationMetad"
          + "ata\332A\024instance,update_mask\202\323\344\223\002B26/v2/{i"
          + "nstance.name=projects/*/locations/*/inst"
          + "ances/*}:\010instance\022\317\001\n\016RenameInstance\0228."
          + "google.cloud.baremetalsolution.v2.Rename"
          + "InstanceRequest\032+.google.cloud.baremetal"
          + "solution.v2.Instance\"V\332A\024name,new_instan"
          + "ce_id\202\323\344\223\0029\"4/v2/{name=projects/*/locati"
          + "ons/*/instances/*}:rename:\001*\022\333\001\n\rResetIn"
          + "stance\0227.google.cloud.baremetalsolution."
          + "v2.ResetInstanceRequest\032\035.google.longrun"
          + "ning.Operation\"r\312A*\n\025ResetInstanceRespon"
          + "se\022\021OperationMetadata\332A\004name\202\323\344\223\0028\"3/v2/"
          + "{name=projects/*/locations/*/instances/*"
          + "}:reset:\001*\022\333\001\n\rStartInstance\0227.google.cl"
          + "oud.baremetalsolution.v2.StartInstanceRe"
          + "quest\032\035.google.longrunning.Operation\"r\312A"
          + "*\n\025StartInstanceResponse\022\021OperationMetad"
          + "ata\332A\004name\202\323\344\223\0028\"3/v2/{name=projects/*/l"
          + "ocations/*/instances/*}:start:\001*\022\327\001\n\014Sto"
          + "pInstance\0226.google.cloud.baremetalsoluti"
          + "on.v2.StopInstanceRequest\032\035.google.longr"
          + "unning.Operation\"p\312A)\n\024StopInstanceRespo"
          + "nse\022\021OperationMetadata\332A\004name\202\323\344\223\0027\"2/v2"
          + "/{name=projects/*/locations/*/instances/"
          + "*}:stop:\001*\022\250\002\n\036EnableInteractiveSerialCo"
          + "nsole\022H.google.cloud.baremetalsolution.v"
          + "2.EnableInteractiveSerialConsoleRequest\032"
          + "\035.google.longrunning.Operation\"\234\001\312A;\n&En"
          + "ableInteractiveSerialConsoleResponse\022\021Op"
          + "erationMetadata\332A\004name\202\323\344\223\002Q\"L/v2/{name="
          + "projects/*/locations/*/instances/*}:enab"
          + "leInteractiveSerialConsole:\001*\022\254\002\n\037Disabl"
          + "eInteractiveSerialConsole\022I.google.cloud"
          + ".baremetalsolution.v2.DisableInteractive"
          + "SerialConsoleRequest\032\035.google.longrunnin"
          + "g.Operation\"\236\001\312A<\n\'DisableInteractiveSer"
          + "ialConsoleResponse\022\021OperationMetadata\332A\004"
          + "name\202\323\344\223\002R\"M/v2/{name=projects/*/locatio"
          + "ns/*/instances/*}:disableInteractiveSeri"
          + "alConsole:\001*\022\326\001\n\tDetachLun\0223.google.clou"
          + "d.baremetalsolution.v2.DetachLunRequest\032"
          + "\035.google.longrunning.Operation\"u\312A\035\n\010Ins"
          + "tance\022\021OperationMetadata\332A\014instance,lun\202"
          + "\323\344\223\002@\";/v2/{instance=projects/*/location"
          + "s/*/instances/*}:detachLun:\001*\022\272\001\n\013ListSS"
          + "HKeys\0225.google.cloud.baremetalsolution.v"
          + "2.ListSSHKeysRequest\0326.google.cloud.bare"
          + "metalsolution.v2.ListSSHKeysResponse\"<\332A"
          + "\006parent\202\323\344\223\002-\022+/v2/{parent=projects/*/lo"
          + "cations/*}/sshKeys\022\313\001\n\014CreateSSHKey\0226.go"
          + "ogle.cloud.baremetalsolution.v2.CreateSS"
          + "HKeyRequest\032).google.cloud.baremetalsolu"
          + "tion.v2.SSHKey\"X\332A\031parent,ssh_key,ssh_ke"
          + "y_id\202\323\344\223\0026\"+/v2/{parent=projects/*/locat"
          + "ions/*}/sshKeys:\007ssh_key\022\232\001\n\014DeleteSSHKe"
          + "y\0226.google.cloud.baremetalsolution.v2.De"
          + "leteSSHKeyRequest\032\026.google.protobuf.Empt"
          + "y\":\332A\004name\202\323\344\223\002-*+/v2/{name=projects/*/l"
          + "ocations/*/sshKeys/*}\022\272\001\n\013ListVolumes\0225."
          + "google.cloud.baremetalsolution.v2.ListVo"
          + "lumesRequest\0326.google.cloud.baremetalsol"
          + "ution.v2.ListVolumesResponse\"<\332A\006parent\202"
          + "\323\344\223\002-\022+/v2/{parent=projects/*/locations/"
          + "*}/volumes\022\247\001\n\tGetVolume\0223.google.cloud."
          + "baremetalsolution.v2.GetVolumeRequest\032)."
          + "google.cloud.baremetalsolution.v2.Volume"
          + "\":\332A\004name\202\323\344\223\002-\022+/v2/{name=projects/*/lo"
          + "cations/*/volumes/*}\022\334\001\n\014UpdateVolume\0226."
          + "google.cloud.baremetalsolution.v2.Update"
          + "VolumeRequest\032\035.google.longrunning.Opera"
          + "tion\"u\312A\033\n\006Volume\022\021OperationMetadata\332A\022v"
          + "olume,update_mask\202\323\344\223\002<22/v2/{volume.nam"
          + "e=projects/*/locations/*/volumes/*}:\006vol"
          + "ume\022\305\001\n\014RenameVolume\0226.google.cloud.bare"
          + "metalsolution.v2.RenameVolumeRequest\032).g"
          + "oogle.cloud.baremetalsolution.v2.Volume\""
          + "R\332A\022name,new_volume_id\202\323\344\223\0027\"2/v2/{name="
          + "projects/*/locations/*/volumes/*}:rename"
          + ":\001*\022\325\001\n\013EvictVolume\0225.google.cloud.barem"
          + "etalsolution.v2.EvictVolumeRequest\032\035.goo"
          + "gle.longrunning.Operation\"p\312A*\n\025google.p"
          + "rotobuf.Empty\022\021OperationMetadata\332A\004name\202"
          + "\323\344\223\0026\"1/v2/{name=projects/*/locations/*/"
          + "volumes/*}:evict:\001*\022\326\001\n\014ResizeVolume\0226.g"
          + "oogle.cloud.baremetalsolution.v2.ResizeV"
          + "olumeRequest\032\035.google.longrunning.Operat"
          + "ion\"o\312A\033\n\006Volume\022\021OperationMetadata\332A\017vo"
          + "lume,size_gib\202\323\344\223\0029\"4/v2/{volume=project"
          + "s/*/locations/*/volumes/*}:resize:\001*\022\276\001\n"
          + "\014ListNetworks\0226.google.cloud.baremetalso"
          + "lution.v2.ListNetworksRequest\0327.google.c"
          + "loud.baremetalsolution.v2.ListNetworksRe"
          + "sponse\"=\332A\006parent\202\323\344\223\002.\022,/v2/{parent=pro"
          + "jects/*/locations/*}/networks\022\337\001\n\020ListNe"
          + "tworkUsage\022:.google.cloud.baremetalsolut"
          + "ion.v2.ListNetworkUsageRequest\032;.google."
          + "cloud.baremetalsolution.v2.ListNetworkUs"
          + "ageResponse\"R\332A\010location\202\323\344\223\002A\022?/v2/{loc"
          + "ation=projects/*/locations/*}/networks:l"
          + "istNetworkUsage\022\253\001\n\nGetNetwork\0224.google."
          + "cloud.baremetalsolution.v2.GetNetworkReq"
          + "uest\032*.google.cloud.baremetalsolution.v2"
          + ".Network\";\332A\004name\202\323\344\223\002.\022,/v2/{name=proje"
          + "cts/*/locations/*/networks/*}\022\343\001\n\rUpdate"
          + "Network\0227.google.cloud.baremetalsolution"
          + ".v2.UpdateNetworkRequest\032\035.google.longru"
          + "nning.Operation\"z\312A\034\n\007Network\022\021Operation"
          + "Metadata\332A\023network,update_mask\202\323\344\223\002?24/v"
          + "2/{network.name=projects/*/locations/*/n"
          + "etworks/*}:\007network\022\364\001\n\024CreateVolumeSnap"
          + "shot\022>.google.cloud.baremetalsolution.v2"
          + ".CreateVolumeSnapshotRequest\0321.google.cl"
          + "oud.baremetalsolution.v2.VolumeSnapshot\""
          + "i\332A\026parent,volume_snapshot\202\323\344\223\002J\"7/v2/{p"
          + "arent=projects/*/locations/*/volumes/*}/"
          + "snapshots:\017volume_snapshot\022\225\002\n\025RestoreVo"
          + "lumeSnapshot\022?.google.cloud.baremetalsol"
          + "ution.v2.RestoreVolumeSnapshotRequest\032\035."
          + "google.longrunning.Operation\"\233\001\312A#\n\016Volu"
          + "meSnapshot\022\021OperationMetadata\332A\017volume_s"
          + "napshot\202\323\344\223\002]\"X/v2/{volume_snapshot=proj"
          + "ects/*/locations/*/volumes/*/snapshots/*"
          + "}:restoreVolumeSnapshot:\001*\022\266\001\n\024DeleteVol"
          + "umeSnapshot\022>.google.cloud.baremetalsolu"
          + "tion.v2.DeleteVolumeSnapshotRequest\032\026.go"
          + "ogle.protobuf.Empty\"F\332A\004name\202\323\344\223\0029*7/v2/"
          + "{name=projects/*/locations/*/volumes/*/s"
          + "napshots/*}\022\313\001\n\021GetVolumeSnapshot\022;.goog"
          + "le.cloud.baremetalsolution.v2.GetVolumeS"
          + "napshotRequest\0321.google.cloud.baremetals"
          + "olution.v2.VolumeSnapshot\"F\332A\004name\202\323\344\223\0029"
          + "\0227/v2/{name=projects/*/locations/*/volum"
          + "es/*/snapshots/*}\022\336\001\n\023ListVolumeSnapshot"
          + "s\022=.google.cloud.baremetalsolution.v2.Li"
          + "stVolumeSnapshotsRequest\032>.google.cloud."
          + "baremetalsolution.v2.ListVolumeSnapshots"
          + "Response\"H\332A\006parent\202\323\344\223\0029\0227/v2/{parent=p"
          + "rojects/*/locations/*/volumes/*}/snapsho"
          + "ts\022\245\001\n\006GetLun\0220.google.cloud.baremetalso"
          + "lution.v2.GetLunRequest\032&.google.cloud.b"
          + "aremetalsolution.v2.Lun\"A\332A\004name\202\323\344\223\0024\0222"
          + "/v2/{name=projects/*/locations/*/volumes"
          + "/*/luns/*}\022\270\001\n\010ListLuns\0222.google.cloud.b"
          + "aremetalsolution.v2.ListLunsRequest\0323.go"
          + "ogle.cloud.baremetalsolution.v2.ListLuns"
          + "Response\"C\332A\006parent\202\323\344\223\0024\0222/v2/{parent=p"
          + "rojects/*/locations/*/volumes/*}/luns\022\326\001"
          + "\n\010EvictLun\0222.google.cloud.baremetalsolut"
          + "ion.v2.EvictLunRequest\032\035.google.longrunn"
          + "ing.Operation\"w\312A*\n\025google.protobuf.Empt"
          + "y\022\021OperationMetadata\332A\004name\202\323\344\223\002=\"8/v2/{"
          + "name=projects/*/locations/*/volumes/*/lu"
          + "ns/*}:evict:\001*\022\257\001\n\013GetNfsShare\0225.google."
          + "cloud.baremetalsolution.v2.GetNfsShareRe"
          + "quest\032+.google.cloud.baremetalsolution.v"
          + "2.NfsShare\"<\332A\004name\202\323\344\223\002/\022-/v2/{name=pro"
          + "jects/*/locations/*/nfsShares/*}\022\302\001\n\rLis"
          + "tNfsShares\0227.google.cloud.baremetalsolut"
          + "ion.v2.ListNfsSharesRequest\0328.google.clo"
          + "ud.baremetalsolution.v2.ListNfsSharesRes"
          + "ponse\">\332A\006parent\202\323\344\223\002/\022-/v2/{parent=proj"
          + "ects/*/locations/*}/nfsShares\022\356\001\n\016Update"
          + "NfsShare\0228.google.cloud.baremetalsolutio"
          + "n.v2.UpdateNfsShareRequest\032\035.google.long"
          + "running.Operation\"\202\001\312A\035\n\010NfsShare\022\021Opera"
          + "tionMetadata\332A\025nfs_share,update_mask\202\323\344\223"
          + "\002D27/v2/{nfs_share.name=projects/*/locat"
          + "ions/*/nfsShares/*}:\tnfs_share\022\336\001\n\016Creat"
          + "eNfsShare\0228.google.cloud.baremetalsoluti"
          + "on.v2.CreateNfsShareRequest\032\035.google.lon"
          + "grunning.Operation\"s\312A\035\n\010NfsShare\022\021Opera"
          + "tionMetadata\332A\020parent,nfs_share\202\323\344\223\002:\"-/"
          + "v2/{parent=projects/*/locations/*}/nfsSh"
          + "ares:\tnfs_share\022\317\001\n\016RenameNfsShare\0228.goo"
          + "gle.cloud.baremetalsolution.v2.RenameNfs"
          + "ShareRequest\032+.google.cloud.baremetalsol"
          + "ution.v2.NfsShare\"V\332A\024name,new_nfsshare_"
          + "id\202\323\344\223\0029\"4/v2/{name=projects/*/locations"
          + "/*/nfsShares/*}:rename:\001*\022\324\001\n\016DeleteNfsS"
          + "hare\0228.google.cloud.baremetalsolution.v2"
          + ".DeleteNfsShareRequest\032\035.google.longrunn"
          + "ing.Operation\"i\312A*\n\025google.protobuf.Empt"
          + "y\022\021OperationMetadata\332A\004name\202\323\344\223\002/*-/v2/{"
          + "name=projects/*/locations/*/nfsShares/*}"
          + "\022\346\001\n\026ListProvisioningQuotas\022@.google.clo"
          + "ud.baremetalsolution.v2.ListProvisioning"
          + "QuotasRequest\032A.google.cloud.baremetalso"
          + "lution.v2.ListProvisioningQuotasResponse"
          + "\"G\332A\006parent\202\323\344\223\0028\0226/v2/{parent=projects/"
          + "*/locations/*}/provisioningQuotas\022\213\002\n\030Su"
          + "bmitProvisioningConfig\022B.google.cloud.ba"
          + "remetalsolution.v2.SubmitProvisioningCon"
          + "figRequest\032C.google.cloud.baremetalsolut"
          + "ion.v2.SubmitProvisioningConfigResponse\""
          + "f\332A\032parent,provisioning_config\202\323\344\223\002C\">/v"
          + "2/{parent=projects/*/locations/*}/provis"
          + "ioningConfigs:submit:\001*\022\327\001\n\025GetProvision"
          + "ingConfig\022?.google.cloud.baremetalsoluti"
          + "on.v2.GetProvisioningConfigRequest\0325.goo"
          + "gle.cloud.baremetalsolution.v2.Provision"
          + "ingConfig\"F\332A\004name\202\323\344\223\0029\0227/v2/{name=proj"
          + "ects/*/locations/*/provisioningConfigs/*"
          + "}\022\210\002\n\030CreateProvisioningConfig\022B.google."
          + "cloud.baremetalsolution.v2.CreateProvisi"
          + "oningConfigRequest\0325.google.cloud.bareme"
          + "talsolution.v2.ProvisioningConfig\"q\332A\032pa"
          + "rent,provisioning_config\202\323\344\223\002N\"7/v2/{par"
          + "ent=projects/*/locations/*}/provisioning"
          + "Configs:\023provisioning_config\022\242\002\n\030UpdateP"
          + "rovisioningConfig\022B.google.cloud.baremet"
          + "alsolution.v2.UpdateProvisioningConfigRe"
          + "quest\0325.google.cloud.baremetalsolution.v"
          + "2.ProvisioningConfig\"\212\001\332A\037provisioning_c"
          + "onfig,update_mask\202\323\344\223\002b2K/v2/{provisioni"
          + "ng_config.name=projects/*/locations/*/pr"
          + "ovisioningConfigs/*}:\023provisioning_confi"
          + "g\022\312\001\n\rRenameNetwork\0227.google.cloud.barem"
          + "etalsolution.v2.RenameNetworkRequest\032*.g"
          + "oogle.cloud.baremetalsolution.v2.Network"
          + "\"T\332A\023name,new_network_id\202\323\344\223\0028\"3/v2/{nam"
          + "e=projects/*/locations/*/networks/*}:ren"
          + "ame:\001*\022\276\001\n\014ListOSImages\0226.google.cloud.b"
          + "aremetalsolution.v2.ListOSImagesRequest\032"
          + "7.google.cloud.baremetalsolution.v2.List"
          + "OSImagesResponse\"=\332A\006parent\202\323\344\223\002.\022,/v2/{"
          + "parent=projects/*/locations/*}/osImages\032"
          + "T\312A baremetalsolution.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformB\205\002\n%com.google.cloud.baremetalsolu"
          + "tion.v2B\026BareMetalSolutionProtoP\001ZScloud"
          + ".google.com/go/baremetalsolution/apiv2/b"
          + "aremetalsolutionpb;baremetalsolutionpb\252\002"
          + "!Google.Cloud.BareMetalSolution.V2\312\002!Goo"
          + "gle\\Cloud\\BareMetalSolution\\V2\352\002$Google:"
          + ":Cloud::BareMetalSolution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.OsImageProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.ProvisioningProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.SshKeyProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeSnapshotProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.OsImageProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.ProvisioningProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.SshKeyProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeSnapshotProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
