package com.dong.cloud.service.provide.service;

import com.dong.cloud.service.provide.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:37
 * ClassName：UserService
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
public interface UserService {
    User findById(Long id);
}
