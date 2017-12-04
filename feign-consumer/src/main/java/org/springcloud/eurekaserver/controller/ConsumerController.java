package org.springcloud.eurekaserver.controller;

import org.springcloud.eurekaserver.model.User;
import org.springcloud.eurekaserver.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/11/8
 * <p>
 * 创建ConsumerController类并实现ribbon-consumer接口，在该接口中，通过Application中创建的RestTemplate来实现对Hello-service服务提供的/hello接口进行调用。
 * 可以看到这里访问的地址是服务名HELLO-SERVICE，而不是一个具体的地址，在服务治理框架中，这是一个非常重要的特性
 **/
@RestController
public class ConsumerController {
    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("LUOLIANG")).append("\n");
        sb.append(helloService.hello("LUOLIANG", 18)).append("\n");
        sb.append(helloService.hello(new User("LUOLIANG", 18))).append("\n");
        return sb.toString();
    }
}
