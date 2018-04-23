package com.dong.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 类名：ConfigServerApplication
 * 功能：
 * 详细：
 * 作者: huangdong
 * 修改日期：2018\4\23 0023
 * 说明：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
