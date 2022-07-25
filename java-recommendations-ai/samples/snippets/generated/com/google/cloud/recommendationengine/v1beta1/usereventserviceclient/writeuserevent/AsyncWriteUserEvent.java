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

// [START recommendationengine_v1beta1_generated_usereventserviceclient_writeuserevent_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommendationengine.v1beta1.EventStoreName;
import com.google.cloud.recommendationengine.v1beta1.UserEvent;
import com.google.cloud.recommendationengine.v1beta1.UserEventServiceClient;
import com.google.cloud.recommendationengine.v1beta1.WriteUserEventRequest;

public class AsyncWriteUserEvent {

  public static void main(String[] args) throws Exception {
    asyncWriteUserEvent();
  }

  public static void asyncWriteUserEvent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      WriteUserEventRequest request =
          WriteUserEventRequest.newBuilder()
              .setParent(
                  EventStoreName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]")
                      .toString())
              .setUserEvent(UserEvent.newBuilder().build())
              .build();
      ApiFuture<UserEvent> future =
          userEventServiceClient.writeUserEventCallable().futureCall(request);
      // Do something.
      UserEvent response = future.get();
    }
  }
}
// [END recommendationengine_v1beta1_generated_usereventserviceclient_writeuserevent_async]
