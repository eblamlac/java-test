package com.example.spring;

import com.example.pojo.User;
import com.example.service.EmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//这个类来测试spring的IOC功能
//通过spring容器创建EmpService和EmpDao接口的子类实例
public class SpringTest {  //获取spring容器的对象
    private  static ClassPathXmlApplicationContext as;
    static{//初始话ac变量
        as=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void  testIOC(){
       EmpService service= (EmpService)as.getBean("empService1");
        EmpService service1= (EmpService)as.getBean("empService1");
        if(service==service1){
            System.out.println("bean是单列设计模式");
        }else{
            System.out.println("bean是多列设计模式");
        }
        System.out.println(service);
    }
    //这个测试类用来测试spring bean对象的单实例和多实例
    /**
     * 单实例 Spring容器从始只会为该类创建一个实列每次获取的实例都是第一次出啊关键的实例
     * 优点是节省资源和空间
     * 缺点：因为多个线程获取的是同一个对象当多线程访问通过一个对象的成员变量的时候
     * 可能就会出现线程安全的问题
     * 多实例  Spring容器每次都会为该类创建一个新的实例每次获取的都是不同的实例
     * 优点:因为每个线程获取的都是不同的对象访问的也不同的对象因此不会有现场等安全的问题
     * 缺点：会更加的消耗资源和内存
     * 因此在没有线程安全的问题的前提下推荐使用单实例
     * 如果多个线程访问一个实例可能会造成线程安全的问题推荐使用多实例
     * **/
    @Test
    public void testdanlie(){
     User u1=(User)as.getBean("user");
        User u2=(User)as.getBean("user");
    if(u1==u2){
        System.out.println("是单例设计模式");
    }else {
        System.out.println("是多例设计模式");
    }
    }
    public static void main(String[] args) {

    }
    /**
     * 测试Spring的DL（依赖注入
     *set方法注入
     *构造方法注入
     *
     * **/
    @Test
    public void testDl(){
        User u=(User)as.getBean("user");
        System.out.println(u);
    }
}
