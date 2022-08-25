/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface ListGroupsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name)
   * whose groups are to be listed. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name)
   * whose groups are to be listed. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups whose `parent_name` field contains the group
   * name.  If no groups have this parent, the results are empty.
   * </pre>
   *
   * <code>string children_of_group = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the childrenOfGroup field is set.
   */
  boolean hasChildrenOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups whose `parent_name` field contains the group
   * name.  If no groups have this parent, the results are empty.
   * </pre>
   *
   * <code>string children_of_group = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The childrenOfGroup.
   */
  java.lang.String getChildrenOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups whose `parent_name` field contains the group
   * name.  If no groups have this parent, the results are empty.
   * </pre>
   *
   * <code>string children_of_group = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for childrenOfGroup.
   */
  com.google.protobuf.ByteString getChildrenOfGroupBytes();

  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups that are ancestors of the specified group.
   * The groups are returned in order, starting with the immediate parent and
   * ending with the most distant ancestor.  If the specified group has no
   * immediate parent, the results are empty.
   * </pre>
   *
   * <code>string ancestors_of_group = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the ancestorsOfGroup field is set.
   */
  boolean hasAncestorsOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups that are ancestors of the specified group.
   * The groups are returned in order, starting with the immediate parent and
   * ending with the most distant ancestor.  If the specified group has no
   * immediate parent, the results are empty.
   * </pre>
   *
   * <code>string ancestors_of_group = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The ancestorsOfGroup.
   */
  java.lang.String getAncestorsOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns groups that are ancestors of the specified group.
   * The groups are returned in order, starting with the immediate parent and
   * ending with the most distant ancestor.  If the specified group has no
   * immediate parent, the results are empty.
   * </pre>
   *
   * <code>string ancestors_of_group = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for ancestorsOfGroup.
   */
  com.google.protobuf.ByteString getAncestorsOfGroupBytes();

  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns the descendants of the specified group.  This is a superset of
   * the results returned by the `children_of_group` filter, and includes
   * children-of-children, and so forth.
   * </pre>
   *
   * <code>string descendants_of_group = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the descendantsOfGroup field is set.
   */
  boolean hasDescendantsOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns the descendants of the specified group.  This is a superset of
   * the results returned by the `children_of_group` filter, and includes
   * children-of-children, and so forth.
   * </pre>
   *
   * <code>string descendants_of_group = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The descendantsOfGroup.
   */
  java.lang.String getDescendantsOfGroup();
  /**
   *
   *
   * <pre>
   * A group name. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * Returns the descendants of the specified group.  This is a superset of
   * the results returned by the `children_of_group` filter, and includes
   * children-of-children, and so forth.
   * </pre>
   *
   * <code>string descendants_of_group = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for descendantsOfGroup.
   */
  com.google.protobuf.ByteString getDescendantsOfGroupBytes();

  /**
   *
   *
   * <pre>
   * A positive number that is the maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `next_page_token` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `next_page_token` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  public com.google.monitoring.v3.ListGroupsRequest.FilterCase getFilterCase();
}
