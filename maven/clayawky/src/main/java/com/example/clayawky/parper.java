package com.example.clayawky;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet(name = "sql", value = "/sqltest")
public class parper extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html;charset=utf-8");
        // Hello
        try {
            PrintWriter out = response.getWriter();
            System.out.println(request.getParameter("uname"));
            out.println(login(request.getParameter("uname"), request.getParameter("upwd")));
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(request.getParameter("uname"));
            return;
        }
        //connect mysql
    }

//    //模拟用户登录
//    public static void testmysql() {
////提示用户登录
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请登录")
//        ;
//        System.out.println("请输入用户名");
//        String user=sc.nextLine();
//        //提示用户输入密码并接收密码
//        System.out.println("请输入密码");
//        //提示用户输入用户名或者接收用户名
//        String ped=sc.nextLine();
//        //调用Login方法实现登录
//        login(user,ped);
//        sc.close();
//    }

    private static int login(String user, String ped) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            createstateSQL sql = new createstateSQL();
            if (sql.testInsert(user, ped)) {
                return 1;
            }else{
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}











