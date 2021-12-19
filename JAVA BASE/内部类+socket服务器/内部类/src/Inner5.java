public class Inner5 {
    //这个类用来测试匿名内部类---内部类没有民资
    //通常结合着匿名对象使用
    public static void main(String[] args) {
        //new Inner1()就相当于创建了一个接口的实现类,需要重写接口里的所有抽象方法


        new Inner1() {
            @Override
            public void save() {
                System.out.println("save");
            }

            @Override
            public void get() {
                System.out.println("get");
            }
        }.get();//触发指定的方法只能干一件事
        new Inner2(){

            @Override
            public void eat() {
                   System.out.println("eat()..");
            }
        }.eat();
    }

}

abstract class Inner2 {
    abstract public void eat();

    public void play() {
        System.out.println("play()");
    }
}

interface Inner1 {
    void save();

    void get();
}

