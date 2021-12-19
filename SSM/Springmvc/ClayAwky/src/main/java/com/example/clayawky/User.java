package com.example.clayawky;
/*
* 这个类用来封装用户信息
* */
public class User {
    private  String name;
    private  Integer age;

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private  String addr;
}
