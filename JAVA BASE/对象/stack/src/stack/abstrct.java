package stack;

public class abstrct {

    public int aa=10;
public static void main(String[] args) {
    Animal a=new dog();
a.eat();

}
}

abstract class Animal{
    abstract public void eat();


}
class dog extends Animal{
@Override
    public void eat(){
System.out.println("小狗吃肉");    
}

}