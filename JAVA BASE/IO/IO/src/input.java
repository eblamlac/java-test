import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class input {
    public static void main(String[] args) {
        method();// 字节流读取
        method2();// 高效的字节流读取
    }

    private static void method() {
        try {
            // 床架字节流读取对象
            InputStream in = new FileInputStream(new File("./test2.txt"));
            InputStream in2 = new FileInputStream("./test2.txt");

            // 开始读取
            // System.out.println(in2.read());
            // System.out.println(in2.read());
            // System.out.println(in2.read());
            // System.out.println(in2.read());
            int b;
            while ((b = in2.read()) != -1) {// 有数据就一直读取
                System.out.println(b);
            }
            // 释放资源
            in2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method2() {
        try {

            //BuffedInputStream是高效的读取流原因在于底层维护了一个byte[]
            // 床架字节流读取对象
            InputStream in = new FileInputStream(new File("./test2.txt"));
            InputStream in2 = new BufferedInputStream(new FileInputStream("./test2.txt"));

            // 开始读取

            int b;
            while ((b = in2.read()) != -1) {// 有数据就一直读取
                System.out.println(b);
            }
            // 释放资源
            in2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
