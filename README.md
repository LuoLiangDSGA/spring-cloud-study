# spring cloud学习项目
### 读书笔记
#### 微服务架构
&emsp;&emsp;简单地说，微服务是系统架构上的这一种设计风格。它的主旨是将一个原本独立的系统拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP的Restful API进行通信协作。被拆分的出来的每一个小型服务都围绕着系统中的某一项或一些耦合度较高的业务进行构建，并且每个服务都维护者自身的数据存储、业务开发、自动化测试案例以及独立部署机制。由于有了轻量级的通信协作基础，所以这些微服务可以使用不用语言编写，实现跨语言调用。
##### 与单体应用的区别
&emsp;&emsp;在以往传统的企业架构中，我们针对一个复杂的业务需求通常使用对象或业务类型来构建一个单体项目。在项目中我们通常将需求分为三个主要部分：数据库、后端、前端。在业务发展初期，由于所有的业务逻辑在一个应用中，开发、测试、部署都还比较容易和方便。但是，随着业务的发展，不断壮大，系统为了应对不同的业务需求会不断地为该单体应用增加不同的业务模块；同时，随着移动端设备的进步，前端展示模块已经不仅仅局限于web形式，这对于系统后端向前端的支持需要更多的接口模块。单体应用由于面对的业务需求更为宽泛，不断扩大的需求会使单体应用变得越来越臃肿。这时候单体应用的问题就凸显出来，单体应用部署在一个进程内，往往我们需要修改一个很小的功能，为了部署上线会影响其他的正常功能的运行。并且，单体应用中的这些功能模块的使用场景、并发量、消耗的资源类型都各有不同，对于资源的利用又互相影响，这样使得我们对各个业务模块的系统容量很难给出较为准确的评估。所以，单体应用在初期虽然可以非常方便地进行开发和使用，但是随着系统的发展，维护成本会越来越大，且难以控制。
<br/>&emsp;&emsp;为了解决单体应用变得庞大臃肿之后产生的难以维护的问题，我们将系统中不同功能模块拆分成多个不同的服务，这些服务都能够独立部署和扩展。由于每个服务都运行在自己的进程中，在部署上有稳固的边界，这样每个服务的更新都不会影响其他服务的运行。同时，由于是独立部署，我们可以更准确地为每个服务评估性能容量，通过配合服务间的协作流程也可以更容易发现系统的瓶颈位置，以及给出较为准确的系统级性能容量评估
#### Spring Cloud
Spring Cloud是一个基于Spring Boot实现的微服务架构开发工具。它为微服务中涉及的配置管理、服务治理、断路器、智能路由、微代理、控制总线、全局锁、决策竞选、分布式会话和集群状态管理等操作提供了一种简单的开发方式。
Spring Cloud包含了多个子项目（针对分布式系统中涉及的多个不同的开源产品，还可能会新增），如下所述：
- Spring Cloud Config：配置管理工具，支持使用Git存储配置内容，可以使用它实现应用配置的外部化存储，并支持客户端信息刷新、加密/解密配置内容等。
- Spring Cloud Netflix：核心组件，对多个Netflix OSS套件进行整合。