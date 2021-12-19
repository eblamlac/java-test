package com.example.dao;

public class EmpDaolmpl implements  EmpDao{
    @Override
    public void addEmp(){
         System.out.println("dao层的addEmp 方法执行了..成功的保存了一条员工信息");
    }
}
