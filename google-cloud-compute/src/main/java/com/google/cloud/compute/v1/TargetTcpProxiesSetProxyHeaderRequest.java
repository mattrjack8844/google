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
public final class TargetTcpProxiesSetProxyHeaderRequest implements ApiMessage {
  private final String proxyHeader;

  private TargetTcpProxiesSetProxyHeaderRequest() {
    this.proxyHeader = null;
  }


  private TargetTcpProxiesSetProxyHeaderRequest(
      String proxyHeader
      ) {
    this.proxyHeader = proxyHeader;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("proxyHeader") && proxyHeader != null) {
      fieldMap.put("proxyHeader", Collections.singletonList(String.valueOf(proxyHeader)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("proxyHeader")) {
      return String.valueOf(proxyHeader);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getProxyHeader() {
    return proxyHeader;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetTcpProxiesSetProxyHeaderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetTcpProxiesSetProxyHeaderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetTcpProxiesSetProxyHeaderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetTcpProxiesSetProxyHeaderRequest();
  }

  public static class Builder {
    private String proxyHeader;

    Builder() {}

    public Builder mergeFrom(TargetTcpProxiesSetProxyHeaderRequest other) {
      if (other == TargetTcpProxiesSetProxyHeaderRequest.getDefaultInstance()) return this;
      if (other.getProxyHeader() != null) {
        this.proxyHeader = other.proxyHeader;
      }
      return this;
    }

    Builder(TargetTcpProxiesSetProxyHeaderRequest source) {
      this.proxyHeader = source.proxyHeader;
    }

    public String getProxyHeader() {
      return proxyHeader;
    }

    public Builder setProxyHeader(String proxyHeader) {
      this.proxyHeader = proxyHeader;
      return this;
    }


    public TargetTcpProxiesSetProxyHeaderRequest build() {
      return new TargetTcpProxiesSetProxyHeaderRequest(
        proxyHeader
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setProxyHeader(this.proxyHeader);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetTcpProxiesSetProxyHeaderRequest{"
        + "proxyHeader=" + proxyHeader
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetTcpProxiesSetProxyHeaderRequest) {
      TargetTcpProxiesSetProxyHeaderRequest that = (TargetTcpProxiesSetProxyHeaderRequest) o;
      return
          Objects.equals(this.proxyHeader, that.getProxyHeader())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      proxyHeader
    );
  }
}
