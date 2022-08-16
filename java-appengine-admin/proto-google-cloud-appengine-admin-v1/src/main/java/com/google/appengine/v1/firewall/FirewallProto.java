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
// source: google/appengine/v1/firewall.proto

package com.google.appengine.v1.firewall;

public final class FirewallProto {
  private FirewallProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_FirewallRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_FirewallRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/firewall.proto\022\023go"
          + "ogle.appengine.v1\"\274\001\n\014FirewallRule\022\020\n\010pr"
          + "iority\030\001 \001(\005\0228\n\006action\030\002 \001(\0162(.google.ap"
          + "pengine.v1.FirewallRule.Action\022\024\n\014source"
          + "_range\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\"5\n\006Act"
          + "ion\022\026\n\022UNSPECIFIED_ACTION\020\000\022\t\n\005ALLOW\020\001\022\010"
          + "\n\004DENY\020\002B\310\001\n com.google.appengine.v1.fir"
          + "ewallB\rFirewallProtoP\001Z<google.golang.or"
          + "g/genproto/googleapis/appengine/v1;appen"
          + "gine\252\002\031Google.Cloud.AppEngine.V1\312\002\031Googl"
          + "e\\Cloud\\AppEngine\\V1\352\002\034Google::Cloud::Ap"
          + "pEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_appengine_v1_FirewallRule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_FirewallRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_FirewallRule_descriptor,
            new java.lang.String[] {
              "Priority", "Action", "SourceRange", "Description",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
