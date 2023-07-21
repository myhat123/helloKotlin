第一种方式
========

> kotlinc utils.kt        #生成 UtilsKt.class

> kotlinc -cp . hello.kt  #生成 HelloKt.class

> kotlin -cp . HelloKt    #未包含kotlin runtime，所以运行kotlin

第二种方式
========

> kotlinc utils.kt -d utils.jar

> kotlinc -classpath utils.jar hello.kt -d hello.jar

#未包含kotlin runtime，所以运行kotlin

> kotlin -classpath utils.jar:hello.jar HelloKt    

第三种方式
========

> kotlinc utils.kt -d utils.jar

> kotlinc -classpath utils.jar -include-runtime hello.kt -d hello.jar

> java -classpath utils.jar:hello.jar HelloKt

分离jar包

第四种方式
========

> kotlinc -include-runtime utils.kt hello.kt -d hello.jar

> java -jar hello.jar

第四种方式，应该是最简练的方式

kotlin 1.9.0，include-runtime 命令参数，可以不用了。