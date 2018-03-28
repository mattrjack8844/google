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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class RegionInstanceGroupsListInstancesRequest implements ApiMessage {
  private final String instanceState;
  private final String portName;

  private RegionInstanceGroupsListInstancesRequest() {
    this.instanceState = null;
    this.portName = null;
  }


  private RegionInstanceGroupsListInstancesRequest(
      String instanceState,
      String portName
      ) {
    this.instanceState = instanceState;
    this.portName = portName;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instanceState") && instanceState != null) {
      fieldMap.put("instanceState", Collections.singletonList(String.valueOf(instanceState)));
    }
    if (fieldNames.contains("portName") && portName != null) {
      fieldMap.put("portName", Collections.singletonList(String.valueOf(portName)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("instanceState")) {
      return String.valueOf(instanceState);
    }
    if (fieldName.equals("portName")) {
      return String.valueOf(portName);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getInstanceState() {
    return instanceState;
  }

  public String getPortName() {
    return portName;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RegionInstanceGroupsListInstancesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RegionInstanceGroupsListInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RegionInstanceGroupsListInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegionInstanceGroupsListInstancesRequest();
  }

  public static class Builder {
    private String instanceState;
    private String portName;

    Builder() {}

    public Builder mergeFrom(RegionInstanceGroupsListInstancesRequest other) {
      if (other == RegionInstanceGroupsListInstancesRequest.getDefaultInstance()) return this;
      if (other.getInstanceState() != null) {
        this.instanceState = other.instanceState;
      }
      if (other.getPortName() != null) {
        this.portName = other.portName;
      }
      return this;
    }

    Builder(RegionInstanceGroupsListInstancesRequest source) {
      this.instanceState = source.instanceState;
      this.portName = source.portName;
    }

    public String getInstanceState() {
      return instanceState;
    }

    public Builder setInstanceState(String instanceState) {
      this.instanceState = instanceState;
      return this;
    }

    public String getPortName() {
      return portName;
    }

    public Builder setPortName(String portName) {
      this.portName = portName;
      return this;
    }


    public RegionInstanceGroupsListInstancesRequest build() {

      return new RegionInstanceGroupsListInstancesRequest(
        instanceState,
        portName
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInstanceState(this.instanceState);
      newBuilder.setPortName(this.portName);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RegionInstanceGroupsListInstancesRequest{"
        + "instanceState=" + instanceState + ", "
        + "portName=" + portName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionInstanceGroupsListInstancesRequest) {
      RegionInstanceGroupsListInstancesRequest that = (RegionInstanceGroupsListInstancesRequest) o;
      return
          Objects.equals(this.instanceState, that.getInstanceState()) &&
          Objects.equals(this.portName, that.getPortName())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceState,
      portName
    );
  }
}
