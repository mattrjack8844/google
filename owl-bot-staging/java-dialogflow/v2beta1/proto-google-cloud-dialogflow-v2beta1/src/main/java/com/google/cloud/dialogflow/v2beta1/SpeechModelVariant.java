// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Variant of the specified [Speech
 * model][google.cloud.dialogflow.v2beta1.InputAudioConfig.model] to use.
 *
 * See the [Cloud Speech
 * documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models)
 * for which models have different variants. For example, the "phone_call" model
 * has both a standard and an enhanced variant. When you use an enhanced model,
 * you will generally receive higher quality results than for a standard model.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.v2beta1.SpeechModelVariant}
 */
public enum SpeechModelVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No model variant specified. In this case Dialogflow defaults to
   * USE_BEST_AVAILABLE.
   * </pre>
   *
   * <code>SPEECH_MODEL_VARIANT_UNSPECIFIED = 0;</code>
   */
  SPEECH_MODEL_VARIANT_UNSPECIFIED(0),
  /**
   * <pre>
   * Use the best available variant of the [Speech
   * model][InputAudioConfig.model] that the caller is eligible for.
   *
   * Please see the [Dialogflow
   * docs](https://cloud.google.com/dialogflow/docs/data-logging) for
   * how to make your project eligible for enhanced models.
   * </pre>
   *
   * <code>USE_BEST_AVAILABLE = 1;</code>
   */
  USE_BEST_AVAILABLE(1),
  /**
   * <pre>
   * Use standard model variant even if an enhanced model is available.  See the
   * [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models)
   * for details about enhanced models.
   * </pre>
   *
   * <code>USE_STANDARD = 2;</code>
   */
  USE_STANDARD(2),
  /**
   * <pre>
   * Use an enhanced model variant:
   *
   * * If an enhanced variant does not exist for the given
   *   [model][google.cloud.dialogflow.v2beta1.InputAudioConfig.model] and
   *   request language, Dialogflow falls back to the standard variant.
   *
   *   The [Cloud Speech
   *   documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models)
   *   describes which models have enhanced variants.
   *
   * * If the API caller isn't eligible for enhanced models, Dialogflow returns
   *   an error.  Please see the [Dialogflow
   *   docs](https://cloud.google.com/dialogflow/docs/data-logging)
   *   for how to make your project eligible.
   * </pre>
   *
   * <code>USE_ENHANCED = 3;</code>
   */
  USE_ENHANCED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No model variant specified. In this case Dialogflow defaults to
   * USE_BEST_AVAILABLE.
   * </pre>
   *
   * <code>SPEECH_MODEL_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int SPEECH_MODEL_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Use the best available variant of the [Speech
   * model][InputAudioConfig.model] that the caller is eligible for.
   *
   * Please see the [Dialogflow
   * docs](https://cloud.google.com/dialogflow/docs/data-logging) for
   * how to make your project eligible for enhanced models.
   * </pre>
   *
   * <code>USE_BEST_AVAILABLE = 1;</code>
   */
  public static final int USE_BEST_AVAILABLE_VALUE = 1;
  /**
   * <pre>
   * Use standard model variant even if an enhanced model is available.  See the
   * [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models)
   * for details about enhanced models.
   * </pre>
   *
   * <code>USE_STANDARD = 2;</code>
   */
  public static final int USE_STANDARD_VALUE = 2;
  /**
   * <pre>
   * Use an enhanced model variant:
   *
   * * If an enhanced variant does not exist for the given
   *   [model][google.cloud.dialogflow.v2beta1.InputAudioConfig.model] and
   *   request language, Dialogflow falls back to the standard variant.
   *
   *   The [Cloud Speech
   *   documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models)
   *   describes which models have enhanced variants.
   *
   * * If the API caller isn't eligible for enhanced models, Dialogflow returns
   *   an error.  Please see the [Dialogflow
   *   docs](https://cloud.google.com/dialogflow/docs/data-logging)
   *   for how to make your project eligible.
   * </pre>
   *
   * <code>USE_ENHANCED = 3;</code>
   */
  public static final int USE_ENHANCED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SpeechModelVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SpeechModelVariant forNumber(int value) {
    switch (value) {
      case 0: return SPEECH_MODEL_VARIANT_UNSPECIFIED;
      case 1: return USE_BEST_AVAILABLE;
      case 2: return USE_STANDARD;
      case 3: return USE_ENHANCED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SpeechModelVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SpeechModelVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SpeechModelVariant>() {
          public SpeechModelVariant findValueByNumber(int number) {
            return SpeechModelVariant.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final SpeechModelVariant[] VALUES = values();

  public static SpeechModelVariant valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SpeechModelVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2beta1.SpeechModelVariant)
}

