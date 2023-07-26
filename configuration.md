# 1. springboot 配置
sprintboot有两种配置文件：
1. application.properties
2. application.yml(application.yaml)

当resources同时存在这三个文件时，优先顺序为:
1. application.properties
2. application.yml
3. application.yaml

## 1.1 YAML基本语法
1. 大小写敏感
2. 数据值前边必须有空格，作为分隔符
3. 使用缩进表示层级关系
4. 缩进时不允许使用Tab键，只允许使用空格
5. 缩进的空格数目不重要，只要相同层级的元素左侧对齐即可
6. \# 表示注释
7. ''单引号的字符串，不会识别转义字条，原样输出
8. ""双绰号的字符串，会识别转义字条
9. 参数引用${name}

## 1.2 读取配置
配置文件内容有两种：
1. 自动被springboot识别部分
2. 自定义部分

读取配置内容的有三种方式：
1. @Value <br>
    适合单个值注入
2. Environment <br>
    适合多个值注入
3. @ConfigurationProperties
    对象和配置对象的绑定

## 1.3 profile
在程序开发过程，程序会被安装到不同环境，比如：开发，测试，生产等.
我们需要根据不同的环境，应用不同的配置环境，profile功能就是来进行动态配置切换的
1. profile配置方式
    - 多profile文件方式
      - application-dev.properties
      - application-test.properties
      - application-pro.properties
    - yml多文档方式
      - 在yaml中使用，---分隔不同配置
2. profile激活方式 <br>
    - 配置文件
      - spring.profiles.active=dev
    - 虚拟机参数
      - -Dspring.profiles.active=test1
    - 命令行参数 
      - java -jar xxx.jar --spring.profiles.active=pro1

## 1.4 内部配置加载顺序
Springboot程序启动时，从以下位置加载配置文件，优先级顺序如下：
1. file: `./config/`: 当前项目下的/config目录下
2. file: `./ `: 当前项目的根目录
3. classpath:`./config/`: classpath的config目录
4. classpath:`./`: classpath的根目录

高优先级会覆盖低优先级的相同属性

## 1.5 外部配置加载顺序
https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config