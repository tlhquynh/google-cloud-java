/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface RecognitionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.RecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Encoding of audio data sent in all `RecognitionAudio` messages.
   * This field is optional for `FLAC` and `WAV` audio files and required
   * for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   */
  int getEncodingValue();
  /**
   *
   *
   * <pre>
   * Encoding of audio data sent in all `RecognitionAudio` messages.
   * This field is optional for `FLAC` and `WAV` audio files and required
   * for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   */
  com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding getEncoding();

  /**
   *
   *
   * <pre>
   * Sample rate in Hertz of the audio data sent in all
   * `RecognitionAudio` messages. Valid values are: 8000-48000.
   * 16000 is optimal. For best results, set the sampling rate of the audio
   * source to 16000 Hz. If that's not possible, use the native sample rate of
   * the audio source (instead of re-sampling).
   * This field is optional for `FLAC` and `WAV` audio files and required
   * for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * *Optional* The number of channels in the input audio data.
   * ONLY set this for MULTI-CHANNEL recognition.
   * Valid values for LINEAR16 and FLAC are `1`-`8`.
   * Valid values for OGG_OPUS are '1'-'254'.
   * Valid value for MULAW, AMR, AMR_WB and SPEEX_WITH_HEADER_BYTE is only `1`.
   * If `0` or omitted, defaults to one channel (mono).
   * Note: We only recognize the first channel by default.
   * To perform independent recognition on each channel set
   * `enable_separate_recognition_per_channel` to 'true'.
   * </pre>
   *
   * <code>int32 audio_channel_count = 7;</code>
   */
  int getAudioChannelCount();

  /**
   *
   *
   * <pre>
   * This needs to be set to `true` explicitly and `audio_channel_count` &gt; 1
   * to get each channel recognized separately. The recognition result will
   * contain a `channel_tag` field to state which channel that result belongs
   * to. If this is not true, we will only recognize the first channel. The
   * request is billed cumulatively for all channels recognized:
   * `audio_channel_count` multiplied by the length of the audio.
   * </pre>
   *
   * <code>bool enable_separate_recognition_per_channel = 12;</code>
   */
  boolean getEnableSeparateRecognitionPerChannel();

  /**
   *
   *
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](/speech-to-text/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](/speech-to-text/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * *Optional* Maximum number of recognition hypotheses to be returned.
   * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
   * within each `SpeechRecognitionResult`.
   * The server may return fewer than `max_alternatives`.
   * Valid values are `0`-`30`. A value of `0` or `1` will return a maximum of
   * one. If omitted, will return a maximum of one.
   * </pre>
   *
   * <code>int32 max_alternatives = 4;</code>
   */
  int getMaxAlternatives();

  /**
   *
   *
   * <pre>
   * *Optional* If set to `true`, the server will attempt to filter out
   * profanities, replacing all but the initial character in each filtered word
   * with asterisks, e.g. "f***". If set to `false` or omitted, profanities
   * won't be filtered out.
   * </pre>
   *
   * <code>bool profanity_filter = 5;</code>
   */
  boolean getProfanityFilter();

  /**
   *
   *
   * <pre>
   * *Optional* array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<com.google.cloud.speech.v1.SpeechContext> getSpeechContextsList();
  /**
   *
   *
   * <pre>
   * *Optional* array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1.SpeechContext getSpeechContexts(int index);
  /**
   *
   *
   * <pre>
   * *Optional* array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  int getSpeechContextsCount();
  /**
   *
   *
   * <pre>
   * *Optional* array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.SpeechContextOrBuilder>
      getSpeechContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * *Optional* array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1.SpeechContextOrBuilder getSpeechContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * *Optional* If `true`, the top result includes a list of words and
   * the start and end time offsets (timestamps) for those words. If
   * `false`, no word-level time offset information is returned. The default is
   * `false`.
   * </pre>
   *
   * <code>bool enable_word_time_offsets = 8;</code>
   */
  boolean getEnableWordTimeOffsets();

  /**
   *
   *
   * <pre>
   * *Optional* If 'true', adds punctuation to recognition result hypotheses.
   * This feature is only available in select languages. Setting this for
   * requests in other languages has no effect at all.
   * The default 'false' value does not add punctuation to result hypotheses.
   * Note: This is currently offered as an experimental service, complimentary
   * to all users. In the future this may be exclusively available as a
   * premium feature.
   * </pre>
   *
   * <code>bool enable_automatic_punctuation = 11;</code>
   */
  boolean getEnableAutomaticPunctuation();

  /**
   *
   *
   * <pre>
   * *Optional* Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   */
  boolean hasDiarizationConfig();
  /**
   *
   *
   * <pre>
   * *Optional* Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   */
  com.google.cloud.speech.v1.SpeakerDiarizationConfig getDiarizationConfig();
  /**
   *
   *
   * <pre>
   * *Optional* Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   */
  com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * *Optional* Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * *Optional* Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   */
  com.google.cloud.speech.v1.RecognitionMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * *Optional* Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   */
  com.google.cloud.speech.v1.RecognitionMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * *Optional* Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * &lt;table&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
   *     &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short queries such as voice commands or voice search.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a phone call (typically
   *     recorded at an 8khz sampling rate).&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from from video or includes multiple
   *         speakers. Ideally the audio is recorded at a 16khz or greater
   *         sampling rate. This is a premium model that costs more than the
   *         standard rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that is not one of the specific audio models.
   *         For example, long-form audio. Ideally the audio is high-fidelity,
   *         recorded at a 16khz or greater sampling rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>string model = 13;</code>
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * *Optional* Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * &lt;table&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
   *     &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short queries such as voice commands or voice search.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a phone call (typically
   *     recorded at an 8khz sampling rate).&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from from video or includes multiple
   *         speakers. Ideally the audio is recorded at a 16khz or greater
   *         sampling rate. This is a premium model that costs more than the
   *         standard rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that is not one of the specific audio models.
   *         For example, long-form audio. Ideally the audio is high-fidelity,
   *         recorded at a 16khz or greater sampling rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>string model = 13;</code>
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * *Optional* Set to true to use an enhanced model for speech recognition.
   * If `use_enhanced` is set to true and the `model` field is not set, then
   * an appropriate enhanced model is chosen if an enhanced model exists for
   * the audio.
   * If `use_enhanced` is true and an enhanced version of the specified model
   * does not exist, then the speech is recognized using the standard version
   * of the specified model.
   * </pre>
   *
   * <code>bool use_enhanced = 14;</code>
   */
  boolean getUseEnhanced();
}
