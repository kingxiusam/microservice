package com.dong.cloud.service.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:30
 * ClassName：UserApplication
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args){
        SpringApplication.run(UserApplication.class,args);
    }
}
