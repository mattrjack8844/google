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
// source: google/identity/accesscontextmanager/v1/access_level.proto

package com.google.identity.accesscontextmanager.v1;

public interface DevicePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.DevicePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether or not screenlock is required for the DevicePolicy to be true.
   * Defaults to `false`.
   * </pre>
   *
   * <code>bool require_screenlock = 1;</code>
   *
   * @return The requireScreenlock.
   */
  boolean getRequireScreenlock();

  /**
   *
   *
   * <pre>
   * Allowed encryptions statuses, an empty list allows all statuses.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceEncryptionStatus allowed_encryption_statuses = 2;
   * </code>
   *
   * @return A list containing the allowedEncryptionStatuses.
   */
  java.util.List<com.google.identity.accesscontextmanager.type.DeviceEncryptionStatus>
      getAllowedEncryptionStatusesList();
  /**
   *
   *
   * <pre>
   * Allowed encryptions statuses, an empty list allows all statuses.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceEncryptionStatus allowed_encryption_statuses = 2;
   * </code>
   *
   * @return The count of allowedEncryptionStatuses.
   */
  int getAllowedEncryptionStatusesCount();
  /**
   *
   *
   * <pre>
   * Allowed encryptions statuses, an empty list allows all statuses.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceEncryptionStatus allowed_encryption_statuses = 2;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The allowedEncryptionStatuses at the given index.
   */
  com.google.identity.accesscontextmanager.type.DeviceEncryptionStatus getAllowedEncryptionStatuses(
      int index);
  /**
   *
   *
   * <pre>
   * Allowed encryptions statuses, an empty list allows all statuses.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceEncryptionStatus allowed_encryption_statuses = 2;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for allowedEncryptionStatuses.
   */
  java.util.List<java.lang.Integer> getAllowedEncryptionStatusesValueList();
  /**
   *
   *
   * <pre>
   * Allowed encryptions statuses, an empty list allows all statuses.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceEncryptionStatus allowed_encryption_statuses = 2;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of allowedEncryptionStatuses at the given index.
   */
  int getAllowedEncryptionStatusesValue(int index);

  /**
   *
   *
   * <pre>
   * Allowed OS versions, an empty list allows all types and all versions.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.OsConstraint os_constraints = 3;</code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.OsConstraint> getOsConstraintsList();
  /**
   *
   *
   * <pre>
   * Allowed OS versions, an empty list allows all types and all versions.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.OsConstraint os_constraints = 3;</code>
   */
  com.google.identity.accesscontextmanager.v1.OsConstraint getOsConstraints(int index);
  /**
   *
   *
   * <pre>
   * Allowed OS versions, an empty list allows all types and all versions.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.OsConstraint os_constraints = 3;</code>
   */
  int getOsConstraintsCount();
  /**
   *
   *
   * <pre>
   * Allowed OS versions, an empty list allows all types and all versions.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.OsConstraint os_constraints = 3;</code>
   */
  java.util.List<? extends com.google.identity.accesscontextmanager.v1.OsConstraintOrBuilder>
      getOsConstraintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Allowed OS versions, an empty list allows all types and all versions.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.OsConstraint os_constraints = 3;</code>
   */
  com.google.identity.accesscontextmanager.v1.OsConstraintOrBuilder getOsConstraintsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Allowed device management levels, an empty list allows all management
   * levels.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceManagementLevel allowed_device_management_levels = 6;
   * </code>
   *
   * @return A list containing the allowedDeviceManagementLevels.
   */
  java.util.List<com.google.identity.accesscontextmanager.type.DeviceManagementLevel>
      getAllowedDeviceManagementLevelsList();
  /**
   *
   *
   * <pre>
   * Allowed device management levels, an empty list allows all management
   * levels.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceManagementLevel allowed_device_management_levels = 6;
   * </code>
   *
   * @return The count of allowedDeviceManagementLevels.
   */
  int getAllowedDeviceManagementLevelsCount();
  /**
   *
   *
   * <pre>
   * Allowed device management levels, an empty list allows all management
   * levels.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceManagementLevel allowed_device_management_levels = 6;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The allowedDeviceManagementLevels at the given index.
   */
  com.google.identity.accesscontextmanager.type.DeviceManagementLevel
      getAllowedDeviceManagementLevels(int index);
  /**
   *
   *
   * <pre>
   * Allowed device management levels, an empty list allows all management
   * levels.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceManagementLevel allowed_device_management_levels = 6;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for
   *     allowedDeviceManagementLevels.
   */
  java.util.List<java.lang.Integer> getAllowedDeviceManagementLevelsValueList();
  /**
   *
   *
   * <pre>
   * Allowed device management levels, an empty list allows all management
   * levels.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.type.DeviceManagementLevel allowed_device_management_levels = 6;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of allowedDeviceManagementLevels at the given index.
   */
  int getAllowedDeviceManagementLevelsValue(int index);

  /**
   *
   *
   * <pre>
   * Whether the device needs to be approved by the customer admin.
   * </pre>
   *
   * <code>bool require_admin_approval = 7;</code>
   *
   * @return The requireAdminApproval.
   */
  boolean getRequireAdminApproval();

  /**
   *
   *
   * <pre>
   * Whether the device needs to be corp owned.
   * </pre>
   *
   * <code>bool require_corp_owned = 8;</code>
   *
   * @return The requireCorpOwned.
   */
  boolean getRequireCorpOwned();
}
