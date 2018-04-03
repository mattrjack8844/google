/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest;
import com.google.cloud.compute.v1.BackendService;
import com.google.cloud.compute.v1.BackendServiceAggregatedList;
import static com.google.cloud.compute.v1.BackendServiceClient.AggregatedListBackendServicesPagedResponse;
import static com.google.cloud.compute.v1.BackendServiceClient.ListBackendServicesPagedResponse;
import com.google.cloud.compute.v1.BackendServiceGroupHealth;
import com.google.cloud.compute.v1.BackendServiceList;
import com.google.cloud.compute.v1.BackendServiceSettings;
import com.google.cloud.compute.v1.BackendServicesScopedList;
import com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest;
import com.google.cloud.compute.v1.GetBackendServiceHttpRequest;
import com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest;
import com.google.cloud.compute.v1.InsertBackendServiceHttpRequest;
import com.google.cloud.compute.v1.ListBackendServicesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchBackendServiceHttpRequest;
import com.google.cloud.compute.v1.ProjectBackendServiceName;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ResourceGroupReference;
import com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonBackendServiceStub extends BackendServiceStub {
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList>newBuilder()
          .setFullMethodName("compute.backendServices.aggregatedList")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<AggregatedListBackendServicesHttpRequest>newBuilder()
                  .setRequestInstance(AggregatedListBackendServicesHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/aggregated/backendServices"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "filter",    "maxResults",    "orderBy",    "pageToken"
                                     ))
                  .setResourceNameFactory(ProjectName.newFactory())
                  .setResourceNameField("project")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<BackendServiceAggregatedList>newBuilder()
                  .setResponseInstance(BackendServiceAggregatedList.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<DeleteBackendServiceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.backendServices.delete")
          .setHttpMethod(HttpMethods.DELETE)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<DeleteBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(DeleteBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices/{backendService}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "requestId"
                                     ))
                  .setResourceNameFactory(ProjectBackendServiceName.newFactory())
                  .setResourceNameField("backendService")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetBackendServiceHttpRequest, BackendService> getBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<GetBackendServiceHttpRequest, BackendService>newBuilder()
          .setFullMethodName("compute.backendServices.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(GetBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices/{backendService}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(ProjectBackendServiceName.newFactory())
                  .setResourceNameField("backendService")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<BackendService>newBuilder()
                  .setResponseInstance(BackendService.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth>newBuilder()
          .setFullMethodName("compute.backendServices.getHealth")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetHealthBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(GetHealthBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices/{backendService}/getHealth"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(ProjectBackendServiceName.newFactory())
                  .setResourceNameField("backendService")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<BackendServiceGroupHealth>newBuilder()
                  .setResponseInstance(BackendServiceGroupHealth.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertBackendServiceHttpRequest, Operation> insertBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<InsertBackendServiceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.backendServices.insert")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<InsertBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(InsertBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "requestId"
                                     ))
                  .setResourceNameFactory(ProjectName.newFactory())
                  .setResourceNameField("project")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesMethodDescriptor =
      ApiMethodDescriptor.<ListBackendServicesHttpRequest, BackendServiceList>newBuilder()
          .setFullMethodName("compute.backendServices.list")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<ListBackendServicesHttpRequest>newBuilder()
                  .setRequestInstance(ListBackendServicesHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "filter",    "maxResults",    "orderBy",    "pageToken"
                                     ))
                  .setResourceNameFactory(ProjectName.newFactory())
                  .setResourceNameField("project")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<BackendServiceList>newBuilder()
                  .setResponseInstance(BackendServiceList.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<PatchBackendServiceHttpRequest, Operation> patchBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<PatchBackendServiceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.backendServices.patch")
          .setHttpMethod(HttpMethods.PATCH)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<PatchBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(PatchBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices/{backendService}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "requestId"
                                     ))
                  .setResourceNameFactory(ProjectBackendServiceName.newFactory())
                  .setResourceNameField("backendService")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<UpdateBackendServiceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.backendServices.update")
          .setHttpMethod(HttpMethods.PUT)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<UpdateBackendServiceHttpRequest>newBuilder()
                  .setRequestInstance(UpdateBackendServiceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/backendServices/{backendService}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "requestId"
                                     ))
                  .setResourceNameFactory(ProjectBackendServiceName.newFactory())
                  .setResourceNameField("backendService")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesCallable;
  private final UnaryCallable<AggregatedListBackendServicesHttpRequest, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesPagedCallable;
  private final UnaryCallable<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceCallable;
  private final UnaryCallable<GetBackendServiceHttpRequest, BackendService> getBackendServiceCallable;
  private final UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceCallable;
  private final UnaryCallable<InsertBackendServiceHttpRequest, Operation> insertBackendServiceCallable;
  private final UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesCallable;
  private final UnaryCallable<ListBackendServicesHttpRequest, ListBackendServicesPagedResponse> listBackendServicesPagedCallable;
  private final UnaryCallable<PatchBackendServiceHttpRequest, Operation> patchBackendServiceCallable;
  private final UnaryCallable<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceCallable;

  private final HttpJsonStubCallableFactory callableFactory;
  public static final HttpJsonBackendServiceStub create(BackendServiceStubSettings settings) throws IOException {
    return new HttpJsonBackendServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonBackendServiceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonBackendServiceStub(BackendServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonBackendServiceStub create(ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonBackendServiceStub(BackendServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonBackendServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonBackendServiceStub(BackendServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonBackendServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonBackendServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonBackendServiceStub(BackendServiceStubSettings settings, ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesTransportSettings =
        HttpJsonCallSettings.<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListBackendServicesMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceTransportSettings =
        HttpJsonCallSettings.<DeleteBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetBackendServiceHttpRequest, BackendService> getBackendServiceTransportSettings =
        HttpJsonCallSettings.<GetBackendServiceHttpRequest, BackendService>newBuilder()
            .setMethodDescriptor(getBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceTransportSettings =
        HttpJsonCallSettings.<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth>newBuilder()
            .setMethodDescriptor(getHealthBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertBackendServiceHttpRequest, Operation> insertBackendServiceTransportSettings =
        HttpJsonCallSettings.<InsertBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesTransportSettings =
        HttpJsonCallSettings.<ListBackendServicesHttpRequest, BackendServiceList>newBuilder()
            .setMethodDescriptor(listBackendServicesMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchBackendServiceHttpRequest, Operation> patchBackendServiceTransportSettings =
        HttpJsonCallSettings.<PatchBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceTransportSettings =
        HttpJsonCallSettings.<UpdateBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateBackendServiceMethodDescriptor)
            .build();

    this.aggregatedListBackendServicesCallable = callableFactory.createUnaryCallable(aggregatedListBackendServicesTransportSettings,settings.aggregatedListBackendServicesSettings(), clientContext);
    this.aggregatedListBackendServicesPagedCallable = callableFactory.createPagedCallable(aggregatedListBackendServicesTransportSettings,settings.aggregatedListBackendServicesSettings(), clientContext);
    this.deleteBackendServiceCallable = callableFactory.createUnaryCallable(deleteBackendServiceTransportSettings,settings.deleteBackendServiceSettings(), clientContext);
    this.getBackendServiceCallable = callableFactory.createUnaryCallable(getBackendServiceTransportSettings,settings.getBackendServiceSettings(), clientContext);
    this.getHealthBackendServiceCallable = callableFactory.createUnaryCallable(getHealthBackendServiceTransportSettings,settings.getHealthBackendServiceSettings(), clientContext);
    this.insertBackendServiceCallable = callableFactory.createUnaryCallable(insertBackendServiceTransportSettings,settings.insertBackendServiceSettings(), clientContext);
    this.listBackendServicesCallable = callableFactory.createUnaryCallable(listBackendServicesTransportSettings,settings.listBackendServicesSettings(), clientContext);
    this.listBackendServicesPagedCallable = callableFactory.createPagedCallable(listBackendServicesTransportSettings,settings.listBackendServicesSettings(), clientContext);
    this.patchBackendServiceCallable = callableFactory.createUnaryCallable(patchBackendServiceTransportSettings,settings.patchBackendServiceSettings(), clientContext);
    this.updateBackendServiceCallable = callableFactory.createUnaryCallable(updateBackendServiceTransportSettings,settings.updateBackendServiceSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListBackendServicesHttpRequest, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesPagedCallable() {
    return aggregatedListBackendServicesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesCallable() {
    return aggregatedListBackendServicesCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceCallable() {
    return deleteBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetBackendServiceHttpRequest, BackendService> getBackendServiceCallable() {
    return getBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceCallable() {
    return getHealthBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<InsertBackendServiceHttpRequest, Operation> insertBackendServiceCallable() {
    return insertBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<ListBackendServicesHttpRequest, ListBackendServicesPagedResponse> listBackendServicesPagedCallable() {
    return listBackendServicesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesCallable() {
    return listBackendServicesCallable;
  }

  @BetaApi
  public UnaryCallable<PatchBackendServiceHttpRequest, Operation> patchBackendServiceCallable() {
    return patchBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceCallable() {
    return updateBackendServiceCallable;
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