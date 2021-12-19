import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class set {
    public static void main(String[] args) {
        // 这个类用来测试set接口的用法
        // 创建set对象
        // 因为set是个接口所以得用他的子类实现类hashset
        Set<String> set = new HashSet<String>();

        // 常用方法
        set.add("fox");
        set.add("fox1");
        set.add("fox2");
        set.add("fox3");
        set.add("fox4");
        set.add("fox3");
        System.out.println(set);
        // set集合中的元素都是无序的.set集合中是不能重复的set集合中允许存放null元素
        // set.clear
        System.out.println(set.contains("fox1"));
        System.out.println(set.equals("tony"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove("null"));
        Object[] obj = set.toArray();
        System.out.println(Arrays.toString(obj));
        // 集合之间的操作
        Set<String> set2 = new HashSet<String>();
        System.out.println(set.containsAll(set2));
        System.out.println(set.retainAll(set2));
        // 集合的迭代
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            it.next();
            System.out.println(it);
        }

    }
}