// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3;

public interface BatchTranslateDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.BatchTranslateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The ISO-639 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * [Language Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   * <pre>
   * Required. The ISO-639 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * [Language Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString
      getSourceLanguageCodeBytes();

  /**
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the targetLanguageCodes.
   */
  java.util.List<java.lang.String>
      getTargetLanguageCodesList();
  /**
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of targetLanguageCodes.
   */
  int getTargetLanguageCodesCount();
  /**
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The targetLanguageCodes at the given index.
   */
  java.lang.String getTargetLanguageCodes(int index);
  /**
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the targetLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString
      getTargetLanguageCodesBytes(int index);

  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.translate.v3.BatchDocumentInputConfig> 
      getInputConfigsList();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3.BatchDocumentInputConfig getInputConfigs(int index);
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getInputConfigsCount();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.BatchDocumentInputConfigOrBuilder> 
      getInputConfigsOrBuilderList();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3.BatchDocumentInputConfigOrBuilder getInputConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.translate.v3.BatchDocumentOutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3.BatchDocumentOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getModelsCount();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsModels(
      java.lang.String key);
  /**
   * Use {@link #getModelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getModels();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getModelsMap();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getModelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getModelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getGlossariesCount();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsGlossaries(
      java.lang.String key);
  /**
   * Use {@link #getGlossariesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.translate.v3.TranslateTextGlossaryConfig>
  getGlossaries();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.translate.v3.TranslateTextGlossaryConfig>
  getGlossariesMap();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossariesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.translate.v3.TranslateTextGlossaryConfig defaultValue);
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossariesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. The file format conversion map that is applied to all input
   * files. The map key is the original mime_type. The map value is the target
   * mime_type of translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getFormatConversionsCount();
  /**
   * <pre>
   * Optional. The file format conversion map that is applied to all input
   * files. The map key is the original mime_type. The map value is the target
   * mime_type of translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsFormatConversions(
      java.lang.String key);
  /**
   * Use {@link #getFormatConversionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFormatConversions();
  /**
   * <pre>
   * Optional. The file format conversion map that is applied to all input
   * files. The map key is the original mime_type. The map value is the target
   * mime_type of translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFormatConversionsMap();
  /**
   * <pre>
   * Optional. The file format conversion map that is applied to all input
   * files. The map key is the original mime_type. The map value is the target
   * mime_type of translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getFormatConversionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The file format conversion map that is applied to all input
   * files. The map key is the original mime_type. The map value is the target
   * mime_type of translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getFormatConversionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. This flag is to support user customized attribution.
   * If not provided, the default is `Machine Translated by Google`.
   * Customized attribution should follow rules in
   * https://cloud.google.com/translate/attribution#attribution_and_logos
   * </pre>
   *
   * <code>string customized_attribution = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The customizedAttribution.
   */
  java.lang.String getCustomizedAttribution();
  /**
   * <pre>
   * Optional. This flag is to support user customized attribution.
   * If not provided, the default is `Machine Translated by Google`.
   * Customized attribution should follow rules in
   * https://cloud.google.com/translate/attribution#attribution_and_logos
   * </pre>
   *
   * <code>string customized_attribution = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for customizedAttribution.
   */
  com.google.protobuf.ByteString
      getCustomizedAttributionBytes();

  /**
   * <pre>
   * Optional. If true, use the text removal server to remove the shadow text on
   * background image for native pdf translation.
   * Shadow removal feature can only be enabled when
   * is_translate_native_pdf_only: false &amp;&amp; pdf_native_only: false
   * </pre>
   *
   * <code>bool enable_shadow_removal_native_pdf = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enableShadowRemovalNativePdf.
   */
  boolean getEnableShadowRemovalNativePdf();

  /**
   * <pre>
   * Optional. If true, enable auto rotation correction in DVS.
   * </pre>
   *
   * <code>bool enable_rotation_correction = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enableRotationCorrection.
   */
  boolean getEnableRotationCorrection();
}
