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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_modelserviceclient_tunemodel_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.retail.v2beta.ModelName;
import com.google.cloud.retail.v2beta.ModelServiceClient;
import com.google.cloud.retail.v2beta.TuneModelMetadata;
import com.google.cloud.retail.v2beta.TuneModelRequest;
import com.google.cloud.retail.v2beta.TuneModelResponse;

public class AsyncTuneModelLRO {

  public static void main(String[] args) throws Exception {
    asyncTuneModelLRO();
  }

  public static void asyncTuneModelLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ModelServiceClient modelServiceClient = ModelServiceClient.create()) {
      TuneModelRequest request =
          TuneModelRequest.newBuilder()
              .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[MODEL]").toString())
              .build();
      OperationFuture<TuneModelResponse, TuneModelMetadata> future =
          modelServiceClient.tuneModelOperationCallable().futureCall(request);
      // Do something.
      TuneModelResponse response = future.get();
    }
  }
}
// [END retail_v2beta_generated_modelserviceclient_tunemodel_lro_async]
