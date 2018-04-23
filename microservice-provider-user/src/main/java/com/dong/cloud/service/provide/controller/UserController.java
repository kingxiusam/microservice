package com.dong.cloud.service.provide.controller;

import com.dong.cloud.service.provide.model.User;
import com.dong.cloud.service.provide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:35
 * ClassName：UserController
 * To change this template use File | Settings | File Templates.
 * Description:c测试服务实例的相关内容为后面的服务做准备
 **/
@RestController
public class UserController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id")Long id){
        User user = userService.findById(id);
        return user;
    }

    @GetMapping("/instance-info")
    public ServiceInstance getInstanceInfo(){
        ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }


}
