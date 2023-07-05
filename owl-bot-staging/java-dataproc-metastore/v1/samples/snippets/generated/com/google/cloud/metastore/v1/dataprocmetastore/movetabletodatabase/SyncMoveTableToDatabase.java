/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.metastore.v1.samples;

// [START metastore_v1_generated_DataprocMetastore_MoveTableToDatabase_sync]
import com.google.cloud.metastore.v1.DataprocMetastoreClient;
import com.google.cloud.metastore.v1.MoveTableToDatabaseRequest;
import com.google.cloud.metastore.v1.MoveTableToDatabaseResponse;
import com.google.cloud.metastore.v1.ServiceName;

public class SyncMoveTableToDatabase {

  public static void main(String[] args) throws Exception {
    syncMoveTableToDatabase();
  }

  public static void syncMoveTableToDatabase() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataprocMetastoreClient dataprocMetastoreClient = DataprocMetastoreClient.create()) {
      MoveTableToDatabaseRequest request =
          MoveTableToDatabaseRequest.newBuilder()
              .setService(ServiceName.of("[PROJECT]", "[LOCATION]", "[SERVICE]").toString())
              .setTableName("tableName-1988717703")
              .setDbName("dbName-1339126743")
              .setDestinationDbName("destinationDbName-2077361705")
              .build();
      MoveTableToDatabaseResponse response =
          dataprocMetastoreClient.moveTableToDatabaseAsync(request).get();
    }
  }
}
// [END metastore_v1_generated_DataprocMetastore_MoveTableToDatabase_sync]
