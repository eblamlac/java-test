package com.example.pojo;

public class User {
    public User(){

    }
    private  String name;
    private  Integer age;
    private  userinfo info;
    //提供无参构造函数

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info="+info.test()+
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(userinfo info) {
        this.info = info;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public userinfo getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User(String name, Integer age, userinfo info) {
        this.age = age;
        this.name=name;
        this.info=info;

    }

    //提供有参构造函数
}
