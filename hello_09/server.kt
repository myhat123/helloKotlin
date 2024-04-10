package main

import io.grpc.ServerBuilder

fun main() {
    val server = ServerBuilder.forPort(50051)
        .addService(GreeterService())
        .build()

    server.start()
    println("Server started, listening on port 50051.")

    server.awaitTermination()
}