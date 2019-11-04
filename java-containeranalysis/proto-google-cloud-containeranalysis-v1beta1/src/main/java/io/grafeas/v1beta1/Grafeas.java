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

public final class Grafeas {
  private Grafeas() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_Occurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_Occurrence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_Note_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_Note_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_GetOccurrenceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_GetOccurrenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListOccurrencesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListOccurrencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListOccurrencesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListOccurrencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_DeleteOccurrenceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_DeleteOccurrenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_CreateOccurrenceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_CreateOccurrenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_UpdateOccurrenceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_UpdateOccurrenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_GetNoteRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_GetNoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_GetOccurrenceNoteRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_GetOccurrenceNoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListNotesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListNotesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListNotesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListNotesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_DeleteNoteRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_DeleteNoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_CreateNoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_UpdateNoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListNoteOccurrencesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListNoteOccurrencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_ListNoteOccurrencesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_ListNoteOccurrencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_BatchCreateNotesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_BatchCreateNotesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_BatchCreateNotesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_GetVulnerabilityOccurrencesSummaryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_GetVulnerabilityOccurrencesSummaryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/devtools/containeranalysis/v1be"
          + "ta1/grafeas/grafeas.proto\022\017grafeas.v1bet"
          + "a1\032\034google/api/annotations.proto\032Ggoogle"
          + "/devtools/containeranalysis/v1beta1/atte"
          + "station/attestation.proto\032;google/devtoo"
          + "ls/containeranalysis/v1beta1/build/build"
          + ".proto\032=google/devtools/containeranalysi"
          + "s/v1beta1/common/common.proto\032Egoogle/de"
          + "vtools/containeranalysis/v1beta1/deploym"
          + "ent/deployment.proto\032Cgoogle/devtools/co"
          + "ntaineranalysis/v1beta1/discovery/discov"
          + "ery.proto\032;google/devtools/containeranal"
          + "ysis/v1beta1/image/image.proto\032?google/d"
          + "evtools/containeranalysis/v1beta1/packag"
          + "e/package.proto\032Egoogle/devtools/contain"
          + "eranalysis/v1beta1/provenance/provenance"
          + ".proto\032Kgoogle/devtools/containeranalysi"
          + "s/v1beta1/vulnerability/vulnerability.pr"
          + "oto\032\033google/protobuf/empty.proto\032 google"
          + "/protobuf/field_mask.proto\032\037google/proto"
          + "buf/timestamp.proto\"\234\005\n\nOccurrence\022\014\n\004na"
          + "me\030\001 \001(\t\022+\n\010resource\030\002 \001(\0132\031.grafeas.v1b"
          + "eta1.Resource\022\021\n\tnote_name\030\003 \001(\t\022\'\n\004kind"
          + "\030\004 \001(\0162\031.grafeas.v1beta1.NoteKind\022\023\n\013rem"
          + "ediation\030\005 \001(\t\022/\n\013create_time\030\006 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022/\n\013update_time\030\007"
          + " \001(\0132\032.google.protobuf.Timestamp\022?\n\rvuln"
          + "erability\030\010 \001(\0132&.grafeas.v1beta1.vulner"
          + "ability.DetailsH\000\022/\n\005build\030\t \001(\0132\036.grafe"
          + "as.v1beta1.build.DetailsH\000\0227\n\rderived_im"
          + "age\030\n \001(\0132\036.grafeas.v1beta1.image.Detail"
          + "sH\000\0228\n\014installation\030\013 \001(\0132 .grafeas.v1be"
          + "ta1.package.DetailsH\000\0229\n\ndeployment\030\014 \001("
          + "\0132#.grafeas.v1beta1.deployment.DetailsH\000"
          + "\0228\n\ndiscovered\030\r \001(\0132\".grafeas.v1beta1.d"
          + "iscovery.DetailsH\000\022;\n\013attestation\030\016 \001(\0132"
          + "$.grafeas.v1beta1.attestation.DetailsH\000B"
          + "\t\n\007details\"]\n\010Resource\022\014\n\004name\030\001 \001(\t\022\013\n\003"
          + "uri\030\002 \001(\t\0226\n\014content_hash\030\003 \001(\0132 .grafea"
          + "s.v1beta1.provenance.Hash\"\200\006\n\004Note\022\014\n\004na"
          + "me\030\001 \001(\t\022\031\n\021short_description\030\002 \001(\t\022\030\n\020l"
          + "ong_description\030\003 \001(\t\022\'\n\004kind\030\004 \001(\0162\031.gr"
          + "afeas.v1beta1.NoteKind\0220\n\013related_url\030\005 "
          + "\003(\0132\033.grafeas.v1beta1.RelatedUrl\0223\n\017expi"
          + "ration_time\030\006 \001(\0132\032.google.protobuf.Time"
          + "stamp\022/\n\013create_time\030\007 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022/\n\013update_time\030\010 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022\032\n\022related_note_"
          + "names\030\t \003(\t\022E\n\rvulnerability\030\n \001(\0132,.gra"
          + "feas.v1beta1.vulnerability.Vulnerability"
          + "H\000\022-\n\005build\030\013 \001(\0132\034.grafeas.v1beta1.buil"
          + "d.BuildH\000\0222\n\nbase_image\030\014 \001(\0132\034.grafeas."
          + "v1beta1.image.BasisH\000\0223\n\007package\030\r \001(\0132 "
          + ".grafeas.v1beta1.package.PackageH\000\022<\n\nde"
          + "ployable\030\016 \001(\0132&.grafeas.v1beta1.deploym"
          + "ent.DeployableH\000\0229\n\tdiscovery\030\017 \001(\0132$.gr"
          + "afeas.v1beta1.discovery.DiscoveryH\000\022G\n\025a"
          + "ttestation_authority\030\020 \001(\0132&.grafeas.v1b"
          + "eta1.attestation.AuthorityH\000B\006\n\004type\"$\n\024"
          + "GetOccurrenceRequest\022\014\n\004name\030\001 \001(\t\"_\n\026Li"
          + "stOccurrencesRequest\022\016\n\006parent\030\001 \001(\t\022\016\n\006"
          + "filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_"
          + "token\030\004 \001(\t\"d\n\027ListOccurrencesResponse\0220"
          + "\n\013occurrences\030\001 \003(\0132\033.grafeas.v1beta1.Oc"
          + "currence\022\027\n\017next_page_token\030\002 \001(\t\"\'\n\027Del"
          + "eteOccurrenceRequest\022\014\n\004name\030\001 \001(\t\"Z\n\027Cr"
          + "eateOccurrenceRequest\022\016\n\006parent\030\001 \001(\t\022/\n"
          + "\noccurrence\030\002 \001(\0132\033.grafeas.v1beta1.Occu"
          + "rrence\"\211\001\n\027UpdateOccurrenceRequest\022\014\n\004na"
          + "me\030\001 \001(\t\022/\n\noccurrence\030\002 \001(\0132\033.grafeas.v"
          + "1beta1.Occurrence\022/\n\013update_mask\030\003 \001(\0132\032"
          + ".google.protobuf.FieldMask\"\036\n\016GetNoteReq"
          + "uest\022\014\n\004name\030\001 \001(\t\"(\n\030GetOccurrenceNoteR"
          + "equest\022\014\n\004name\030\001 \001(\t\"Y\n\020ListNotesRequest"
          + "\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage"
          + "_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"R\n\021ListN"
          + "otesResponse\022$\n\005notes\030\001 \003(\0132\025.grafeas.v1"
          + "beta1.Note\022\027\n\017next_page_token\030\002 \001(\t\"!\n\021D"
          + "eleteNoteRequest\022\014\n\004name\030\001 \001(\t\"Y\n\021Create"
          + "NoteRequest\022\016\n\006parent\030\001 \001(\t\022\017\n\007note_id\030\002"
          + " \001(\t\022#\n\004note\030\003 \001(\0132\025.grafeas.v1beta1.Not"
          + "e\"w\n\021UpdateNoteRequest\022\014\n\004name\030\001 \001(\t\022#\n\004"
          + "note\030\002 \001(\0132\025.grafeas.v1beta1.Note\022/\n\013upd"
          + "ate_mask\030\003 \001(\0132\032.google.protobuf.FieldMa"
          + "sk\"a\n\032ListNoteOccurrencesRequest\022\014\n\004name"
          + "\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001("
          + "\005\022\022\n\npage_token\030\004 \001(\t\"h\n\033ListNoteOccurre"
          + "ncesResponse\0220\n\013occurrences\030\001 \003(\0132\033.graf"
          + "eas.v1beta1.Occurrence\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"\262\001\n\027BatchCreateNotesRequest\022\016\n\006p"
          + "arent\030\001 \001(\t\022B\n\005notes\030\002 \003(\01323.grafeas.v1b"
          + "eta1.BatchCreateNotesRequest.NotesEntry\032"
          + "C\n\nNotesEntry\022\013\n\003key\030\001 \001(\t\022$\n\005value\030\002 \001("
          + "\0132\025.grafeas.v1beta1.Note:\0028\001\"@\n\030BatchCre"
          + "ateNotesResponse\022$\n\005notes\030\001 \003(\0132\025.grafea"
          + "s.v1beta1.Note\"a\n\035BatchCreateOccurrences"
          + "Request\022\016\n\006parent\030\001 \001(\t\0220\n\013occurrences\030\002"
          + " \003(\0132\033.grafeas.v1beta1.Occurrence\"R\n\036Bat"
          + "chCreateOccurrencesResponse\0220\n\013occurrenc"
          + "es\030\001 \003(\0132\033.grafeas.v1beta1.Occurrence\"K\n"
          + ")GetVulnerabilityOccurrencesSummaryReque"
          + "st\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\"\245\002\n\037V"
          + "ulnerabilityOccurrencesSummary\022U\n\006counts"
          + "\030\001 \003(\0132E.grafeas.v1beta1.VulnerabilityOc"
          + "currencesSummary.FixableTotalByDigest\032\252\001"
          + "\n\024FixableTotalByDigest\022+\n\010resource\030\001 \001(\013"
          + "2\031.grafeas.v1beta1.Resource\0229\n\010severity\030"
          + "\002 \001(\0162\'.grafeas.v1beta1.vulnerability.Se"
          + "verity\022\025\n\rfixable_count\030\003 \001(\003\022\023\n\013total_c"
          + "ount\030\004 \001(\0032\302\021\n\016GrafeasV1Beta1\022\205\001\n\rGetOcc"
          + "urrence\022%.grafeas.v1beta1.GetOccurrenceR"
          + "equest\032\033.grafeas.v1beta1.Occurrence\"0\202\323\344"
          + "\223\002*\022(/v1beta1/{name=projects/*/occurrenc"
          + "es/*}\022\226\001\n\017ListOccurrences\022\'.grafeas.v1be"
          + "ta1.ListOccurrencesRequest\032(.grafeas.v1b"
          + "eta1.ListOccurrencesResponse\"0\202\323\344\223\002*\022(/v"
          + "1beta1/{parent=projects/*}/occurrences\022\206"
          + "\001\n\020DeleteOccurrence\022(.grafeas.v1beta1.De"
          + "leteOccurrenceRequest\032\026.google.protobuf."
          + "Empty\"0\202\323\344\223\002**(/v1beta1/{name=projects/*"
          + "/occurrences/*}\022\227\001\n\020CreateOccurrence\022(.g"
          + "rafeas.v1beta1.CreateOccurrenceRequest\032\033"
          + ".grafeas.v1beta1.Occurrence\"<\202\323\344\223\0026\"(/v1"
          + "beta1/{parent=projects/*}/occurrences:\no"
          + "ccurrence\022\272\001\n\026BatchCreateOccurrences\022..g"
          + "rafeas.v1beta1.BatchCreateOccurrencesReq"
          + "uest\032/.grafeas.v1beta1.BatchCreateOccurr"
          + "encesResponse\"?\202\323\344\223\0029\"4/v1beta1/{parent="
          + "projects/*}/occurrences:batchCreate:\001*\022\227"
          + "\001\n\020UpdateOccurrence\022(.grafeas.v1beta1.Up"
          + "dateOccurrenceRequest\032\033.grafeas.v1beta1."
          + "Occurrence\"<\202\323\344\223\00262(/v1beta1/{name=proje"
          + "cts/*/occurrences/*}:\noccurrence\022\215\001\n\021Get"
          + "OccurrenceNote\022).grafeas.v1beta1.GetOccu"
          + "rrenceNoteRequest\032\025.grafeas.v1beta1.Note"
          + "\"6\202\323\344\223\0020\022./v1beta1/{name=projects/*/occu"
          + "rrences/*}/notes\022m\n\007GetNote\022\037.grafeas.v1"
          + "beta1.GetNoteRequest\032\025.grafeas.v1beta1.N"
          + "ote\"*\202\323\344\223\002$\022\"/v1beta1/{name=projects/*/n"
          + "otes/*}\022~\n\tListNotes\022!.grafeas.v1beta1.L"
          + "istNotesRequest\032\".grafeas.v1beta1.ListNo"
          + "tesResponse\"*\202\323\344\223\002$\022\"/v1beta1/{parent=pr"
          + "ojects/*}/notes\022t\n\nDeleteNote\022\".grafeas."
          + "v1beta1.DeleteNoteRequest\032\026.google.proto"
          + "buf.Empty\"*\202\323\344\223\002$*\"/v1beta1/{name=projec"
          + "ts/*/notes/*}\022y\n\nCreateNote\022\".grafeas.v1"
          + "beta1.CreateNoteRequest\032\025.grafeas.v1beta"
          + "1.Note\"0\202\323\344\223\002*\"\"/v1beta1/{parent=project"
          + "s/*}/notes:\004note\022\242\001\n\020BatchCreateNotes\022(."
          + "grafeas.v1beta1.BatchCreateNotesRequest\032"
          + ").grafeas.v1beta1.BatchCreateNotesRespon"
          + "se\"9\202\323\344\223\0023\"./v1beta1/{parent=projects/*}"
          + "/notes:batchCreate:\001*\022y\n\nUpdateNote\022\".gr"
          + "afeas.v1beta1.UpdateNoteRequest\032\025.grafea"
          + "s.v1beta1.Note\"0\202\323\344\223\002*2\"/v1beta1/{name=p"
          + "rojects/*/notes/*}:\004note\022\250\001\n\023ListNoteOcc"
          + "urrences\022+.grafeas.v1beta1.ListNoteOccur"
          + "rencesRequest\032,.grafeas.v1beta1.ListNote"
          + "OccurrencesResponse\"6\202\323\344\223\0020\022./v1beta1/{n"
          + "ame=projects/*/notes/*}/occurrences\022\331\001\n\""
          + "GetVulnerabilityOccurrencesSummary\022:.gra"
          + "feas.v1beta1.GetVulnerabilityOccurrences"
          + "SummaryRequest\0320.grafeas.v1beta1.Vulnera"
          + "bilityOccurrencesSummary\"E\202\323\344\223\002?\022=/v1bet"
          + "a1/{parent=projects/*}/occurrences:vulne"
          + "rabilitySummaryBv\n\022io.grafeas.v1beta1P\001Z"
          + "Xgoogle.golang.org/genproto/googleapis/d"
          + "evtools/containeranalysis/v1beta1/grafea"
          + "s;grafeas\242\002\003GRAb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          io.grafeas.v1beta1.attestation.AttestationOuterClass.getDescriptor(),
          io.grafeas.v1beta1.build.BuildOuterClass.getDescriptor(),
          io.grafeas.v1beta1.common.Common.getDescriptor(),
          io.grafeas.v1beta1.deployment.DeploymentOuterClass.getDescriptor(),
          io.grafeas.v1beta1.discovery.DiscoveryOuterClass.getDescriptor(),
          io.grafeas.v1beta1.image.Image.getDescriptor(),
          io.grafeas.v1beta1.pkg.PackageOuterClass.getDescriptor(),
          io.grafeas.v1beta1.provenance.Provenance.getDescriptor(),
          io.grafeas.v1beta1.vulnerability.VulnerabilityOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_grafeas_v1beta1_Occurrence_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_Occurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_Occurrence_descriptor,
            new java.lang.String[] {
              "Name",
              "Resource",
              "NoteName",
              "Kind",
              "Remediation",
              "CreateTime",
              "UpdateTime",
              "Vulnerability",
              "Build",
              "DerivedImage",
              "Installation",
              "Deployment",
              "Discovered",
              "Attestation",
              "Details",
            });
    internal_static_grafeas_v1beta1_Resource_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_Resource_descriptor,
            new java.lang.String[] {
              "Name", "Uri", "ContentHash",
            });
    internal_static_grafeas_v1beta1_Note_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_Note_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_Note_descriptor,
            new java.lang.String[] {
              "Name",
              "ShortDescription",
              "LongDescription",
              "Kind",
              "RelatedUrl",
              "ExpirationTime",
              "CreateTime",
              "UpdateTime",
              "RelatedNoteNames",
              "Vulnerability",
              "Build",
              "BaseImage",
              "Package",
              "Deployable",
              "Discovery",
              "AttestationAuthority",
              "Type",
            });
    internal_static_grafeas_v1beta1_GetOccurrenceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1beta1_GetOccurrenceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_GetOccurrenceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_grafeas_v1beta1_ListOccurrencesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1beta1_ListOccurrencesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListOccurrencesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_grafeas_v1beta1_ListOccurrencesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_grafeas_v1beta1_ListOccurrencesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListOccurrencesResponse_descriptor,
            new java.lang.String[] {
              "Occurrences", "NextPageToken",
            });
    internal_static_grafeas_v1beta1_DeleteOccurrenceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_grafeas_v1beta1_DeleteOccurrenceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_DeleteOccurrenceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_grafeas_v1beta1_CreateOccurrenceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_grafeas_v1beta1_CreateOccurrenceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_CreateOccurrenceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Occurrence",
            });
    internal_static_grafeas_v1beta1_UpdateOccurrenceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_grafeas_v1beta1_UpdateOccurrenceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_UpdateOccurrenceRequest_descriptor,
            new java.lang.String[] {
              "Name", "Occurrence", "UpdateMask",
            });
    internal_static_grafeas_v1beta1_GetNoteRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_grafeas_v1beta1_GetNoteRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_GetNoteRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_grafeas_v1beta1_GetOccurrenceNoteRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_grafeas_v1beta1_GetOccurrenceNoteRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_GetOccurrenceNoteRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_grafeas_v1beta1_ListNotesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_grafeas_v1beta1_ListNotesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListNotesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_grafeas_v1beta1_ListNotesResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_grafeas_v1beta1_ListNotesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListNotesResponse_descriptor,
            new java.lang.String[] {
              "Notes", "NextPageToken",
            });
    internal_static_grafeas_v1beta1_DeleteNoteRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_grafeas_v1beta1_DeleteNoteRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_DeleteNoteRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_grafeas_v1beta1_CreateNoteRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor,
            new java.lang.String[] {
              "Parent", "NoteId", "Note",
            });
    internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_grafeas_v1beta1_UpdateNoteRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor,
            new java.lang.String[] {
              "Name", "Note", "UpdateMask",
            });
    internal_static_grafeas_v1beta1_ListNoteOccurrencesRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_grafeas_v1beta1_ListNoteOccurrencesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListNoteOccurrencesRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_grafeas_v1beta1_ListNoteOccurrencesResponse_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_grafeas_v1beta1_ListNoteOccurrencesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_ListNoteOccurrencesResponse_descriptor,
            new java.lang.String[] {
              "Occurrences", "NextPageToken",
            });
    internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_grafeas_v1beta1_BatchCreateNotesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Notes",
            });
    internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_descriptor =
        internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_grafeas_v1beta1_BatchCreateNotesResponse_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_grafeas_v1beta1_BatchCreateNotesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_BatchCreateNotesResponse_descriptor,
            new java.lang.String[] {
              "Notes",
            });
    internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Occurrences",
            });
    internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor,
            new java.lang.String[] {
              "Occurrences",
            });
    internal_static_grafeas_v1beta1_GetVulnerabilityOccurrencesSummaryRequest_descriptor =
        getDescriptor().getMessageTypes().get(22);
    internal_static_grafeas_v1beta1_GetVulnerabilityOccurrencesSummaryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_GetVulnerabilityOccurrencesSummaryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter",
            });
    internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_descriptor =
        getDescriptor().getMessageTypes().get(23);
    internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_descriptor,
            new java.lang.String[] {
              "Counts",
            });
    internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor =
        internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor,
            new java.lang.String[] {
              "Resource", "Severity", "FixableCount", "TotalCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    io.grafeas.v1beta1.attestation.AttestationOuterClass.getDescriptor();
    io.grafeas.v1beta1.build.BuildOuterClass.getDescriptor();
    io.grafeas.v1beta1.common.Common.getDescriptor();
    io.grafeas.v1beta1.deployment.DeploymentOuterClass.getDescriptor();
    io.grafeas.v1beta1.discovery.DiscoveryOuterClass.getDescriptor();
    io.grafeas.v1beta1.image.Image.getDescriptor();
    io.grafeas.v1beta1.pkg.PackageOuterClass.getDescriptor();
    io.grafeas.v1beta1.provenance.Provenance.getDescriptor();
    io.grafeas.v1beta1.vulnerability.VulnerabilityOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
