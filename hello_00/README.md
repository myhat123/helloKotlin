https://www.kotlincn.net/docs/tutorials/command-line.html

编译应用程序
==========
kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

编译库
=====
kotlinc hello.kt -d hello.jar
kotlin -classpath hello.jar HelloKt

注意看jar文件/META-INF/MANIFEST.MF

Manifest-Version: 1.0
Created-By: JetBrains Kotlin
Main-Class: HelloKt

Main-Class: HelloKt

REPL
====

（读取-求值-输出-循环）是一个交互式运行 Kotlin 代码的工具

直接运行 kotlinc 

$ kotlinc
Welcome to Kotlin version 1.3.70 (JRE 1.8.0_211-b12)
Type :help for help, :quit for quit
>>> println("hello world")
hello world
>>> println("hello world中国")
hello world中国
>>> 