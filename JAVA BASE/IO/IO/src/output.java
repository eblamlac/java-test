import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class output {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 这个类用来册数字节输出流
        method();// 使用普通的字节输出流对象输出数据

        method2();//使用高级的字节流输出数据
    }

    private static void method() throws FileNotFoundException, IOException {
        // 创建输出流对象
        // OutputStream out=new OutputStream();抽象类无法创建对象
        OutputStream out = new FileOutputStream(new File("./test2.txt"));
        try {

            // 开始写出数据
            out.write(121);
            // 释放资源
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

    }

    private static void method2() throws FileNotFoundException, IOException {
        // 创建高级输出流对象
        // OutputStream out=new OutputStream();抽象类无法创建对象
        OutputStream out = new BufferedOutputStream(new FileOutputStream(new File("./test2.txt")));
        try {

            // 开始写出数据
            out.write(111);
            out.write(121);
            out.write(131);
            // 释放资源
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

    }

}
