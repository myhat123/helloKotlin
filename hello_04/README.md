gradle init 选择 kotlin

```bash
hzg@gofast:~/tutor/helloKotlin/hello_04$ gradle init

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
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 4

Generate multiple subprojects for application? (default: no) [yes, no] 
Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 1

Project name (default: hello_04): 
Source package (default: hello_04): 
Enter target version of Java (min. 7) (default: 11): 
Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] 

> Task :init
To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.2/samples/sample_building_kotlin_applications.html

BUILD SUCCESSFUL in 1m 12s
2 actionable tasks: 2 executed
```

> gradle build
> gradle test

单元测试结果
hello_04/build/reports/tests/test/index.html

> gradle run

gradle build 构建完成之后，并没有包含 kotlin runtime，所以只能用kotlin来运行

> kotlin -cp ./app/build/libs/app.jar hello_04.AppKt

增加shadowJar
============

build.gradle.kts

```kotlin
  id("com.github.johnrengelman.shadow") version "8.1.1"
```

gradle build 之后，生成了
app-all.jar
app.jar

> java -jar app/build/libs/app-all.jar