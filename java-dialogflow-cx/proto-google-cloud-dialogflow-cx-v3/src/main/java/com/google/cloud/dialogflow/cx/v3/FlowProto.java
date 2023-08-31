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
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

public final class FlowProto {
  private FlowProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_NluSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/cx/v3/flow.pro"
          + "to\022\035google.cloud.dialogflow.cx.v3\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\0323google/clo"
          + "ud/dialogflow/cx/v3/import_strategy.prot"
          + "o\032(google/cloud/dialogflow/cx/v3/page.pr"
          + "oto\0326google/cloud/dialogflow/cx/v3/valid"
          + "ation_message.proto\032#google/longrunning/"
          + "operations.proto\032\033google/protobuf/empty."
          + "proto\032 google/protobuf/field_mask.proto\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\254\003\n\013NluSettings\022H"
          + "\n\nmodel_type\030\001 \001(\01624.google.cloud.dialog"
          + "flow.cx.v3.NluSettings.ModelType\022 \n\030clas"
          + "sification_threshold\030\003 \001(\002\022Y\n\023model_trai"
          + "ning_mode\030\004 \001(\0162<.google.cloud.dialogflo"
          + "w.cx.v3.NluSettings.ModelTrainingMode\"Y\n"
          + "\tModelType\022\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\027"
          + "\n\023MODEL_TYPE_STANDARD\020\001\022\027\n\023MODEL_TYPE_AD"
          + "VANCED\020\003\"{\n\021ModelTrainingMode\022#\n\037MODEL_T"
          + "RAINING_MODE_UNSPECIFIED\020\000\022!\n\035MODEL_TRAI"
          + "NING_MODE_AUTOMATIC\020\001\022\036\n\032MODEL_TRAINING_"
          + "MODE_MANUAL\020\002\"\276\004\n\004Flow\022\014\n\004name\030\001 \001(\t\022\032\n\014"
          + "display_name\030\002 \001(\tB\004\342A\001\002\022\023\n\013description\030"
          + "\003 \001(\t\022I\n\021transition_routes\030\004 \003(\0132..googl"
          + "e.cloud.dialogflow.cx.v3.TransitionRoute"
          + "\022C\n\016event_handlers\030\n \003(\0132+.google.cloud."
          + "dialogflow.cx.v3.EventHandler\022T\n\027transit"
          + "ion_route_groups\030\017 \003(\tB3\372A0\n.dialogflow."
          + "googleapis.com/TransitionRouteGroup\022@\n\014n"
          + "lu_settings\030\013 \001(\0132*.google.cloud.dialogf"
          + "low.cx.v3.NluSettings\022e\n\034knowledge_conne"
          + "ctor_settings\030\022 \001(\01329.google.cloud.dialo"
          + "gflow.cx.v3.KnowledgeConnectorSettingsB\004"
          + "\342A\001\001:h\352Ae\n\036dialogflow.googleapis.com/Flo"
          + "w\022Cprojects/{project}/locations/{locatio"
          + "n}/agents/{agent}/flows/{flow}\"\234\001\n\021Creat"
          + "eFlowRequest\0227\n\006parent\030\001 \001(\tB\'\342A\001\002\372A \022\036d"
          + "ialogflow.googleapis.com/Flow\0227\n\004flow\030\002 "
          + "\001(\0132#.google.cloud.dialogflow.cx.v3.Flow"
          + "B\004\342A\001\002\022\025\n\rlanguage_code\030\003 \001(\t\"Y\n\021DeleteF"
          + "lowRequest\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036dialo"
          + "gflow.googleapis.com/Flow\022\r\n\005force\030\002 \001(\010"
          + "\"\211\001\n\020ListFlowsRequest\0227\n\006parent\030\001 \001(\tB\'\342"
          + "A\001\002\372A \022\036dialogflow.googleapis.com/Flow\022\021"
          + "\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\025\n"
          + "\rlanguage_code\030\004 \001(\t\"`\n\021ListFlowsRespons"
          + "e\0222\n\005flows\030\001 \003(\0132#.google.cloud.dialogfl"
          + "ow.cx.v3.Flow\022\027\n\017next_page_token\030\002 \001(\t\"^"
          + "\n\016GetFlowRequest\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n"
          + "\036dialogflow.googleapis.com/Flow\022\025\n\rlangu"
          + "age_code\030\002 \001(\t\"\224\001\n\021UpdateFlowRequest\0227\n\004"
          + "flow\030\001 \001(\0132#.google.cloud.dialogflow.cx."
          + "v3.FlowB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMask\022\025\n\rlanguage_code\030"
          + "\003 \001(\t\"I\n\020TrainFlowRequest\0225\n\004name\030\001 \001(\tB"
          + "\'\342A\001\002\372A \n\036dialogflow.googleapis.com/Flow"
          + "\"c\n\023ValidateFlowRequest\0225\n\004name\030\001 \001(\tB\'\342"
          + "A\001\002\372A \n\036dialogflow.googleapis.com/Flow\022\025"
          + "\n\rlanguage_code\030\002 \001(\t\"~\n\036GetFlowValidati"
          + "onResultRequest\022E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n."
          + "dialogflow.googleapis.com/FlowValidation"
          + "Result\022\025\n\rlanguage_code\030\002 \001(\t\"\261\002\n\024FlowVa"
          + "lidationResult\022\014\n\004name\030\001 \001(\t\022M\n\023validati"
          + "on_messages\030\002 \003(\01320.google.cloud.dialogf"
          + "low.cx.v3.ValidationMessage\022/\n\013update_ti"
          + "me\030\003 \001(\0132\032.google.protobuf.Timestamp:\212\001\352"
          + "A\206\001\n.dialogflow.googleapis.com/FlowValid"
          + "ationResult\022Tprojects/{project}/location"
          + "s/{location}/agents/{agent}/flows/{flow}"
          + "/validationResult\"\364\002\n\021ImportFlowRequest\022"
          + "7\n\006parent\030\001 \001(\tB\'\342A\001\002\372A \022\036dialogflow.goo"
          + "gleapis.com/Flow\022\022\n\010flow_uri\030\002 \001(\tH\000\022\026\n\014"
          + "flow_content\030\003 \001(\014H\000\022T\n\rimport_option\030\004 "
          + "\001(\0162=.google.cloud.dialogflow.cx.v3.Impo"
          + "rtFlowRequest.ImportOption\022U\n\024flow_impor"
          + "t_strategy\030\005 \001(\01321.google.cloud.dialogfl"
          + "ow.cx.v3.FlowImportStrategyB\004\342A\001\001\"E\n\014Imp"
          + "ortOption\022\035\n\031IMPORT_OPTION_UNSPECIFIED\020\000"
          + "\022\010\n\004KEEP\020\001\022\014\n\010FALLBACK\020\002B\006\n\004flow\"i\n\022Flow"
          + "ImportStrategy\022S\n\026global_import_strategy"
          + "\030\001 \001(\0162-.google.cloud.dialogflow.cx.v3.I"
          + "mportStrategyB\004\342A\001\001\"G\n\022ImportFlowRespons"
          + "e\0221\n\004flow\030\001 \001(\tB#\372A \n\036dialogflow.googlea"
          + "pis.com/Flow\"\212\001\n\021ExportFlowRequest\0225\n\004na"
          + "me\030\001 \001(\tB\'\342A\001\002\372A \n\036dialogflow.googleapis"
          + ".com/Flow\022\026\n\010flow_uri\030\002 \001(\tB\004\342A\001\001\022&\n\030inc"
          + "lude_referenced_flows\030\004 \001(\010B\004\342A\001\001\"H\n\022Exp"
          + "ortFlowResponse\022\022\n\010flow_uri\030\001 \001(\tH\000\022\026\n\014f"
          + "low_content\030\002 \001(\014H\000B\006\n\004flow2\230\020\n\005Flows\022\263\001"
          + "\n\nCreateFlow\0220.google.cloud.dialogflow.c"
          + "x.v3.CreateFlowRequest\032#.google.cloud.di"
          + "alogflow.cx.v3.Flow\"N\332A\013parent,flow\202\323\344\223\002"
          + ":\"2/v3/{parent=projects/*/locations/*/ag"
          + "ents/*}/flows:\004flow\022\231\001\n\nDeleteFlow\0220.goo"
          + "gle.cloud.dialogflow.cx.v3.DeleteFlowReq"
          + "uest\032\026.google.protobuf.Empty\"A\332A\004name\202\323\344"
          + "\223\0024*2/v3/{name=projects/*/locations/*/ag"
          + "ents/*/flows/*}\022\263\001\n\tListFlows\022/.google.c"
          + "loud.dialogflow.cx.v3.ListFlowsRequest\0320"
          + ".google.cloud.dialogflow.cx.v3.ListFlows"
          + "Response\"C\332A\006parent\202\323\344\223\0024\0222/v3/{parent=p"
          + "rojects/*/locations/*/agents/*}/flows\022\240\001"
          + "\n\007GetFlow\022-.google.cloud.dialogflow.cx.v"
          + "3.GetFlowRequest\032#.google.cloud.dialogfl"
          + "ow.cx.v3.Flow\"A\332A\004name\202\323\344\223\0024\0222/v3/{name="
          + "projects/*/locations/*/agents/*/flows/*}"
          + "\022\275\001\n\nUpdateFlow\0220.google.cloud.dialogflo"
          + "w.cx.v3.UpdateFlowRequest\032#.google.cloud"
          + ".dialogflow.cx.v3.Flow\"X\332A\020flow,update_m"
          + "ask\202\323\344\223\002?27/v3/{flow.name=projects/*/loc"
          + "ations/*/agents/*/flows/*}:\004flow\022\331\001\n\tTra"
          + "inFlow\022/.google.cloud.dialogflow.cx.v3.T"
          + "rainFlowRequest\032\035.google.longrunning.Ope"
          + "ration\"|\312A/\n\025google.protobuf.Empty\022\026goog"
          + "le.protobuf.Struct\332A\004name\202\323\344\223\002=\"8/v3/{na"
          + "me=projects/*/locations/*/agents/*/flows"
          + "/*}:train:\001*\022\277\001\n\014ValidateFlow\0222.google.c"
          + "loud.dialogflow.cx.v3.ValidateFlowReques"
          + "t\0323.google.cloud.dialogflow.cx.v3.FlowVa"
          + "lidationResult\"F\202\323\344\223\002@\";/v3/{name=projec"
          + "ts/*/locations/*/agents/*/flows/*}:valid"
          + "ate:\001*\022\341\001\n\027GetFlowValidationResult\022=.goo"
          + "gle.cloud.dialogflow.cx.v3.GetFlowValida"
          + "tionResultRequest\0323.google.cloud.dialogf"
          + "low.cx.v3.FlowValidationResult\"R\332A\004name\202"
          + "\323\344\223\002E\022C/v3/{name=projects/*/locations/*/"
          + "agents/*/flows/*/validationResult}\022\322\001\n\nI"
          + "mportFlow\0220.google.cloud.dialogflow.cx.v"
          + "3.ImportFlowRequest\032\035.google.longrunning"
          + ".Operation\"s\312A,\n\022ImportFlowResponse\022\026goo"
          + "gle.protobuf.Struct\202\323\344\223\002>\"9/v3/{parent=p"
          + "rojects/*/locations/*/agents/*}/flows:im"
          + "port:\001*\022\322\001\n\nExportFlow\0220.google.cloud.di"
          + "alogflow.cx.v3.ExportFlowRequest\032\035.googl"
          + "e.longrunning.Operation\"s\312A,\n\022ExportFlow"
          + "Response\022\026google.protobuf.Struct\202\323\344\223\002>\"9"
          + "/v3/{name=projects/*/locations/*/agents/"
          + "*/flows/*}:export:\001*\032x\312A\031dialogflow.goog"
          + "leapis.com\322AYhttps://www.googleapis.com/"
          + "auth/cloud-platform,https://www.googleap"
          + "is.com/auth/dialogflowB\257\001\n!com.google.cl"
          + "oud.dialogflow.cx.v3B\tFlowProtoP\001Z1cloud"
          + ".google.com/go/dialogflow/cx/apiv3/cxpb;"
          + "cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.C"
          + "x.V3\352\002!Google::Cloud::Dialogflow::CX::V3"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.ImportStrategyProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.ValidationMessageProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_NluSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor,
            new java.lang.String[] {
              "ModelType", "ClassificationThreshold", "ModelTrainingMode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Flow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "TransitionRoutes",
              "EventHandlers",
              "TransitionRouteGroups",
              "NluSettings",
              "KnowledgeConnectorSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Flow", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor,
            new java.lang.String[] {
              "Flows", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor,
            new java.lang.String[] {
              "Flow", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "ValidationMessages", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FlowUri", "FlowContent", "ImportOption", "FlowImportStrategy", "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor,
            new java.lang.String[] {
              "GlobalImportStrategy",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor,
            new java.lang.String[] {
              "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "FlowUri", "IncludeReferencedFlows",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor,
            new java.lang.String[] {
              "FlowUri", "FlowContent", "Flow",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.ImportStrategyProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.ValidationMessageProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
