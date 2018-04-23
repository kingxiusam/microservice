package com.dong.cloud.hystrix.model;

/**
 * Created with IntelliJ IDEA.
 * User: huangdong
 * Date: 2018\4\6 0006
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 * Description:实体类
 */
public class User {
    private Long id;
    private String username;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
