import java.io.IOError;
import java.util.concurrent.atomic.AtomicInteger;

public class tickets {
    public static void main(String[] args) {
        // 创建线程对象
        TicketThread t = new TicketThread();
        TicketThread t2 = new TicketThread();
        t.start();
        t2.start();
        // nani a1 = new nani();
        // nani a2 = new nani();
        // Thread test = new Thread(a1, "test1");
        // Thread test1 = new Thread(a1, "test2");
        // test.start();
        // test1.start();
    }
}

// 使用Atomic 解决多线程的数据不安全性
class nani implements Runnable {
    private final AtomicInteger tickets = new AtomicInteger(100);

    @Override
    public void run() {

        try {
            do {
                Thread.sleep(10);
                // 3.一直卖票
                System.out.println(Thread.currentThread().getName() + "=" + tickets.decrementAndGet());
            } while (tickets.get() > 1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

}

class TicketThread extends Thread {
    static int tickets = 100;
    static Object test = new Object();

    @Override
    public void run() {
        // 如果数据能接受sleep的考验 ，才能说明数据没有了安全隐患
        // 如果方法里的代码通通被同步了，直接把方法用同步修饰 称之为同步方法用的锁对象

        try {
            while (true) {
                synchronized (test) {
                    // 同步代码快 是指 同一时间资源会独占没人抢
                    // 同步锁的位置太大也不行程序的效率太低 太小也不行相当于给自己加了一把锁 从问题发生的位置开始，到结束的位置
                    // 锁对象的要求：多线程之间使用的必须是同一把锁对象 同步代码的锁对象可以是任意对象
                    // synchronized(new Object()){ 不对每个线程之间用了自己的锁 多个线程之前并不是用的同一把锁
                    // 让线程之间使用了同一个o对象
                    // synchronized (this) {
                    sleep(10);
                    // 3.一直卖票
                    System.out.println(getName() + "=" + --tickets);
                    if (tickets <= 1) {
                        break;
                    }
                }
                // }
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }
}
