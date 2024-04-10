package main

import com.example.helloworld.GreeterGrpcKt
import com.example.helloworld.Helloworld.HelloReply
import com.example.helloworld.Helloworld.HelloRequest
import io.grpc.stub.StreamObserver

class GreeterService : GreeterGrpcKt.GreeterCoroutineImplBase() {
    suspend fun sayHello(request: HelloRequest, responseObserver: StreamObserver<HelloReply>) {
        val reply = HelloReply.newBuilder()
            .setMessage("Hello, ${request.name}!")
            .build()

        responseObserver.onNext(reply)
        responseObserver.onCompleted()
    }
}