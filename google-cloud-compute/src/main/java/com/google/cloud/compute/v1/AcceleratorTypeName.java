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
public final class AcceleratorTypeName implements com.google.api.resourcenames.ResourceName {
  private final String acceleratorType;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/zones/{zone}/acceleratorTypes/{acceleratorType}");

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AcceleratorTypeName(Builder builder) {
    acceleratorType = Preconditions.checkNotNull(builder.getAcceleratorType());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static AcceleratorTypeName of(
      String acceleratorType,
      String project,
      String zone
      ) {
    return newBuilder()
    .setAcceleratorType(acceleratorType)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public static String format(
      String acceleratorType,
      String project,
      String zone
      ) {
    return of(
        acceleratorType,
        project,
        zone
        )
        .toString();
  }

  public String getAcceleratorType() {
    return acceleratorType;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("acceleratorType", acceleratorType);
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("zone", zone);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }


  public static ResourceNameFactory<AcceleratorTypeName> newFactory() {
    return new ResourceNameFactory<AcceleratorTypeName>() {
      public AcceleratorTypeName parse(String formattedString) {return AcceleratorTypeName.parse(formattedString);}
    };
  }

  public static AcceleratorTypeName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AcceleratorTypeName.parse: formattedString not in valid format");
    return of(
      matchMap.get("acceleratorType"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public static class Builder {
    private String acceleratorType;
    private String project;
    private String zone;

    public String getAcceleratorType() {
      return acceleratorType;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setAcceleratorType(String acceleratorType) {
      this.acceleratorType = acceleratorType;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    private Builder() {}

    public Builder (AcceleratorTypeName acceleratorTypeName) {
      acceleratorType = acceleratorTypeName.acceleratorType;
      project = acceleratorTypeName.project;
      zone = acceleratorTypeName.zone;
    }

    public AcceleratorTypeName build() {
      return new AcceleratorTypeName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "acceleratorType", acceleratorType,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AcceleratorTypeName) {
      AcceleratorTypeName that = (AcceleratorTypeName) o;
      return
          Objects.equals(this.acceleratorType, that.getAcceleratorType()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      acceleratorType,
      project,
      zone
    );
  }
}
