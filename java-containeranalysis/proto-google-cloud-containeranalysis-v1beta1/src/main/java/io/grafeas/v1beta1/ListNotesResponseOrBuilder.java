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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface ListNotesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.ListNotesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Note notes = 1;</code>
   */
  java.util.List<io.grafeas.v1beta1.Note> getNotesList();
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Note notes = 1;</code>
   */
  io.grafeas.v1beta1.Note getNotes(int index);
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Note notes = 1;</code>
   */
  int getNotesCount();
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Note notes = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.NoteOrBuilder> getNotesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Note notes = 1;</code>
   */
  io.grafeas.v1beta1.NoteOrBuilder getNotesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
