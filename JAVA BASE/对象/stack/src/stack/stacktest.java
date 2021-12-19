package stack;

import java.util.Stack;

class nani1 {
    
    {
        System.out.println("构造代码块执行成功");

    }

    static {
        System.out.println("静态代码块执行成功");
        String nani2 = "静态代码";
    }

    static void nani4() {
        String nani5 = nani3;
         Double a=new Double(2.0);
         Double b=2.0D;
        System.out.println(a.equals(b)+"aa");

    }

    public nani1() {
       Object test =new Object();
      
    
        System.out.println("构造代码执行成功");
        System.out.println("测试static");
        String aaa = nani3;
    }

    public static String nani3 = "我是成员变量静态";
}

public class stacktest {
    public static String a = "nn";
    public String c = "nn";

    public static void main(String[] args) {


        a1();
        nani1 na = new nani1();

        nani1 na1 = new nani1();
        nani1.nani4();
    }

    public static void a2(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push("b");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(a);
        System.out.println(args.length + "aaaaaaaaaaaaaaaaaaa" + args[1]);
    }

    public static void a1() {
        String[] test = { "aaa", "sbsbsbsbsb" };
        a2(test);
        new nani();

    }
}

class nani {
    public nani() {
        System.out.println("构造函数触发");
    }
}
