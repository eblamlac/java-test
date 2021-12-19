package com.example.haha;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
List a=new LinkedList();;
    private String message;
    public  void mysql() throws Exception {
        //注册数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("????");
        //获取数据库连接
        Connection aa = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/user?useSSL=false",
                "root", "");
        System.out.println("mysql连接完成");
        //获取传输器
        Statement stat = aa.createStatement();
        //发送sql到服务器上执行并且返回结果
        String sql = "select * from emp";
        ResultSet rs = stat.executeQuery(sql);
        //处理资源
        while (rs.next()) {
            int sex = rs.getInt("sex");
            String name = rs.getString("ename");
            System.out.println(sex + name);
            a.add(name);

        }
        //释放结果
        rs.close();
        stat.close();
        aa.close();
    };
    public void init() {
        message = "Hello World1!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        // Hello
        try {
            mysql();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //connect mysql
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        Iterator nn= this.a.iterator();
         while(nn.hasNext()) {
             out.println("<h1>" + nn.next() + "</h1>");
         }
        out.println("</body></html>");
         out.flush();
         out.close();
    }
    public void destroy() {

    }
}