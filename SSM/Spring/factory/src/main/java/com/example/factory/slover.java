package com.example.factory;
//工厂来解耦降低耦合性
//需要提供配置文件在配置文件中配置service层和dao层的实现类
//配置内容为Key唯一表示=Value()显现类的全限定类名
//EmpService=com.tedu.service.EmpServicelmpl

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/***
 * EmpDao=com.tedu.dao.EmpDaplmpl
 * 通过共层读取配置文件中配置的全限定类名利用反射类的实列
 * **/
public class slover {

    //申明一个Propertis对象子啊静态代码中对其进行初始化
  private  static  Properties prop=null;
    static{
        try {
            prop = new Properties();
            //获取只想config.properties文件的流对象
            ClassLoader nani = slover.class.getClassLoader();//获取这个类的字节码对象，或者当前类的类加载器Slover
            //通过类加载其到类目录下加载config文件
            InputStream in = nani.getResourceAsStream("config.properties");
            prop.load(in);//可以接收一个流是一个指向文件的流
            System.out.println(prop.getProperty("EmpService"));
           System.out.println( prop.getProperty("EmpDao"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("properties初始化失败");
        }
    }
    public static Object getBean(String interFacename){
        //获取当前接口有对应的实现类的全限定类名
        Object obj=null;
        try {
            String className = prop.getProperty(interFacename);
           obj= Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
