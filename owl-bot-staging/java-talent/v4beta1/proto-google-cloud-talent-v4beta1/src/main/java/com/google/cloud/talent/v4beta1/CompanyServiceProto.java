// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public final class CompanyServiceProto {
  private CompanyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/company_se" +
      "rvice.proto\022\033google.cloud.talent.v4beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032(goo" +
      "gle/cloud/talent/v4beta1/common.proto\032)g" +
      "oogle/cloud/talent/v4beta1/company.proto" +
      "\032\033google/protobuf/empty.proto\032 google/pr" +
      "otobuf/field_mask.proto\"\211\001\n\024CreateCompan" +
      "yRequest\0224\n\006parent\030\001 \001(\tB$\342A\001\002\372A\035\022\033jobs." +
      "googleapis.com/Company\022;\n\007company\030\002 \001(\0132" +
      "$.google.cloud.talent.v4beta1.CompanyB\004\342" +
      "A\001\002\"G\n\021GetCompanyRequest\0222\n\004name\030\001 \001(\tB$" +
      "\342A\001\002\372A\035\n\033jobs.googleapis.com/Company\"\204\001\n" +
      "\024UpdateCompanyRequest\022;\n\007company\030\001 \001(\0132$" +
      ".google.cloud.talent.v4beta1.CompanyB\004\342A" +
      "\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google.protobu" +
      "f.FieldMask\"J\n\024DeleteCompanyRequest\0222\n\004n" +
      "ame\030\001 \001(\tB$\342A\001\002\372A\035\n\033jobs.googleapis.com/" +
      "Company\"\216\001\n\024ListCompaniesRequest\0224\n\006pare" +
      "nt\030\001 \001(\tB$\342A\001\002\372A\035\022\033jobs.googleapis.com/C" +
      "ompany\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030" +
      "\003 \001(\005\022\031\n\021require_open_jobs\030\004 \001(\010\"\252\001\n\025Lis" +
      "tCompaniesResponse\0227\n\tcompanies\030\001 \003(\0132$." +
      "google.cloud.talent.v4beta1.Company\022\027\n\017n" +
      "ext_page_token\030\002 \001(\t\022?\n\010metadata\030\003 \001(\0132-" +
      ".google.cloud.talent.v4beta1.ResponseMet" +
      "adata2\322\t\n\016CompanyService\022\343\001\n\rCreateCompa" +
      "ny\0221.google.cloud.talent.v4beta1.CreateC" +
      "ompanyRequest\032$.google.cloud.talent.v4be" +
      "ta1.Company\"y\332A\016parent,company\202\323\344\223\002b\"0/v" +
      "4beta1/{parent=projects/*/tenants/*}/com" +
      "panies:\001*Z+\"&/v4beta1/{parent=projects/*" +
      "}/companies:\001*\022\315\001\n\nGetCompany\022..google.c" +
      "loud.talent.v4beta1.GetCompanyRequest\032$." +
      "google.cloud.talent.v4beta1.Company\"i\332A\004" +
      "name\202\323\344\223\002\\\0220/v4beta1/{name=projects/*/te" +
      "nants/*/companies/*}Z(\022&/v4beta1/{name=p" +
      "rojects/*/companies/*}\022\355\001\n\rUpdateCompany" +
      "\0221.google.cloud.talent.v4beta1.UpdateCom" +
      "panyRequest\032$.google.cloud.talent.v4beta" +
      "1.Company\"\202\001\332A\007company\202\323\344\223\002r28/v4beta1/{" +
      "company.name=projects/*/tenants/*/compan" +
      "ies/*}:\001*Z32./v4beta1/{company.name=proj" +
      "ects/*/companies/*}:\001*\022\305\001\n\rDeleteCompany" +
      "\0221.google.cloud.talent.v4beta1.DeleteCom" +
      "panyRequest\032\026.google.protobuf.Empty\"i\332A\004" +
      "name\202\323\344\223\002\\*0/v4beta1/{name=projects/*/te" +
      "nants/*/companies/*}Z(*&/v4beta1/{name=p" +
      "rojects/*/companies/*}\022\343\001\n\rListCompanies" +
      "\0221.google.cloud.talent.v4beta1.ListCompa" +
      "niesRequest\0322.google.cloud.talent.v4beta" +
      "1.ListCompaniesResponse\"k\332A\006parent\202\323\344\223\002\\" +
      "\0220/v4beta1/{parent=projects/*/tenants/*}" +
      "/companiesZ(\022&/v4beta1/{parent=projects/" +
      "*}/companies\032l\312A\023jobs.googleapis.com\322ASh" +
      "ttps://www.googleapis.com/auth/cloud-pla" +
      "tform,https://www.googleapis.com/auth/jo" +
      "bsBw\n\037com.google.cloud.talent.v4beta1B\023C" +
      "ompanyServiceProtoP\001Z7cloud.google.com/g" +
      "o/talent/apiv4beta1/talentpb;talentpb\242\002\003" +
      "CTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor,
        new java.lang.String[] { "Parent", "Company", });
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor,
        new java.lang.String[] { "Company", "UpdateMask", });
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", "RequireOpenJobs", });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor,
        new java.lang.String[] { "Companies", "NextPageToken", "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
