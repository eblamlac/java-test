import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class socketTest {
    public static void main(String[] args) throws Exception {
        Serve s = new Serve();
        Client c = new Client();
        s.start();
        c.start();
    }
}

class Serve extends Thread {
    public void run() {
        //启动服务器 并且在8088端口  等待客户端链接
        ServerSocket server = null;
        try {
            server = new ServerSocket(8088);
            //接受客户端的链接请求
            Socket socket = server.accept();
            //接收客户端发来的数据
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.write("server-world".getBytes(StandardCharsets.UTF_8));
            int len=0;
            while ((len=in.read())!=-1) {
                // int b = in.read();这样子是把字符转成数字了
                char c = (char) len;
                System.out.print(c);
            }
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Client extends Thread {
    public void run() {
        {
            //指定要链接的服务器  并同事指定服务器的ip地址(如果是本机ip地址是固定值)
            Socket socket = null;
            try {
                socket = new Socket("127.0.0.1", 8088);
                //获取输出流并给服务器发送hello
                OutputStream out = socket.getOutputStream();
                out.write("client-hello".getBytes(StandardCharsets.UTF_8));
                //给服务器发送hello
                InputStream in = socket.getInputStream();
                int len=0;
                while ((len=in.read())!=-1) {
                    // int b = in.read();这样子是把字符转成数字了
                    char c = (char) len;
                    System.out.print(c);
                }
                in.close();
                out.close();
                //释放资源
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}