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
import com.google.bigtable.admin.v2.CheckConsistencyRequest;
import com.google.bigtable.admin.v2.GenerateConsistencyTokenResponse;
import com.google.bigtable.admin.v2.InstanceName;
import com.google.bigtable.admin.v2.TableName;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/**
 * Wrapper for {@link GenerateConsistencyTokenResponse#getConsistencyToken()}
 *
 * <p>Cannot be created. They are obtained by invoking {@link
 * com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient#generateConsistencyToken(String)}
 */
public final class ConsistencyToken {
  private final TableName tableName;
  private final String token;

  public static ConsistencyToken of(TableName tableName, String token) {
    return new ConsistencyToken(tableName, token);
  }

  public ConsistencyToken(TableName tableName, String token) {
    this.tableName = tableName;
    this.token = token;
  }

  @InternalApi
  public CheckConsistencyRequest toProto(InstanceName instanceName) {
    Preconditions.checkArgument(
        instanceName.equals(InstanceName.of(tableName.getProject(), tableName.getInstance())),
        "Consistency tokens are only valid within a single instance.");

    return CheckConsistencyRequest.newBuilder()
        .setName(tableName.toString())
        .setConsistencyToken(token)
        .build();
  }

  @VisibleForTesting
  String getToken() {
    return token;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("token", token).toString();
  }
}
