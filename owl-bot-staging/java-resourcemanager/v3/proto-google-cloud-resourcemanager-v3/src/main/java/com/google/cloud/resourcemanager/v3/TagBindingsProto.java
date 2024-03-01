// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public final class TagBindingsProto {
  private TagBindingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_TagBinding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_EffectiveTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_EffectiveTag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/resourcemanager/v3/tag_bi" +
      "ndings.proto\022\037google.cloud.resourcemanag" +
      "er.v3\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032#google/longrunning/operations.proto\032\033g" +
      "oogle/protobuf/empty.proto\"\265\001\n\nTagBindin" +
      "g\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\016\n\006parent\030\002 \001(\t\022\021\n\t" +
      "tag_value\030\003 \001(\t\022!\n\031tag_value_namespaced_" +
      "name\030\004 \001(\t:N\352AK\n.cloudresourcemanager.go" +
      "ogleapis.com/TagBinding\022\031tagBindings/{ta" +
      "g_binding}\"\032\n\030CreateTagBindingMetadata\"|" +
      "\n\027CreateTagBindingRequest\022E\n\013tag_binding" +
      "\030\001 \001(\0132+.google.cloud.resourcemanager.v3" +
      ".TagBindingB\003\340A\002\022\032\n\rvalidate_only\030\002 \001(\010B" +
      "\003\340A\001\"\032\n\030DeleteTagBindingMetadata\"_\n\027Dele" +
      "teTagBindingRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A" +
      "0\n.cloudresourcemanager.googleapis.com/T" +
      "agBinding\"d\n\026ListTagBindingsRequest\022\031\n\006p" +
      "arent\030\001 \001(\tB\t\340A\002\372A\003\022\001*\022\026\n\tpage_size\030\002 \001(" +
      "\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"u\n\027ListT" +
      "agBindingsResponse\022A\n\014tag_bindings\030\001 \003(\013" +
      "2+.google.cloud.resourcemanager.v3.TagBi" +
      "nding\022\027\n\017next_page_token\030\002 \001(\t\"`\n\030ListEf" +
      "fectiveTagsRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022" +
      "\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 " +
      "\001(\tB\003\340A\001\"{\n\031ListEffectiveTagsResponse\022E\n" +
      "\016effective_tags\030\001 \003(\0132-.google.cloud.res" +
      "ourcemanager.v3.EffectiveTag\022\027\n\017next_pag" +
      "e_token\030\002 \001(\t\"\200\002\n\014EffectiveTag\022D\n\ttag_va" +
      "lue\030\001 \001(\tB1\372A.\n,cloudresourcemanager.goo" +
      "gleapis.com/TagValue\022\034\n\024namespaced_tag_v" +
      "alue\030\002 \001(\t\022@\n\007tag_key\030\003 \001(\tB/\372A,\n*cloudr" +
      "esourcemanager.googleapis.com/TagKey\022\032\n\022" +
      "namespaced_tag_key\030\004 \001(\t\022\033\n\023tag_key_pare" +
      "nt_name\030\006 \001(\t\022\021\n\tinherited\030\005 \001(\0102\221\007\n\013Tag" +
      "Bindings\022\246\001\n\017ListTagBindings\0227.google.cl" +
      "oud.resourcemanager.v3.ListTagBindingsRe" +
      "quest\0328.google.cloud.resourcemanager.v3." +
      "ListTagBindingsResponse\" \332A\006parent\202\323\344\223\002\021" +
      "\022\017/v3/tagBindings\022\310\001\n\020CreateTagBinding\0228" +
      ".google.cloud.resourcemanager.v3.CreateT" +
      "agBindingRequest\032\035.google.longrunning.Op" +
      "eration\"[\312A&\n\nTagBinding\022\030CreateTagBindi" +
      "ngMetadata\332A\013tag_binding\202\323\344\223\002\036\"\017/v3/tagB" +
      "indings:\013tag_binding\022\311\001\n\020DeleteTagBindin" +
      "g\0228.google.cloud.resourcemanager.v3.Dele" +
      "teTagBindingRequest\032\035.google.longrunning" +
      ".Operation\"\\\312A1\n\025google.protobuf.Empty\022\030" +
      "DeleteTagBindingMetadata\332A\004name\202\323\344\223\002\033*\031/" +
      "v3/{name=tagBindings/**}\022\256\001\n\021ListEffecti" +
      "veTags\0229.google.cloud.resourcemanager.v3" +
      ".ListEffectiveTagsRequest\032:.google.cloud" +
      ".resourcemanager.v3.ListEffectiveTagsRes" +
      "ponse\"\"\332A\006parent\202\323\344\223\002\023\022\021/v3/effectiveTag" +
      "s\032\220\001\312A#cloudresourcemanager.googleapis.c" +
      "om\322Aghttps://www.googleapis.com/auth/clo" +
      "ud-platform,https://www.googleapis.com/a" +
      "uth/cloud-platform.read-onlyB\361\001\n#com.goo" +
      "gle.cloud.resourcemanager.v3B\020TagBinding" +
      "sProtoP\001ZMcloud.google.com/go/resourcema" +
      "nager/apiv3/resourcemanagerpb;resourcema" +
      "nagerpb\252\002\037Google.Cloud.ResourceManager.V" +
      "3\312\002\037Google\\Cloud\\ResourceManager\\V3\352\002\"Go" +
      "ogle::Cloud::ResourceManager::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_TagBinding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor,
        new java.lang.String[] { "Name", "Parent", "TagValue", "TagValueNamespacedName", });
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor,
        new java.lang.String[] { "TagBinding", "ValidateOnly", });
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor,
        new java.lang.String[] { "TagBindings", "NextPageToken", });
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_ListEffectiveTagsResponse_descriptor,
        new java.lang.String[] { "EffectiveTags", "NextPageToken", });
    internal_static_google_cloud_resourcemanager_v3_EffectiveTag_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_resourcemanager_v3_EffectiveTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_EffectiveTag_descriptor,
        new java.lang.String[] { "TagValue", "NamespacedTagValue", "TagKey", "NamespacedTagKey", "TagKeyParentName", "Inherited", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
