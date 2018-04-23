package com.dong.cloud.consumer;

import com.dong.cloud.consumer.client.UserFeignHystrixClient;
import com.dong.cloud.consumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: huangdong
 * Date: 2018\4\6 0006
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class HystrixClientFallBack implements UserFeignHystrixClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallBack.class);


    @Override
    public User findByIdFeign(Long id) {
        LOGGER.info("服务调用发生异常，正在执行feign-hystrix的fallback方法，接收的参数：id={}",id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return  user;
    }
}
