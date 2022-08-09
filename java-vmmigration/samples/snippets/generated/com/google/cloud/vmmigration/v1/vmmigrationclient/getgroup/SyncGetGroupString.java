/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.vmmigration.v1.samples;

// [START vmmigration_v1_generated_vmmigrationclient_getgroup_string_sync]
import com.google.cloud.vmmigration.v1.Group;
import com.google.cloud.vmmigration.v1.GroupName;
import com.google.cloud.vmmigration.v1.VmMigrationClient;

public class SyncGetGroupString {

  public static void main(String[] args) throws Exception {
    syncGetGroupString();
  }

  public static void syncGetGroupString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VmMigrationClient vmMigrationClient = VmMigrationClient.create()) {
      String name = GroupName.of("[PROJECT]", "[LOCATION]", "[GROUP]").toString();
      Group response = vmMigrationClient.getGroup(name);
    }
  }
}
// [END vmmigration_v1_generated_vmmigrationclient_getgroup_string_sync]
