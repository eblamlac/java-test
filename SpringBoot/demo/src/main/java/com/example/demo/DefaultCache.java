package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
* @Component注解由Spring定义主要用于描述要有
* spring框架管理的一些类型的对象
*
* */
@Component//<bean id="" class="com.clayakwy.he">
@Scope("prototype")

@Lazy(value = false)//注解用于描述类的延迟加载特性True表示延迟加载又叫做按需加载
public class DefaultCache implements  cache {//从帝豪的角度提供延迟记载的特性
public  DefaultCache(){
    System.out.println("cache");
}
@PostConstruct
    public void init(){
    System.out.println("init()");
}
@PreDestroy
    public void destroy(){
    System.out.println("destory");
}

}
