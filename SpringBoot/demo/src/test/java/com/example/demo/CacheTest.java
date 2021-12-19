package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CacheTest {

//
//    @Qualifier("defaultCache")//就必须按照这里指定的值来给变量注入这个值
//    @Autowired
//        private  cache cache;
//
//    public CacheTest(){
//
//    }
//    @Test
//    public void  testCache01(){
//System.out.println(cache);
//       }
    private  cache aa;
    private  cache bb;
    //通过构造方法位属性赋值（构造注入）
    public CacheTest(@Autowired @Qualifier("defaultCache") cache aa,
                     @Autowired @Qualifier("cacheimple" ) cache bb){
        this.aa=aa;
        this.bb=bb;
    }
    @Test
    public void test1(){
     System.out.println("cache02="+this.aa);
    }
    @Test
    public void test2(){
        System.out.println("cache01="+this.bb);
    }
    @Test
    public void test0102(){
        System.out.println("cache01"+this.aa+"cache02"+this.bb);
    }
}
