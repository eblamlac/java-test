import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
/*
* String a="qdqdq";
* String b(){
* }
* String[] y={a,"5","8"};
* String [9]={}
* a----->b-----c------->d
* int[]={0,1}
* y[3]
*[1，2，3，5]
* 0，1，2，3
* */
public class IO {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        File file = new File("../String/Stringtest/src/test.txt");
        String[] test={};
        String[] te={"a","b"};
        test[0]="yeye";
        // 调用常用方法
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        // 创建、删除

        file = new File("./bin");
  // 创建不存在的文件
  System.out.println("纳尼");
          System.out.println(file.getName());
          System.out.println(file.getPath());
        file = new File("./test2");
        System.out.println(file.mkdir());// 创建不存在的单机文件夹
        file = new File("./test1/q/v");
        System.out.println(file.mkdirs());// 创建不存在的多级文件夹

        System.out.println(file.delete());// 删除文件或者删除空的文件夹
        file=new File("./test1");
        String names[] = file.list();
        System.out.println(Arrays.toString(names));//列出文件夹中所有的文件名称
        File fs[]=file.listFiles();
        System.out.println(Arrays.toString(fs));//列出文件夹中所有文件的文件对象

    }
}
