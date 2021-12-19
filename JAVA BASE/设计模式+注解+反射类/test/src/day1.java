import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class day1 {
    //这个类用来测试单例设计模式
    public static void main(String[] args) {
        nani b = nani.test();
        b.nn();

    }
}

class nani {
    //不让外界随意new
    private static nani test = new nani();

    //在类的内部提供一个已经创建好的对象
    public static nani test() {
        return test;
    }

    public void nn() {
        System.out.println("fox");
    }

    private nani() {

    }

    RetentionPolicy a;

}

