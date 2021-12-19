import org.junit.Test;

import java.io.File;
//文件模块
/*
*
* {
*
* readir(),
* mkdir(),
* rmdir(),
*
*
*
* }
*
*
* */
/*
*
* float 0.1+0.1=0.2
* 0.2.000000000000003
* 0.20
*
* 1024b=1kb1024kb=1mb 1mb
*String  ""
* int  8  ,10,20,340,
* long
* float 8.23345563  3.4
* double
* String "就会放弃"
* String a="10"
* jvm java /kolin
* int a=8
* String b="qgquidguq"
* boolean false ，true
*
*
*对象！！！！！
*
* oop面向对象的思想
*test.a
*  test a= new test("igqguqhu");
* a-> #x0642f-------栈内存->指针--->堆内存->「 a=10 」
* a.test1();
* a.a
* class test{
* static int a=10
*
* public void test(String a){
*int b=1;
* b+1;
* }
*   int a=10
*   test1(){
* int a=1
* a+1
* }
*
*
* }
*
*
*
*  */





import java.math.BigDecimal;



public class IOtest {

    static File file1 = new File("/Users/chenyuxi/Desktop/block");


    public static void main(String[] args) {
      test1 a=new test1();
        BigDecimal bd2 = new BigDecimal(1024);
        BigDecimal bd3 = new BigDecimal(filesize(file1, 0, 0));
        System.out.println(bd3 + "b");
    }


    public static long filesize(File file, int b, long a) {
        File fs[] = file.listFiles();
        if (b <= fs.length - 1) {
            if (fs[b].isFile()) {
                a += fs[b].length();
                b++;
                return filesize(file, b, a);
            } else if (fs[b].isDirectory()) {
                a += filesize(fs[b], 0, 0);
                b++;
                return filesize(file, b, a);
            }
        }
        return a;

    }
}
class test1{
    int a=20;
    public test1(){
    }
   static  int bb=0;
   static int aa=10;
    static void bbb(){

   }
   /**
    *
    *string b= a.test()
    *
    *  #0x86iqiq--->  --f()    test(
    * */


}
