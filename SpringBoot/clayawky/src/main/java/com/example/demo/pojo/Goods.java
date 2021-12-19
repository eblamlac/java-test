package com.example.demo.pojo;

import java.util.Date;

/*pojo对象，从此对象中封装从数据库中拿到的信息*/
public class Goods {
private Long id;
private String name;
private String tel;
private String addr;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
