package com.example.demo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.annotation.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)//设置运行时有效
@Target({ElementType.TYPE})//设置注解可以描述的对象
@interface componet{};

@componet
class container{};

public class Test {
    static Map<String,Object> beanpool=new HashMap<>();
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取启动类的字节码对象

        Class<?> a = Test.class;
        //获取启动类所在的包
        System.out.println("packagename=" + a.getPackage().getName());
        //将那个包结构转换为目录结构
        String clsDir = a.getPackage().getName().replace(".", "/");
        //获取目录对应的类文件所在的目录
        URL url= ClassLoader.getSystemResource(clsDir);
        System.out.println("path="+url.getPath());
        //获取url对应的目录下的所有的类
        File file=new File(url.getPath());
//      File[] classFile= file.listFiles(new FilenameFilter(){
//          @Override
//          public boolean accept(File dir, String name) {
//              System.out.println(dir.isFile()+"/"+name);
//              return name.endsWith(".class");
//          }
//      }
        String[] className= file.list(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(dir.isFile()+"/"+name);
                return name.endsWith(".class");
            }
        }
      );
      for (String f:className){
        String classShortName=  f.substring(0,f.indexOf("."));
    //加载类并给予类的配置信息创建类的实列
          Class<?> clsObj=
          ClassLoader.getSystemClassLoader().loadClass(a.getPackage().getName()+"."+classShortName);
    System.out.println(clsObj.getName());
    //检测类上是否有Component.class的注解
    //clsObj.isAnnotation(Component.class);
     Annotation an= clsObj.getAnnotation(Component.class);
      if(an==null)continue;
   Object instance = clsObj.newInstance();//通过构造方法来构建兑现搞到实例
     beanpool.put(classShortName,instance);
      }
//输出beanPool中的对象
        System.out.println(beanpool);

    }
    }
