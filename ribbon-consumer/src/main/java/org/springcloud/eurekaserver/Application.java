package org.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoliang
 * <p>
 * 消费者应用入口类
 * <p>
 * 从服务注册中心获取服务列表，从而使消费者可以知道去何处调用其所需要的服务
 * Spring Cloud Ribbon是一个基于HTTP和TCP的客户端负载均衡工具
 * 可以轻松地将面向服务的rest模板请求自动转换成客户端负载均衡的服务调用
 */
//注册为eureka客户端应用，以获取服务发现的能力
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
