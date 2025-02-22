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
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PipelineServiceProto {
  private PipelineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032/google/cloud/aiplatform/v1beta1/op"
          + "eration.proto\0322google/cloud/aiplatform/v"
          + "1beta1/pipeline_job.proto\0327google/cloud/"
          + "aiplatform/v1beta1/training_pipeline.pro"
          + "to\032#google/longrunning/operations.proto\032"
          + "\033google/protobuf/empty.proto\032 google/pro"
          + "tobuf/field_mask.proto\"\257\001\n\035CreateTrainin"
          + "gPipelineRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A"
          + "#\n!locations.googleapis.com/Location\022R\n\021"
          + "training_pipeline\030\002 \001(\01321.google.cloud.a"
          + "iplatform.v1beta1.TrainingPipelineB\004\342A\001\002"
          + "\"_\n\032GetTrainingPipelineRequest\022A\n\004name\030\001"
          + " \001(\tB3\342A\001\002\372A,\n*aiplatform.googleapis.com"
          + "/TrainingPipeline\"\300\001\n\034ListTrainingPipeli"
          + "nesRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!loc"
          + "ations.googleapis.com/Location\022\016\n\006filter"
          + "\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030"
          + "\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.protob"
          + "uf.FieldMask\"\207\001\n\035ListTrainingPipelinesRe"
          + "sponse\022M\n\022training_pipelines\030\001 \003(\01321.goo"
          + "gle.cloud.aiplatform.v1beta1.TrainingPip"
          + "eline\022\027\n\017next_page_token\030\002 \001(\t\"b\n\035Delete"
          + "TrainingPipelineRequest\022A\n\004name\030\001 \001(\tB3\342"
          + "A\001\002\372A,\n*aiplatform.googleapis.com/Traini"
          + "ngPipeline\"b\n\035CancelTrainingPipelineRequ"
          + "est\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*aiplatform.g"
          + "oogleapis.com/TrainingPipeline\"\271\001\n\030Creat"
          + "ePipelineJobRequest\022:\n\006parent\030\001 \001(\tB*\342A\001"
          + "\002\372A#\n!locations.googleapis.com/Location\022"
          + "H\n\014pipeline_job\030\002 \001(\0132,.google.cloud.aip"
          + "latform.v1beta1.PipelineJobB\004\342A\001\002\022\027\n\017pip"
          + "eline_job_id\030\003 \001(\t\"U\n\025GetPipelineJobRequ"
          + "est\022<\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%aiplatform.g"
          + "oogleapis.com/PipelineJob\"\315\001\n\027ListPipeli"
          + "neJobsRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!"
          + "locations.googleapis.com/Location\022\016\n\006fil"
          + "ter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_tok"
          + "en\030\004 \001(\t\022\020\n\010order_by\030\006 \001(\t\022-\n\tread_mask\030"
          + "\007 \001(\0132\032.google.protobuf.FieldMask\"x\n\030Lis"
          + "tPipelineJobsResponse\022C\n\rpipeline_jobs\030\001"
          + " \003(\0132,.google.cloud.aiplatform.v1beta1.P"
          + "ipelineJob\022\027\n\017next_page_token\030\002 \001(\t\"X\n\030D"
          + "eletePipelineJobRequest\022<\n\004name\030\001 \001(\tB.\342"
          + "A\001\002\372A\'\n%aiplatform.googleapis.com/Pipeli"
          + "neJob\"X\n\030CancelPipelineJobRequest\022<\n\004nam"
          + "e\030\001 \001(\tB.\342A\001\002\372A\'\n%aiplatform.googleapis."
          + "com/PipelineJob2\376\021\n\017PipelineService\022\375\001\n\026"
          + "CreateTrainingPipeline\022>.google.cloud.ai"
          + "platform.v1beta1.CreateTrainingPipelineR"
          + "equest\0321.google.cloud.aiplatform.v1beta1"
          + ".TrainingPipeline\"p\332A\030parent,training_pi"
          + "peline\202\323\344\223\002O\":/v1beta1/{parent=projects/"
          + "*/locations/*}/trainingPipelines:\021traini"
          + "ng_pipeline\022\320\001\n\023GetTrainingPipeline\022;.go"
          + "ogle.cloud.aiplatform.v1beta1.GetTrainin"
          + "gPipelineRequest\0321.google.cloud.aiplatfo"
          + "rm.v1beta1.TrainingPipeline\"I\332A\004name\202\323\344\223"
          + "\002<\022:/v1beta1/{name=projects/*/locations/"
          + "*/trainingPipelines/*}\022\343\001\n\025ListTrainingP"
          + "ipelines\022=.google.cloud.aiplatform.v1bet"
          + "a1.ListTrainingPipelinesRequest\032>.google"
          + ".cloud.aiplatform.v1beta1.ListTrainingPi"
          + "pelinesResponse\"K\332A\006parent\202\323\344\223\002<\022:/v1bet"
          + "a1/{parent=projects/*/locations/*}/train"
          + "ingPipelines\022\365\001\n\026DeleteTrainingPipeline\022"
          + ">.google.cloud.aiplatform.v1beta1.Delete"
          + "TrainingPipelineRequest\032\035.google.longrun"
          + "ning.Operation\"|\312A0\n\025google.protobuf.Emp"
          + "ty\022\027DeleteOperationMetadata\332A\004name\202\323\344\223\002<"
          + "*:/v1beta1/{name=projects/*/locations/*/"
          + "trainingPipelines/*}\022\305\001\n\026CancelTrainingP"
          + "ipeline\022>.google.cloud.aiplatform.v1beta"
          + "1.CancelTrainingPipelineRequest\032\026.google"
          + ".protobuf.Empty\"S\332A\004name\202\323\344\223\002F\"A/v1beta1"
          + "/{name=projects/*/locations/*/trainingPi"
          + "pelines/*}:cancel:\001*\022\357\001\n\021CreatePipelineJ"
          + "ob\0229.google.cloud.aiplatform.v1beta1.Cre"
          + "atePipelineJobRequest\032,.google.cloud.aip"
          + "latform.v1beta1.PipelineJob\"q\332A#parent,p"
          + "ipeline_job,pipeline_job_id\202\323\344\223\002E\"5/v1be"
          + "ta1/{parent=projects/*/locations/*}/pipe"
          + "lineJobs:\014pipeline_job\022\274\001\n\016GetPipelineJo"
          + "b\0226.google.cloud.aiplatform.v1beta1.GetP"
          + "ipelineJobRequest\032,.google.cloud.aiplatf"
          + "orm.v1beta1.PipelineJob\"D\332A\004name\202\323\344\223\0027\0225"
          + "/v1beta1/{name=projects/*/locations/*/pi"
          + "pelineJobs/*}\022\317\001\n\020ListPipelineJobs\0228.goo"
          + "gle.cloud.aiplatform.v1beta1.ListPipelin"
          + "eJobsRequest\0329.google.cloud.aiplatform.v"
          + "1beta1.ListPipelineJobsResponse\"F\332A\006pare"
          + "nt\202\323\344\223\0027\0225/v1beta1/{parent=projects/*/lo"
          + "cations/*}/pipelineJobs\022\346\001\n\021DeletePipeli"
          + "neJob\0229.google.cloud.aiplatform.v1beta1."
          + "DeletePipelineJobRequest\032\035.google.longru"
          + "nning.Operation\"w\312A0\n\025google.protobuf.Em"
          + "pty\022\027DeleteOperationMetadata\332A\004name\202\323\344\223\002"
          + "7*5/v1beta1/{name=projects/*/locations/*"
          + "/pipelineJobs/*}\022\266\001\n\021CancelPipelineJob\0229"
          + ".google.cloud.aiplatform.v1beta1.CancelP"
          + "ipelineJobRequest\032\026.google.protobuf.Empt"
          + "y\"N\332A\004name\202\323\344\223\002A\"</v1beta1/{name=project"
          + "s/*/locations/*/pipelineJobs/*}:cancel:\001"
          + "*\032M\312A\031aiplatform.googleapis.com\322A.https:"
          + "//www.googleapis.com/auth/cloud-platform"
          + "B\353\001\n#com.google.cloud.aiplatform.v1beta1"
          + "B\024PipelineServiceProtoP\001ZCcloud.google.c"
          + "om/go/aiplatform/apiv1beta1/aiplatformpb"
          + ";aiplatformpb\252\002\037Google.Cloud.AIPlatform."
          + "V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta"
          + "1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.Pipeline.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TrainingPipeline",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor,
            new java.lang.String[] {
              "TrainingPipelines", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PipelineJob", "PipelineJobId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor,
            new java.lang.String[] {
              "PipelineJobs", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.Pipeline.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
