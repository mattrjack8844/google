/*
 * Copyright 2018 Google LLC
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

import com.google.api.core.InternalApi;
import com.google.api.gax.paging.Page;
import com.google.cloud.PageImpl;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public class EmptyTableResult extends TableResult {

  private static final long serialVersionUID = -4831062717210349819L;

  /**
   * If {@code schema} is non-null, {@code TableResult} adds the schema to {@code FieldValueList}s
   * when iterating through them. {@code pageNoSchema} must not be null.
   */
  @InternalApi("Exposed for testing")
  public EmptyTableResult() {
    super(null, 0, new PageImpl<FieldValueList>(
            null,
            "",
            null));
  }
}
