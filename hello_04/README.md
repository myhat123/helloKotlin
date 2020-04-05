gradle init 选择 kotlin

```bash
hzg@gofast:~/work/helloKotlin/hello_04$ gradle init
Starting a Gradle Daemon (subsequent builds will be faster)

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Swift
Enter selection (default: Java) [1..5] 4

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Kotlin) [1..2] 1

Project name (default: hello_04): 
Source package (default: hello_04): 

BUILD SUCCESSFUL in 24s
2 actionable tasks: 2 executed
```

> gradle build
> gradle test

单元测试结果
hello_04/build/reports/tests/test/index.html

> gradle run

gradle build 构建完成之后，并没有包含 kotlin runtime，所以只能用kotlin来运行

> kotlin -cp ./build/libs/hello_04.jar hello_04.AppKt

增加shadowJar
============
build.gradle

```groovy
id "com.github.johnrengelman.shadow" version "5.2.0"
```

gradle build 之后，生成了
hello_04-all.jar
hello_04.jar

> java -jar build/libs/hello_04-all.jar