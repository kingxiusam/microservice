package com.dong.cloud.service.provide.dao;

import com.dong.cloud.service.provide.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:20
 * ClassName：UserRepository
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
