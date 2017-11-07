package org.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoliang
 * <p>
 * 应用入口类
 */
//通过EnableDiscoveryClient注解，激活Eureka中的DiscoveryClient实现
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerApplication {
    /**
     * 启动服务注册中心后，启动此项目，会在注册中心注册名字为hello-service的微服务
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
