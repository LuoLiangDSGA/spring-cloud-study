package org.springcloud.feign.controller;

import org.springcloud.feign.model.User;
import org.springcloud.feign.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/11/8
 * <p>
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
