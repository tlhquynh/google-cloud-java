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
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

public interface BuildConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2.BuildConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build name of the latest successful deployment of the
   * function.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build name of the latest successful deployment of the
   * function.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString getBuildBytes();

  /**
   *
   *
   * <pre>
   * The runtime in which to run the function. Required when deploying a new
   * function, optional when updating an existing function. For a complete
   * list of possible choices, see the
   * [`gcloud` command
   * reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
   * </pre>
   *
   * <code>string runtime = 2;</code>
   *
   * @return The runtime.
   */
  java.lang.String getRuntime();
  /**
   *
   *
   * <pre>
   * The runtime in which to run the function. Required when deploying a new
   * function, optional when updating an existing function. For a complete
   * list of possible choices, see the
   * [`gcloud` command
   * reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
   * </pre>
   *
   * <code>string runtime = 2;</code>
   *
   * @return The bytes for runtime.
   */
  com.google.protobuf.ByteString getRuntimeBytes();

  /**
   *
   *
   * <pre>
   * The name of the function (as defined in source code) that will be
   * executed. Defaults to the resource name suffix, if not specified. For
   * backward compatibility, if function with given name is not found, then the
   * system will try to use function named "function".
   * For Node.js this is name of a function exported by the module specified
   * in `source_location`.
   * </pre>
   *
   * <code>string entry_point = 3;</code>
   *
   * @return The entryPoint.
   */
  java.lang.String getEntryPoint();
  /**
   *
   *
   * <pre>
   * The name of the function (as defined in source code) that will be
   * executed. Defaults to the resource name suffix, if not specified. For
   * backward compatibility, if function with given name is not found, then the
   * system will try to use function named "function".
   * For Node.js this is name of a function exported by the module specified
   * in `source_location`.
   * </pre>
   *
   * <code>string entry_point = 3;</code>
   *
   * @return The bytes for entryPoint.
   */
  com.google.protobuf.ByteString getEntryPointBytes();

  /**
   *
   *
   * <pre>
   * The location of the function source code.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Source source = 4;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The location of the function source code.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Source source = 4;</code>
   *
   * @return The source.
   */
  com.google.cloud.functions.v2.Source getSource();
  /**
   *
   *
   * <pre>
   * The location of the function source code.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Source source = 4;</code>
   */
  com.google.cloud.functions.v2.SourceOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.SourceProvenance source_provenance = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the sourceProvenance field is set.
   */
  boolean hasSourceProvenance();
  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.SourceProvenance source_provenance = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The sourceProvenance.
   */
  com.google.cloud.functions.v2.SourceProvenance getSourceProvenance();
  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.SourceProvenance source_provenance = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.functions.v2.SourceProvenanceOrBuilder getSourceProvenanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the Cloud Build Custom Worker Pool that should be used to build the
   * function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * {project} and {region} are the project id and region respectively where the
   * worker pool is defined and {workerPool} is the short name of the worker
   * pool.
   * If the project id is not the same as the function, then the Cloud
   * Functions Service Agent
   * (service-&lt;project_number&gt;&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role Cloud Build Custom Workers Builder
   * (roles/cloudbuild.customworkers.builder) in the project.
   * </pre>
   *
   * <code>string worker_pool = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   *
   *
   * <pre>
   * Name of the Cloud Build Custom Worker Pool that should be used to build the
   * function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * {project} and {region} are the project id and region respectively where the
   * worker pool is defined and {workerPool} is the short name of the worker
   * pool.
   * If the project id is not the same as the function, then the Cloud
   * Functions Service Agent
   * (service-&lt;project_number&gt;&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role Cloud Build Custom Workers Builder
   * (roles/cloudbuild.customworkers.builder) in the project.
   * </pre>
   *
   * <code>string worker_pool = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * User-provided build-time environment variables for the function
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 6;</code>
   */
  int getEnvironmentVariablesCount();
  /**
   *
   *
   * <pre>
   * User-provided build-time environment variables for the function
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 6;</code>
   */
  boolean containsEnvironmentVariables(java.lang.String key);
  /** Use {@link #getEnvironmentVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables();
  /**
   *
   *
   * <pre>
   * User-provided build-time environment variables for the function
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariablesMap();
  /**
   *
   *
   * <pre>
   * User-provided build-time environment variables for the function
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 6;</code>
   */
  /* nullable */
  java.lang.String getEnvironmentVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-provided build-time environment variables for the function
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 6;</code>
   */
  java.lang.String getEnvironmentVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. User managed repository created in Artifact Registry optionally with a
   * customer managed encryption key. This is the repository to which the
   * function docker image will be pushed after it is built by Cloud Build.
   * If unspecified, GCF will create and use a repository named 'gcf-artifacts'
   * for every deployed region.
   * It must match the pattern
   * `projects/{project}/locations/{location}/repositories/{repository}`.
   * Cross-project repositories are not supported.
   * Cross-location repositories are not supported.
   * Repository format must be 'DOCKER'.
   * </pre>
   *
   * <code>
   * string docker_repository = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dockerRepository.
   */
  java.lang.String getDockerRepository();
  /**
   *
   *
   * <pre>
   * Optional. User managed repository created in Artifact Registry optionally with a
   * customer managed encryption key. This is the repository to which the
   * function docker image will be pushed after it is built by Cloud Build.
   * If unspecified, GCF will create and use a repository named 'gcf-artifacts'
   * for every deployed region.
   * It must match the pattern
   * `projects/{project}/locations/{location}/repositories/{repository}`.
   * Cross-project repositories are not supported.
   * Cross-location repositories are not supported.
   * Repository format must be 'DOCKER'.
   * </pre>
   *
   * <code>
   * string docker_repository = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dockerRepository.
   */
  com.google.protobuf.ByteString getDockerRepositoryBytes();
}
