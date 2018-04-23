package com.dong.cloud.hystrix.controller;

import com.dong.cloud.hystrix.model.User;
import com.dong.cloud.hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: huangdong
 * Date: 2018\4\6 0006
 * Time: 20:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable("id")Long  id){
        return ribbonHystrixService.findById(id);
    }
}
