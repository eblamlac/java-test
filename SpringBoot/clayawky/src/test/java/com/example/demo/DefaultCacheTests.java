package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//注解描述一个类是一个单元测试类。并且此类也就交给spring管理
public class DefaultCacheTests {
    /*
    * @Autowired描述属性时 表示次属性的值要由Spring框架来进行注入
    * */
    @Autowired
    private  DefaultCache defaultCache;

@Test
    public  void testDefaultCahce(){
  System.out.println(defaultCache);
}
}
