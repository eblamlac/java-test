public class Inner4 {
    //这个类用来测试局部内部类
    public static void main(String[] args) {
   //如何使用内部类的资源呢
        new Outer4().show();
    }
}
class Outer4{
    //内部类的位置如果在方法里叫做局部内部类
    public void show(){
        class Inner4{
            String name;
            int age;
            public void eat(){
                System.out.println("Inner4....eat()");
            }
        }
        //想办法使用局部内部类的资源--创建内部类对象
        Inner4 in =new Inner4();
        in.eat();

    }

}
