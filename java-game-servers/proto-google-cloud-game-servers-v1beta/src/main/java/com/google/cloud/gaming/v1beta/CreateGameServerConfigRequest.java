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
// source: google/cloud/gaming/v1beta/game_server_configs.proto

package com.google.cloud.gaming.v1beta;

/**
 *
 *
 * <pre>
 * Request message for GameServerConfigsService.CreateGameServerConfig.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.CreateGameServerConfigRequest}
 */
public final class CreateGameServerConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.CreateGameServerConfigRequest)
    CreateGameServerConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGameServerConfigRequest.newBuilder() to construct.
  private CreateGameServerConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGameServerConfigRequest() {
    parent_ = "";
    configId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGameServerConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateGameServerConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              configId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.gaming.v1beta.GameServerConfig.Builder subBuilder = null;
              if (gameServerConfig_ != null) {
                subBuilder = gameServerConfig_.toBuilder();
              }
              gameServerConfig_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1beta.GameServerConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gameServerConfig_);
                gameServerConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerConfigs
        .internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerConfigs
        .internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.class,
            com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object configId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server config resource to be created.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The configId.
   */
  @java.lang.Override
  public java.lang.String getConfigId() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server config resource to be created.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for configId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConfigIdBytes() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      configId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAME_SERVER_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1beta.GameServerConfig gameServerConfig_;
  /**
   *
   *
   * <pre>
   * Required. The game server config resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gameServerConfig field is set.
   */
  @java.lang.Override
  public boolean hasGameServerConfig() {
    return gameServerConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server config resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gameServerConfig.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerConfig getGameServerConfig() {
    return gameServerConfig_ == null
        ? com.google.cloud.gaming.v1beta.GameServerConfig.getDefaultInstance()
        : gameServerConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server config resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerConfigOrBuilder getGameServerConfigOrBuilder() {
    return getGameServerConfig();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, configId_);
    }
    if (gameServerConfig_ != null) {
      output.writeMessage(3, getGameServerConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, configId_);
    }
    if (gameServerConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getGameServerConfig());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest other =
        (com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getConfigId().equals(other.getConfigId())) return false;
    if (hasGameServerConfig() != other.hasGameServerConfig()) return false;
    if (hasGameServerConfig()) {
      if (!getGameServerConfig().equals(other.getGameServerConfig())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId().hashCode();
    if (hasGameServerConfig()) {
      hash = (37 * hash) + GAME_SERVER_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getGameServerConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parseFrom(
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
      com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest prototype) {
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
   * Request message for GameServerConfigsService.CreateGameServerConfig.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.CreateGameServerConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.CreateGameServerConfigRequest)
      com.google.cloud.gaming.v1beta.CreateGameServerConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerConfigs
          .internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerConfigs
          .internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.class,
              com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      configId_ = "";

      if (gameServerConfigBuilder_ == null) {
        gameServerConfig_ = null;
      } else {
        gameServerConfig_ = null;
        gameServerConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.GameServerConfigs
          .internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest build() {
      com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest buildPartial() {
      com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest result =
          new com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest(this);
      result.parent_ = parent_;
      result.configId_ = configId_;
      if (gameServerConfigBuilder_ == null) {
        result.gameServerConfig_ = gameServerConfig_;
      } else {
        result.gameServerConfig_ = gameServerConfigBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest) {
        return mergeFrom((com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest other) {
      if (other
          == com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getConfigId().isEmpty()) {
        configId_ = other.configId_;
        onChanged();
      }
      if (other.hasGameServerConfig()) {
        mergeGameServerConfig(other.getGameServerConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object configId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server config resource to be created.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The configId.
     */
    public java.lang.String getConfigId() {
      java.lang.Object ref = configId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server config resource to be created.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for configId.
     */
    public com.google.protobuf.ByteString getConfigIdBytes() {
      java.lang.Object ref = configId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        configId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server config resource to be created.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      configId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server config resource to be created.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {

      configId_ = getDefaultInstance().getConfigId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server config resource to be created.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      configId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1beta.GameServerConfig gameServerConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.GameServerConfig,
            com.google.cloud.gaming.v1beta.GameServerConfig.Builder,
            com.google.cloud.gaming.v1beta.GameServerConfigOrBuilder>
        gameServerConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the gameServerConfig field is set.
     */
    public boolean hasGameServerConfig() {
      return gameServerConfigBuilder_ != null || gameServerConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The gameServerConfig.
     */
    public com.google.cloud.gaming.v1beta.GameServerConfig getGameServerConfig() {
      if (gameServerConfigBuilder_ == null) {
        return gameServerConfig_ == null
            ? com.google.cloud.gaming.v1beta.GameServerConfig.getDefaultInstance()
            : gameServerConfig_;
      } else {
        return gameServerConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGameServerConfig(com.google.cloud.gaming.v1beta.GameServerConfig value) {
      if (gameServerConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameServerConfig_ = value;
        onChanged();
      } else {
        gameServerConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGameServerConfig(
        com.google.cloud.gaming.v1beta.GameServerConfig.Builder builderForValue) {
      if (gameServerConfigBuilder_ == null) {
        gameServerConfig_ = builderForValue.build();
        onChanged();
      } else {
        gameServerConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGameServerConfig(com.google.cloud.gaming.v1beta.GameServerConfig value) {
      if (gameServerConfigBuilder_ == null) {
        if (gameServerConfig_ != null) {
          gameServerConfig_ =
              com.google.cloud.gaming.v1beta.GameServerConfig.newBuilder(gameServerConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gameServerConfig_ = value;
        }
        onChanged();
      } else {
        gameServerConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGameServerConfig() {
      if (gameServerConfigBuilder_ == null) {
        gameServerConfig_ = null;
        onChanged();
      } else {
        gameServerConfig_ = null;
        gameServerConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gaming.v1beta.GameServerConfig.Builder getGameServerConfigBuilder() {

      onChanged();
      return getGameServerConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gaming.v1beta.GameServerConfigOrBuilder getGameServerConfigOrBuilder() {
      if (gameServerConfigBuilder_ != null) {
        return gameServerConfigBuilder_.getMessageOrBuilder();
      } else {
        return gameServerConfig_ == null
            ? com.google.cloud.gaming.v1beta.GameServerConfig.getDefaultInstance()
            : gameServerConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server config resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1beta.GameServerConfig game_server_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.GameServerConfig,
            com.google.cloud.gaming.v1beta.GameServerConfig.Builder,
            com.google.cloud.gaming.v1beta.GameServerConfigOrBuilder>
        getGameServerConfigFieldBuilder() {
      if (gameServerConfigBuilder_ == null) {
        gameServerConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1beta.GameServerConfig,
                com.google.cloud.gaming.v1beta.GameServerConfig.Builder,
                com.google.cloud.gaming.v1beta.GameServerConfigOrBuilder>(
                getGameServerConfig(), getParentForChildren(), isClean());
        gameServerConfig_ = null;
      }
      return gameServerConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.CreateGameServerConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.CreateGameServerConfigRequest)
  private static final com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest();
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGameServerConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGameServerConfigRequest>() {
        @java.lang.Override
        public CreateGameServerConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateGameServerConfigRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateGameServerConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGameServerConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
