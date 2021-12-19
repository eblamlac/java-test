import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {

    }

}

class serve {
    //这个类用来标识Socket编程的服务器端
    //启动服务器
    //接受客户端的连接请求
    //接收客户端发来的数据
    public serve() throws Exception {
        ServerSocket serve = new ServerSocket(8000);
        //启动服务器在8000端口等待客户端的连接
        Socket socket=serve.accept();
        //接收客户端的连接请求并且建立数据通信通道
        //接收客户端发来的数据
    }
}

class client {
    //这个类用来标识Socket编程客户端
    //指定要连接的服务器
    //给服务器发送hello
    public client() throws Exception {
        Socket socket = new Socket("127.0.0.1", 8000);

    }

}