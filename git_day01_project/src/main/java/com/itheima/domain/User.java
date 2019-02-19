package com.itheima.domain;

/**
 * @Description TODO
 * @Author llei
 * @Date 2019/2/19 16:14
 * @Version v1.0.0
 **/
public class User {
    private String name;
    private String password;
    private Integer age;

    private String test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
