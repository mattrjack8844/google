/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.ConversationsClient.ListConversationsPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.ConversationsClient.ListMessagesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse;
import com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest;
import com.google.cloud.dialogflow.v2beta1.Conversation;
import com.google.cloud.dialogflow.v2beta1.CreateConversationRequest;
import com.google.cloud.dialogflow.v2beta1.GetConversationRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationsRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationsResponse;
import com.google.cloud.dialogflow.v2beta1.ListMessagesRequest;
import com.google.cloud.dialogflow.v2beta1.ListMessagesResponse;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the Conversations service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonConversationsStub extends ConversationsStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<CreateConversationRequest, Conversation>
      createConversationMethodDescriptor =
          ApiMethodDescriptor.<CreateConversationRequest, Conversation>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Conversations/CreateConversation")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateConversationRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*}/conversations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths("/v2beta1/{parent=projects/*/locations/*}/conversations")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "conversationId", request.getConversationId());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("conversation", request.getConversation()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListConversationsRequest, ListConversationsResponse>
      listConversationsMethodDescriptor =
          ApiMethodDescriptor.<ListConversationsRequest, ListConversationsResponse>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Conversations/ListConversations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListConversationsRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*}/conversations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListConversationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths("/v2beta1/{parent=projects/*/locations/*}/conversations")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListConversationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListConversationsResponse>newBuilder()
                      .setDefaultInstance(ListConversationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetConversationRequest, Conversation>
      getConversationMethodDescriptor =
          ApiMethodDescriptor.<GetConversationRequest, Conversation>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Conversations/GetConversation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetConversationRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*/conversations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths("/v2beta1/{name=projects/*/locations/*/conversations/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CompleteConversationRequest, Conversation>
      completeConversationMethodDescriptor =
          ApiMethodDescriptor.<CompleteConversationRequest, Conversation>newBuilder()
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.Conversations/CompleteConversation")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CompleteConversationRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*/conversations/*}:complete",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CompleteConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2beta1/{name=projects/*/locations/*/conversations/*}:complete")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CompleteConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<BatchCreateMessagesRequest, BatchCreateMessagesResponse>
      batchCreateMessagesMethodDescriptor =
          ApiMethodDescriptor.<BatchCreateMessagesRequest, BatchCreateMessagesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.Conversations/BatchCreateMessages")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<BatchCreateMessagesRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*/conversations/*}/messages:batchCreate",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<BatchCreateMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2beta1/{parent=projects/*/locations/*/conversations/*}/messages:batchCreate")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<BatchCreateMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<BatchCreateMessagesResponse>newBuilder()
                      .setDefaultInstance(BatchCreateMessagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListMessagesRequest, ListMessagesResponse>
      listMessagesMethodDescriptor =
          ApiMethodDescriptor.<ListMessagesRequest, ListMessagesResponse>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Conversations/ListMessages")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListMessagesRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*/conversations/*}/messages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2beta1/{parent=projects/*/locations/*/conversations/*}/messages")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListMessagesResponse>newBuilder()
                      .setDefaultInstance(ListMessagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<CreateConversationRequest, Conversation> createConversationCallable;
  private final UnaryCallable<ListConversationsRequest, ListConversationsResponse>
      listConversationsCallable;
  private final UnaryCallable<ListConversationsRequest, ListConversationsPagedResponse>
      listConversationsPagedCallable;
  private final UnaryCallable<GetConversationRequest, Conversation> getConversationCallable;
  private final UnaryCallable<CompleteConversationRequest, Conversation>
      completeConversationCallable;
  private final UnaryCallable<BatchCreateMessagesRequest, BatchCreateMessagesResponse>
      batchCreateMessagesCallable;
  private final UnaryCallable<ListMessagesRequest, ListMessagesResponse> listMessagesCallable;
  private final UnaryCallable<ListMessagesRequest, ListMessagesPagedResponse>
      listMessagesPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonConversationsStub create(ConversationsStubSettings settings)
      throws IOException {
    return new HttpJsonConversationsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonConversationsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonConversationsStub(
        ConversationsStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonConversationsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonConversationsStub(
        ConversationsStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonConversationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonConversationsStub(
      ConversationsStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonConversationsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonConversationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonConversationsStub(
      ConversationsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreateConversationRequest, Conversation>
        createConversationTransportSettings =
            HttpJsonCallSettings.<CreateConversationRequest, Conversation>newBuilder()
                .setMethodDescriptor(createConversationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListConversationsRequest, ListConversationsResponse>
        listConversationsTransportSettings =
            HttpJsonCallSettings.<ListConversationsRequest, ListConversationsResponse>newBuilder()
                .setMethodDescriptor(listConversationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetConversationRequest, Conversation> getConversationTransportSettings =
        HttpJsonCallSettings.<GetConversationRequest, Conversation>newBuilder()
            .setMethodDescriptor(getConversationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<CompleteConversationRequest, Conversation>
        completeConversationTransportSettings =
            HttpJsonCallSettings.<CompleteConversationRequest, Conversation>newBuilder()
                .setMethodDescriptor(completeConversationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<BatchCreateMessagesRequest, BatchCreateMessagesResponse>
        batchCreateMessagesTransportSettings =
            HttpJsonCallSettings
                .<BatchCreateMessagesRequest, BatchCreateMessagesResponse>newBuilder()
                .setMethodDescriptor(batchCreateMessagesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListMessagesRequest, ListMessagesResponse> listMessagesTransportSettings =
        HttpJsonCallSettings.<ListMessagesRequest, ListMessagesResponse>newBuilder()
            .setMethodDescriptor(listMessagesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.createConversationCallable =
        callableFactory.createUnaryCallable(
            createConversationTransportSettings,
            settings.createConversationSettings(),
            clientContext);
    this.listConversationsCallable =
        callableFactory.createUnaryCallable(
            listConversationsTransportSettings,
            settings.listConversationsSettings(),
            clientContext);
    this.listConversationsPagedCallable =
        callableFactory.createPagedCallable(
            listConversationsTransportSettings,
            settings.listConversationsSettings(),
            clientContext);
    this.getConversationCallable =
        callableFactory.createUnaryCallable(
            getConversationTransportSettings, settings.getConversationSettings(), clientContext);
    this.completeConversationCallable =
        callableFactory.createUnaryCallable(
            completeConversationTransportSettings,
            settings.completeConversationSettings(),
            clientContext);
    this.batchCreateMessagesCallable =
        callableFactory.createUnaryCallable(
            batchCreateMessagesTransportSettings,
            settings.batchCreateMessagesSettings(),
            clientContext);
    this.listMessagesCallable =
        callableFactory.createUnaryCallable(
            listMessagesTransportSettings, settings.listMessagesSettings(), clientContext);
    this.listMessagesPagedCallable =
        callableFactory.createPagedCallable(
            listMessagesTransportSettings, settings.listMessagesSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(createConversationMethodDescriptor);
    methodDescriptors.add(listConversationsMethodDescriptor);
    methodDescriptors.add(getConversationMethodDescriptor);
    methodDescriptors.add(completeConversationMethodDescriptor);
    methodDescriptors.add(batchCreateMessagesMethodDescriptor);
    methodDescriptors.add(listMessagesMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<CreateConversationRequest, Conversation> createConversationCallable() {
    return createConversationCallable;
  }

  @Override
  public UnaryCallable<ListConversationsRequest, ListConversationsResponse>
      listConversationsCallable() {
    return listConversationsCallable;
  }

  @Override
  public UnaryCallable<ListConversationsRequest, ListConversationsPagedResponse>
      listConversationsPagedCallable() {
    return listConversationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetConversationRequest, Conversation> getConversationCallable() {
    return getConversationCallable;
  }

  @Override
  public UnaryCallable<CompleteConversationRequest, Conversation> completeConversationCallable() {
    return completeConversationCallable;
  }

  @Override
  public UnaryCallable<BatchCreateMessagesRequest, BatchCreateMessagesResponse>
      batchCreateMessagesCallable() {
    return batchCreateMessagesCallable;
  }

  @Override
  public UnaryCallable<ListMessagesRequest, ListMessagesResponse> listMessagesCallable() {
    return listMessagesCallable;
  }

  @Override
  public UnaryCallable<ListMessagesRequest, ListMessagesPagedResponse> listMessagesPagedCallable() {
    return listMessagesPagedCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
