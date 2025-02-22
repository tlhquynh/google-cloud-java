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
// source: google/cloud/bigquery/migration/v2alpha/assessment_task.proto

package com.google.cloud.bigquery.migration.v2alpha;

public final class AssessmentTaskProto {
  private AssessmentTaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/bigquery/migration/v2alph"
          + "a/assessment_task.proto\022\'google.cloud.bi"
          + "gquery.migration.v2alpha\032\037google/api/fie"
          + "ld_behavior.proto\"\210\001\n\025AssessmentTaskDeta"
          + "ils\022\030\n\ninput_path\030\001 \001(\tB\004\342A\001\002\022\034\n\016output_"
          + "dataset\030\002 \001(\tB\004\342A\001\002\022\034\n\016querylogs_path\030\003 "
          + "\001(\tB\004\342A\001\001\022\031\n\013data_source\030\004 \001(\tB\004\342A\001\002\"R\n$"
          + "AssessmentOrchestrationResultDetails\022*\n\034"
          + "output_tables_schema_version\030\001 \001(\tB\004\342A\001\001"
          + "B\343\001\n+com.google.cloud.bigquery.migration"
          + ".v2alphaB\023AssessmentTaskProtoP\001ZIcloud.g"
          + "oogle.com/go/bigquery/migration/apiv2alp"
          + "ha/migrationpb;migrationpb\252\002\'Google.Clou"
          + "d.BigQuery.Migration.V2Alpha\312\002\'Google\\Cl"
          + "oud\\BigQuery\\Migration\\V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor,
            new java.lang.String[] {
              "InputPath", "OutputDataset", "QuerylogsPath", "DataSource",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor,
            new java.lang.String[] {
              "OutputTablesSchemaVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
