/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.container.v1beta1;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ProjectPathName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project_path=**}");

  private volatile Map<String, String> fieldValuesMap;

  private final String projectPath;

  public String getProjectPath() {
    return projectPath;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectPathName(Builder builder) {
    projectPath = Preconditions.checkNotNull(builder.getProjectPath());
  }

  public static ProjectPathName of(String projectPath) {
    return newBuilder()
      .setProjectPath(projectPath)
      .build();
  }

  public static String format(String projectPath) {
    return newBuilder()
      .setProjectPath(projectPath)
      .build()
      .toString();
  }

  public static ProjectPathName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ProjectPathName.parse: formattedString not in valid format");
    return of(matchMap.get("project_path"));
  }

  public static List<ProjectPathName> parseList(List<String> formattedStrings) {
    List<ProjectPathName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProjectPathName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ProjectPathName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("projectPath", projectPath);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project_path", projectPath);
  }

  /** Builder for ProjectPathName. */
  public static class Builder {

    private String projectPath;

    public String getProjectPath() {
      return projectPath;
    }

    public Builder setProjectPath(String projectPath) {
      this.projectPath = projectPath;
      return this;
    }

    private Builder() {
    }

    private Builder(ProjectPathName projectPathName) {
      projectPath = projectPathName.projectPath;
    }

    public ProjectPathName build() {
      return new ProjectPathName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectPathName) {
      ProjectPathName that = (ProjectPathName) o;
      return (this.projectPath.equals(that.projectPath));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= projectPath.hashCode();
    return h;
  }
}

