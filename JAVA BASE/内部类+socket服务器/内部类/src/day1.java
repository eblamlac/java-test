public class day1 {
    public static void main(String[] args) {
        //3创建内部类对象 使用内部类的资源
        //外部类.内部类 比那两名=外部类对象.内部类对象
        Outer.Inner gaga = new Outer().new Inner();

    }
}

class Outer {
    String name;
    private int age;

    public void save() {
        System.out.println("Outer..");
        //外部类如何使用内部类的资源--必须创建内部类对象，通过内部类对象来访问
        Inner in = new Inner();
        in.get();
    }

    //！！特殊成员！！--内部类
    //内部类更具位置不同分为两种 成员内部类（雷利方法外）局部内部类（方法里）
    class Inner {
        int count;

        public void get() {
            System.out.println(name);
            System.out.println(age);
         //内部类可以使用外部类的任何资源
            System.out.println("Inner..get()");
        }
    }
}