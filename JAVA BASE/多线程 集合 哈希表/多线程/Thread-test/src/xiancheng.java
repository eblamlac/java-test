import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class xiancheng {
    public static void main(String[] args) {
        nani1 a = new nani1();
/*        Thread test=new Thread(a,"fox-1");
        Thread test1=new Thread(a,"fox-2");
        test.start();
        test1.start();*/
        //把新建线程启动线程，关闭线程的任务交给线程池来处理ExecutorService
        //Executors用来辅助创建线程池对象,newFixedThreadPool()创建具有固定线程数的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //让线程池执行任务
        for (int i = 0; i < 5; i++) {
            pool.execute(a);
        }
    }
}

class nani1 implements Runnable {
    nani1() {
    }

    ;
    static int test = 100;
    @Override
    synchronized public void run() {
        try {
            while(true){
                if(test<=0){
                    break;
                }
                Thread.sleep(10);

                System.out.println(Thread.currentThread().getName() + "-----" + test--);

            }
        } catch (InterruptedException i) {


        }
    }
}