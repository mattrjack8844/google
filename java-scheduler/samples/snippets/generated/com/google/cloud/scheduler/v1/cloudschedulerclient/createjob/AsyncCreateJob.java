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

package com.google.cloud.scheduler.v1.samples;

// [START scheduler_v1_generated_cloudschedulerclient_createjob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.scheduler.v1.CloudSchedulerClient;
import com.google.cloud.scheduler.v1.CreateJobRequest;
import com.google.cloud.scheduler.v1.Job;
import com.google.cloud.scheduler.v1.LocationName;

public class AsyncCreateJob {

  public static void main(String[] args) throws Exception {
    asyncCreateJob();
  }

  public static void asyncCreateJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
      CreateJobRequest request =
          CreateJobRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setJob(Job.newBuilder().build())
              .build();
      ApiFuture<Job> future = cloudSchedulerClient.createJobCallable().futureCall(request);
      // Do something.
      Job response = future.get();
    }
  }
}
// [END scheduler_v1_generated_cloudschedulerclient_createjob_async]
