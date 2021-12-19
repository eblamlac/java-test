package main;
import java.util.Scanner;
public class Test1_If{
public static void main(String[] args){
    double price =new Scanner(System.in).nextDouble();
    double count =1;
    if (price>=5000){
        count=price * 0.5;
    }else if(price >=2000){
        count=price*0.8;
    }else if(price>=1000){
        count=price*0.9;
    }
   System.out.println("原价是："+price+"折后价是"+count);
}
}