package com.example.clayawky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
@Controller
@RequestMapping("h1")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String testHello2(){
        System.out.println("hello springmvc~~~~");
        //转向/WEB-INF/page/home.jsp
        return "home";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}