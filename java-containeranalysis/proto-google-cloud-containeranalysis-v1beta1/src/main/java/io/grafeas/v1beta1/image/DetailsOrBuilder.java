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
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

public interface DetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Details)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  boolean hasDerivedImage();
  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  io.grafeas.v1beta1.image.Derived getDerivedImage();
  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  io.grafeas.v1beta1.image.DerivedOrBuilder getDerivedImageOrBuilder();
}
