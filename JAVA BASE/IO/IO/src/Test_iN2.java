import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test_iN2 {
    public static void main(String[] args) {
        // 字符流的读取
        method();
        method2();
    }

    private static void method() {
        // 创建按对象
        // Reader in=new Reader()是字符流读取的父类，但是是一个抽象类不能new
        try {
            Reader in = new FileReader(new File("./test2.txt"));

            // 开始读取
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(in.read());
            }
            // 释放资源
            in.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    private static void method2() {
        // 创建按对象
        // Reader in=new Reader()是字符流读取的父类，但是是一个抽象类不能new
        try {
            Reader in = new BufferedReader(new FileReader(new File("./test2.txt")));

            // 开始读取
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(in.read());
            }
            // 释放资源
            in.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
