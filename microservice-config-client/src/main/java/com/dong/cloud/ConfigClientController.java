package com.dong.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：ConfigClientController
 * 功能：
 * 详细：
 * 作者: huangdong
 * 修改日期：2018\4\23 0023
 * 说明：
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String sayHello(){
        return this.profile;
    }
}
