增加 java 源码
=============

src/java/com/mine/Utils.java

App.kt 引入 java 方法调用

```kotlin
import com.mine.Utils
```

> gradle build

> kotlin -cp ./build/libs/hello_05.jar hello_05.AppKt

build.gradle 增加 shadowJar 插件
gradle build之后生成 hello_05-all.jar

> java -jar build/libs/hello_05-all.jar