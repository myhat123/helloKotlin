参考

https://github.com/grpc/grpc-kotlin/issues/386

依赖包
======

grpc-kotlin-stub-1.4.1.jar
grpc-protobuf-1.62.2.jar
protobuf-kotlin-4.26.1.jar
grpc-stub-1.62.2.jar
grpc-netty-1.62.2.jar
protobuf-java-4.26.1.jar
grpc-core-1.62.2.jar
grpc-api-1.62.2.jar
guava-33.1.0-jre.jar
annotations-api-6.0.53.jar
grpc-netty-shaded-1.62.2.jar
grpc-protobuf-lite-1.62.2.jar

还需要protoc插件

protoc 26.1

https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-kotlin/

protoc-gen-grpc-kotlin-1.4.1-jdk8.jar

https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.62.2/

protoc-gen-grpc-java-1.62.2-linux-x86_64.exe

生成代码
=======

> protoc --plugin=protoc-gen-grpckt=protoc-gen-grpc-kotlin.sh --kotlin_out=. --java_out=. --grpckt_out=. --proto_path="." helloworld.proto

> protoc --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java-1.62.2-linux-x86_64.exe --grpc-java_out=.  --proto_path="." helloworld.proto

编译
====

> javac -cp ./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar com/example/helloworld/Helloworld.java

> javac -cp ./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/guava-33.1.0-jre.jar:./libs/annotations-api-6.0.53.jar:. com/example/helloworld/GreeterGrpc.java

> kotlinc -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:. helloworld.kt server.kt com/example/helloworld/HelloReplyKt.kt com/example/helloworld/HelloRequestKt.kt com/example/helloworld/HelloworldKt.kt com/example/helloworld/HelloworldGrpcKt.kt -d helloworld.jar

> kotlinc -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./helloworld.jar:. server.kt -d server.jar

运行
====

> kotlin -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/guava-33.1.0-jre.jar:./libs/annotations-api-6.0.53.jar:./libs/grpc-netty-shaded-1.62.2.jar:./libs/grpc-protobuf-lite-1.62.2.jar:./helloworld.jar:./server.jar:. main.ServerKt

java单独打包
===========

java代码编译后，单独打一个jar包

> javac -cp ./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar -d ./classes com/example/helloworld/Helloworld.java 

> javac -cp ./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/guava-33.1.0-jre.jar:./libs/annotations-api-6.0.53.jar:./classes -d ./classes com/example/helloworld/GreeterGrpc.java

> jar cvf libs/utils.jar -C ./classes com/example/helloworld

> kotlinc -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/utils.jar helloworld.kt com/example/helloworld/HelloReplyKt.kt com/example/helloworld/HelloRequestKt.kt com/example/helloworld/HelloworldKt.kt com/example/helloworld/HelloworldGrpcKt.kt -d helloworld.jar

> kotlinc -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/utils.jar:./helloworld.jar server.kt -d server.jar

> kotlin -cp ./libs/grpc-kotlin-stub-1.4.1.jar:./libs/grpc-protobuf-1.62.2.jar:./libs/protobuf-kotlin-4.26.1.jar:./libs/grpc-stub-1.62.2.jar:./libs/grpc-netty-1.62.2.jar:./libs/protobuf-java-4.26.1.jar:./libs/grpc-core-1.62.2.jar:./libs/grpc-api-1.62.2.jar:./libs/guava-33.1.0-jre.jar:./libs/annotations-api-6.0.53.jar:./libs/grpc-netty-shaded-1.62.2.jar:./libs/grpc-protobuf-lite-1.62.2.jar:./libs/utils.jar:./helloworld.jar:./server.jar:. main.ServerKt