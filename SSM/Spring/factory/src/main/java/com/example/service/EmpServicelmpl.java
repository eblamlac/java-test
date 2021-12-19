package com.example.service;

import com.example.dao.EmpDao;
import com.example.dao.EmpDaolmpl;

public class EmpServicelmpl implements EmpService {
    private EmpDao dao =new EmpDaolmpl();
    @Override
    public void addEmp(){
        System.out.println("调用dao层的方法添加员工信息");
        dao.addEmp();
    }
}
