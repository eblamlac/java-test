public class Inner {
    //这个类用来测试成员内部类被private修饰
    public static void main(String[] args) {
     //怎么使用内部类Inner2的资源
       // Outer2.Inner2 oi =new Outer2().new Inner2();
        Outer2 out=new Outer2();
        out.show();
    }
}
class Outer2{
    //提供公共的show()调用内部类的eat()
    public void show(){
        Inner2 in =new Inner2();
        in.eat();
    }
    //成员位置的内部类-成员内部类
 private  class Inner2{
        public void eat(){
            System.out.println("Inner2...get");
        }
    }
}

