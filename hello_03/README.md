包机制
=====
utils.kt文件放到对应的 com/mine 目录中

构建打包
=======

> kotlinc -include-runtime com/mine/utils.kt hello.kt -d hello.jar

> java -jar hello.jar