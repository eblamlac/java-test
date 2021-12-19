
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.AttributeSet.ColorAttribute;

public class test1 {
    public static void main(String[] args) {
        // 创建Colllection接口
        // <>是泛型用来越是集合中的元素类型只能写引用类型不能写基本类型
        Collection<Integer> a = new ArrayList();

        // 常用方法
        // 添加元素
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        System.out.println(a);
        System.out.println(a.contains(200));
        // 判断集合中是否存在数据
        System.out.println(a.equals(100));
        System.out.println(a.hashCode());
        System.out.println(a.isEmpty());
        System.out.println(a.remove(100));
        System.out.println(a.size());
        Object[] os = a.toArray();
        System.out.println(Arrays.toString(os));

        // 集合间的操作
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(9);
        c2.add(8);
        c2.addAll(a);
        System.out.println(c2);
        System.out.println(c2.containsAll(a));// 是否包含a
        System.out.println(a.removeAll(c2));// 删除c2
        System.out.println(a.retainAll(c2));// 删除c
        System.out.println(a);
        // Iterator迎来返回collection进行迭代的迭代器，遍历整个集合
        // hasNext()如果仍有元素可以继续迭代 则返回true
        // next()返回迭代的下一个元素
        // remove从迭代器指向的collection 中一处迭代器返回的最后一个元素（可选操作）
        Iterator<Integer> it = a.iterator();
        // 判断集合中是否还有下一个元素 while(it.hasNext()){
        // 循环着获取集合中的元素
        Integer aa = it.next();
        System.out.println(aa);
        // 获取迭代的元素
    }
}
