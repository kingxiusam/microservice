package com.dong.cloud.consumer.controller;

import com.dong.cloud.consumer.client.FeignClient;
import com.dong.cloud.consumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\31 0031
 * Time: 19:21
 * ClassName：RibbonController
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
@RestController
public class FeignController {
    @Autowired
    private FeignClient feignClient;

    @GetMapping("/feign/{id}")
    public User findById(@PathVariable("id") Long id){
            return feignClient.findByidFeign(id);
    }

}
