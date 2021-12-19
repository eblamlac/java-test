public class Interger11{
public static void main(String[] args) {
Integer i1=new Integer(5);//i1的默认值是null
  Integer i2=Integer.valueOf(5);//在128-127范围内效率高，因为相同数据只会存一次
  Integer i3=Integer.valueOf(5);
int i4=Integer.parseInt("11");
 int i5=Integer.parseInt("11");
 System.out.println(i4==i5);
  System.out.println(i2==i3);//true因为静态的valueof，相同的数据只会存一次
//==比较的是两个对象的地址值

  //常用方法
System.out.println(i1.parseInt("8000")+10);
}

}