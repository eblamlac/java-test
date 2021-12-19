import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client2 {
    //这个类用来测试回声案例的客户端
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 8000);
            while (true) {
                PrintWriter out = new PrintWriter(new OutputStreamWriter(
                        socket.getOutputStream()
                ));
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()
                        )
                );
                String input = new Scanner(System.in).nextLine();
                System.out.println("您输入的数据是"+input);
                out.println(input);
                out.flush();
                String line = in.readLine();
                System.out.println("服务器的回声数据是：" + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //连接指定的服务器
    //一直给服务器发送数据
    //一直收服务器回声的数据
}
