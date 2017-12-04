package org.springcloud.eurekaserver.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/11/24
 * 服务名不区分大小写
 **/
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("hello")
    String hello();
}
