import java.io.*;

public class readLineTest {
    public static void main(String[] args) throws Exception {
        //这个类用来测试一行一行读取一行一行写出
        //读取一行数据 唯一的方法就是BufferedReader.readLine()
        //读取一行时 灰度去特殊的标记 换行
        BufferedReader in=new BufferedReader(new FileReader("./day1/src/test.txt"));
        String line;
        while((line = in.readLine())!=null){
            System.out.println(line);
        }

    in.close();
        PrintWriter out =new PrintWriter(new FileWriter("./day1/src/test.txt"));
        out.println("hello");
        out.println("java");
        out.close();
    }
}
