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

package com.google.cloud.vision.v1.samples;

// [START vision_v1_generated_productsearchclient_listproducts_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vision.v1.ListProductsRequest;
import com.google.cloud.vision.v1.LocationName;
import com.google.cloud.vision.v1.Product;
import com.google.cloud.vision.v1.ProductSearchClient;

public class AsyncListProducts {

  public static void main(String[] args) throws Exception {
    asyncListProducts();
  }

  public static void asyncListProducts() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      ListProductsRequest request =
          ListProductsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Product> future =
          productSearchClient.listProductsPagedCallable().futureCall(request);
      // Do something.
      for (Product element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END vision_v1_generated_productsearchclient_listproducts_async]
