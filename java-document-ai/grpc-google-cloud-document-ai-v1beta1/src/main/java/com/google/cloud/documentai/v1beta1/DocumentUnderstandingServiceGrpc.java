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
package com.google.cloud.documentai.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service to parse structured information from unstructured or semi-structured
 * documents using state-of-the-art Google AI such as natural language,
 * computer vision, and translation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/documentai/v1beta1/document_understanding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DocumentUnderstandingServiceGrpc {

  private DocumentUnderstandingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.documentai.v1beta1.DocumentUnderstandingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest,
          com.google.longrunning.Operation>
      getBatchProcessDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchProcessDocuments",
      requestType = com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest,
          com.google.longrunning.Operation>
      getBatchProcessDocumentsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest,
            com.google.longrunning.Operation>
        getBatchProcessDocumentsMethod;
    if ((getBatchProcessDocumentsMethod =
            DocumentUnderstandingServiceGrpc.getBatchProcessDocumentsMethod)
        == null) {
      synchronized (DocumentUnderstandingServiceGrpc.class) {
        if ((getBatchProcessDocumentsMethod =
                DocumentUnderstandingServiceGrpc.getBatchProcessDocumentsMethod)
            == null) {
          DocumentUnderstandingServiceGrpc.getBatchProcessDocumentsMethod =
              getBatchProcessDocumentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "BatchProcessDocuments"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DocumentUnderstandingServiceMethodDescriptorSupplier(
                              "BatchProcessDocuments"))
                      .build();
        }
      }
    }
    return getBatchProcessDocumentsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static DocumentUnderstandingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceStub>() {
          @java.lang.Override
          public DocumentUnderstandingServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DocumentUnderstandingServiceStub(channel, callOptions);
          }
        };
    return DocumentUnderstandingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DocumentUnderstandingServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceBlockingStub>() {
          @java.lang.Override
          public DocumentUnderstandingServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DocumentUnderstandingServiceBlockingStub(channel, callOptions);
          }
        };
    return DocumentUnderstandingServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static DocumentUnderstandingServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DocumentUnderstandingServiceFutureStub>() {
          @java.lang.Override
          public DocumentUnderstandingServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DocumentUnderstandingServiceFutureStub(channel, callOptions);
          }
        };
    return DocumentUnderstandingServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service to parse structured information from unstructured or semi-structured
   * documents using state-of-the-art Google AI such as natural language,
   * computer vision, and translation.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * LRO endpoint to batch process many documents.
     * </pre>
     */
    default void batchProcessDocuments(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getBatchProcessDocumentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DocumentUnderstandingService.
   *
   * <pre>
   * Service to parse structured information from unstructured or semi-structured
   * documents using state-of-the-art Google AI such as natural language,
   * computer vision, and translation.
   * </pre>
   */
  public abstract static class DocumentUnderstandingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return DocumentUnderstandingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DocumentUnderstandingService.
   *
   * <pre>
   * Service to parse structured information from unstructured or semi-structured
   * documents using state-of-the-art Google AI such as natural language,
   * computer vision, and translation.
   * </pre>
   */
  public static final class DocumentUnderstandingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DocumentUnderstandingServiceStub> {
    private DocumentUnderstandingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentUnderstandingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentUnderstandingServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * LRO endpoint to batch process many documents.
     * </pre>
     */
    public void batchProcessDocuments(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchProcessDocumentsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DocumentUnderstandingService.
   *
   * <pre>
   * Service to parse structured information from unstructured or semi-structured
   * documents using state-of-the-art Google AI such as natural language,
   * computer vision, and translation.
   * </pre>
   */
  public static final class DocumentUnderstandingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DocumentUnderstandingServiceBlockingStub> {
    private DocumentUnderstandingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentUnderstandingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentUnderstandingServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * LRO endpoint to batch process many documents.
     * </pre>
     */
    public com.google.longrunning.Operation batchProcessDocuments(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchProcessDocumentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service
   * DocumentUnderstandingService.
   *
   * <pre>
   * Service to parse structured information from unstructured or semi-structured
   * documents using state-of-the-art Google AI such as natural language,
   * computer vision, and translation.
   * </pre>
   */
  public static final class DocumentUnderstandingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DocumentUnderstandingServiceFutureStub> {
    private DocumentUnderstandingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentUnderstandingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentUnderstandingServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * LRO endpoint to batch process many documents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        batchProcessDocuments(
            com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchProcessDocumentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_PROCESS_DOCUMENTS = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_PROCESS_DOCUMENTS:
          serviceImpl.batchProcessDocuments(
              (com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getBatchProcessDocumentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest,
                    com.google.longrunning.Operation>(service, METHODID_BATCH_PROCESS_DOCUMENTS)))
        .build();
  }

  private abstract static class DocumentUnderstandingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DocumentUnderstandingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DocumentUnderstandingService");
    }
  }

  private static final class DocumentUnderstandingServiceFileDescriptorSupplier
      extends DocumentUnderstandingServiceBaseDescriptorSupplier {
    DocumentUnderstandingServiceFileDescriptorSupplier() {}
  }

  private static final class DocumentUnderstandingServiceMethodDescriptorSupplier
      extends DocumentUnderstandingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DocumentUnderstandingServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DocumentUnderstandingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new DocumentUnderstandingServiceFileDescriptorSupplier())
                      .addMethod(getBatchProcessDocumentsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
