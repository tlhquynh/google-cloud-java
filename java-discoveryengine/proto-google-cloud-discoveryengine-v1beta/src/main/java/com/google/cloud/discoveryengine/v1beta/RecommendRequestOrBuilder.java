/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/discoveryengine/v1beta/recommendation_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface RecommendRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.RecommendRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the format:
   * projects/&#42;&#47;locations/global/dataStores/&#42;&#47;servingConfigs/&#42;
   * Before you can request recommendations from your model, you must create at
   * least one serving config  for it.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The servingConfig.
   */
  java.lang.String getServingConfig();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the format:
   * projects/&#42;&#47;locations/global/dataStores/&#42;&#47;servingConfigs/&#42;
   * Before you can request recommendations from your model, you must create at
   * least one serving config  for it.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for servingConfig.
   */
  com.google.protobuf.ByteString getServingConfigBytes();

  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the Recommend request. Note that this user event
   * detail won't be ingested to userEvent logs. Thus, a separate userEvent
   * write request is required for event logging.
   * Don't set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * or
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * to the same fixed ID for different users. If you are trying to receive
   * non-personalized recommendations (not recommended; this can negatively
   * impact model performance), instead set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * to a random unique ID and leave
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * unset.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the Recommend request. Note that this user event
   * detail won't be ingested to userEvent logs. Thus, a separate userEvent
   * write request is required for event logging.
   * Don't set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * or
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * to the same fixed ID for different users. If you are trying to receive
   * non-personalized recommendations (not recommended; this can negatively
   * impact model performance), instead set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * to a random unique ID and leave
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * unset.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEvent.
   */
  com.google.cloud.discoveryengine.v1beta.UserEvent getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the Recommend request. Note that this user event
   * detail won't be ingested to userEvent logs. Thus, a separate userEvent
   * write request is required for event logging.
   * Don't set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * or
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * to the same fixed ID for different users. If you are trying to receive
   * non-personalized recommendations (not recommended; this can negatively
   * impact model performance), instead set
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * to a random unique ID and leave
   * [UserEvent.user_info.user_id][google.cloud.discoveryengine.v1beta.UserInfo.user_id]
   * unset.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.UserEventOrBuilder getUserEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of results to return. Set this property
   * to the number of recommendation results needed. If zero, the service will
   * choose a reasonable default. The maximum allowed value is 100. Values
   * above 100 will be coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Filter for restricting recommendation results with a length limit of 5,000
   * characters. Currently, only filter expressions on the `filter_tags`
   * attribute is supported.
   * Examples:
   *  * (filter_tags: ANY("Red", "Blue") OR filter_tags: ANY("Hot", "Cold"))
   *  * (filter_tags: ANY("Red", "Blue")) AND NOT (filter_tags: ANY("Green"))
   * If your filter blocks all results, the API will return generic
   * (unfiltered) popular Documents. If you only want results strictly matching
   * the filters, set `strictFiltering` to True in
   * [RecommendRequest.params][google.cloud.discoveryengine.v1beta.RecommendRequest.params]
   * to receive empty results instead.
   * Note that the API will never return Documents with storageStatus of
   * "EXPIRED" or "DELETED" regardless of filter choices.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter for restricting recommendation results with a length limit of 5,000
   * characters. Currently, only filter expressions on the `filter_tags`
   * attribute is supported.
   * Examples:
   *  * (filter_tags: ANY("Red", "Blue") OR filter_tags: ANY("Hot", "Cold"))
   *  * (filter_tags: ANY("Red", "Blue")) AND NOT (filter_tags: ANY("Green"))
   * If your filter blocks all results, the API will return generic
   * (unfiltered) popular Documents. If you only want results strictly matching
   * the filters, set `strictFiltering` to True in
   * [RecommendRequest.params][google.cloud.discoveryengine.v1beta.RecommendRequest.params]
   * to receive empty results instead.
   * Note that the API will never return Documents with storageStatus of
   * "EXPIRED" or "DELETED" regardless of filter choices.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Use validate only mode for this recommendation query. If set to true, a
   * fake model will be used that returns arbitrary Document IDs.
   * Note that the validate only mode should only be used for testing the API,
   * or if the model is not ready.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the recommendations.
   * Allowed values:
   * * `returnDocument`: Boolean. If set to true, the associated Document
   *    object will be returned in
   *    [RecommendResponse.results.document][RecommendationResult.document].
   * * `returnScore`: Boolean. If set to true, the recommendation 'score'
   *    corresponding to each returned Document will be set in
   *    [RecommendResponse.results.metadata][RecommendationResult.metadata]. The
   *    given 'score' indicates the probability of a Document conversion given
   *    the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular Documents instead of empty if
   *    your filter blocks all recommendation results.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of:
   *    *  'no-diversity'
   *    *  'low-diversity'
   *    *  'medium-diversity'
   *    *  'high-diversity'
   *    *  'auto-diversity'
   *    This gives request-level control and adjusts recommendation results
   *    based on Document category.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 6;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the recommendations.
   * Allowed values:
   * * `returnDocument`: Boolean. If set to true, the associated Document
   *    object will be returned in
   *    [RecommendResponse.results.document][RecommendationResult.document].
   * * `returnScore`: Boolean. If set to true, the recommendation 'score'
   *    corresponding to each returned Document will be set in
   *    [RecommendResponse.results.metadata][RecommendationResult.metadata]. The
   *    given 'score' indicates the probability of a Document conversion given
   *    the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular Documents instead of empty if
   *    your filter blocks all recommendation results.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of:
   *    *  'no-diversity'
   *    *  'low-diversity'
   *    *  'medium-diversity'
   *    *  'high-diversity'
   *    *  'auto-diversity'
   *    This gives request-level control and adjusts recommendation results
   *    based on Document category.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 6;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the recommendations.
   * Allowed values:
   * * `returnDocument`: Boolean. If set to true, the associated Document
   *    object will be returned in
   *    [RecommendResponse.results.document][RecommendationResult.document].
   * * `returnScore`: Boolean. If set to true, the recommendation 'score'
   *    corresponding to each returned Document will be set in
   *    [RecommendResponse.results.metadata][RecommendationResult.metadata]. The
   *    given 'score' indicates the probability of a Document conversion given
   *    the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular Documents instead of empty if
   *    your filter blocks all recommendation results.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of:
   *    *  'no-diversity'
   *    *  'low-diversity'
   *    *  'medium-diversity'
   *    *  'high-diversity'
   *    *  'auto-diversity'
   *    This gives request-level control and adjusts recommendation results
   *    based on Document category.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 6;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the recommendations.
   * Allowed values:
   * * `returnDocument`: Boolean. If set to true, the associated Document
   *    object will be returned in
   *    [RecommendResponse.results.document][RecommendationResult.document].
   * * `returnScore`: Boolean. If set to true, the recommendation 'score'
   *    corresponding to each returned Document will be set in
   *    [RecommendResponse.results.metadata][RecommendationResult.metadata]. The
   *    given 'score' indicates the probability of a Document conversion given
   *    the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular Documents instead of empty if
   *    your filter blocks all recommendation results.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of:
   *    *  'no-diversity'
   *    *  'low-diversity'
   *    *  'medium-diversity'
   *    *  'high-diversity'
   *    *  'auto-diversity'
   *    This gives request-level control and adjusts recommendation results
   *    based on Document category.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 6;</code>
   */
  /* nullable */
  com.google.protobuf.Value getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the recommendations.
   * Allowed values:
   * * `returnDocument`: Boolean. If set to true, the associated Document
   *    object will be returned in
   *    [RecommendResponse.results.document][RecommendationResult.document].
   * * `returnScore`: Boolean. If set to true, the recommendation 'score'
   *    corresponding to each returned Document will be set in
   *    [RecommendResponse.results.metadata][RecommendationResult.metadata]. The
   *    given 'score' indicates the probability of a Document conversion given
   *    the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular Documents instead of empty if
   *    your filter blocks all recommendation results.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of:
   *    *  'no-diversity'
   *    *  'low-diversity'
   *    *  'medium-diversity'
   *    *  'high-diversity'
   *    *  'auto-diversity'
   *    This gives request-level control and adjusts recommendation results
   *    based on Document category.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 6;</code>
   */
  com.google.protobuf.Value getParamsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 8;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);
}
