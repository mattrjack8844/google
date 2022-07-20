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

package com.google.cloud.recommendationengine.v1beta1.samples;

// [START recommendationengine_v1beta1_generated_usereventserviceclient_writeuserevent_eventstorenameuserevent_sync]
import com.google.cloud.recommendationengine.v1beta1.EventStoreName;
import com.google.cloud.recommendationengine.v1beta1.UserEvent;
import com.google.cloud.recommendationengine.v1beta1.UserEventServiceClient;

public class SyncWriteUserEventEventstorenameUserevent {

  public static void main(String[] args) throws Exception {
    syncWriteUserEventEventstorenameUserevent();
  }

  public static void syncWriteUserEventEventstorenameUserevent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      EventStoreName parent =
          EventStoreName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]");
      UserEvent userEvent = UserEvent.newBuilder().build();
      UserEvent response = userEventServiceClient.writeUserEvent(parent, userEvent);
    }
  }
}
// [END recommendationengine_v1beta1_generated_usereventserviceclient_writeuserevent_eventstorenameuserevent_sync]
