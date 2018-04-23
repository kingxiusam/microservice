package com.dong.cloud.consumer.service;

import com.dong.cloud.consumer.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\31 0031
 * Time: 16:28
 * ClassName：RibbonService
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
public interface RibbonService {
    public User findOneById(Long id);
}
