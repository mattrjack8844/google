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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class UrlMapName implements com.google.api.resourcenames.ResourceName {
  private final String project;
  private final String urlMap;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/urlMaps/{urlMap}");

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private UrlMapName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    urlMap = Preconditions.checkNotNull(builder.getUrlMap());
  }

  public static UrlMapName of(
      String project,
      String urlMap
      ) {
    return newBuilder()
    .setProject(project)
    .setUrlMap(urlMap)
      .build();
  }

  public static String format(
      String project,
      String urlMap
      ) {
    return of(
        project,
        urlMap
        )
        .toString();
  }

  public String getProject() {
    return project;
  }

  public String getUrlMap() {
    return urlMap;
  }


  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("urlMap", urlMap);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }


  public static ResourceNameFactory<UrlMapName> newFactory() {
    return new ResourceNameFactory<UrlMapName>() {
      public UrlMapName parse(String formattedString) {return UrlMapName.parse(formattedString);}
    };
  }

  public static UrlMapName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "UrlMapName.parse: formattedString not in valid format");
    return of(
      matchMap.get("project"),
      matchMap.get("urlMap")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public static class Builder {
    private String project;
    private String urlMap;

    public String getProject() {
      return project;
    }
    public String getUrlMap() {
      return urlMap;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setUrlMap(String urlMap) {
      this.urlMap = urlMap;
      return this;
    }

    private Builder() {}

    public Builder (UrlMapName urlMapName) {
      project = urlMapName.project;
      urlMap = urlMapName.urlMap;
    }

    public UrlMapName build() {
      return new UrlMapName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "urlMap", urlMap
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UrlMapName) {
      UrlMapName that = (UrlMapName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.urlMap, that.getUrlMap())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      urlMap
    );
  }
}
