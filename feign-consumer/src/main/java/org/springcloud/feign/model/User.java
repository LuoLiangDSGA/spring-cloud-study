package org.springcloud.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author luoliang
 * @date 2017/12/4
 **/
@Data
@AllArgsConstructor
public class User {
    private String name;

    private Integer age;
}
