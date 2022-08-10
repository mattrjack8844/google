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

package com.google.cloud.gkebackup.v1.samples;

// [START gkebackup_v1_generated_backupforgkeclient_getvolumerestore_volumerestorename_sync]
import com.google.cloud.gkebackup.v1.BackupForGKEClient;
import com.google.cloud.gkebackup.v1.VolumeRestore;
import com.google.cloud.gkebackup.v1.VolumeRestoreName;

public class SyncGetVolumeRestoreVolumerestorename {

  public static void main(String[] args) throws Exception {
    syncGetVolumeRestoreVolumerestorename();
  }

  public static void syncGetVolumeRestoreVolumerestorename() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BackupForGKEClient backupForGKEClient = BackupForGKEClient.create()) {
      VolumeRestoreName name =
          VolumeRestoreName.of(
              "[PROJECT]", "[LOCATION]", "[RESTORE_PLAN]", "[RESTORE]", "[VOLUME_RESTORE]");
      VolumeRestore response = backupForGKEClient.getVolumeRestore(name);
    }
  }
}
// [END gkebackup_v1_generated_backupforgkeclient_getvolumerestore_volumerestorename_sync]
