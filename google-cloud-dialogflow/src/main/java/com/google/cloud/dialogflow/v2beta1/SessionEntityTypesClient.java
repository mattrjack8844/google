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
package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.PagedResponseWrappers.ListSessionEntityTypesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStub;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Manages session entity types.
 *
 * <p>Session entity types can be redefined on a session level, allowing for specific concepts, like
 * a user's playlists.
 *
 * <p>Standard methods.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
 *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
 *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the sessionEntityTypesClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SessionEntityTypesSettings to
 * of(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.of(myCredentials))
 *         .build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.of(sessionEntityTypesSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder()
 *         .setTransportChannelProvider(SessionEntityTypesSettings.defaultGrpcTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.of(sessionEntityTypesSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SessionEntityTypesClient implements BackgroundResource {
  private final SessionEntityTypesSettings settings;
  private final SessionEntityTypesStub stub;

  /**
   * Constructs an instance of SessionEntityTypesClient with default settings.
   *
   * @deprecated Use of() instead.
   */
  @Deprecated
  public static final SessionEntityTypesClient create() throws IOException {
    return of();
  }

  /** Constructs an instance of SessionEntityTypesClient with default settings. */
  public static final SessionEntityTypesClient of() throws IOException {
    return of(SessionEntityTypesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   *
   * @deprecated Use of(SessionEntityTypesSettings) instead.
   */
  @Deprecated
  public static final SessionEntityTypesClient create(SessionEntityTypesSettings settings)
      throws IOException {
    return of(settings);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use SessionEntityTypesSettings}.
   *
   * @deprecated Use of(SessionEntityTypesStub) instead.
   */
  @Deprecated
  public static final SessionEntityTypesClient create(SessionEntityTypesStub stub) {
    return of(stub);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SessionEntityTypesClient of(SessionEntityTypesSettings settings)
      throws IOException {
    return new SessionEntityTypesClient(settings);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use SessionEntityTypesSettings}.
   */
  @BetaApi
  public static final SessionEntityTypesClient of(SessionEntityTypesStub stub) {
    return new SessionEntityTypesClient(stub);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SessionEntityTypesClient(SessionEntityTypesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected SessionEntityTypesClient(SessionEntityTypesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SessionEntityTypesSettings getSettings() {
    return settings;
  }

  @BetaApi
  public SessionEntityTypesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   for (SessionEntityType element : sessionEntityTypesClient.listSessionEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The session to list all session entity types from. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(SessionName parent) {
    ListSessionEntityTypesRequest request =
        ListSessionEntityTypesRequest.newBuilder().setParentWithSessionName(parent).build();
    return listSessionEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   ListSessionEntityTypesRequest request = ListSessionEntityTypesRequest.newBuilder()
   *     .setParentWithSessionName(parent)
   *     .build();
   *   for (SessionEntityType element : sessionEntityTypesClient.listSessionEntityTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(
      ListSessionEntityTypesRequest request) {
    return listSessionEntityTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   ListSessionEntityTypesRequest request = ListSessionEntityTypesRequest.newBuilder()
   *     .setParentWithSessionName(parent)
   *     .build();
   *   ApiFuture&lt;ListSessionEntityTypesPagedResponse&gt; future = sessionEntityTypesClient.listSessionEntityTypesPagedCallable().futureCall(request);
   *   // Do something
   *   for (SessionEntityType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesPagedResponse>
      listSessionEntityTypesPagedCallable() {
    return stub.listSessionEntityTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   ListSessionEntityTypesRequest request = ListSessionEntityTypesRequest.newBuilder()
   *     .setParentWithSessionName(parent)
   *     .build();
   *   while (true) {
   *     ListSessionEntityTypesResponse response = sessionEntityTypesClient.listSessionEntityTypesCallable().call(request);
   *     for (SessionEntityType element : response.getSessionEntityTypesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesCallable() {
    return stub.listSessionEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the session entity type. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(SessionEntityTypeName name) {

    GetSessionEntityTypeRequest request =
        GetSessionEntityTypeRequest.newBuilder().setNameWithSessionEntityTypeName(name).build();
    return getSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   GetSessionEntityTypeRequest request = GetSessionEntityTypeRequest.newBuilder()
   *     .setNameWithSessionEntityTypeName(name)
   *     .build();
   *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final SessionEntityType getSessionEntityType(GetSessionEntityTypeRequest request) {
    return getSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   GetSessionEntityTypeRequest request = GetSessionEntityTypeRequest.newBuilder()
   *     .setNameWithSessionEntityTypeName(name)
   *     .build();
   *   ApiFuture&lt;SessionEntityType&gt; future = sessionEntityTypesClient.getSessionEntityTypeCallable().futureCall(request);
   *   // Do something
   *   SessionEntityType response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeCallable() {
    return stub.getSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   SessionEntityType response = sessionEntityTypesClient.createSessionEntityType(parent, sessionEntityType);
   * }
   * </code></pre>
   *
   * @param parent Required. The session to create a session entity type for. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`.
   * @param sessionEntityType Required. The session entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(
      SessionName parent, SessionEntityType sessionEntityType) {

    CreateSessionEntityTypeRequest request =
        CreateSessionEntityTypeRequest.newBuilder()
            .setParentWithSessionName(parent)
            .setSessionEntityType(sessionEntityType)
            .build();
    return createSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   CreateSessionEntityTypeRequest request = CreateSessionEntityTypeRequest.newBuilder()
   *     .setParentWithSessionName(parent)
   *     .setSessionEntityType(sessionEntityType)
   *     .build();
   *   SessionEntityType response = sessionEntityTypesClient.createSessionEntityType(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(CreateSessionEntityTypeRequest request) {
    return createSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionName parent = SessionName.create("[PROJECT]", "[SESSION]");
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   CreateSessionEntityTypeRequest request = CreateSessionEntityTypeRequest.newBuilder()
   *     .setParentWithSessionName(parent)
   *     .setSessionEntityType(sessionEntityType)
   *     .build();
   *   ApiFuture&lt;SessionEntityType&gt; future = sessionEntityTypesClient.createSessionEntityTypeCallable().futureCall(request);
   *   // Do something
   *   SessionEntityType response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeCallable() {
    return stub.createSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   SessionEntityType response = sessionEntityTypesClient.updateSessionEntityType(sessionEntityType);
   * }
   * </code></pre>
   *
   * @param sessionEntityType Required. The entity type to update. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(SessionEntityType sessionEntityType) {

    UpdateSessionEntityTypeRequest request =
        UpdateSessionEntityTypeRequest.newBuilder().setSessionEntityType(sessionEntityType).build();
    return updateSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   UpdateSessionEntityTypeRequest request = UpdateSessionEntityTypeRequest.newBuilder()
   *     .setSessionEntityType(sessionEntityType)
   *     .build();
   *   SessionEntityType response = sessionEntityTypesClient.updateSessionEntityType(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(UpdateSessionEntityTypeRequest request) {
    return updateSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   UpdateSessionEntityTypeRequest request = UpdateSessionEntityTypeRequest.newBuilder()
   *     .setSessionEntityType(sessionEntityType)
   *     .build();
   *   ApiFuture&lt;SessionEntityType&gt; future = sessionEntityTypesClient.updateSessionEntityTypeCallable().futureCall(request);
   *   // Do something
   *   SessionEntityType response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeCallable() {
    return stub.updateSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   sessionEntityTypesClient.deleteSessionEntityType(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the entity type to delete. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(SessionEntityTypeName name) {

    DeleteSessionEntityTypeRequest request =
        DeleteSessionEntityTypeRequest.newBuilder().setNameWithSessionEntityTypeName(name).build();
    deleteSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   DeleteSessionEntityTypeRequest request = DeleteSessionEntityTypeRequest.newBuilder()
   *     .setNameWithSessionEntityTypeName(name)
   *     .build();
   *   sessionEntityTypesClient.deleteSessionEntityType(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteSessionEntityType(DeleteSessionEntityTypeRequest request) {
    deleteSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.of()) {
   *   SessionEntityTypeName name = SessionEntityTypeName.create("[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
   *   DeleteSessionEntityTypeRequest request = DeleteSessionEntityTypeRequest.newBuilder()
   *     .setNameWithSessionEntityTypeName(name)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = sessionEntityTypesClient.deleteSessionEntityTypeCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteSessionEntityTypeRequest, Empty>
      deleteSessionEntityTypeCallable() {
    return stub.deleteSessionEntityTypeCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
