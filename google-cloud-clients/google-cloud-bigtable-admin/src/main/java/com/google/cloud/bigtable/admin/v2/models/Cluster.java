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
package com.google.cloud.bigtable.admin.v2.models;

import com.google.api.core.InternalApi;
import com.google.bigtable.admin.v2.Cluster.State;
import com.google.bigtable.admin.v2.ClusterName;
import com.google.bigtable.admin.v2.LocationName;
import com.google.bigtable.admin.v2.StorageType;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import javax.annotation.Nonnull;

public class Cluster {
  @Nonnull
  private final com.google.bigtable.admin.v2.Cluster proto;

  @InternalApi
  public static Cluster fromProto(com.google.bigtable.admin.v2.Cluster proto) {
    return new Cluster(proto);
  }

  private Cluster(com.google.bigtable.admin.v2.Cluster proto) {
    this.proto = proto;
    Preconditions.checkNotNull(proto);
    Preconditions.checkArgument(!proto.getName().isEmpty(), "Name must be set");
  }


  /** Gets the cluster's id. */
  @SuppressWarnings("WeakerAccess")
  public String getId() {
    // Constructor ensures that name is not null
    ClusterName fullName = Verify.verifyNotNull(
        ClusterName.parse(proto.getName()),
        "Name can never be null");
    //noinspection ConstantConditions
    return fullName.getCluster();
  }

  /** Get the zone where this cluster is located. */
  public String getZone() {
    LocationName location = Verify.verifyNotNull(LocationName.parse(proto.getLocation()));
    //noinspection ConstantConditions
    return location.getLocation();
  }

  /** Gets the current state of the cluster */
  // TODO(igorbernstein2): try to avoid exposing proto enums
  public State getState() {
    return proto.getState();
  }

  /**
   * Get the number of nodes allocated to this cluster. More nodes enable higher throughput and
   * more consistent performance.
   */
  public int getServeNodes() {
    return proto.getServeNodes();
  }

  /**
   * The type of storage used by this cluster to serve its parent instance's tables, unless
   * explicitly overridden.
   */
  // TODO(igorbernstein2): try to avoid exposing proto enums
  public StorageType getStorageType() {
    return proto.getDefaultStorageType();
  }
}
