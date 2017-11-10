package org.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoliang
 * <p>
 * 服务注册者应用入口类
 * <p>
 * 服务提供者，提供服务的应用，可以是SpringBoot应用，也可以是其他技术平台且遵循Eureka通信机制的应用。
 * 它将自己提供的服务注册到Eureka，以供其他应用发现
 */
//通过EnableDiscoveryClient注解，激活Eureka中的DiscoveryClient实现
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    /**
     * 启动服务注册中心后，启动此项目，会在注册中心注册名字为hello-service的微服务
     *
     * 服务提供者在启动的时候会通过发送rest请求的方式将自己注册到Eureka Server上，同时
     * 带上了自身服务的一些元数据信息，Eureka Server接收到这个rest请求之后，将元数据
     * 信息存储在一个双层结构的Map中，其中第一层的key是服务名，第二层的key具体服务的实例名。
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
