package com.example.clayawky;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import org.junit.Test;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class createstateSQL {
    public static void main(String[] args) {
    }
    @Test
    public void clearSQL(Connection conn, Statement stat, ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("清理conn失败？！");
            } finally {
                conn = null;
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("清理stat失败？！");
            } finally {
                stat = null;
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("清理rs失败？！");
            } finally {
                rs = null;
            }
        }
    }

    @Test
    public boolean testInsert(String user, String upwd) {
        System.out.println(user+"???");
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //注册驱动并获取连接
            Class.forName("com.mysql.jdbc.Driver");
            //获取传输器
            conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?useSSL=false",
                    "root",
                    ""
            );
            System.out.println("mysql连接完成");
            //获取传输器
            stat = (Statement) conn.createStatement();
            //发送sql到服务器上执行并且返回结果
            String sql = "select * from user";
            rs = stat.executeQuery(sql);
            //处理资源
            while (rs.next()) {
                String upwd1 = rs.getString("upwd");
                String name = rs.getString("uname");
                if (name.equals(user) && upwd1.equals(upwd)) {
                    this.clearSQL(conn, stat, rs);
                    return true;
                } else {
                    if (!name.equals(user)) {
                        System.out.println("用户名错误？！");
                    } else if (!upwd1.equals(upwd)) {
                        System.out.println("密码错误？！");
                    }
                    this.clearSQL(conn, stat, rs);
                    return  false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
