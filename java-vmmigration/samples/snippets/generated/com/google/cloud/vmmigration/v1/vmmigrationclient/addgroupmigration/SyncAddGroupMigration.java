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

// [START vmmigration_v1_generated_vmmigrationclient_addgroupmigration_sync]
import com.google.cloud.vmmigration.v1.AddGroupMigrationRequest;
import com.google.cloud.vmmigration.v1.AddGroupMigrationResponse;
import com.google.cloud.vmmigration.v1.GroupName;
import com.google.cloud.vmmigration.v1.MigratingVmName;
import com.google.cloud.vmmigration.v1.VmMigrationClient;

public class SyncAddGroupMigration {

  public static void main(String[] args) throws Exception {
    syncAddGroupMigration();
  }

  public static void syncAddGroupMigration() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VmMigrationClient vmMigrationClient = VmMigrationClient.create()) {
      AddGroupMigrationRequest request =
          AddGroupMigrationRequest.newBuilder()
              .setGroup(GroupName.of("[PROJECT]", "[LOCATION]", "[GROUP]").toString())
              .setMigratingVm(
                  MigratingVmName.of("[PROJECT]", "[LOCATION]", "[SOURCE]", "[MIGRATING_VM]")
                      .toString())
              .build();
      AddGroupMigrationResponse response = vmMigrationClient.addGroupMigrationAsync(request).get();
    }
  }
}
// [END vmmigration_v1_generated_vmmigrationclient_addgroupmigration_sync]
