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

public interface DerivedOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Derived)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fingerprint of the derived image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * The fingerprint of the derived image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
   */
  io.grafeas.v1beta1.image.Fingerprint getFingerprint();
  /**
   *
   *
   * <pre>
   * The fingerprint of the derived image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
   */
  io.grafeas.v1beta1.image.FingerprintOrBuilder getFingerprintOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of layers by which this image differs from the
   * associated image basis.
   * </pre>
   *
   * <code>int32 distance = 2;</code>
   */
  int getDistance();

  /**
   *
   *
   * <pre>
   * This contains layer-specific metadata, if populated it has length
   * "distance" and is ordered with [distance] being the layer immediately
   * following the base image and [1] being the final layer.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
   */
  java.util.List<io.grafeas.v1beta1.image.Layer> getLayerInfoList();
  /**
   *
   *
   * <pre>
   * This contains layer-specific metadata, if populated it has length
   * "distance" and is ordered with [distance] being the layer immediately
   * following the base image and [1] being the final layer.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
   */
  io.grafeas.v1beta1.image.Layer getLayerInfo(int index);
  /**
   *
   *
   * <pre>
   * This contains layer-specific metadata, if populated it has length
   * "distance" and is ordered with [distance] being the layer immediately
   * following the base image and [1] being the final layer.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
   */
  int getLayerInfoCount();
  /**
   *
   *
   * <pre>
   * This contains layer-specific metadata, if populated it has length
   * "distance" and is ordered with [distance] being the layer immediately
   * following the base image and [1] being the final layer.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.image.LayerOrBuilder> getLayerInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * This contains layer-specific metadata, if populated it has length
   * "distance" and is ordered with [distance] being the layer immediately
   * following the base image and [1] being the final layer.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
   */
  io.grafeas.v1beta1.image.LayerOrBuilder getLayerInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. This contains the base image URL for the derived image
   * occurrence.
   * </pre>
   *
   * <code>string base_resource_url = 4;</code>
   */
  java.lang.String getBaseResourceUrl();
  /**
   *
   *
   * <pre>
   * Output only. This contains the base image URL for the derived image
   * occurrence.
   * </pre>
   *
   * <code>string base_resource_url = 4;</code>
   */
  com.google.protobuf.ByteString getBaseResourceUrlBytes();
}
