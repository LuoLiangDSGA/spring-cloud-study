package org.springcloud.eurekaserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/11/24
 **/
@Service
public class HelloService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCollapser(batchMethod = "helloService", collapserProperties = {@HystrixProperty(name = "timeDelayInMilliseconds", value = "100")})
    public String find() {
        return null;
    }

    /**
     * HystrixCommand：用在依赖的服务返回单个操作结果的时候
     * HystrixObserVableCommand：用在依赖的服务返回多个操作结果的时候
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
    }

    /**
     * 错误处理方法
     *
     * @return
     */
    public String helloFallback() {
        return "hystrix";
    }
}
