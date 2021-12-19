package stack;


import java.util.Scanner;

public class classtets {
  
    public static void main(String[] args) {
        int q1=1;
        Integer a = new Integer(888);
System.out.println(a.toString());
      naniii na=new naniii();
      
      System.out.println(nanii.aa);
         System.out.println(na.aa);
         try {
             err1();
         }catch(Exception qq){
             System.out.println("请输入除0外的整数");
            main(new String[]{"aa"});

        }

    }



    public  static void err1(){
        Scanner my_scanner = new Scanner(System.in);
        int b=my_scanner.nextInt();
        int a=my_scanner.nextInt();
        my_scanner.close();
        System.out.println(a/b);
    
    }
}

class naniii{
public void naniii(int a){
System.out.println("aa");
}

    static{
       System.out.println("老父亲生成中");
    }
    public static String aa="我是父亲";
    public static  void  fu(){
System.out.println(aa);
}
}

class nanii extends naniii{
  public nanii(){
    super();
    String aa1=super.aa;
    }
     public void na(){
        
        System.out.println(aa);
     }
    public static String aa="cao";
}