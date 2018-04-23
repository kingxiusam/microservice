package com.dong.cloud.hystrix.service;

import com.dong.cloud.hystrix.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: huangdong
 * Date: 2018\4\6 0006
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    private Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
        return restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
    }

    public User fallback(Long id){
        LOGGER.info("服务调用发生异常，正在执行ribbon-hystrix的fallback方法，接收的参数：id={}",id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return  user;
    }
}

