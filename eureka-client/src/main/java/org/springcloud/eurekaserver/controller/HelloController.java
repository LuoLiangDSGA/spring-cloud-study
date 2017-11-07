package org.springcloud.eurekaserver.controller;

import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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


}
