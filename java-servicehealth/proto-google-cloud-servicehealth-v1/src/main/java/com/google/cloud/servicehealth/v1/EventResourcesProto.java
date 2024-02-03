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
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.servicehealth.v1;

public final class EventResourcesProto {
  private EventResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_Event_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_OrganizationEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_OrganizationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_EventUpdate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_EventUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_Product_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_EventImpact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_EventImpact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_OrganizationImpact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_OrganizationImpact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_GetEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_GetEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_GetOrganizationEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_GetOrganizationEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicehealth_v1_GetOrganizationImpactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicehealth_v1_GetOrganizationImpactRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/servicehealth/v1/event_re"
          + "sources.proto\022\035google.cloud.servicehealt"
          + "h.v1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032\037google/protobu"
          + "f/timestamp.proto\"\237\013\n\005Event\022\023\n\004name\030\001 \001("
          + "\tB\005\342A\002\003\010\022\023\n\005title\030\002 \001(\tB\004\342A\001\003\022\031\n\013descrip"
          + "tion\030\003 \001(\tB\004\342A\001\003\022J\n\010category\030\004 \001(\01622.goo"
          + "gle.cloud.servicehealth.v1.Event.EventCa"
          + "tegoryB\004\342A\001\003\022V\n\021detailed_category\030\025 \001(\0162"
          + "5.google.cloud.servicehealth.v1.Event.De"
          + "tailedCategoryB\004\342A\001\003\022?\n\005state\030\005 \001(\0162*.go"
          + "ogle.cloud.servicehealth.v1.Event.StateB"
          + "\004\342A\001\003\022P\n\016detailed_state\030\023 \001(\01622.google.c"
          + "loud.servicehealth.v1.Event.DetailedStat"
          + "eB\004\342A\001\003\022A\n\revent_impacts\030\024 \003(\0132*.google."
          + "cloud.servicehealth.v1.EventImpact\022G\n\tre"
          + "levance\030\010 \001(\0162..google.cloud.serviceheal"
          + "th.v1.Event.RelevanceB\004\342A\001\003\022A\n\007updates\030\t"
          + " \003(\0132*.google.cloud.servicehealth.v1.Eve"
          + "ntUpdateB\004\342A\001\003\022\032\n\014parent_event\030\n \001(\tB\004\342A"
          + "\001\003\0225\n\013update_time\030\014 \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\0224\n\nstart_time\030\r \001(\0132\032."
          + "google.protobuf.TimestampB\004\342A\001\003\0222\n\010end_t"
          + "ime\030\016 \001(\0132\032.google.protobuf.TimestampB\004\342"
          + "A\001\003\022:\n\020next_update_time\030\017 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\"=\n\rEventCategory"
          + "\022\036\n\032EVENT_CATEGORY_UNSPECIFIED\020\000\022\014\n\010INCI"
          + "DENT\020\002\"d\n\020DetailedCategory\022!\n\035DETAILED_C"
          + "ATEGORY_UNSPECIFIED\020\000\022\026\n\022CONFIRMED_INCID"
          + "ENT\020\001\022\025\n\021EMERGING_INCIDENT\020\002\"6\n\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006CLOS"
          + "ED\020\002\"\213\001\n\rDetailedState\022\036\n\032DETAILED_STATE"
          + "_UNSPECIFIED\020\000\022\014\n\010EMERGING\020\001\022\r\n\tCONFIRME"
          + "D\020\002\022\014\n\010RESOLVED\020\003\022\n\n\006MERGED\020\004\022\017\n\013AUTO_CL"
          + "OSED\020\t\022\022\n\016FALSE_POSITIVE\020\n\"w\n\tRelevance\022"
          + "\031\n\025RELEVANCE_UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\002\022"
          + "\020\n\014NOT_IMPACTED\020\006\022\025\n\021PARTIALLY_RELATED\020\007"
          + "\022\013\n\007RELATED\020\010\022\014\n\010IMPACTED\020\t:n\352Ak\n\"servic"
          + "ehealth.googleapis.com/Event\0226projects/{"
          + "project}/locations/{location}/events/{ev"
          + "ent}*\006events2\005event\"\333\n\n\021OrganizationEven"
          + "t\022\023\n\004name\030\001 \001(\tB\005\342A\002\003\010\022\023\n\005title\030\002 \001(\tB\004\342"
          + "A\001\003\022\031\n\013description\030\003 \001(\tB\004\342A\001\003\022V\n\010catego"
          + "ry\030\004 \001(\0162>.google.cloud.servicehealth.v1"
          + ".OrganizationEvent.EventCategoryB\004\342A\001\003\022b"
          + "\n\021detailed_category\030\021 \001(\0162A.google.cloud"
          + ".servicehealth.v1.OrganizationEvent.Deta"
          + "iledCategoryB\004\342A\001\003\022K\n\005state\030\005 \001(\01626.goog"
          + "le.cloud.servicehealth.v1.OrganizationEv"
          + "ent.StateB\004\342A\001\003\022\\\n\016detailed_state\030\020 \001(\0162"
          + ">.google.cloud.servicehealth.v1.Organiza"
          + "tionEvent.DetailedStateB\004\342A\001\003\022G\n\revent_i"
          + "mpacts\030\017 \003(\0132*.google.cloud.servicehealt"
          + "h.v1.EventImpactB\004\342A\001\003\022A\n\007updates\030\010 \003(\0132"
          + "*.google.cloud.servicehealth.v1.EventUpd"
          + "ateB\004\342A\001\003\022\032\n\014parent_event\030\t \001(\tB\004\342A\001\003\0225\n"
          + "\013update_time\030\013 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\0224\n\nstart_time\030\014 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\004\342A\001\003\0222\n\010end_time\030\r"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022:"
          + "\n\020next_update_time\030\016 \001(\0132\032.google.protob"
          + "uf.TimestampB\004\342A\001\003\"=\n\rEventCategory\022\036\n\032E"
          + "VENT_CATEGORY_UNSPECIFIED\020\000\022\014\n\010INCIDENT\020"
          + "\002\"d\n\020DetailedCategory\022!\n\035DETAILED_CATEGO"
          + "RY_UNSPECIFIED\020\000\022\026\n\022CONFIRMED_INCIDENT\020\001"
          + "\022\025\n\021EMERGING_INCIDENT\020\002\"6\n\005State\022\025\n\021STAT"
          + "E_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006CLOSED\020\002\""
          + "\213\001\n\rDetailedState\022\036\n\032DETAILED_STATE_UNSP"
          + "ECIFIED\020\000\022\014\n\010EMERGING\020\001\022\r\n\tCONFIRMED\020\002\022\014"
          + "\n\010RESOLVED\020\003\022\n\n\006MERGED\020\004\022\017\n\013AUTO_CLOSED\020"
          + "\t\022\022\n\016FALSE_POSITIVE\020\n:\251\001\352A\245\001\n.servicehea"
          + "lth.googleapis.com/OrganizationEvent\022Lor"
          + "ganizations/{organization}/locations/{lo"
          + "cation}/organizationEvents/{event}*\022orga"
          + "nizationEvents2\021organizationEvent\"\245\001\n\013Ev"
          + "entUpdate\0225\n\013update_time\030\001 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\022\023\n\005title\030\002 \001(\tB"
          + "\004\342A\001\003\022\031\n\013description\030\003 \001(\tB\004\342A\001\003\022\025\n\007symp"
          + "tom\030\004 \001(\tB\004\342A\001\003\022\030\n\nworkaround\030\005 \001(\tB\004\342A\001"
          + "\003\"!\n\010Location\022\025\n\rlocation_name\030\001 \001(\t\"\037\n\007"
          + "Product\022\024\n\014product_name\030\001 \001(\t\"\201\001\n\013EventI"
          + "mpact\0227\n\007product\030\001 \001(\0132&.google.cloud.se"
          + "rvicehealth.v1.Product\0229\n\010location\030\002 \001(\013"
          + "2\'.google.cloud.servicehealth.v1.Locatio"
          + "n\"\226\003\n\022OrganizationImpact\022\023\n\004name\030\001 \001(\tB\005"
          + "\342A\002\003\010\022;\n\006events\030\002 \003(\tB+\342A\001\003\372A$\n\"serviceh"
          + "ealth.googleapis.com/Event\0229\n\005asset\030\003 \001("
          + "\0132$.google.cloud.servicehealth.v1.AssetB"
          + "\004\342A\001\003\0225\n\013update_time\030\004 \001(\0132\032.google.prot"
          + "obuf.TimestampB\004\342A\001\003:\273\001\352A\267\001\n/serviceheal"
          + "th.googleapis.com/OrganizationImpact\022[or"
          + "ganizations/{organization}/locations/{lo"
          + "cation}/organizationImpacts/{organizatio"
          + "n_impact}*\023organizationImpacts2\022organiza"
          + "tionImpact\";\n\005Asset\022\030\n\nasset_name\030\001 \001(\tB"
          + "\004\342A\001\003\022\030\n\nasset_type\030\002 \001(\tB\004\342A\001\003\"\327\001\n\021List"
          + "EventsRequest\022;\n\006parent\030\001 \001(\tB+\342A\001\002\372A$\022\""
          + "servicehealth.googleapis.com/Event\022\027\n\tpa"
          + "ge_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB"
          + "\004\342A\001\001\022\024\n\006filter\030\004 \001(\tB\004\342A\001\001\022<\n\004view\030\006 \001("
          + "\0162(.google.cloud.servicehealth.v1.EventV"
          + "iewB\004\342A\001\001\"\212\001\n\022ListEventsResponse\022:\n\006even"
          + "ts\030\001 \003(\0132$.google.cloud.servicehealth.v1"
          + ".EventB\004\342A\001\003\022\035\n\017next_page_token\030\002 \001(\tB\004\342"
          + "A\001\003\022\031\n\013unreachable\030\003 \003(\tB\004\342A\001\003\"L\n\017GetEve"
          + "ntRequest\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A$\n\"servic"
          + "ehealth.googleapis.com/Event\"\373\001\n\035ListOrg"
          + "anizationEventsRequest\022G\n\006parent\030\001 \001(\tB7"
          + "\342A\001\002\372A0\022.servicehealth.googleapis.com/Or"
          + "ganizationEvent\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001"
          + "\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001"
          + "(\tB\004\342A\001\001\022H\n\004view\030\006 \001(\01624.google.cloud.se"
          + "rvicehealth.v1.OrganizationEventViewB\004\342A"
          + "\001\001\"\257\001\n\036ListOrganizationEventsResponse\022S\n"
          + "\023organization_events\030\001 \003(\01320.google.clou"
          + "d.servicehealth.v1.OrganizationEventB\004\342A"
          + "\001\003\022\035\n\017next_page_token\030\002 \001(\tB\004\342A\001\003\022\031\n\013unr"
          + "eachable\030\003 \003(\tB\004\342A\001\003\"d\n\033GetOrganizationE"
          + "ventRequest\022E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n.serv"
          + "icehealth.googleapis.com/OrganizationEve"
          + "nt\"\263\001\n\036ListOrganizationImpactsRequest\022H\n"
          + "\006parent\030\001 \001(\tB8\342A\001\002\372A1\022/servicehealth.go"
          + "ogleapis.com/OrganizationImpact\022\027\n\tpage_"
          + "size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A"
          + "\001\001\022\024\n\006filter\030\004 \001(\tB\004\342A\001\001\"\262\001\n\037ListOrganiz"
          + "ationImpactsResponse\022U\n\024organization_imp"
          + "acts\030\001 \003(\01321.google.cloud.servicehealth."
          + "v1.OrganizationImpactB\004\342A\001\003\022\035\n\017next_page"
          + "_token\030\002 \001(\tB\004\342A\001\003\022\031\n\013unreachable\030\003 \003(\tB"
          + "\004\342A\001\003\"f\n\034GetOrganizationImpactRequest\022F\n"
          + "\004name\030\001 \001(\tB8\342A\001\002\372A1\n/servicehealth.goog"
          + "leapis.com/OrganizationImpact*R\n\tEventVi"
          + "ew\022\032\n\026EVENT_VIEW_UNSPECIFIED\020\000\022\024\n\020EVENT_"
          + "VIEW_BASIC\020\001\022\023\n\017EVENT_VIEW_FULL\020\002*\205\001\n\025Or"
          + "ganizationEventView\022\'\n#ORGANIZATION_EVEN"
          + "T_VIEW_UNSPECIFIED\020\000\022!\n\035ORGANIZATION_EVE"
          + "NT_VIEW_BASIC\020\001\022 \n\034ORGANIZATION_EVENT_VI"
          + "EW_FULL\020\002B\317\002\n!com.google.cloud.servicehe"
          + "alth.v1B\023EventResourcesProtoP\001ZGcloud.go"
          + "ogle.com/go/servicehealth/apiv1/serviceh"
          + "ealthpb;servicehealthpb\252\002\035Google.Cloud.S"
          + "erviceHealth.V1\312\002\035Google\\Cloud\\ServiceHe"
          + "alth\\V1\352\002 Google::Cloud::ServiceHealth::"
          + "V1\352Af\n1servicehealth.googleapis.com/Orga"
          + "nizationLocation\0221organizations/{organiz"
          + "ation}/locations/{location}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_servicehealth_v1_Event_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicehealth_v1_Event_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_Event_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "Description",
              "Category",
              "DetailedCategory",
              "State",
              "DetailedState",
              "EventImpacts",
              "Relevance",
              "Updates",
              "ParentEvent",
              "UpdateTime",
              "StartTime",
              "EndTime",
              "NextUpdateTime",
            });
    internal_static_google_cloud_servicehealth_v1_OrganizationEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_servicehealth_v1_OrganizationEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_OrganizationEvent_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "Description",
              "Category",
              "DetailedCategory",
              "State",
              "DetailedState",
              "EventImpacts",
              "Updates",
              "ParentEvent",
              "UpdateTime",
              "StartTime",
              "EndTime",
              "NextUpdateTime",
            });
    internal_static_google_cloud_servicehealth_v1_EventUpdate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_servicehealth_v1_EventUpdate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_EventUpdate_descriptor,
            new java.lang.String[] {
              "UpdateTime", "Title", "Description", "Symptom", "Workaround",
            });
    internal_static_google_cloud_servicehealth_v1_Location_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_servicehealth_v1_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_Location_descriptor,
            new java.lang.String[] {
              "LocationName",
            });
    internal_static_google_cloud_servicehealth_v1_Product_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_servicehealth_v1_Product_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_Product_descriptor,
            new java.lang.String[] {
              "ProductName",
            });
    internal_static_google_cloud_servicehealth_v1_EventImpact_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_servicehealth_v1_EventImpact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_EventImpact_descriptor,
            new java.lang.String[] {
              "Product", "Location",
            });
    internal_static_google_cloud_servicehealth_v1_OrganizationImpact_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_servicehealth_v1_OrganizationImpact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_OrganizationImpact_descriptor,
            new java.lang.String[] {
              "Name", "Events", "Asset", "UpdateTime",
            });
    internal_static_google_cloud_servicehealth_v1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_servicehealth_v1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_Asset_descriptor,
            new java.lang.String[] {
              "AssetName", "AssetType",
            });
    internal_static_google_cloud_servicehealth_v1_ListEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_servicehealth_v1_ListEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "View",
            });
    internal_static_google_cloud_servicehealth_v1_ListEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_servicehealth_v1_ListEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListEventsResponse_descriptor,
            new java.lang.String[] {
              "Events", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_servicehealth_v1_GetEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_servicehealth_v1_GetEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_GetEventRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "View",
            });
    internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListOrganizationEventsResponse_descriptor,
            new java.lang.String[] {
              "OrganizationEvents", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_servicehealth_v1_GetOrganizationEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_servicehealth_v1_GetOrganizationEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_GetOrganizationEventRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_ListOrganizationImpactsResponse_descriptor,
            new java.lang.String[] {
              "OrganizationImpacts", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_servicehealth_v1_GetOrganizationImpactRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_servicehealth_v1_GetOrganizationImpactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicehealth_v1_GetOrganizationImpactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
