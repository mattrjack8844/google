/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListRegionInstanceGroupsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionInstanceGroupClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default
 *       port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getRegionInstanceGroup to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionInstanceGroupSettings.Builder regionInstanceGroupSettingsBuilder =
 *     RegionInstanceGroupSettings.newBuilder();
 * regionInstanceGroupSettingsBuilder.getRegionInstanceGroupSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionInstanceGroupSettings regionInstanceGroupSettings = regionInstanceGroupSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionInstanceGroupSettings extends ClientSettings<RegionInstanceGroupSettings> {
  /** Returns the object with the settings used for calls to getRegionInstanceGroup. */
  public UnaryCallSettings<GetRegionInstanceGroupHttpRequest, InstanceGroup>
      getRegionInstanceGroupSettings() {
    return ((RegionInstanceGroupStubSettings) getStubSettings()).getRegionInstanceGroupSettings();
  }

  /** Returns the object with the settings used for calls to listRegionInstanceGroups. */
  public PagedCallSettings<
          ListRegionInstanceGroupsHttpRequest,
          RegionInstanceGroupList,
          ListRegionInstanceGroupsPagedResponse>
      listRegionInstanceGroupsSettings() {
    return ((RegionInstanceGroupStubSettings) getStubSettings()).listRegionInstanceGroupsSettings();
  }

  /** Returns the object with the settings used for calls to listInstancesRegionInstanceGroups. */
  public PagedCallSettings<
          ListInstancesRegionInstanceGroupsHttpRequest,
          RegionInstanceGroupsListInstances,
          ListInstancesRegionInstanceGroupsPagedResponse>
      listInstancesRegionInstanceGroupsSettings() {
    return ((RegionInstanceGroupStubSettings) getStubSettings())
        .listInstancesRegionInstanceGroupsSettings();
  }

  /** Returns the object with the settings used for calls to setNamedPortsRegionInstanceGroup. */
  public UnaryCallSettings<SetNamedPortsRegionInstanceGroupHttpRequest, Operation>
      setNamedPortsRegionInstanceGroupSettings() {
    return ((RegionInstanceGroupStubSettings) getStubSettings())
        .setNamedPortsRegionInstanceGroupSettings();
  }

  public static final RegionInstanceGroupSettings create(RegionInstanceGroupStubSettings stub)
      throws IOException {
    return new RegionInstanceGroupSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RegionInstanceGroupStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RegionInstanceGroupStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return RegionInstanceGroupStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RegionInstanceGroupStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RegionInstanceGroupStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return RegionInstanceGroupStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RegionInstanceGroupStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegionInstanceGroupStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegionInstanceGroupSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RegionInstanceGroupSettings. */
  public static class Builder extends ClientSettings.Builder<RegionInstanceGroupSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(RegionInstanceGroupStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(RegionInstanceGroupStubSettings.newBuilder());
    }

    protected Builder(RegionInstanceGroupSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RegionInstanceGroupStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public RegionInstanceGroupStubSettings.Builder getStubSettingsBuilder() {
      return ((RegionInstanceGroupStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to getRegionInstanceGroup. */
    public UnaryCallSettings.Builder<GetRegionInstanceGroupHttpRequest, InstanceGroup>
        getRegionInstanceGroupSettings() {
      return getStubSettingsBuilder().getRegionInstanceGroupSettings();
    }

    /** Returns the builder for the settings used for calls to listRegionInstanceGroups. */
    public PagedCallSettings.Builder<
            ListRegionInstanceGroupsHttpRequest,
            RegionInstanceGroupList,
            ListRegionInstanceGroupsPagedResponse>
        listRegionInstanceGroupsSettings() {
      return getStubSettingsBuilder().listRegionInstanceGroupsSettings();
    }

    /** Returns the builder for the settings used for calls to listInstancesRegionInstanceGroups. */
    public PagedCallSettings.Builder<
            ListInstancesRegionInstanceGroupsHttpRequest,
            RegionInstanceGroupsListInstances,
            ListInstancesRegionInstanceGroupsPagedResponse>
        listInstancesRegionInstanceGroupsSettings() {
      return getStubSettingsBuilder().listInstancesRegionInstanceGroupsSettings();
    }

    /** Returns the builder for the settings used for calls to setNamedPortsRegionInstanceGroup. */
    public UnaryCallSettings.Builder<SetNamedPortsRegionInstanceGroupHttpRequest, Operation>
        setNamedPortsRegionInstanceGroupSettings() {
      return getStubSettingsBuilder().setNamedPortsRegionInstanceGroupSettings();
    }

    @Override
    public RegionInstanceGroupSettings build() throws IOException {
      return new RegionInstanceGroupSettings(this);
    }
  }
}
