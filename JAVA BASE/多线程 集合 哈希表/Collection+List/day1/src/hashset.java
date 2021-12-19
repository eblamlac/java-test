import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        // 这个类用来测试HashSet
        Set set = new HashSet();

        // 常用方法
        set.add("100");
        set.add("200");
        int a = 10;
        set.add(a);
        set.add(a);
        set.add(a);
        System.out.println(set);
        // set.clear
        System.out.println(set.contains("100"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove("200"));
        // 迭代set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
