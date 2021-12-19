import org.junit.Test;

import java.io.IOError;
import java.io.NotActiveException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class fanshe {


    public static void main(String[] args) {
        //单元测试方法
        //语法要求@Test+void+无参的+public


    }

    @Test
    public void getclazz() throws ClassNotFoundException {
        Class<?> student = Class.forName("Student");  //参数是类的全路径包名。类名
        Class<?> student2 = Student.class;
        Student s = new Student();//匿名对象
        Class<?> student3 = s.getClass();
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
    }

    //获取构造方法
    @Test
    public void getConstuct() {
        //1.获取class对象
        Class<?> nani = Student.class;

        //.获取构造方法们 并且放到cs数组种
        Constructor<?>[] cs = nani.getConstructors();
        //使用forearch(12：3)
        for (Constructor c : cs) {
            System.out.println(c.getName());
            Class[] cc = c.getParameterTypes();//获取构造方法的参数类型们
            System.out.println(Arrays.toString(cc));
        }
    }

    @Test
    public void getFuction() throws ClassNotFoundException {

        //获取Class对象
        Class<?> clazz = Class.forName("Student");
        //获取成员方法
        Method[] ms = clazz.getMethods();
        //获取每个方法
        for (Method m : ms) {
            System.out.println(m.getName());
            Class<?>[] cc = m.getParameterTypes();
            System.out.println(Arrays.toString(cc));
        }
    }

    ;

    @Test
    public void getVar() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> ms = Class.forName("Student");
        Field f1 = ms.getField("name");
        System.out.println(f1);

        Field[] fs = ms.getFields();
        //获取每个成员变量
        //只能获取公共的成员变量
        for (Field f : fs) {
            //获取变量名
            System.out.println(f.getName());
            System.out.println(f.getType().getName());//获取变量 类型
        }
    }

    ;

    @Test
    public void getObject() throws Exception {
        Class<?> ms = Class.forName("Student");
        Object c = ms.newInstance();
        System.out.println(c);
        //指定你想要出发的具体的哪一个韩餐构造 --通过构造方法需要的参数类型
        Constructor<?> o = ms.getConstructor(String.class, int.class);
        Object obj = o.newInstance("jack", 20);
        System.out.println(obj);
        Student s = (Student) obj;
        System.out.println(s.age);
    }

    ;


    @Test
    public void getDeclar() throws Exception {
        //测试私有属性私有方法

        Class<?> ms = Class.forName("Student");
        Field c = ms.getDeclaredField("b");
        //获取属性的数据类型
        System.out.println(c.getType().getName());
        //设置私有属性的值
        //set（m,n）-m是你要给那个对象色织值 n是要设置的具体值
        Object obj = ms.newInstance();
        //暴力手段解决私有可见
        c.setAccessible(true);
        c.set(obj, "呱呱");
        System.out.println(c.get(obj));
    }

    @Test
    public void getDeclarFunc() throws Exception {
        Class<?> ms = Class.forName("Student");
        Method c = ms.getDeclaredMethod("save", int.class);
        //执行私有方法
        //invoke(m,o,p...)-m是要执行那个对象的方法-n,0,p是方法锁需要的参数
        //设置私有可见

        Object obj = ms.newInstance();
        c.setAccessible(true);
        c.invoke(obj, 10);
    }
};


class Student {
    public Student() {
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    public String name;
    public int age;
    private int c = 111;
    private String b = "aaa";

    public void eat(int m) {
        System.out.println("eat().." + m);
    }

    private void save(int m) {
        System.out.println("save().." + m);
    }

    private void update(int m) {
        System.out.println("update().." + m);
    }
    //提供构造

    //提供成员变量

    //提供成员方法
    //提供toString()
    @Override
    public String toString() {
        return "Student[name=" + name + ",age=" + age + "]";
    }
}
