public class Inner3 {
    public static void main(String[] args) {
     //new Out3.Inner3().show();
    Out3.Inner3 oi =new Out3.Inner3();
    oi.show();
    }
}
//创建类
class Out3{
    //1内部类被static修饰 并不常用浪费内存
   static class Inner3{
        public void show(){
            System.out.println("Inerr3...show");
        }
    }
}
