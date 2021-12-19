package com.example.pojo;

public class userinfo {
    private String job="无头程序员";
    public String  test(){
        return "纳尼";
    }
    @Override
    public String toString() {
        return "userinfo{" +
                "job='" + job + '\'' +
                '}';
    }
}
