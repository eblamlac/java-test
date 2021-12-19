import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class String11 {
    public static void main(String[] args) {
        char value[]={'A','b','C'};
        String s1=new String(value);//特点1字符串底层维护了一个char[],存放在内存堆中
        String s2="abc";//底层也会new String()存放在内存的堆的常量池中，效率高相同元素只会存放一次
        //2常用方法
        System.out.println(s1.charAt(1));
        System.out.println(s2.concat("aaa"));
        System.out.println(s2.endsWith("c"));
    }
    
}
