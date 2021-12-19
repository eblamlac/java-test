import java.io.IOError;

public class runaanbletest {
    public static void main(String[] args) {
        try {

            // 这个类用来测试多线程编程方式2
            MyRunnable nani = new MyRunnable();
            MyRunnable nani1 = new MyRunnable();
            Thread a = new Thread(nani, "线程0");
            Thread a1 = new Thread(nani1, "线程1");
            Thread a2 = new Thread(nani1, "线程2");
            Thread a3 = new Thread(nani1, "线程3");
            Thread a4 = new Thread(nani1, "线程4");
            Thread a5 = new Thread(nani1, "线程5");
            Thread a6 = new Thread(nani1, "线程6");
            Thread a7 = new Thread(nani1, "线程7");
            Thread a8 = new Thread(nani1, "线程8");
            Thread a9 = new Thread(nani1, "线程9");
            a.start();
            a1.start();
            a2.start();
            a3.start();
            a4.start();
            a5.start();
            a6.start();
            a7.start();
            a8.start();
            a9.start();

        } catch (Error e) {

        }

    }
}

// 自定义多线程类 方式2：implements Runnable
class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("开始" + Thread.currentThread().getName()+"----"+System.currentTimeMillis());
        // TODO Auto-generated method stub'
        for (int i = 0; i < 10; i++) {
            // 想要获取现在正在执行业务等待线程名称
            System.out.println(Thread.currentThread().getName() + "=" + i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("结束" + Thread.currentThread().getName()+"----"+System.currentTimeMillis());
    }

}
