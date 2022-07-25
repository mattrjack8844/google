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

package com.google.cloud.run.v2.samples;

// [START run_v2_generated_servicesclient_listservices_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.run.v2.ListServicesRequest;
import com.google.cloud.run.v2.LocationName;
import com.google.cloud.run.v2.Service;
import com.google.cloud.run.v2.ServicesClient;

public class AsyncListServices {

  public static void main(String[] args) throws Exception {
    asyncListServices();
  }

  public static void asyncListServices() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ServicesClient servicesClient = ServicesClient.create()) {
      ListServicesRequest request =
          ListServicesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setShowDeleted(true)
              .build();
      ApiFuture<Service> future = servicesClient.listServicesPagedCallable().futureCall(request);
      // Do something.
      for (Service element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END run_v2_generated_servicesclient_listservices_async]
