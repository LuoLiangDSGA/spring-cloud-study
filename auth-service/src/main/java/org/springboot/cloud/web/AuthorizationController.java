package org.springboot.cloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoliang
 * @date 2019/9/12
 */
@RestController
public class AuthorizationController {

    @GetMapping("/authorization")
    public String authorization(String name) {
        return "hello, " + name + ", authorization success";
    }

}
