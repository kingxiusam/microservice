package com.dong.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\31 0031
 * Time: 23:05
 * ClassName：MovieFeignApplication
 * To change this template use File | Settings | File Templates.
 * Description: 声明式webservice客户端
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MovieFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(MovieFeignApplication.class,args);
    }
}
