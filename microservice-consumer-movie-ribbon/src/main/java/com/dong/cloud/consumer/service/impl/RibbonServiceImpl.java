package com.dong.cloud.consumer.service.impl;

import com.dong.cloud.consumer.model.User;
import com.dong.cloud.consumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\31 0031
 * Time: 16:29
 * ClassName：RibbonServiceImpl
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
@Service
public class RibbonServiceImpl implements RibbonService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public User findOneById(Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
    }
}
