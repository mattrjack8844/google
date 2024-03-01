// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1p1beta1;

public interface SpeechContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   *
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   * @return A list containing the phrases.
   */
  java.util.List<java.lang.String>
      getPhrasesList();
  /**
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   *
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   * @return The count of phrases.
   */
  int getPhrasesCount();
  /**
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   *
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   * @param index The index of the element to return.
   * @return The phrases at the given index.
   */
  java.lang.String getPhrases(int index);
  /**
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   *
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the phrases at the given index.
   */
  com.google.protobuf.ByteString
      getPhrasesBytes(int index);

  /**
   * <pre>
   * Hint Boost. Positive value will increase the probability that a specific
   * phrase will be recognized over other similar sounding phrases. The higher
   * the boost, the higher the chance of false positive recognition as well.
   * Negative boost values would correspond to anti-biasing. Anti-biasing is not
   * enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with
   * values between 0 and 20. We recommend using a binary search approach to
   * finding the optimal value for your use case.
   * </pre>
   *
   * <code>float boost = 4;</code>
   * @return The boost.
   */
  float getBoost();
}
