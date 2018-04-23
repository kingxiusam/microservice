package com.dong.cloud.service.provide.service.impl;

import com.dong.cloud.service.provide.dao.UserRepository;
import com.dong.cloud.service.provide.model.User;
import com.dong.cloud.service.provide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:38
 * ClassName：UserServiceImpl
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public User findById(Long id){
        User user = userRepository.findOne(id);
        return user;
    }


}
