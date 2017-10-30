/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.PagedResponseWrappers.ListSessionEntityTypesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest;
import com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse;
import com.google.cloud.dialogflow.v2beta1.SessionEntityType;
import com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings;
import com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcSessionEntityTypesStub extends SessionEntityTypesStub {

  private static final MethodDescriptor<
          ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesMethodDescriptor =
          MethodDescriptor
              .<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.SessionEntityTypes/ListSessionEntityTypes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListSessionEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListSessionEntityTypesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeMethodDescriptor =
          MethodDescriptor.<GetSessionEntityTypeRequest, SessionEntityType>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.SessionEntityTypes/GetSessionEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(SessionEntityType.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeMethodDescriptor =
          MethodDescriptor.<CreateSessionEntityTypeRequest, SessionEntityType>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.SessionEntityTypes/CreateSessionEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(SessionEntityType.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeMethodDescriptor =
          MethodDescriptor.<UpdateSessionEntityTypeRequest, SessionEntityType>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.SessionEntityTypes/UpdateSessionEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(SessionEntityType.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteSessionEntityTypeRequest, Empty>
      deleteSessionEntityTypeMethodDescriptor =
          MethodDescriptor.<DeleteSessionEntityTypeRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.dialogflow.v2beta1.SessionEntityTypes/DeleteSessionEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesCallable;
  private final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesPagedResponse>
      listSessionEntityTypesPagedCallable;
  private final UnaryCallable<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeCallable;
  private final UnaryCallable<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeCallable;
  private final UnaryCallable<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeCallable;
  private final UnaryCallable<DeleteSessionEntityTypeRequest, Empty>
      deleteSessionEntityTypeCallable;

  /** @deprecated Use of(SessionEntityTypesSettings) instead. */
  @Deprecated
  public static final GrpcSessionEntityTypesStub create(SessionEntityTypesSettings settings)
      throws IOException {
    return of(settings);
  }

  /** @deprecated Use of(ClientContext) instead. */
  @Deprecated
  public static final GrpcSessionEntityTypesStub create(ClientContext clientContext)
      throws IOException {
    return of(clientContext);
  }

  public static final GrpcSessionEntityTypesStub of(SessionEntityTypesSettings settings)
      throws IOException {
    return new GrpcSessionEntityTypesStub(settings, ClientContext.of(settings));
  }

  public static final GrpcSessionEntityTypesStub of(ClientContext clientContext)
      throws IOException {
    return new GrpcSessionEntityTypesStub(
        SessionEntityTypesSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcSessionEntityTypesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcSessionEntityTypesStub(
      SessionEntityTypesSettings settings, ClientContext clientContext) throws IOException {

    GrpcCallSettings<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
        listSessionEntityTypesTransportSettings =
            GrpcCallSettings
                .<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>newBuilder()
                .setMethodDescriptor(listSessionEntityTypesMethodDescriptor)
                .build();
    GrpcCallSettings<GetSessionEntityTypeRequest, SessionEntityType>
        getSessionEntityTypeTransportSettings =
            GrpcCallSettings.<GetSessionEntityTypeRequest, SessionEntityType>newBuilder()
                .setMethodDescriptor(getSessionEntityTypeMethodDescriptor)
                .build();
    GrpcCallSettings<CreateSessionEntityTypeRequest, SessionEntityType>
        createSessionEntityTypeTransportSettings =
            GrpcCallSettings.<CreateSessionEntityTypeRequest, SessionEntityType>newBuilder()
                .setMethodDescriptor(createSessionEntityTypeMethodDescriptor)
                .build();
    GrpcCallSettings<UpdateSessionEntityTypeRequest, SessionEntityType>
        updateSessionEntityTypeTransportSettings =
            GrpcCallSettings.<UpdateSessionEntityTypeRequest, SessionEntityType>newBuilder()
                .setMethodDescriptor(updateSessionEntityTypeMethodDescriptor)
                .build();
    GrpcCallSettings<DeleteSessionEntityTypeRequest, Empty>
        deleteSessionEntityTypeTransportSettings =
            GrpcCallSettings.<DeleteSessionEntityTypeRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteSessionEntityTypeMethodDescriptor)
                .build();

    this.listSessionEntityTypesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listSessionEntityTypesTransportSettings,
            settings.listSessionEntityTypesSettings(),
            clientContext);
    this.listSessionEntityTypesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listSessionEntityTypesTransportSettings,
            settings.listSessionEntityTypesSettings(),
            clientContext);
    this.getSessionEntityTypeCallable =
        GrpcCallableFactory.createUnaryCallable(
            getSessionEntityTypeTransportSettings,
            settings.getSessionEntityTypeSettings(),
            clientContext);
    this.createSessionEntityTypeCallable =
        GrpcCallableFactory.createUnaryCallable(
            createSessionEntityTypeTransportSettings,
            settings.createSessionEntityTypeSettings(),
            clientContext);
    this.updateSessionEntityTypeCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateSessionEntityTypeTransportSettings,
            settings.updateSessionEntityTypeSettings(),
            clientContext);
    this.deleteSessionEntityTypeCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteSessionEntityTypeTransportSettings,
            settings.deleteSessionEntityTypeSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesPagedResponse>
      listSessionEntityTypesPagedCallable() {
    return listSessionEntityTypesPagedCallable;
  }

  public UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesCallable() {
    return listSessionEntityTypesCallable;
  }

  public UnaryCallable<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeCallable() {
    return getSessionEntityTypeCallable;
  }

  public UnaryCallable<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeCallable() {
    return createSessionEntityTypeCallable;
  }

  public UnaryCallable<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeCallable() {
    return updateSessionEntityTypeCallable;
  }

  public UnaryCallable<DeleteSessionEntityTypeRequest, Empty> deleteSessionEntityTypeCallable() {
    return deleteSessionEntityTypeCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
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
