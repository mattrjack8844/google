/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.managedkafka.v1.samples;

// [START managedkafka_v1_generated_ManagedKafka_DeleteTopic_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.managedkafka.v1.DeleteTopicRequest;
import com.google.cloud.managedkafka.v1.ManagedKafkaClient;
import com.google.cloud.managedkafka.v1.TopicName;
import com.google.protobuf.Empty;

public class AsyncDeleteTopic {

  public static void main(String[] args) throws Exception {
    asyncDeleteTopic();
  }

  public static void asyncDeleteTopic() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ManagedKafkaClient managedKafkaClient = ManagedKafkaClient.create()) {
      DeleteTopicRequest request =
          DeleteTopicRequest.newBuilder()
              .setName(TopicName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[TOPIC]").toString())
              .build();
      ApiFuture<Empty> future = managedKafkaClient.deleteTopicCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END managedkafka_v1_generated_ManagedKafka_DeleteTopic_async]
