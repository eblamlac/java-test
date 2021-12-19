package com.example.com.example.controller;
//模拟表现层
import com.example.service.EmpService;
import com.example.service.EmpServicelmpl;
import org.junit.Test;
import com.example.factory.slover;
/**
 * controller-->service-->dao
 *
 * **/
public class Empcontroller {
    private EmpService service=(EmpService)slover.getBean("EmpService");
    @Test
    public void testAddEmp(){

        System.out.println("调用service层的方法添加员工信息");
        service.addEmp();
    }
}
