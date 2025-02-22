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
// source: google/monitoring/metricsscope/v1/metrics_scopes.proto

package com.google.monitoring.metricsscope.v1;

public final class MetricsScopesProto {
  private MetricsScopesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/monitoring/metricsscope/v1/metr"
          + "ics_scopes.proto\022!google.monitoring.metr"
          + "icsscope.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\0325google/monitoring/metricsscope/v1/m"
          + "etrics_scope.proto\032\037google/protobuf/time"
          + "stamp.proto\"W\n\026GetMetricsScopeRequest\022=\n"
          + "\004name\030\001 \001(\tB/\342A\001\002\372A(\n&monitoring.googlea"
          + "pis.com/MetricsScope\"X\n*ListMetricsScope"
          + "sByMonitoredProjectRequest\022*\n\034monitored_"
          + "resource_container\030\001 \001(\tB\004\342A\001\002\"v\n+ListMe"
          + "tricsScopesByMonitoredProjectResponse\022G\n"
          + "\016metrics_scopes\030\001 \003(\0132/.google.monitorin"
          + "g.metricsscope.v1.MetricsScope\"\266\001\n\035Creat"
          + "eMonitoredProjectRequest\022?\n\006parent\030\001 \001(\t"
          + "B/\342A\001\002\372A(\n&monitoring.googleapis.com/Met"
          + "ricsScope\022T\n\021monitored_project\030\002 \001(\01323.g"
          + "oogle.monitoring.metricsscope.v1.Monitor"
          + "edProjectB\004\342A\001\002\"b\n\035DeleteMonitoredProjec"
          + "tRequest\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*monitor"
          + "ing.googleapis.com/MonitoredProject\"\223\002\n\021"
          + "OperationMetadata\022I\n\005state\030\001 \001(\0162:.googl"
          + "e.monitoring.metricsscope.v1.OperationMe"
          + "tadata.State\022/\n\013create_time\030\005 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022/\n\013update_time\030\006 \001"
          + "(\0132\032.google.protobuf.Timestamp\"Q\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007CREATED\020\001\022\013\n\007R"
          + "UNNING\020\002\022\010\n\004DONE\020\003\022\r\n\tCANCELLED\020\0042\302\t\n\rMe"
          + "tricsScopes\022\271\001\n\017GetMetricsScope\0229.google"
          + ".monitoring.metricsscope.v1.GetMetricsSc"
          + "opeRequest\032/.google.monitoring.metricssc"
          + "ope.v1.MetricsScope\":\332A\004name\202\323\344\223\002-\022+/v1/"
          + "{name=locations/global/metricsScopes/*}\022"
          + "\224\002\n#ListMetricsScopesByMonitoredProject\022"
          + "M.google.monitoring.metricsscope.v1.List"
          + "MetricsScopesByMonitoredProjectRequest\032N"
          + ".google.monitoring.metricsscope.v1.ListM"
          + "etricsScopesByMonitoredProjectResponse\"N"
          + "\202\323\344\223\002H\022F/v1/locations/global/metricsScop"
          + "es:listMetricsScopesByMonitoredProject\022\220"
          + "\002\n\026CreateMonitoredProject\022@.google.monit"
          + "oring.metricsscope.v1.CreateMonitoredPro"
          + "jectRequest\032\035.google.longrunning.Operati"
          + "on\"\224\001\312A%\n\020MonitoredProject\022\021OperationMet"
          + "adata\332A\030parent,monitored_project\202\323\344\223\002K\"6"
          + "/v1/{parent=locations/global/metricsScop"
          + "es/*}/projects:\021monitored_project\022\355\001\n\026De"
          + "leteMonitoredProject\022@.google.monitoring"
          + ".metricsscope.v1.DeleteMonitoredProjectR"
          + "equest\032\035.google.longrunning.Operation\"r\312"
          + "A*\n\025google.protobuf.Empty\022\021OperationMeta"
          + "data\332A\004name\202\323\344\223\0028*6/v1/{name=locations/g"
          + "lobal/metricsScopes/*/projects/*}\032\332\001\312A\031m"
          + "onitoring.googleapis.com\322A\272\001https://www."
          + "googleapis.com/auth/cloud-platform,https"
          + "://www.googleapis.com/auth/monitoring,ht"
          + "tps://www.googleapis.com/auth/monitoring"
          + ".read,https://www.googleapis.com/auth/mo"
          + "nitoring.writeB\220\002\n%com.google.monitoring"
          + ".metricsscope.v1B\022MetricsScopesProtoP\001ZO"
          + "cloud.google.com/go/monitoring/metricssc"
          + "ope/apiv1/metricsscopepb;metricsscopepb\252"
          + "\002\'Google.Cloud.Monitoring.MetricsScope.V"
          + "1\312\002\'Google\\Cloud\\Monitoring\\MetricsScope"
          + "\\V1\352\002+Google::Cloud::Monitoring::Metrics"
          + "Scope::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.monitoring.metricsscope.v1.MetricsScopeProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor,
            new java.lang.String[] {
              "MonitoredResourceContainer",
            });
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor,
            new java.lang.String[] {
              "MetricsScopes",
            });
    internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MonitoredProject",
            });
    internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_metricsscope_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.monitoring.metricsscope.v1.MetricsScopeProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
