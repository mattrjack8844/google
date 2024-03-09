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
// source: google/cloud/aiplatform/v1beta1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ToolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Tool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Function tool type.
   * One or more function declarations to be passed to the model along with the
   * current user query. Model may decide to call a subset of these functions
   * by populating [FunctionCall][content.part.function_call] in the response.
   * User should provide a [FunctionResponse][content.part.function_response]
   * for each function call in the next turn. Based on the function responses,
   * Model will generate the final response back to the user.
   * Maximum 64 function declarations can be provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FunctionDeclaration>
      getFunctionDeclarationsList();
  /**
   *
   *
   * <pre>
   * Optional. Function tool type.
   * One or more function declarations to be passed to the model along with the
   * current user query. Model may decide to call a subset of these functions
   * by populating [FunctionCall][content.part.function_call] in the response.
   * User should provide a [FunctionResponse][content.part.function_response]
   * for each function call in the next turn. Based on the function responses,
   * Model will generate the final response back to the user.
   * Maximum 64 function declarations can be provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FunctionDeclaration getFunctionDeclarations(int index);
  /**
   *
   *
   * <pre>
   * Optional. Function tool type.
   * One or more function declarations to be passed to the model along with the
   * current user query. Model may decide to call a subset of these functions
   * by populating [FunctionCall][content.part.function_call] in the response.
   * User should provide a [FunctionResponse][content.part.function_response]
   * for each function call in the next turn. Based on the function responses,
   * Model will generate the final response back to the user.
   * Maximum 64 function declarations can be provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFunctionDeclarationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Function tool type.
   * One or more function declarations to be passed to the model along with the
   * current user query. Model may decide to call a subset of these functions
   * by populating [FunctionCall][content.part.function_call] in the response.
   * User should provide a [FunctionResponse][content.part.function_response]
   * for each function call in the next turn. Based on the function responses,
   * Model will generate the final response back to the user.
   * Maximum 64 function declarations can be provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FunctionDeclarationOrBuilder>
      getFunctionDeclarationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Function tool type.
   * One or more function declarations to be passed to the model along with the
   * current user query. Model may decide to call a subset of these functions
   * by populating [FunctionCall][content.part.function_call] in the response.
   * User should provide a [FunctionResponse][content.part.function_response]
   * for each function call in the next turn. Based on the function responses,
   * Model will generate the final response back to the user.
   * Maximum 64 function declarations can be provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FunctionDeclarationOrBuilder getFunctionDeclarationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Retrieval tool type.
   * System will always execute the provided retrieval tool(s) to get external
   * knowledge to answer the prompt. Retrieval results are presented to the
   * model for generation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Retrieval retrieval = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the retrieval field is set.
   */
  boolean hasRetrieval();
  /**
   *
   *
   * <pre>
   * Optional. Retrieval tool type.
   * System will always execute the provided retrieval tool(s) to get external
   * knowledge to answer the prompt. Retrieval results are presented to the
   * model for generation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Retrieval retrieval = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The retrieval.
   */
  com.google.cloud.aiplatform.v1beta1.Retrieval getRetrieval();
  /**
   *
   *
   * <pre>
   * Optional. Retrieval tool type.
   * System will always execute the provided retrieval tool(s) to get external
   * knowledge to answer the prompt. Retrieval results are presented to the
   * model for generation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Retrieval retrieval = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RetrievalOrBuilder getRetrievalOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. GoogleSearchRetrieval tool type.
   * Specialized retrieval tool that is powered by Google search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GoogleSearchRetrieval google_search_retrieval = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the googleSearchRetrieval field is set.
   */
  boolean hasGoogleSearchRetrieval();
  /**
   *
   *
   * <pre>
   * Optional. GoogleSearchRetrieval tool type.
   * Specialized retrieval tool that is powered by Google search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GoogleSearchRetrieval google_search_retrieval = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The googleSearchRetrieval.
   */
  com.google.cloud.aiplatform.v1beta1.GoogleSearchRetrieval getGoogleSearchRetrieval();
  /**
   *
   *
   * <pre>
   * Optional. GoogleSearchRetrieval tool type.
   * Specialized retrieval tool that is powered by Google search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GoogleSearchRetrieval google_search_retrieval = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GoogleSearchRetrievalOrBuilder
      getGoogleSearchRetrievalOrBuilder();
}
