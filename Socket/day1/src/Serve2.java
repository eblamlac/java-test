import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve2 {
    class HuaWuThread extends Thread {
        //保持通话
        Socket socket;

        public HuaWuThread(Socket socket) {
            this.socket = socket;
        }

        //把业务放入run（） 一直读取客户端发来的数据 并作出回声数据
        @Override
        public void run() {
            super.run();
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                //读取一行BufferedReader 并且写出一行printWriter
                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line);
                    System.out.println("客户端发来的数据是" + line);
                    out.flush();//把数据刷出去
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //这个类用来测试回声案例的服务器端
    //接受客户端的 连接请求
    //给每个客户端分配对应的话务员
    //话务员主要负责和客户端u沟通
    public void serve() {
        //使用多线程提高服务器的执行效率
        new Thread() {
            //在服务器端使多线程开发匿名对象+匿名内部类
            //把业务写道run()中
            @Override
            public void run() {
                super.run();
                try {
                    //在8088端口出等待客户端的连接
                    ServerSocket server = new ServerSocket(8000);
                    System.out.println("服务器启动成功");
                    //接收所有的客户端的连接请求
                    while (true) {
                        Socket nani = server.accept();
                        //给每个客户端分配一个话务员
                        HuaWuThread nani1 = new HuaWuThread(nani);
                        nani1.start();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void main(String[] args) {
        //创建方法 负责1和2和3
        Serve2 s = new Serve2();
        s.serve();
    }
}
