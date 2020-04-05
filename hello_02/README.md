包机制
=====
同级目录 utils.kt 文件中

> package com.mine

这种不要求严格放到对应的目录中，是和java有区别的

构建打包
=======

> kotlinc -include-runtime utils.kt hello.kt -d hello.jar

> java -jar hello.jar