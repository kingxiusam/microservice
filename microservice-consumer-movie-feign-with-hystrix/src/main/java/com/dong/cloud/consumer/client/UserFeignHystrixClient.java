package com.dong.cloud.consumer.client;

import com.dong.cloud.consumer.HystrixClientFallBack;
import com.dong.cloud.consumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\31 0031
 * Time: 23:24
 * ClassName：FeignClient
 * To change this template use File | Settings | File Templates.
 * Description:Feign webservice客户端接口
 **/
@FeignClient(name = "microservice-provider-user",fallback = HystrixClientFallBack.class)//指定服务名
public interface UserFeignHystrixClient {

    @RequestMapping("/{id}")
    User findByIdFeign(@PathVariable("id") Long id);

}
