import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class test2_Writer {

    public static void main(String[] args) {
        // 这个类用来测试字符流输出数据
        wdnmd.method();
    }

}

class wdnmd {
    public wdnmd() {

    }

    public static void method() {
        // 创建字符输出流对象
        try {
            Writer a = new BufferedWriter(new FileWriter("./test5.txt"));
            // 开始写出数据
            a.write("哈哈");
            // 释放资源
            a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}