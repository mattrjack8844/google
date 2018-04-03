/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteImageHttpRequest;
import com.google.cloud.compute.v1.DeprecateImageHttpRequest;
import com.google.cloud.compute.v1.DeprecationStatus;
import com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest;
import com.google.cloud.compute.v1.GetImageHttpRequest;
import com.google.cloud.compute.v1.GlobalSetLabelsRequest;
import com.google.cloud.compute.v1.Image;
import static com.google.cloud.compute.v1.ImageClient.ListImagesPagedResponse;
import com.google.cloud.compute.v1.ImageList;
import com.google.cloud.compute.v1.InsertImageHttpRequest;
import com.google.cloud.compute.v1.ListImagesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectFamilyName;
import com.google.cloud.compute.v1.ProjectImageName;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.SetLabelsImageHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ImageStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteImageHttpRequest, Operation> deleteImageCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteImageCallable()");
  }

  @BetaApi
  public UnaryCallable<DeprecateImageHttpRequest, Operation> deprecateImageCallable() {
    throw new UnsupportedOperationException("Not implemented: deprecateImageCallable()");
  }

  @BetaApi
  public UnaryCallable<GetImageHttpRequest, Image> getImageCallable() {
    throw new UnsupportedOperationException("Not implemented: getImageCallable()");
  }

  @BetaApi
  public UnaryCallable<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageCallable() {
    throw new UnsupportedOperationException("Not implemented: getFromFamilyImageCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertImageHttpRequest, Operation> insertImageCallable() {
    throw new UnsupportedOperationException("Not implemented: insertImageCallable()");
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ListImagesPagedResponse> listImagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listImagesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ImageList> listImagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listImagesCallable()");
  }

  @BetaApi
  public UnaryCallable<SetLabelsImageHttpRequest, Operation> setLabelsImageCallable() {
    throw new UnsupportedOperationException("Not implemented: setLabelsImageCallable()");
  }

}