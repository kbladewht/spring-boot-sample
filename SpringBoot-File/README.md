# Spring Boot 实现文件上传下载

文件的上传及下载功能是开发人员在日常应用及编程开发中经常会遇到的。正好最近开发需要用到此功能，虽然本人是 Android 开发人员，但还是业余客串了一下后台开发。

在本文中，您将学习如何使用 Spring Boot 实现 Web 服务中的文件上传和下载功能。首先会构建一个 REST APIs 实现上传及下载的功能，然后使用 Postman 工具来测试这些接口，最后创建一个 Web 界面使用 JavaScript 调用接口演示完整的功能。最终界面及功能如下：

![show_demo.png](https://i.loli.net/2019/03/29/5c9e3f3eeb13c.png)


## 一、项目构建

### 1.1 项目环境
    
    - Spring Boot : 2.1.3.RELEASE
    - Gredle : 5.2.1
    - Java : 1.8
    - Intellij IDEA : 2018.3.3

### 1.2 项目创建
    
开发环境为 Intellij IDEA，项目创建很简单，按照下面的步骤创建即可：
    
    1. File -> New -> Project...
    2. 选择 **Spring Initializr**，点击 Next
    3. 填写 Group (项目域名) 和 Artifact (项目别名)
    4. 构建类型可以选择 Maven 或 Gradle， 看个人习惯
    5. 添加 **Web** 依赖
    6. 输入项目名称及保存路径，完成创建
    
项目创建完毕之后就可以进行开发，项目的完整结构如下图所示：


    
    
## 二、参数配置

## 三、创建接口

## 四、接口测试

## 五、Web 界面

## 六、总结