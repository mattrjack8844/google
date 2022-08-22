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

package com.google.cloud.datafusion.v1.samples;

// [START datafusion_v1_generated_datafusionclient_deleteinstance_instancename_sync]
import com.google.cloud.datafusion.v1.DataFusionClient;
import com.google.cloud.datafusion.v1.InstanceName;
import com.google.protobuf.Empty;

public class SyncDeleteInstanceInstancename {

  public static void main(String[] args) throws Exception {
    syncDeleteInstanceInstancename();
  }

  public static void syncDeleteInstanceInstancename() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataFusionClient dataFusionClient = DataFusionClient.create()) {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
      dataFusionClient.deleteInstanceAsync(name).get();
    }
  }
}
// [END datafusion_v1_generated_datafusionclient_deleteinstance_instancename_sync]
