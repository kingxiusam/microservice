package com.dong.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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
public class MovieRibbonApplication {

    /***实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.*
     @return restTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(MovieRibbonApplication.class,args);
    }

}
