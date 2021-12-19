package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    //如果当前浏览器发送请求访问当前Servlet如果请求方式为GET请求服务器将会
    //调用doGet方法处理这次请求
    //如果GET和POST方法是一样的业务的话可以直接让DOPOST去调用DOGET方法



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // response.setContentType("text/html");
        // Hello
        //通关response获取一个输出流（这个流可以向浏览器发送数据）
        //如果去想要输出中午你需要加上这行代码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPOST(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    public void destroy() {
    }
}