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
// source: google/cloud/datastream/v1/datastream.proto

package com.google.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Response for manually initiating a backfill job for a specific stream object.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.StartBackfillJobResponse}
 */
public final class StartBackfillJobResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.StartBackfillJobResponse)
    StartBackfillJobResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StartBackfillJobResponse.newBuilder() to construct.
  private StartBackfillJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartBackfillJobResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StartBackfillJobResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamProto
        .internal_static_google_cloud_datastream_v1_StartBackfillJobResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamProto
        .internal_static_google_cloud_datastream_v1_StartBackfillJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.StartBackfillJobResponse.class,
            com.google.cloud.datastream.v1.StartBackfillJobResponse.Builder.class);
  }

  public static final int OBJECT_FIELD_NUMBER = 1;
  private com.google.cloud.datastream.v1.StreamObject object_;
  /**
   *
   *
   * <pre>
   * The stream object resource a backfill job was started for.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
   *
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return object_ != null;
  }
  /**
   *
   *
   * <pre>
   * The stream object resource a backfill job was started for.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
   *
   * @return The object.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.StreamObject getObject() {
    return object_ == null
        ? com.google.cloud.datastream.v1.StreamObject.getDefaultInstance()
        : object_;
  }
  /**
   *
   *
   * <pre>
   * The stream object resource a backfill job was started for.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.StreamObjectOrBuilder getObjectOrBuilder() {
    return object_ == null
        ? com.google.cloud.datastream.v1.StreamObject.getDefaultInstance()
        : object_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (object_ != null) {
      output.writeMessage(1, getObject());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (object_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getObject());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datastream.v1.StartBackfillJobResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.StartBackfillJobResponse other =
        (com.google.cloud.datastream.v1.StartBackfillJobResponse) obj;

    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject().equals(other.getObject())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datastream.v1.StartBackfillJobResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for manually initiating a backfill job for a specific stream object.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.StartBackfillJobResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.StartBackfillJobResponse)
      com.google.cloud.datastream.v1.StartBackfillJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_StartBackfillJobResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_StartBackfillJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.StartBackfillJobResponse.class,
              com.google.cloud.datastream.v1.StartBackfillJobResponse.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.StartBackfillJobResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_StartBackfillJobResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.StartBackfillJobResponse getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.StartBackfillJobResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.StartBackfillJobResponse build() {
      com.google.cloud.datastream.v1.StartBackfillJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.StartBackfillJobResponse buildPartial() {
      com.google.cloud.datastream.v1.StartBackfillJobResponse result =
          new com.google.cloud.datastream.v1.StartBackfillJobResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1.StartBackfillJobResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.object_ = objectBuilder_ == null ? object_ : objectBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datastream.v1.StartBackfillJobResponse) {
        return mergeFrom((com.google.cloud.datastream.v1.StartBackfillJobResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.StartBackfillJobResponse other) {
      if (other == com.google.cloud.datastream.v1.StartBackfillJobResponse.getDefaultInstance())
        return this;
      if (other.hasObject()) {
        mergeObject(other.getObject());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getObjectFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.datastream.v1.StreamObject object_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.StreamObject,
            com.google.cloud.datastream.v1.StreamObject.Builder,
            com.google.cloud.datastream.v1.StreamObjectOrBuilder>
        objectBuilder_;
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     *
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     *
     * @return The object.
     */
    public com.google.cloud.datastream.v1.StreamObject getObject() {
      if (objectBuilder_ == null) {
        return object_ == null
            ? com.google.cloud.datastream.v1.StreamObject.getDefaultInstance()
            : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public Builder setObject(com.google.cloud.datastream.v1.StreamObject value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public Builder setObject(com.google.cloud.datastream.v1.StreamObject.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public Builder mergeObject(com.google.cloud.datastream.v1.StreamObject value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && object_ != null
            && object_ != com.google.cloud.datastream.v1.StreamObject.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObject.Builder getObjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObjectOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null
            ? com.google.cloud.datastream.v1.StreamObject.getDefaultInstance()
            : object_;
      }
    }
    /**
     *
     *
     * <pre>
     * The stream object resource a backfill job was started for.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.StreamObject object = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.StreamObject,
            com.google.cloud.datastream.v1.StreamObject.Builder,
            com.google.cloud.datastream.v1.StreamObjectOrBuilder>
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datastream.v1.StreamObject,
                com.google.cloud.datastream.v1.StreamObject.Builder,
                com.google.cloud.datastream.v1.StreamObjectOrBuilder>(
                getObject(), getParentForChildren(), isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.StartBackfillJobResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.StartBackfillJobResponse)
  private static final com.google.cloud.datastream.v1.StartBackfillJobResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.StartBackfillJobResponse();
  }

  public static com.google.cloud.datastream.v1.StartBackfillJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartBackfillJobResponse> PARSER =
      new com.google.protobuf.AbstractParser<StartBackfillJobResponse>() {
        @java.lang.Override
        public StartBackfillJobResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<StartBackfillJobResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartBackfillJobResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.StartBackfillJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
