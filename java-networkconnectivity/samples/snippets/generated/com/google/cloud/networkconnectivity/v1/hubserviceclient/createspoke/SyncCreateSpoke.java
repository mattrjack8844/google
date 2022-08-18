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

package com.google.cloud.networkconnectivity.v1.samples;

// [START networkconnectivity_v1_generated_hubserviceclient_createspoke_sync]
import com.google.cloud.networkconnectivity.v1.CreateSpokeRequest;
import com.google.cloud.networkconnectivity.v1.HubServiceClient;
import com.google.cloud.networkconnectivity.v1.LocationName;
import com.google.cloud.networkconnectivity.v1.Spoke;

public class SyncCreateSpoke {

  public static void main(String[] args) throws Exception {
    syncCreateSpoke();
  }

  public static void syncCreateSpoke() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (HubServiceClient hubServiceClient = HubServiceClient.create()) {
      CreateSpokeRequest request =
          CreateSpokeRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setSpokeId("spokeId-1998996281")
              .setSpoke(Spoke.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      Spoke response = hubServiceClient.createSpokeAsync(request).get();
    }
  }
}
// [END networkconnectivity_v1_generated_hubserviceclient_createspoke_sync]
