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
// source: google/api/servicecontrol/v1/http_request.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicecontrol.v1;

public final class HttpRequestProto {
  private HttpRequestProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_HttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_HttpRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/api/servicecontrol/v1/http_requ"
          + "est.proto\022\034google.api.servicecontrol.v1\032"
          + "\036google/protobuf/duration.proto\"\357\002\n\013Http"
          + "Request\022\026\n\016request_method\030\001 \001(\t\022\023\n\013reque"
          + "st_url\030\002 \001(\t\022\024\n\014request_size\030\003 \001(\003\022\016\n\006st"
          + "atus\030\004 \001(\005\022\025\n\rresponse_size\030\005 \001(\003\022\022\n\nuse"
          + "r_agent\030\006 \001(\t\022\021\n\tremote_ip\030\007 \001(\t\022\021\n\tserv"
          + "er_ip\030\r \001(\t\022\017\n\007referer\030\010 \001(\t\022*\n\007latency\030"
          + "\016 \001(\0132\031.google.protobuf.Duration\022\024\n\014cach"
          + "e_lookup\030\013 \001(\010\022\021\n\tcache_hit\030\t \001(\010\022*\n\"cac"
          + "he_validated_with_origin_server\030\n \001(\010\022\030\n"
          + "\020cache_fill_bytes\030\014 \001(\003\022\020\n\010protocol\030\017 \001("
          + "\tB\350\001\n com.google.api.servicecontrol.v1B\020"
          + "HttpRequestProtoP\001ZJcloud.google.com/go/"
          + "servicecontrol/apiv1/servicecontrolpb;se"
          + "rvicecontrolpb\252\002\036Google.Cloud.ServiceCon"
          + "trol.V1\312\002\036Google\\Cloud\\ServiceControl\\V1"
          + "\352\002!Google::Cloud::ServiceControl::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_api_servicecontrol_v1_HttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_HttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_HttpRequest_descriptor,
            new java.lang.String[] {
              "RequestMethod",
              "RequestUrl",
              "RequestSize",
              "Status",
              "ResponseSize",
              "UserAgent",
              "RemoteIp",
              "ServerIp",
              "Referer",
              "Latency",
              "CacheLookup",
              "CacheHit",
              "CacheValidatedWithOriginServer",
              "CacheFillBytes",
              "Protocol",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
