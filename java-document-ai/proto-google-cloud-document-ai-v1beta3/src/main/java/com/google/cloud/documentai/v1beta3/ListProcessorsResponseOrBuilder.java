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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ListProcessorsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ListProcessorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Processor processors = 1;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.Processor> getProcessorsList();
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Processor processors = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.Processor getProcessors(int index);
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Processor processors = 1;</code>
   */
  int getProcessorsCount();
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Processor processors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta3.ProcessorOrBuilder>
      getProcessorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Processor processors = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.ProcessorOrBuilder getProcessorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Points to the next processor, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Points to the next processor, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
