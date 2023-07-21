https://www.kotlincn.net/docs/tutorials/command-line.html

编译应用程序
==========

> kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

编译库
=====

> kotlinc hello.kt -d hello.jar

> kotlin -classpath hello.jar HelloKt

注意看jar文件/META-INF/MANIFEST.MF

```
Manifest-Version: 1.0
Created-By: JetBrains Kotlin
Main-Class: HelloKt
```

Main-Class: HelloKt

REPL
====

（读取-求值-输出-循环）是一个交互式运行 Kotlin 代码的工具

直接运行 kotlinc 

```bash
$ kotlinc
Welcome to Kotlin version 1.9.0 (JRE 11.0.18+10)
Type :help for help, :quit for quit
>>> println("hello world")
hello world
>>> println("hello world中国")
hello world中国
>>> 
```

使用第三方包

```bash
$ kotlinc -cp ./libs/joda-time-2.12.5.jar
Welcome to Kotlin version 1.9.0 (JRE 11.0.18+10)
Type :help for help, :quit for quit
>>> import org.joda.time.DateTime
>>> var dt = DateTime()
>>> dt.getYear()
res2: kotlin.Int = 2023
```

