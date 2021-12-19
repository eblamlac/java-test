public class day1 {
    public static void main(String[] args) {
        // 创建Thread对象
        MyThread t = new MyThread();// 怎么执行run()的业务
        t.start();// 启动线程 JVM会自动调用run()的业务

        // 模拟多线程,需要最少2个线程 如果只调用一个线程 叫做单线程程序
        MyThread t2 = new MyThread();
        t2.start();// 使线程从新建转成可运行的状态，等待CPU调度
        //run()和start()的区别就是run()是普通方法 而不是多线程的方法
        // 线程的随机性CPU会自动调度可运行状态的线程们，但是哪个时间片执行哪个线程我们无法控制
        // 0Thread-1
        // 2Thread-0
        // 1Thread-1
        // 3Thread-0
        // 2Thread-1
        // 4Thread-0
        // 3Thread-1
        // 5Thread-0
     

    }

}

class MyThread extends Thread {
    // 自定义多线程类 方式1 extends Thread
    // 在 run() 方法--写业务？输出10次当前的线程名称
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            // getName可以获取正在执行任务的线程名称
            // getNname是Thread的子方法
            System.out.println(i + getName());

        }

    }
}
