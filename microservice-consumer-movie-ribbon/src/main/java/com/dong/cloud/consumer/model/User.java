package com.dong.cloud.consumer.model;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\30 0030
 * Time: 11:22
 * ClassName：User
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
public class User {

    private Long id;

    private String username;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
