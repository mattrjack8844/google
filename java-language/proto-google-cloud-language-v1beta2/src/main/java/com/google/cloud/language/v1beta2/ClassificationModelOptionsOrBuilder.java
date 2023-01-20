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
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface ClassificationModelOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.ClassificationModelOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Setting this field will use the V1 model and V1 content categories
   * version. The V1 model is a legacy model; support for this will be
   * discontinued in the future.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V1Model v1_model = 1;</code>
   *
   * @return Whether the v1Model field is set.
   */
  boolean hasV1Model();
  /**
   *
   *
   * <pre>
   * Setting this field will use the V1 model and V1 content categories
   * version. The V1 model is a legacy model; support for this will be
   * discontinued in the future.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V1Model v1_model = 1;</code>
   *
   * @return The v1Model.
   */
  com.google.cloud.language.v1beta2.ClassificationModelOptions.V1Model getV1Model();
  /**
   *
   *
   * <pre>
   * Setting this field will use the V1 model and V1 content categories
   * version. The V1 model is a legacy model; support for this will be
   * discontinued in the future.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V1Model v1_model = 1;</code>
   */
  com.google.cloud.language.v1beta2.ClassificationModelOptions.V1ModelOrBuilder
      getV1ModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Setting this field will use the V2 model with the appropriate content
   * categories version. The V2 model is a better performing model.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V2Model v2_model = 2;</code>
   *
   * @return Whether the v2Model field is set.
   */
  boolean hasV2Model();
  /**
   *
   *
   * <pre>
   * Setting this field will use the V2 model with the appropriate content
   * categories version. The V2 model is a better performing model.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V2Model v2_model = 2;</code>
   *
   * @return The v2Model.
   */
  com.google.cloud.language.v1beta2.ClassificationModelOptions.V2Model getV2Model();
  /**
   *
   *
   * <pre>
   * Setting this field will use the V2 model with the appropriate content
   * categories version. The V2 model is a better performing model.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.ClassificationModelOptions.V2Model v2_model = 2;</code>
   */
  com.google.cloud.language.v1beta2.ClassificationModelOptions.V2ModelOrBuilder
      getV2ModelOrBuilder();

  public com.google.cloud.language.v1beta2.ClassificationModelOptions.ModelTypeCase
      getModelTypeCase();
}
