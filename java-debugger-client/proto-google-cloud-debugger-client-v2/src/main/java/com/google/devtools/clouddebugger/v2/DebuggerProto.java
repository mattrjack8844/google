/*
 * Copyright 2020 Google LLC
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
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public final class DebuggerProto {
  private DebuggerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_SetBreakpointResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_SetBreakpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_BreakpointActionValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_BreakpointActionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_ListBreakpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_ListDebuggeesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_ListDebuggeesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/devtools/clouddebugger/v2/debug"
          + "ger.proto\022 google.devtools.clouddebugger"
          + ".v2\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032+google/devtools/c"
          + "louddebugger/v2/data.proto\032\033google/proto"
          + "buf/empty.proto\032\034google/api/annotations."
          + "proto\"\224\001\n\024SetBreakpointRequest\022\030\n\013debugg"
          + "ee_id\030\001 \001(\tB\003\340A\002\022E\n\nbreakpoint\030\002 \001(\0132,.g"
          + "oogle.devtools.clouddebugger.v2.Breakpoi"
          + "ntB\003\340A\002\022\033\n\016client_version\030\004 \001(\tB\003\340A\002\"Y\n\025"
          + "SetBreakpointResponse\022@\n\nbreakpoint\030\001 \001("
          + "\0132,.google.devtools.clouddebugger.v2.Bre"
          + "akpoint\"i\n\024GetBreakpointRequest\022\030\n\013debug"
          + "gee_id\030\001 \001(\tB\003\340A\002\022\032\n\rbreakpoint_id\030\002 \001(\t"
          + "B\003\340A\002\022\033\n\016client_version\030\004 \001(\tB\003\340A\002\"Y\n\025Ge"
          + "tBreakpointResponse\022@\n\nbreakpoint\030\001 \001(\0132"
          + ",.google.devtools.clouddebugger.v2.Break"
          + "point\"l\n\027DeleteBreakpointRequest\022\030\n\013debu"
          + "ggee_id\030\001 \001(\tB\003\340A\002\022\032\n\rbreakpoint_id\030\002 \001("
          + "\tB\003\340A\002\022\033\n\016client_version\030\003 \001(\tB\003\340A\002\"\360\002\n\026"
          + "ListBreakpointsRequest\022\030\n\013debuggee_id\030\001 "
          + "\001(\tB\003\340A\002\022\031\n\021include_all_users\030\002 \001(\010\022\030\n\020i"
          + "nclude_inactive\030\003 \001(\010\022^\n\006action\030\004 \001(\0132N."
          + "google.devtools.clouddebugger.v2.ListBre"
          + "akpointsRequest.BreakpointActionValue\022\031\n"
          + "\rstrip_results\030\005 \001(\010B\002\030\001\022\022\n\nwait_token\030\006"
          + " \001(\t\022\033\n\016client_version\030\010 \001(\tB\003\340A\002\032[\n\025Bre"
          + "akpointActionValue\022B\n\005value\030\001 \001(\01623.goog"
          + "le.devtools.clouddebugger.v2.Breakpoint."
          + "Action\"u\n\027ListBreakpointsResponse\022A\n\013bre"
          + "akpoints\030\001 \003(\0132,.google.devtools.cloudde"
          + "bugger.v2.Breakpoint\022\027\n\017next_wait_token\030"
          + "\002 \001(\t\"c\n\024ListDebuggeesRequest\022\024\n\007project"
          + "\030\002 \001(\tB\003\340A\002\022\030\n\020include_inactive\030\003 \001(\010\022\033\n"
          + "\016client_version\030\004 \001(\tB\003\340A\002\"V\n\025ListDebugg"
          + "eesResponse\022=\n\tdebuggees\030\001 \003(\0132*.google."
          + "devtools.clouddebugger.v2.Debuggee2\362\t\n\tD"
          + "ebugger2\022\362\001\n\rSetBreakpoint\0226.google.devt"
          + "ools.clouddebugger.v2.SetBreakpointReque"
          + "st\0327.google.devtools.clouddebugger.v2.Se"
          + "tBreakpointResponse\"p\202\323\344\223\002B\"4/v2/debugge"
          + "r/debuggees/{debuggee_id}/breakpoints/se"
          + "t:\nbreakpoint\332A%debuggee_id,breakpoint,c"
          + "lient_version\022\365\001\n\rGetBreakpoint\0226.google"
          + ".devtools.clouddebugger.v2.GetBreakpoint"
          + "Request\0327.google.devtools.clouddebugger."
          + "v2.GetBreakpointResponse\"s\202\323\344\223\002B\022@/v2/de"
          + "bugger/debuggees/{debuggee_id}/breakpoin"
          + "ts/{breakpoint_id}\332A(debuggee_id,breakpo"
          + "int_id,client_version\022\332\001\n\020DeleteBreakpoi"
          + "nt\0229.google.devtools.clouddebugger.v2.De"
          + "leteBreakpointRequest\032\026.google.protobuf."
          + "Empty\"s\202\323\344\223\002B*@/v2/debugger/debuggees/{d"
          + "ebuggee_id}/breakpoints/{breakpoint_id}\332"
          + "A(debuggee_id,breakpoint_id,client_versi"
          + "on\022\335\001\n\017ListBreakpoints\0228.google.devtools"
          + ".clouddebugger.v2.ListBreakpointsRequest"
          + "\0329.google.devtools.clouddebugger.v2.List"
          + "BreakpointsResponse\"U\202\323\344\223\0022\0220/v2/debugge"
          + "r/debuggees/{debuggee_id}/breakpoints\332A\032"
          + "debuggee_id,client_version\022\271\001\n\rListDebug"
          + "gees\0226.google.devtools.clouddebugger.v2."
          + "ListDebuggeesRequest\0327.google.devtools.c"
          + "louddebugger.v2.ListDebuggeesResponse\"7\202"
          + "\323\344\223\002\030\022\026/v2/debugger/debuggees\332A\026project,"
          + "client_version\032\177\312A\034clouddebugger.googlea"
          + "pis.com\322A]https://www.googleapis.com/aut"
          + "h/cloud-platform,https://www.googleapis."
          + "com/auth/cloud_debuggerB\332\001\n$com.google.d"
          + "evtools.clouddebugger.v2B\rDebuggerProtoP"
          + "\001ZMgoogle.golang.org/genproto/googleapis"
          + "/devtools/clouddebugger/v2;clouddebugger"
          + "\252\002\030Google.Cloud.Debugger.V2\312\002\030Google\\Clo"
          + "ud\\Debugger\\V2\352\002\033Google::Cloud::Debugger"
          + "::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.devtools.clouddebugger.v2.DataProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor,
            new java.lang.String[] {
              "DebuggeeId", "Breakpoint", "ClientVersion",
            });
    internal_static_google_devtools_clouddebugger_v2_SetBreakpointResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouddebugger_v2_SetBreakpointResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_SetBreakpointResponse_descriptor,
            new java.lang.String[] {
              "Breakpoint",
            });
    internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_GetBreakpointRequest_descriptor,
            new java.lang.String[] {
              "DebuggeeId", "BreakpointId", "ClientVersion",
            });
    internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor,
            new java.lang.String[] {
              "Breakpoint",
            });
    internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor,
            new java.lang.String[] {
              "DebuggeeId", "BreakpointId", "ClientVersion",
            });
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_descriptor,
            new java.lang.String[] {
              "DebuggeeId",
              "IncludeAllUsers",
              "IncludeInactive",
              "Action",
              "StripResults",
              "WaitToken",
              "ClientVersion",
            });
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_BreakpointActionValue_descriptor =
        internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_BreakpointActionValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_ListBreakpointsRequest_BreakpointActionValue_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_clouddebugger_v2_ListBreakpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_ListBreakpointsResponse_descriptor,
            new java.lang.String[] {
              "Breakpoints", "NextWaitToken",
            });
    internal_static_google_devtools_clouddebugger_v2_ListDebuggeesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_devtools_clouddebugger_v2_ListDebuggeesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_ListDebuggeesRequest_descriptor,
            new java.lang.String[] {
              "Project", "IncludeInactive", "ClientVersion",
            });
    internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor,
            new java.lang.String[] {
              "Debuggees",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.devtools.clouddebugger.v2.DataProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
