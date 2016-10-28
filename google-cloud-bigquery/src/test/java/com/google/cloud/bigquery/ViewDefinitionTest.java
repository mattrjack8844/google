/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;

import org.junit.Test;

import java.util.List;

public class ViewDefinitionTest {

  private static final String VIEW_QUERY = "VIEW QUERY";
  private static final List<UserDefinedFunction> USER_DEFINED_FUNCTIONS =
      ImmutableList.of(UserDefinedFunction.inline("Function"), UserDefinedFunction.fromUri("URI"));
  private static final ViewDefinition VIEW_DEFINITION =
      ViewDefinition.newBuilder(VIEW_QUERY, USER_DEFINED_FUNCTIONS).build();
  private static final ViewDefinition DEPRECATED_VIEW_DEFINITION =
      ViewDefinition.builder(VIEW_QUERY, USER_DEFINED_FUNCTIONS).build();

  @Test
  public void testToBuilder() {
    compareViewDefinition(VIEW_DEFINITION, VIEW_DEFINITION.toBuilder().build());
    ViewDefinition viewDefinition = VIEW_DEFINITION.toBuilder()
        .setQuery("NEW QUERY")
        .build();
    assertEquals("NEW QUERY", viewDefinition.getQuery());
    viewDefinition = viewDefinition.toBuilder()
        .setQuery(VIEW_QUERY)
        .build();
    compareViewDefinition(VIEW_DEFINITION, viewDefinition);
  }

  @Test
  public void testToBuilderIncomplete() {
    TableDefinition viewDefinition = ViewDefinition.of(VIEW_QUERY);
    assertEquals(viewDefinition, viewDefinition.toBuilder().build());
  }

  @Test
  public void testBuilder() {
    assertEquals(VIEW_QUERY, VIEW_DEFINITION.getQuery());
    assertEquals(TableDefinition.Type.VIEW, VIEW_DEFINITION.getType());
    assertEquals(USER_DEFINED_FUNCTIONS, VIEW_DEFINITION.getUserDefinedFunctions());
    ViewDefinition viewDefinition = ViewDefinition.newBuilder(VIEW_QUERY)
        .setUserDefinedFunctions(UserDefinedFunction.inline("Function"),
            UserDefinedFunction.fromUri("URI"))
        .build();
    assertEquals(VIEW_QUERY, viewDefinition.getQuery());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.getType());
    assertEquals(USER_DEFINED_FUNCTIONS, viewDefinition.getUserDefinedFunctions());
    viewDefinition = ViewDefinition.newBuilder(VIEW_QUERY,
        UserDefinedFunction.inline("Function"), UserDefinedFunction.fromUri("URI")).build();
    assertEquals(VIEW_QUERY, viewDefinition.getQuery());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.getType());
    assertEquals(USER_DEFINED_FUNCTIONS, viewDefinition.getUserDefinedFunctions());
    viewDefinition = ViewDefinition.newBuilder(VIEW_QUERY).build();
    assertEquals(VIEW_QUERY, viewDefinition.getQuery());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.getType());
    assertNull(viewDefinition.getUserDefinedFunctions());
  }

  @Test
  public void testBuilderDeprecated() {
    assertEquals(VIEW_QUERY, DEPRECATED_VIEW_DEFINITION.query());
    assertEquals(TableDefinition.Type.VIEW, DEPRECATED_VIEW_DEFINITION.type());
    assertEquals(USER_DEFINED_FUNCTIONS, DEPRECATED_VIEW_DEFINITION.userDefinedFunctions());
    ViewDefinition viewDefinition = ViewDefinition.builder(VIEW_QUERY)
        .userDefinedFunctions(UserDefinedFunction.inline("Function"),
            UserDefinedFunction.fromUri("URI"))
        .build();
    assertEquals(VIEW_QUERY, viewDefinition.query());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.type());
    assertEquals(USER_DEFINED_FUNCTIONS, viewDefinition.userDefinedFunctions());
    viewDefinition = ViewDefinition.builder(VIEW_QUERY,
        UserDefinedFunction.inline("Function"), UserDefinedFunction.fromUri("URI")).build();
    assertEquals(VIEW_QUERY, viewDefinition.query());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.type());
    assertEquals(USER_DEFINED_FUNCTIONS, viewDefinition.userDefinedFunctions());
    viewDefinition = ViewDefinition.builder(VIEW_QUERY).build();
    assertEquals(VIEW_QUERY, viewDefinition.query());
    assertEquals(TableDefinition.Type.VIEW, viewDefinition.type());
    assertNull(viewDefinition.userDefinedFunctions());
  }

  @Test
  public void testToAndFromPb() {
    assertTrue(TableDefinition.fromPb(VIEW_DEFINITION.toPb()) instanceof ViewDefinition);
    compareViewDefinition(VIEW_DEFINITION,
        TableDefinition.<ViewDefinition>fromPb(VIEW_DEFINITION.toPb()));
  }

  private void compareViewDefinition(ViewDefinition expected, ViewDefinition value) {
    assertEquals(expected, value);
    assertEquals(expected.getQuery(), value.getQuery());
    assertEquals(expected.getUserDefinedFunctions(), value.getUserDefinedFunctions());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
