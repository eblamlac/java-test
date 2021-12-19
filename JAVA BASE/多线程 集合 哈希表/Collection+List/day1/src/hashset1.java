import java.util.HashSet;
import java.util.Set;

public class hashset1 {

    public static void main(String[] args) {
        // 这个类用来测试set给自定义对象去重
        // 创建set集合对象
        //总结：
        //如果你想用Set集合给自定义对象去重，要求在你在自己类中同时提供重新的hasCode()和equals方法

        //我们不适用默认的自动计算出来的哈希值，二十要更具对象的书香之计算，如果对象的属性值都相同那么请产生相同的哈希值
        //重写的equals（）我们要比较的不是对象的地址值，二十比较，两个对象间如果属性值都一样就返回true
        
        Set<nani> set = new HashSet<nani>();
        nani s1 = new nani("jack", 11, "BJ");
        nani s2 = new nani("jack1", 14, "SH");
        nani s3 = new nani("jack2", 16, "SZ");

        nani s4 = new nani("jack", 11, "BJ");
        nani s5 = new nani("jack1", 14, "SH");

        // 保证对象拥有相同的哈希值.默认使用的时候Boject提供的hasCode()计算的哈希值
        // 如果你想要根据自己的属性值计算
        // 如果你想要根据两个对象的属性计算哈希值，那就要重写hasCode()

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set.toString());
        // 目前set集合更笨没有给自定义对象去重因为s4/s5 3属性完全一样
        // 但是set还是存了
        // 需求set集合添加数据时去判断一下如果两个对象的所有属性值都一样
        // 就直接去重就行
        // 保证对象拥有相同的哈希值

    }

}

class nani {
    // 重写哈希算法如果你想要更具两个对象的属性值计算哈希值如果属性值完全都一样计算就保证这个产生的哈希值也一样就行了
   //2.是要保证两个对象之间的equals方法返回值相等
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((add == null) ? 0 : add.hashCode());
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        nani other = (nani) obj;
        if (add == null) {
            if (other.add != null)
                return false;
        } else if (!add.equals(other.add))
            return false;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public nani() {
    }

    @Override
    public String toString() {
        return "Student[name]" + name + "age=" + age + "add=" + add;

    }

    public nani(String name, int age, String add) {
        super();
        this.name = name;
        this.age = age;
        this.add = add;
    }

    private String name;
    private int age;
    private String add;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return add;
    }

    public void setAddr(String addr) {
        this.add = addr;
    }

}
