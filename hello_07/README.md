运行环境
=======

* inceptor-driver.jar
* tomlj-1.1.0.jar
* antlr4-runtime-4.11.1.jar

kotlin jdbc
===========

inceptor-driver.jar 连接inceptor的jdbc驱动

> kotlinc -cp ./libs/inceptor-driver.jar:./libs/tomlj-1.1.0.jar hello.kt -d hello.jar

> kotlin -classpath ./libs/inceptor-driver.jar:./libs/tomlj-1.1.0.jar:./libs/antlr4-runtime-4.11.1.jar:hello.jar HelloKt