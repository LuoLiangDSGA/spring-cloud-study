package org.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luoliang
 * <p>
 * 应用入口类
 *
 * Eureka服务注册中心，提供服务注册与发现功能
 *
 * 如果有多个服务注册中心，当服务提供者发送注册请求到一个服务注册中心时，他会将请求转发
 * 给集群中相连的其他注册中心，从而实现注册中心之间的服务同步。通过服务同步，两个服务提供者
 * 的服务信息就可以通过这两台服务注册中心的任意一台获取到
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
