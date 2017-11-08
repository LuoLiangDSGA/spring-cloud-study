package org.springcloud.eurekaserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/11/7
 **/
@RestController
@Slf4j
public class HelloController {
    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());

        return "Hello World";
    }
}
