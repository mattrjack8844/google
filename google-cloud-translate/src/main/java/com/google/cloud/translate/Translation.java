/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.translate;

import com.google.api.services.translate.model.TranslationsResource;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Objects;

/**
 * Information about a translation. Objects of this class contain the translated text and the source
 * language's code. Source language's code can be the one provided by the user (if any) or the one
 * detected by the Google Translate service.
 *
 * <a href="https://cloud.google.com/translate/v2/translating-text-with-rest">Translating Text</a>
 */
public class Translation implements Serializable {

  private static final long serialVersionUID = 2556017420486245581L;
  static final Function<TranslationsResource, Translation> FROM_PB_FUNCTION =
      new Function<TranslationsResource, Translation>() {
        @Override
        public Translation apply(TranslationsResource translationPb) {
          return Translation.fromPb(translationPb);
        }
      };

  private final String translatedText;
  private final String sourceLanguage;

  private Translation(String translatedText, String sourceLanguage) {
    this.translatedText = translatedText;
    this.sourceLanguage = sourceLanguage;
  }

  /**
   * Returns the translated text.
   */
  @Deprecated
  public String translatedText() {
    return translatedText;
  }

  /**
   * Returns the translated text.
   */
  public String getTranslatedText() {
    return translatedText;
  }

  /**
   * Returns the language code of the source text. If no source language was provided this value is
   * the source language as detected by the Google Translate service.
   */
  @Deprecated
  public String sourceLanguage() {
    return getSourceLanguage();
  }

  /**
   * Returns the language code of the source text. If no source language was provided this value is
   * the source language as detected by the Google Translate service.
   */
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("translatedText", translatedText)
        .add("sourceLanguage", sourceLanguage)
        .toString();
  }

  @Override
  public final int hashCode() {
    return Objects.hash(translatedText, sourceLanguage);
  }

  @Override
  public final boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || !obj.getClass().equals(Translation.class)) {
      return false;
    }
    Translation other = (Translation) obj;
    return Objects.equals(translatedText, other.translatedText)
        && Objects.equals(sourceLanguage, other.sourceLanguage);
  }

  static Translation fromPb(TranslationsResource translationPb) {
    return new Translation(translationPb.getTranslatedText(),
        translationPb.getDetectedSourceLanguage());
  }
}
