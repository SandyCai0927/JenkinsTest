# JenkinsTest项目开发与介绍
## 一、项目开发
本项目采用`ant`构建，其中包括`build`和`test`两个目标，`build`用来导出程序的完整`jar`包，`test`用来对程序进行测试。将开发的项目上传到此仓库：https://github.com/SandyCai0927/JenkinsTest.git ，其中每个开发者各自建立一个分支。

## 二、项目测试
本项目使用`Jenkins`进行持续集成测试，利用`ant`进行项目构建，在`test`目标集中，包含单元测试，以及自底向上和自顶向下的集成测试，并且设定每两小时自动构建一次。

## 三、项目缺陷管理
本项目的缺陷管理工具使用的是`Git`自带的`Git Issue`，进入`Git`的代码仓库中，点击`Issue`进入可以看见分配给自己的任务，在`Jenkins`中完成测试任务后，如果发现BUG，那么就在`Issue`中详细阐述缺陷的形式，出现位置，原因，以及如何修复BUG，在完成重新测试后，提交新的测试记录，如果成功修复缺陷并在新的测试中没有出现问题，那么就将任务以`已解决`为由锁定。
