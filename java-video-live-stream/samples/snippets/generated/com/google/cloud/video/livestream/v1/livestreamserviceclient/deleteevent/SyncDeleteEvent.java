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

package com.google.cloud.video.livestream.v1.samples;

// [START livestream_v1_generated_livestreamserviceclient_deleteevent_sync]
import com.google.cloud.video.livestream.v1.DeleteEventRequest;
import com.google.cloud.video.livestream.v1.EventName;
import com.google.cloud.video.livestream.v1.LivestreamServiceClient;
import com.google.protobuf.Empty;

public class SyncDeleteEvent {

  public static void main(String[] args) throws Exception {
    syncDeleteEvent();
  }

  public static void syncDeleteEvent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (LivestreamServiceClient livestreamServiceClient = LivestreamServiceClient.create()) {
      DeleteEventRequest request =
          DeleteEventRequest.newBuilder()
              .setName(EventName.of("[PROJECT]", "[LOCATION]", "[CHANNEL]", "[EVENT]").toString())
              .setRequestId("requestId693933066")
              .build();
      livestreamServiceClient.deleteEvent(request);
    }
  }
}
// [END livestream_v1_generated_livestreamserviceclient_deleteevent_sync]
