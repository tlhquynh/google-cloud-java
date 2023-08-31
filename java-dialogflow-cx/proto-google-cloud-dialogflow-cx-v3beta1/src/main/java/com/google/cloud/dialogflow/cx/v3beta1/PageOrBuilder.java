/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface PageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the page.
   * Required for the
   * [Pages.UpdatePage][google.cloud.dialogflow.cx.v3beta1.Pages.UpdatePage]
   * method.
   * [Pages.CreatePage][google.cloud.dialogflow.cx.v3beta1.Pages.CreatePage]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the page.
   * Required for the
   * [Pages.UpdatePage][google.cloud.dialogflow.cx.v3beta1.Pages.UpdatePage]
   * method.
   * [Pages.CreatePage][google.cloud.dialogflow.cx.v3beta1.Pages.CreatePage]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the page, unique within the flow.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the page, unique within the flow.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The fulfillment to call when the session is entering the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment entry_fulfillment = 7;</code>
   *
   * @return Whether the entryFulfillment field is set.
   */
  boolean hasEntryFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to call when the session is entering the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment entry_fulfillment = 7;</code>
   *
   * @return The entryFulfillment.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment getEntryFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to call when the session is entering the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment entry_fulfillment = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FulfillmentOrBuilder getEntryFulfillmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The form associated with the page, used for collecting parameters
   * relevant to the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Form form = 4;</code>
   *
   * @return Whether the form field is set.
   */
  boolean hasForm();
  /**
   *
   *
   * <pre>
   * The form associated with the page, used for collecting parameters
   * relevant to the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Form form = 4;</code>
   *
   * @return The form.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Form getForm();
  /**
   *
   *
   * <pre>
   * The form associated with the page, used for collecting parameters
   * relevant to the page.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Form form = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FormOrBuilder getFormOrBuilder();

  /**
   *
   *
   * <pre>
   * Ordered list of
   * [`TransitionRouteGroups`][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup]
   * added to the page. Transition route groups must be unique within a page. If
   * the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and
   * will be put before the agent-level ones.
   *
   * *   If multiple transition routes within a page scope refer to the same
   *     intent, then the precedence order is: page's transition route -&gt; page's
   *     transition route group -&gt; flow's transition routes.
   *
   * *   If multiple transition route groups within a page contain the same
   *     intent, then the first group in the ordered list takes precedence.
   *
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`
   * or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;` for agent-level
   * groups.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 11 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the transitionRouteGroups.
   */
  java.util.List<java.lang.String> getTransitionRouteGroupsList();
  /**
   *
   *
   * <pre>
   * Ordered list of
   * [`TransitionRouteGroups`][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup]
   * added to the page. Transition route groups must be unique within a page. If
   * the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and
   * will be put before the agent-level ones.
   *
   * *   If multiple transition routes within a page scope refer to the same
   *     intent, then the precedence order is: page's transition route -&gt; page's
   *     transition route group -&gt; flow's transition routes.
   *
   * *   If multiple transition route groups within a page contain the same
   *     intent, then the first group in the ordered list takes precedence.
   *
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`
   * or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;` for agent-level
   * groups.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 11 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of transitionRouteGroups.
   */
  int getTransitionRouteGroupsCount();
  /**
   *
   *
   * <pre>
   * Ordered list of
   * [`TransitionRouteGroups`][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup]
   * added to the page. Transition route groups must be unique within a page. If
   * the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and
   * will be put before the agent-level ones.
   *
   * *   If multiple transition routes within a page scope refer to the same
   *     intent, then the precedence order is: page's transition route -&gt; page's
   *     transition route group -&gt; flow's transition routes.
   *
   * *   If multiple transition route groups within a page contain the same
   *     intent, then the first group in the ordered list takes precedence.
   *
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`
   * or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;` for agent-level
   * groups.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 11 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The transitionRouteGroups at the given index.
   */
  java.lang.String getTransitionRouteGroups(int index);
  /**
   *
   *
   * <pre>
   * Ordered list of
   * [`TransitionRouteGroups`][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup]
   * added to the page. Transition route groups must be unique within a page. If
   * the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and
   * will be put before the agent-level ones.
   *
   * *   If multiple transition routes within a page scope refer to the same
   *     intent, then the precedence order is: page's transition route -&gt; page's
   *     transition route group -&gt; flow's transition routes.
   *
   * *   If multiple transition route groups within a page contain the same
   *     intent, then the first group in the ordered list takes precedence.
   *
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`
   * or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;` for agent-level
   * groups.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 11 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the transitionRouteGroups at the given index.
   */
  com.google.protobuf.ByteString getTransitionRouteGroupsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of transitions for the transition rules of this page.
   * They route the conversation to another page in the same flow, or another
   * flow.
   *
   * When we are in a certain page, the TransitionRoutes are evalauted in the
   * following order:
   *
   * *   TransitionRoutes defined in the page with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in flow with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Flow.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in the page with only condition specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with only condition specified.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 9;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute> getTransitionRoutesList();
  /**
   *
   *
   * <pre>
   * A list of transitions for the transition rules of this page.
   * They route the conversation to another page in the same flow, or another
   * flow.
   *
   * When we are in a certain page, the TransitionRoutes are evalauted in the
   * following order:
   *
   * *   TransitionRoutes defined in the page with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in flow with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Flow.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in the page with only condition specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with only condition specified.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 9;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute getTransitionRoutes(int index);
  /**
   *
   *
   * <pre>
   * A list of transitions for the transition rules of this page.
   * They route the conversation to another page in the same flow, or another
   * flow.
   *
   * When we are in a certain page, the TransitionRoutes are evalauted in the
   * following order:
   *
   * *   TransitionRoutes defined in the page with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in flow with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Flow.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in the page with only condition specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with only condition specified.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 9;
   * </code>
   */
  int getTransitionRoutesCount();
  /**
   *
   *
   * <pre>
   * A list of transitions for the transition rules of this page.
   * They route the conversation to another page in the same flow, or another
   * flow.
   *
   * When we are in a certain page, the TransitionRoutes are evalauted in the
   * following order:
   *
   * *   TransitionRoutes defined in the page with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in flow with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Flow.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in the page with only condition specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with only condition specified.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 9;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder>
      getTransitionRoutesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of transitions for the transition rules of this page.
   * They route the conversation to another page in the same flow, or another
   * flow.
   *
   * When we are in a certain page, the TransitionRoutes are evalauted in the
   * following order:
   *
   * *   TransitionRoutes defined in the page with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in flow with intent specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Flow.transition_route_groups]
   *     with intent specified.
   * *   TransitionRoutes defined in the page with only condition specified.
   * *   TransitionRoutes defined in the
   *     [transition route
   *     groups][google.cloud.dialogflow.cx.v3beta1.Page.transition_route_groups]
   *     with only condition specified.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 9;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder getTransitionRoutesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Handlers associated with the page to handle events such as webhook errors,
   * no match or no input.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.EventHandler> getEventHandlersList();
  /**
   *
   *
   * <pre>
   * Handlers associated with the page to handle events such as webhook errors,
   * no match or no input.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EventHandler getEventHandlers(int index);
  /**
   *
   *
   * <pre>
   * Handlers associated with the page to handle events such as webhook errors,
   * no match or no input.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  int getEventHandlersCount();
  /**
   *
   *
   * <pre>
   * Handlers associated with the page to handle events such as webhook errors,
   * no match or no input.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.EventHandlerOrBuilder>
      getEventHandlersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Handlers associated with the page to handle events such as webhook errors,
   * no match or no input.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EventHandlerOrBuilder getEventHandlersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Knowledge connector configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings knowledge_connector_settings = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the knowledgeConnectorSettings field is set.
   */
  boolean hasKnowledgeConnectorSettings();
  /**
   *
   *
   * <pre>
   * Optional. Knowledge connector configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings knowledge_connector_settings = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The knowledgeConnectorSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings getKnowledgeConnectorSettings();
  /**
   *
   *
   * <pre>
   * Optional. Knowledge connector configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings knowledge_connector_settings = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettingsOrBuilder
      getKnowledgeConnectorSettingsOrBuilder();
}
