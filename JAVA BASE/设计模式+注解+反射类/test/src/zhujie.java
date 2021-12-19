import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class zhujie {

    //这个类用来测试自定义注解
    public static void main(String[] args) {

    }
}

class hello {

    String name;

    @Nani("aaa")//注解没有属性的时候 可以直接使用，有了属性就必须给属性肤质
    public void add() {

        System.out.println("add()");
    }
}

//自定义注解,注意语法和java不同
//定义注解需要用@interface来标志
//2,@Target需要指定注解可以存在的位置
@Target({ElementType.METHOD, ElementType.TYPE})
//@retention指定注解可以存在的声明周期
@Retention(RetentionPolicy.SOURCE)
//注解可以存在源文件中
@interface Nani {//定义了一个注解名字叫Nani
//定义注解的功能 --给注解添加属性
    int age() default  0;//这不是方法 二十注解种定义的age属性的方法
//为了使用注解时方便，如果age有默认值就好了
    String value();
    //特殊属性Value,给value属性赋值可以简写
}
