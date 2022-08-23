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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_metadataserviceclient_getentity_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dataplex.v1.Entity;
import com.google.cloud.dataplex.v1.EntityName;
import com.google.cloud.dataplex.v1.GetEntityRequest;
import com.google.cloud.dataplex.v1.MetadataServiceClient;

public class AsyncGetEntity {

  public static void main(String[] args) throws Exception {
    asyncGetEntity();
  }

  public static void asyncGetEntity() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (MetadataServiceClient metadataServiceClient = MetadataServiceClient.create()) {
      GetEntityRequest request =
          GetEntityRequest.newBuilder()
              .setName(
                  EntityName.of("[PROJECT]", "[LOCATION]", "[LAKE]", "[ZONE]", "[ENTITY]")
                      .toString())
              .build();
      ApiFuture<Entity> future = metadataServiceClient.getEntityCallable().futureCall(request);
      // Do something.
      Entity response = future.get();
    }
  }
}
// [END dataplex_v1_generated_metadataserviceclient_getentity_async]
