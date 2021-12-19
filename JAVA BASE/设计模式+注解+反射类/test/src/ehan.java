public class ehan {
    //这个类用来实现懒汉式--面试重点
    public static void main(String[] args) {

    }
}

class mysingle {
    private mysingle() {
    };
    //在类的内部创建好对象 --延迟加载
    private static mysingle a;
    //问题：程序种又共享资源my 并且又多条语句（3）条 操作了共享资源，此时my共享资源一定会存在多线程变成的数据安全隐患
    //解决方案就是加同步锁
    //如果使用同步代码块需要确定锁的位置 锁的对象，由于方法种的所有代码都被同步了，可以之间变成同步方法
    //延迟加载思想，是指不会在第一时间把对象创建好来占用内存，而是什么时候用什么时候创建


    synchronized static public mysingle get() {
        //静态区域内，不能用this关键词，因为加载的先后顺序问题
        //  synchronized (this) {
        if (a == null) {
            a = new mysingle();
        }
        return a;
        //}
    }
}
