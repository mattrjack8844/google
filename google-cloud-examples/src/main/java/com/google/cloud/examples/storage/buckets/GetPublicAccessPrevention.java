/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.storage.buckets;

// [START storage_get_public_access_prevention]
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class GetPublicAccessPrevention {
  public static void getPublicAccessPrevention(String projectId, String bucketName) {
    // The ID of your GCP project
    // String projectId = "your-project-id";

    // The ID of your GCS bucket
    // String bucketName = "your-unique-bucket-name";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    Bucket bucket = storage.get(bucketName);

    // Gets Bucket Metadata and prints publicAccessPrevention value (either 'inherited' or
    // 'enforced').
    BucketInfo.PublicAccessPrevention publicAccessPrevention =
        bucket.getIamConfiguration().getPublicAccessPrevention();

    System.out.println(
        "Public access prevention is set to "
            + publicAccessPrevention.getValue()
            + " for "
            + bucketName);
  }
}
// [END storage_get_public_access_prevention]
