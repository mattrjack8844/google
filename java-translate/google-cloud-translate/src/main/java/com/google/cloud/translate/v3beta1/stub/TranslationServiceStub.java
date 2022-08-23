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

package com.google.cloud.translate.v3beta1.stub;

import static com.google.cloud.translate.v3beta1.TranslationServiceClient.ListGlossariesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.translate.v3beta1.BatchTranslateDocumentMetadata;
import com.google.cloud.translate.v3beta1.BatchTranslateDocumentRequest;
import com.google.cloud.translate.v3beta1.BatchTranslateDocumentResponse;
import com.google.cloud.translate.v3beta1.BatchTranslateMetadata;
import com.google.cloud.translate.v3beta1.BatchTranslateResponse;
import com.google.cloud.translate.v3beta1.BatchTranslateTextRequest;
import com.google.cloud.translate.v3beta1.CreateGlossaryMetadata;
import com.google.cloud.translate.v3beta1.CreateGlossaryRequest;
import com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata;
import com.google.cloud.translate.v3beta1.DeleteGlossaryRequest;
import com.google.cloud.translate.v3beta1.DeleteGlossaryResponse;
import com.google.cloud.translate.v3beta1.DetectLanguageRequest;
import com.google.cloud.translate.v3beta1.DetectLanguageResponse;
import com.google.cloud.translate.v3beta1.GetGlossaryRequest;
import com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest;
import com.google.cloud.translate.v3beta1.Glossary;
import com.google.cloud.translate.v3beta1.ListGlossariesRequest;
import com.google.cloud.translate.v3beta1.ListGlossariesResponse;
import com.google.cloud.translate.v3beta1.SupportedLanguages;
import com.google.cloud.translate.v3beta1.TranslateDocumentRequest;
import com.google.cloud.translate.v3beta1.TranslateDocumentResponse;
import com.google.cloud.translate.v3beta1.TranslateTextRequest;
import com.google.cloud.translate.v3beta1.TranslateTextResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the TranslationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class TranslationServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<TranslateTextRequest, TranslateTextResponse> translateTextCallable() {
    throw new UnsupportedOperationException("Not implemented: translateTextCallable()");
  }

  public UnaryCallable<DetectLanguageRequest, DetectLanguageResponse> detectLanguageCallable() {
    throw new UnsupportedOperationException("Not implemented: detectLanguageCallable()");
  }

  public UnaryCallable<GetSupportedLanguagesRequest, SupportedLanguages>
      getSupportedLanguagesCallable() {
    throw new UnsupportedOperationException("Not implemented: getSupportedLanguagesCallable()");
  }

  public UnaryCallable<TranslateDocumentRequest, TranslateDocumentResponse>
      translateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: translateDocumentCallable()");
  }

  public OperationCallable<
          BatchTranslateTextRequest, BatchTranslateResponse, BatchTranslateMetadata>
      batchTranslateTextOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchTranslateTextOperationCallable()");
  }

  public UnaryCallable<BatchTranslateTextRequest, Operation> batchTranslateTextCallable() {
    throw new UnsupportedOperationException("Not implemented: batchTranslateTextCallable()");
  }

  public OperationCallable<
          BatchTranslateDocumentRequest,
          BatchTranslateDocumentResponse,
          BatchTranslateDocumentMetadata>
      batchTranslateDocumentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchTranslateDocumentOperationCallable()");
  }

  public UnaryCallable<BatchTranslateDocumentRequest, Operation> batchTranslateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: batchTranslateDocumentCallable()");
  }

  public OperationCallable<CreateGlossaryRequest, Glossary, CreateGlossaryMetadata>
      createGlossaryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createGlossaryOperationCallable()");
  }

  public UnaryCallable<CreateGlossaryRequest, Operation> createGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: createGlossaryCallable()");
  }

  public UnaryCallable<ListGlossariesRequest, ListGlossariesPagedResponse>
      listGlossariesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossariesPagedCallable()");
  }

  public UnaryCallable<ListGlossariesRequest, ListGlossariesResponse> listGlossariesCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossariesCallable()");
  }

  public UnaryCallable<GetGlossaryRequest, Glossary> getGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: getGlossaryCallable()");
  }

  public OperationCallable<DeleteGlossaryRequest, DeleteGlossaryResponse, DeleteGlossaryMetadata>
      deleteGlossaryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlossaryOperationCallable()");
  }

  public UnaryCallable<DeleteGlossaryRequest, Operation> deleteGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlossaryCallable()");
  }

  @Override
  public abstract void close();
}
