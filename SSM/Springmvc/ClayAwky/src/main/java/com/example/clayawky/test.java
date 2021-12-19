package com.example.clayawky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;
import java.lang.reflect.Method;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * 如果说有 @RequestMapping的value是重复
 * 那么就会导致浏览器返回500的错误
 * 如果Controller类上没有通过@RequstMapping神功访问的路径当前方法上
 * 声明的访问路径
 * **/
@Controller
@RequestMapping("h2")
public class test extends  HttpServlet{
    /**
     * 注解中/hollo就是hello方法映射路径
     * 当浏览器放问/hello就会执行testHello方法
     *
     * **/
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String testHello(){
    System.out.println("hello springmvc~~~~");
    //转向/WEB-INF/page/home.jsp
    return "home";
    }
    /*
    * 简单类型参数绑定
    * 浏览器请求../testParam1?name=张飞&age=20&add=北京
    * 通过SpringMvc获取请求中name age  addr参数的值
    *获取参数时（1）方法上形参的类型要和接收的参数类型保持一致
    * （2）方法上形参的名字要和接收的参数的名字保持一致
    * */
    @RequestMapping("/testParam1")
    public String testParam1(String name ){
    System.out.println("name="+name);
        return  "home";
    }

/*
* 包装类型参数的绑定
* 如果请求参数比较多可以使用包装对象来接收请求中的参数
* 声明一个User类在User类中声明name ,age ,addr三个属性 并且提供对应的Get和set方法
* */
    @RequestMapping("/testParams2")
    public String testParam2(User user){
        System.out.println(user.getAddr());
        return "home";
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
    public static void main(String[] args) {
    }
    public void destroy() {
    }


}
