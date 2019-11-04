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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface UpdateNodePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.UpdateNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getNodePoolId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the nodes to (typically an
   * upgrade).
   * Users may specify either explicit versions offered by Kubernetes Engine or
   * version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string node_version = 5;</code>
   */
  java.lang.String getNodeVersion();
  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the nodes to (typically an
   * upgrade).
   * Users may specify either explicit versions offered by Kubernetes Engine or
   * version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string node_version = 5;</code>
   */
  com.google.protobuf.ByteString getNodeVersionBytes();

  /**
   *
   *
   * <pre>
   * The desired image type for the node pool.
   * </pre>
   *
   * <code>string image_type = 6;</code>
   */
  java.lang.String getImageType();
  /**
   *
   *
   * <pre>
   * The desired image type for the node pool.
   * </pre>
   *
   * <code>string image_type = 6;</code>
   */
  com.google.protobuf.ByteString getImageTypeBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to
   * update. Specified in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;'.
   * </pre>
   *
   * <code>string name = 8;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to
   * update. Specified in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;'.
   * </pre>
   *
   * <code>string name = 8;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
