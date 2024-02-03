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
// source: google/api/servicecontrol/v2/service_controller.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicecontrol.v2;

public interface ResourceInfoListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v2.ResourceInfoList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource details.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v2.ResourceInfo resources = 1;</code>
   */
  java.util.List<com.google.api.servicecontrol.v2.ResourceInfo> getResourcesList();
  /**
   *
   *
   * <pre>
   * The resource details.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v2.ResourceInfo resources = 1;</code>
   */
  com.google.api.servicecontrol.v2.ResourceInfo getResources(int index);
  /**
   *
   *
   * <pre>
   * The resource details.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v2.ResourceInfo resources = 1;</code>
   */
  int getResourcesCount();
  /**
   *
   *
   * <pre>
   * The resource details.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v2.ResourceInfo resources = 1;</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v2.ResourceInfoOrBuilder>
      getResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resource details.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v2.ResourceInfo resources = 1;</code>
   */
  com.google.api.servicecontrol.v2.ResourceInfoOrBuilder getResourcesOrBuilder(int index);
}
