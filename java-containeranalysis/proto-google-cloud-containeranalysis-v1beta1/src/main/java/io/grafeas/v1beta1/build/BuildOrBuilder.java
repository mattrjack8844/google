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
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package io.grafeas.v1beta1.build;

public interface BuildOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.build.Build)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. Version of the builder which produced this build.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   *
   * @return The builderVersion.
   */
  java.lang.String getBuilderVersion();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Version of the builder which produced this build.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   *
   * @return The bytes for builderVersion.
   */
  com.google.protobuf.ByteString getBuilderVersionBytes();

  /**
   *
   *
   * <pre>
   * Signature of the build in occurrences pointing to this build note
   * containing build details.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   *
   * @return Whether the signature field is set.
   */
  boolean hasSignature();
  /**
   *
   *
   * <pre>
   * Signature of the build in occurrences pointing to this build note
   * containing build details.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   *
   * @return The signature.
   */
  io.grafeas.v1beta1.build.BuildSignature getSignature();
  /**
   *
   *
   * <pre>
   * Signature of the build in occurrences pointing to this build note
   * containing build details.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  io.grafeas.v1beta1.build.BuildSignatureOrBuilder getSignatureOrBuilder();
}
